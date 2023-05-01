import java.util.Scanner;

public class Exercicio10 {
  /**
   * 10. Faça um programa que leia a altura e o sexo de uma pessoa (1 para masculino e 2 para 
   * feminino), calcule e escreva o seu peso ideal, utilizando as fórmulas abaixo. Implemente um 
   * método para calcular o peso ideal.
   * • para homens: (72.7 × altura) − 58
   * • para mulheres: (62.1 × altura) − 44.7
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int gender;
    double height;

    System.out.println("Informe a altura: ");
    height = in.nextDouble();
    menu();
    gender = in.nextInt();
    switch(gender){
      case 1: System.out.printf("\nPara homens com altura %.2f, o peso ideal é %.2f\n",height,idealWeight(gender,height));
      break;
      case 2: System.out.printf("\nPara mulheres com altura %.2f, o peso ideal é %.2f\n",height,idealWeight(gender,height));
      break;
      default: System.out.printf("\nValor inválido.");
    }
    System.out.printf("\n.::Fim da Execução::.");
    in.close();
  }
  /*
   * 
   */
  public static void menu(){
    System.out.printf("\n-------------MENU-------------");
    System.out.println();
    System.out.println("Inform a opção do gênero: ");
    System.out.println("1 - Masculino");
    System.out.println("2 - Feminino");
    System.out.print(">> Retorno: ");
  }
  /*
   * 
   */
  public static double idealWeight(int gender, double height){
    double weight=0.0;
    if(gender==1){
      return weight=((72.7 * height)-58);
    }else
      return weight=((62.1 * height)-44.7);
  }
}
