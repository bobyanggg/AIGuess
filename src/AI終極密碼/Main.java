package AI終極密碼;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Guessgame game = new Guessgame();
		List<Player> players = createPlayers();
		System.out.println("順序為 : \n");
		for ( Player p : players )
			System.out.print(p.getName());
		System.out.println();
		
		game.createAnswer();
		int turn = 0;
		
		do  
		{
			Player player = players.get(turn);
			System.out.println(game.getMin() + "~" + game.getMax());
			int guess = player.guess(game.getMin(), game.getMax());
			System.out.println(player.getName() + " 猜了" + guess);
			boolean win = game.guess(guess);
			if (win)
				System.out.println(player.getName() + "猜對了 !");
			turn = turn + 1 >= players.size() ? 0 : turn + 1;
			delay();
		}while(!game.isOver());

	}
		
	private static List<Player> createPlayers(){
		List<Player> players = new ArrayList<Player>();
		int human = Input.nextInt("輸入幾位現實玩家：");
		int ai = Input.nextInt("電腦玩家: ");
		for ( int i = 0 ; i < human; i ++ )
			players.add(new Human());
		for ( int i = 0 ; i < ai; i ++ )
			players.add(new AI());
		Collections.shuffle(players);
		
		return players;
	
	}
	private static void delay(){
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		
		    
		    
		

	

}
