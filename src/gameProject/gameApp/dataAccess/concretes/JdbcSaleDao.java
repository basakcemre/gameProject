package gameProject.gameApp.dataAccess.concretes;

import gameProject.gameApp.dataAccess.abstracts.SaleDao;
import gameProject.gameApp.entities.concretes.Campaign;
import gameProject.gameApp.entities.concretes.Game;
import gameProject.gameApp.entities.concretes.Gamer;


public class JdbcSaleDao implements SaleDao {

	@Override
	public void sell(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getId()+ "id'li müşteriye "+game.getName()+" oyun satılacaktır. Kampanya: "+campaign.getName());
		
	}

	
}
