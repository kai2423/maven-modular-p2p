package pojo;


/**
 * userinfo表的映射实体类
 * @author Administrator
 *
 */
public class UserInfo {

	/**		主键	*/
	private Long id;
	/**		版本号，用作乐观锁	*/
	private Integer version;
	/**		用户状态值	*/
	private Long bitState;
	/**		用户实名值（冗余数据）	*/
	private String realName;
	/**		用户身份证号（冗余数据）	*/
	private String idNumber;
	/**		用户电话	*/
	private String phoneNumber;
	/**		收入输入等级id	*/
	private Long incomeGrade_id;
	/**		婚姻情况id	*/
	private Long marriage_id;
	/**		子女情况id	*/
	private Long kidCount_id;
	/**		学历id	*/
	private Long educationBackground_id;
	/**			*/
	private Integer authScore;
	/**		住房条件id	*/
	private Long houseCondition_id;
	/**			*/
	private Long realauthid;
	/**		邮箱地址	*/
	private String email;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public Long getBitState() {
		return bitState;
	}
	public void setBitState(Long bitState) {
		this.bitState = bitState;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Long getIncomeGrade_id() {
		return incomeGrade_id;
	}
	public void setIncomeGrade_id(Long incomeGrade_id) {
		this.incomeGrade_id = incomeGrade_id;
	}
	public Long getMarriage_id() {
		return marriage_id;
	}
	public void setMarriage_id(Long marriage_id) {
		this.marriage_id = marriage_id;
	}
	public Long getKidCount_id() {
		return kidCount_id;
	}
	public void setKidCount_id(Long kidCount_id) {
		this.kidCount_id = kidCount_id;
	}
	public Long getEducationBackground_id() {
		return educationBackground_id;
	}
	public void setEducationBackground_id(Long educationBackground_id) {
		this.educationBackground_id = educationBackground_id;
	}
	public Integer getAuthScore() {
		return authScore;
	}
	public void setAuthScore(Integer authScore) {
		this.authScore = authScore;
	}
	public Long getHouseCondition_id() {
		return houseCondition_id;
	}
	public void setHouseCondition_id(Long houseCondition_id) {
		this.houseCondition_id = houseCondition_id;
	}
	public Long getRealauthid() {
		return realauthid;
	}
	public void setRealauthid(Long realauthid) {
		this.realauthid = realauthid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", version=" + version + ", bitState=" + bitState + ", realName=" + realName
				+ ", idNumber=" + idNumber + ", phoneNumber=" + phoneNumber + ", incomeGrade_id=" + incomeGrade_id
				+ ", marriage_id=" + marriage_id + ", kidCount_id=" + kidCount_id + ", educationBackground_id="
				+ educationBackground_id + ", authScore=" + authScore + ", houseCondition_id=" + houseCondition_id
				+ ", realauthid=" + realauthid + ", email=" + email + "]";
	}
	
}
