package ems.base.enums;

import message.base.convert.ConvertGetter;

/**
 * 删除的标识枚举.
 *
 * @author sunhao(sunhao.java@gmail.com)
 * @version V1.0
 * @createTime 2014-12-16 20:08
 */
public enum DeleteFlag implements ConvertGetter {
    DELETE_YES("1", "已删除"), DELETE_NO("0", "未删除");

    DeleteFlag(String value, String desc) {
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
