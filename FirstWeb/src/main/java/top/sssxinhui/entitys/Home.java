package top.sssxinhui.entitys;

public class Home {
	private int id;
	private String name;
	private int isbook;
	private String addess;
	private String deses;
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
	public int getIsbook() {
		return isbook;
	}
	public void setIsbook(int isbook) {
		this.isbook = isbook;
	}
	public String getAddess() {
		return addess;
	}
	public void setAddess(String addess) {
		this.addess = addess;
	}
	public String getDeses() {
		return deses;
	}
	public void setDeses(String deses) {
		this.deses = deses;
	}
	@Override
	public String toString() {
		return "Home [id=" + id + ", name=" + name + ", isbook=" + isbook + ", addess=" + addess + ", deses=" + deses
				+ "]";
	}
	
	
}
