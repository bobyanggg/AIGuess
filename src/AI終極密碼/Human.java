package AI終極密碼;

public class Human extends Player {
	
	@Override
	protected String nameSelf() {
		return Input.next("請輸入名稱");
	}

	@Override
	protected String getPlayerType() {
		return "玩家";
	}

	@Override
	protected int guess(int min,int max ) {
		System.out.println("請輸入數字: ");
		return Input.nextInt(min,max);
	}
	

}
