package com.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.model.CategoryDemo;

@Repository("categoryDemoDAO")
public class CategoryDemoDAOImpl implements CategoryDemoDAO {

	@Autowired
	SessionFactory sessionFactory;

	public CategoryDemoDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(CategoryDemo categoryDemo) {
		sessionFactory.getCurrentSession().saveOrUpdate(categoryDemo);

	}

	@Transactional
	public void delete(String id) {
		CategoryDemo categoryDemoToDelete = new CategoryDemo();
		categoryDemoToDelete.setDescription(id);
		sessionFactory.getCurrentSession().delete(categoryDemoToDelete);

	}

	@Transactional
	public CategoryDemo get(String id) {
		String hql = "from CategoryDemo where id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("id", id);
		List<CategoryDemo> getCat = query.getResultList();

		if (getCat != null && !getCat.isEmpty()) {
			return getCat.get(0);
		}
		return null;
	}

	@Transactional
	public List<CategoryDemo> list() {
		String hql = "from CategoryDemo";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<CategoryDemo> listOfCat = query.getResultList();
		return listOfCat;

	}
}
