package labsession;
// by constructor
class Job {

	int jobid;
	String profile;
	JoiningDate jgd;

	public Job(int jobid, String profile, JoiningDate jgd) {

		this.jobid = jobid;
		this.profile = profile;
		this.jgd = jgd;
	}

	public String toString() {
		return jobid + " " + profile + " " + jgd;
	}
}

class JoiningDate {

	int day;
	int month;
	int year;

	public JoiningDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String toString() {
		return day + " " + month + " " + year;
	}
}

public class PersonC {

	int id;
	String name;
	Job jb;

	public PersonC(int id, String name, Job jb) {
		this.id = id;
		this.name = name;
		this.jb = jb;
	}

	public String toString() {
		return id + " " + name + " " + jb;
	}

	public static void main(String[] args) {

		PersonC p = new PersonC(101, "jd", new Job(21, "manager", new JoiningDate(21, 11, 2023)));

		System.out.println(p);

	}

}
