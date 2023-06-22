@SuppressWarnings("ALL")
public class Rectangle {

    private final double width;
    private final double height;
    private final double square; // outra forma pré calculada considerando numeros fixos para base / altura
    // a multiplicação será efetuada apenas uma vez na criação do objeto que nesse caso é uma otimização
    // considerando que toda vez que trazer o método da área não realizará novo cálculo pois os atributos são fixos e já foram pré calculados

    public Rectangle(double base, double altura){
        this.width = base;
        this.height = altura;
        square = width * height; // reaproveitando o this para calcular o square
    }

    public Rectangle(double width){
        this(width, width);
    }

    public double square(){
       // return width * height; versão normal primeira...
        return square; // retornando a área pré calculada na criação do objeto

    }
}
