import java.util.Scanner;
class Time{
    int hr,min,sec;
    Time(){
        hr=0;
        min=0;
        sec=0;
    }
    Time(int h,int m,int s){
        hr=h;
        min=m;
        sec=s;
    }
    void display(){
        System.out.println("The Time is: "hr+":"+min+":"+sec);
    }
    void add(Time obj1,Time obj2){
        this.sec = obj1.sec + obj2.sec;
        this.min+= this.sec / 60;
        this.sec = this.sec % 60;
        this.min = obj1.min + obj2.min;
        this.hr+= this.min / 60;
        this.min = this.min % 60;
        this.hr = obj1.hr + obj2.hr;
        this.hr%=24;
        }
}

class TimeMain {
    public static void main(String args[]){
        Scanner br=new Scanner(System.in);
        Time obj3=new Time();
        int hh,mm,ss;
        System.out.print("Enter the first time");
        hh=br.nextInt();
        mm=br.nextInt();
        ss=br.nextInt();
        Time obj1=new Time(hh,mm,ss);
        System.out.print("Enter the second time");
        hh=br.nextInt();
        mm=br.nextInt();
        ss=br.nextInt();
        Time obj2=new Time(hh,mm,ss);
        obj3.add(obj1, obj2);
        obj3.display();
    }
}
