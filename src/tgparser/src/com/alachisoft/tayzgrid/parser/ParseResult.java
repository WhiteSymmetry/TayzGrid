/* This software is provided 'as-is', without any expressed or implied warranty. In no event will the author(s) be held liable for any damages arising from the use of this software.
*Permission is granted to anyone to use this software for any purpose. If you use this software in a product, an acknowledgment in the product documentation would be deeply appreciated but is not required.

*In the case of the GOLD Parser Engine source code, permission is granted to anyone to alter it and redistribute it freely, subject to the following restrictions:

*	1. The origin of this software must not be misrepresented; you must not claim that you wrote the original software.
*	2.	Altered source versions must be plainly marked as such, and must not be misrepresented as being the original software.
*	3.	This notice may not be removed or altered from any source distribution
*/

package com.alachisoft.tayzgrid.parser;

/** Used internally to represent the result of the Parser.ParseToken method.
*/
public enum ParseResult {
	/**
	*/
	Accept(301),

	/**
	*/
	Shift(302),

	/**
	*/
	ReduceNormal(303),

	/**
	*/
	ReduceEliminated(304),

	/**
	*/
	SyntaxError(305),

	/**
	*/
	InternalError(406);

	private int intValue;
	private static java.util.HashMap<Integer, ParseResult> mappings;
	private static java.util.HashMap<Integer, ParseResult> getMappings() {
		if (mappings == null) {
			synchronized (ParseResult.class) {
				if (mappings == null) {
					mappings = new java.util.HashMap<Integer, ParseResult>();
				}
			}
		}
		return mappings;
	}

	private ParseResult(int value) {
		intValue = value;
		ParseResult.getMappings().put(value, this);
	}

	public int getValue() {
		return intValue;
	}

	public static ParseResult forValue(int value) {
		return getMappings().get(value);
	}
}