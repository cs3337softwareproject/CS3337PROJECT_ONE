package cardReader;

public class CardReader {
	//Attributes
	private int studentNumber;
	private String firstName;
	private String lastName;
	private int studentDob;

	

	//Constructor with four parameters for arguments.
	public CardReader(String firstName, String lastName, int studentNumber, int studentDob){
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentNumber = studentNumber;
		this.studentDob = studentDob;
	}

	
	//All setters and getters.
	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getStudentDob() {
		return studentDob;
	}

	public void setStudentDob(int studentDob) {
		this.studentDob = studentDob;
	}
	//Override with a String
	@Override
	public String toString(){
		return "Card Information [First Name]: " + firstName + ",  [Last Name]: " + lastName + ", [Student CIN]:" + studentNumber
				+ "[Student DOB]: " + studentDob;
	}
	
}
