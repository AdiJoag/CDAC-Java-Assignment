
public class Team {
	private int tid;
	private String tname;
	Player[] plist;
	private String Captain;
	private int size;
	public Team() {
		super();
	}
	public Team(int tid, String tname, Player[] plist, String captain, int size) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.plist = plist;
		Captain = captain;
		this.size =size;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Player[] getPlist() {
		return plist;
	}
	public void setPlist(Player[] plist) {
		this.plist = plist;
	}
	public String getCaptain() {
		return Captain;
	}
	public void setCaptain(String captain) {
		Captain = captain;
	}
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Team [tid=" + tid + ", tname=" + tname + ", captain=" + captain + ", plist=" + Arrays.toString(plist)
				+ "]";
	}
     
	
}
