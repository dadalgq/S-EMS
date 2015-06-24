package ems.user.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import ems.DB;
import ems.base.enums.DeleteFlag;
import ems.base.enums.MailCheck;
import message.validate.annotations.Email;
import message.validate.annotations.Limit;
import message.validate.annotations.NotNull;
import message.validate.annotations.ValidateEntity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 用户主信息.
 *
 * @author sunhao(sunhao.java@gmail.com)
 * @version V1.0, 2014-10-27 18:42
 */
@ValidateEntity
@Table(name = DB.USER_TABLE_NAME)
public class User {
    /**
     * 主键，唯一标识
     */
    @Id
    @GeneratedValue(generator = DB.USER_SEQ_NAME)
    private Long pkId;
    /**
     * 账户Id
     */
    @Column
    private Long accountId;
    /**
     * 真实姓名
     */
    @NotNull
    @Limit(min = 1, max = 10)
    @Column
    private String nickName;
    /**
     * 用户创建时间
     */
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createDate;
    /**
     * 用户注册邮箱
     */
    @NotNull
    @Email
    @Column
    private String email;
    /**
     * 软删除，0未删除，1已删除
     */
    @Column
    private DeleteFlag deleteFlag;
    /**
     * 是否已经邮箱验证过？ 1已验证，0未验证
     */
    @Column
    private MailCheck isMailCheck;

    public User() {
    }

    public User(User user) {
        this.pkId = user.getPkId();
        this.accountId = user.getAccountId();
        this.nickName = user.getNickName();
        this.createDate = user.getCreateDate();
        this.email = user.getEmail();
        this.deleteFlag = user.getDeleteFlag();
        this.isMailCheck = user.getIsMailCheck();
    }

    public Long getPkId() {
        return pkId;
    }

    public void setPkId(Long pkId) {
        this.pkId = pkId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DeleteFlag getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(DeleteFlag deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public MailCheck getIsMailCheck() {
        return isMailCheck;
    }

    public void setIsMailCheck(MailCheck isMailCheck) {
        this.isMailCheck = isMailCheck;
    }
}
