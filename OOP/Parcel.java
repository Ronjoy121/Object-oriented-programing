public class Parcel {
public int  weight;
public String name;
public double fee;

public Parcel(){
System.out.print("set name first");
weight=0;
fee=0.0;
}

public Parcel(String x){
name =x;;
weight=0;
fee=0;


}
public Parcel(String y,int z){
name =y;
weight=z;
fee=0;
}
public void printDetails(){
System.out.println("Name:"+name+"\n Total Weight:"+weight+"\n Total Fee:"+fee);

}
public void calcFee(String l){
if (l.equals("Dhanmondi")){
fee=(weight*20)+50;
    }
    else {
    fee=weight*20;
    }
}
public void addWeight(int w){
weight+=w;
}
}








