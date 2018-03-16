package com.manage.insurance.util;

import java.util.ArrayList;
import java.util.List;

import com.manage.insurance.common.Common;
import com.manage.insurance.constant.ConConst;
import com.manage.insurance.constant.MessageCodeConstant;
import com.manage.insurance.properties.AccountListProperties;

public class Validate {
    /**
     * Method add message Error in Login
     * 
     * @param userName is passed
     * @param passWord is passed
     * @return list Message Error
     */
    public static List<String> messageErrorLogin(String userName, String passWord) {
        ArrayList<String> messageError = new ArrayList<String>();
        if (Common.isEmpty(userName) || Common.isEmpty(passWord)) {
            if (Common.isEmpty(userName)) {
                messageError.add(MessageCodeConstant.ERROR_ENTER_USERNAME);
            }
            if (Common.isEmpty(passWord)) {
                messageError.add(MessageCodeConstant.ERROR_ENTER_PASSWORD);
            }
        } else {
            if (!isLogin(userName, passWord)) {
                messageError.add(MessageCodeConstant.ERROR_LOGIN_NAME_OR_PASSWORD_IS_INCORRECT);
            }
        }
        return messageError;
    }

    /**
     * Method check userName and passWord have entered correctly
     * 
     * @param userName is Username to check
     * @param passWord is passWord to check
     * @return true if isLogin, false if not isLogin
     */
    public static boolean isLogin(String userName, String passWord) {
        String passByNameInFile = AccountListProperties.getPassByName(userName);
        if (passByNameInFile == null) {
            return false;
        } else {
            String passWordConventCryptMD5 = Common.cryptMD5(passWord);
            if (passWordConventCryptMD5.equals(passByNameInFile)) {
                return true;
            }
        }
        return false;
    }

}
