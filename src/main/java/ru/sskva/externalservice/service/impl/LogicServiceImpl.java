package ru.sskva.externalservice.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.sskva.externalservice.domain.response.Response;
import ru.sskva.externalservice.domain.response.SuccessResponse;
import ru.sskva.externalservice.service.LogicService;

import java.util.Random;

@Slf4j
@Service
@RequiredArgsConstructor
public class LogicServiceImpl implements LogicService {

    private static final Random random = new Random();



    @Override
    public Response getStatus(String inn) {

        try {
            Thread.sleep(random.nextLong(101) + 200);
        } catch (Exception ex) {
            log.info(ex.toString());
        }

        String status = switch (random.nextInt(3)) {
            case 0 -> "REGISTERED";
            case 1 -> "UNREGISTERED";
            case 2 -> "UNKNOWN";
            default -> null;
        };

        return SuccessResponse.builder().data(status).build();
    }
}
