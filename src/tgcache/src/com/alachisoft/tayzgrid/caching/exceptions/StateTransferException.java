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

package com.alachisoft.tayzgrid.caching.exceptions;

import com.alachisoft.tayzgrid.runtime.exceptions.CacheException;

public class StateTransferException extends CacheException implements java.io.Serializable {

    /**
     * default constructor.
     */
    public StateTransferException() {
    }

    /**
     * overloaded constructor, takes the reason as parameter.
     */
    public StateTransferException(String reason) {
        super(reason);
    }

    /**
     * overloaded constructor.
     *
     * @param reason reason for exception
     * @param inner nested exception
     */
    public StateTransferException(String reason, Exception inner) {
        super(reason, inner);
    }
}
