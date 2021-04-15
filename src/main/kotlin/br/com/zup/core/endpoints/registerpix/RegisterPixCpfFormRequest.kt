package br.com.zup.core.endpoints.registerpix

import br.com.zup.PixCpfWordRequest
import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.NotBlank

@Introspected
class RegisterPixCpfFormRequest (@field:NotBlank(message = "informe uma mensagem.") val key:String){

    fun toModel(internal:String) =  PixCpfWordRequest.newBuilder()
            .setCpfKeyWord(key)
            .setIdInternal(internal)
            .build()


}
