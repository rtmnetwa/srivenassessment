package com.xib.assessment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgentServiceImp {

    private AgentRepository agentRepository;

    @Autowired
    public AgentServiceImp(AgentRepository agentRepository) {
        this.agentRepository=agentRepository;
    }

    public Agent addAgent(Agent agent) {
        return agentRepository.save(agent);
    }

}
