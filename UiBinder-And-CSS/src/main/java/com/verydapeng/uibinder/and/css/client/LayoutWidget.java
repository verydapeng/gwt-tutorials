package com.verydapeng.uibinder.and.css.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 *
 * @author dapeng
 */
public class LayoutWidget extends Composite {

    interface UI extends UiBinder<Widget, LayoutWidget> {
    }

    public LayoutWidget() {
        initWidget(GWT.<UI>create(UI.class).createAndBindUi(this));
    }
}
