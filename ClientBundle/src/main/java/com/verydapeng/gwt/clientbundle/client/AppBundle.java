package com.verydapeng.gwt.clientbundle.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.TextResource;

/**
 *
 * @author dapeng
 */
public interface AppBundle extends ClientBundle {

    interface Style extends CssResource {

        String appleBackground();

        String orangeBackground();
    }

    @Source({"App.gwtcss", "App.css"})
    Style style();

    @Source("orange.html")
    TextResource orangeDescription();

    @Source("apple.html")
    TextResource appleDescription();

    @Source("apple.jpg")
    ImageResource appleImage();

    @Source("orange.jpg")
    ImageResource orangeImage();
}
