public class Main {

    public static void main(String[] args) {

        Annotation[] annotations = new Annotation[]{new Annotation(new BoundingBox(2,4,5,6), "прямоугольник"),
                new Annotation(new Circle(2,1,3), "окружность1"), new Annotation(new Circle(3,1,3), "окружность2"),
                new Annotation(new BoundingBox(7,8,3,1), "прямоугольник2")};
        System.out.println(findByPoint(annotations, 7,8).getCaption());
        BoundingBox boundingBox = new BoundingBox(4,2,-5,3);
        Circle circle = new Circle(2,6,1);
        boundingBox.move(4, 1);
        circle.move(2,2);
        System.out.println("1: " + circle.getX() + ", " + circle.getY());
        System.out.println("2: " + boundingBox.getX1() + ", " + boundingBox.getY1() + ", " + boundingBox.getX2() + ", " + boundingBox.getY2());
    }

    public static Annotation findByPoint(Annotation[] annotations, int x, int y){
        for (int i = 0; i < annotations.length; i++){
            if (annotations[i].getFigure() instanceof BoundingBox)
                if ((((BoundingBox) annotations[i].getFigure()).getX1() == x
                        && ((BoundingBox) annotations[i].getFigure()).getY1() == y)
                        ||(((BoundingBox) annotations[i].getFigure()).getX2() == x
                        && ((BoundingBox) annotations[i].getFigure()).getY2() == y))
                    return annotations[i];
            if (annotations[i].getFigure() instanceof Circle)
                if (((Circle) annotations[i].getFigure()).getX() == x
                        && ((Circle) annotations[i].getFigure()).getY() == y)
                    return annotations[i];
        }
        return null;
    }

}
