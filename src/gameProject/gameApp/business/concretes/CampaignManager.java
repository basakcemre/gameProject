package gameProject.gameApp.business.concretes;

import gameProject.gameApp.business.abstracts.CampaignService;
import gameProject.gameApp.dataAccess.abstracts.CampaignDao;
import gameProject.gameApp.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {
	CampaignDao campaigndao;
	
	
	public CampaignManager(CampaignDao campaigndao) {
		
		this.campaigndao = campaigndao;
	}

	@Override
	public void add(Campaign campaign) {
		campaigndao.add(campaign);
		
	}

	@Override
	public void delete(Campaign campaign) {
		campaigndao.delete(campaign);
		
	}

	@Override
	public void update(Campaign campaign) {
		campaigndao.update(campaign);
		
	}
	
}
