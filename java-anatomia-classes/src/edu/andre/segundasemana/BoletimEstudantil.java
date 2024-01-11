package edu.andre.segundasemana;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 5;

        if (mediaFinal < 6) {
            System.out.println("Aluno Reprovado!");
        } else if (mediaFinal == 6) {
            System.out.println("Prova Minerva - Aluno fará recuperação!");
        } else  {
            System.out.println("Aluno Aprovado!");
            System.out.println("Boas Férias!");
        }
    }
}

