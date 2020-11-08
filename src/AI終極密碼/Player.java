package AI終極密碼;

public abstract class Player {
	
	private String name;
	
	public Player() {
		this.name=nameSelf();		
	}
	protected abstract String nameSelf();
	protected abstract String getPlayerType();
	protected abstract int guess(int min,int max);
	
	public String getName() {
		return "(" + getPlayerType() + ":" + name + ")";
	}
	

}
