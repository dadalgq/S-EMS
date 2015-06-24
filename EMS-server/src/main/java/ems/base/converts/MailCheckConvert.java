package ems.base.converts;

import ems.base.enums.MailCheck;
import message.jdbc.convert.Convert;

/**
 * .
 *
 * @author sunhao(sunhao.java@gmail.com)
 * @version V1.0
 * @createTime 2015-1-14 21:32
 */
public class MailCheckConvert implements Convert<MailCheck> {
    @Override
    public String getDbValue(MailCheck mailCheck) {
        return mailCheck.getValue();
    }

    @Override
    public String getDbNullValue(MailCheck mailCheck) {
        return MailCheck.CHECK_NO.getValue();
    }

    @Override
    public MailCheck getPoJoValue(String value) {
        return getDeleteFlagValue(value);
    }

    @Override
    public MailCheck getPoJoNullValue(String value) {
        return MailCheck.CHECK_NO;
    }

    private MailCheck getDeleteFlagValue(String value){
        MailCheck[] mailChecks = MailCheck.values();

        for(MailCheck mailCheck : mailChecks){
            if(value.equals(mailCheck.getValue())) {
                return mailCheck;
            }
        }

        return null;
    }
}
