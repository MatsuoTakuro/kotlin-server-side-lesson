package com.example.demo

import com.example.demo.database.UserMapper
import com.example.demo.database.UserRecord
import com.example.demo.database.insert
import com.example.demo.database.selectByPrimaryKey
import org.springframework.web.bind.annotation.*

data class InsertRequest(val id: Int, val name: String, val age: Int, val profile: String)
data class InsertResponse(val count: Int)

@Suppress("SpringJavaInjectionPointsAutowiringInspection")
@RestController
@RequestMapping("user")
class UserController(
    val userMapper: UserMapper
) {
    @GetMapping("/select/{id}")
    fun select(@PathVariable("id") id: Int): UserRecord? {
        return userMapper.selectByPrimaryKey(id)
    }

    @PostMapping("/insert")
    fun insert(@RequestBody request: InsertRequest): InsertResponse {
        val record = UserRecord(
                                request.id,
                                request.name,
                                request.age,
                                request.profile
                               )
        return InsertResponse(userMapper.insert(record))
    }
}
