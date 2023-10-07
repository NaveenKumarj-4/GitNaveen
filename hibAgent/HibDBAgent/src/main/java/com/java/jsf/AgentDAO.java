package com.java.jsf;

import java.util.List;


public interface AgentDAO {
	List<Agent> showAgentDao();
	String searchAgentDao(int empno);

	String updateAgentDao(Agent agentUpdate);
	

}
