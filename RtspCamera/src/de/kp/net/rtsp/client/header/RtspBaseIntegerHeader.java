package de.kp.net.rtsp.client.header;
/**
 *	Copyright 2010 Voice Technology Ind. e Com. Ltda.
 *
 *	RTSPClientLib is free software: you can redistribute it and/or 
 *	modify it under the terms of the GNU Lesser General Public License 
 *	as published by the Free Software Foundation, either version 3 of 
 *	the License, or (at your option) any later version.
 *
 *	RTSPClientLib is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU Lesser General Public License for more details. 
 *
 *	You should have received a copy of the GNU Lesser General Public License
 *	along with this software. If not, see <http://www.gnu.org/licenses/>.
 * 
 *
 *	This class has been adapted to the needs of the RtspCamera project
 *	@author Stefan Krusche (krusche@dr-kruscheundpartner.de)
 *
 */

public class RtspBaseIntegerHeader extends RtspHeader {
	
	private int value;
	
	public RtspBaseIntegerHeader(String name) {
		super(name);

		String text = getRawValue();
		if(text != null) value = Integer.parseInt(text);
	
	}
	
	public RtspBaseIntegerHeader(String name, int value) {
		super(name);
		setValue(value);
	}

	public RtspBaseIntegerHeader(String name, String header) throws Exception {
		super(header);
		
		checkName(name);
		value = Integer.parseInt(getRawValue());
	
	}

	public final void setValue(int newValue) {
		value = newValue;
		setRawValue(String.valueOf(value));
	}
	
	public final int getValue() {
		return value;
	}
}
