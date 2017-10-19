package br.com.teste.schedulingtasktest.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    @Value("${app.config.cron.message}")
    private String message;

    @Scheduled(cron = "${app.config.cron.message}")
    public void task() {
        log.info(this.message);
    }

}
