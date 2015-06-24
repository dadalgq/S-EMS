package ems.base.converts;

import ems.base.enums.DeleteFlag;
import message.jdbc.convert.Convert;

/**
 * 删除的标识枚举转换器.
 *
 * @author sunhao(sunhao.java@gmail.com)
 * @version V1.0
 * @createTime 2014-12-16 21:14
 */
public class DeleteFlagConvert implements Convert<DeleteFlag> {
    @Override
    public String getDbValue(DeleteFlag deleteFlag) {
        return deleteFlag.getValue();
    }

    @Override
    public String getDbNullValue(DeleteFlag deleteFlag) {
        return DeleteFlag.DELETE_NO.getValue();
    }

    @Override
    public DeleteFlag getPoJoValue(String o) {
        return getDeleteFlagValue(o);
    }

    @Override
    public DeleteFlag getPoJoNullValue(String o) {
        return DeleteFlag.DELETE_NO;
    }

    private DeleteFlag getDeleteFlagValue(String value) {
        DeleteFlag[] deleteFlags = DeleteFlag.values();

        for (DeleteFlag deleteFlag : deleteFlags) {
            if (value.equals(deleteFlag.getValue())) {
                return deleteFlag;
            }
        }

        return null;
    }
}
