package db.board2;

public class BoardInfoVO { // VO=벨류오브젝트의 약자. , NTT , DTO , 
	private Integer biNum;
	private String biTitle;
	private String biContent;
	private String biCredat;
	private String biCretim;
	private Integer biCnt;
	private String biIsactive;
	private String uiName;
	private int uiNum;
	public String getUiName() {
		return uiName;
	}
	public void setUiName(String uiName) {
		this.uiName = uiName;
	}
	public int getUiNum() {
		return uiNum;
	}
	public void setUiNum(int uiNum) {
		this.uiNum = uiNum;
	}
	public String getBiContent() {
		return biContent;
	}
	public Integer getBiNum() {
		return biNum;
	}
	public void setBiNum(Integer biNum) {
		this.biNum = biNum;
	}
	public String getBiTitle() {
		return biTitle;
	}
	public void setBiTitle(String biTitle) {
		this.biTitle = biTitle;
	}
	public String getBiontent() {
		return biContent;
	}
	public void setBiContent(String bicontent) {
		this.biContent = bicontent;
	}
	public String getBiCredat() {
		return biCredat;
	}
	public void setBiCredat(String biCredat) {
		this.biCredat = biCredat;
	}
	public String getBiCretim() {
		return biCretim;
	}
	public void setBiCretim(String biCretim) {
		this.biCretim = biCretim;
	}
	public Integer getBiCnt() {
		return biCnt;
	}
	public void setBiCnt(Integer biCnt) {
		this.biCnt = biCnt;
	}
	public String getBiIsactive() {
		return biIsactive;
	}
	public void setBiIsactive(String biIsactive) {
		this.biIsactive = biIsactive;
	}
	@Override
	public String toString() {
		return "BoardInfoVO [biNum=" + biNum + ", biTitle=" + biTitle + ", biContent=" + biContent + ", biCredat="
				+ biCredat + ", biCretim=" + biCretim + ", biCnt=" + biCnt + ", biIsactive=" + biIsactive + ", uiName="
				+ uiName + ", uiNum=" + uiNum + "]";
	}

	
	
}
