package org.ilya.spring_dz.Controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ilya.spring_dz.DTO.Request;
import org.ilya.spring_dz.DTO.Response;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;


@RestController
public class Controller {
    private final Logger logger = LogManager.getLogger();

    @PostMapping(
            value = "/info/postBalances",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Object postBalances(@RequestBody Request request) {
        final Response response = new Response();
        response.setRqUID(request.getRqUID());
        response.setClientId(request.getClientId());
        response.setAccount(request.getAccount());

        String currency = null;
        double maxLimit = 0;

        int first = request.getClientId().charAt(0) - '0';
        switch (first) {
            case 8:
                currency = "US";
                maxLimit = 2000;
                break;
            case 9:
                currency = "EU";
                maxLimit = 1000;
                break;
            default:
                currency = "RUB";
                maxLimit = 10000;
                break;
        }

        double balance = new Random().nextDouble(maxLimit);
        response.setCurrency(currency);
        response.setBalance(String.format("%.2f", balance));
        response.setMaxLimit(String.format("%.2f", maxLimit));

        logger.info(request);
        logger.info(response);
        return response;
    }
}
