package kr.ac.kumoh.s20211171.w24Backend.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/message")
class MessageController {


    @GetMapping
    // TODO : React 주소 변경할 곳
    @CrossOrigin(origins = ["http://localhost:3000"])
    fun getMessage() = mapOf("status" to "success")
}