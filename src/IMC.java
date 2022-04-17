import java.util.Scanner;

public class IMC {
    Scanner ler = new Scanner(System.in);
    double peso;
    double altura;
    int genero;
    double IMC;

    public void Menu() {
        System.out.println("DIGITE O SEU PESO: ");
        peso = ler.nextDouble();
        System.out.println("DIGITE A SUA ALTURA: ");
        altura = ler.nextDouble();
        do {
            System.out.println("DIGITE 1 PARA O SEXO MASCULINO E DIGITE 2 PARA O SEXO FEMININO");
            genero = ler.nextInt();
        } while (genero != 1 && genero != 2);
        calculaImc(peso,altura);
        comparaIMC(IMC, genero);
        System.out.println("SEU IMC É: " + IMC);
    }

    public double calculaImc(double peso, double altura) {
        IMC = peso / (altura * altura);
        return IMC;
    }

    public void comparaIMC(double imc, int genero) {
        if (genero == 1) {
            if (imc < 20)
                System.out.println("VOCÊ ESTA ABAIXO DO PESO");
            else if (imc >= 20 && imc <= 24.9)
                System.out.println("VOCÊ ESTA NO PESO IDEAL");
            else if (imc >= 25 && imc <= 29.9)
                System.out.println("VOCÊ ESTA NO NÍVEL DE OBESIDADE 1");
            else if (imc >= 30 && imc <= 39.9)
                System.out.println("VOCÊ ESTA NO NÍVEL DE OBESIDADE 2");
            else
                System.out.println("VOCÊ ESTA NO NÍVEL DE OBESIDADE 3");
        }
        else{
            if (imc < 19)
                System.out.println("VOCÊ ESTA ABAIXO DO PESO");
            else if (imc >= 19 && imc <= 23.9)
                System.out.println("VOCÊ ESTA NO PESO IDEAL");
            else if (imc >= 24 && imc <= 28.9)
                System.out.println("VOCÊ ESTA NO NÍVEL DE OBESIDADE 1");
            else if (imc >= 29 && imc <= 38.9)
            System.out.println("VOCÊ ESTA NO NÍVEL DE OBESIDADE 2");
            else
                System.out.println("VOCÊ ESTA NO NÍVEL DE OBESIDADE 3");
        }

    }
}
