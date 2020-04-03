package com.example.demo
import org.springframework.web.bind.annotation.*
import java.util.*

@CrossOrigin
@RestController
@RequestMapping("/employees")
class EmployeeController {

    val items = mutableMapOf<String,Employee>()

    init{
        val alex=Employee("Alex")
        val joe=Employee("Joe")
        items[alex.uuid] = alex
        items[joe.uuid] = joe
    }

    @RequestMapping("/list")
    fun getAllItems():Collection<Employee>{
        return items.values
    }

    @RequestMapping("/addOrUpdate")
    fun saveOrUpdate(employee: Employee){
        items.put(employee.uuid, employee);
    }

    @RequestMapping("/remove")
    fun removeItem(uuid:String){
        items.remove(uuid)
    }

}

data class Employee(var name: String, var uuid: String=UUID.randomUUID().toString())