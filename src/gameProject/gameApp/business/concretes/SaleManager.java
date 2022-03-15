package gameProject.gameApp.business.concretes;

import gameProject.gameApp.business.abstracts.SaleService;
import gameProject.gameApp.dataAccess.abstracts.SaleDao;
import gameProject.gameApp.entities.concretes.Campaign;
import gameProject.gameApp.entities.concretes.Game;
import gameProject.gameApp.entities.concretes.Gamer;

public class SaleManager implements SaleService{
	SaleDao saleDao;
	
	public SaleManager(SaleDao saleDao) {
		this.saleDao = saleDao;
	}

	@Override
	public void sell(Gamer gamer, Game game, Campaign campaign) {
		saleDao.sell(gamer, game, campaign);
		
	}

}
