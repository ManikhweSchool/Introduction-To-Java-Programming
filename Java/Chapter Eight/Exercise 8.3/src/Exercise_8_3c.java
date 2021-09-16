
public class Exercise_8_3c {

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
		
		byte[][] data = new byte[8][2];
		
		// Initialize Data
		for(byte index = 0; index < 8;index++) {
			data[index][0] = index;
			data[index][1] = findScore(answers, keys, index);
		}
		
		// Selection Sort Algorithm
		for(byte i = (byte) (data.length-1);i >0;i--) {
			byte maxIndex = (byte) (i-1);
			byte max = data[maxIndex][1];
			
			for(byte j = maxIndex; j >=0;j--) {
				if(max < data[j][1]) {
					max = data[j][1];
					maxIndex = j;
				}
			}
			
			if(data[i][1]<max) {
				byte tempId = i;
				byte tempScore = data[i][1];
				
				data[i][0] = maxIndex;
				data[i][1] = max;
				
				data[maxIndex][0] = tempId;
				data[maxIndex][1] = tempScore;
			}
		}
		
		for(int i = 0; i < data.length;i++)
			System.out.println("Student Id : " + data[i][0] +
			"\tStudent Score : " + data[i][1]);

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
