 
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
def increment_fun(a : Int) : Int  = a + 1

val increment_verbose : Int => Int = (a : Int) => a + 1

val increment :  Int => Int             = (_ : Int) + 1



val addOne = ( (a : Int) => a + 1).~>[Int,Int]

val addOne_exp  : (Int ~> Int)[Int => Int]    = (_ : Int) + 1
/*
```




```scala
*/
val addTwo              = addOne andThen addOne

val addThree            = addOne andThen addOne andThen addOne

val addOne2Couple       = addOne and addOne

val addOne2Triple       = addOne and addOne and addOne

val addOneORAddThree    = addOne xor addThree

val addOneOrAddTwo      = addOne ior (addOne andThen addOne)
/*
```






```scala
*/
given ξ : interpretor.default = interpretor.default()

val addOne_simple  = addOne.yes.execWith(1)

val addOne_couple  = addOne2Couple.yes.execWith((1,2))

val addOne_either  = addOneORAddThree.yes.execWith(Left(1))

val addOne_ior     = addOneOrAddTwo.yes.execWith(Ior.Both(1,2))

val addOne_andthen = addThree.yes.execWith(1)


