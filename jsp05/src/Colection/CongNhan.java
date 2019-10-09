package Colection;

import java.util.LinkedList;
import java.util.List;

public class CongNhan extends CanBo {
		double bac;
		
	public CongNhan(String hoten, int namsinh, String gioitinh, String diachi,double bac)
	{
		
		super(hoten, namsinh, gioitinh, diachi);
		this.bac = bac;
	}
public void print() {
	System.out.println("hoten :"+this.hoten+ " gioitinh: "+this.gioitinh+ "diachi :"+this.diachi+"bac :"+this.bac);
	}
		
}	

