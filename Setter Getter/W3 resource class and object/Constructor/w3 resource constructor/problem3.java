 /*
 3. Constructor Overloading
Write a Java program to create a class called "Book" with instance variables title, author, and price. 
Implement a default constructor and two parameterized constructors:

One constructor takes title and author as parameters.
The other constructor takes title, author, and price as parameters.
Print the values of the variables for each constructor.
  
 */
 
class Book {

private String title;
private String author ;
private int price ;

    public String gettitle(){
        return title;
    }
    
    public String getauthor(){
        return author;
    }
    
    public  int getprice(){
        return price;
    }

Book(){
     title= "Two States";
     author = "Chetan Bhagat";
     price = 300;
}    

Book(String  t, String a , int p){
    title = t;
    author = a;
    price = p;
}

Book(String t, String a ){
title = t;
author =a;
price = 700;
} 

 }

class Main{

    public static void main (String args[]){

Book b = new Book();
Book b2 = new  Book("My Journey", "APJ Abdul Kalam", 1000);
Book b3 = new Book("The Alchemist", "Paulo Coelho");

System.out.println(b.gettitle());
System.out.println(b.getauthor());
System.out.println(b.getprice());

System.out.println(b2.gettitle());
System.out.println(b2.getauthor());
System.out.println(b2.getprice());

System.out.println(b3.gettitle());
System.out.println(b3.getauthor());
System.out.println(b3.getprice());


    }
}