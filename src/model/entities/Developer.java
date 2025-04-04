package model.entities;

/**
 * Represents a Developer employee.
 * Inherits from the abstract Employee class and adds specific behavior for certified developers.
 */
public class Developer extends Employee{

	// Indicates whether the developer holds a certification
	private boolean certificate;

	public Developer(String name, Double baseSalary, boolean certificate) {
		super(name, baseSalary);
		this.certificate = certificate;
	}

	public boolean isCertificate() {
		return certificate;
	}

	public void setCertificate(boolean certificate) {
		this.certificate = certificate;
	}

	/**
     * Calculates the developer's total salary.
     * Certified developers receive a bonus of $1000.
     */
	@Override
	double calculateSalary() {
		if(certificate == false){
			return getBaseSalary();
		}
		return getBaseSalary() + 1000;
	}

}
