package com.example.demo.controller
import com.example.demo.dao.TeamsRepository
import com.example.demo.model.Doctor
import com.example.demo.model.MedicalTeam
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
@RequestMapping("/teams")
class TeamController(val teamsRepository: TeamsRepository) {

    @RequestMapping("/list")
    fun getAll():List<MedicalTeam?>{
        return teamsRepository.findAll();
    }

    @RequestMapping("/addOrUpdate")
    fun addOrUpdate(employee: MedicalTeam): MedicalTeam {
        return teamsRepository.save(employee)
    }

    @RequestMapping("/remove")
    fun remove(id:Int){
        teamsRepository.deleteById(id);
    }

}