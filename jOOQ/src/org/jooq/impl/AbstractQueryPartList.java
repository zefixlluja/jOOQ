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

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

import org.jooq.QueryPart;
import org.jooq.QueryPartList;

/**
 * @author Lukas Eder
 */
abstract class AbstractQueryPartList<T extends QueryPart> extends AbstractList<T> implements QueryPartList<T> {

	private static final long serialVersionUID = -2936922742534009564L;
	private final List<T> wrappedList;

	public AbstractQueryPartList() {
		this(new ArrayList<T>());
	}
	
	public AbstractQueryPartList(List<T> wrappedList) {
		this.wrappedList = wrappedList;
	}
	
	@Override
	public final T get(int index) {
		return wrappedList.get(index);
	}

	@Override
	public final int size() {
		return wrappedList.size();
	}

	@Override
	public void add(int index, T element) {
		wrappedList.add(index, element);
	}

	@Override
	public final String toHQL() {
		return toHQL(false);
	}

	@Override
	public final String toSQL() {
		return toSQL(false);
	}

	@Override
	public final String toSQL(boolean inlineParameters) {
		if (isEmpty()) {
			return toSQLEmptyList();
		}
		
		StringBuilder sb = new StringBuilder();
		
		String separator = "";
		for (T queryPart : this) {
			sb.append(separator);
			sb.append(toSQL(queryPart, inlineParameters));
			
			separator = getListSeparator() + " ";
		}
		
		return sb.toString();
	}

	protected String toSQL(T queryPart, boolean inlineParameters) {
		return queryPart.toSQL(inlineParameters);
	}

	protected String toSQLEmptyList() {
		throw new IllegalStateException("This list does not support generating SQL from empty lists : " + getClass());
	}

	protected String getListSeparator() {
		return ",";
	}
	
	@Override
	public String toHQL(boolean inlineParameters) {
		throw new UnsupportedOperationException("Not yet implemented");
	}
}