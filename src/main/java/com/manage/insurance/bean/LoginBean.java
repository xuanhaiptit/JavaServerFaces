package com.manage.insurance.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.http.HttpSession;

import com.manage.insurance.constant.ConConst;
import com.manage.insurance.constant.ScreenConstant;
import com.manage.insurance.util.Validate;

@ManagedBean(name = ConConst.LOGIN, eager = true)
@SessionScoped
public class LoginBean {
    private String userName;
    private String passWord;
    private List<String> messageErro;

    /**
     * 
     * @return
     */
    public String actionLogin() {
        messageErro = Validate.messageErrorLogin(userName, passWord);
        if (messageErro.isEmpty()) {
            HttpSession session = SessionUtils.getSession();
            session.setAttribute("userName", userName);
            return ScreenConstant.SCREEN_MH02;
//            return "index";
        } else {
            return ScreenConstant.SCREEN_MH01;
        }
    }

    /**
     * 
     * @return
     */
    public String actionLogout() {
        HttpSession session = SessionUtils.getSession();
        session.invalidate();
        return ScreenConstant.SCREEN_MH01;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public List<String> getMessageErro() {
        return messageErro;
    }

    public void setMessageErro(List<String> messageErro) {
        this.messageErro = messageErro;
    }

}
