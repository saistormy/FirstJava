package myPackage;

public class Student implements Comparable<Student>{
	
	private int studentId;
	private String studentName;
	
	private int age;
	public int getStudentId(){
		return studentId;
	}
		public void getStudentId(int studentId){
			this.studentId=studentId;
		}
		public String getStudentName(){
			return studentName;
		}
		public void getStudentName(String studentName){
			this.studentName=studentName;
		}
		public int getAge(){
			return age;
		}
		//public void setAge(int age){
		//	if(age >3 & age 17)
			{
				this.age=age;
			}
			//else
			{
			//	throw new InvalideAgeException("Age should be between 3 and 17")
			}
		//}
		public String tostring()
		{
			return studentId+studentName+age;
		}
		@Override
		public int compareTo(Student o){
			return this.getStudentName().compareTo(o.getStudentName());
			
		}
		@Override
		public boolean equals(Object o)
		{
			System.out.println("Equals");
			return this.studentId==((Student) o).studentId;
		}
		@Override
		public int hashCode()
		{
			System.out.println("Hash Method");
			return this.studentId;
		}
	public Student()
	{
	}
	public Student(int studentId, String studentName,int age){
		super();
		this.studentId=studentId;
		this.studentName=studentName;
		this.age=age;
	}
	}

