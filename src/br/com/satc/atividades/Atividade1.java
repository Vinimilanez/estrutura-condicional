package br.com.satc.atividades;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        /* Faça um programa para calcular a média de 3 notas, perguntar qual a 
        nota mínima para a aprovação e se tem direito a recuperação, se tiver,
        perguntar a nota da recuperação e refazer a média, mostrar a média e a
        situação do aluno no final.*/
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua 1ª nota.");
        float nota = entrada.nextInt();
        System.out.println("Digite sua 2ªnota.");
        float nota2 = entrada.nextInt();
        System.out.println("Digite sua 3ªnota.");
        float nota3 = entrada.nextInt();
        System.out.println("Qual a média mínima para a aprovação.");
        float minima = entrada.nextInt();

        float media = (nota + nota2 + nota3) / 3;

        if (media >= minima) {
            System.out.println("Você foi aprovado.\n tchau");
        } else if (media < minima) {
            System.out.println("Há direito de recuperação? \n"
                    + "'sim' para sim \n"
                    + "'nao' para não");
            String decisao;
            decisao = "sim";
            boolean equals = decisao.equals("nao");
            
            }
        }

    }


