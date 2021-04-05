package br.com.zup.core.endpoints.registerpix

import br.com.zup.PixRamdomKeyWordRequest
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

    @Post("/{client-id}/cpf")
    fun createPixCpf(

        @PathVariable("client-id") clientId: String,
        @Valid request: RegisterPixCpfFormRequest,
    ) {

        this.factoryStub.pixKeyOperationGrpcService().cpfKeyWordRegister(request.toModel(internal = clientId))

    }

    @Post("/{client-id}/email")
    fun createPixEmail(
        @PathVariable("client-id") clientId: String,
        @Valid @Body request: RegisterPixEmailFormRequest,
    ) {
        this.factoryStub.pixKeyOperationGrpcService().emailKeyWordRegister(request.toModel(internal = clientId))
    }

    @Post("/{client-id}/phone")
    fun createPixPhone(
        @PathVariable("client-id") clientId: String,
        @Valid @Body request: RegisterPixPhoneFormRequest,
    ) {
        this.factoryStub.pixKeyOperationGrpcService().phoneKeyWordRegister(request.toModel(internal = clientId))
    }

    @Post("/{client-id}")
    fun createPixRamdom(
        @PathVariable("client-id") clientId: String
    ) {
        this.factoryStub.pixKeyOperationGrpcService().ramdomKeyWordRegister(PixRamdomKeyWordRequest.newBuilder().setIdInternal(clientId).build())
    }
}