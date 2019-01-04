package com.jubao.modules.loans.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author wl_code@163.com
 * @version 1.0
 * @date 2019/1/2
 */
@Data
public class CustUser {

    private static final long serialVersionUID = 1L;

    /**
     * 删除标记（0：正常；1：已经删除）
     */
    public static final int DEL_NORMAL = 0;
    public static final int DEL_DELETE = 1;
    public static final String DEFAULT_USER = "system";

    /**
     * ID，实体唯一标识
     */
    protected String id;

    /**
     * 	创建者userId
     */
    protected String createBy;
    /**
     * 	创建日期
     */
    protected Date createTime;
    /**
     * 	最后修改者userId
     */
    protected String updateBy;
    /**
     *  更新日期
     */
    protected Date updateTime;

    private String del;

    /**
     * 是否是新记录（默认：false），调用setIsNewRecord()设置新记录，使用自定义ID。
     * 设置为true后强制执行插入语句，ID不会自动生成，需从手动传入。
     */
    protected boolean isNewRecord = false;
    private String name; // 用户昵称
    private String realName; // 真实姓名
    /**
     * 用户证件类型 0-身份证； 1-户口簿； 2-护照； 3-军官证； 4-士兵证； 5-港澳居民来往内地通行证； 6-台湾同胞来往内地通行证；
     * 7-临时身份证； 8-外国人居留证； 9-警官证； X-其他证件。
     */
    private String idType = "0"; // 用户证件类型
    private String idNo; // 用户证件号码
    private String bankCode; // 银行代码
    private String bankMobile;// 银行预留手机号
    private String cardNo; // 银行卡号
    private String bankCityId; // 开户行地址
    private String mobile; // 手机号码
    private String email; // 用户邮箱
    private Integer emailBind; // 是否绑定邮箱：0未绑定1已绑定
    private String avatar; // 用户头像
    private Integer sex; // 用户性别
    private String birthday; // 生日
    private String password; // 用户密码
    private String paypwd; // 支付密码
    private String qq; // qq
    private String alipayId; // 支付宝账号
    private String xuexinId; // 学信网账号
    private String weixinOpenid; // 微信互联openid
    private Integer loginNum; // 登录次数
    private Date registerTime; // 用户注册时间
    private Date loginTime; // 当前登录时间
    private Date lastLoginTime; // 上次登录时间
    private String loginIp; // 当前登录ip
    private String lastLoginIp; // 上次登录ip
    private String type; // 用户类型
    private String level; // 用户等级
    private Integer points; // 用户积分
    private String bindId; // 第三方支付绑定id
    private String accountId; // 电子账户
    private String kdAccountId; // 口袋电子账户
    private Integer hjsAccountId; // 汉金所电子账户
    private String termsAuthId; // 四合一授权id
    private Integer identityStatus; // 身份认证状态
    private Double availableBalance; // 可用余额
    private Double frozenBalance; // 冻结金额
    private Double creditLine; // 授信额度
    private Double availCreditLine; // 可用授信额度
    private Double usedCreditLine; // 已用授信额度
    private Integer status; // 用户状态：1-正常，0-锁定账户
    private Integer exppoints; // 用户经验值
    private Integer source; // 来源（1-ios,2-android）
    private String channel; // 渠道
    private Integer inviterId; // 邀请人ID
    private String remark; // 备注信息
    private String inviteCode; // 邀请码

    private String protocolNo; // 绑卡协议号

    private Integer blacklist = 0;  //是否黑名单 0否  1是

}
