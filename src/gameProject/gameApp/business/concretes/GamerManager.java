package gameProject.gameApp.business.concretes;

import gameProject.gameApp.business.abstracts.GamerService;
import gameProject.gameApp.core.abstracts.IdValidator;
import gameProject.gameApp.dataAccess.abstracts.GamerDao;
import gameProject.gameApp.entities.concretes.Gamer;

public class GamerManager implements GamerService {
	private GamerDao gamerDao;
	private IdValidator validator;
	
	
	public GamerManager(GamerDao gamerDao, IdValidator validator) {
		this.gamerDao = gamerDao;
		this.validator = validator;
	}

	@Override
	public void add(Gamer gamer) {
		if(validator.validate(gamer.getIdentityNumber(), gamer.getFirstName(), gamer.getLastName(), gamer.getYearOfBirth())) {
			gamerDao.add(gamer);
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		gamerDao.delete(gamer);
		
	}

	@Override
	public void update(Gamer gamer) {
		gamerDao.update(gamer);
		
	}

}
