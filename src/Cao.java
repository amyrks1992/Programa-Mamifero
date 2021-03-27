public class Cao extends Mamifero{
    private String cauda;

    public void setCauda(String cauda){
        this.cauda = cauda;
    }

    public String getCauda(){
        return cauda;
    }

    public void Aleitar (){
        System.out.println("O cão está aleitando: ");

    }

    public void Morder(){
        System.out.println("O cachorro está mordendo ");
    }
    public void Latir(){
        System.out.println("O cachorro está latindo ");
    }
}

