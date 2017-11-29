package io.swagger.api;

import io.swagger.model.Fruit;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-29T21:37:44.994Z")

@Controller
public class FruitApiController implements FruitApi {



    public ResponseEntity<Void> addFruit(@ApiParam(value = "The fruit" ,required=true )  @Valid @RequestBody Fruit fruit) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Fruit> fruitGet(@ApiParam(value = "ID of the fruit",required=true ) @PathVariable("fruitId") Integer fruitId) {
        // do some magic!
        return new ResponseEntity<Fruit>(HttpStatus.OK);
    }

    public ResponseEntity<List<Fruit>> listFruits() {
        // do some magic!
        return new ResponseEntity<List<Fruit>>(HttpStatus.OK);
    }

}
