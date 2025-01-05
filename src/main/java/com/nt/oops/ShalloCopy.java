package com.nt.oops;
//Shallow Copy
class Student implements Cloneable{
    int rollNo;
    Address address;
   //shallow copy primitive variable copy happen
    /*protected  Object clone() throws CloneNotSupportedException{
        //by default shallow copy
        return super.clone();
    }*/
    //Deep Copy
   protected  Object clone() throws CloneNotSupportedException{
       //All primitive will copy
       Student student = (Student) super.clone();
       student.address = (Address) address.clone();
       return student ;
   }

}
class Address implements Cloneable{
    int addressId;
    //Deep Copy
    protected  Object clone() throws CloneNotSupportedException{
        //All primitive will copy
        return super.clone();
    }
}
public class ShalloCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
    Student student1 = new Student();
    student1.rollNo = 1;
   /* //here both referance copy to same memory location
    // here we are copying referance not object
    Student student2 = student1 ;
    student2.rollNo = 5;*/
        Address address = new Address();
        address.addressId = 12;
        student1.address = address;
        //shallow copy implementation
        Student student2 = (Student)student1.clone() ;
        student2.rollNo = 5;
        student2.address.addressId = 13;



        System.out.println(student1.rollNo);
        System.out.println(student2.rollNo);
        System.out.println(student1.address.addressId);
        System.out.println(student2.address.addressId);
    }
}
