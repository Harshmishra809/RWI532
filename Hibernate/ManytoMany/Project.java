package ManyToMany;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity


public class  Project {
	
	@Id
	private  int pid;
	@Column(name="project_name")
	private String projectName;
	
	@ManyToMany 
	private List<Emp> employee;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", projectName=" + projectName + ", employee=" + employee + "]";
	}
	public List<Emp> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Emp> employee) {
		this.employee = employee;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
