package com.icare.entities;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.icare.constants.EyeType;
import com.icare.converters.EyeTypeConverter;

@Entity
@Table(schema = "icare", name = "opdcasepaper")
public class OpdCasePaperBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Convert(converter = EyeTypeConverter.class)
	private EyeType eyeType;
	@ManyToOne(targetEntity = PatientBean.class)
	@JoinColumn(name = "PatientId", nullable = false)
	private PatientBean patientBean;
	private String vision;
	private String pinHole;
	private String vaNear;
	private String iot;
	private String nct;
	private String sac;
	private String sle;
	private String fundus;
	private String diagnosis;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EyeType getEyeType() {
		return eyeType;
	}

	public void setEyeType(EyeType eyeType) {
		this.eyeType = eyeType;
	}

	public PatientBean getPatientBean() {
		return patientBean;
	}

	public void setPatientBean(PatientBean patientBean) {
		this.patientBean = patientBean;
	}

	public String getVision() {
		return vision;
	}

	public void setVision(String vision) {
		this.vision = vision;
	}

	public String getPinHole() {
		return pinHole;
	}

	public void setPinHole(String pinHole) {
		this.pinHole = pinHole;
	}

	public String getVaNear() {
		return vaNear;
	}

	public void setVaNear(String vaNear) {
		this.vaNear = vaNear;
	}

	public String getIot() {
		return iot;
	}

	public void setIot(String iot) {
		this.iot = iot;
	}

	public String getNct() {
		return nct;
	}

	public void setNct(String nct) {
		this.nct = nct;
	}

	public String getSac() {
		return sac;
	}

	public void setSac(String sac) {
		this.sac = sac;
	}

	public String getSle() {
		return sle;
	}

	public void setSle(String sle) {
		this.sle = sle;
	}

	public String getFundus() {
		return fundus;
	}

	public void setFundus(String fundus) {
		this.fundus = fundus;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	@Override
	public String toString() {
		return "OpdCasePaperBean [id=" + id + ", eyeType=" + eyeType
				+ ", patientBean=" + patientBean + ", vision=" + vision
				+ ", pinHole=" + pinHole + ", vaNear=" + vaNear + ", iot="
				+ iot + ", nct=" + nct + ", sac=" + sac + ", sle=" + sle
				+ ", fundus=" + fundus + ", diagnosis=" + diagnosis + "]";
	}

}
