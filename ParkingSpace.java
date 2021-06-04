package project;

public class ParkingSpace implements Comparable {
 
	private int number;
	private int area;
	private String userName;
	private String description;
	
	public ParkingSpace(){
		
	}
    public ParkingSpace(int number, int area, String userName, String description){
		this.setNumber(number);
		this.setArea(area);
		this.setUserName(userName);
		this.setDescription(description);
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int compareNumbers(ParkingSpace ps) {
		// TODO Auto-generated method stub
		if(ps.getNumber()>this.getNumber()){
			return -1;
		}else if(this.getNumber()>ps.getNumber()){
			return 1;
		}else{
		return 0;
		}
	}
	public int compareUserNames(ParkingSpace ps) {
		// TODO Auto-generated method stub
		if(ps.getUserName().compareTo(this.getUserName())<0){
			return -1;
		}
		else if(ps.getUserName().compareTo(this.getUserName())>0){
			return 1;
		}
		else{
			return 0;
		}
	
	}
	public int compareAreas(ParkingSpace ps) {
		// TODO Auto-generated method stub
		if(ps.getArea()>this.getArea()){
			return -1;
		}else if(this.getArea()>ps.getArea()){
			return 1;
		}else{
		return 0;
		}
	}
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
    
}
