package br.com.zup.core.endpoints.findpixclient

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

@Controller("/client")
class FindAllPixByClientId {

    @Get("/{client-id}")
    fun teste() {

    }


}