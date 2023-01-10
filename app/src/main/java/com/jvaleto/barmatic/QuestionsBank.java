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
                "Si 2 pintores tardan 6 días en pintar un muro. ¿Cuánto tardarán 3 pintores en realizar el mismo trabajo?", // pregunta
                "4", //opcion1
                "3", //opcion2
                "5", //opcion3
                "1", //opcion4
                "4", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question2 = new QuestionsList(
                "En la siguiente secuencia: 5, 13, 25, 41, 61… el número que sigue es?", // pregunta
                "96", //opcion1
                "92", //opcion2
                "77", //opcion3
                "85", //opcion4
                "85", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question3 = new QuestionsList(
                "Doña Irina necesita desactivar un candado con clave, se sabe que la clave se abre con el grupo que continua en la siguiente serie:  2Z3, 4Y5, 6X7. ¿Con qué clave puede abrirse el candado?", // pregunta
                "8S10", //opcion1
                "8W9", //opcion2
                "8V9", //opcion3
                "8Y9", //opcion4
                "8W9", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question4 = new QuestionsList(
                "La profe Yosira necesita tres docenas de limones y cuatro y media de huevos para hacer un postre, ¿cuántas unidades en total de limones y huevos necesita la profe para el postre?", // pregunta
                "100", //opcion1
                "60", //opcion2
                "90", //opcion3
                "86", //opcion4
                "90", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question5 = new QuestionsList(
                "Hugo, Jhosman y Liliana hicieron un total de 20 sándwiches. Jhosman hizo 3 veces más que Hugo, y Liliana hizo el doble que Jhosman. ¿Cuántos sándwiches hizo Hugo?",
                "4",
                "5",
                "2",
                "6",
                "2", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question6 = new QuestionsList(
                "Si, 5 máquinas hacen 5 artículos en 5 minutos. ¿Cuánto tiempo necesitarán 100 máquinas para hacer 100 artículos?", // pregunta
                "12 minutos",
                "5 minutos",
                "8 minutos",
                "10 minutos",
                "5 minutos", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question7 = new QuestionsList(
                "Juan tiene 56 años de edad. María es 6 años de edad mayor que José. La suma de las edades de María y José es la mitad de la edad de Juan. ¿Cuántos años de edad tiene María?",
                "17",
                "18",
                "34"
                ,"60",
                "17", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question8 = new QuestionsList(
                "Un restaurante está a 75% de su capacidad con 120 clientes. ¿Cuántas personas habría en el restaurante a 100% de su capacidad?",
                "160",
                "200",
                "90",
                "120",
                "160", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question9 = new QuestionsList(
                "¿Cuántos cuartos son seis mitades?", // pregunta
                "10 cuartos", //opcion1
                "8 cuartos", //opcion2
                "14 cuartos", //opcion3
                "12 cuartos", //opcion4
                "12 cuartos", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question10 = new QuestionsList(
                "Una madre tiene 40 años y su hijo tiene 10. ¿Cuántos años deben pasar para que la edad de la madre sea el triple que la edad de su hijo?", // pregunta
                "10 años", //opcion1
                "7 años", //opcion2
                "4 años", //opcion3
                "5 años", //opcion4
                "5 años", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question11 = new QuestionsList(
                "Si 2 pintores tardan 6 días en pintar un muro. ¿Cuánto tardarán 3 pintores en realizar el mismo trabajo?",
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
                "Los balones de fútbol y de baloncesto de una escuela deportiva suman 40 en total. Se sabe que hay 2 balones de baloncesto por cada 3 balones de fútbol. ¿Cuántos hay de cada uno?", // pregunta
                "80 de baloncesto y 120 de fútbol", //opcion1
                "5 de baloncesto y 35 de fútbol", //opcion2
                "16 de baloncesto y 24 de fútbol", //opcion3
                "24 de baloncesto y 16 de fútbol", //opcion4
                "16 de baloncesto y 24 de fútbol", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question2 = new QuestionsList(
                "Se tiene en una urna 10 bolas enumeradas del 0 al 9. ¿Cuál es la probabilidad de sacar un 3?", // pregunta
                "10", //opcion1
                "3/10", //opcion2
                "1/9", //opcion3
                "1/10", //opcion4
                "1/10", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question3 = new QuestionsList(
                "Si 4 fichas blancas se cambian por una azul, 3 azules se cambian por una Verde y 4 verdes por una roja. ¿Con 144 fichas blancas para cuántas verdes alcanzan?", // pregunta
                "4", //opcion1
                "12", //opcion2
                "6", //opcion3
                "3", //opcion4
                "12", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question4 = new QuestionsList(
                "Si una ficha roja equivale a 3 azules y cada azul equivale a 2 blancas, ¿a cuánto equivaldrán 120 blancas?", // pregunta
                "20 azules", //opcion1
                "10 rojas", //opcion2
                "20 rojas", //opcion3
                "15 azules", //opcion4
                "20 roja", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question5 = new QuestionsList(
                "Con los dígitos 1,2,3,4,5,6 y 7 ¿cuántos números de tres cifras se pueden formar si no se repiten los dígitos?", // pregunta
                "90", //opcion1
                "48", //opcion2
                "210", //opcion3
                "196", //opcion4
                "210", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question6 = new QuestionsList(
                "En una caja hay siete pelotas azules y cuatro blancas. Se va a tomar una de ellas al azar, ¿Qué probabilidad hay de que sea azul?", // pregunta
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
                "Cuántas ensaladas diferentes se pueden preparar con tomate, cebolla, aguacate, pepino, lechuga. Si cada plato debe tener 3 ingredientes.", // pregunta
                "10", //opcion1
                "20", //opcion2
                "25", //opcion3
                "15", //opcion4
                "10", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question9 = new QuestionsList(
                "Alejandra tiene cuatro faldas y seis blusas. ¿De cuántas maneras diferentes se puede vestir?", // pregunta
                "12", //opcion1
                "24", //opcion2
                "12", //opcion3
                "48", //opcion4
                "24", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question10 = new QuestionsList(
                "Los siguientes datos corresponden a las edades de un grupo de estudiantes del grado cuarto: 9, 9,8,9,8,7,9,10,8,9,10,10,8. En el conjunto de datos la moda está dada por:", // pregunta
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
                "¿Cuál de estos números no puede ser una probabilidad?", // pregunta
                "20%", //opcion1
                "0,001", //opcion2
                "1,25", //opcion3
                "1/4", //opcion4
                "1,25", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question2 = new QuestionsList(
                "Diego necesita encontrar la media aritmética de las notas que sacó en el primer período, para esto el procedimiento que debería realizar es:", // pregunta
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
                "Con los dígitos 1,2,3,4,5,6 y 9 ¿cuántos números de tres cifras se pueden formar si los números deben empezar por 2, ser múltiplos de 5 y no tener cifras repetidas?", // pregunta
                "5", //opcion1
                "15", //opcion2
                "7", //opcion3
                "10", //opcion4
                "5", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question5 = new QuestionsList(
                "Emiliano lanza dos monedas al aire, ¿cuál es la probabilidad de que en el lanzamiento se obtengan dos sellos?", // pregunta
                "1/4",
                "1/2",
                "4",
                "2",
                "1/4", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question6 = new QuestionsList(
                "Las notas de otro estudiante en los dos primeros exámenes fueron 2,0 y 3,0 respectivamente. El estudiante aprobó el curso ¿Cuál fue la nota mínima que este estudiante pudo obtener en el tercer examen?", // pregunta
                "3,0",
                "2,0",
                "5,0",
                "4,0",
                "4,0", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question7 = new QuestionsList(
                "Una baraja contiene 3 cartas rojas, 7 cartas verdes y 10 cartas blancas. Si se extrae una carta de la baraja al azar, ¿cuál es la probabilidad de que esta sea blanca?", // pregunta
                "1/4", //opcion1
                "1/2", //opcion2
                "1", //opcion3
                "1/3", //opcion4
                "1/2", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question8 = new QuestionsList(
                "En estadística, la medida de centralización que divide a la muestra en dos partes iguales de denomina:", // pregunta
                "Mediana", //opcion1
                "Cuartil", //opcion2
                "Media", //opcion3
                "Moda", //opcion4
                "Mediana", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question9 = new QuestionsList(
                "Un colegio necesita enviar 5 estudiantes como representantes a un foro sobre la contaminación del medio ambiente. Se decidió que 2 estudiantes sean de grado décimo y 3 de grado undécimo. En décimo hay 5 estudiantes preparados para el foro y en undécimo hay 4. ¿Cuántos grupos diferentes pueden formarse para enviar al foro?", // pregunta
                "14", //opcion1
                "20", //opcion2
                "40", //opcion3
                "9", //opcion4
                "40", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question10 = new QuestionsList(
                "En la entrada a un parque de diversiones a Juan le cobraron $2.500 y a Adriana le cobraron $3.150. ¿En qué porcentaje aumentó el precio de la entrada de Adriana respecto al precio de la entrada de Juan?", // pregunta
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
                "En economía, el término inflación se refiere a:",
                "La variación de los costos de los productos en una economía",
                "El crecimiento generalizado y continuo de los precios de los bienes y servicios de una economía.",
                "La posibilidad de invertir y generar más ingresos ",
                "La relación entre la rentabilidad y el capital en una economía",
                "El crecimiento generalizado y continuo de los precios de los bienes y servicios de una economía.", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question2 = new QuestionsList(
                "El señor Ramírez pidió prestado al Banco Agrario la suma de $2’000.000 para ser pagados en un plazo de 6 meses. Si la tasa de interés cobrada es del 2% mensual, ¿qué cantidad debe pagar el señor Ramírez al final del plazo?",
                "$2’400.000",
                "$2’530.000",
                "$2’380.000",
                "$2’240.000",
                "$2’240.000", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question3 = new QuestionsList(
                "Marcos le presta $ 800.000 a Daniel para comprar un IPhone y le pone como condición que a los cuatro meses le devuelva la suma de $960.000. En esta transacción ¿Cuál es la tasa de interés mensual que cobra Marcos?",
                "10%",
                "5%",
                "15%",
                "20%",
                "5%", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question4 = new QuestionsList(
                "Juan realiza un préstamo en una entidad bancaria donde le cobran un interés del 1% mensual sobre el capital solicitado. Si el préstamo fue por un monto de $100.000, ¿Cuánto dinero debe parar al cabo de 6 meses?",
                "$112.000",
                "$110.000",
                "$101.000",
                "$106.000",
                "$106.000", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question5 = new QuestionsList(
                "Samuel trabaja en una empresa donde devenga $3’000.000 mensuales, si le hacen una deducción del 8% para el pago de la salud y la pensión, ¿Cuánto dinero le queda disponible a Samuel?",
                "$2’500.000",
                "$2’450.000",
                "$2’760.000",
                "$2’100.000",
                "$2’760.000", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question6 = new QuestionsList(
                "Susana y Miguel deciden hacer un ahorro juntos, Miguel aporta $ 500.000 y Susana la mitad de lo que aporta Miguel. Si por el ahorro el banco les paga el 20% en un año ¿Cuánto tendrán ahorrado al cabo del primer año?",
                "$800.000",
                "$900.000",
                "$980.000",
                "$850.000",
                "$900.000", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question7 = new QuestionsList(
                "María trabaja en una empresa donde tiene un salario básico de $ 1’500.000, pero le pagan unas horas extras, si por cada hora extra le pagan el 1% del sueldo y trabajo 10 horas en un mes, ¿cuánto será el devengado total?",
                "$1’950.000",
                "$1’800.000",
                "$1’650.000",
                "$1’700.000",
                "$1’650.000", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question8 = new QuestionsList(
                "Para realizar una fiesta se cuenta con un presupuesto de $1’000.000, de este monto el 50% será invertido en la comida y el 50% del resto en licor y el sobrante en otros gastos. ¿Cuánto será invertido en otros gastos?",
                "$250.000",
                "$230.000",
                "$300.000",
                "$200.000",
                "$250.000", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question9 = new QuestionsList(
                "Un prestamista informal realiza préstamos cobrando una tasa de interés del 10% mensual sobre el capital, si José realiza un préstamo por $1’000.000 para pagarlo en 10 meses en cuotas iguales mensuales cada mes. ¿Cuánto debe pagar mensual?",
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
                "5 autobuses transportan 800 pasajeros en 4 viajes. ¿Cuántos viajes son necesarios para transportar 400 pasajeros usando 2 autobuses?",
                "3 viajes",
                "5 viajes",
                "6 viajes",
                "7 viajes",
                "5 viajes", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question3 = new QuestionsList(
                "Al resolver la operación: 2 + {3 – [(5 + 6) * (3 – 7)]}",
                "50",
                "49",
                "60",
                "48",
                "49", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question4 = new QuestionsList(
                "Mónica se monta en el ascensor en la planta baja de su edificio, el ascensor sube 5 pisos, después baja 3, sube 5, baja 8, sube 10, sube 5 y baja 6. ¿En qué piso está Mónica?",
                "Quinto piso",
                "Sexto piso",
                "Séptimo piso",
                "Octavo piso",
                "Octavo piso", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question5 = new QuestionsList(
                "Un estudiante de grado décimo presenta las siguientes 5 notas en matemáticas: Nota 1: 3,6. Nota 2: 4,4. Nota 3: 3,2. Nota 4: 5,0. Nota 5: 3,8. Si todas las notas tienen el mismo porcentaje sobre la nota final, ¿Cuál es la nota definitiva del estudiante?",
                "3,8",
                "4,0",
                "4,2",
                "3,6",
                "4,0", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question6 = new QuestionsList(
                "El triple de un número más 8, es igual a siete veces el número. ¿Cuál es el número?",
                "4",
                "3",
                "2",
                "5",
                "2", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question7 = new QuestionsList(
                "5 cuadernos y 8 lápices cuestan $11500 y 3 cuadernos y 5 lápices cuestan $7000. ¿Cuánto cuesta cada lápiz y cada cuaderno?",
                "Cada cuaderno $1.500 y cada lápiz $500",
                "Cada cuaderno $1.300 y cada lápiz $750",
                "Cada cuaderno $1.850 y cada lápiz $700",
                "Cada cuaderno $1.700 y cada lápiz $800",
                "Cada cuaderno $1.500 y cada lápiz $500", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question8 = new QuestionsList(
                " En un museo, la visita es guiada y entran 25 personas cada 25 minutos. La visita dura 90 minutos. El primer grupo entra a las 9:00 am ¿Cuántos visitantes hay dentro del museo a las 10:00 am?",
                "85 personas",
                "80 personas",
                "70 personas",
                "75 personas",
                "75 personas", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question9 = new QuestionsList(
                "El número que continúa en la sucesión 1, 1, 1, 3, 5, 9, 17… es",
                "29",
                "31",
                "20",
                "38",
                "31", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question10 = new QuestionsList(
                "Para construir una pared de 12 m de largo y 5 m de alto se necesitan 400 ladrillos. ¿qué altura tendrá la pared, si tuviera 4m de largo y se contara solo con 400 ladrillos?",
                "Tendrá una altura de 8,2 m",
                "Tendrá una altura de 6,8 m",
                "Tendrá una altura de 7,5 m",
                "Tendrá una altura de 9,4 m",
                "Tendrá una altura de 7,5 m", // respuesta correcta
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
                "Al cuadrilátero que tiene sus lados opuestos iguales y paralelos se le denomina:",
                "Trapecio",
                "Trapezoide",
                "Cubo",
                "Paralelogramo",
                "Paralelogra", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question2 = new QuestionsList(
                "Al segmento perpendicular trazado desde el vértice de un triángulo al lado opuesto o a su prolongación se le denomina:",
                "Mediatriz",
                "Altura",
                "Mediana",
                "Bisectriz",

                "Altura", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question3 = new QuestionsList(
                "Al segmento trazado desde el vértice de un triángulo al punto medio del lado opuesto se denomina:",
                "Bisectriz",
                "Mediatriz",
                "Mediana",
                "Altura",
                "Mediana", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question4 = new QuestionsList(
                "Cuando las agujas del reloj marcan las 3:00 pm, forman un ángulo:",
                "Obtuso",
                "Agudo",
                "Llano",
                "Recto",

                "Recto", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question5 = new QuestionsList(
                "Al triángulo que tiene los tres lados desiguales se le llama:",
                "Rectángulo",
                "Equilátero",
                "Isósceles",
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
                "Al trazar la bisectriz de un ángulo se obtienen:",
                "Un ángulo doble que el otro",
                "Dos ángulos iguales",
                "Dos ángulos suplementarios",
                "Dos ángulos complementarios",
                "Dos ángulos iguales", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question8 = new QuestionsList(
                "Cuántos lados tiene un pentadecágono",
                "5",
                "15",
                "10",
                "20",
                "15", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question9 = new QuestionsList(
                "Si en un triángulo rectángulo, la medida de uno de los ángulos agudos es 38 grados, ¿Cuál es la medida del tercer ángulo?",
                "38 grados",
                "52 grados",
                "90 grados",
                "60 grados",
                "52 grados", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question10 = new QuestionsList(
                "Dados dos polígonos con la misma área y perímetro, se puede afirmar que:",
                "Tienen siempre el mismo número de lados",
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
                "Si un cuadrado, un triángulo y un rectángulo tiene cada uno 24 cm de perímetro.  Se puede afirmar que:",

                "El cuadrado es la figura que tiene mayor área",
                "El triángulo es la figura que tiene mayor área",
                "El rectángulo es la figura que tiene mayor área",
                "Todas las figuras tienen igual área",
                "El cuadrado es la figura que tiene mayor área", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question2 = new QuestionsList(
                "La suma de los ángulos exteriores de un triángulo cualquiera es igual a:",
                "90º",
                "180º",
                "360º",
                "No se pueden sumar",
                "360º", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question3 = new QuestionsList(
                "El largo de un rectángulo es el doble del ancho.  El perímetro es de 60cm. ¿Cuáles son las medidas del largo y del ancho del rectángulo?",
                "7 y 14 cm",
                "8 y 16 cm",
                "10 y 20 cm",
                "12 y 24 cm",
                "10 y 20 cm", // respuesta correcta
                "" // selecet user answer
        );

        final QuestionsList question4 = new QuestionsList(
                "Un trapezoide es un cuadrilátero que tiene:",
                "Un par de lados paralelos",
                "Un ángulo recto",
                "Dos pares de lados paralelos",
                "Ningún par de lados paralelos",
                "Ningún par de lados paralelos", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question5 = new QuestionsList(
                "La suma de los ángulos internos de un cuadrilátero es igual a:",
                "360º",
                "270º",
                "100º",
                "180º",
                "360º", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question6 = new QuestionsList(
                "Un albañil tiene que embaldosar un salón de forma cuadrada que tiene de lado 8 metros; si en cada metro cuadrado se utilizan 16 baldosas, ¿Cuántas baldosas son necesarias para cubrir todo el salón?",
                "1024 baldosas",
                "1124 baldosas",
                "1000 baldosas",
                "924 baldosas",
                "1024 baldosas", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question7 = new QuestionsList(
                "El punto donde se cortan las tres bisectrices de los ángulos internos de un triángulo se denomina: ",
                "Cincuncentro",
                "Incentro",
                "Baricentro",
                "Ortocentro",
                "Incentro", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question8 = new QuestionsList(
                "A cuántos cm equivalen 2,5 metros",
                "0,25 cm",
                "25 cm",
                "250 cm",
                "2500 cm",
                "250 cm", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question9 = new QuestionsList(
                "En un triángulo rectángulo la medida de la hipotenusa es de 5 cm, mientras que uno de sus catetos mide 3 cm, ¿cuál es la medida del otro cateto?",
                "4.2 cm",
                "3.9 cm",
                "4 cm",
                "Ninguna de las anteriores",
                "4 cm", // respuesta correcta
                "" // selecet user answer
        );
        final QuestionsList question10 = new QuestionsList(
                "Si en un rectángulo se aumenta la longitud de uno de sus lados en 100 %, su área",
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
            case "Razonamiento Lógico":
                return RazonamientoLogico1();
            case "Pensamiento Aleatorio":
                return PensamientoAletorio1();
            case "Educación Financiera":
                return EducacionFinanciera1();
            case "Pens. Numérico y Variacional":
                return PensNumyVariacional1();
            default:
                return PensMetriyGeome1();
        }
    }
}
