package pojo;

import java.util.Date;

/**
 * mailverify表的映射实体类
 * 	用于验证（如：手机验证，邮箱验证...）
 * @author Administrator
 *
 */
public class MailVerify {
	
	/** 	主键	*/
	private Long id;
	/** 	用户id	*/
	private Long userinfo_id;
	/** 	可用截止日期	*/
	private Date deadline;
	/** 	随机码	*/
	private String randomcode;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserinfo_id() {
		return userinfo_id;
	}
	public void setUserinfo_id(Long userinfo_id) {
		this.userinfo_id = userinfo_id;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public String getRandomcode() {
		return randomcode;
	}
	public void setRandomcode(String randomcode) {
		this.randomcode = randomcode;
	}
	@Override
	public String toString() {
		return "MailVerify [id=" + id + ", userinfo_id=" + userinfo_id + ", deadline=" + deadline + ", randomcode="
				+ randomcode + "]";
	}
	
	
}
