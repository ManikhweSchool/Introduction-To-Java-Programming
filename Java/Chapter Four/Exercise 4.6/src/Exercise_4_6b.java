
public class Exercise_4_6b {

	public static void main(String[] args) {
		
		
		final double RADIUS = 40;
		
		// Generate random angle for point 1.
		double randomAngle = Math.toRadians(Math.random()*360);
		
		double x1 = RADIUS*Math.cos(randomAngle);
		double y1 = RADIUS*Math.sin(randomAngle);
		
		randomAngle = Math.toRadians(Math.random()*360);
		
		double x2 = RADIUS*Math.cos(randomAngle);
		double y2 = RADIUS*Math.sin(randomAngle);
		
		randomAngle = Math.toRadians(Math.random()*360);
		
		double x3 = RADIUS*Math.cos(randomAngle);
		double y3 = RADIUS*Math.sin(randomAngle);
		
		// Calculate the distance between point 1 and point 2.
		double distance12 = 
		Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		
		// Calculate the distance between point 1 and point 3.
		double distance13 = 
		Math.sqrt(Math.pow(x3-x1, 2)+Math.pow(y3-y1, 2));
		
		// Calculate the distance between point 3 and point 2.
		double distance32 = 
		Math.sqrt(Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2));
		
		// Cosine Formula : a^2 = b^2 + c^2 -2*b*c*cosA
		//				  : a^2-b^2-c^2 = -2*b*c*cosA
		//				  : (a^2-b^2-c^2)/(-2*b*c) = cosA
		//				  : A = arccos((a^2-b^2-c^2)/(-2*b*c))
		double point1Angle = Math.acos((Math.pow(distance32,2)
		-Math.pow(distance13,2)-Math.pow(distance12, 2))/
		(-2*distance13*distance12));
		
		// Cosine Formula : b^2 = a^2 + c^2 -2*a*c*cosB
		//				  : B = arccos((b^2-a^2-c^2)/(-2*a*c))
		double point2Angle = Math.acos((Math.pow(distance13,2)-
		Math.pow(distance32,2)-Math.pow(distance12, 2))/
		(-2*distance32*distance12));
		
		// Cosine Formula : c^2 = a^2 + b^2 -2*a*b*cosC
		//				  : C = arccos((c^2-a^2-b^2)/(-2*a*b))
		double point3Angle = Math.acos((Math.pow(distance12, 2)-
		Math.pow(distance32,2)-Math.pow(distance13,2))/
		(-2*distance32*distance13));
		
		System.out.printf("First Point Angle : %3.2f degrees\n"
		+ "Second Point Angle : %3.2f degrees\n"
		+ "Third Point Angle : %3.2f degrees", Math.toDegrees(point1Angle)
		,Math.toDegrees(point2Angle),Math.toDegrees(point3Angle));
		
	}

}
