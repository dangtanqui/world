package com.tanqui.services;

import java.util.ArrayList;
import java.util.List;

import com.tanqui.models.Lop;
import com.tanqui.models.SinhVien;

public class LopService {

	public List<Lop> layTatCaLop() {
		List<Lop> lops = new ArrayList<Lop>();
		Lop lop1 = new Lop();
		lop1.setMaLop("01");
		lop1.setTenLop("02");
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
		lop1.setDanhSachSinhVien(sinhViens1);
		lops.add(lop1);
		Lop lop2 = new Lop();
		lop2.setMaLop("01");
		lop2.setTenLop("02");
		List<SinhVien> sinhViens2 = new ArrayList<SinhVien>();
		SinhVien sv4 = new SinhVien();
		sv4.setMasv("D01");
		sv4.setHoTen("Nguyễn Văn A");
		sv4.setNgaySinh("2000-01-01");
		sv4.setGioiTinh("Nam");
		sv4.setDiemtb("10");
		sinhViens2.add(sv1);
		SinhVien sv5 = new SinhVien();
		sv5.setMasv("D01");
		sv5.setHoTen("Nguyễn Văn A");
		sv5.setNgaySinh("2000-01-01");
		sv5.setGioiTinh("Nam");
		sv5.setDiemtb("10");
		sinhViens2.add(sv2);
		SinhVien sv6 = new SinhVien();
		sv6.setMasv("D01");
		sv6.setHoTen("Nguyễn Văn A");
		sv6.setNgaySinh("2000-01-01");
		sv6.setGioiTinh("Nam");
		sv6.setDiemtb("10");
		sinhViens2.add(sv3);
		lop2.setDanhSachSinhVien(sinhViens2);
		lops.add(lop2);
		return lops;
	}

	public Lop layLopBangMaLop(String maLop) {
		Lop lop1 = new Lop();
		lop1.setMaLop("01");
		lop1.setTenLop("02");
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
		lop1.setDanhSachSinhVien(sinhViens1);
		return lop1;
	}
	
	public void themLop(Lop lop) {
	}
	
	public void capNhatTenLop(String maLop, Lop lop) {
	}
	
	public void xoaLopBangMaLop(String maLop) {
	}
	
}
