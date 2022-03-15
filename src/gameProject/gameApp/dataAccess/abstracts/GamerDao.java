package gameProject.gameApp.dataAccess.abstracts;

import gameProject.gameApp.entities.concretes.Gamer;

public interface GamerDao {
	void add(Gamer gamer);
	void delete(Gamer gamer);
	void update(Gamer gamer);

}
