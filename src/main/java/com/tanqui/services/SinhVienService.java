package com.tanqui.services;

import java.util.ArrayList;
import java.util.List;

import com.tanqui.models.SinhVien;

public class SinhVienService {
	
	public List<SinhVien> layTatCaSinhVien() {
		List<SinhVien> sinhViens1 = new ArrayList<SinhVien>();
		SinhVien sv1 = new SinhVien();
		sv1.setMasv("D01");
		sv1.setHoTen("Nguyễn Văn A");
		sv1.setNgaySinh("2000-01-01");
		sv1.setGioiTinh("Nam");
		sv1.setDiemtb("10");
		sinhViens1.add(sv1);
		SinhVien sv2 = new SinhVien();
		sv2.setMasv("D01");
		sv2.setHoTen("Nguyễn Văn A");
		sv2.setNgaySinh("2000-01-01");
		sv2.setGioiTinh("Nam");
		sv2.setDiemtb("10");
		sinhViens1.add(sv2);
		SinhVien sv3 = new SinhVien();
		sv3.setMasv("D01");
		sv3.setHoTen("Nguyễn Văn A");
		sv3.setNgaySinh("2000-01-01");
		sv3.setGioiTinh("Nam");
		sv3.setDiemtb("10");
		sinhViens1.add(sv3);
		return sinhViens1;
	}
	
	public List<SinhVien> layDanhSachSinhVienBangMaLop(String maLop) {
		List<SinhVien> sinhViens1 = new ArrayList<SinhVien>();
		SinhVien sv1 = new SinhVien();
		sv1.setMasv("D01");
		sv1.setHoTen("Nguyễn Văn A");
		sv1.setNgaySinh("2000-01-01");
		sv1.setGioiTinh("Nam");
		sv1.setDiemtb("10");
		sinhViens1.add(sv1);
		SinhVien sv2 = new SinhVien();
		sv2.setMasv("D01");
		sv2.setHoTen("Nguyễn Văn A");
		sv2.setNgaySinh("2000-01-01");
		sv2.setGioiTinh("Nam");
		sv2.setDiemtb("10");
		sinhViens1.add(sv2);
		SinhVien sv3 = new SinhVien();
		sv3.setMasv("D01");
		sv3.setHoTen("Nguyễn Văn A");
		sv3.setNgaySinh("2000-01-01");
		sv3.setGioiTinh("Nam");
		sv3.setDiemtb("10");
		sinhViens1.add(sv3);
		return sinhViens1;
	}
	

	public SinhVien laySinhVienBangMasv(String masv) {
		SinhVien sv1 = new SinhVien();
		sv1.setMasv("D01");
		sv1.setHoTen("Nguyễn Văn A");
		sv1.setNgaySinh("2000-01-01");
		sv1.setGioiTinh("Nam");
		sv1.setDiemtb("10");
		return sv1;
	}
	
	public void themSinhVienBangMaLop(String maLop, SinhVien sinhVien) {
	}

	public void capNhatSinhVien(String maLop, SinhVien sinhVien) {
	}

	public void xoaSinhVienBangMasv(String masv) {
	}

}
