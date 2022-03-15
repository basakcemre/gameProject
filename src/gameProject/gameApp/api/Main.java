package gameProject.gameApp.api;

import gameProject.gameApp.business.abstracts.GamerService;
import gameProject.gameApp.business.abstracts.SaleService;
import gameProject.gameApp.business.concretes.GamerManager;
import gameProject.gameApp.business.concretes.SaleManager;
import gameProject.gameApp.core.concretes.MernisValidator;
import gameProject.gameApp.dataAccess.concretes.JdbcGamerDao;
import gameProject.gameApp.dataAccess.concretes.JdbcSaleDao;
import gameProject.gameApp.entities.concretes.Campaign;
import gameProject.gameApp.entities.concretes.Game;
import gameProject.gameApp.entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer(1,"1234567890","Başak","Karaca",1999);
		Game game1 = new Game(1,"Counter");
		Campaign campaign1 = new Campaign(1,"Sevgililer günü kampanyası");
		GamerService gamerService = new GamerManager(new JdbcGamerDao(),new MernisValidator());
		gamerService.add(gamer1);
		SaleService saleService = new SaleManager(new JdbcSaleDao());
		saleService.sell(gamer1,game1,campaign1);

	}

}
