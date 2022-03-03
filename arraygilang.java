import java.util.LinkedList;

public class arraygilang{
public static void main(String[] args) {
LinkedList<String> saya = new LinkedList<String>();

saya.add("M");
saya.add("U");
saya.add("H");
saya.add("A");
saya.add("M");
saya.add("M");
saya.add("A");
saya.add("D");
saya.add(" ");
saya.add("S");
saya.add("A");
saya.add("T");
saya.add("R");
saya.add("I");
saya.add("A");
saya.add(" ");
saya.add("G");
saya.add("E");
saya.add("M");
saya.add("I");
saya.add("L");
saya.add("A");
saya.add("N");
saya.add("G");
saya.add(" ");
saya.add("L");
saya.add("U");
saya.add("B");
saya.add("I");
saya.add("S");

System.out.println("Nama sebelum di tambah karakter baru: " + saya);

//tambahkan karakter lain yang anda inginkan
saya.add(" ");
saya.add("J");
saya.add("O");
saya.add("M");
saya.add("B");
saya.add("L");
saya.add("O");
System.out.println("Nama setelah ditambahkan karakter baru: " + saya);

//sisipkan karakter lain yang anda inginkan
saya.set(6,"S");
saya.set(11,"Y");
saya.set(5,"H");
System.out.println("Nama setelah disisipkann karakter baru: " + saya);

//hapus beberapa karakter yang ingin anda hapus
saya.remove(6);
saya.remove(12);
saya.remove(2);
saya.remove(7);
System.out.println("Nama setelah beberapa karakter dihapus: " + saya);

//buat fungsi push
saya.push("Jomblo");
System.out.println("Nama setelah diberi perintah push: " + saya);

//buat fungsi pop
System.out.println("Element yang di POP: " + saya.pop());


}





}
