package com.example.demo
import org.springframework.web.bind.annotation.*
@CrossOrigin
@RestController
@RequestMapping("/demo")
class DemoController {
    val items = mutableMapOf(
            "abra" to Item("abra"),
            "kadabra" to Item("kadabra")
    )

    @RequestMapping("/items")
    fun getAllItems():Collection<Item>{
        return items.values
    }

    @RequestMapping("/addOrUpdate")
    fun saveOrUpdate(item: Item){
        items.put(item.text, item);
    }

    @RequestMapping("/remove")
    fun removeItem(text:String){
        items.remove(text)
    }

}

data class Item(var text: String, var done:Boolean=false)