class compileTimePolymorphism{
    compileTimePolymorphism(){
        System.out.println("Iam in default constructor overloading");
    }
    compileTimePolymorphism(int a){
        System.out.println("Iam in single parameter constructor overloading");
    }
    void access(){
        System.out.println("Accessing me");
    }

    void access(int a){
        System.out.println("given single integer"+a );
    }
    void access(double a,int b){
        System.out.println("given two integers"+a +" "+b);
    }
}
class Shape{
    int k=10;
    void area(){
        System.out.println("Iam in Shape Class");
    }
}
class Triangle extends Shape{
    int k=20;
    void area(){
        System.out.println("Iam in Triangle Class");
    }
}
class Square extends Shape{
    void area(){
        System.out.println("Iam in Square Class");
    }
}
class Polymorphism{
    public static void main(String[] args) {
        System.out.println("Method Overloading/compile time polymorphism");
        System.out.println("--------------------");
        compileTimePolymorphism ct1=new compileTimePolymorphism();               
        compileTimePolymorphism ct2=new compileTimePolymorphism(10);
        ct1.access();
        ct2.access(10);
        ct1.access(10, 20);
        System.out.println("Method OverRiding/dynamic polymorphism");
        System.out.println("---------------------");
        Square sq=new Square();
        sq.area();
        //if we create in this way then we can get all parent class object type and functions of overrided methods
        Shape sp=new Triangle();
        System.out.println(sp.k);
        sp.area();
    }
}
