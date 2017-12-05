package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Fruit;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-29T21:37:44.994Z")

@Controller
public class FruitApiController implements FruitApi {

    final List<Fruit> fruits = new ArrayList<Fruit>();

    public ResponseEntity<Void> addFruit(@ApiParam(value = "The fruit" ,required=true )  @Valid @RequestBody Fruit fruit) {
        fruit.setId(fruits.size() + 1L);
        fruits.add(fruit);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Fruit> fruitGet(@ApiParam(value = "ID of the fruit",required=true ) @PathVariable("fruitId") Integer fruitId) {
        Fruit fruit = fruits.get(fruitId - 1);
        ResponseEntity.BodyBuilder builder = (ResponseEntity.BodyBuilder) ResponseEntity.ok();
        builder.allow(HttpMethod.GET);
        builder.contentType(MediaType.APPLICATION_JSON);
        return builder.body(fruit);
    }

    public ResponseEntity<List<Fruit>> listFruits() {
        ResponseEntity.BodyBuilder builder = (ResponseEntity.BodyBuilder) ResponseEntity.ok();
        builder.allow(HttpMethod.GET);
        builder.contentType(MediaType.APPLICATION_JSON);
        return builder.body(fruits);
    }

    @Override
    public ResponseEntity<Fruit> fruitDelete(Integer fruitId) {
        Fruit fruit = fruits.remove(fruitId - 1);
        ResponseEntity.BodyBuilder builder = (ResponseEntity.BodyBuilder) ResponseEntity.ok();
        builder.allow(HttpMethod.GET);
        builder.contentType(MediaType.APPLICATION_JSON);
        return builder.body(fruit);
    }

}
