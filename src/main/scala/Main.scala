object Main extends App {
  val numbers = (1 to 1_000_000)

  val ans = numbers.filterNot(n => numbers.exists(k => numbers.contains(n-k))).max

  println(ans)
}
