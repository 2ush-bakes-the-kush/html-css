import java.util.Scanner;

class Student{
	String name,reg;
	Student(String r,String n){
		name=n;
		reg=r;
	}
}
class UGStudent extends Student{
	double sMarks,aMarks, eMarks;
	double total;
	UGStudent(String r,String n){
		super(r,n);
		sMarks=0;
		aMarks=0;
		eMarks=0;
	}
	void setUGStudent(double s,double a,double e){
		sMarks=s;
		aMarks=a;
		eMarks=e;
	}
	String computePerformance(){
		total=sMarks+aMarks+eMarks;
		if(total<40)
			return "F";
		else if (total>=40&&total<50)
			return "E";
		else if (total>=50&&total<60)
			return "D";
		else if (total>=60&&total<70)
			return "C";
		else if (total>=70&&total<80)
			return "B";
		else if (total>=80&&total<90)
			return "A";
		else
			return "A+";
	}
	void Display(){
		System.out.println("Name\tReg\t\tSessionalMarks\tAssignment Marks\tEndSem Marks\tGrade\tTotal");
		System.out.println(super.name+"\t"+super.reg+"\t"+sMarks+"\t\t"+aMarks+"\t\t\t"+eMarks+"\t\t"+computePerformance()+"\t"+total);
	}
}
public class StudentMain{
	public static void main(String args[]){
		Scanner br=new Scanner(System.in);
		String n,r;
		double a,b,c;
		System.out.println("Enter the Name, Registration Number and the Sessional, Assignment and End Sem Marks");
		n=br.nextLine();
		r=br.nextLine();
		a=br.nextDouble();
		b=br.nextDouble();
		c=br.nextDouble();
		UGStudent obj=new UGStudent(r,n);
		obj.setUGStudent(a,b,c);
		obj.Display();
	}
}
		