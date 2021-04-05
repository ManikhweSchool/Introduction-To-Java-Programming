
public class IntersectionPoint {
	// y -y1 = m(x-x1) => y-m*x = y1-m*x1
	private LinearEquation linearEquation;
	
	public IntersectionPoint(double x1,double y1,
	double x2,double y2,double x3,double y3,
	double x4, double y4) {
		
		double gradient1 = (y2-y1)/(x2-x1);
		double gradient2 = (y4-y3)/(x4-x3);
		
		double a = -gradient1;
		double b = 1;
		double c = -gradient2;
		double d = 1;
		double e = -gradient1*x1+y1;
		double f = -gradient2*x3+y3;
		
		linearEquation = new LinearEquation(a,b,c,d,e,f);
	}
	
	public void displayIntersectionPoint() {
		
		System.out.printf("Intersection Point (x,y) = "
		+"(%1.2f,%1.2f)", linearEquation.getX(),
		linearEquation.getY());
	}
}
