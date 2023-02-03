package com.wrtecnologia.jobs.dsnjobs.jobs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class EnviarEmailJob {
    @Scheduled(cron = "0-58/2 * * * * ?")
    public void verificarDataHoraAtual(){

        Date data = new Date();
        log.info("Rodando schedule 1 - Última execução: " + data);

    }
    @Scheduled(cron = "1-59/2 * * * * ?")
    public void verificarDataHoraAtual2(){

        Date data = new Date();
        log.info("Rodando schedule 2 - Última execução: " + data);

    }
}
