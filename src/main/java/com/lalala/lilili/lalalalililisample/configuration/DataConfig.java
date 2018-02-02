package com.lalala.lilili.lalalalililisample.configuration;

import com.lalala.lilili.lalalalililisample.data.FruitData;
import com.lalala.lilili.lalalalililisample.model.FruitBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataConfig {
    @Bean
    public String initData() {
        FruitBuilder build = new FruitBuilder();
        build.setName("Apple").setColor("Red").setFlavor("Sweet & sour").setShape("round");
        FruitData.addFruit(build.createFruit());
        build.setName("Banana").setColor("Yellow").setFlavor("Sweet").setShape("elongated and curved");
        FruitData.addFruit(build.createFruit());
        build.setName("Durian").setColor("Yellow").setFlavor("").setShape("Round and Prickly");
        FruitData.addFruit(build.createFruit());
        return "lalala";
    }
}
