package ru.leonov.profile.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ClearCache {

    @Scheduled(cron = "${cache.cron.profile.clear}")
    @CacheEvict(value = "user", allEntries = true)
    public void clearAllProfileCache() {
        log.info("Start clean user caches by cron");
    }

}
