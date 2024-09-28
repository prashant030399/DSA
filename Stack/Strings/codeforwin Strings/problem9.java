//Write a java program to count total number of vowels and consonants in a string.

public class problem9 {

    public static void main(String args []){

        String x = "PyTXYabxjnx";
        int countvowels =0;
        int countconsonants =0;

for(int i=0 ; i<x.length() ; i++){

    if(x.charAt(i)=='A' || x.charAt(i)=='E' || x.charAt(i)=='I' || x.charAt(i)=='O' || x.charAt(i)=='U' || x.charAt(i)=='a'|| x.charAt(i)=='e'|| x.charAt(i)=='i'|| x.charAt(i)=='o'|| x.charAt(i)=='u' ){
countvowels ++;
    } else {
        countconsonants ++;
    }
}
System.out.println("Total Vowels = " + countvowels);
System.out.print("Total Consonants = " + countconsonants);


    }
    
}
