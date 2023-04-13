package com.sofkau.questions.rest;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class ReturnPokeApiJsonResponse implements Question<Response> {


    @Override
    public Response answeredBy(Actor actor) {
        return (Response) SerenityRest.lastResponse().body();
    }

    public static ReturnPokeApiJsonResponse returnPokeApiJsonResponse(){
        return new ReturnPokeApiJsonResponse();
    }
}
