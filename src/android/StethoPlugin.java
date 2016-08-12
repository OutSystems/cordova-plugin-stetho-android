package com.outsystems.mobile.stetho;

import com.facebook.stetho.InspectorModulesProvider;
import com.facebook.stetho.Stetho;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.facebook.stetho.rhino.JsRuntimeReplFactoryBuilder;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by vitoroliveira on 23/06/16.
 */
public class StethoPlugin extends CordovaPlugin {

    @Override
	public void initialize(final CordovaInterface cordova, CordovaWebView webView)
	{
        super.initialize(cordova, webView);

        // Initialize Stetho
        Stetho.initializeWithDefaults(cordova.getActivity().getApplication());

        //Enable Network Inspection
      /*  new OkHttpClient.Builder()
                .addNetworkInterceptor(new StethoInterceptor())
                .build(); */
	}

    @Override
    protected void pluginInitialize() {
        super.pluginInitialize();
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        return true;
    }
}