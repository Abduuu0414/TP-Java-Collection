package presentation;

import ma.projet.Profile;
import ma.projet.Utilisateur;
import ma.projet.impl.UtilisateurImpl;
import ma.projet.impl.ProfilesImpl;


public class Test {
	public static void main(String[] args) {
        ProfilesImpl profileDao = new ProfilesImpl();
        UtilisateurImpl utilisateurDao = new UtilisateurImpl();

        Profile cp = new Profile("CP", "Chef de projet");
        Profile mn = new Profile("MN", "Manager");
        Profile dp = new Profile("DP", "Directeur de projet");
        Profile drh = new Profile("DRH", "Directeur des ressources humaines");
        Profile dg = new Profile("DG", "Directeur general");

        profileDao.create(cp);
        profileDao.create(mn);
        profileDao.create(dp);
        profileDao.create(drh);
        profileDao.create(dg);

        utilisateurDao.create(new Utilisateur("Ali", "Ahmed", "ali@mail.com", "0123456789", 5000, "ali123", "pass", "IT", mn));
        utilisateurDao.create(new Utilisateur("Sara", "Omar", "sara@mail.com", "0987654321", 6000, "sara123", "pass", "RH", drh));
        utilisateurDao.create(new Utilisateur("John", "Doe", "john@mail.com", "0123987654", 7000, "john123", "pass", "Management", mn));

        System.out.println("Liste des managers :");
        for (Utilisateur u : utilisateurDao.getAll()) {
        	if(u.getProfile().equals(mn))
        		u.afficher();
        }
    }
}
