package Colection;

import java.util.ArrayList;
import java.util.Scanner;

import QuanLy.Congnhan;
import QuanLy.Kysu;


public class MainCanBo {
	public static ArrayList<CanBo> dsCanBo = new ArrayList<>();
	public static void timkiem() {
		System.out.println("Nhap ten can tim kiem");
		String ten=new Scanner(System.in).nextLine();
		boolean kt=false;
		for(CanBo s : dsCanBo) {
			if(ten.equalsIgnoreCase(s.getHoten())) {
				s.print();
				kt=true;
			}
		}
		if(kt==false) {
			System.out.println("Ten ban vua nhap khong dung");
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CongNhan congnhan1 = new CongNhan("Dieu", 1998, "Nam", "QB", 4);
		CongNhan congnhan2= new CongNhan("Hieu", 1998, "nam", "dn", 3);
		KySu kysu1 = new KySu("ngo", 1998, "nam", "dn", "xaydung");
		KySu kysu2 = new KySu("nammy",1998,"nam","dn","it");
		NhanVien nhanvien1 = new NhanVien("Nhien", 1998, "nam", "hue", "marketing");
		NhanVien nhanvien2 = new NhanVien("Duc", 1998, "nam", "hue", "javascript");
		
		dsCanBo.add(congnhan1);
		dsCanBo.add(congnhan2);
		dsCanBo.add(kysu1);
		dsCanBo.add(kysu2);
		dsCanBo.add(nhanvien1);
		dsCanBo.add(nhanvien2);
		for(CanBo s: dsCanBo) {
			s.print();
		}

		timkiem();


	}

}
