package hello

/***********************************************************************/

import org.springframework.boot._
import org.springframework.boot.autoconfigure._
import org.springframework.boot.autoconfigure.EnableAutoConfiguration._
import org.springframework.context.annotation.Configuration._
import org.springframework.context.annotation.ComponentScan._
import org.springframework.web.bind.annotation._
import org.springframework.web.bind.annotation.RestController
import org.springframework.stereotype._

/***********************************************************************/

@RestController
@EnableAutoConfiguration
class HelloConfig{

@RequestMapping(value=Array("/"))
@ResponseBody
def home(): String = "Hello World !"
}

/***********************************************************************/