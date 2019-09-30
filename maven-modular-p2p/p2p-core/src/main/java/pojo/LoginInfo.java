package pojo;

/**
 * logininfo表的映射实体类
 * @author Administrator
 *
 */
public class LoginInfo {

	/** 	主键	*/
	private Long id;
	/** 	用户名	*/
	private String username;
	/** 	密码	*/
	private String password;
	/** 	账号状态	*/
	private int state;
	/** 	用户类型	*/
	private int usertype;
	
	
	/**
 	    *    常量STATE_*表示账号的存在状态
	 * STATE_FREEZE表示冻结状态
	 * STATE_INACTIVT表示为激活状态
	 * STATE_NORMAL表示正常使用状态
	 */
	private final int STATE_FREEZE = -1;
	private final int STATE_INACTIVT = 0;
	private final int STATE_NORMAL = 1;
	
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getUsertype() {
		return usertype;
	}
	public void setUsertype(int usertype) {
		this.usertype = usertype;
	}
	public int getSTATE_FREEZE() {
		return STATE_FREEZE;
	}
	public int getSTATE_INACTIVT() {
		return STATE_INACTIVT;
	}
	public int getSTATE_NORMAL() {
		return STATE_NORMAL;
	}
	public int getLOGINTYPE_ADMIN() {
		return LOGINTYPE_ADMIN;
	}
	public int getLOGINTYPE_NOMAL() {
		return LOGINTYPE_NOMAL;
	}
	@Override
	public String toString() {
		return "LoginInfo [id=" + id + ", username=" + username + ", password=" + password + ", state=" + state
				+ ", usertype=" + usertype +  "]";
	}
	
	
	
}