package gameProject.gameApp.business.abstracts;

import gameProject.gameApp.entities.concretes.Gamer;

public interface GamerService {
	void add(Gamer gamer);
	void delete(Gamer gamer);
	void update(Gamer gamer);

}
