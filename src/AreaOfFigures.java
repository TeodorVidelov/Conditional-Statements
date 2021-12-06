import java.util.Scanner;
public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFigure = scanner.nextLine();

        if ("square".equals(typeOfFigure)){
            double a = Double.parseDouble(scanner.nextLine());
            double areaSquare = a * a;
            System.out.printf("%.3f",areaSquare);
        }
        else if ("rectangle".equals(typeOfFigure)){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double areaRectangle = a * b;
            System.out.printf("%.3f",areaRectangle);
        }
        else if ("circle".equals(typeOfFigure)){
           double radius = Double.parseDouble(scanner.nextLine());
           double radiusCircle = Math.PI * (radius * radius);
            System.out.printf("%.3f",radiusCircle);
        }
        else if ("triangle".equals(typeOfFigure)){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double areaTriangle = (a * b) / 2;
            System.out.printf("%.3f",areaTriangle);
        }
    }
}