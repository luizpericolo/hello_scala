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

#VSLIDE

## Maior expressividade

#VSLIDE

## Tudo é um objeto

#VSLIDE

## Menos (código) é mais
```Java
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
```
    // vs
```Scala
case class Shape(name: String, numberOfSides: Int)
```

#VSLIDE

## Paradigma funcional
