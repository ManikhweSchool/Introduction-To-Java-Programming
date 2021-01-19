
public class Exercise_1_11b {

	public static void main(String[] args) {
		
		// We know there are 60 seconds in a minute.
		// We also know that there are 60 minutes in an hour.
		
		// Now we need find the number of seconds in an hour.
		// 1 hour = 60 seconds * 60
		// 1 hour = 3600 seconds
		
		// To find the number of seconds in one day we do the following.
		// 1 hour = 3600 seconds
		// 24 hours = ?
		// Let call the question mark x, so we have.
		// 1 hour = 3600 seconds
		// 24 hours = x seconds
		// We cross multiply to find x.
		// 1*x = 3600*24 -> x = 86400
		// Therefore 1 day has 86400 seconds.
		
		// Now we need to find the number of seconds in 1 year.
		// We know 1 year has 365 days.
		// 1 day = 86400 seconds
		// 365 days = ? seconds
		// Let call the question mark x.
		// 1 day = 86400 seconds
		// 365 days = x seconds
		// We cross multiple to find x and get the following.
		// 1*x = 86400*365
		// x = 31536000 seconds
		// So, there are 31536000 seconds in one year.
		
		// Now we must get the number of people died each year.
		// Number of died people =  31536000/13 = 2425846
		// Now we must get the number of people born each year.
		// Number of born people =  31536000/7 = 4505142
		// Lastly we find the number of immigrant each year.
		// Number of migrating people =  31536000/45 = 700800
		
		// First year population = Current population + number of born people + number of immigrants - number of died people.
		// First year population = 312032486 + 4505142 + 700800 - 2425846 = 314812582
		// Second year population = First year population + number of born people + number of immigrants - number of died people.
		// Third year population = Second year population + number of born people + number of immigrants - number of died people.
		
		
		System.out.println("First year population is : " + (312032486 + 4505142 + 700800 - 2425846));
		System.out.println("Second year population is : " + (314812582 + 4505142 + 700800 - 2425846));
		System.out.println("Third year population is : " + (317592678 + 4505142 + 700800 - 2425846));
		System.out.println("Forth year population is : " + (320372774 + 4505142 + 700800 - 2425846));
		System.out.println("Fifth year population is : " + (323152870 + 4505142 + 700800 - 2425846));
		
		
		
	}

}
