package com.tanqui.models;

import java.util.ArrayList;
import java.util.List;

public class Lop {
	private String maLop;
	private String tenLop;
	private List<SinhVien> danhSachSinhVien = new ArrayList<SinhVien>();
	
	public String getMaLop() {
		return maLop;
	}
	
	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}
	
	public String getTenLop() {
		return tenLop;
	}
	
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	
	public List<SinhVien> getDanhSachSinhVien() {
		return danhSachSinhVien;
	}
	
	public void setDanhSachSinhVien(List<SinhVien> danhSachSinhVien) {
		this.danhSachSinhVien = danhSachSinhVien;
	}
	
}
