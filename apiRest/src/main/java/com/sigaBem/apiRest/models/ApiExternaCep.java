package com.sigaBem.apiRest.models;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiExternaCep {
    private String cep;
    private String uf;
    private String ddd;

    public String getCep() {
        return cep;
    }

    public String getUf() {
        return uf;
    }

    public String getDdd() {
        return ddd;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

}
