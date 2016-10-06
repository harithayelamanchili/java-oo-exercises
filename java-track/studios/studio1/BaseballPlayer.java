package studio1;

public class BaseballPlayer
{
	
	private String name;
	private int number;
	private String direction;
	private int hits;
	private int games;
	private int runs;
	private int rbi;
	
public BaseballPlayer(String name, int number, String direction, int hits, int games, int runs, int rbi) 
{

	this.name = name;
	this.number = number;
	this.direction = direction;
	this.hits = hits;
	this.games = games;
	this.runs = runs;
	this.rbi = rbi;
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public String getDirection() {
	return direction;
}

public void setDirection(String direction) {
	this.direction = direction;
}

public int getHits() {
	return hits;
}

public void setHits(int hits) {
	this.hits = hits;
}

public int getGames() {
	return games;
}

public void setGames(int games) {
	this.games = games;
}

public int getRuns() {
	return runs;
}

public void setRuns(int runs) {
	this.runs = runs;
}

public int getRbi() {
	return rbi;
}

public void setRbi(int rbi) {
	this.rbi = rbi;
}

public void game(int runs, int hit ,int rbi)
{
	this.games++;
	this.runs = this.runs+runs;
	this.hits = this.hits+hits;
	this.rbi = this.rbi+rbi;
	
}

public String toString() {
	return "BaseballPlayer [name=" + name + ", number=" + number + ", direction=" + direction + ", hits=" + hits
			+ ", games=" + games + ", runs=" + runs + ", rbi=" + rbi + "]";
}

public static void main(String args[])
{
	BaseballPlayer b = new BaseballPlayer("Ron" , 131, "right" , 21 , 51, 1001, 3 );
	System.out.println(b);
	b.game(52,6,2);
	System.out.println("After the new game the player details are : ");
	System.out.println(b);
	
	
	
	
}
}


