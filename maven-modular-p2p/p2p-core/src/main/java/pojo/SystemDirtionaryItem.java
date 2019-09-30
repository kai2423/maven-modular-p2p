package pojo;

/**
 * systemdirtionaryitem表的映射实体类
 * @author Administrator
 *
 */
public class SystemDirtionaryItem {

	/** 	主键	*/
	private Long id;
	/** 	数据字典明细对应的分类id	*/
	private Long parentId;
	/** 	数据字典明细显示名称	*/
	private String title;
	/** 	数据字典明细在该分类中的排序	*/
	private Integer sequence;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}
	@Override
	public String toString() {
		return "SystemDirtionaryItem [id=" + id + ", parentId=" + parentId + ", title=" + title + ", sequence="
				+ sequence + "]";
	}
	
}
