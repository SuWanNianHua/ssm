package com.henu.party.bean;

public class ThemaicEdu {
	//专题表
	private Integer id;
	private String title;
	private String createDate;
	private String content;
	private String sepcialPic;
	private String remark;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSepcialPic() {
		return sepcialPic;
	}
	public void setSepcialPic(String sepcialPic) {
		this.sepcialPic = sepcialPic;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public ThemaicEdu(Integer id, String title, String createDate, String content, String sepcialPic, String remark) {
		super();
		this.id = id;
		this.title = title;
		this.createDate = createDate;
		this.content = content;
		this.sepcialPic = sepcialPic;
		this.remark = remark;
	}
	public ThemaicEdu() {
		super();
	}
	@Override
	public String toString() {
		return "ThemaicEdu [id=" + id + ", title=" + title + ", createDate=" + createDate + ", content=" + content
				+ ", sepcialPic=" + sepcialPic + ", remark=" + remark + "]";
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
}
