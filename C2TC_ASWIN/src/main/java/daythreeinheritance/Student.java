package daythreeinheritance;
 public class Student extends Citizen {
	 private int rollNo; private String collegeName; public Student() { super(); 
		} 
		public Student(String name, String AadharNo, String Address, long phno, int rollNo, String collegeName){super();  
		this.rollNo = rollNo; 
		this.collegeName = collegeName; 
		} 
		public int getRollNo() { 
		return rollNo; 
		} 
		public void setRollNo(int rollNo) { this.rollNo = rollNo; 
		} 
		public String getCollegeName() { return collegeName; 
		} 
		public void setCollegeName(String collegeName) { this.collegeName = collegeName; 
		} 
		@Override 
		public String toString() { 
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", Name=" + getCollegeName() 
		+ ", AadharNo=" + getaadharNo() + ", Address=" + getClass() + ", Phno=" + getRollNo() 
		+ "]"; 
		}
		private String getaadharNo() {
			// TODO Auto-generated method stub
			return null;
		} 
		} 

	