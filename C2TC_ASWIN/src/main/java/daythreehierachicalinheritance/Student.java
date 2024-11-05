package daythreehierachicalinheritance;

public class Student extends person {

	private String clas; private float per; 
	public void Student() { 
		System.out.println("Student class default constructor"); clas="FY"; per=70; 
		} 
		public Student(String clas, float per) { this.clas = clas; this.per = per; 
		} 
		public String getClas() { return clas; 
		} 
		public void setClas(String clas) { this.clas = clas; 
		} 
		public float getPer() { return per; 
		} 
		public void setPer(float per) { this.per = per; 
		} 
		public Student(String name, String city,String clas, float per ) 
		{ 
		//private members can't inherited into child class /* * super.name=name; super.city=city; */super(name,city); 
		this.clas = clas; this.per = per; 
		} 
		@Override 
		public String toString() { 
		return "Student [clas=" + clas + ", per=" + per + ", getname()=" + getName() + ", getCity()=" + getCity() + "]"; 

	}

}
