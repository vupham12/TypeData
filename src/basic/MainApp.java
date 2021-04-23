package basic;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
      //  thông tin sinh viên:
		String 	name;
		int id;
		String cmnd;
		String nameclass;
		float dtb;
		
		// thông tin công nhân:
		String namecongnhan;
		String diachi;
		String sdt;
		float hsl;
		
		// thông tin car:
		String namecar;
		String hang;
		String gia;
		String color;
		
		name = "Pham Minh Vu";
		id = 2060090;
		cmnd = "1919921890";
		nameclass= "HueIC";
		dtb = 9.5f;
		
		System.out.println("họ va ten"+ name);
		System.out.println("ID="+ id);
		System.out.println("NameClass ="+nameclass);
		
	}

}
