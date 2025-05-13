import java.util.Scanner;

public class ShowGeometryTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. In ra hình chữ nhật");
            System.out.println("2. In ra hình tam giác vuông");
            System.out.println("3. In ra hình tam giác cân");
            System.out.println("0. Thoát");
            System.out.println("Hãy nhập vào sự lựa chọn của bạn là: ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Nhập chiều dài cạnh a:");
                int a = sc.nextInt();
                System.out.print("Nhập chiều rộng cạnh b:");
                int b = sc.nextInt();
                System.out.println("Hình chữ nhật của bạn là:");
                for (int i = 1; i <= b; i++) {
                    for (int j = 1; j <= a; j++) {
                        System.out.print("*  ");
                    }
                    System.out.println();
                }
            } else if (choice == 2) {
                int selectTriangle = -1;
                Scanner sc2 = new Scanner(System.in);
                while (selectTriangle != 0) {
                    System.out.println("1. In hình tam giác vuông, có cạnh góc vuông ở botton-left ");
                    System.out.println("2. In hình tam giác vuông, có cạnh góc vuông ở botton-right");
                    System.out.println("3. In hình tam giác vuông, có cạnh góc vuông ở top-left");
                    System.out.println("4. In hình tam giác vuông, có cạnh góc vuông ở top-right");
                    System.out.println("0. Thoát");
                    System.out.println("Sự lựa chọn của bạn là :");
                    selectTriangle = sc2.nextInt();
                    if (selectTriangle == 1) {
                        System.out.println("Tam giác có chiều cao là: ");
                        int a = sc2.nextInt();
                        System.out.println("Hình tam giác vuông, có cạnh góc vuông ở botton-left");
                        for (int i = 1; i <= a; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                    } else if (selectTriangle == 2) {
                        System.out.println("Tam giác có chiều cao là: ");
                        int a = sc2.nextInt();
                        System.out.println("Hình tam giác vuông, có cạnh góc vuông ở botton-right");
                        for (int i = 1; i <= a; i++) {
                            for (int j = 1; j <= a - i; j++) {
                                System.out.print("  ");
                            }
                            for (int k = 1; k <= i; k++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                    } else if (selectTriangle == 3) {
                        System.out.println("Tam giác có chiều cao là: ");
                        int a = sc2.nextInt();
                        System.out.println("Hình tam giác vuông, có cạnh góc vuông ở top-left");
                        for (int i = a; 0 < i; i--) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                    } else if (selectTriangle == 4) {
                        System.out.println("Tam giác có chiều cao là: ");
                        int a = sc2.nextInt();
                        System.out.println("Hình tam giác vuông, có cạnh góc vuông ở top-right");
                        for (int i = a; 0 < i; i--) {
                            for (int j = i; j < a; j++) {
                                System.out.print("  ");
                            }
                            for (int k = i; 0 < k; k--) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                    } else {
                        System.exit(0);
                    }
                }
            } else if (choice == 3) {
                System.out.println("Tam giác có chiều cao là: ");
                int a = sc.nextInt();
                System.out.println("Hình tam giác cân:");
                for (int i = 1; i <= a; i++) {
                    for (int j = 1; j <= a - i; j++) {
                        System.out.print("  ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            } else {
                System.exit(0);
            }
        }
    }
}
