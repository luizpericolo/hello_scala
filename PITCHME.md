#HSLIDE

## Hello, Scala!

#HSLIDE

## Agenda
- Porque Scala
- Hello world
- Expressões
- Variáveis
- Funções
- Option

#VSLIDE

## Agenda
- Pattern matching
- Classes
- Objetos
- Traits
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
numbers.add(2, "two");
numbers.add(3, "three");
numbers.add(4, "four");
(...)
```

```Scala
val numbers = Map[Int, String](1 -> "one", 2 -> "two", 3 -> "three", 4 -> "four");
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

## Expressões


#HSLIDE

## Variáveis

#HSLIDE

## Funções

#HSLIDE

## Option

#HSLIDE

## Pattern matching

#HSLIDE

## Classes

#HSLIDE

## Objetos

#HSLIDE

## Traits

#HSLIDE

## Programação funcional

#HSLIDE

##DOJO
