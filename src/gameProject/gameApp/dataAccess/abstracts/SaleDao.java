package gameProject.gameApp.dataAccess.abstracts;

import gameProject.gameApp.entities.concretes.Campaign;
import gameProject.gameApp.entities.concretes.Game;
import gameProject.gameApp.entities.concretes.Gamer;


public interface SaleDao {
	void sell(Gamer gamer,Game game,Campaign campaign);


}
