package pojo;

/**
 * systemdictionary表的映射实体类
 * @author Administrator
 *
 */
public class SystemDictionary {
	
	/** 	主键	*/
	private Long id;
	/** 	数据字典分类编码	*/
	private String sn;
	/** 	数据字典分类名称	*/
	private String title;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "SystemDictionary [id=" + id + ", sn=" + sn + ", title=" + title + "]";
	}

}
