public class Gato extends Mamifero{
    private String cauda;

    public void setCauda(String cauda){
        this.cauda = cauda;
    }

    public String getCauda(){
        return cauda;
    }

    public void Aleitar (){
        System.out.println("O cão está aleitando:");

    }

    public void Arranhar(){
        System.out.println("O gato está arranhando ");
    }

    public void Miar(){
        System.out.println("O gato está miando ");
    }
}
