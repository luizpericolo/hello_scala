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
- Gatling

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

#VSLIDE

##  \\o/ REPL \\o/

- tirar dúvidas
- prototipar idéias
- mostrar como scala é ~~melhor~~ mais expressiva do que Java

#VSLIDE

## Gatling

- Cenários só podem ser descritos em Scala
