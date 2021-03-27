public class Mamifero {
    protected String nome;
    protected int idade;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }

    public void Aleitar(){
        System.out.println("O mamífero está aleitando: ");

    }

    public void Comunicar(){
        System.out.println("O mamífero está se comunicando: ");

    }


}
