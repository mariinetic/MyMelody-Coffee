import java.util.Scanner;

public class MyMelodyCafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🎀 Bem-vindo ao Café da My Melody! 🎀");
        System.out.println("Vamos escolher algumas comidinhas deliciosas! 🍰");

        System.out.println("Menu:");
        System.out.println("1. Bolo de Morango - R$ 10.00 🍓");
        System.out.println("2. Donut de Chocolate - R$ 8.00 🍩");
        System.out.println("3. Cookie de Baunilha - R$ 5.00 🍪");
        System.out.println("4. Café com Leite - R$ 6.00 ☕");
        System.out.println("5. Chá de Camomila - R$ 4.00 🍵");

        System.out.print("Por favor, escolha um item do menu (1-5): ");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("🎀 Você escolheu Bolo de Morango! 🍓");
                System.out.println("Total: R$ 10.00");
                break;
            case 2:
                System.out.println("🎀 Você escolheu Donut de Chocolate! 🍩");
                System.out.println("Total: R$ 8.00");
                break;
            case 3:
                System.out.println("🎀 Você escolheu Cookie de Baunilha! 🍪");
                System.out.println("Total: R$ 5.00");
                break;
            case 4:
                System.out.println("🎀 Você escolheu Café com Leite! ☕");
                System.out.println("Total: R$ 6.00");
                break;
            case 5:
                System.out.println("🎀 Você escolheu Chá de Camomila! 🍵");
                System.out.println("Total: R$ 4.00");
                break;
            default:
                System.out.println("❌ Escolha inválida! Por favor, selecione um item de 1 a 5.");
                break;
        }

        System.out.println("Obrigada por visitar o Café da My Melody! Volte sempre! 🌸");

        scanner.close();
    }
}
