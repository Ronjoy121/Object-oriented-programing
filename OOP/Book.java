public class Book {
public String name;
public String author;
public int price;
public Book(String x){
name=x;
}
public Book (String x,String y){
name=x;
author=y;
}
    public Book (String x,String y,int z){
        name=x;
        author=y;
        price=z;
    }
    public void setDetails(int f){
    price=f;
    }
    public void setDetails(String j,int f){
    author=j;
    price=f;
    }
    public void displayDetails(){
    if (author==null && price==0){
    System.out.println("title: "+name);
    }
    else if (price==0){
        System.out.println("title: "+name+ " Author: "+author);
    }
    else if (author==null){

        System.out.println("title: "+name+" price"+price);
    }
    else{
        System.out.println("title: "+name+ " Author: "+author+" price"+price);
    }
    }
}


