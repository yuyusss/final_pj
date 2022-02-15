package com.project.board.model;

public class MusicalVO {
	//memberData
	private String muscNo;
	private String muscName;
	private String muscHashtag;
	private String muscPlace;
	private String muscPlaceLink;
	private String muscStartDate;
	private String muscEndDate;
	private String muscQuote;
	private int muscReqTime;
	private String muscSynop;
	
	//constructor
	public MusicalVO(){}
	
	public MusicalVO(String muscNo, String muscName, String muscHashtag, String muscPlace, String muscPlaceLink,
			String muscStartDate, String muscEndDate, String muscQuote, int muscReqTime, String muscSynop) {
		super();
		this.muscNo = muscNo;
		this.muscName = muscName;
		this.muscHashtag = muscHashtag;
		this.muscPlace = muscPlace;
		this.muscPlaceLink = muscPlaceLink;
		this.muscStartDate = muscStartDate;
		this.muscEndDate = muscEndDate;
		this.muscQuote = muscQuote;
		this.muscReqTime = muscReqTime;
		this.muscSynop = muscSynop;
	}

	
	//set, get
	
	public String getMuscNo() {
		return muscNo;
	}

	public String getMuscName() {
		return muscName;
	}

	public String getMuscHashtag() {
		return muscHashtag;
	}

	public String getMuscPlace() {
		return muscPlace;
	}

	public String getMuscPlaceLink() {
		return muscPlaceLink;
	}

	public String getMuscStartDate() {
		return muscStartDate;
	}

	public String getMuscEndDate() {
		return muscEndDate;
	}

	public String getMuscQuote() {
		return muscQuote;
	}

	public int getMuscReqTime() {
		return muscReqTime;
	}

	public String getMuscSynop() {
		return muscSynop;
	}

	public void setMuscNo(String muscNo) {
		this.muscNo = muscNo;
	}

	public void setMuscName(String muscName) {
		this.muscName = muscName;
	}

	public void setMuscHashtag(String muscHashtag) {
		this.muscHashtag = muscHashtag;
	}

	public void setMuscPlace(String muscPlace) {
		this.muscPlace = muscPlace;
	}

	public void setMuscPlaceLink(String muscPlaceLink) {
		this.muscPlaceLink = muscPlaceLink;
	}

	public void setMuscStartDate(String muscStartDate) {
		this.muscStartDate = muscStartDate;
	}

	public void setMuscEndDate(String muscEndDate) {
		this.muscEndDate = muscEndDate;
	}

	public void setMuscQuote(String muscQuote) {
		this.muscQuote = muscQuote;
	}

	public void setMuscReqTime(int muscReqTime) {
		this.muscReqTime = muscReqTime;
	}

	public void setMuscSynop(String muscSynop) {
		this.muscSynop = muscSynop;
	}

	
	@Override
	public String toString() {
		return "MusicalVO [muscNo=" + muscNo + ", muscName=" + muscName + ", muscHashtag=" + muscHashtag
				+ ", muscPlace=" + muscPlace + ", muscPlaceLink=" + muscPlaceLink + ", muscStartDate=" + muscStartDate
				+ ", muscEndDate=" + muscEndDate + ", muscQuote=" + muscQuote + ", muscReqTime=" + muscReqTime
				+ ", muscSynop=" + muscSynop + "]";
	}
	
	
	
	
	
	
	
	
	
}