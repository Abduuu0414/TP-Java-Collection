package ma.projet.impl;

import java.util.ArrayList;
import java.util.List;

import ma.projet.Utilisateur;
import ma.projet.dao.IDao;

public class UtilisateurImpl implements IDao<Utilisateur>{
	
	List<Utilisateur> utilisateurs = new ArrayList<>();

	@Override
	public boolean create(Utilisateur u) {
		return utilisateurs.add(u);
	}

	@Override
	public boolean update(Utilisateur u) {
		for(Utilisateur ou : utilisateurs) {
			if(ou.getId() == u.getId()) {
				ou = u;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean delete(Utilisateur u) {
		return utilisateurs.remove(u);
	}

	@Override
	public Utilisateur getById(int id) {
		for(Utilisateur ou : utilisateurs) {
			if(ou.getId() == id) {
				return ou;
			}
		}
		return null;
	}

	@Override
	public List<Utilisateur> getAll() {
		return utilisateurs;
	}
	
	
}
