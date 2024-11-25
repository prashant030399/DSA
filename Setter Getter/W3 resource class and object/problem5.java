/*Write a Java program to create a class called "Book" with attributes for title, 
author, and ISBN, and methods to add and remove books from a collection. */
import java.util.*;

class Book{

private String title;
private String author;
private String ISBN;

public void settitle(String t){
    title = t;
}

public void setauthor(String a){
    author = a;
}

public void setISBN(String I){
    ISBN = I;
 }

public String getttitle(){
    return title ;
}

public String getauthor(){
    return author ;
}

public String  getISBN(){
    return ISBN;
}

}

class Main{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
Book x = new Book();
ArrayList <Book> l = new  ArrayList <Book> ();

for(int i=0 ; i<=2; i++){
    Book b = new Book();
    System.out.println("Enter Book Details");
    b.settitle(sc.next());
    b.setauthor(sc.next());
    b.setISBN(sc.next());
    l.add(b);
}

System.out.println("Enter Book Title ");

String t = sc.next();
int i=0,p=0;
for(Book b : l){
    if(b.getttitle().equals(t)){
        p=i;
        break;
    }
    i++;
}
l.remove(p);

for(Book b:l){
    System.out.println(b.getttitle());
    System.out.println(b.getauthor());
    System.out.println(b.getISBN());
}

}
}