import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("");
            String input = new Scanner(System.in).nextLine();

//            if (input.equals("������!")) {
//                System.out.println("������!");
//            } else if (input.equals("��� ����?")) {
//                System.out.println("�������! � ���� ���?");
//            } else {
//                System.out.println("�� ������� ��������� :(");
//            }

//            switch (input) {
//                case "������!":
//                    System.out.println("������!");
//                    break;
//                case "��� ����?":
//                    System.out.println("�������! � ���� ���?");
//                    break;
//                default:
//                    System.out.println("�� ������� ��������� :(");
//            }

            switch (input) {
                case "������!" -> System.out.println("������!");
                case "��� ����?" -> {
                    System.out.println("�������!");
                    System.out.println("� ���� ���?");
                }
                default -> System.out.println("�� ������� ��������� :(");
            }
        }
    }
}
