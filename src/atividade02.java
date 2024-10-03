import java.util.Scanner;
public class atividade02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidades de pessoas que vão votar.");
        int pessoas = sc.nextInt();

        double[] votos = new double[pessoas];
        int votosTaffe = 0;
        int votosRodrigo = 0;
        int votosLucas = 0;
        int votosAlessandro = 0;

        for(int i = 0; i < pessoas; i++){
            System.out.println("Qual das opções você deseja votar? ");
            System.out.println("taffe - 99");
            System.out.println("rodrigo - 88");
            System.out.println("lucas - 77");
            System.out.println("Alessandro - 66");
            int opcao = sc.nextInt();

            if(opcao == 99){
                votos[i] = 99;
                votosTaffe++;
            }if(opcao == 88){
                votos[i] = 88;
                votosRodrigo++;
            }if(opcao == 77){
                votos[i] = 77;
                votosLucas++;
            }if (opcao == 66) {
                votos[i] = 66;
                votosAlessandro++;
            }
        }
            if(votosTaffe > votosRodrigo && votosTaffe > votosLucas && votosTaffe > votosAlessandro){
                System.out.print("Taffe ganhou " + votosTaffe++ + " votos");
            }else if(votosRodrigo > votosTaffe && votosRodrigo > votosLucas && votosRodrigo > votosAlessandro){
                System.out.print("Rodrigo ganhou " + votosRodrigo++ + " votos");
            }else if(votosLucas > votosTaffe && votosLucas > votosRodrigo && votosLucas > votosAlessandro){
                System.out.print("Lucas ganhou " + votosLucas++ + " votos");
            }else if(votosAlessandro > votosTaffe && votosAlessandro > votosRodrigo && votosAlessandro > votosLucas){
                System.out.print("Alessandro ganhou " + votosAlessandro++ + " votos");
            }else{
                System.out.print("Vote em um dos numeros do candidato");
            }


    }
}
