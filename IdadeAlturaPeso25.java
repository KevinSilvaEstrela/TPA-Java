import java.util.Scanner;
public class IdadeAlturaPeso25 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float altura, peso,pesoMaior = 0, pesoMenor = 0, somaAltura = 0;
		int maisDe50 = 0, alturaX = 0, pesoX = 0,maiorIdade = 0, menorIdade = 100, idade;
		
		
		for(int i=1; i<=25; i++) {
			System.out.println("Digite a idade da "+i+"� pessoa");
			idade = leia.nextInt();
			
			System.out.println("Digite o peso da "+i+"� pessoa");
			peso = leia.nextFloat();
			
			System.out.println("Digite a altura da "+i+"� pessoa");
			altura = leia.nextFloat();
			
			if(idade > 50) {
				maisDe50 = maisDe50 + 1;
			
			}
			if(idade >= 10 && idade <= 20){
				alturaX++;
				somaAltura = altura + somaAltura;
			}
			if(idade < 40) {
				pesoX++;
			}
			if (idade < menorIdade ) {
				menorIdade = idade;
				pesoMenor = peso;
			}
			if (idade > maiorIdade) {
				maiorIdade = idade;
				pesoMaior = peso;
			}
				
		}
			System.out.println("Quantidade de pessoas com idade acima de 50 anos: " + maisDe50);
			System.out.println("A m�dia das alturas das pessoas entre 10 e 20 anos �: " + (somaAltura / alturaX));
			System.out.println("A percentagem de pessoas com peso inferior a 40 �: " + (pesoX * 100 / 25) + " %");
			System.out.println("O peso da pessoa mais nova �: " +pesoMenor + "e a idade da pessoa mais nova �: " +menorIdade);
			System.out.println("O peso da pessoa mais velha �: " +pesoMaior + "e a idade da pessoa mais velha �: " +maiorIdade);
			
			leia.close();
			
			
			
			
		}
	}

