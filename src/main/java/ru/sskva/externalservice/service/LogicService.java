package ru.sskva.externalservice.service;


import ru.sskva.externalservice.domain.response.Response;

public interface LogicService {

    Response getStatus(String inn);
}
