package ma.projet.impl;

import java.util.ArrayList;
import java.util.List;

import ma.projet.Profile;
import ma.projet.dao.IDao;

public class ProfilesImpl implements IDao<Profile> {
	private List<Profile> profiles = new ArrayList<>();

	@Override
	public boolean create(Profile p) {
		return profiles.add(p);
	}

	@Override
	public boolean update(Profile p) {
		for (Profile op : profiles) {
			if (op.getId() == p.getId()) {
				op = p;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean delete(Profile p) {
		return profiles.remove(p);
	}

	@Override
	public Profile getById(int id) {
		for (Profile p : profiles) {
			if (p.getId() == id)
				return p;
		}
		return null;
	}

	@Override
	public List<Profile> getAll() {
		return profiles;
	}
}
