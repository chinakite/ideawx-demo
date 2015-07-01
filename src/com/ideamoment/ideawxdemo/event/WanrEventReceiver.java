/**
 * 
 */
package com.ideamoment.ideawxdemo.event;

import com.ideamoment.wx.receiver.EventReceiver;
import com.ideamoment.wx.receiver.model.WxImageMessage;
import com.ideamoment.wx.receiver.model.WxLinkMessage;
import com.ideamoment.wx.receiver.model.WxLocationEvent;
import com.ideamoment.wx.receiver.model.WxLocationMessage;
import com.ideamoment.wx.receiver.model.WxMenuEvent;
import com.ideamoment.wx.receiver.model.WxScanEvent;
import com.ideamoment.wx.receiver.model.WxShortVideoMessage;
import com.ideamoment.wx.receiver.model.WxSubscribeEvent;
import com.ideamoment.wx.receiver.model.WxTextMessage;
import com.ideamoment.wx.receiver.model.WxUnsubscribeEvent;
import com.ideamoment.wx.receiver.model.WxVideoMessage;
import com.ideamoment.wx.receiver.model.WxVoiceMessage;
import com.ideamoment.wx.sender.model.WxNullMessage;
import com.ideamoment.wx.sender.model.WxSendMessage;


/**
 * @author Chinakite
 *
 */
public class WanrEventReceiver implements EventReceiver {

    /* (non-Javadoc)
     * @see com.ideamoment.wx.event.EventReceiver#subscribeEvent(com.ideamoment.wx.event.bean.WxSubscribeEvent)
     */
    @Override
    public WxSendMessage subscribeEvent(WxSubscribeEvent event) {
        System.out.println("Receive subscribe event.");
        System.out.println("Subscribe openid [" + event.getFromUserName() + "]");
        
        return new WxNullMessage();
    }

    /* (non-Javadoc)
     * @see com.ideamoment.wx.event.EventReceiver#unsubscribeEvent(com.ideamoment.wx.event.bean.WxUnsubscribeEvent)
     */
    @Override
    public WxSendMessage unsubscribeEvent(WxUnsubscribeEvent event) {
        System.out.println("Receive Unsubscribe event.");
        System.out.println("Unsubscribe openid [" + event.getFromUserName() + "]");
        
        return new WxNullMessage();
    }

    @Override
    public WxSendMessage imageMessage(WxImageMessage arg0) {
        return new WxNullMessage();
    }

    @Override
    public WxSendMessage linkMessage(WxLinkMessage arg0) {
        return new WxNullMessage();
    }

    @Override
    public WxSendMessage locationEvent(WxLocationEvent arg0) {
        return new WxNullMessage();
    }

    @Override
    public WxSendMessage locationMessage(WxLocationMessage arg0) {
        return new WxNullMessage();
    }

    @Override
    public WxSendMessage menuEvent(WxMenuEvent arg0) {
        return new WxNullMessage();
    }

    @Override
    public WxSendMessage scanEvent(WxScanEvent arg0) {
        return new WxNullMessage();
    }

    @Override
    public WxSendMessage shortVideoMessage(WxShortVideoMessage arg0) {
        return new WxNullMessage();
    }

    @Override
    public WxSendMessage textMessage(WxTextMessage arg0) {
        return new WxNullMessage();
    }

    @Override
    public WxSendMessage videoMessage(WxVideoMessage arg0) {
        return new WxNullMessage();
    }

    @Override
    public WxSendMessage voiceMessage(WxVoiceMessage arg0) {
        return new WxNullMessage();
    }

}
