//StringBuffer ou StringBuilder sao metodos incrementados no JAVA 
// e serve para manipular valores Strings que podem mudar a qualquer momento

public class StringbufferESBuilder {
    
    
    //metodo main
    public static void main(String[] args){
        StringBuffer b = new StringBuffer("Leandro");
        // System.out.println(b.toString());

        b.append(" Moura"); //Adicionando string no meu StringBuffer
        // System.out.println(b.toString());

        b.insert(7," é da família ");
        // System.out.println(b.toString());

        //Deletando valores da String
        b.delete(8, 20); //Entre a string 8 e 20, será deletado os valores
        // System.out.println(b.toString());

        //invertendo a string
        b.reverse();
        // System.out.println(b.toString());


        StringBuilder bb = new StringBuilder("Leandro mOUR A  z");

        //metodo TRIM - remove os espacos em branco
        bb.trimToSize();

        //Metodo length - conta os caracteres da String 

        //IndexOf e lastIndexOF - procurando a posicao de uma string a partir de uma posicao
        //serve para saber se existe tal palava la dentro

        bb.lastIndexOf("A", 3);
        // System.out.println(bb.toString());
        // System.out.println(bb.indexOf("lEANDRO", 4));

        //METODO substring ou Subsequence
        //pegar um pedaco da minha String

        System.out.println(  bb.substring(0, 7)        ); // retorna só Leandro


        //Subsequence
        System.out.println(bb.subSequence(0, 7)); //retorna Leandro







    }
}
