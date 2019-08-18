package com.henu.party.bean;


public class PartyNews {

	private Integer id;
	private String type;
	private String title;
	private String secTitle;
	private String author;
	private String from;
	private String content;
	private String newsPic;
	private Integer clicked;
	private String createDate;
	private String createPeo;
	private String extralFile;
	private String remark;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSecTitle() {
		return secTitle;
	}

	public void setSecTitle(String secTitle) {
		this.secTitle = secTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getNewsPic() {
		return newsPic;
	}

	public void setNewsPic(String newsPic) {
		this.newsPic = newsPic;
	}

	public Integer getClicked() {
		return clicked;
	}

	public void setClicked(int clicked) {
		this.clicked = clicked;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public void setClicked(Integer clicked) {
		this.clicked = clicked;
	}

	public String getCreatePeo() {
		return createPeo;
	}

	public void setCreatePeo(String createPeo) {
		this.createPeo = createPeo;
	}

	public String getExtralFile() {
		return extralFile;
	}

	public void setExtralFile(String extralFile) {
		this.extralFile = extralFile;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "PartyNews [id=" + id + ", type=" + type + ", title=" + title + ", secTitle=" + secTitle + ", author="
				+ author + ", from=" + from + ", content=" + content + ", newsPic=" + newsPic + ", clicked=" + clicked
				+ ", createDate=" + createDate + ", createPeo=" + createPeo + ", extralFile=" + extralFile + ", remark="
				+ remark + "]";
	}

	public PartyNews(Integer id, String type, String title, String secTitle, String author, String from, String content,
			String newsPic, Integer clicked, String createDate, String createPeo, String extralFile, String remark) {
		super();
		this.id = id;
		this.type = type;
		this.title = title;
		this.secTitle = secTitle;
		this.author = author;
		this.from = from;
		this.content = content;
		this.newsPic = newsPic;
		this.clicked = clicked;
		this.createDate = createDate;
		this.createPeo = createPeo;
		this.extralFile = extralFile;
		this.remark = remark;
	}

	public PartyNews() {
		super();
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
