import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class tugas_queue
{
    public static void main(String[] args) 
    {
        Integer angka;
        int i=0;
        boolean bool = true;

        Queue<Integer> antrian = new LinkedList<>(); //deklarasi queue
        Scanner pilih = new Scanner(System.in);

        System.out.println("Pilihan Operasi Queue");
        do
        {
            System.out.println("1. Masukkan Antrian ");
            System.out.println("2. Keluarkan Antrian ");
            System.out.println("3. Ambil Antrian Teratas ");
            System.out.println("4. Cek Antrian Teratas ");
            System.out.println("5. Banyak Antrian ");
            System.out.println("6. Tampilkan Antrian ");
            System.out.println("7. Selesai");
            System.out.print("Masukkan Pilihan [1-6]: ");
            int input=pilih.nextInt();

            switch(input)
            {
            case 1:
            System.out.print("Banyak data yang ditambah : ");
            i=0;
            int h=pilih.nextInt();

            do
            {
            System.out.print("Masukan angka : ");
            angka=pilih.nextInt();
            antrian.add(angka);
            i++;
            }

            while(i<h);
            System.out.println("Antrian : "+antrian);
            System.out.println("");
            break;

            case 2:
            System.out.println("Keluarkan Antrian : "+antrian.remove());
            System.out.println("");
            break;

            case 3:
            System.out.println("Ambil Antrian Teratas : "+antrian.poll());
            System.out.println("");
            break;

            case 4:
            System.out.println("Cek Antrian Teratas : "+antrian.peek());
            System.out.println("");
            break;

            case 5:
            System.out.println("Banyak Antrian : "+antrian.size());
            System.out.println("");
                    
            case 6:
            System.out.println("Tampilkan Antrian : "+antrian);
            System.out.println("");
            break;

            case 7:
            System.exit(0);
            break;
                
            default:
            System.err.println("Pilihan tidak tersedia!");
            System.out.println("");
            }
        }
        while(bool);
    }
}