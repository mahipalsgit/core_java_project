package BANKING;

abstract public class Account 
{
	
	private String name;
	private long mobNo;
	public Account( String name, long mobNo)
	{
		this.name = name;
		this.mobNo = mobNo;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

}
