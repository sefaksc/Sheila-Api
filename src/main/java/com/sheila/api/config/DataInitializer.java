package com.sheila.api.config;

import com.sheila.api.model.Application;
import com.sheila.api.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import java.util.List;

@Component
public class DataInitializer {

    @Autowired
    private ApplicationRepository applicationRepository;

    @PostConstruct
    public void initMockApplications() {
        if (applicationRepository.count() == 0) {
            List<Application> mockApps = List.of(
                    new Application("video-chat", 50),
                    new Application("file-transfer", 25),
                    new Application("game-lobby", 100)
            );
            applicationRepository.saveAll(mockApps);
            System.out.println("✅ Mock application verileri yüklendi.");
        }
    }
}