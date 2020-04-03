package com.example.demo.model

import java.time.LocalDate
import javax.persistence.*

@Entity
class MedicalTeam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null
    var name: String? = null

    constructor() {}

    constructor(id: Int?, name: String?) {
        this.id = id
        this.name=name
    }

}