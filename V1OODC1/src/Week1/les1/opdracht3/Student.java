package Week1.les1.opdracht3;

public class Student{
	private String naam;
	private int studentNummer;
		
	public Student(String nm, Integer stNr){
		naam = nm;
		studentNummer = stNr;
	}
	
	public Student(String nm){
		naam = nm;
	}
	
	public String getNaam() {
		return naam;
	}
	
	
	public Integer getStudentNummer() {
		return studentNummer;
	}
	
	public void setNaam(String nwNm) {
		naam = nwNm;
	}
	
	public void setStudentNummer(int stnr) {
		studentNummer = stnr;
	}
	
	public String toString() {
		String s = "Deze student heet " + naam + " met student nummer " + studentNummer;
		return s;
	}
}