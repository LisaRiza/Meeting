
public class Tes {

	public static void main(String[] args) {
		int[][] intervals = {{0,30}, {15,20}, {5,10}};
		int[][] intervalsa = {{0,15}, {10,30}, {5,10}};
		int[][] intervalsb = {{0,10}, {10,30}, {30,40}};
		int[][] intervalsc = {{5,10}, {1,3}};

		int[][] intervalsd = {{5,10}, {1,3}, {2,8}};
		
		Tes a = new Tes();
		System.out.println(a.attend(intervals));
		System.out.println(a.attend(intervalsa));
		System.out.println(a.attend(intervalsb));
		System.out.println(a.attend(intervalsc));
		System.out.println(a.attend(intervalsd));
	}
	
	public boolean attend(int[][] intervals) {
		int[] intervala = new int[2];
		int[] intervalb = new int[2];
		for(int i = 0; i < intervals.length; i++) {
			for(int j = i+1 ; j < intervals.length; j++) {
				intervala = intervals[i];
				intervalb = intervals[j];
				if((intervala[1] > intervalb[0] && intervala[0] <= intervalb[0])
						//make sure the a happens earlier than b and a ending time collides with b starting time
					|| (intervala[0] < intervalb[1] && intervala[0] >= intervalb[0]))
						//make sure the b happens earlier than a and b ending time collides with a starting time
					{
					//collide
					return false;
				} 
			}
		}
		
		return true;
		
	}
	


}


