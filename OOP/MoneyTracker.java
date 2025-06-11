public class MoneyTracker {
public int income=0;
public String name="null";
public double expense;
public double cbalence;
public double hincome;
public double hexpence;


public void createTracker(String x){
name=x;
}
public String info(){
return("Name:"+name+"\nCurrent balance "+cbalence);
}
public void income(int y){
hincome=y;
income=income+y;
cbalence = y;
System.out .println("balemce updated");

}
public void expense(int k){
hexpence=k;





    if (cbalence ==0){
        System.out.println("You're broke!");
    }
    if(cbalence>k){
        cbalence=cbalence -k;
        System.out.println("Balance Updated.");
    }
 else {
    System.out.println("Not enough balance.");
    }


}

public void showHistory(){
System.out.println("Last added: "+hincome);
    System.out.println("Last spent: "+hexpence);
}




}
