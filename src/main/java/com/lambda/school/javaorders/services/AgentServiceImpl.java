package com.lambda.school.javaorders.services;

import com.lambda.school.javaorders.models.Agent;
import com.lambda.school.javaorders.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "agentService")
public class AgentServiceImpl implements AgentService {
    @Autowired
    private AgentRepository agentRepository;

    @Transactional
    @Override
    public Agent save(Agent agent) {
        return agentRepository.save(agent);
    }
}
