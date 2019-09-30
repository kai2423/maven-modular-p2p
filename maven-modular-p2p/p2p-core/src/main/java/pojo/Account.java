package pojo;

/**
 * account表的映射实体类
 * @author Administrator
 *
 */
public class Account {

	/**	表中主键	*/
	private Long id;
	/**	交易密码	*/
	private String tradePassword;
	/**	账户可用余额	*/
	private Double usableAmount;
	/**	账户冻结金额	*/
	private Double freezedamount;
	/**	账户授信额度	*/
	private Double borrowLimitAmount;
	/**	对象版本信息（用作乐观锁）	*/
	private Integer version;
	/**	账户待收利息	*/
	private Double unReceiveInterest;
	/**	账户待收本金	*/
	private Double unReceivePrincipal;
	/**		*/
	private Double unReturnAmount;
	/**	账户剩余授信额度	*/
	private Double remainBorrowLimit;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTradePassword() {
		return tradePassword;
	}
	public void setTradePassword(String tradePassword) {
		this.tradePassword = tradePassword;
	}
	public Double getUsableAmount() {
		return usableAmount;
	}
	public void setUsableAmount(Double usableAmount) {
		this.usableAmount = usableAmount;
	}
	public Double getFreezedamount() {
		return freezedamount;
	}
	public void setFreezedamount(Double freezedamount) {
		this.freezedamount = freezedamount;
	}
	public Double getBorrowLimitAmount() {
		return borrowLimitAmount;
	}
	public void setBorrowLimitAmount(Double borrowLimitAmount) {
		this.borrowLimitAmount = borrowLimitAmount;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public Double getUnReceiveInterest() {
		return unReceiveInterest;
	}
	public void setUnReceiveInterest(Double unReceiveInterest) {
		this.unReceiveInterest = unReceiveInterest;
	}
	public Double getUnReceivePrincipal() {
		return unReceivePrincipal;
	}
	public void setUnReceivePrincipal(Double unReceivePrincipal) {
		this.unReceivePrincipal = unReceivePrincipal;
	}
	public Double getUnReturnAmount() {
		return unReturnAmount;
	}
	public void setUnReturnAmount(Double unReturnAmount) {
		this.unReturnAmount = unReturnAmount;
	}
	public Double getRemainBorrowLimit() {
		return remainBorrowLimit;
	}
	public void setRemainBorrowLimit(Double remainBorrowLimit) {
		this.remainBorrowLimit = remainBorrowLimit;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", tradePassword=" + tradePassword + ", usableAmount=" + usableAmount
				+ ", freezedamount=" + freezedamount + ", borrowLimitAmount=" + borrowLimitAmount + ", version="
				+ version + ", unReceiveInterest=" + unReceiveInterest + ", unReceivePrincipal=" + unReceivePrincipal
				+ ", unReturnAmount=" + unReturnAmount + ", remainBorrowLimit=" + remainBorrowLimit + "]";
	}
	
	
}
