package br.com.zup.core.endpoints

import br.com.zup.SearchRequest
import br.com.zup.core.client.FactoryStub
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated
import javax.inject.Inject
import javax.validation.Valid

@Validated
@Controller("/pix")
class RegisterPixEndPoint() {
    @Inject
    lateinit var factoryStub: FactoryStub

    @Post("/")
    fun create(@Body @Valid request:RegisterPixFormRequest) {










    }
}