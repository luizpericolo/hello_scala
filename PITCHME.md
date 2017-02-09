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
- Programação funcional
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

#VSLIDE

## val - Variáveis imutáveis

#VSLIDE

## lazy - Variáveis "preguiçosas"

#HSLIDE

## Funções

#VSLIDE

## cbn e cbv - Avaliação de parâmetros

#VSLIDE

## Funções anônimas

#VSLIDE

## Aplicação parcial

#VSLIDE

## Currying

#VSLIDE

## VarArgs

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

## Programação funcional

#VSLIDE

## Vantagens

#VSLIDE

## Funções puras

#VSLIDE

## map / flatMap

#VSLIDE

## filter / fold

#VSLIDE

## reduce

#HSLIDE

##DOJO
