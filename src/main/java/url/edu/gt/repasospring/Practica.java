package url.edu.gt.repasospring;

public class Practica {
    public static void main(String[] args) {
        int donaciones = 7;
        String institucion = "Banco de Alimentos San Miguel";

        for (int i = 1; i <= 3; i++) {
            donaciones = donaciones + 5;
        }

        if (donaciones >= 20) {
            System.out.println(institucion + ": meta alcanzada (" + donaciones + ")");
        } else {
            System.out.println(institucion + ": faltan " + (20 - donaciones));
        }
    }
}