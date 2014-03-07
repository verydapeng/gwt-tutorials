package com.verydapeng.images.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;

/**
 *
 * @author dapeng
 */
public class SampleWidget extends Composite {

    interface UI extends UiBinder<Widget, SampleWidget> {
    }

    public SampleWidget() {
        initWidget(GWT.<UI>create(UI.class).createAndBindUi(this));
    }
}
