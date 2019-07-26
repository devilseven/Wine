package entity;

public class User {
    /**
     * ID
     */
    private Integer id;

    /**
     * 昵称
     */
    private String nick_name;

    /**
     * 登陆密码
     */
    private String pwd;

    /**
     * 真实姓名
     */
    private String real_name;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 地址
     */
    private String address;

    /**
     * ID
     * @return id ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * ID
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 昵称
     * @return nick_name 昵称
     */
    public String getNick_name() {
        return nick_name;
    }

    /**
     * 昵称
     * @param nick_name 昵称
     */
    public void setNick_name(String nick_name) {
        this.nick_name = nick_name == null ? null : nick_name.trim();
    }

    /**
     * 登陆密码
     * @return pwd 登陆密码
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 登陆密码
     * @param pwd 登陆密码
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * 真实姓名
     * @return real_name 真实姓名
     */
    public String getReal_name() {
        return real_name;
    }

    /**
     * 真实姓名
     * @param real_name 真实姓名
     */
    public void setReal_name(String real_name) {
        this.real_name = real_name == null ? null : real_name.trim();
    }

    /**
     * 手机号
     * @return mobile 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 手机号
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 地址
     * @return address 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 地址
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}