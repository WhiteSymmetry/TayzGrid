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
package com.alachisoft.tayzgrid.caching.queries.filters;

public class FalseValue implements IGenerator, java.lang.Comparable {

    public String toString() {
        return "FALSE";
    }

    @Override
    public final int compareTo(Object obj) {
        if (obj instanceof FalseValue) {
            return 0;
        }
        return -1;
    }

    @Override
    public final Object Evaluate() {
        return false;
    }

    @Override
    public final Object Evaluate(String paramName, java.util.Map values) {
        return false;
    }
}
