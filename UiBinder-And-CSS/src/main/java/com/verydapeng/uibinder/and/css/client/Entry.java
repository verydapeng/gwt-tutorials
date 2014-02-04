package com.verydapeng.uibinder.and.css.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 *
 * @author dapeng
 */
public class Entry implements EntryPoint {

    @Override
    public void onModuleLoad() {
        RootPanel.get().add(new LayoutWidget());
    }
}
