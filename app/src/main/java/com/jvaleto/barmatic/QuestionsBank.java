package com.jvaleto.barmatic;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

//    ejemplo de estructura juego2
    private static List<QuestionsList> Ejemplo(){

    final List<QuestionsList> questionsLists = new ArrayList<>();

    // create object of questions class and pass a questions along with options and aswer
        /* ejemplo de estructura preguntas
        final QuestionsList question1 = new QuestionsList(
                "pregunta", // pregunta
                "response1", //opcion1
                "response2", //opcion2
                "response3", //opcion3
                "respuesta4", //opcion4
                "response1", // respuesta correcta
                "" // selecet user answer
        );
        */

    final QuestionsList question1 = new QuestionsList(
            "pregunta", // pregunta
            "response1", //opcion1
            "response2", //opcion2
            "response3", //opcion3
            "respuesta4", //opcion4
            "response1", // respuesta correcta
            "" // selecet user answer
    );

    final QuestionsList question2 = new QuestionsList(
            "pregunta", // pregunta
            "response1", //opcion1
            "response2", //opcion2
            "response3", //opcion3
            "respuesta4", //opcion4
            "response1", // respuesta correcta
            "" // selecet user answer
    );

    final QuestionsList question3 = new QuestionsList(
            "pregunta", // pregunta
            "response1", //opcion1
            "response2", //opcion2
            "response3", //opcion3
            "respuesta4", //opcion4
            "response1", // respuesta correcta
            "" // selecet user answer
    );

    final QuestionsList question4 = new QuestionsList(
            "pregunta", // pregunta
            "response1", //opcion1
            "response2", //opcion2
            "response3", //opcion3
            "respuesta4", //opcion4
            "response1", // respuesta correcta
            "" // selecet user answer
    );
    final QuestionsList question5 = new QuestionsList(
            "pregunta", // pregunta
            "response1", //opcion1
            "response2", //opcion2
            "response3", //opcion3
            "respuesta4", //opcion4
            "response1", // respuesta correcta
            "" // selecet user answer
    );
    final QuestionsList question6 = new QuestionsList(
            "pregunta", // pregunta
            "response1", //opcion1
            "response2", //opcion2
            "response3", //opcion3
            "respuesta4", //opcion4
            "response1", // respuesta correcta
            "" // selecet user answer
    );
    final QuestionsList question7 = new QuestionsList(
            "pregunta", // pregunta
            "response1", //opcion1
            "response2", //opcion2
            "response3", //opcion3
            "respuesta4", //opcion4
            "response1", // respuesta correcta
            "" // selecet user answer
    );
    final QuestionsList question8 = new QuestionsList(
            "pregunta", // pregunta
            "response1", //opcion1
            "response2", //opcion2
            "response3", //opcion3
            "respuesta4", //opcion4
            "response1", // respuesta correcta
            "" // selecet user answer
    );
    final QuestionsList question9 = new QuestionsList(
            "pregunta", // pregunta
            "response1", //opcion1
            "response2", //opcion2
            "response3", //opcion3
            "respuesta4", //opcion4
            "response1", // respuesta correcta
            "" // selecet user answer
    );
    final QuestionsList question10 = new QuestionsList(
            "pregunta", // pregunta
            "response1", //opcion1
            "response2", //opcion2
            "response3", //opcion3
            "respuesta4", //opcion4
            "response1", // respuesta correcta
            "" // selecet user answer
    );

    // add all questions to List<QuestionsList>
    questionsLists.add(question1);
    questionsLists.add(question2);
    questionsLists.add(question3);
    questionsLists.add(question4);
    questionsLists.add(question5);
    questionsLists.add(question6);
    questionsLists.add(question7);
    questionsLists.add(question8);
    questionsLists.add(question9);
    questionsLists.add(question10);

    return questionsLists;
}

