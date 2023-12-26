/**
 * 
 */

/**
 * @author PaulA
 *
 */
public class Student { // class declaration
// private instance variables for the class
	private String fname;
	private String lname;
	private int sNum;
	private String country;
	
	public Student()// default constructor signature
	{
		
	}
	
	public Student (String fn, String ln, int num, String countryOfResidence)// second constructor with a different signature
	{
		fname=fn;
		lname =ln;
		sNum = num;
		country = countryOfResidence;
	}
	
	public Student (String fname, int sNum)
	{
		this.fname = fname;
		this.sNum = sNum;
	}

	/**
	 * @return the fname
	 */
	public String getFname() { // getters and setters
		return fname;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 * @return the sNum
	 */
	public int getsNum() {
		return sNum;
	}

	/**
	 * @param sNum the sNum to set
	 */
	public void setsNum(int sNum) {//begin of setsNum
		this.sNum = sNum;  // body
	}// end of setsNum


	public String getsCountry() {
		return country;

	}
	public void setsCountry(String country) {
		this.country = country;

	}


}// end of class
