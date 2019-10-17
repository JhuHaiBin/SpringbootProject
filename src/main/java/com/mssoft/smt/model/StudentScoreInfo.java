package com.mssoft.smt.model;

public class StudentScoreInfo {
    private Integer sId;

    private Long sNumber;

    private Integer sChineseScore;

    private Integer sMathScore;

    private Integer sEnglishScore;

    private String sClass;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Long getsNumber() {
        return sNumber;
    }

    public void setsNumber(Long sNumber) {
        this.sNumber = sNumber;
    }

    public Integer getsChineseScore() {
        return sChineseScore;
    }

    public void setsChineseScore(Integer sChineseScore) {
        this.sChineseScore = sChineseScore;
    }

    public Integer getsMathScore() {
        return sMathScore;
    }

    public void setsMathScore(Integer sMathScore) {
        this.sMathScore = sMathScore;
    }

    public Integer getsEnglishScore() {
        return sEnglishScore;
    }

    public void setsEnglishScore(Integer sEnglishScore) {
        this.sEnglishScore = sEnglishScore;
    }

    public String getsClass() {
        return sClass;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass == null ? null : sClass.trim();
    }
    public StudentScoreInfo() {
    	
    }
	public StudentScoreInfo(Integer sId, Long sNumber, Integer sChineseScore, Integer sMathScore, Integer sEnglishScore,
			String sClass) {
		super();
		this.sId = sId;
		this.sNumber = sNumber;
		this.sChineseScore = sChineseScore;
		this.sMathScore = sMathScore;
		this.sEnglishScore = sEnglishScore;
		this.sClass = sClass;
	}
	public StudentScoreInfo( Long sNumber, Integer sChineseScore, Integer sMathScore, Integer sEnglishScore,
			String sClass) {
		super();
		this.sNumber = sNumber;
		this.sChineseScore = sChineseScore;
		this.sMathScore = sMathScore;
		this.sEnglishScore = sEnglishScore;
		this.sClass = sClass;
	}
}