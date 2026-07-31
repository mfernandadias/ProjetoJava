package CursoJava.nelio.secao10Arrays;

public class ExemploBoxing {
    public static void main(String[] args){
        int x = 10;
        //Java faz automaticamente
        //Isso é chamado de autoboxing
        Integer objeto = x;

        //Unboxing
        //O contrário
        //Integer -> int
        Integer obj = 10;

        int y = obj;
    }
}

/*
        Aqui começa um conceito muito importante em Java
        Tipos primitivos
        int
        double
        boolean
        char
        float
        long
        ahort
        byte

Existem classes equivalentes Wrapper Classes
| Primitivo | Wrapper     |
| --------- | ----------- |
| `int`     | `Integer`   |
| `double`  | `Double`    |
| `boolean` | `Boolean`   |
| `char`    | `Character` |
| `long`    | `Long`      |
| `float`   | `Float`     |
| `short`   | `Short`     |
| `byte`    | `Byte`      |

         */