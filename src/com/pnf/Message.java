package com.pnf;

import com.pnfsoftware.jeb.core.units.NotificationType;
import com.pnfsoftware.jeb.core.units.UnitNotification;

public class Message extends UnitNotification{
	public static final int CORRUPT = 0;
	public static final int AREA_OF_INTEREST = 1;
	public static final int UNSUPPORTED = 2;
	public static final int WARNING = 3;
	
	private String message;
	private String address;
	private int type;

	public Message(String message, String address, int type){
		super(null, null);
		
		this.message = message;
		this.address = address;
		this.type = type;
	}

	public String getMessage(){
		return message;
	}

	@Override
	public String getAddress() {
		return address;
	}

	@Override
	public String getDescription() {
		return message;
	}

	@Override
	public NotificationType getType() {
		switch(type){
		case CORRUPT:
			return NotificationType.CORRUPTION;
		case AREA_OF_INTEREST:
			return NotificationType.AREA_OF_INTEREST;
		case UNSUPPORTED:
			return NotificationType.UNSUPPORTED_FEATURE;
		case WARNING:
			return NotificationType.WARNING;
		}
		
		return null; // should never reach here
	}
}
