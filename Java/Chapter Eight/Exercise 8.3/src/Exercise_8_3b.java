
public class Exercise_8_3b {

	public static void main(String[] args) {
		// Students' answers
		char[][] answers = 
		{
			{ 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, 
			{ 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'}, 
			{ 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'}, 
			{ 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'}, 
			{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, 
			{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, 
			{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, 
			{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
		};
				
		// Key to the questions
		char[] keys = {'D','B','D','C','C','D','A','E','A','D'};
		
		byte[] ids = new byte[8];
		byte[] scores = new byte[8];
		
		for(byte i = 0; i < ids.length;i++) {
			ids[i] = i;
			scores[i] = findScore(answers, keys, i);
		}
		
		// Bubble Sort Algorithm
		for(byte index = (byte) (ids.length-1);index >0;index--) {
			for(int i = 0; i < index;i++) {
				if(scores[i]>scores[i+1]) {
					byte tempScore = scores[i+1];
					scores[i+1] = scores[i];
					scores[i] = tempScore;
					
					byte tempId = ids[i+1];
					ids[i+1] = ids[i];
					ids[i] = tempId;
				}
			}
		}
		
		for(int i = 0; i < scores.length;i++)
			System.out.println("Student Id : " + ids[i] 
			+ "\tStduent Score : " + scores[i]);

	}
	
	public static byte findScore(char[][] answers, char[] keys, byte studentId) {
		
		if(studentId < 0 || studentId >8) 
			return Byte.MIN_VALUE;
		
		// Grade one student
		byte correntCount = 0;
		
		for(int j = 0; j < answers[studentId].length;j++)
			if(answers[studentId][j]==keys[j])
				correntCount++;
		
		return correntCount;
	}

}
