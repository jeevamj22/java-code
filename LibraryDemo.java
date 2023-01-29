interface BookLending
{
public void getBook();
}
interface BookSubmission
{
public void setBook();
}
class Library implements BookLending,BookSubmission
{
public void getBook()
{
System.out.println("C book is lended");
}
public void setBook()
{
System.out.println("C book is returned");
}
}
class LibraryDemo
{
public static void main(String args[])
{
Library a=new Library();
a.getBook();
a.setBook();
}
}

