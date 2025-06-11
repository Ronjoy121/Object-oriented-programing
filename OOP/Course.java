public class Course {
public String Name;
//public String [] syllabus;
public String code;
String []  syllabus=new String[4];
public int count=0;

public int count1=0;

 public void   createCourse(String x,String y){
 Name=x;
 code=y;


}
public void addOneContent(String a){
syllabus[count]=a;
if (count<4){
count=count+1;
}
}
public void addTwoContent(String d,String e){
syllabus[count]=d;
 if (count<4){
count=count+1;
 }
syllabus [count]=e;
 if (count<4){
count=count+1;
}
}
public void printDetails(){
System.out .print("course details:\n course name:"+Name+ "\n Course Code:"+code+"\n Course Syllabus:" );
count=0;
count1=0;
for (int i=0;i<=3;i++){
if(syllabus[i]==null){
count1=count1+1;
}
else{
System.out.print(syllabus[i]+", ");
}
if (count1==4){
System.out.println("No content yet.");
}
if (count1>4){
 System.out.println("Cannot add more content");
}
}
}
}





