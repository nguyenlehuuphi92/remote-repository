package chap02_OOP;

public class Student {

	public String name;
	public String code;
	public int birthday;

	// Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getBirthday() {
		return birthday;
	}

	// Getter
	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	// Showd Student Info

	public void showInfo() {
		System.out.println("Student Info: ");
		System.out.println("- Name \t\t:" + this.name);
		System.out.println("- Code \t\t:" + this.code);
		System.out.println("- Birthday \t\t:" + this.birthday);
	}

}
