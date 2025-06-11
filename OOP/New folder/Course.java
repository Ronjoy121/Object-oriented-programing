public class Course {
public String cName;
public String code;
public int credit;

public void createCourse(String x,String y,int k){
cName=x;
code =y;
credit=k;
}
public void displayCourse(){
System.out.println("Course Name: "+cName);
    System.out.println("Course Code: "+code);
    System.out.println(" Course Credit:"+credit);
}
public void updateCourse(String x,String y,int k){
    cName=x;
    code =y;
    credit=k;
}

}
