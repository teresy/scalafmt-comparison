object a {
  def c(b: List[Int]): List[Int] =
    for {
      a <- b
      if ((a))
    } yield a
}

object a {
  def c(b: List[Int]): List[Int] =
    for {
      a <- b
      if ((b ++ b).length >= 2)
    } yield a
}

object a {
  def c(b: List[Int]): List[Int] =
    for {
      a <- b
      if (a) || (a)
    } yield a
}

object a {
  def c(b: List[Int]): List[Int] =
    for {
      a <- b
      if ((a)) || ((a))
    } yield a
}

object a {
  b match { case _ if (a) => b }
}

object a {
  b match { case _ if (a) || (a) => b }
}

object a {
  b match { case _ if ((a) || (a)) => b }
}
