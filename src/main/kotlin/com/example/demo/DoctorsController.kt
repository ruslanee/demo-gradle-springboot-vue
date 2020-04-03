package com.example.demo

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@CrossOrigin
@RestController
@RequestMapping("/doctors")
class DoctorsController {

    @GetMapping("")
    fun getList(): List<Doctor> {
        return listOf(
                Doctor("Jane", "Smith", LocalDate.of(1990, 2, 1), 1),
                Doctor("Joe", "Long", LocalDate.of(1975, 11, 15), 2),
                Doctor("John", "Tall", LocalDate.of(1982, 4, 2), 3)
        )
    }
}

data class Doctor(
        var firstName: String,
        var lastName: String,
        var birthDate: LocalDate,
        var id: Long
)