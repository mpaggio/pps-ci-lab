import src/main/java/Paggetti

trait Person:
    def getName(): String

object Person:
    def getName(): String = 
        val paggetti = Paggetti()
        return paggetti.getName()

def main(): Unit = 
    val person = Person()
    println(person.getName())