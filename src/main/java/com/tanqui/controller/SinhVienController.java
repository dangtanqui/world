package com.tanqui.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tanqui.models.SinhVien;
import com.tanqui.services.SinhVienService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/")
public class SinhVienController {
	private SinhVienService sinhVienService = new SinhVienService();
	
	@GetMapping("/sinhviens")
	public List<SinhVien> layTatCaSinhVien() {
		return sinhVienService.layTatCaSinhVien();
	}
	
	@GetMapping("/sinhviens/{maLop}")
	public List<SinhVien> layTatCaSinhVienBangMaLop(@PathVariable("maLop") String maLop) {
		return sinhVienService.layDanhSachSinhVienBangMaLop(maLop);
	}
	
	@GetMapping("/sinhvien/{masv}")
	public ResponseEntity<SinhVien> laySinhVienBangMasv(@PathVariable("masv") String masv) {
		SinhVien sinhVien = sinhVienService.laySinhVienBangMasv(masv);
		return new ResponseEntity<SinhVien>(sinhVien, HttpStatus.OK);
	}
	
	@PostMapping("/sinhvien/{maLop}")
	public ResponseEntity<Void> themSinhVienBangMaLop(@PathVariable("maLop") String maLop, @RequestBody SinhVien sinhVien) {
		sinhVienService.themSinhVienBangMaLop(maLop, sinhVien);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@PutMapping("/sinhvien/{masv}")
	public ResponseEntity<Void> capNhatSinhVienBangMaSinhVien(@PathVariable("masv") String masv, @RequestBody SinhVien sinhVien) {
		sinhVienService.capNhatSinhVien(masv, sinhVien);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@DeleteMapping("/sinhvien/{masv}")
	public ResponseEntity<Void> xoaSinhVienBangMasv(@PathVariable("masv") String masv) {
		sinhVienService.xoaSinhVienBangMasv(masv);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}