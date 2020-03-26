
public class Construtor1 {
	int id;  
    String name;  
    int age;
		// TODO Auto-generated method stub
		  
	    
	    Construtor1(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    
	    Construtor1(int i,String n,int a){  
	    id = i;  
	    name = n;  
	    age=a;  
	    }  
	    void display()
	    {
	    	System.out.println(id+" "+name+" "+age);
	    	}  
	   
	    public static void main(String args[]){  
	    Construtor1 s1 = new Construtor1(111,"Sai");  
	    Construtor1 s2 = new Construtor1(222,"Shankar",25);  
	    s1.display();  
	    s2.display();  
	   }  
	 
	}


