package ems.base.enums;

import message.base.convert.ConvertGetter;

/**
 * .
 *
 * @author sunhao(sunhao.java@gmail.com)
 * @version V1.0
 * @createTime 2015-1-14 20:44
 */
public enum MailCheck implements ConvertGetter {
    CHECK_YES("1", "已验证"), CHECK_NO("0", "未验证");

    MailCheck(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    private String value;
    private String desc;

    public String getDesc() {
        return desc;
    }

    @Override
    public String getValue() {
        return this.value;
    }
}
