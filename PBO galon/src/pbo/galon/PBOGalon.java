package pbo.galon;
import java.util.Scanner;
public class PBOGalon {

    
        public static void main(String[] args){
            
            int gallons = 0 ;
            double liters;

            Scanner scan = new Scanner(System.in);
            
            System.out.println("Masukkan jumlah Gallon yang ingin anda konversikan : ");
            gallons = scan.nextInt();

            liters = gallons *3.785;

            System.out.println(gallons + " galon adalah " + liters + " liter.");



        }
    }
