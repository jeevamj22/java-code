import mypack.Car;
import java.util.*;
import java.io.*;
public class Truck extends Car
{
int weight;
public Truck(int speed,double regularPrice,String color,int weight){
super(speed,regularPrice,color);
this.weight=weight;
}
double getSalePrice(){
return weight>2000 ? regularPrice*0.90:regularPrice*0.80;
}
}
public class CarDemo{
public static void main(String args[]){
Truck truck1=new Truck(250,999999,"Black",1900);
Truck truck2=new Truck(300,2999999,"grey",25000);
System.out.println(truck1.getSalePrice());
System.out.println(truck2.getSalePrice());
}
}
}