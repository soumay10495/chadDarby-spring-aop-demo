package demo.dao;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class FortuneDAO {
    public String getFortune() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "You are lucky";
    }

    public String getFortune(Boolean flag) {
        if (flag)
            throw new RuntimeException("Flag true Exception");

        return "You are lucky";
    }
}
