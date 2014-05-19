package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  /*printSet((x => (x >= 0 && x < 5)))
  println(forall((x => (x >= 0 && x < 5)), x => (x > -5 && x < 10)))
  printSet((map(x => (x >= 0 && x < 5), x => x -1)))*/
}
