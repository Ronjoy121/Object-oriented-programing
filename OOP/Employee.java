public class Employee {
public String name;
public double salary;
public String designation;

 public void newEmployee(String x){
 name =x;
 salary=30000;
 designation="junior";


 }
 public void displayInfo(){
 System.out.println("Employee Name: "+name);
  System.out.println("Employee Salary: "+salary);
  System.out.println("Employee :Designation "+designation);
 }
 public void calculateTax(){
 double k=salary;
 if (salary >50000){
    k=(k*0.3);

 }
 else if(salary>30000){
  k=k*0.1;
  System.out.println("New Salary: "+k+"tk");
 }
 else{
 System.out.println("No need to pay tax");
 }
  System.out.println("New Salary: "+k+"tk");
 }

public void promoteEmployee(String k){
designation=k;
if (k.equals("senior")){
salary=salary+25000;
System.out.println(k);
}
if (k.equals("lead")){
salary=salary+50000;
 System.out.println(k);
 System.out.println(salary);
}
else{
salary=salary+75000;
 System.out.println(k);

}
}










}
