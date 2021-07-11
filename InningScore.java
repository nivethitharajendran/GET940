import java.lang.Math;
public class InningScore {
	
    public static void main(String args[]) {
    	System.out.println("CSK ku Whistle Podu!");
    	calculateScore cs=new calculateScore();
    	cs.play();
    	
    }
}

class calculateScore
{
	int run;
	int Total=0,avgScore=0,avgStrikeRate=0;
	int totZero=0,totOne=0,totTwo=0,totThree=0,totFour=0,totSix=0;
	
	void play() {
		for(int j=0;j<5;j++) {
			
			int zero=0,one=0,two=0,three=0,four=0,six=0;
			int min=0;
			int max=6;
			int totRuns=0;
			
		
		for (int i=0;i<30;i++) {
			int rand= (int)Math.floor(Math.random()*(max-min+1)+min);
			//System.out.println(rand);
			
			totRuns= totRuns+  rand;
			if(rand==0)
			{
				zero++;
			   
			  // System.out.println(" Zero count: " +totZero);
			}   
			if(rand==1)
			{
				one++;
			
			}	
			if(rand==2)
			{	
				two++;
				
			}	
			if(rand==3)
			{
				three++;
				
			}	
			if(rand==4)
			{	
				four++;
				
			}	
			if(rand==5) {
				four++;
				one++;
			}
			if(rand==6)
			{	
				six++;
				
			}
			
			
	}
		
	System.out.println("Total Runs scored: "+ totRuns + " hitting " + six+" sixes," +four+ " boundaries,"+three+" 3's,"+ two+" 2's,"+one+" 1's," +zero+" 0's!!");
	totZero+=zero;
	totOne+=one;
	totTwo+=two;
	totThree+=three;
	totFour+=four;
	totSix+=six;
	
	int strikeRate=(totRuns/30)*100;
	System.out.println("Strike rate : " + strikeRate);
	 Total= Total + totRuns;
	 avgScore=Total/5;
	 avgStrikeRate=strikeRate/5;
	 
	}
		System.out.println("Toatl Runs Scored in the last 5 innings: " +Total);
		System.out.println("Avg Score of last 5 innings: " +avgScore);
		System.out.println("Zero count: " +totZero);
		System.out.println("One count: " +totOne);
		System.out.println("Two count: " +totTwo);
		System.out.println("Three count: " +totThree);
		System.out.println("Four count: " +totFour);
		System.out.println("Six count: " +totSix);
		
		
		
		
	}
	
}
