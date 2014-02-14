
package com.verydapeng.i18n.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 *
 * @author dapeng
 */
public class LoginPanel extends Composite {
    
    interface UI extends UiBinder<Widget, LoginPanel> {
    }
    
    public LoginPanel() {
        initWidget(GWT.<UI>create(UI.class).createAndBindUi(this));
    }
}
