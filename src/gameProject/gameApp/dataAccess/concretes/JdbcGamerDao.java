package gameProject.gameApp.dataAccess.concretes;

import gameProject.gameApp.dataAccess.abstracts.GamerDao;
import gameProject.gameApp.entities.concretes.Gamer;

public class JdbcGamerDao implements GamerDao {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu kaydı yapıldı: "+gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu kaydı silindi: "+gamer.getFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu kaydı güncellendi: "+gamer.getFirstName());
	}

}
