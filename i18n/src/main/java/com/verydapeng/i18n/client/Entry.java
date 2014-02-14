package com.verydapeng.i18n.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

public class Entry implements EntryPoint {

    @Override
    public void onModuleLoad() {
        Strings strings = GWT.<Strings>create(Strings.class);

        GWT.log(strings.username());
        GWT.log(strings.password());

        RootPanel.get().add(new LoginPanel());
    }
}
