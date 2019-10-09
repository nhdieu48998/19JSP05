package Colection;
import java.util.LinkedList;
import java.util.List;
public class NhanVien extends CanBo{
	String congviec;
	public NhanVien(String hoten, int namsinh, String gioitinh, String diachi, String congviec) {
		super(hoten, namsinh, gioitinh, diachi);
		this.congviec = congviec;
		
	}
	public void print() {
		System.out.println("hoten :"+this.hoten+ " gioitinh: "+this.gioitinh+ "diachi :"+this.diachi+"congviec"+this.congviec);
	
	}

}
