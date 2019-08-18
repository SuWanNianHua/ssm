package com.henu.party.bean;

import java.io.Serializable;

public class ItemBank implements Serializable {
//题号、题型、题干、选项A、选项B、选项C、选项D、答案
//id、itemType、itemContent、optionA、optionB、optionC、optionD、answer
	private Integer id;//题号
	private String itemType;//题型
	private String itemContent;//题干
	private String optionA;//选项A
	private String optionB;//选项B
	private String optionC;//选项C
	private String optionD;//选项D
	private String answer;//答案
	public int getId() {
		return id;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemContent() {
		return itemContent;
	}
	public void setItemContent(String itemContent) {
		this.itemContent = itemContent;
	}
	public String getOptionA() {
		return optionA;
	}
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	public String getOptionB() {
		return optionB;
	}
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	public String getOptionC() {
		return optionC;
	}
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	public String getOptionD() {
		return optionD;
	}
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "ItemBank [id=" + id + ", itemType=" + itemType
				+ ", itemContent=" + itemContent + ", optionA=" + optionA
				+ ", optionB=" + optionB + ", optionC=" + optionC
				+ ", optionD=" + optionD + ", answer=" + answer + "]";
	}
	public ItemBank(int id,String itemType, String itemContent, String optionA,
			String optionB, String optionC, String optionD, String answer) {
		super();
		this.id=id;
		this.itemType = itemType;
		this.itemContent = itemContent;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.answer = answer;
	}
	public ItemBank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
