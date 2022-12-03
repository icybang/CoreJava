package dao;

import static utils.HibernateUtils.getFactory;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.User;

public class UserDaoImpl implements UserDao {

	@Override
	public User authenticateUser(String email, String pwd) throws SQLException {
		User user = null;
		String jpql = "select u from User u where u.email=:em and u.password=:pass";
		// get session from SF
		Session session = getFactory().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			user = session.createQuery(jpql, User.class).setParameter("em", email).setParameter("pass", pwd)
					.getSingleResult();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
		}
		return user;
	}

	@Override
	public String registerUser(User u) throws SQLException {
		// get session from SF
		Session session = getFactory().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		System.out.println(u);
		try {
			session.persist(u);
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			return "register";
		}
		return "login";
	}

}
