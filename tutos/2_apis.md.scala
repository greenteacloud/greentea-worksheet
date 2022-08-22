  /*

@author Sylvain Ductor, 2021

```scala
 */
package cloud.greentea
/*
```


```scala
*/
import cats.{~> as -->, *}
import cats.data._
import cats.syntax.all._
import cats.effect._
import cats.effect.syntax.all._
import cats.effect.std.Console
/*
```






```scala
*/
val sayHello = ( (name : String) => s"Hello $name" ).~>[String,String]

    val sayHelloOrDie = (
        (name : Maybe[String]) =>
            name.bimap(
                (t : Throwable) => t,
                n => s"Hello $n"
            )
    ).~>[String,Maybe[String]]
/*
```



```scala
*/
object main extends interpretor.default :

    println(sayHello.yes.execWith("World").getResult())

    val entry : Maybe[String] =
        shell.readline.yes.exec.getResult()
    shell.printvalidline.yes.execWith(s"yo $entry").run()

    val helloEffect : Effect[Id] =
        sayHello.yes.effectOn(shell.console)
    helloEffect.exec.getResult()



    val sayHelloOrDieEffect  =
        sayHelloOrDie.yes.resultTo(shell.consoleX)

    sayHelloOrDieEffect.execWith(
        //"good".valid
        new RuntimeException("expected error").invalid
    ).getResult()
/*
```



```scala
*/

@main def test = main

    val result = incrCouple.interpret((1,2))

/*
```




//@main def test = println(simple.getResult())
@main def test2 = println(sayHello.yes.execWith("World").getResult())
/*
```


