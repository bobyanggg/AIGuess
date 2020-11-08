package AI終極密碼;

import java.util.Random;

public class AI extends Player {
	
	private static int amount = 0;
	public AI() {
		amount ++;
	}
	@Override
	protected String nameSelf() {
		return "AI " + String.valueOf(amount);
	}

	@Override
	protected String getPlayerType() {
		// TODO Auto-generated method stub
		return "AI";
	}

	@Override
	protected int guess(int min, int max) {
		int rand;
		do
		{
			rand = new Random().nextInt(max-min)+min;
		}while(rand < min || rand > max );  
		return rand;
	}

	public static int getAmount() {
		return amount;
	}

	public static void setAmount(int amount) {
		AI.amount = amount;
	}
	
	

}
