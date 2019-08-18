package com.henu.party.bean;

public class PartyCompany {
	private String num;
	private String partyId;
	private String name;
	private String nature;
	private String industry;
	private String ecoType;
	private String companyType;
	private String companyScale;
	private Integer workers;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getEcoType() {
		return ecoType;
	}

	public void setEcoType(String ecoType) {
		this.ecoType = ecoType;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getCompanyScale() {
		return companyScale;
	}

	public void setCompanyScale(String companyScale) {
		this.companyScale = companyScale;
	}

	public Integer getWorkers() {
		return workers;
	}

	public void setWorkers(Integer workers) {
		this.workers = workers;
	}

	public PartyCompany(String partyId, String name, String nature, String industry, String ecoType, String companyType,
			String companyScale, Integer workers) {
		super();
		this.partyId = partyId;
		this.name = name;
		this.nature = nature;
		this.industry = industry;
		this.ecoType = ecoType;
		this.companyType = companyType;
		this.companyScale = companyScale;
		this.workers = workers;
	}
	
	public PartyCompany(String num, String partyId, String name, String nature, String industry, String ecoType,
			String companyType, String companyScale, Integer workers) {
		super();
		this.num = num;
		this.partyId = partyId;
		this.name = name;
		this.nature = nature;
		this.industry = industry;
		this.ecoType = ecoType;
		this.companyType = companyType;
		this.companyScale = companyScale;
		this.workers = workers;
	}

	public PartyCompany() {
		super();
	}

	@Override
	public String toString() {
		return "PartyCompany [num=" + num + ", partyId=" + partyId + ", name=" + name + ", nature=" + nature
				+ ", industry=" + industry + ", ecoType=" + ecoType + ", companyType=" + companyType + ", companyScale="
				+ companyScale + ", workers=" + workers + "]";
	}

}
