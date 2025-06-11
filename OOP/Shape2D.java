public class Shape2D {
public int a;
public int b;
public int c;
public String t;
public Shape2D(int a){
this.a=a;
t="Square";
System.out.println("A Square has been created with length:"+ a);
}
    public Shape2D(int a,int b){
    this.a=a;
    this.b=b;
    t="rectangle";

    System.out.println("A Rectangle has been created with length:"+ a+" and breadth:"+  b);


}

    public Shape2D(int a,int b,String x){
        this.a=a;
        this.b=b;
         c=0;
        t=x;
        System.out.println("A Triangle has been created with height:"+ a+ "and base:{"+  b);
    }
    public Shape2D(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        t="Triangle";
        System.out.println("A Triangle has been created with the following sides: "+a+","+b+","+c);
    }

    public void area(){
    if (t.equals("Square")){
    double area=(this.a*this.a);
    System.out.println("The area of the Square is: " + area);
}
else if(t.equals("rectangle")) {
double area =(this.a*this.b);
        System.out.println("The area of the Rectangle is: "+area);
    }
else if (t.equals("Triangle")&& this.c==0){
double area =(0.5*(this.a*this.b));
        System.out.println("The area of the Triangle is:"+ area);
    }
else if (t.equals("Triangle")&& this.c!=0){
double are =((this.a+this.b+this.c)/2);
double area=Math.sqrt(are * (are - this.a) * (are - this.b) * (are - this.c));
        System.out.println("The area of the Triangle is:"+ area);
    }
    }
}






