package ru.sskva.externalservice.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sskva.externalservice.domain.response.Response;
import ru.sskva.externalservice.service.LogicService;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("external-service")
public class Controller {

    private final LogicService logicService;

    @GetMapping(value = "getStatus/{inn}")
    public Response getStatus(@PathVariable("inn") String inn) {

        log.info("getStatus started, inn: {}", inn);
        Response response = logicService.getStatus(inn);
        log.info("getStatus ended, response: {}", response);
        return response;
    }
}
