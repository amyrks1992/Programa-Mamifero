public class Main {
    public static void main(String[] args) {

        Mamifero mam01 = new Mamifero();
        mam01.Comunicar();

        Homem hom01 = new Homem();
        hom01.Aleitar(25);
        hom01.Falar();
        hom01.setNome("João");
        System.out.println(hom01.getNome());

        Cao cao01 = new Cao();
        cao01.Aleitar();
        cao01.Latir();
        cao01.setNome("Scooby");
        cao01.setIdade(4);
        System.out.println(cao01.getNome());
        System.out.println(cao01.getIdade() + " anos");


        Gato gato01 = new Gato();
        gato01.Arranhar();
        gato01.Miar();
        gato01.setNome("Baguera");
        System.out.println(gato01.getNome());

    }
}
