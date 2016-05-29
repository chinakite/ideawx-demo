/**
 * 
 */
package com.ideamoment.ideawxdemo.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.ideamoment.wx.user.model.WxUser;
import com.ideamoment.wx.webauth.servlet.WxOAuthEventListener;


/**
 * @author Chinakite
 *
 */
public class OauthEventListener implements WxOAuthEventListener{

    @Override
    public void afterGetUserInfo(ServletRequest req,
                                 ServletResponse resp,
                                 WxUser user) {
        
        
    }

    @Override
    public void afterGotOpenId(ServletRequest req,
                               ServletResponse resp,
                               String openId,
                               String accessToken) {

        
    }

}
