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

package com.alachisoft.tayzgrid.caching;
public class SocketServerStats {
	private float _requests;
	private float _bytesSent;
	private float _bytesRecieved;

	public SocketServerStats(float requests, float bytesSent, float bytesRecieved) {
		this._requests = requests;
		this._bytesSent = bytesSent;
		this._bytesRecieved = bytesRecieved;
	}

	public final float getRequests() {
		return this._requests;
	}

	public final float getBytesSent() {
		return this._bytesSent;
	}

	public final float getBytesRecieved() {
		return this._bytesRecieved;
	}
}
