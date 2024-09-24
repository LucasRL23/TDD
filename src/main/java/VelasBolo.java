import java.util.Scanner;

public class VelasBolo{
    public int[] lerEntrada() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade da sua sobrinha:");
        int idade = scanner.nextInt();
        System.out.println("Digite as alturas das velas (separadas por espaço):");
        int[] alturasVelas = new int[idade];
        for (int i = 0; i < idade; i++) {
            alturasVelas[i] = scanner.nextInt();
        }
        return alturasVelas;
    }
}