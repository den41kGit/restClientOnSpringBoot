package com.den.example.job;

import com.den.example.service.GetInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class NewUsersInfoJob {
    @Autowired
    private GetInfoService getInfoService;
    @Value("${urlForGetInfo}")
    private String url;
    @Scheduled(fixedRateString = "${recountNewUsersInfoJob}")
    public  void newUsersInfo(){
        getInfoService.getInfo(url);
    }
}
