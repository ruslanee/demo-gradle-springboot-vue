package com.example.demo.controller
import com.example.demo.dao.DoctorsRepository
import com.example.demo.model.Doctor
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
@RequestMapping("/doctors")
class DoctorsController(val employeeRepository: DoctorsRepository) {

    @RequestMapping("/list")
    fun getAll():List<Doctor?>{
        return employeeRepository.findAll();
    }

    @RequestMapping("/addOrUpdate")
    fun addOrUpdate(employee: Doctor): Doctor {
        return employeeRepository.save(employee)
    }

    @RequestMapping("/remove")
    fun remove(id:Int){
        employeeRepository.deleteById(id);
    }

}