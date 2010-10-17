/**
 * Copyright (c) 2009, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name of the "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.jooq.impl;

import static org.jooq.Comparator.EQUALS;
import static org.jooq.Comparator.NOT_EQUALS;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.jooq.Comparator;
import org.jooq.Field;
import org.jooq.SQLDialect;

/**
 * @author Lukas Eder
 */
class CompareCondition<T> extends AbstractCondition {

    private static final long serialVersionUID = -6456616674773879690L;

    private final Field<T>    field;
    private final T           value;
    private final Comparator  comparator;

    CompareCondition(SQLDialect dialect, Field<T> field, T value, Comparator comparator) {
        super(dialect);

        if (value == null && comparator != EQUALS && comparator != NOT_EQUALS) {
            throw new IllegalArgumentException("Cannot compare null with " + comparator);
        }

        this.field = field;
        this.value = value;
        this.comparator = comparator;
    }

    @Override
    public int bind(PreparedStatement stmt, int initialIndex) throws SQLException {
        if (value != null) {
            bind(stmt, initialIndex, field, value);
            return initialIndex + 1;
        }
        else {
            return initialIndex;
        }
    }

    @Override
    public String toSQLReference(boolean inlineParameters) {
        StringBuilder sb = new StringBuilder();

        sb.append(field.toSQLReference(inlineParameters));
        sb.append(" ");
        if (value != null) {
            sb.append(comparator.toSQL());
            sb.append(" ");
            sb.append(FieldTypeHelper.toSQL(value, inlineParameters, field));
        }
        else {
            switch (comparator) {
                case EQUALS:
                    sb.append("is null");
                    break;
                case NOT_EQUALS:
                    sb.append("is not null");
                    break;

                default:
                    throw new IllegalStateException("Cannot compare null with " + comparator);
            }
        }

        return sb.toString();
    }
}