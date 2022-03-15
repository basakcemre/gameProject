package gameProject.gameApp.dataAccess.concretes;

import gameProject.gameApp.dataAccess.abstracts.CampaignDao;
import gameProject.gameApp.entities.concretes.Campaign;

public class JdbcCampaignDao implements CampaignDao{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+" eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+" silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+" güncellendi");
		
	}
	

}
