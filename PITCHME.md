#HSLIDE

## Hello, Scala!

#HSLIDE

## Agenda
- Porque Scala
- Hello world
- Variáveis
- Funções
- Classes
- Objetos

#VSLIDE

## Agenda
- Traits
- Option
- Pattern matching
- DOJO

#HSLIDE
## Porque Scala?

- Menos código = mais expressividade
- Paradigma funcional
- \\o/ REPL \\o/
- Gatling

#VSLIDE

## Menos código = mais expressividade - I
```Java
// Java
public class Shape {
    private String name;
    private int sides;
    public Shape(String name, int sides) {
        this.name = name;
        this.sides = sides;
    }
    public String getName() { return this.name; }
    public int getSides() { return this.sides; }
    public void setName(String name) { this.name = name; }
    public void setSides(int sides) { this.sides = sides; }
}
Shape square = new Shape("square", 4);
```
```Scala
// Scala
case class Shape(name: String, sides: Int)
val square = Shape("square", 4)
```

#VSLIDE

## Menos código = mais expressividade - II

```Java
// Java
public List<int> filterOdd(List<int> numbers) {
    List<init> oddNumbers = new ArrayList();
    for (int number : numbers) {
        if (number % 2 == 1) oddNumbers.add(number);
    }
    return oddNumbers
}
```

```Scala
// Scala
def filterOdd(numbers: List[Int]): List[Int] = {
    numbers.filter(n => n % 2 == 1)
}
```

#VSLIDE

## Menos código = mais expressividade - III
```Java
// Java
Map<int, String> numbers = new HashMap<>();
numbers.put(1, "one");
numbers.put(2, "two");
numbers.put(3, "three");
(...)
```

```Scala
val numbers = Map[Int, String](1 -> "one",2 -> "two")
```
#VSLIDE

## Paradigma funcional

- encoraja o uso de estuturas imutáveis
- facilita composição de funções
- aumenta a legibilidade


#VSLIDE

##  \\o/ REPL \\o/

- tirar dúvidas
- prototipar idéias
- mostrar expressividade de Scala

#VSLIDE

## Gatling

- Cenários só podem ser descritos em Scala

#HSLIDE

## Hello World

#VSLIDE

## Java vs Scala

```Java
// Java
public class HelloWorld {
    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
    }
}
```
```Scala
// Scala
object HelloWorld extends App {
    println("Hello, world");
}
```

#HSLIDE

## Variáveis

#VSLIDE

## var - Variáveis mutáveis

    scala> var name:String = "Luiz"
    name: String = Luiz

    scala> var company = "B2W"
    company: String = B2W

    scala> println(name, company)
    (Luiz,B2W)

    scala> company = "BIT Services"
    company: String = BIT Services

    scala> println(name, company)
    (Luiz,BIT Services)

    scala> company = 12
    <console>:8: error: type mismatch;
    found   : Int(12)
    required: String
       company = 12
                 ^


#VSLIDE

## val - Variáveis imutáveis

    scala> val team = "API"
    team: String = API

    scala> team = "Mobile"
    <console>:8: error: reassignment to val
       team = "Mobile"


#VSLIDE

## lazy - Variáveis "preguiçosas"

    scala> lazy val answer = {
     |  println("expensive computation...")
     |  42
     | }

    answer: Int = <lazy>

    scala> answer
    expensive computation...
    res0: Int = 42


#HSLIDE

## Funções

#VSLIDE

## Definição

    scala> def palindrome(word: String): Boolean = {
     |  word.reverse == word
     | }
    palindrome: (word: String)Boolean

    scala> palindrome("dog")
    res0: Boolean = false

    scala> palindrome("level")
    res1: Boolean = true

    scala> palindrome("Racecar")
    res2: Boolean = false


#VSLIDE

## São objetos

    scala> val odd = (i: Int) => { i % 2 == 0 }
    odd: Int => Boolean = <function1>

    scala> odd(2)
    res0: Boolean = true

    scala> odd(5)
    res1: Boolean = false

    scala> val even: Int => Boolean = i => i % 2 != 0
    even: Int => Boolean = <function1>

    scala> even(10)
    res2: Boolean = false

    scala> even(1)
    res3: Boolean = true


#VSLIDE

## Funções anônimas

    scala> def filterInts(ints: List[Int], f: Int => Boolean) = {
     |  ints.filter(f)
     | }
    filterInts: (ints: List[Int], f: Int => Boolean)List[Int]

    scala> val ints = 1 to 8 toList
    ints: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8)

    scala> val multiple2 = filterInts(ints, x => x % 2 == 0)
    multiple2: List[Int] = List(2, 4, 6, 8)


#VSLIDE

## Currying

Decompõe uma função de **n** variáveis como uma composição de **n** funções de 1 variável

    scala> def y(a: Int, b: Int, x: Int): Int = a * x + b
    y: (a: Int, b: Int, x: Int)Int
    scala> val curriedY = y _ curried
    curriedY: Int => (Int => (Int => Int)) = <function1>
    scala> def curriedY2(a: Int)(b: Int)(x: Int): Int = a * x + b
    curriedY2: (a: Int)(b: Int)(x: Int)Int
    scala> val identity = curriedY(1)(0)
    identity: Int => Int = <function1>
    scala> val identity2 = curriedY2(1)(0)_
    identity2: Int => Int = <function1>
    scala> identity(10)
    res0: Int = 10
    scala> identity2(20)
    res1: Int = 20

#VSLIDE

## Aplicação parcial

Difere de **currying** já que a função resultado pode receber mais de um valor

    scala> val wrapContent(prefix: String, content: String, suffix: String) = prefix + content + suffix
    wrapContent: (prefix: String, content: String, suffix: String)String
    scala> val wrapSpan = wrapContent("<span>", _: String, "</span>")
    wrapSpan: String => String = <function1>
    scala> wrapSpan("spam")
    res0: String = <span>spam</span>
    scala> val wrapH1 = wrapContent("# ", _:String, "")
    wrapH1: String => String = <function1>
    wrapH1("slide title")
    scala> wrapH1("project title")
    res1: String = # project title

#VSLIDE

## VarArgs

    scala> def printInts(nums:Int*) = println(nums)
    printInts: (nums: Int*)Unit

    scala> printInts(2 to 4 toList)
    <console>:9: error: type mismatch;
     found   : List[Int]
     required: Int
                  printInts(2 to 4 toList)
                                   ^

    scala> printInts(2 to 4 toList :_*)
    List(2, 3, 4)

#VSLIDE

## TCO - Tail call optimization

#VSLIDE

## Funções de ordem superior

#VSLIDE

## Closures

#HSLIDE

## Classes

#VSLIDE

## Classes normais

#VSLIDE

## Case classes

#VSLIDE

## apply()

#HSLIDE

## Objetos

#HSLIDE

## Traits

#HSLIDE

## Option

#HSLIDE

## Pattern matching

#HSLIDE

##DOJO
