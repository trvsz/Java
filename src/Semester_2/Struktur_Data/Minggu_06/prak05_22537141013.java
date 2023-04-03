package Semester_2.Struktur_Data.Minggu_06;

// Travis Zusa Zuve Saputra
// 22537141013

import java.util.*;

public class prak05_22537141013 {
    static LinkedList<patient> list = new LinkedList<patient>(); // Inisialisasi LinkedList
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        while (true) {
            System.out.println("+------------------+");
            System.out.println("| Hospital Systems |");
            System.out.println("+------------------+");
            System.out.println("1. Add Patient");
            System.out.println("2. Print Queue");
            System.out.println("3. Next Patient");
            System.out.println("4. Search Patient");
            System.out.println("5. Delete Patient");
            System.out.println("6. Exit");
            System.out.print("Choose: ");
            int choose = ui.nextInt();
            switch (choose) {
                case 1:
                    addPatient(); // Memanggil method addPatient
                    break;
                case 2:
                    printQueue(); // Memanggil method printQueue
                    break;
                case 3:
                    nextPatient(); // Memanggil method nextPatient
                    break;
                case 4:
                    searchPatient(); // Memanggil method searchPatient
                    break;
                case 5:
                    deletePatient(); // Memanggil method deletePatient
                    break;
                case 6:
                    System.out.println("Thank You!");
                    System.exit(0); // Keluar dari program
                    break;
                default: // Jika input tidak sesuai
                    System.out.println("!! Wrong Input !!");
                    break;
            }
        }
    }
    public static void addPatient() {
        Scanner ui = new Scanner(System.in);
        System.out.print("[+] Name: ");
        String name = ui.nextLine(); // Mengambil inputan
        System.out.print("[+] Complaint: ");
        String complaint = ui.nextLine(); // Mengambil inputan
        System.out.print("[+] Address: ");
        String address = ui.nextLine(); // Mengambil inputan
        patient patient = new patient(name, complaint, address); // Membuat objek patient
        list.add(patient); // Menambahkan objek patient ke list
    }
    public static void printQueue() {
        System.out.println("Name -- Complaint -- Address");
        for (patient patient : list) { // Looping untuk menampilkan data list
            System.out.println(patient.getName() + " -- " + patient.getComplaint() + " -- " + patient.getAddress());
        }
    }
    public static void nextPatient() {
        System.out.println("Next Patient: ");
        System.out.println(">> Name: " + list.peek().getName()); // Mengambil data pertama dari list
        System.out.println(">> Complaint: " + list.peek().getComplaint()); // Mengambil data pertama dari list
        System.out.println(">> Address: " + list.peek().getAddress()); // Mengambil data pertama dari list
        list.removeFirst(); // Menghapus data pertama dari list
    }
    public static void searchPatient() {
        Scanner ui = new Scanner(System.in);
        System.out.print("Name: ");
        String name = ui.nextLine(); // Mengambil inputan
        for (patient patient : list) { // Looping untuk mencari data linkedlist
            if (patient.getName().equals(name)) { // Jika  data ditemukan
                System.out.println(">> Name: " + patient.getName()); // Menampilkan data
                System.out.println(">> Complaint: " + patient.getComplaint()); // Menampilkan data
                System.out.println(">> Address: " + patient.getAddress()); // Menampilkan data
            }
        }
    }
    public static void deletePatient() {
        Scanner ui = new Scanner(System.in);
        System.out.print("Name: ");
        String name = ui.nextLine();
        boolean isRemoved = false;
        Iterator<patient> iterator = list.iterator();
        while (iterator.hasNext()) {
            patient patient = iterator.next();
            if (patient.getName().equals(name)) { // Jika data ditemukan
                iterator.remove(); // Menghapus data dari linkedlist
                System.out.println("Patient " + name + " has been deleted"); // Menampilkan pesan
                isRemoved = true;
            }
        }
        if (!isRemoved) {
            System.out.println("Patient " + name + " not found"); // Menampilkan pesan
        }
    }
}

class patient {
    private String name;
    private String complaint;
    private String address;
    
    public patient(String name, String complaint, String address) {
        this.name = name;
        this.complaint = complaint;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public String getComplaint() {
        return complaint;
    }
    public String getAddress() {
        return address;
    }
}