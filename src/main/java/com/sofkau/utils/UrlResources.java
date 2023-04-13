package com.sofkau.utils;

public enum UrlResources {

    REQRES_BASE_URL_PUT("https://reqres.in/api/"),
    RESOURCES_PUT("users/"),
    SOAP_CAPITAL_BASE_URL("http://webservices.oorsprong.org/"),
    RESOURCE_CAPITAL("websamples.countryinfo/CountryInfoService.wso"),
    RICK_AND_MORTY_BASE_URL("https://rickandmortyapi.com/"),
    RICK_AND_MORTY_SELECCION_ID("api/character/"),
    BODY_PATH("src/test/resources/soapXml/filecapital.xml"),
    ANIME_JINKAN_BASE_URL("https://api.jikan.moe/v4"),
    ANIME_JINKAN_RESOURCE("/anime/"),
    BODY_PATH_ISO_NUMERO_CELULAR  ("src/test/resources/soapXml/filecodigoISOnumerocelular.xml");

    private final String value;

    UrlResources(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }
}
