package prob04;

public class Depart extends Employee {

	private String buser;
	
	public Depart(String name, int salary, String buser) {
		super.setName(name);
		super.setSalary(salary);
		this.buser = buser;
	}

	@Override
	public void getInformation() {
		
		System.out.println("이름 : " + getName() + "   연봉: " + getSalary() + "   부서 : " + buser);
	}
	
	
}
