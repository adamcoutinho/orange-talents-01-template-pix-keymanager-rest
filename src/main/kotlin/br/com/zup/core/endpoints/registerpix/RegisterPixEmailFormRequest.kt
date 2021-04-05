package br.com.zup.core.endpoints.registerpix

import br.com.zup.PixEmailKeyWordRequest
import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank


@Introspected
class RegisterPixEmailFormRequest (@field:NotBlank(message = "preencha o email.") @field:Email(message = "informe um email valido.") val keyword:String){
    fun toModel(internal:String): PixEmailKeyWordRequest? {
        return PixEmailKeyWordRequest.newBuilder()
            .setEmailKeyWord(keyword)
            .setIdInternal(internal)
            .build()
    }

}
