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

package com.alachisoft.tayzgrid.socketserver.command.responsebuilders;

import com.alachisoft.tayzgrid.common.protobuf.BulkRemoveResponseProtocol;
import com.alachisoft.tayzgrid.common.protobuf.ResponseProtocol;
import com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol;
import com.alachisoft.tayzgrid.common.util.ResponseHelper;

import java.io.IOException;

//Dated: July 20, 2011
/**
 This class is responsible for providing the responses based on the command Version specified.
 Main role of this class is to provide the backward compatibility. As different version of command can
 be processed by the same server. In that case the response should be in the form understandable by the
 client who sent the command.

 This class only processes the different versions of BulkRemove command
*/
public class BulkRemoveResponseBuilder extends ResponseBuilderBase {
	public static java.util.List<byte[]> BuildResponse(java.util.HashMap removeResult, int commandVersion, String RequestId, java.util.List<byte[]> _serializedResponse, String serializationContext) throws IOException {
		long requestId = Long.parseLong(RequestId);
		switch (commandVersion) {
			case 0: { 
                                        ResponseProtocol.Response.Builder response=ResponseProtocol.Response.newBuilder();
                                        BulkRemoveResponseProtocol.BulkRemoveResponse.Builder bulkRemoveResponse=BulkRemoveResponseProtocol.BulkRemoveResponse.newBuilder();
					response.setRequestId(requestId);

					bulkRemoveResponse.setKeyValuePackage(com.alachisoft.tayzgrid.socketserver.util.KeyPackageBuilder.PackageKeysValues(removeResult, bulkRemoveResponse.getKeyValuePackage(), serializationContext));

					response.setResponseType(ResponseProtocol.Response.Type.REMOVE_BULK);
					response.setBulkRemove(bulkRemoveResponse);
					_serializedResponse.add(ResponseHelper.SerializeResponse(response.build()));
			}
				break;
			case 1: { 
					java.util.ArrayList<KeyValuePackageResponseProtocol.KeyValuePackageResponse> keyValuesPackageChuncks = com.alachisoft.tayzgrid.socketserver.util.KeyPackageBuilder.PackageKeysValues(removeResult, serializationContext);
					int sequenceId = 1;
                                        ResponseProtocol.Response.Builder response=ResponseProtocol.Response.newBuilder();
                                        BulkRemoveResponseProtocol.BulkRemoveResponse.Builder bulkRemoveResponse=BulkRemoveResponseProtocol.BulkRemoveResponse.newBuilder();
					response.setRequestId(requestId);
					response.setNumberOfChuncks(keyValuesPackageChuncks.size());
					response.setResponseType(ResponseProtocol.Response.Type.REMOVE_BULK);
					for (KeyValuePackageResponseProtocol.KeyValuePackageResponse package_Renamed : keyValuesPackageChuncks) {
						response.setSequenceId(sequenceId++);
						bulkRemoveResponse.setKeyValuePackage(package_Renamed);
						response.setBulkRemove(bulkRemoveResponse);
						_serializedResponse.add(ResponseHelper.SerializeResponse(response.build()));
					}
			}
				break;

		}
		return _serializedResponse;
	}

}
