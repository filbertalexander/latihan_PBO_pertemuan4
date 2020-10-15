public class Contoh{
	public static void main(String args[]){
		char hurufAwal = 'a';
		System.out.print("Masukkan huruh awal nama anda = ");
		try{
			hurufAwal = (char)System.in.read();
		}catch(Exception e){
			System.out.println("Salah ko menginput cess..!");
		}
		if (hurufAwal == 'a')
			System.out.println("apa namamu amin?");
		else if (hurufAwal == 'b')
			System.out.println("apa namamu bambamng?");
		else if (hurufAwal == 'c')
			System.out.println("apa namamu ceceo?");
		else if (hurufAwal == 'd')
			System.out.println("apa namamu daud?");
		else if (hurufAwal == 'e')
			System.out.println("apa namamu endang?");
		else 
			System.out.println("aku tak bisa menebak");
		
	}
}