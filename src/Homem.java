public class Homem extends Mamifero{
    private boolean casado;

    public void setCasado(boolean casado){
        this.casado = casado;
    }
    public boolean getCasado(){
        return casado;
    }

    public void Aleitar(int qtde){
        System.out.println("O homem está aleitando: " + qtde);

    }

    public void Rir(){
        System.out.println("O homem está rindo ");

    }

    public void Falar(){
        System.out.println("O homem está falando ");

    }


}
