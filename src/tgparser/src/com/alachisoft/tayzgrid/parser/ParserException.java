/* This software is provided 'as-is', without any expressed or implied warranty. In no event will the author(s) be held liable for any damages arising from the use of this software.
*Permission is granted to anyone to use this software for any purpose. If you use this software in a product, an acknowledgment in the product documentation would be deeply appreciated but is not required.

*In the case of the GOLD Parser Engine source code, permission is granted to anyone to alter it and redistribute it freely, subject to the following restrictions:

*	1. The origin of this software must not be misrepresented; you must not claim that you wrote the original software.
*	2.	Altered source versions must be plainly marked as such, and must not be misrepresented as being the original software.
*	3.	This notice may not be removed or altered from any source distribution
*/

package com.alachisoft.tayzgrid.parser;

// C# Translation of GoldParser, by Marcus Klimstra <klimstra@home.nl>.

import java.io.Serializable;

// Based on GOLDParser by Devin Cook <http://www.devincook.com/goldparser>.
/** Thrown by the parser when an error occures.
 Specialized exceptions may be added at a later time.
*/
public class ParserException extends RuntimeException implements  Serializable {
	/** Creates a new ParserException with the specified error string.
	*/
	public ParserException(String p_error) {
		super(p_error);
	}

	/** Creates a new ParserException with the specified error string and inner-exception.
	*/
	public ParserException(String p_error, RuntimeException p_exception) {
		super(p_error, p_exception);
	}


}