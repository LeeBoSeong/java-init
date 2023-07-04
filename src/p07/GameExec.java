package p07;

public class GameExec {
	public static void runGame(Game game) {
		game.start();
		game.play();
		game.start();
		System.out.println(game.price);
	}
	public static void main(String[] args) {
			
		StarCraft starGame = new StarCraft();
		starGame.name = "스타크래프트";
		starGame.genre = "전략";
		starGame.price = 25000;
		starGame.tribe = "테란";
		runGame(starGame);
		
		MapleStory mapleGame = new MapleStory();
		mapleGame.name = "메이플 스토리";
		mapleGame.genre = "RPG";
		mapleGame.price = 0;
		mapleGame.job = "마법사";
		runGame(mapleGame);
	}
}
