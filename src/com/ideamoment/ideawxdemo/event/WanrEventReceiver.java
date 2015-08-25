/**
 * 
 */
package com.ideamoment.ideawxdemo.event;

import java.util.Date;

import com.ideamoment.wx.config.IdeaWxConfig;
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
import com.ideamoment.wx.sender.model.WxSendTextMessage;


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
        
        WxSendTextMessage returnMsg = new WxSendTextMessage();
        returnMsg.setToUserName(event.getFromUserName());
        returnMsg.setFromUserName(IdeaWxConfig.get("ideawx.originalid", null));
        returnMsg.setCreateTime((new Date()).getTime());
        returnMsg.setContent("嗨，这里是招聘宝官方微信。招聘宝是集移动传播、HR互动、海量简历于一身的一站式招聘管理平台。在这里，我们会定期推送有用的资讯、趣味活动、HR工作技巧等，助力HR更快更准找人才！感谢您的关注！");
        
        return returnMsg;
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
    public WxSendMessage textMessage(WxTextMessage message) {
        if(message.getContent().startsWith("日企")) {
            WxSendTextMessage returnMsg = new WxSendTextMessage();
            returnMsg.setToUserName(message.getFromUserName());
            returnMsg.setFromUserName(IdeaWxConfig.get("ideawx.originalid", null));
            returnMsg.setCreateTime((new Date()).getTime());
            returnMsg.setContent("恭喜！您已成功参与招聘宝举办的“太君，八路托我给您带个话儿……”有奖回复活动！中奖结果择日公布，敬请期待！");
            
            return returnMsg;
        }else{
            WxSendTextMessage returnMsg = new WxSendTextMessage();
            returnMsg.setToUserName(message.getFromUserName());
            returnMsg.setFromUserName(IdeaWxConfig.get("ideawx.originalid", null));
            returnMsg.setCreateTime((new Date()).getTime());
            returnMsg.setContent("嗨，这里是招聘宝官方微信。招聘宝是集移动传播、HR互动、海量简历于一身的一站式招聘管理平台。在这里，我们会定期推送有用的资讯、趣味活动、HR工作技巧等，助力HR更快更准找人才！感谢您的关注！");
            
            return returnMsg;
        }
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
