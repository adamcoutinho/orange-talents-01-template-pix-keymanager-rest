package br.com.zup.core.endpoints.registerpix

import br.com.zup.PixRamdomKeyWordRequest

class RegisterPixRandomFormRequest {
        fun toModel(internal:String) = PixRamdomKeyWordRequest.newBuilder()
            .setIdInternal(internal)
            .build()
}