//    1 nivel
    private static List<QuestionsList> RazonamientoLogico1(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // create object of questions class and pass a questions along with options and aswer
        /* ejemplo de estructura preguntas
        final QuestionsList question1 = new QuestionsList(
                "pregunta", // pregunta
                "response1", //opcion1
                "response2", //opcion2
                "response3", //opcion3
                "respuesta4", //opcion4
                "response1", // respuesta correcta
                "" // selecet user answer
        );
        */

        final QuestionsList question1 = new QuestionsList(
                "Si 2 pintores tardan 6 d??as en pintar un muro. ??Cu??nto tardar??n 3 pintores en realizar el mismo trabajo?", // pregunta
                "4", //opcion1
                "3", //opcion2
                "5", //opcion3
                "1", //opcion4
                "4", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question2 = new QuestionsList(
                "En la siguiente secuencia: 5, 13, 25, 41, 61??? el n??mero que sigue es?", // pregunta
                "96", //opcion1
                "92", //opcion2
                "77", //opcion3
                "85", //opcion4
                "85", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question3 = new QuestionsList(
                "Do??a Irina necesita desactivar un candado con clave, se sabe que la clave se abre con el grupo que continua en la siguiente serie:  2Z3, 4Y5, 6X7. ??Con qu?? clave puede abrirse el candado?", // pregunta
                "8S10", //opcion1
                "8W9", //opcion2
                "8V9", //opcion3
                "8Y9", //opcion4
                "8W9", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question4 = new QuestionsList(
                "La profe Yosira necesita tres docenas de limones y cuatro y media de huevos para hacer un postre, ??cu??ntas unidades en total de limones y huevos necesita la profe para el postre?", // pregunta
                "100", //opcion1
                "60", //opcion2
                "90", //opcion3
                "86", //opcion4
                "90", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question5 = new QuestionsList(
                "Hugo, Jhosman y Liliana hicieron un total de 20 s??ndwiches. Jhosman hizo 3 veces m??s que Hugo, y Liliana hizo el doble que Jhosman. ??Cu??ntos s??ndwiches hizo Hugo?",
                "4",
                "5",
                "2",
                "6",
                "2", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question6 = new QuestionsList(
                "Si, 5 m??quinas hacen 5 art??culos en 5 minutos. ??Cu??nto tiempo necesitar??n 100 m??quinas para hacer 100 art??culos?", // pregunta
                "12 minutos",
                "5 minutos",
                "8 minutos",
                "10 minutos",
                "5 minutos", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question7 = new QuestionsList(
                "Juan tiene 56 a??os de edad. Mar??a es 6 a??os de edad mayor que Jos??. La suma de las edades de Mar??a y Jos?? es la mitad de la edad de Juan. ??Cu??ntos a??os de edad tiene Mar??a?",
                "17",
                "18",
                "34"
                ,"60",
                "17", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question8 = new QuestionsList(
                "Un restaurante est?? a 75% de su capacidad con 120 clientes. ??Cu??ntas personas habr??a en el restaurante a 100% de su capacidad?",
                "160",
                "200",
                "90",
                "120",
                "160", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question9 = new QuestionsList(
                "??Cu??ntos cuartos son seis mitades?", // pregunta
                "10 cuartos", //opcion1
                "8 cuartos", //opcion2
                "14 cuartos", //opcion3
                "12 cuartos", //opcion4
                "12 cuartos", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question10 = new QuestionsList(
                "Una madre tiene 40 a??os y su hijo tiene 10. ??Cu??ntos a??os deben pasar para que la edad de la madre sea el triple que la edad de su hijo?", // pregunta
                "10 a??os", //opcion1
                "7 a??os", //opcion2
                "4 a??os", //opcion3
                "5 a??os", //opcion4
                "5 a??os", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question11 = new QuestionsList(
                "Si 2 pintores tardan 6 d??as en pintar un muro. ??Cu??nto tardar??n 3 pintores en realizar el mismo trabajo?",
                "3",
                "1",
                "5",
                "4",
                "4", // respuesta correcta
                "" // selecet user answer
        );

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);

        return questionsLists;
    }

//    2 niveles
    private static List<QuestionsList> PensamientoAletorio1(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // create object of questions class and pass a questions along with options and aswer

       /* ejemplo de estructura preguntas
        final QuestionsList question1 = new QuestionsList(
                "pregunta", // pregunta
                "response1", //opcion1
                "response2", //opcion2
                "response3", //opcion3
                "respuesta4", //opcion4
                "response1", // respuesta correcta
                "" // selecet user answer
        );
        */

        final QuestionsList question1 = new QuestionsList(
                "Los balones de f??tbol y de baloncesto de una escuela deportiva suman 40 en total. Se sabe que hay 2 balones de baloncesto por cada 3 balones de f??tbol. ??Cu??ntos hay de cada uno?", // pregunta
                "80 de baloncesto y 120 de f??tbol", //opcion1
                "5 de baloncesto y 35 de f??tbol", //opcion2
                "16 de baloncesto y 24 de f??tbol", //opcion3
                "24 de baloncesto y 16 de f??tbol", //opcion4
                "16 de baloncesto y 24 de f??tbol", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question2 = new QuestionsList(
                "Se tiene en una urna 10 bolas enumeradas del 0 al 9. ??Cu??l es la probabilidad de sacar un 3?", // pregunta
                "10", //opcion1
                "3/10", //opcion2
                "1/9", //opcion3
                "1/10", //opcion4
                "1/10", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question3 = new QuestionsList(
                "Si 4 fichas blancas se cambian por una azul, 3 azules se cambian por una Verde y 4 verdes por una roja. ??Con 144 fichas blancas para cu??ntas verdes alcanzan?", // pregunta
                "4", //opcion1
                "12", //opcion2
                "6", //opcion3
                "3", //opcion4
                "12", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question4 = new QuestionsList(
                "Si una ficha roja equivale a 3 azules y cada azul equivale a 2 blancas, ??a cu??nto equivaldr??n 120 blancas?", // pregunta
                "20 azules", //opcion1
                "10 rojas", //opcion2
                "20 rojas", //opcion3
                "15 azules", //opcion4
                "20 roja", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question5 = new QuestionsList(
                "Con los d??gitos 1,2,3,4,5,6 y 7 ??cu??ntos n??meros de tres cifras se pueden formar si no se repiten los d??gitos?", // pregunta
                "90", //opcion1
                "48", //opcion2
                "210", //opcion3
                "196", //opcion4
                "210", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question6 = new QuestionsList(
                "En una caja hay siete pelotas azules y cuatro blancas. Se va a tomar una de ellas al azar, ??Qu?? probabilidad hay de que sea azul?", // pregunta
                "7/11", //opcion1
                "7", //opcion2
                "4/11", //opcion3
                "11", //opcion4
                "7/11", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question7 = new QuestionsList(
                "En una caja hay 30 bolas blancas y 40 bolas negras. La probabilidad de sacar una bola negra es:", // pregunta
                "3/4", //opcion1
                "4/7", //opcion2
                "4/3", //opcion3
                "5/7", //opcion4
                "4/7", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question8 = new QuestionsList(
                "Cu??ntas ensaladas diferentes se pueden preparar con tomate, cebolla, aguacate, pepino, lechuga. Si cada plato debe tener 3 ingredientes.", // pregunta
                "10", //opcion1
                "20", //opcion2
                "25", //opcion3
                "15", //opcion4
                "10", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question9 = new QuestionsList(
                "Alejandra tiene cuatro faldas y seis blusas. ??De cu??ntas maneras diferentes se puede vestir?", // pregunta
                "12", //opcion1
                "24", //opcion2
                "12", //opcion3
                "48", //opcion4
                "24", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question10 = new QuestionsList(
                "Los siguientes datos corresponden a las edades de un grupo de estudiantes del grado cuarto: 9, 9,8,9,8,7,9,10,8,9,10,10,8. En el conjunto de datos la moda est?? dada por:", // pregunta
                "7", //opcion1
                "10", //opcion2
                "8", //opcion3
                "9", //opcion4
                "9", // respuesta correcta
                "" // selecet user answer
        );


        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }
    private static List<QuestionsList> PensamientoAletorio2(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // create object of questions class and pass a questions along with options and aswer

       /* ejemplo de estructura preguntas
        final QuestionsList question1 = new QuestionsList(
                "pregunta", // pregunta
                "response1", //opcion1
                "response2", //opcion2
                "response3", //opcion3
                "respuesta4", //opcion4
                "response1", // respuesta correcta
                "" // selecet user answer
        );
        */

        final QuestionsList question1 = new QuestionsList(
                "??Cu??l de estos n??meros no puede ser una probabilidad?", // pregunta
                "20%", //opcion1
                "0,001", //opcion2
                "1,25", //opcion3
                "1/4", //opcion4
                "1,25", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question2 = new QuestionsList(
                "Diego necesita encontrar la media aritm??tica de las notas que sac?? en el primer per??odo, para esto el procedimiento que deber??a realizar es:", // pregunta
                "Sumar todos los datos y luego dividirlos entre la cantidad total de datos", //opcion1
                "Sumar todos los datos y luego dividirlos entre 10", //opcion2
                "Multiplicar todos los datos y luego dividirlos entre 10", //opcion3
                "Multiplicar los datos y luego dividirlos entre la cantidad total de datos", //opcion4
                "Sumar todos los datos y luego dividirlos entre la cantidad total de datos", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question3 = new QuestionsList(
                "Decir que dos sucesos son excluyentes es decir que son:", // pregunta
                "Dependientes", //opcion1
                "Incompatibles", //opcion2
                "Independientes", //opcion3
                "Complementarios", //opcion4
                "Incompatibles", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question4 = new QuestionsList(
                "Con los d??gitos 1,2,3,4,5,6 y 9 ??cu??ntos n??meros de tres cifras se pueden formar si los n??meros deben empezar por 2, ser m??ltiplos de 5 y no tener cifras repetidas?", // pregunta
                "5", //opcion1
                "15", //opcion2
                "7", //opcion3
                "10", //opcion4
                "5", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question5 = new QuestionsList(
                "Emiliano lanza dos monedas al aire, ??cu??l es la probabilidad de que en el lanzamiento se obtengan dos sellos?", // pregunta
                "1/4",
                "1/2",
                "4",
                "2",
                "1/4", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question6 = new QuestionsList(
                "Las notas de otro estudiante en los dos primeros ex??menes fueron 2,0 y 3,0 respectivamente. El estudiante aprob?? el curso ??Cu??l fue la nota m??nima que este estudiante pudo obtener en el tercer examen?", // pregunta
                "3,0",
                "2,0",
                "5,0",
                "4,0",
                "4,0", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question7 = new QuestionsList(
                "Una baraja contiene 3 cartas rojas, 7 cartas verdes y 10 cartas blancas. Si se extrae una carta de la baraja al azar, ??cu??l es la probabilidad de que esta sea blanca?", // pregunta
                "1/4", //opcion1
                "1/2", //opcion2
                "1", //opcion3
                "1/3", //opcion4
                "1/2", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question8 = new QuestionsList(
                "En estad??stica, la medida de centralizaci??n que divide a la muestra en dos partes iguales de denomina:", // pregunta
                "Mediana", //opcion1
                "Cuartil", //opcion2
                "Media", //opcion3
                "Moda", //opcion4
                "Mediana", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question9 = new QuestionsList(
                "Un colegio necesita enviar 5 estudiantes como representantes a un foro sobre la contaminaci??n del medio ambiente. Se decidi?? que 2 estudiantes sean de grado d??cimo y 3 de grado und??cimo. En d??cimo hay 5 estudiantes preparados para el foro y en und??cimo hay 4. ??Cu??ntos grupos diferentes pueden formarse para enviar al foro?", // pregunta
                "14", //opcion1
                "20", //opcion2
                "40", //opcion3
                "9", //opcion4
                "40", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question10 = new QuestionsList(
                "En la entrada a un parque de diversiones a Juan le cobraron $2.500 y a Adriana le cobraron $3.150. ??En qu?? porcentaje aument?? el precio de la entrada de Adriana respecto al precio de la entrada de Juan?", // pregunta
                "26%", //opcion1
                "30%", //opcion2
                "19%", //opcion3
                "20%", //opcion4
                "26%", // respuesta correcta
                "" // selecet user answer
        );



        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

//  1 nivel
    private static List<QuestionsList> EducacionFinanciera1(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // create object of questions class and pass a questions along with options and aswer
        /* ejemplo de estructura preguntas
        final QuestionsList question1 = new QuestionsList(
                "pregunta", // pregunta
                "response1", //opcion1
                "response2", //opcion2
                "response3", //opcion3
                "respuesta4", //opcion4
                "response1", // respuesta correcta
                "" // selecet user answer
        );
        */

        final QuestionsList question1 = new QuestionsList(
                "En econom??a, el t??rmino inflaci??n se refiere a:",
                "La variaci??n de los costos de los productos en una econom??a",
                "El crecimiento generalizado y continuo de los precios de los bienes y servicios de una econom??a.",
                "La posibilidad de invertir y generar m??s ingresos ",
                "La relaci??n entre la rentabilidad y el capital en una econom??a",
                "El crecimiento generalizado y continuo de los precios de los bienes y servicios de una econom??a.", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question2 = new QuestionsList(
                "El se??or Ram??rez pidi?? prestado al Banco Agrario la suma de $2???000.000 para ser pagados en un plazo de 6 meses. Si la tasa de inter??s cobrada es del 2% mensual, ??qu?? cantidad debe pagar el se??or Ram??rez al final del plazo?",
                "$2???400.000",
                "$2???530.000",
                "$2???380.000",
                "$2???240.000",
                "$2???240.000", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question3 = new QuestionsList(
                "Marcos le presta $ 800.000 a Daniel para comprar un IPhone y le pone como condici??n que a los cuatro meses le devuelva la suma de $960.000. En esta transacci??n ??Cu??l es la tasa de inter??s mensual que cobra Marcos?",
                "10%",
                "5%",
                "15%",
                "20%",
                "5%", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question4 = new QuestionsList(
                "Juan realiza un pr??stamo en una entidad bancaria donde le cobran un inter??s del 1% mensual sobre el capital solicitado. Si el pr??stamo fue por un monto de $100.000, ??Cu??nto dinero debe parar al cabo de 6 meses?",
                "$112.000",
                "$110.000",
                "$101.000",
                "$106.000",
                "$106.000", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question5 = new QuestionsList(
                "Samuel trabaja en una empresa donde devenga $3???000.000 mensuales, si le hacen una deducci??n del 8% para el pago de la salud y la pensi??n, ??Cu??nto dinero le queda disponible a Samuel?",
                "$2???500.000",
                "$2???450.000",
                "$2???760.000",
                "$2???100.000",
                "$2???760.000", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question6 = new QuestionsList(
                "Susana y Miguel deciden hacer un ahorro juntos, Miguel aporta $ 500.000 y Susana la mitad de lo que aporta Miguel. Si por el ahorro el banco les paga el 20% en un a??o ??Cu??nto tendr??n ahorrado al cabo del primer a??o?",
                "$800.000",
                "$900.000",
                "$980.000",
                "$850.000",
                "$900.000", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question7 = new QuestionsList(
                "Mar??a trabaja en una empresa donde tiene un salario b??sico de $ 1???500.000, pero le pagan unas horas extras, si por cada hora extra le pagan el 1% del sueldo y trabajo 10 horas en un mes, ??cu??nto ser?? el devengado total?",
                "$1???950.000",
                "$1???800.000",
                "$1???650.000",
                "$1???700.000",
                "$1???650.000", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question8 = new QuestionsList(
                "Para realizar una fiesta se cuenta con un presupuesto de $1???000.000, de este monto el 50% ser?? invertido en la comida y el 50% del resto en licor y el sobrante en otros gastos. ??Cu??nto ser?? invertido en otros gastos?",
                "$250.000",
                "$230.000",
                "$300.000",
                "$200.000",
                "$250.000", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question9 = new QuestionsList(
                "Un prestamista informal realiza pr??stamos cobrando una tasa de inter??s del 10% mensual sobre el capital, si Jos?? realiza un pr??stamo por $1???000.000 para pagarlo en 10 meses en cuotas iguales mensuales cada mes. ??Cu??nto debe pagar mensual?",
                "$100.000",
                "$200.000",
                "$400.000",
                "$300.000",
                "$200.000", // respuesta correcta
                "" // selecet user answer
        );

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);

        return questionsLists;
    }

//    1 niveles
    private static List<QuestionsList> PensNumyVariacional1(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // create object of questions class and pass a questions along with options and aswer
        /* ejemplo de estructura preguntas
        final QuestionsList question1 = new QuestionsList(
                "pregunta", // pregunta
                "response1", //opcion1
                "response2", //opcion2
                "response3", //opcion3
                "respuesta4", //opcion4
                "response1", // respuesta correcta
                "" // selecet user answer
        );
        */

        final QuestionsList question1 = new QuestionsList(
                "Al calcular el 20% del 50% de 800, se obtiene:",
                "40",
                "50",
                "80",
                "60",
                "80", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question2 = new QuestionsList(
                "5 autobuses transportan 800 pasajeros en 4 viajes. ??Cu??ntos viajes son necesarios para transportar 400 pasajeros usando 2 autobuses?",
                "3 viajes",
                "5 viajes",
                "6 viajes",
                "7 viajes",
                "5 viajes", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question3 = new QuestionsList(
                "Al resolver la operaci??n: 2 + {3 ??? [(5 + 6) * (3 ??? 7)]}",
                "50",
                "49",
                "60",
                "48",
                "49", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question4 = new QuestionsList(
                "M??nica se monta en el ascensor en la planta baja de su edificio, el ascensor sube 5 pisos, despu??s baja 3, sube 5, baja 8, sube 10, sube 5 y baja 6. ??En qu?? piso est?? M??nica?",
                "Quinto piso",
                "Sexto piso",
                "S??ptimo piso",
                "Octavo piso",
                "Octavo piso", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question5 = new QuestionsList(
                "Un estudiante de grado d??cimo presenta las siguientes 5 notas en matem??ticas: Nota 1: 3,6. Nota 2: 4,4. Nota 3: 3,2. Nota 4: 5,0. Nota 5: 3,8. Si todas las notas tienen el mismo porcentaje sobre la nota final, ??Cu??l es la nota definitiva del estudiante?",
                "3,8",
                "4,0",
                "4,2",
                "3,6",
                "4,0", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question6 = new QuestionsList(
                "El triple de un n??mero m??s 8, es igual a siete veces el n??mero. ??Cu??l es el n??mero?",
                "4",
                "3",
                "2",
                "5",
                "2", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question7 = new QuestionsList(
                "5 cuadernos y 8 l??pices cuestan $11500 y 3 cuadernos y 5 l??pices cuestan $7000. ??Cu??nto cuesta cada l??piz y cada cuaderno?",
                "Cada cuaderno $1.500 y cada l??piz $500",
                "Cada cuaderno $1.300 y cada l??piz $750",
                "Cada cuaderno $1.850 y cada l??piz $700",
                "Cada cuaderno $1.700 y cada l??piz $800",
                "Cada cuaderno $1.500 y cada l??piz $500", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question8 = new QuestionsList(
                " En un museo, la visita es guiada y entran 25 personas cada 25 minutos. La visita dura 90 minutos. El primer grupo entra a las 9:00 am ??Cu??ntos visitantes hay dentro del museo a las 10:00 am?",
                "85 personas",
                "80 personas",
                "70 personas",
                "75 personas",
                "75 personas", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question9 = new QuestionsList(
                "El n??mero que contin??a en la sucesi??n 1, 1, 1, 3, 5, 9, 17??? es",
                "29",
                "31",
                "20",
                "38",
                "31", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question10 = new QuestionsList(
                "Para construir una pared de 12 m de largo y 5 m de alto se necesitan 400 ladrillos. ??qu?? altura tendr?? la pared, si tuviera 4m de largo y se contara solo con 400 ladrillos?",
                "Tendr?? una altura de 8,2 m",
                "Tendr?? una altura de 6,8 m",
                "Tendr?? una altura de 7,5 m",
                "Tendr?? una altura de 9,4 m",
                "Tendr?? una altura de 7,5 m", // respuesta correcta
                "" // selecet user answer
        );

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

//    1 niveles
    private static List<QuestionsList> PensMetriyGeome1(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // create object of questions class and pass a questions along with options and aswer
        /* ejemplo de estructura preguntas
        final QuestionsList question1 = new QuestionsList(
                "pregunta", // pregunta
                "response1", //opcion1
                "response2", //opcion2
                "response3", //opcion3
                "respuesta4", //opcion4
                "response1", // respuesta correcta
                "" // selecet user answer
        );
        */

        final QuestionsList question1 = new QuestionsList(
                "Al cuadril??tero que tiene sus lados opuestos iguales y paralelos se le denomina:",
                "Trapecio",
                "Trapezoide",
                "Cubo",
                "Paralelogramo",
                "Paralelogra", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question2 = new QuestionsList(
                "Al segmento perpendicular trazado desde el v??rtice de un tri??ngulo al lado opuesto o a su prolongaci??n se le denomina:",
                "Mediatriz",
                "Altura",
                "Mediana",
                "Bisectriz",

                "Altura", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question3 = new QuestionsList(
                "Al segmento trazado desde el v??rtice de un tri??ngulo al punto medio del lado opuesto se denomina:",
                "Bisectriz",
                "Mediatriz",
                "Mediana",
                "Altura",
                "Mediana", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question4 = new QuestionsList(
                "Cuando las agujas del reloj marcan las 3:00 pm, forman un ??ngulo:",
                "Obtuso",
                "Agudo",
                "Llano",
                "Recto",

                "Recto", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question5 = new QuestionsList(
                "Al tri??ngulo que tiene los tres lados desiguales se le llama:",
                "Rect??ngulo",
                "Equil??tero",
                "Is??sceles",
                "Escaleno",
                "Escaleno", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question6 = new QuestionsList(
                "A la recta perpendicular al segmento que pasa por su punto medio se le denomina:",
                "Bisectriz",
                "Directriz",
                "Mediatriz",
                "Incentro",
                "Mediatriz", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question7 = new QuestionsList(
                "Al trazar la bisectriz de un ??ngulo se obtienen:",
                "Un ??ngulo doble que el otro",
                "Dos ??ngulos iguales",
                "Dos ??ngulos suplementarios",
                "Dos ??ngulos complementarios",
                "Dos ??ngulos iguales", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question8 = new QuestionsList(
                "Cu??ntos lados tiene un pentadec??gono",
                "5",
                "15",
                "10",
                "20",
                "15", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question9 = new QuestionsList(
                "Si en un tri??ngulo rect??ngulo, la medida de uno de los ??ngulos agudos es 38 grados, ??Cu??l es la medida del tercer ??ngulo?",
                "38 grados",
                "52 grados",
                "90 grados",
                "60 grados",
                "52 grados", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question10 = new QuestionsList(
                "Dados dos pol??gonos con la misma ??rea y per??metro, se puede afirmar que:",
                "Tienen siempre el mismo n??mero de lados",
                "Tienen siempre la misma forma",
                "Pueden no ser iguales",
                "Tienen siempre la misma medida",
                "Pueden no ser iguales", // respuesta correcta
                "" // selecet user answer
        );

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    private static List<QuestionsList> PensMetriyGeome2(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // create object of questions class and pass a questions along with options and aswer
        /* ejemplo de estructura preguntas
        final QuestionsList question1 = new QuestionsList(
                "pregunta", // pregunta
                "response1", //opcion1
                "response2", //opcion2
                "response3", //opcion3
                "respuesta4", //opcion4
                "response1", // respuesta correcta
                "" // selecet user answer
        );
        */

        final QuestionsList question1 = new QuestionsList(
                "Si un cuadrado, un tri??ngulo y un rect??ngulo tiene cada uno 24 cm de per??metro.  Se puede afirmar que:",

                "El cuadrado es la figura que tiene mayor ??rea",
                "El tri??ngulo es la figura que tiene mayor ??rea",
                "El rect??ngulo es la figura que tiene mayor ??rea",
                "Todas las figuras tienen igual ??rea",
                "El cuadrado es la figura que tiene mayor ??rea", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question2 = new QuestionsList(
                "La suma de los ??ngulos exteriores de un tri??ngulo cualquiera es igual a:",
                "90??",
                "180??",
                "360??",
                "No se pueden sumar",
                "360??", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question3 = new QuestionsList(
                "El largo de un rect??ngulo es el doble del ancho.  El per??metro es de 60cm. ??Cu??les son las medidas del largo y del ancho del rect??ngulo?",
                "7 y 14 cm",
                "8 y 16 cm",
                "10 y 20 cm",
                "12 y 24 cm",
                "10 y 20 cm", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question4 = new QuestionsList(
                "Un trapezoide es un cuadril??tero que tiene:",
                "Un par de lados paralelos",
                "Un ??ngulo recto",
                "Dos pares de lados paralelos",
                "Ning??n par de lados paralelos",
                "Ning??n par de lados paralelos", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question5 = new QuestionsList(
                "La suma de los ??ngulos internos de un cuadril??tero es igual a:",
                "360??",
                "270??",
                "100??",
                "180??",
                "360??", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question6 = new QuestionsList(
                "Un alba??il tiene que embaldosar un sal??n de forma cuadrada que tiene de lado 8 metros; si en cada metro cuadrado se utilizan 16 baldosas, ??Cu??ntas baldosas son necesarias para cubrir todo el sal??n?",
                "1024 baldosas",
                "1124 baldosas",
                "1000 baldosas",
                "924 baldosas",
                "1024 baldosas", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question7 = new QuestionsList(
                "El punto donde se cortan las tres bisectrices de los ??ngulos internos de un tri??ngulo se denomina: ",
                "Cincuncentro",
                "Incentro",
                "Baricentro",
                "Ortocentro",
                "Incentro", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question8 = new QuestionsList(
                "A cu??ntos cm equivalen 2,5 metros",
                "0,25 cm",
                "25 cm",
                "250 cm",
                "2500 cm",
                "250 cm", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question9 = new QuestionsList(
                "En un tri??ngulo rect??ngulo la medida de la hipotenusa es de 5 cm, mientras que uno de sus catetos mide 3 cm, ??cu??l es la medida del otro cateto?",
                "4.2 cm",
                "3.9 cm",
                "4 cm",
                "Ninguna de las anteriores",
                "4 cm", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question10 = new QuestionsList(
                "Si en un rect??ngulo se aumenta la longitud de uno de sus lados en 100 %, su ??rea",
                "Aumenta en un 50 %",
                "Aumenta en 100 unidades",
                "No cambia",
                "Se duplica",
                "Se duplica", // respuesta correcta
                "" // selecet user answer
        );

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }


    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "Razonamiento L??gico":
                return RazonamientoLogico1();
            case "Pensamiento Aleatorio":
                return PensamientoAletorio1();
            case "Educaci??n Financiera":
                return EducacionFinanciera1();
            case "Pens. Num??rico y Variacional":
                return PensNumyVariacional1();
            default:
                return PensMetriyGeome1();
        }
    }
}
