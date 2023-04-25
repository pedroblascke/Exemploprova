import java.util.Scanner;

public class exemploProva {
    public static void main(String[] args) throws Exception {

        System.out.println("");
        System.out.println("Sistema de Diagnóstico de IMC");

        //Entrada(s): Nome, altura e peso de uma pessoa.
        System.out.println("");
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira seu nome ");
        String nome = sc.next();
        System.out.println("");

        System.out.print("Entre com sua altura em metros ");
        double altura = sc.nextDouble();
        System.out.println("");


        System.out.print("Entre com seu peso ");
        double peso = sc.nextDouble();
        System.out.println("");

        sc.close();
        
        //Processamento(s)
        //IMC
        double imc = peso / Math.pow (altura, 2); // Ou (altura * altura). - Sempre priorizar o uso da biblioteca matemática.

        //Diagnóstico(s)
            //Classificação
        String classificacao = "";
        int grauObesidade = 0;
        if (imc < 18.5) {
            classificacao = "Magreza";
            grauObesidade = 0;
    
        } else if (imc >= 18.5 && imc < 25) {
            classificacao = "Normal";
            grauObesidade = 0;
            
        } else if (imc >= 25 && imc < 30) {
            classificacao = "Sobrepeso";
            grauObesidade = 1;

        } else if (imc >= 30 && imc < 40) {
            classificacao = "Obesidadel";
            grauObesidade = 2;

        } else {
            classificacao = "Obesidade grave";
            grauObesidade = 3;
        }
        


        //Saída(s)
        System.out.printf("O funcionário %s, da altura %1.2f e peso %3.2f tem o IMC = %2.2f, com Diagnóstico: %s %d", nome, altura, peso, imc, classificacao, grauObesidade); // Outra forma: "o funcionário" + nome + "da altura..." + altura... etc!
                // %s - String
                // %d - Inteiro
                // %f - float/double
                // %n - Quebra de linha
                // %2.2f - número decimal (quantidade máxima de casas)
                
        System.out.println("");

    }
}
