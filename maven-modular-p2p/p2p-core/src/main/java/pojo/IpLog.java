package pojo;

import java.util.Date;

/**
 * IpLog表的映射实体类
 * @author Administrator
 *
 */
public class IpLog {

	/**	表中主键	*/
	private Long id;
	/**	登入的ip地址	*/
	private String ip;
	/**	登入状态	*/
	private int loginState;
	/**	登入用户名	*/
	private String username;
	/**	登入用户的id（对应logininfo表中的id）	*/
	private Long loginInfoId;
	/**	登入用户类型	*/
	private int loginType;
	/**	登入日期	*/
	private Date datetime;
	
	/**
	 * 登入状态
	 */
	private final int LOGINSTATE_SECCESS = 1;
	private final int LOGINSTATE_FAILED = 0;
	
	/**
	 * 用户性质
	 */
	private final int LOGINTYPE_ADMIN = 1;
	private final int LOGINTYPE_NOMAL = 0;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int isLoginState() {
		return loginState;
	}
	public void setLoginState(int loginState) {
		this.loginState = loginState;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getLoginInfoId() {
		return loginInfoId;
	}
	public void setLoginInfoId(Long loginInfoId) {
		this.loginInfoId = loginInfoId;
	}
	public int isLoginType() {
		return loginType;
	}
	public void setLoginType(int loginType) {
		this.loginType = loginType;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public int getLOGINSTATE_SECCESS() {
		return LOGINSTATE_SECCESS;
	}
	public int getLOGINSTATE_FAILED() {
		return LOGINSTATE_FAILED;
	}
	public int getLOGINTYPE_ADMIN() {
		return LOGINTYPE_ADMIN;
	}
	public int getLOGINTYPE_NOMAL() {
		return LOGINTYPE_NOMAL;
	}
	@Override
	public String toString() {
		return "IpLog [id=" + id + ", ip=" + ip + ", loginState=" + loginState + ", username=" + username
				+ ", loginInfoId=" + loginInfoId + ", loginType=" + loginType + ", datetime=" + datetime
				+ "]";
	}
	
	
}
