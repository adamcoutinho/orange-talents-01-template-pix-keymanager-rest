package br.com.zup.core.endpoints.findpixclient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lbr/com/zup/core/endpoints/findpixclient/FindPixClientEndPoint;", "", "()V", "factoryStub", "Lbr/com/zup/core/client/FactoryStub;", "getFactoryStub", "()Lbr/com/zup/core/client/FactoryStub;", "setFactoryStub", "(Lbr/com/zup/core/client/FactoryStub;)V", "findByClientId", "Lio/micronaut/http/HttpResponse;", "clientId", "", "api-pix"})
@io.micronaut.http.annotation.Controller(value = "/client")
public final class FindPixClientEndPoint {
    @javax.inject.Inject()
    public br.com.zup.core.client.FactoryStub factoryStub;
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.core.client.FactoryStub getFactoryStub() {
        return null;
    }
    
    public final void setFactoryStub(@org.jetbrains.annotations.NotNull()
    br.com.zup.core.client.FactoryStub p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/{client-id}", produces = {"application/json"})
    public final io.micronaut.http.HttpResponse<java.lang.Object> findByClientId(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable(value = "client-id")
    java.lang.String clientId) {
        return null;
    }
    
    public FindPixClientEndPoint() {
        super();
    }
}