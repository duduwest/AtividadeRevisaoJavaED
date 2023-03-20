package AtividadeRevisaoJavaED;

import java.util.Scanner;

public class ExemploRevisao {
    Scanner sc = new Scanner(System.in);

    // criar metodos da classe
    public void exemplo1() {
        // criar um projeto pra ler duas notas e a frequencia
        // e falar se o aluno esta reprovado ou aprovado
        // 1.ler a primeira nota
        System.out.println("Informe a primeira nota do aluno");
        double nota1 = sc.nextDouble();
        // 2. ler a segunda nota
        System.out.println("Informe a segunda nota do aluno");
        double nota2 = sc.nextDouble();
        //3.  calcular a media das notas
        double media = (nota1 + nota2)/2; 
        // 4. mostrar media calculada 
        System.out.println(" A média do aluno é " + media);
        // 5 .informar o total de aulas 
        System.out.println("PROFESSOR, informe o total de aulas dadas");
        double aulasDadas = sc.nextDouble(); 
        // 6. informar quantidade de faltas do aluno 
        System.out.println("PROFESSOR, informe o nº de faltas do aluno");
        double nfaltas = sc.nextDouble();
        //7. calcular a porcentagem(%) de frequencia
        double frequencia = ((aulasDadas-nfaltas)/aulasDadas)*100;// transformando em porcentagem 
        // mostrar a porcentagem de frequencia do aluno 
        System.out.println(" O aluno teve "+frequencia+"%"); 
        // se (media>=50 e frequencia >= 75)
        if ( media>=50 && frequencia>=75) { 
            System.out.println(" O aluno esta aprovado");
        } else if (media<50 && frequencia>=75) { 
            System.out.println(" O aluno esta de recuperação");
        } 
        else{ 
            System.out.println(" O aluno esta reprovado");
        }
        

        


    }

}
