package io.security.springsecurity.aopsecurity.liveaop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AopLiveMethodService {

    public void liveAopService(){
      log.debug("LiveAopFirstService");
    }
}
