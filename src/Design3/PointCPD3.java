package Design3;

public class PointCPD3 {
 //Store Cartesian coordinates only. 
 // How Cartesian coordinates are computed? - Simply returned
 // How Polar Coordinates are computed? - COmputed on demand, but not stored.
	
	//Get coordinates x and y ->Getters for x and y
	//A method which converts x and y to Polar coordinates.
	//so we don't need class variables for polar coordinates.
	// we dont need the type variable as well.
	
	private double x;
	private double y;
	private char decision;
	
	/**
	 * Constructor
	 */
	
	public PointCPD3(char decision, double x,double y) {
		if(decision != 'Y' && decision != 'N')
		      throw new IllegalArgumentException();
		this.setX(x);
		this.setY(y);
		this.decision=decision;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	
	/**
	 * Method to compute the Polar coordinates from Cartesian coordinates.
	 * @return 
	 */
	
	public String convertStorageToPolar() {
		String result;
		double rho = Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
		double theta = Math.toDegrees(Math.atan2(getY(), getX()));
		
		result ="Polar Coodinates: ( "+rho+" , "+theta+")";
		return result;
	}
	
	
	  public String toString()
	  {
	    return  (decision == 'Y') 
	       ? convertStorageToPolar()
	       : "Cartesian  (" + getX() + "," + getY() + ")" + "\n";
	  }
	
}
