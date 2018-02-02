package com.lalala.lilili.lalalalililisample.controller;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.lalala.lilili.lalalalililisample.data.FruitData;
import com.lalala.lilili.lalalalililisample.model.Fruit;
import com.lalala.lilili.lalalalililisample.response.BaseResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FruitController {

    @RequestMapping(value = "/api/master/fruits", method = RequestMethod.GET)
    public BaseResponse getAllFruit() {
        return new BaseResponse(true,"",FruitData.data);
    }

    @RequestMapping(value = "/api/master/fruit", method = RequestMethod.POST)
    public BaseResponse addFruit(@RequestBody Fruit fruit) {
        FruitData.addFruit(fruit);
        return new BaseResponse(true,"",fruit);
    }

    @RequestMapping(value = "/api/master/fruit", method = RequestMethod.GET)
    public BaseResponse getFruitById(@RequestParam(value = "id") Integer id) {
        return new BaseResponse(true,"",FruitData.data.get(id));
    }

    @RequestMapping(value = "/api/master/fruit", method = RequestMethod.PUT)
    public BaseResponse updateFruit(@RequestBody Fruit fruit) {
        FruitData.updateFruit(fruit);
        return new BaseResponse(true,"",fruit);
    }

    @RequestMapping(value = "/api/master/fruit", method = RequestMethod.DELETE)
    public BaseResponse deleteFruitById(@RequestParam(value = "id") Integer id) {
        FruitData.deleteFruit(id);
        return new BaseResponse(true,"",null);
    }
}
