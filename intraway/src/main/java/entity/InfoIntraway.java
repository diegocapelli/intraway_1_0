package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
@Entity 
@Table(name="infoIntraway")
public class InfoIntraway implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9098662010466163497L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int InfoIntraway_id;
	@Column(name="code")
    private String code;
	@Column(name="description")
    private String description;
	@Column(name="list")
	private String list;
	
	

public InfoIntraway(){};
		

	public InfoIntraway(String code, String description, String list) {
		// TODO Auto-generated constructor stub
    	
    	this.code = code;
    	this.description=description;
    	this.list= list;
    	
    	
	}

	public int getInfoIntraway_id() {
		return InfoIntraway_id;
	}
	public void setInfoIntraway_id(int infoIntraway_id) {
		InfoIntraway_id = infoIntraway_id;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getList() {
		return list;
	}
	public void setList(String list) {
		this.list = list;
	}
 
}
