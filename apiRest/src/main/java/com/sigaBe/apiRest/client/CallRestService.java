package com.sigaBe.apiRest.client;

import com.sigaBem.apiRest.models.ApiExternaCep;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public interface CallRestService {

    private static void CallRestService() {
        RestTemplate restTemplate = new RestTemplate();
        UriComponents uri = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("viacep.com.br")
                .path("ws/13050470/json")
                .build();

        ResponseEntity<ApiExternaCep> entity = restTemplate.getForEntity(uri.toString(), ApiExternaCep.class);

        System.out.println(entity.getBody().getUf());

    }

}
