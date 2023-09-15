package ss01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
//        Tính chu vi và diện tích của hình chữ nhật
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào chiều dài của hình chữ nhật: ");
        int width = input.nextInt();
        System.out.print("Nhập vào chiều rộng của hình chữ nhật: ");
        int height = input.nextInt();
        System.out.println("Chu vi của hình chữ nhật là: " + 2 * width * height);
        System.out.println("Diện tích của hình chữ nhật là: " + width * height);
    }
}