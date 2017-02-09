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

- Maior expressividade
- Tudo é um objeto
- Menos (código) é mais
- Paradigma funcional
- TEM REPL

#VSLIDE

## Maior expressividade

#VSLIDE

## Tudo é um objeto

#VSLIDE

## Menos (código) é mais - I
```Java
// Java
public class Shape {
    private String name;
    private Integer numberOfSides;
    public Shape(String name, Integer numberOfSides) {
        this.name = name;
        this.numberOfSides = numberOfSides;
    }
    public String getName() { return this.name; }
    public Integer numberOfSides { return this.numberOfSides; }
    public void setName(String name) { this.name = name; }
    public void setNumberOfsides(Integer numberOfsides) { this.numberOfSides = numberOfSides; }
}
Shape square = new Shape("square", 4);
```
```Scala
// Scala
case class Shape(name: String, numberOfSides: Int)
val square = Shape("square", 4)
```

## Menos (código) é mais - II
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

#VSLIDE

## Paradigma funcional
