package com.wipro.oop;

public class Restaurent {
	String rname;
	String raddress;
	long rphoneno;
	public Restaurent(String rame, String raddress, long rphoneno) {
		super();
		this.rname = rame;
		this.raddress = raddress;
		this.rphoneno = rphoneno;
	}
	public String getRame() {
		return rname;
	}
	public void setRame(String rame) {
		this.rname = rame;
	}
	public String getRaddress() {
		return raddress;
	}
	public void setRaddress(String raddress) {
		this.raddress = raddress;
	}
	public long getRphoneno() {
		return rphoneno;
	}
	public void setRphoneno(long rphoneno) {
		this.rphoneno = rphoneno;
	}
	@Override
	public String toString() {
		return "Restaurent [rame=" + rname + ", raddress=" + raddress + ", rphoneno=" + rphoneno + "]";
	}
	
	

}
