object a {
  for(a <- as; b <- bs if b > 2) {
    println(a + b)
  }
}

object a {
  for (a <- as) {
    println(a)
  }
}

object a {
  for (a <- as if a < 5) yield a
}

object a {
  for (
    a <- as;
    b <- bs
  ) {
    println(a + b)
  }
}

object a {
  for {
    a <- as
  } {
    println(a)
  }
}
