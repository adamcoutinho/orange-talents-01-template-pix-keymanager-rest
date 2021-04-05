package br.com.zup.core.endpoints.registerpix

import br.com.zup.core.client.FactoryStub
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated
import javax.inject.Inject
import javax.validation.Valid

@Validated
@Controller("/pix")
class RegisterPixEndPoint() {

    @Inject
    lateinit var factoryStub: FactoryStub

    @Post("/{client-id}/{account-type}/cpf")
    fun createPixCpf(

        @PathVariable("client-id") clientId: String,
        @PathVariable("account-type") accountType: Int,
        @Valid  request:RegisterPixCpfFormRequest
    ) {

        this.factoryStub.pixKeyOperationGrpcService().cpfKeyWordRegister(request.toModel(internal = clientId))

    }

    @Post("/{client-id}/{account-type}/email")
    fun createPixEmail(
        @PathVariable("client-id") clientId: String,
        @PathVariable("account-type") accountType: Int,
        @Valid @Body request:RegisterPixEmailFormRequest
    ) {
        this.factoryStub.pixKeyOperationGrpcService().emailKeyWordRegister(request.toModel(internal = clientId))
    }

    @Post("/{client-id}/{account-type}/phone")
    fun createPixPhone(
        @PathVariable("client-id") clientId: String,
        @PathVariable("account-type") accountType: Int,
        @Valid @Body request:RegisterPixPhoneFormRequest
    ) {

    }

    @Post("/{client-id}/{account-type}")
    fun createPixRamdom(
        @PathVariable("client-id") clientId: String,
        @PathVariable("account-type") accountType: Int
    , request:RegisterPixRandomFormRequest) {
        this.factoryStub.pixKeyOperationGrpcService().ramdomKeyWordRegister(request.toModel(internal = clientId))
    }
}