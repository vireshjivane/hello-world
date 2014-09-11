package hello

/***********************************************************************/

import org.springframework.boot._
import org.springframework.boot.autoconfigure._
import org.springframework.web.bind.annotation._
import org.springframework.context.annotation.Configuration._
import org.springframework.boot.autoconfigure.EnableAutoConfiguration._
import org.springframework.context.annotation.ComponentScan._
import org.springframework.boot._
import org.springframework.boot.autoconfigure._
import org.springframework.stereotype._
import org.springframework.web.bind.annotation._
import org.springframework.web.bind.annotation.RestController

/***********************************************************************/

object HelloWebApplication {

def main(args: Array[String]) 
{
SpringApplication.run(classOf[HelloConfig])
}

}

/***********************************************************************/



