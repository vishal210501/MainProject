package labsession;

class Joob {
	private int jid;
	private String jprofile;
	private JD jnd;

	public void setJid(int jid) {
		this.jid = jid;
	}

	public void setJprofile(String jprofile) {
		this.jprofile = jprofile;
	}

	public void setJD(JD jnd) {
		this.jnd = jnd;
	}

	public int getJid() {
		return jid;
	}

	public String getJprofile() {
		return jprofile;
	}

	public JD getJD() {
		return jnd;
	}

}

class JD {

	private int dy;
	private int mt;
	private int yr;

	public void setDy(int dy) {
		this.dy = dy;
	}

	public void setMt(int mt) {
		this.mt = mt;
	}

	public void setYr(int yr) {
		this.yr = yr;
	}

	public int getDy() {
		return dy;
	}

	public int getMt() {
		return mt;
	}

	public int getYr() {
		return yr;
	}
}

public class Persongs {

	private int id;
	private String name;
	private Joob jbb;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setJoob(Joob jbb) {
		this.jbb = jbb;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Joob getJoob() {
		return jbb;
	}

	public static void main(String[] args) {

		Persongs ps = new Persongs();
		ps.setId(101);
		ps.setName("v");
		ps.setJoob(new Joob());

		Joob j = ps.getJoob();
		j.setJid(21);
		j.setJprofile("manager");
		j.setJD(new JD());

		JD j1 = j.getJD();
		j1.setDy(21);
		j1.setMt(11);
		j1.setYr(2023);

		System.out.println("id=" + ps.getId());
		System.out.println("name=" + ps.getName());

		System.out.println("jid=" + j.getJid());
		System.out.println("jprofilr=" + j.getJprofile());

		System.out.println("day=" + j1.getDy());
		System.out.println("month=" + j1.getMt());
		System.out.println("year=" + j1.getYr());

	}

}
