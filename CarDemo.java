import mypack.Car;
class Truck extends Car {
 int weight;
 public Truck(int speed, double regularPrice, String color, int weight) {
 super(speed, regularPrice, color);
 this.weight = weight;
 }
 double getSalePrice() {
 return weight > 2000 ? regularPrice * .90 : regularPrice * .80;
 }
}
public class CarDemo {
 public static void main(String[] args) {
 Truck truck1 = new Truck(150, 300000, "White", 2500);
 Truck truck2 = new Truck(180, 250000, "Black", 1500);
 System.out.println(truck1.getSalePrice());
 System.out.println(truck2.getSalePrice());
 }
}