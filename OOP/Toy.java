public class Toy {
public String name ;
public int  price;
public Toy(String x,int y){
name =x;
price=y;
System.out.println("A new toy has been made!");
}
public void updatePrice(int a){
price=a;;
}
public void showPrice(){
System.out.println("price:"+ price +"Taka");
}
public void updateName(String b){

  System.out .println("Changing old name:" +name);
    name=b;
    System.out .println("new name:"+ name);
}








}

