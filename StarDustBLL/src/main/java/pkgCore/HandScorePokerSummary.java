package pkgCore;

import java.io.Serializable;
import java.util.ArrayList;

public class HandScorePokerSummary implements Serializable {

	private ArrayList<HandPoker> BestMadeHands;
	private ArrayList<HandPoker> BestPossibleHands;
	private Player player; 
	
	public HandScorePokerSummary(ArrayList<HandPoker> bestMadeHands, ArrayList<HandPoker> bestPossibleHands, Player p) {
		super();
		BestMadeHands = bestMadeHands;
		BestPossibleHands = bestPossibleHands;		
		this.player = p;
	}
	public ArrayList<HandPoker> getBestMadeHands() {
		return BestMadeHands;
	}
	public ArrayList<HandPoker> getBestPossibleHands() {
		return BestPossibleHands;
	}
	public Player getPlayer() {
		return player;
	}	
	
}
