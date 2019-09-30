package vo;


public class Data {
	
	private String isLogin;
	private String msg;
	public String getIsLogin() {
		return isLogin;
	}
	public void setIsLogin(String isLogin) {
		this.isLogin = isLogin;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Data [isLogin=" + isLogin + ", msg=" + msg + "]";
	} 
}
