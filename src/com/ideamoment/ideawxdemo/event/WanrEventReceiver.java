/**
 * 
 */
package com.ideamoment.ideawxdemo.event;

import com.ideamoment.wx.event.EventReceiver;
import com.ideamoment.wx.event.bean.WxMessage;
import com.ideamoment.wx.event.bean.WxNullMessage;
import com.ideamoment.wx.event.bean.WxSubscribeEvent;
import com.ideamoment.wx.event.bean.WxUnsubscribeEvent;


/**
 * @author Chinakite
 *
 */
public class WanrEventReceiver implements EventReceiver {

    /* (non-Javadoc)
     * @see com.ideamoment.wx.event.EventReceiver#subscribeEvent(com.ideamoment.wx.event.bean.WxSubscribeEvent)
     */
    @Override
    public WxMessage subscribeEvent(WxSubscribeEvent event) {
        System.out.println("Receive subscribe event.");
        System.out.println("Subscribe openid [" + event.getFromUserName() + "]");
        
        return new WxNullMessage();
    }

    /* (non-Javadoc)
     * @see com.ideamoment.wx.event.EventReceiver#unsubscribeEvent(com.ideamoment.wx.event.bean.WxUnsubscribeEvent)
     */
    @Override
    public WxMessage unsubscribeEvent(WxUnsubscribeEvent event) {
        System.out.println("Receive Unsubscribe event.");
        System.out.println("Unsubscribe openid [" + event.getFromUserName() + "]");
        
        return new WxNullMessage();
    }

}
