package Practice_Java.Practice_Java;

class Teacher {

	public int rollno;
	public String name;
	Teacher(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
}

class ArrayOfClass
{
	public static void main(String[] args)
	{
		Teacher array[];
		array=new Teacher[5];
		
		array[0]=new Teacher(1,"jyoti");
		array[1]=new Teacher(2,"jyo");
		array[2]=new Teacher(3,"neha");
		array[3]=new Teacher(4,"vivek");
		array[4]=new Teacher(5,"vicky");
		
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Element at "+i+" is rollno: "+array[i].rollno+" name: "+array[i].name);
		}
	}
}