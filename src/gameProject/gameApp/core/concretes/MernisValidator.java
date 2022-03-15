package gameProject.gameApp.core.concretes;

import gameProject.gameApp.core.abstracts.IdValidator;

public class MernisValidator implements IdValidator{

	@Override
	public boolean validate(String tc, String firstName, String lastName, int year) {
		System.out.println(tc+" Tc kimlik numaralı birey mevcuttur.");
		return true;
	}

}
