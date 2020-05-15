package com.fitness.backend.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigInteger;

@ApiModel
public class EmployeesBasisEntity extends CommonEntity implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
	 *  员工id
	 */
	@ApiModelProperty(value = "员工id", name = "e_id")
    private BigInteger e_id;
    /**
	 *  员工姓名
	 */
	@ApiModelProperty(value = "员工姓名", name = "e_name")
    private String e_name;
    /**
	 *  年龄
	 */
	@ApiModelProperty(value = "年龄", name = "e_age")
    private Integer e_age;
    /**
	 *  员工角色 1、销售 2教练 3前台 4。。。
	 */
	@ApiModelProperty(value = "员工角色 1、销售 2教练 3前台 4。。。", name = "e_role")
    private Integer e_role;
    /**
	 *  员工电话号
	 */
	@ApiModelProperty(value = "员工电话号", name = "e_mobile")
    private String e_mobile;
    /**
	 *  员工身份证
	 */
	@ApiModelProperty(value = "员工身份证", name = "e_code")
    private String e_code;
    /**
	 *  身份证图片附件
	 */
	@ApiModelProperty(value = "身份证图片附件", name = "e_image")
    private String e_image;
    /**
	 *  员工微信号
	 */
	@ApiModelProperty(value = "员工微信号", name = "e_wechat")
    private String e_wechat;
    /**
	 *  员工工号
	 */
	@ApiModelProperty(value = "员工工号", name = "e_number")
    private String e_number;
    /**
	 *  入职时间
	 */
	@ApiModelProperty(value = "入职时间", name = "e_induction_time")
    private BigInteger e_induction_time;
    /**
	 *  入职状态 1正式员工 2试用员工 3离职 4...
	 */
	@ApiModelProperty(value = "入职状态 1正式员工 2试用员工 3离职 4...", name = "e_induction_status")
    private Integer e_induction_status;
    /**
	 *  离职时间
	 */
	@ApiModelProperty(value = "离职时间", name = "e_out_time")
    private BigInteger e_out_time;
    /**
	 *  创建时间
	 */
	@ApiModelProperty(value = "创建时间", name = "create_time")
    private BigInteger create_time;
    /**
	 *  创建人
	 */
	@ApiModelProperty(value = "创建人", name = "create_u")
    private String create_u;
    /**
	 *  修改时间
	 */
	@ApiModelProperty(value = "修改时间", name = "modify_time")
    private BigInteger modify_time;
    /**
	 *  修改人
	 */
	@ApiModelProperty(value = "修改人", name = "modify_u")
    private String modify_u;

    /**
	 *  get 员工id
	 */
    public BigInteger getE_id() {
		return e_id;
	}

    /**
	 *  set 员工id
	 */
	public void setE_id(BigInteger e_id) {
		this.e_id = e_id;
	}
    /**
	 *  get 员工姓名
	 */
    public String getE_name() {
		return e_name;
	}

    /**
	 *  set 员工姓名
	 */
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
    /**
	 *  get 年龄
	 */
    public Integer getE_age() {
		return e_age;
	}

    /**
	 *  set 年龄
	 */
	public void setE_age(Integer e_age) {
		this.e_age = e_age;
	}
    /**
	 *  get 员工角色 1、销售 2教练 3前台 4。。。
	 */
    public Integer getE_role() {
		return e_role;
	}

    /**
	 *  set 员工角色 1、销售 2教练 3前台 4。。。
	 */
	public void setE_role(Integer e_role) {
		this.e_role = e_role;
	}
    /**
	 *  get 员工电话号
	 */
    public String getE_mobile() {
		return e_mobile;
	}

    /**
	 *  set 员工电话号
	 */
	public void setE_mobile(String e_mobile) {
		this.e_mobile = e_mobile;
	}
    /**
	 *  get 员工身份证
	 */
    public String getE_code() {
		return e_code;
	}

    /**
	 *  set 员工身份证
	 */
	public void setE_code(String e_code) {
		this.e_code = e_code;
	}
    /**
	 *  get 身份证图片附件
	 */
    public String getE_image() {
		return e_image;
	}

    /**
	 *  set 身份证图片附件
	 */
	public void setE_image(String e_image) {
		this.e_image = e_image;
	}
    /**
	 *  get 员工微信号
	 */
    public String getE_wechat() {
		return e_wechat;
	}

    /**
	 *  set 员工微信号
	 */
	public void setE_wechat(String e_wechat) {
		this.e_wechat = e_wechat;
	}
    /**
	 *  get 员工工号
	 */
    public String getE_number() {
		return e_number;
	}

    /**
	 *  set 员工工号
	 */
	public void setE_number(String e_number) {
		this.e_number = e_number;
	}
    /**
	 *  get 入职时间
	 */
    public BigInteger getE_induction_time() {
		return e_induction_time;
	}

    /**
	 *  set 入职时间
	 */
	public void setE_induction_time(BigInteger e_induction_time) {
		this.e_induction_time = e_induction_time;
	}
    /**
	 *  get 入职状态 1正式员工 2试用员工 3离职 4...
	 */
    public Integer getE_induction_status() {
		return e_induction_status;
	}

    /**
	 *  set 入职状态 1正式员工 2试用员工 3离职 4...
	 */
	public void setE_induction_status(Integer e_induction_status) {
		this.e_induction_status = e_induction_status;
	}
    /**
	 *  get 离职时间
	 */
    public BigInteger getE_out_time() {
		return e_out_time;
	}

    /**
	 *  set 离职时间
	 */
	public void setE_out_time(BigInteger e_out_time) {
		this.e_out_time = e_out_time;
	}
    /**
	 *  get 创建时间
	 */
    public BigInteger getCreate_time() {
		return create_time;
	}

    /**
	 *  set 创建时间
	 */
	public void setCreate_time(BigInteger create_time) {
		this.create_time = create_time;
	}
    /**
	 *  get 创建人
	 */
    public String getCreate_u() {
		return create_u;
	}

    /**
	 *  set 创建人
	 */
	public void setCreate_u(String create_u) {
		this.create_u = create_u;
	}
    /**
	 *  get 修改时间
	 */
    public BigInteger getModify_time() {
		return modify_time;
	}

    /**
	 *  set 修改时间
	 */
	public void setModify_time(BigInteger modify_time) {
		this.modify_time = modify_time;
	}
    /**
	 *  get 修改人
	 */
    public String getModify_u() {
		return modify_u;
	}

    /**
	 *  set 修改人
	 */
	public void setModify_u(String modify_u) {
		this.modify_u = modify_u;
	}

}
