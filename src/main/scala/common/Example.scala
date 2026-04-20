package common

import common.Paggetti

trait Person:
  def getName(): String

class ScalaPerson extends Person:
  private val p = Paggetti()

  def getName(): String = p.getName()

@main def main():  Unit =
  val person = ScalaPerson()
  println(person.getName())