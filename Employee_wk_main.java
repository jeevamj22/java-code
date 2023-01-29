class Employee_Intern_wk
{
int employee_no;
public Employee_Intern_wk()
{
employee_no=100;
}
protected void finalize();

System.out.println(x:"Object is cleared from memory");

class Employee_wk_main
{
public static void main(String args[])
{
Employee_Intern_wk e=new Employee_Intern_wk();
e=null;
System.gc();
}
}
}
