public class Shelf {
public int capacity=0;
public int books=0;

public void addBooks (int x){
if (capacity>=x){
books=books+x;
    System.out.print(x+"books added to shelf");

}
else{
System.out.print("Zero capacity. Cannot add books.");
}




}

public void showDetails(){
    System.out.println("Shelf capacity:"+capacity);
            System.out.println("Number of books:"+books);
}
}
