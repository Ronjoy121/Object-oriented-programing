public class Assignment {
public int tasks=0;
public  String difficulty="null";
public boolean submission=false;

public void printDetails(){
System.out .println("numberr of task:"+tasks +"\nDifficulty level: "+difficulty +"\nSubmission required:"+submission);
}
public void makeOptional(){
if (submission ==true){
      System.out .println("Assignment will not require submission");
    }
else{
        System.out .println("submission is already not required");
    }
}
}


