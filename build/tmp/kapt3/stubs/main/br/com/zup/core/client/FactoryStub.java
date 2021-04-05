package br.com.zup.core.client;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bH\u0007J\u0010\u0010\n\u001a\n \t*\u0004\u0018\u00010\u000b0\u000bH\u0007J\u0010\u0010\f\u001a\n \t*\u0004\u0018\u00010\r0\rH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lbr/com/zup/core/client/FactoryStub;", "", "channel", "Lio/grpc/ManagedChannel;", "(Lio/grpc/ManagedChannel;)V", "getChannel", "()Lio/grpc/ManagedChannel;", "findAllPixKeyGrpcService", "Lbr/com/zup/FindAllPixKeyServiceGrpc$FindAllPixKeyServiceBlockingStub;", "kotlin.jvm.PlatformType", "pixKeyOperationGrpcService", "Lbr/com/zup/PixKeyWordServiceGrpc$PixKeyWordServiceBlockingStub;", "pixKeyWordSarchService", "Lbr/com/zup/PixKeyWordSarchServiceGrpc$PixKeyWordSarchServiceBlockingStub;", "api-pix"})
@io.micronaut.context.annotation.Factory()
public final class FactoryStub {
    @org.jetbrains.annotations.NotNull()
    private final io.grpc.ManagedChannel channel = null;
    
    @javax.inject.Singleton()
    public final br.com.zup.PixKeyWordServiceGrpc.PixKeyWordServiceBlockingStub pixKeyOperationGrpcService() {
        return null;
    }
    
    @javax.inject.Singleton()
    public final br.com.zup.FindAllPixKeyServiceGrpc.FindAllPixKeyServiceBlockingStub findAllPixKeyGrpcService() {
        return null;
    }
    
    @javax.inject.Singleton()
    public final br.com.zup.PixKeyWordSarchServiceGrpc.PixKeyWordSarchServiceBlockingStub pixKeyWordSarchService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.grpc.ManagedChannel getChannel() {
        return null;
    }
    
    public FactoryStub(@org.jetbrains.annotations.NotNull()
    @io.micronaut.grpc.annotation.GrpcChannel(value = "pixKeywordManager")
    io.grpc.ManagedChannel channel) {
        super();
    }
}