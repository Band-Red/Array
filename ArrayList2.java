import java.util.ArrayList;
public class ArrayList2{
    public static void main(String[] args){
        ArrayList <String> list=new ArrayList <String>();
        list.add("Kiwi");
        list.add("strawberry"); 
        list.add("apple"); 
        list.add("Mango");
        for(String ob:list)
            System.out.println(ob); 
    }
}
/*-------------------------------------------------------------------------------------------
public class ArrayList2{
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<String>();
        list.add("kiwi");
        list.add("strwber");
        list.add("apple");
        list.add("Mango");
        
        for(String obj:list)
            System.out.println(obj); 
    }
}
-------------------------------------------------------------------------------------------
class Student{
    int rollno;
    String name;
    int age;
    public Student(int rollno,String name,int age){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}
public class ArrayList2{
    public static void main(String[] args){
        Student s1=new Student(101,"Ali",23);
        Student s2=new Student(102,"Mona",21);
        Student s3=new Student(103,"Salem",25);
        ArrayList<Student> list=new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        
        for(Student st:list)
            System.out.println(st.rollno+"   "+st.name+"   "+st.age);
    }
}*/