public class Annotation {

    private Figure figure;
    private String caption;

    Annotation(Figure figure, String caption){
        this.figure = figure;
        this.caption = caption;
    }

    public Figure getFigure(){
        return figure;
    }

    public String getCaption() {
        return caption;
    }
}
