package ems.user.service;

import message.jdbc.core.GenericJdbcDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 用户管理.
 *
 * @author sunhao(sunhao.java@gmail.com)
 * @version V1.0, 15/6/20 上午5:02
 */
@Service
public class UserService {
    @Autowired
    @Qualifier("emsGenericJdbcDAO")
    private GenericJdbcDAO genericJdbcDao;
}
