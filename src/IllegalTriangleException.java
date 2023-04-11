import java.util.Scanner;


public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cạnh 1: ");
        int a = scanner.nextInt();
        System.out.println("Cạnh 2: ");
        int b = scanner.nextInt();
        System.out.println("Cạnh 3: ");
        int c = scanner.nextInt();
        try{
            checlTriangle(a, b, c);
            System.out.println("Đây là tam giác");
        } catch (Exception e){
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
    public static void checlTriangle( int a, int b, int c) throws Exception{
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || b + c <= a || c + a <= b){
            throw new Exception("Ko là tam giác");
        }
    }

}
