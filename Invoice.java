import java.util.*;
class Invoice_x
{
private String part_no;
private String part_des;
private int quantity;
private Double price;

public String getPart(){return part_no;}
public void setPart(String P)
{
this.part_no=P;
System.out.println("the part number is "+P);
}

public String getDes(){return part_des;}
public void setDes(String D)
{
this.part_des=D;
System.out.println("the part description"+D);
}
public Integer getQuantity(){return quantity;}
public void setQuantity(int Q)
{
this.quantity=Q;
System.out.println("the number of quantities "+Q);
}
public  Double getPrice(){return price;}
public void setPrice(double r)
{
this.price=r;
System.out.println("the price of quantity"+10);
}

public void Invoice()
{
double x;
x=quantity*price;
System.out.println("the bill price"+x);
}
}

class Invoice
{
public static void main(String args[]){
Invoice_x i=new Invoice_x();
i.setPart("1");
i.setDes("washing soap");
i.setQuantity(5);
i.setPrice(10.00);
i.Invoice();
}
}



