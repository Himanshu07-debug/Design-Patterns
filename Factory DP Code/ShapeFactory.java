public class ShapeFactory{

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.trim().equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        else if(shapeType.equalsIgnoreCase("triangle")){
            return new triangle();
        }
        return null;
    }

}
