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

package com.alachisoft.tayzgrid.config.newdom;

import com.alachisoft.tayzgrid.serialization.core.io.InternalCompactSerializable;
import com.alachisoft.tayzgrid.serialization.standard.io.CompactReader;
import com.alachisoft.tayzgrid.serialization.standard.io.CompactWriter;
import java.io.IOException;
import com.alachisoft.tayzgrid.common.enums.ClientNodeStatus;

public class ClientNodeStatusWrapper implements InternalCompactSerializable
{

    public ClientNodeStatus value;

    @Override
    public void Deserialize(CompactReader reader) throws IOException, ClassNotFoundException
    {
        value = ClientNodeStatus.values()[reader.ReadInt32()];
    }

    @Override
    public void Serialize(CompactWriter writer) throws IOException
    {
        writer.Write(value.ordinal());
    }
}
