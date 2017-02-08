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
- #somos_Todos_Objetos
- Menos (código) é mais
- Paradigma funcional

#VSLIDE

## Maior expressividade

#VSLIDE

## #somos_Todos_Objetos

#VSLIDE

## Menos (código) é mais

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

    // vs

    case class Shape(name: String, numberOfSides: Int)

#VSLIDE

## Paradigma funcional
