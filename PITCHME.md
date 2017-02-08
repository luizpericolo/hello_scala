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
- Menos (código) é mais
- Faz pensar em PF

#VSLIDE

## Maior expressividade

#VSLIDE

## #somosTodosObjetos

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

## Faz pensar em PF
