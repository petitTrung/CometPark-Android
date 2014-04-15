package com.icetraveller.android.apps.cometpark.utils;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class App {
	public static final String API_KEY = "AIzaSyD2r7coXpNsyYVsXFQ-llsO3_K-E4wwRwg";
	public static final String SENDER_ID = "876843474676";
	
	public static final String SPOT_KIND = "Spot";
	public static final String SPOT_ID = "Spot_id";
	public static final String SPOT_AVAILABILITY = "availability";
	
	public static final String TOKEN_ID = "token_id";
	public static final int PERMIT_TYPE_EXTENDED = 0;
	public static final int PERMIT_TYPE_GREEN = 1;
	public static final int PERMIT_TYPE_GOLD = 2;
	public static final int PERMIT_TYPE_EVE_ORANGE = 3;
	public static final int PERMIT_TYPE_PURPLE = 4;
	public static final int PERMIT_TYPE_ORANGE = 5;
	
	public static final int STATUS_AVAILABLE = 0;
	public static final int STATUS_OCCUPIED = 1;
	
	public static final int TYPE_SPOTS_STATUS_UPDATE = 1;
	public static final int TYPE_LOTS_STATUS_UPDATE = 2;
	public static final int TYPE_CREATE_SPOTS = 3;
	public static final int TYPE_CREATE_LOTS = 4;
	public static final int TYPE_DELETE_SPOTS = 5;
	public static final int TYPE_DELETE_LOTS = 6;
	public static final int TYPE_REQUEST_SPOTS_IN_LOT = 7; 
	public static final int TYPE_REQUEST_LOTS_INFO = 8; //for app to create
	public static final int TYPE_REQUEST_SPOTS_INFO = 9; // for app to create
	public static final int TYPE_REQUEST_LOTS_STATUS = 10; // exp 30/60
	public static final int _TYPE = 99;
	
	public static final String JSON_TYPE = "type";
	public static final String JSON_CONTROLLER_ID = "controllerId";
	public static final String JSON_KEY_SPOTS = "spots";
	public static final String JSON_KEY_LOTS = "lots";
	
	public static final String JSON_KEY_ID = "id";
	public static final String JSON_KEY_LOT = "lot";
	public static final String JSON_PERMIT_TYPE = "permit_type";
	public static final String JSON_KEY_NAME = "name";
	public static final String JSON_KEY_FILENAME = "filename";
	public static final String JSON_KEY_URL = "url";
	public static final String JSON_KEY_STATUS = "status";
	public static final String JSON_KEY_LOCATION = "location";
	public static final String JSON_KEY_LAT = "lat";
	public static final String JSON_KEY_LNG = "lng";
	
	public static final String JSON_KEY_TOP_LEFT = "topLeft";
	public static final String JSON_KEY_TOP_RIGHT = "topRight";
	public static final String JSON_KEY_BOTTOM_LEFT = "bottomLeft";
	public static final String JSON_KEY_BOTTOM_RIGHT = "bottomRight";
	
	public static final String SERVER_URL = "http://2-dot-cometparking.appspot.com";
	
	 /**
     * Intent used to display a message in the screen.
     */
    public static final String DISPLAY_MESSAGE_ACTION =
            "com.icetraveller.android.apps.cometpark.gcm.DISPLAY_MESSAGE";

    /**
     * Intent's extra that contains the message to be displayed.
     */
    public static final String EXTRA_MESSAGE = "message";
	
	public static void displayMessage(Context context, String message) {
    	Log.d("Config", "received");
        Intent intent = new Intent(DISPLAY_MESSAGE_ACTION);
        intent.putExtra(EXTRA_MESSAGE, message);
        context.sendBroadcast(intent);
    }

}
