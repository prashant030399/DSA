class M{

private int rollno;
private String name ;
private float marks ;

public void setrollno(int r ){
    rollno =r;
}

public void setname(String n){
    name =n;
}

public void setmarks(float  m){
    marks=m;
}

public int getrollno(){
    return rollno;
} 

public String getname(){
    return name;
}

public float getmarks(){
    return marks ;
}

}




class N{

    public static void main(String[] args) {
        
M x = new M();
x.setrollno(35);
x.setname("Prashant");
x.setmarks(99.0f);

System.out.println(x.getrollno());
System.out.println(x.getname());
System.out.println(x.getmarks());

    }
    }