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

import com.tanqui.models.Lop;
import com.tanqui.services.LopService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/")
public class LopController {

	private LopService lopService = new LopService();
	
	@GetMapping("/lops")
	public List<Lop> layTatCaLop() {
		return lopService.layTatCaLop();
	}
	
	@GetMapping("/lop/{maLop}")
	public Lop layLopBangMaLop(@PathVariable("maLop") String maLop) {
		return lopService.layLopBangMaLop(maLop);
	}
	
	@PostMapping("/lop")
	public ResponseEntity<Void> themLop(@RequestBody Lop lop) {
		lopService.themLop(lop);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@PutMapping("/lop/{maLop}")
	public ResponseEntity<Void> capNhatLopBangMaLop(@PathVariable("maLop") String maLop, @RequestBody Lop lop) {
		lopService.capNhatTenLop(maLop, lop);	
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@DeleteMapping("/lop/{maLop}")
	public ResponseEntity<Void> xoaSinhVienBangMasv(@PathVariable("maLop") String maLop) {
		lopService.xoaLopBangMaLop(maLop);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
