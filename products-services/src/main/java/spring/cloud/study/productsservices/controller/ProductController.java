package spring.cloud.study.productsservices.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private static boolean failIsActive = false;

    @RequestMapping(path = "/verify/product/", method = RequestMethod.GET)
    public ResponseEntity verifyProduct(Integer product){

        while (failIsActive){
            logger.error("Fail when verify product");
        }

        return ResponseEntity.ok().build();
    }

    @RequestMapping(path = "/alter", method = RequestMethod.GET)
    public ResponseEntity setFail(){

        failIsActive = failIsActive ? false : true;

        return ResponseEntity.ok().build();
    }

}
