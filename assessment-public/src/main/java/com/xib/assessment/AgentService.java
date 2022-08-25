package com.xib.assessment;

import java.util.List;
import java.util.Optional;

public interface AgentService {
    Optional<Agent> addAgent(Agent agent) throws ResourceExistsException;
    Agent getAgent(String id);
    List<Agent> getAllAgents();
    //Implements pagination and doesnt return the agent IDnumber
    List<Agent> getAgents();
    //Assigns an agent to the specified team
    Agent editTeamAgent(Agent agent);

}
