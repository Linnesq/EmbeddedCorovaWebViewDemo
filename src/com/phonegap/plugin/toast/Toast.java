package com.phonegap.plugin.toast;

import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Context;
import android.util.Log;

public class Toast extends CordovaPlugin {

	@Override
	public boolean execute(String action, JSONArray args,
			CallbackContext callbackContext) throws JSONException {
		if (action.equals("longToast")) {
			String message = args.getString(0);
			showToastLong(message);
			return true;
		} else if (action.equals("shortToast")) {
			showToastShort(args.getString(0));
			return true;
		}
		return false;
	}

	private void showToastLong(String message) {
		Context c = this.cordova.getActivity();
		android.widget.Toast.makeText(c, message,
				android.widget.Toast.LENGTH_LONG).show();
	}

	private void showToastShort(String message) {
		android.widget.Toast.makeText(this.cordova.getActivity(), message,
				android.widget.Toast.LENGTH_SHORT).show();
	}

	private void logger(String message) {
		Log.d("PLUG", message);
	}

}
