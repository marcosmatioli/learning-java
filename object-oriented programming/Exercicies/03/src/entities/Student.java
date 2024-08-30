package entities;

public class Student {

	public String name;
	public double p1;
	public double p2;
	public double p3;

	public double finalNote() {
		return this.p1 + this.p2 + this.p3;
	}

	public String passOrFailed() {

		if (finalNote() > 60) {
			return "PASS";
		} else {
			return "FAILED \n"
					+ "MISSING:" + String.format("%.2f",60-finalNote()) + "POINTS" ;
		}

	}

	public String toString() {
		
		return "FINAL GRADE:" + finalNote() + "\n"+passOrFailed();
		
	}

}
