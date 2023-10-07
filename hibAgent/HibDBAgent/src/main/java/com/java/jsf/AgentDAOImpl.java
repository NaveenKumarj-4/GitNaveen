package com.java.jsf;

import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;





public class AgentDAOImpl implements AgentDAO{
	SessionFactory sf;
	Session session;
	
	public List<Agent> showAgentCr() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Agent.class);
		cr.addOrder(Order.asc("premium"));
		List<Agent> agentList = cr.list();
		return agentList;
	}

	@Override
	public List<Agent> showAgentDao() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Query query = session.createQuery("from Agent");
		List<Agent> agentList = query.list();
		return agentList;
	}

	@Override
	public String updateAgentDao(Agent agentUpdate) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.update(agentUpdate);
		trans.commit();
		return "AgentShow.xhtml?faces-redirect=true";
	
	}

	@Override
	public String searchAgentDao(int empno) {
Map<String,Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Query query = session.createQuery("from Employ where empno="+empno);
		List<Agent> agentList = query.list();
		Agent agent =agentList.get(0);
sessionMap.put("editAgent",agent);
return "UpdateAgent.xhtml?faces-redirect=true";
		}

}
