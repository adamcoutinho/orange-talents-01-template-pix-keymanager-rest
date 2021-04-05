package br.com.zup.core.endpoints.registerpix;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0017J&\u0010\u0011\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0012H\u0017J&\u0010\u0013\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0014H\u0017J\u001c\u0010\u0015\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lbr/com/zup/core/endpoints/registerpix/RegisterPixEndPoint;", "", "()V", "factoryStub", "Lbr/com/zup/core/client/FactoryStub;", "getFactoryStub", "()Lbr/com/zup/core/client/FactoryStub;", "setFactoryStub", "(Lbr/com/zup/core/client/FactoryStub;)V", "createPixCpf", "", "clientId", "", "accountType", "", "request", "Lbr/com/zup/core/endpoints/registerpix/RegisterPixCpfFormRequest;", "createPixEmail", "Lbr/com/zup/core/endpoints/registerpix/RegisterPixEmailFormRequest;", "createPixPhone", "Lbr/com/zup/core/endpoints/registerpix/RegisterPixPhoneFormRequest;", "createPixRamdom", "api-pix"})
@io.micronaut.http.annotation.Controller(value = "/pix")
@io.micronaut.validation.Validated()
public class RegisterPixEndPoint {
    @javax.inject.Inject()
    public br.com.zup.core.client.FactoryStub factoryStub;
    
    @org.jetbrains.annotations.NotNull()
    public br.com.zup.core.client.FactoryStub getFactoryStub() {
        return null;
    }
    
    public void setFactoryStub(@org.jetbrains.annotations.NotNull()
    br.com.zup.core.client.FactoryStub p0) {
    }
    
    @io.micronaut.http.annotation.Post(value = "/{client-id}/{account-type}/cpf")
    public void createPixCpf(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable(value = "client-id")
    java.lang.String clientId, @io.micronaut.http.annotation.PathVariable(value = "account-type")
    int accountType, @org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    br.com.zup.core.endpoints.registerpix.RegisterPixCpfFormRequest request) {
    }
    
    @io.micronaut.http.annotation.Post(value = "/{client-id}/{account-type}/email")
    public void createPixEmail(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable(value = "client-id")
    java.lang.String clientId, @io.micronaut.http.annotation.PathVariable(value = "account-type")
    int accountType, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    @javax.validation.Valid()
    br.com.zup.core.endpoints.registerpix.RegisterPixEmailFormRequest request) {
    }
    
    @io.micronaut.http.annotation.Post(value = "/{client-id}/{account-type}/phone")
    public void createPixPhone(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable(value = "client-id")
    java.lang.String clientId, @io.micronaut.http.annotation.PathVariable(value = "account-type")
    int accountType, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    @javax.validation.Valid()
    br.com.zup.core.endpoints.registerpix.RegisterPixPhoneFormRequest request) {
    }
    
    @io.micronaut.http.annotation.Post(value = "/{client-id}/{account-type}")
    public void createPixRamdom(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable(value = "client-id")
    java.lang.String clientId, @io.micronaut.http.annotation.PathVariable(value = "account-type")
    int accountType) {
    }
    
    public RegisterPixEndPoint() {
        super();
    }
}