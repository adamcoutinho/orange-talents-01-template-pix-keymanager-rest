package br.com.zup.core.endpoints.registerpix

import br.com.zup.PixPhoneKeyWordRequest

class RegisterPixPhoneFormRequest(val phoneKeyWord:String) {

    fun toModel(internal:String)  = PixPhoneKeyWordRequest
        .newBuilder()
        .setIdInternal(internal)
        .setPhoneKeyWord(phoneKeyWord)
        .build()
}
