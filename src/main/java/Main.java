import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите название " + i + "-й машины: ");
            String name = scanner.next();
            int speed;
            while (true) {
                System.out.println("Введите скорость " + i + "-й машины: ");
                speed = scanner.nextInt();
                if (0 < speed && speed <= 250) break;
                System.out.println("Скорость должна быть от 1 до 250!");
            }

            new Cars(name, speed);
            Race.getLeader(speed, name);
        }

        System.out.println("Самая быстрая машина - это " + Race.leader + " со скоростью: " + (Race.distance / 24));
    }
}