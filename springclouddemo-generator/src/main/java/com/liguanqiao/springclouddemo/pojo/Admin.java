package com.liguanqiao.springclouddemo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lgq
 * @since 2019-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Admin对象", description="")
public class Admin extends Model<Admin> {

    private static final long serialVersionUID=1L;

    @TableId(value = "admin_id", type = IdType.AUTO)
    private Integer adminId;

    @ApiModelProperty(value = "登录账号")
    @TableField("admin_account")
    private String adminAccount;

    @ApiModelProperty(value = "登录密码")
    @TableField("admin_password")
    private String adminPassword;

    @ApiModelProperty(value = "账号名称")
    @TableField("admin_name")
    private String adminName;

    @ApiModelProperty(value = "最后登录的IP")
    @TableField("admin_last_login_ip")
    private String adminLastLoginIp;

    @ApiModelProperty(value = "账号头像")
    @TableField("admin_portrait")
    private String adminPortrait;


    @Override
    protected Serializable pkVal() {
        return this.adminId;
    }

}
