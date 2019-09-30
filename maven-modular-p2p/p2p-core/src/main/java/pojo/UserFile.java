package pojo;

import java.util.Date;

/**
 * userfile表的映射实体类
 * @author Administrator
 *
 */
public class UserFile {

	/** 	主键	*/
	private Long id;
	/** 	账户状态	*/
	private Integer state;
	/** 		*/
	private String remark;
	/** 	审计时间	*/
	private Date auditTime;
	/** 	申请时间	*/
	private Date applyTime;
	/** 	审计员id	*/
	private Long auditor_id;
	/** 		*/
	private Long applier_id;
	/** 	评分	*/
	private Integer score;
	/** 		*/
	private String file;
	/** 		*/
	private Long filetype_id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getAuditTime() {
		return auditTime;
	}
	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public Long getAuditor_id() {
		return auditor_id;
	}
	public void setAuditor_id(Long auditor_id) {
		this.auditor_id = auditor_id;
	}
	public Long getApplier_id() {
		return applier_id;
	}
	public void setApplier_id(Long applier_id) {
		this.applier_id = applier_id;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public Long getFiletype_id() {
		return filetype_id;
	}
	public void setFiletype_id(Long filetype_id) {
		this.filetype_id = filetype_id;
	}
	@Override
	public String toString() {
		return "UserFile [id=" + id + ", state=" + state + ", remark=" + remark + ", auditTime=" + auditTime
				+ ", applyTime=" + applyTime + ", auditor_id=" + auditor_id + ", applier_id=" + applier_id + ", score="
				+ score + ", file=" + file + ", filetype_id=" + filetype_id + "]";
	}
}
