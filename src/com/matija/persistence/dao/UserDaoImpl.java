package com.matija.persistence.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.matija.persistence.model.User;
import com.matija.persistence.model.UserRole;
import com.matija.web.dto.UserRegistrationDTO;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@SuppressWarnings("unchecked")
	public User findByUserName(String username) {

		List<User> users = new ArrayList<User>();

		users = sessionFactory.getCurrentSession().createQuery("from User where username=?").setParameter(0, username)
				.list();

		if (users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}

	}

	@SuppressWarnings("unchecked")
	public User findByEmail(String email) {

		List<User> users = new ArrayList<User>();

		users = sessionFactory.getCurrentSession().createQuery("from User where email=?").setParameter(0, email).list();

		if (users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}
	}

	@Override
	public User registerNewUserAccount(UserRegistrationDTO userDTO) {

		// Umetnuti usera u bazu
		// Kreiranje user varijable
		User user = new User(userDTO.getUsername(), passwordEncoder.encode(userDTO.getPassword()), userDTO.getEmail(),
				true);
		// dodavanje ROLA u user varijablu
		UserRole userRole = new UserRole(user, "ROLE_USER");
		user.addUserRole(userRole);

		sessionFactory.getCurrentSession().save(user);
		sessionFactory.getCurrentSession().save(userRole);

		return user;

	}

	@SuppressWarnings("unchecked")
	public List<User> getPaginatedUsers(int offset, int usersPerPage) {
		List<User> users = new ArrayList<User>();

		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
		criteria.setFirstResult(offset);
		criteria.setMaxResults(usersPerPage);
		users = criteria.list();
		
		return users;
		
	}

	@Override
	@Transactional
	public Long userTotalCount() {
		Criteria criteriaCount = sessionFactory.getCurrentSession().createCriteria(User.class);
		criteriaCount.setProjection(Projections.rowCount());
		Long count = (Long) criteriaCount.uniqueResult();
		return count;
	}
	
	

}
