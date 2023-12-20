package com.example.postgresdemo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

@Entity
@Table(name = "BoDe")
@Service
public class BoDe implements Serializable {

	@Id

	@Column(columnDefinition = "varchar(255)")
	String idBoDe;

	@Column(columnDefinition = "varchar(255)")
	String idDe;

	@Column(columnDefinition = "integer default 0") // Giả sử số lượt thi mặc định là 0
	private Integer soLuotThi;

	public BoDe(String idDe) {
		this.idDe = idDe;
	}

	@Column(columnDefinition = "varchar(255)")
	String tenDe;

	@ManyToOne
	@JoinColumn(name = "idMon")
	MonHoc monHoc;

	public BoDe() {
		this.soLuotThi = 0;
	}

	public BoDe(String idBoDe, String tenDe, MonHoc monHoc) {
		this.idBoDe = idBoDe;
		this.tenDe = tenDe;
		this.monHoc = monHoc;

	}

	public BoDe(String idBoDe, String idDe, Integer soLuotThi, String tenDe, MonHoc monHoc) {
		this.idBoDe = idBoDe;
		this.idDe = idDe;
		this.soLuotThi = soLuotThi;
		this.tenDe = tenDe;
		this.monHoc = monHoc;
	}

	public Integer getSoLuotThi() {
		return soLuotThi;
	}

	public void setSoLuotThi(Integer soLuotThi) {
		this.soLuotThi = soLuotThi;
	}

	public String getIdBoDe() {
		return idBoDe;
	}

	public void setIdBoDe(String idBoDe) {
		this.idBoDe = idBoDe;
	}

	public String getTenDe() {
		return tenDe;
	}

	public void setTenDe(String tenDe) {
		this.tenDe = tenDe;
	}

	public MonHoc getMonHoc() {
		return monHoc;
	}

	public void setMonHoc(MonHoc monHoc) {
		this.monHoc = monHoc;
	}

	public String getIdDe() {
		return idDe;
	}

	public void setIdDe(String idDe) {
		this.idDe = idDe;
	}

}
