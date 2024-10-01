public class Factorymain {

    public static void main(String[] args) {

        // when there is a superclass and multiple subclasses and we want to get obj of subclasses based
        // on input of users
        // then we create a factory which takes the responsibility of creating the obj based on I/Ps

        ShapeFactory sF=new ShapeFactory();
        
        Shape s = sF.getShape("triangle");
        s.draw();   
        
        //Shape s=new circle();
    }
}
