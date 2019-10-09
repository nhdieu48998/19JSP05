package Colection;
import java.util.LinkedList;
import java.util.List;
public class KySu extends CanBo{
	String nghanhdaotao;
	public KySu(String hoten, int namsinh, String gioitinh, String diachi, String nghanhdaotao) {
		super(hoten, namsinh, gioitinh, diachi);
	this.nghanhdaotao = nghanhdaotao;
	}
	public void print() {
		System.out.println("hoten :"+this.hoten+ " gioitinh: "+this.gioitinh+ "diachi :"+this.diachi+"nganhdaotao: "+this.nghanhdaotao);
	
	}

}
