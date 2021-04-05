package br.com.zup.core.endpoints.findpixclient

import br.com.zup.SearchRequest
import br.com.zup.core.client.FactoryStub
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import javax.inject.Inject

@Controller("/client")
class FindPixClientEndPoint {
    @Inject
    lateinit var factoryStub: FactoryStub

    @Get("/{client-id}", produces = [MediaType.APPLICATION_JSON])
    fun findByClientId(@PathVariable("client-id") clientId:String):HttpResponse<Any> {

        val searchRequest = SearchRequest.newBuilder()
            .setClientId(clientId)
            .build()
        val keys = this.factoryStub.findAllPixKeyGrpcService().findAll(searchRequest).clientPixList.map {
            ClientPixDetailResponse(
                clientId = it.clientId,
                pixId = it.pixId,
                keyType = it.keyType.name,
                key =  it.key,
                accountType = it.accountType
            )}


         when{
            keys.isNotEmpty() -> {
                return HttpResponse.ok(keys)
            }
            else -> {
                return HttpResponse.notFound()
            }
        }

    }


}