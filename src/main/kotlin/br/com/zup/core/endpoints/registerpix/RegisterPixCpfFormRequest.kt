package br.com.zup.core.endpoints.registerpix

import br.com.zup.PixCpfWordRequest
import br.com.zup.core.shared.ValidPixCpf
import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.NotBlank

@Introspected
class RegisterPixCpfFormRequest (@field:NotBlank(message = "informe uma mensagem.") @field:ValidPixCpf val key:String){
    fun toModel(internal:String): PixCpfWordRequest? {
        return PixCpfWordRequest.newBuilder()
            .setCpfKeyWord(key)
            .setIdInternal(internal)
            .build()
    }

}
