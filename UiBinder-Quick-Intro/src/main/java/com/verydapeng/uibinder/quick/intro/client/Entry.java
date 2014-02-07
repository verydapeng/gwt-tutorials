package com.verydapeng.uibinder.quick.intro.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class Entry implements EntryPoint {

    interface UI extends UiBinder<FlowPanel, Entry> {}

    @UiField Button myButton;
    
    @Override
    public void onModuleLoad() {
        UI uiBinder = GWT.create(UI.class);
        uiBinder.createAndBindUi(this);
        
        RootPanel.get().add(myButton);
    }
    
    @UiHandler("myButton")
    void onButtonClick(ClickEvent e) {
        myButton.setText("hello event");
    }
}
