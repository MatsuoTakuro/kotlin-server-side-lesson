package com.example.demo

import org.springframework.stereotype.Component

@Component("JapaneseMessageService")
class JapaneseMessageService: MessageService {
    override fun displayLang(): String {
        return "Jan"
    }
}