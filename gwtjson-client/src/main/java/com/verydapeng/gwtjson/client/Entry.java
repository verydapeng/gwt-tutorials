/*
 * copyright (C) verydapeng.com
 * all right reserved
 */
package com.verydapeng.gwtjson.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.Window;

/**
 *
 * @author Dapeng
 */
public class Entry implements EntryPoint {

    @Override
    public void onModuleLoad() {

        RequestBuilder rb = new RequestBuilder(RequestBuilder.GET, "/gwtjson-server/serverTime");

        rb.setCallback(new RequestCallback() {

            @Override
            public void onResponseReceived(Request request, Response response) {
                processJson(response.getText());
            }

            @Override
            public void onError(Request request, Throwable exception) {
                GWT.reportUncaughtException(exception);
            }
        });
        rb.setRequestData("");

        try {
            rb.send();
        } catch (RequestException ex) {
            GWT.reportUncaughtException(ex);
        }
    }

    private void processJson(String jsonText) {
        JSONValue json = JSONParser.parseStrict(jsonText);
        Window.alert("Server time is: " + json.isObject().get("time").isString().stringValue());
    }
}
