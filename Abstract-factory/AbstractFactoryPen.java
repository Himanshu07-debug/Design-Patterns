public class AbstractFactoryPen {

    public static void main(String[] args) {
        
        // Here there is Factories(sketch and gel) of factories(Tube and Gel)
        Pen p=new Sketch();

        //p=new Sketch();
        Pen product = p.createProduct();

    }
}
