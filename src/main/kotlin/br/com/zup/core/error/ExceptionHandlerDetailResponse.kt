package br.com.zup.core.error

import java.time.LocalDateTime

class ExceptionHandlerDetailResponse(val field:String , val message:String) {

    var createAt:LocalDateTime =  LocalDateTime.now()

}
