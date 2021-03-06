/*
 * GWT-Ext Widget Library
 * Copyright 2007 - 2008, GWT-Ext LLC., and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
 
package com.gwtext.client.core;

import com.gwtext.client.animation.Easing;
import com.gwtext.client.util.JavaScriptObjectHelper;

/**
 * {@link com.gwtext.client.core.Fx} configuration options.
 *
 * @author Sanjiv Jivan
 */
public class FxConfig extends GenericConfig {

    /**
     * Construct a new instance.
     */
    public FxConfig() {
    }

    /**
     * Construct a new instance.
     *
     * @param duration the length of time (in seconds) that the effect should last
     */
    public FxConfig(int duration) {
        JavaScriptObjectHelper.setAttribute(jsObj, "duration", duration);
    }

    /**
     * A css class to apply after the effect.
     *
     * @param afterCls the CSS class
     */
    public void setAfterCls(String afterCls) {
        JavaScriptObjectHelper.setAttribute(jsObj, "afterCls", afterCls);
    }

    /**
     * A style specification string, e.g. "width:100px"  that will be applied to the Element after the effect finishes.
     *
     * @param afterStyle css style
     */
    public void setAfterStyle(String afterStyle) {
        JavaScriptObjectHelper.setAttribute(jsObj, "afterStyle", afterStyle);
    }

    /**
     * A style specification that will be applied to the Element after the effect finishes.
     *
     * @param afterStyle css styles
     */
    public void setAfterStyle(GenericConfig afterStyle) {
        JavaScriptObjectHelper.setAttribute(jsObj, "afterStyle", afterStyle.getJsObj());
    }

    /**
     * A style specification function which returns such a specification that will be applied to the
     * Element after the effect finishes.
     *
     * @param fn the style specification function
     */
    public native void setAfterStyle(Function fn) /*-{
        var config = this.@com.gwtext.client.core.JsObject::getJsObj()();
        config['afterStyle'] = function() {
                            fn.@com.gwtext.client.core.Function::execute()();
                        };
    }-*/;

    /**
     * Whether to allow subsequently-queued effects to run at the same time as the current effect, or to ensure that they run in sequence.
     *
     * @param concurrent true for concurrent
     */
    public void setConcurrent(boolean concurrent) {
        JavaScriptObjectHelper.setAttribute(jsObj, "concurrent", concurrent);
    }

    /**
     * A function called when the effect is finished.
     *
     * @param callback the callback function
     */
    public native void setCallback(Function callback) /*-{
        var config = this.@com.gwtext.client.core.JsObject::getJsObj()();
        config['callback'] = function() {
                            callback.@com.gwtext.client.core.Function::execute()();
                        };
    }-*/;

    /**
     * The end opacity after the effect completed.
     *
     * @param endOpacity the end opacity (0 - 1)
     */
    public void setEndOpacity(float endOpacity) {
        JavaScriptObjectHelper.setAttribute(jsObj, "endOpacity", endOpacity);
    }

    /**
     * The length of time (in seconds) that the effect should last.
     *
     * @param duration the duration in seconds
     */
    public void setDuration(float duration) {
        JavaScriptObjectHelper.setAttribute(jsObj, "duration", duration);
    }

    /**
     * An Easing value for the effect.
     *
     * @param easing easing method
     */
    public void setEasing(Easing easing) {
        JavaScriptObjectHelper.setAttribute(jsObj, "easing", easing.getMethod());
    }

    /**
     * Whether the Element should be removed from the DOM and destroyed after the effect finishes.
     *
     * @param remove true to remove
     */
    public void setRemove(boolean remove) {
        JavaScriptObjectHelper.setAttribute(jsObj, "remove", remove);
    }

    /**
     * Whether subsequent effects should be stopped and removed after the current effect finishes.
     *
     * @param stopFx true to stop subsequent effects
     */
    public void setStopFx(boolean stopFx) {
        JavaScriptObjectHelper.setAttribute(jsObj, "stopFx", stopFx);
    }

    /**
     * Whether to use the display CSS property instead of visibility when hiding Elements
     * (only applies to effects that end with the element being visually hidden, ignored otherwise)
     *
     * @param useDisplay true to use display
     */
    public void setUseDisplay(boolean useDisplay) {
        JavaScriptObjectHelper.setAttribute(jsObj, "useDisplay", useDisplay);
    }
}
