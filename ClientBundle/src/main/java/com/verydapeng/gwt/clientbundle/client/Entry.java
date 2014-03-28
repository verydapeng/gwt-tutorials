package com.verydapeng.gwt.clientbundle.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootPanel;

public class Entry implements EntryPoint {

    AppBundle bundle = GWT.create(AppBundle.class);

    @Override
    public void onModuleLoad() {
        // this line is important, otherwise the content of the css
        // will NOT be available to the page 
        bundle.style().ensureInjected();

        addApple();
        addOrange();
    }

    private void addApple() {
        FlowPanel panel = new FlowPanel();
        panel.setStyleName(bundle.style().appleBackground());
        panel.add(new Image(bundle.appleImage()));
        panel.add(new HTML(bundle.appleDescription().getText()));
        RootPanel.get().add(panel);
    }

    private void addOrange() {
        FlowPanel panel = new FlowPanel();
        panel.setStyleName(bundle.style().orangeBackground());
        panel.add(new Image(bundle.orangeImage()));
        panel.add(new HTML(bundle.orangeDescription().getText()));
        RootPanel.get().add(panel);
    }
}
