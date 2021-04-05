package br.com.zup.core.client

import br.com.zup.FindAllPixKeyServiceGrpc
import br.com.zup.PixKeyWordSarchServiceGrpc
import br.com.zup.PixKeyWordServiceGrpc
import io.grpc.ManagedChannel
import io.micronaut.context.annotation.Factory
import io.micronaut.grpc.annotation.GrpcChannel
import javax.inject.Singleton

@Factory
class FactoryStub(@GrpcChannel("pixKeywordManager") val channel: ManagedChannel ) {

    @Singleton
    fun pixKeyOperationGrpcService() = PixKeyWordServiceGrpc.newBlockingStub(channel)


    @Singleton
    fun findAllPixKeyGrpcService() = FindAllPixKeyServiceGrpc.newBlockingStub(channel)

    @Singleton
    fun pixKeyWordSarchService() = PixKeyWordSarchServiceGrpc.newBlockingStub(channel)



}