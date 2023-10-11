package customerEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_details")

public class CustomerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
private int id;
private String name;
private String ifse;
private String branch;
private int aucontnumber;
public CustomerEntity(int id, String name, String ifse, String branch, int aucontnumber) {
	super();
	this.id = id;
	this.name = name;
	this.ifse = ifse;
	this.branch = branch;
	this.aucontnumber = aucontnumber;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getIfse() {
	return ifse;
}
public void setIfse(String ifse) {
	this.ifse = ifse;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public int getAucontnumber() {
	return aucontnumber;
}
public void setAucontnumber(int aucontnumber) {
	this.aucontnumber = aucontnumber;
}

}
