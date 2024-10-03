import java.util.Scanner;
public class atividade01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos filmes você deseja avaliar?");
        int qtdFilmes = sc.nextInt();

        double[] notas = new double[qtdFilmes];
        int filmesbons = 0;
        int filmesruins = 0;
        double somaNotas = 0;


        for(int i = 0; i < qtdFilmes; i++){
            System.out.println("Digite a nota do filme " + (i+1) + ": ");
            notas[i] = sc.nextDouble();


            if(notas[i] <0 || notas[i] > 10){
                System.out.println("Digite a nota do filme de 0 a 10");
                i--;
            }else{
                notas[i] = notas[i] / 10;
                somaNotas += notas[i];
            }if(notas[i] >= 6){
                filmesruins++;
            }else{
                filmesbons++;
            }

            double media = somaNotas / qtdFilmes;
        }

        // Saída das avaliações dos filmes
        System.out.println("A quantidade de filmes avaliados em bons " + filmesbons);
        System.out.println("A quantidade de filmes avaliados em ruins " + filmesruins);
    }
}

