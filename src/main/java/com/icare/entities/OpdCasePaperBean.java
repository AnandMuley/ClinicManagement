package com.icare.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "icare", name = "opdcasepaper")
public class OpdCasePaperBean {

	@Id
	private Integer id;

}
