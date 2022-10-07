package staffregistration;

public class approval {
	;
	private String USERNAME;
	private String EMAIL;
	private String GRADE;
	private String CONTACT;
	private String NIC;
    private String PASSWORD;
    private String REPEATPASSWORD;
    private String STATUS;
  
	public approval(String NAME , String EMAIL , String NIC, String PASSWORD , String REPEATPASSWORD , String CONTACT, String GRADE, String STATUS, String USERNAME) {
		
		this.USERNAME = USERNAME;
		this.EMAIL = EMAIL;
		this.NIC= NIC;
		this.PASSWORD= PASSWORD;
		this.REPEATPASSWORD= REPEATPASSWORD;
		this.CONTACT = CONTACT;
		this.GRADE = GRADE;
		this.STATUS=STATUS;
		
	}

	public String getUSERNAME() {
		return USERNAME;
	}

	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getGRADE() {
		return GRADE;
	}

	public void setGRADE(String gRADE) {
		GRADE = gRADE;
	}

	public String getCONTACT() {
		return CONTACT;
	}

	public void setCONTACT(String cONTACT) {
		CONTACT = cONTACT;
	}

	public String getNIC() {
		return NIC;
	}

	public void setNIC(String nIC) {
		NIC = nIC;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public String getREPEATPASSWORD() {
		return REPEATPASSWORD;
	}

	public void setREPEATPASSWORD(String rEPEATPASSWORD) {
		REPEATPASSWORD = rEPEATPASSWORD;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}


	}	
