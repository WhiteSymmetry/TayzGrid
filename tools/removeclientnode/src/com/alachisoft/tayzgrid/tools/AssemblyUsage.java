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

package com.alachisoft.tayzgrid.tools;

public class AssemblyUsage {

    private static String VERSION = "4.6.0.0";

    /**
     * Displays the logo banner
     *
     * @param printlogo specifies whether to display logo or not
     */
    public static void PrintLogo(boolean printlogo) {
        String logo = "Alachisoft (R) TayzGrid Utility - RemoveClientNode. Version " + VERSION + "\nCopyright (C) Alachisoft 2015. All rights reserved.\n";
        if (printlogo) {
            System.out.println(logo);
            System.out.println();
        }
    }

    /**
     * Displays assembly usage information.
     *
     * @param printlogo specifies whether to print logo or not.
     */
    public static void PrintUsage() {
        String usage = "Usage: removeclientnode  [option[...]]." + "\r\n" + "\r\n" + "" + "\r\n" + " "
                + "   Specifies id of Clustered Cache.Cache must exist on source server." + "\r\n" + "  " + "\r\n"
                + "  -e --client-node" + "\r\n" + "    Specifies the node name to remove from the cache's "
                + "current client nodes." + "\r\n" + "\r\n" + "Optional:" + "\r\n" + "\r\n" + "-s --server "
                + "\r\n" + "    Specifies a server name where the TayzGrid service is running and a cache " + "\r\n"
                + "    with the specified cache-id is registered. Cache configuration is copied " + "\r\n" + "    fro"
                + "m this server to the destination server. " + "\r\n" + "    The default is the local machine."
                + "\r\n" + "\r\n" + "  -p --port" + "\r\n" + "    Specifies a port number for communication with the "
                + "Cache server." + "\r\n" + "\r\n" + "  -G" + "\r\n" + "    Suppresses display of the logo banner." + "\r\n" + " " + "\r\n"
                + "  -h --help" + "\r\n" + "    Displays a detailed help screen " + "\r\n" + "";

        System.out.println(usage);
    }
}
