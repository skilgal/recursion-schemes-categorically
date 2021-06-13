import schemes.{Const, Expr, Plus, Times, Var}

object Program extends App {

  def expr: Expr = Plus(
    Times(Var("x"), Var("x")),
    Plus(Times(Const(3.0), Var("x")), Const(4.0))
  )

  println(Expr.eval(expr))
  println(Expr.pretty(expr))
}
