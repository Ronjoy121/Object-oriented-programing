public class Passenger {

public static int no_of_passenger=0;
public static int total_fare=0;

public String name;

public int count;
public double distence;
public double weight;
 public double fare;
public  Passenger(String x,double y){
name=x;
distence+=y;
count+=1;
 no_of_passenger+=count;
 fare=(distence*20);
 total_fare+=fare;
}
 public void setBaggageWeight(double a){
 weight=a;
 fare +=(weight*10);
 total_fare+=fare;
 }








 public void   passengerDetails(){
 System.out.println("Name:"+ name+"\n fare:"+fare);
 }



}


