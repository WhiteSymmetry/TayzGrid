/*
* Copyright (c) 2015, Alachisoft. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.alachisoft.tayzgrid.common.configuration;

public class DynamicConfigType {
	private java.lang.Class _type;
	private boolean _isArray;

	public DynamicConfigType() {
	}
	public DynamicConfigType(java.lang.Class type) {
		_type = type;
	}

	public DynamicConfigType(java.lang.Class type, boolean isArray) {
		this(type);
		_isArray = isArray;
	}

	public final java.lang.Class getType() {
		return _type;
	}
	public final void setType(java.lang.Class value) {
		_type = value;
	}

	public final boolean getIsArray() {
		return _isArray;
	}
	public final void setIsArray(boolean value) {
		_isArray = value;
	}
}
