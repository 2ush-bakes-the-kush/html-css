import java.util.Scanner;

class Employee{
            String name,id;
            double salary;
            Employee(String a,String b,Double c){
                name=a;
                id=b;
                salary=c;
            }
            double computeNetSalary(){
                double da,gross,net,tax;
                da=salary*0.40;
                gross=salary+da;
                if(gross<=300000)
                    tax=0;
                else if(gross>300000&&gross<=500000)
                    tax=gross*0.10;
                else if(gross>500000&&gross<=1000000)
                    tax=gross*0.20;
                else
                    tax=gross*0.30;
                net=gross-tax;
                return net;
            }
            void display(){
                System.out.println("Name\tId\t\tSalary\t\tNet Salary");
                System.out.print(name+"\t"+id+"\t"+salary+"\t"+computeNetSalary());
            }
        }
class EmployeeMain{
         public static void main(String args[]){
             Scanner br=new Scanner(System.in);
             String n,i;
             double s;
             System.out.println("Enter the Name ID and Salary of the Employee");
             n=br.nextLine();
             i=br.nextLine();
             s=br.nextDouble();
             Employee obj=new Employee(n,i,s);
             obj.display();
            }
        }
             
