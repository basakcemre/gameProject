package gameProject.gameApp.dataAccess.abstracts;

import gameProject.gameApp.entities.concretes.Campaign;

public interface CampaignDao {
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);
	

}
