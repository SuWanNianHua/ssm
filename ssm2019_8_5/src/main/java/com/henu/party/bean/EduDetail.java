package com.henu.party.bean;

public class EduDetail {
	//专题明细表
	private int id;
	private String mainTitle;
	private String title;
	private String secTitle;
	private String author;
	private String from;
	private String content;
	private String newsPic;
	private String clickedNum;
	private String createDate;
	private String createPerson;
	private String extraFile;
	private String remark;
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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



	public String getClickedNum() {
		return clickedNum;
	}



	public void setClickedNum(String clickedNum) {
		this.clickedNum = clickedNum;
	}



	public String getCreateDate() {
		return createDate;
	}



	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}



	public String getCreatePerson() {
		return createPerson;
	}



	public void setCreatePerson(String createPerson) {
		this.createPerson = createPerson;
	}



	public String getExtraFile() {
		return extraFile;
	}



	public void setExtraFile(String extraFile) {
		this.extraFile = extraFile;
	}



	public String getRemark() {
		return remark;
	}



	public void setRemark(String remark) {
		this.remark = remark;
	}



	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}



	public String getMainTitle() {
		return mainTitle;
	}



	public void setMainTitle(String mainTitle) {
		this.mainTitle = mainTitle;
	}



	@Override
	public String toString() {
		return "EduDetail [id=" + id + ", mainTitle=" + mainTitle + ", title=" + title + ", secTitle=" + secTitle
				+ ", author=" + author + ", from=" + from + ", content=" + content + ", newsPic=" + newsPic
				+ ", clickedNum=" + clickedNum + ", createDate=" + createDate + ", createPerson=" + createPerson
				+ ", extraFile=" + extraFile + ", remark=" + remark + "]";
	}

}
