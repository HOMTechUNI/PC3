# Curso de desarrollo de software

## Práctica Calificada 3

<div style="text-align: center;"><a href="https://github.com/HOMTechUNI"><img src="https://github.com/HOMTechUNI/PC3/blob/main/content/images/hom-tech.svg" alt=""></a></div>

**TABLA DE CONTENIDO**

- [Principio de responsabilidad única](https://github.com/HOMTechUNI/PC3#principio-de-responsabilidad-%C3%BAnica)
    - [Pregunta 1](https://github.com/HOMTechUNI/PC3#pregunta-1)
    - [Pregunta 2](https://github.com/HOMTechUNI/PC3#pregunta-2)
    - [Pregunta 3](https://github.com/HOMTechUNI/PC3#pregunta-3--overglitch-)
    - [Pregunta 4](https://github.com/HOMTechUNI/PC3#pregunta-4--overglitch-)
- [Principio abierto/cerrado](https://github.com/HOMTechUNI/PC3#principio-abiertocerrado)
    - [Pregunta 5](https://github.com/HOMTechUNI/PC3#pregunta-5)
    - [Pregunta 6](https://github.com/HOMTechUNI/PC3#pregunta-6)
    - [Pregunta 7](https://github.com/HOMTechUNI/PC3#pregunta-7)
    - [Pregunta 8](https://github.com/HOMTechUNI/PC3#pregunta-8)
    - [Pregunta 9](https://github.com/HOMTechUNI/PC3#pregunta-9)
    - [Pregunta 10](https://github.com/HOMTechUNI/PC3#pregunta-10)
    - [Pregunta 11](https://github.com/HOMTechUNI/PC3#pregunta-11)
- [Principio de sustitución de Liskov](https://github.com/HOMTechUNI/PC3#principio-de-sustituci%C3%B3n-de-liskov)
    - [Pregunta 12](https://github.com/HOMTechUNI/PC3#pregunta-12)
    - [Pregunta 13](https://github.com/HOMTechUNI/PC3#pregunta-13)
    - [Pregunta 14](https://github.com/HOMTechUNI/PC3#pregunta-14)
    - [Pregunta 15](https://github.com/HOMTechUNI/PC3#pregunta-15)
    - [Pregunta 16](https://github.com/HOMTechUNI/PC3#pregunta-16)
    - [Pregunta 17](https://github.com/HOMTechUNI/PC3#pregunta-17)
    - [Pregunta 18](https://github.com/HOMTechUNI/PC3#pregunta-18)
- [Principio de segregación de interfaces](https://github.com/HOMTechUNI/PC3#principio-de-segregaci%C3%B3n-de-interfaces)
    - [Pregunta 19](https://github.com/HOMTechUNI/PC3#pregunta-19)
    - [Pregunta 20](https://github.com/HOMTechUNI/PC3#pregunta-20)
    - [Pregunta 21](https://github.com/HOMTechUNI/PC3#pregunta-21)
    - [Pregunta 22](https://github.com/HOMTechUNI/PC3#pregunta-22)
    - [Pregunta 23](https://github.com/HOMTechUNI/PC3#pregunta-23)
    - [Pregunta 24](https://github.com/HOMTechUNI/PC3#pregunta-24)
    - [Pregunta 25](https://github.com/HOMTechUNI/PC3#pregunta-25)
    - [Pregunta 26](https://github.com/HOMTechUNI/PC3#pregunta-26)
    - [Pregunta 27](https://github.com/HOMTechUNI/PC3#pregunta-27)
    - [Pregunta 28](https://github.com/HOMTechUNI/PC3#pregunta-28)
    - [Pregunta 29](https://github.com/HOMTechUNI/PC3#pregunta-29)
    - [Pregunta 30](https://github.com/HOMTechUNI/PC3#pregunta-30)
- [Principio de inversión de dependencias](https://github.com/HOMTechUNI/PC3#principio-de-inversi%C3%B3n-de-dependencia)
    - [Pregunta 31](https://github.com/HOMTechUNI/PC3#pregunta-31)
    - [Pregunta 32](https://github.com/HOMTechUNI/PC3#pregunta-32)
    - [Pregunta 33](https://github.com/HOMTechUNI/PC3#pregunta-33)
    - [Pregunta 34](https://github.com/HOMTechUNI/PC3#pregunta-34)
    - [Pregunta 35](https://github.com/HOMTechUNI/PC3#pregunta-35)
    - [Pregunta 36](https://github.com/HOMTechUNI/PC3#pregunta-36)

### [Principio de responsabilidad única](https://es.wikipedia.org/wiki/Principio_de_responsabilidad_%C3%BAnica)

#### Pregunta 1 [[@MiguelHRLX](https://github.com/MiguelHRLX)]

Muestra la salida y explica los resultados en función de los métodos entregados

<details>
  <summary>Respuesta</summary>

<ul>

```console
Demostracion sin SRP
Nombre del empleado: Abejita, Jessica
Este empleado tiene 7.5 años de experiencia.
El ID del empleado es: J711
Este empleado es un empleado senior

----

Nombre del empleado: Smart, Chalito
Este empleado tiene 3.2 años de experiencia.
El ID del empleado es: C216
Este empleado es un empleado junior
```

<li>
La salida que se obtiene al ejecutar la clase Cliente son los datos de 2 empleados ,de Jessica Abejita
y de Chalito Smart. Para que esta clase pueda imprimir estos datos creó un métodos llamado
showEmplDetails() cullo parámetro emp es un objeto de clase Empleado, primo muestra la identificación
emp con el método displayEmpDetail(), el cual muestra el nombre y apellido del empleado más los
años de experiencia laboral que tiene, luego imprime el id del empleado usando el método del
emp llamado generateEmptId()  el cual genera un id aleatorio con la primera letra del nombre del
empleado concatenado con un número aleatorio menor a 1000,finalmente imprime si el empleado es senior
o un junior usando el método checkSenioriti() de emp, el cual comprobará si es que el empleado tiene
más de 5 años de experiencia para que el método imprima “senior” , si no es así imprimirá “junior”.

En la función main de Cliente se crea un objeto Empleado llamado jessica, el cual se instancia con
nombre “Jessica”, apellido “Abejita” y con 7.5 años de experiencia por lo que al momento de imprimir
sus datos su id iniciará con el carácter J y se imprimirá que es una empleada senior por tener más
de 5 años de experiencia, después se crea un objeto Empleado llamado chalo, el cual se instancia
con nombre “Chalito”, apellido “Smart” y con 3.2 años de experiencia por lo que al momento de imprimir
sus datos su id iniciará con el carácter C y se imprimirá que es una empleada junior por tener más
de 5 años de experiencia.
</li>
</ul>
</details>

#### Pregunta 2[[@Bobter](https://github.com/Bobter)]

¿Cuál es el problema con este diseño y las razones posibles del problema?

<details>
  <summary>Respuesta</summary>
    Con el diseño presentado en Empleado.java, se está fallando con el principio de SRP. En principio debemos identificar qué responsabilidad le asignaremos a Empleado.java, el constructor de esta clase se encarga de añadir nuevos empleados, el método <b>displayEmpDetail()</b> nos muestra la información correspondiente a estos empleados. Sin embargo, respecto al método <b>generateEmpId(...)</b> se está generando el ID de empleado esto se puede implementar en otra clase que tenga esa única responsabilidad, lo mismo pasa con el método <b>checkSeniority(…)</b> que puede ser delegado a otro método que esté enfocado solo en esta función. Estos 2 métodos serían las razones por las que no se cumple con el SRP.
</details>

#### Pregunta 3 [[@Overglitch](https://github.com/Overglitch)]

Modifica la clase Empleado. Agrega dos clases **SeniorityChecker** que contiene el
método **checkSeniority()** y la clase **GeneradorIDEmpleado** contiene el método
**generateEmpId(...)** para generar la identificación del empleado.
Para mejorar la legibilidad del código y evitar torpezas dentro del método **main()**, utiliza el
método estático **showEmpDetail(...)**. Este método llama al método **displayEmpDetail()** de
Empleado, al método generateEmpId() de GeneradorIDEmpleado y al método **checkSeniority()**
de **SeniorityChecker**. Tú entiendes que este método no era necesario, pero hace que el código
del cliente sea simple y fácilmente comprensible.

<details>
  <summary>Respuesta</summary>
<ul>
  <li> Implementación de la clase <b>SeniorityChecker</b> con el método <b>checkSeniority()</b> </li>

```java
public class SeniorityChecker {
    // completar
    public static String checkSeniority(double experienceInYears) {
        return experienceInYears >= 5 ? "Senior" : "Junior";
    }
}
```

  <li> Implementación de la clase <b>GeneradorIDEmpleado</b> con el método <b>generateEmpId(...)</b> </li>

```java
public class GeneradorIDEmpleado {
    //completar
    public static String generateEmpId(String empFirstName) {
        int random = new Random().nextInt(1000);
        return empFirstName.substring(0, 1) + random;
    }
}
```

  <li> Accediendo a los métodos antes mencionados mediante el método <b>showEmpDetail()</b> </li>

```java
    private static void showEmpDetail(Empleado emp){
        // Muestra detalles del empleado
        emp.displayEmpDetail();

        //Genera el ID
        System.out.println("El ID del empleado es:\t"+GeneradorIDEmpleado.generateEmpId(emp.firstName));

        // Verifica el nivel laboral
        System.out.println("Este empleado es un:\t"+"Empleado "+SeniorityChecker.checkSeniority(emp.experienceInYears));
        }
```

</ul>
</details>

#### Pregunta 4 [[@Overglitch](https://github.com/Overglitch)]

Realiza una demostración completa que sigue a SRP. Explica tus resultados

- **Empleado.java**
- **GeneradorIdEmpleado.java**
- **SeniorityChecker.java**
- **Cliente.java**

<details>
  <summary>Respuesta</summary>
<ul>
    <li>Salida del código</li>

```console
Demostracion de SRP

Nombre del empleado:	Jessica, Abejita
Este empleado tiene:	7.5 años de experiencia
El ID del empleado es:	J515
Este empleado es un:	Empleado Senior

*******

Nombre del empleado:	Chalito, Smart
Este empleado tiene:	3.2 años de experiencia
El ID del empleado es:	C941
Este empleado es un:	Empleado Junior
```

Luego de la implementación de clases, la salida es básicamente la misma. Hay un cambio significativo en cómo se obtienen
los datos y cómo la clase Cliente los usa.

En primer lugar, se imprimen los nombres y los años de experiencia del mismo modo en el que se imprimían antes de
implementar el principio de Responsabilidad única. Para obtener el ID del empleado se implementó un método generateEmpId
dentro de la clase GeneradorIDEmpleado que se encarga de otorgar el ID después de solicitar el firstName del empleado.
Luego se evalúa la experiencia del empleado con el método checkSeniority dentro de la clase SeniorityChecker que
solicita los años de experiencia del empleado e imprime Senior si es mayor o igual a 5 y Junior en caso contrario.

Estos cambios hicieron que el código se vea más limpio y accesible a la integración de nuevas funcionalidades sin
alterar las implementadas.
</ul>
</details>

### [Principio abierto/cerrado](https://es.wikipedia.org/wiki/Principio_de_abierto/cerrado)

#### Pregunta 5[[@Bobter](https://github.com/Bobter)]

¿Por qué no es correcto colocar **displayResult()** y **evaluateDistinction()** en la misma
clase, como la siguiente?

```java
class Estudiante {
    // ….
    public void displayResult() {
        // codigo
    }

    public void evaluateDistinction() {
        // codigo
    }
// …
}
```

<details>
  <summary>Respuesta</summary>
    Para el método <b>evaluateDistinction(…)</b> estaríamos violando el principio abierto/cerrado para la clase <b>DistinctionDecider</b>, al implementar este método dentro de la clase <b>Estudiante</b> tendríamos que modificar la funcionalidad de <b>DistinctionDecider</b> si lo vemos desde el punto de vista de OCP estaríamos cometiendo un gran error ya que podemos ampliar las funcionalidades de una clase pero no modificar las ya existentes. Respecto a la función <b>displayResult(…)</b> no solo estaríamos mostrando el resultado de las demás funciones de la clase <b>Estudiante</b> sino que también los resultados del decider que si bien este método estaría ampliando la funcionalidad de la clase <b>Estudiante</b> sin modificar las ya existentes al mostrar los resultados de los métodos de otra clase no estamos respetando que la otra clase pueda estar abierta a ampliaciones de sus funcionalidades.

</details>

Sean los siguientes archivos:

- **Estudiante.java**
- **DistinctionDecider.java**
- **Cliente.java**

#### Pregunta 6 [[@MiguelHRLX](https://github.com/MiguelHRLX)]

Muestra la salida y explica los resultados en función de los métodos entregados

<details>
  <summary>Respuesta</summary>
<ul>

```console
Demostracion sin OCP
Resultados:
Nombre: Irene
Numero Regex: R1
Dept:Ciencia de la Computacion.
Marks:81.5
*******
Nombre: Jessica
Numero Regex: R2
Dept:Fisica
Marks:72.0
*******
Nombre: Chalo
Numero Regex: R3
Dept:Historia
Marks:71.0
*******
Nombre: Claudio
Numero Regex: R4
Dept:Literatura
Marks:66.5
*******
Distinciones:
R1 ha recibido una distincion en ciencias.
R3 ha recibido una distincion en artes.
```
La salida del código Cliente nos muestra los datos de 4 estudiantes, los datos mostrados
son su nombre, número de registro, su especialidad y su nota, finalmente muestra un
mensaje de los alumnos que consiguieron la distinción.

La instancia de los estudiantes se obtiene mediante el método enrollStudents() el cual
retorna una lista de objetos de la clase Estudiante, el cual instancia 4 objetos alumnos que
serán añadidos a una lista de estudiantes. La primera alumna es Irene con número de registro
R1, puntaje 81.5 y pertenece al departamento de ciencias de la computación . La segunda alumna
es Jessica con número de registro R2, puntaje 72 y pertenece al departamento de Física, el
tercer alumno es Chalo con número de registro R3 , puntaje 71 y pertenece al departamento de
Historia.El último alumno es Claudio con número de registro  R4, puntaje 66.5 y pertenece al
departamento de Literatura.

En el método main de la clase Cliente se crea una lista de objetos estudiantes llamada enrolledStudens
y se iguala al retorno del método enrollStudents() mencionando anteriormente, después de imprime
los datos de cada uno de los estudiantes de la lista gracias a que la clase Estudiante tiene el
método toString sobrescrito para poder imprimir los datos del estudiantes cuando se pone la instancia
de esta clase en un string.

Después de instancia un objeto de la clase DistinctionDecider el cual imprime el número de registro del
estudiantes que a conseguido la distinción, si un alumno que pertenece a la facultad de ciencias (pertenece
al departamento de ciencias de la computación y física) y tiene un puntaje mayor a 80 puntos entonces
se imprimirá su código indicando que ganó la distinción caso contrario no imprime nada, lo mismo
pasa para estudiantes de la facultad de arte (pertenecen al departamento de historia y literatura)
pero tiene que tener un puntaje mayor a 70 puntos para que imprima la distinción.

En este caso imprimirá la el número de registro de los alumnos Irene (R1) y Chalo (R3) debido a que Irene
pertenece a la facultad de ciencias y tener puntaje mayora 80 y Chalo pertenece a la facultad de artes y
su puntaje es mayor a 70.


</ul>
</details>

#### Pregunta 7 [[@Overglitch](https://github.com/Overglitch)]

¿Cuál es el problema con este diseño y las razones posibles del problema?
Para abordar este problema, puedes escribir un mejor programa. El OCP se puede lograr de
diferentes maneras, pero la abstracción es el corazón de este principio. Si puedes diseñar tu
aplicación siguiendo el **OCP**, tu aplicación es flexible y extensible. No siempre es fácil
implementar completamente este principio, pero el cumplimiento parcial de **OCP** puede
generarle un mayor beneficio. También observa que comenzó la demostración 3 siguiendo el
**SRP**. Si no sigues el **OCP**, puedes terminar con una clase que realiza varias tareas, lo que
significa que el **SRP** no funciona.
Para la situación actual, puedes dejar la clase Estudiante como está. Pero quieres mejorar el
código. Tú comprendes que en el futuro puedes necesitar considerar una corriente diferente,
como el comercio. ¿Cómo eliges una corriente? Se basa en el tema elegido por un estudiante.
Entonces, en el siguiente ejemplo, haces que la clase **Estudiante** sea abstracta.
**ArteEstudiante** y **CienciaEstudiante** son las clases concretas y se utilizan para proporcionar la
información del *"departamento"*.

<details>
  <summary>Respuesta</summary>
<ol type="a"><li> El principal problema en la clase DistinctionDecider es que el método evaluateDistinction si bien cumple su función, nos impide agregar nuevas formas de evaluar el puntaje de los alumnos sin cambiar mucho el código.</li> <li> Esto también se repite para la adición de nuevos departamentos, tampoco se podría agrupar a los estudiantes según el departamento al que pertenecen a menos que se excluyan por sus atributos propios (name, Regnum, score).
  </li></ol>
</details>

#### Pregunta 8 [[@Overglitch](https://github.com/Overglitch)]

Debes abordar el método de evaluación para la distinción de una mejor manera.
Por lo tanto, crea la interfaz **DistinctionDecider** que contiene un método llamado
**EvaluationDistinction**.

<details>
  <summary>Respuesta</summary>
<ul>
    <li> Implementación de la interfaz <b>DistinctionDecider</b> con método <b>EvaluationDistinction</b> </li>

```java
public interface DistinctionDecider {
    void evaluateDistinction(Estudiante estudiante);
}
```

La implementación de este método se sobreescribirá tanto en la clase ArteEstudiante como en la clase CienciaEstudiante,
según lo que se requiera.
</ul>
</details>

#### Pregunta 9 [[@Overglitch](https://github.com/Overglitch)]

Completa el código de **ArtsDistinctionDecider** y **ScienceDistinctionDecider** que
implementan esta interfaz y sobreescriben el método de **evaluateDistinction(...)** para
especificar los criterios de evaluación según sus necesidades. De esta forma, los criterios de
distinción específicos de flujo se envuelven en una unidad independiente.
Debes tener en cuenta que el método de **evaluateDistinction(...)** acepta un parámetro
**Estudiante**. Significa que ahora también puede pasar un objeto **ArtsStudent** o un objeto
**ScienceStudent** a este método.
El código restante es fácil y no debería tener ningún problema para comprender la siguiente
demostración ahora.

<details>
  <summary>Respuesta</summary>
<ul>
    <li> La clase <b>ArtsDistinctionDecider</b> implementa la interfaz <b>DistinctionDecider</b> sobreescribiendo el método <b>evaluateDistinction(...)</b></li>

```java
public class ArtsDistinctionDecider implements DistinctionDecider {

    @Override
    public void evaluateDistinction(Estudiante estudiante) {
        if (estudiante.score > 70) {
            System.out.println(estudiante.regNumber + " ha recibido una distincion en artes.");
        }
    }
}
```

El método evaluateDistinction(...) recibe un objeto de tipo Estudiante y evalúa si el puntaje del estudiante es mayor a
70 e imprime que recibió una distinción en artes en caso de ser así.

<li> La clase <b>ScienceDistinctionDecider</b> implementa la interfaz <b>DistinctionDecider</b> sobreescribiendo el método <b>evaluateDistinction(...)</b></li>

```java
public class ScienceDistinctionDecider implements DistinctionDecider {

    @Override
    public void evaluateDistinction(Estudiante estudiante) {
        if (estudiante.score > 80) {
            System.out.println(estudiante.regNumber + " ha recibido una distincion en ciencias.");
        }
    }
}
```

El método evaluateDistinction(...) recibe un objeto de tipo Estudiante y evalúa si el puntaje del estudiante es mayor a
80 e imprime que recibió una distinción en ciencias en caso de ser así.

</ul>
</details>

#### Pregunta 10 [[@Overglitch](https://github.com/Overglitch)]

Realiza una demostración completa que sigue a OCP. Explica tus resultados

- **Estudiante.java**
- **ArteEstudiante.java**
- **CienciaEstudiante.java**
- **DistinctionDecider.java**
- **ScienceDistinctionDecider.java**
- **ArtsDistinctionDecider.java**
- **Cliente.java**

<details>
  <summary>Respuesta</summary>
<ul>
    <li>Salida del código</li>

```console
Demostracion OCP

Resultados:

Nombre:		Irene
Numero Reg:	R1
Dept:		Ciencia de la computacion.
Marks:		81.5

Nombre:		Jessica
Numero Reg:	R2
Dept:		Fisica
Marks:		72.0

Nombre:		Chalo
Numero Reg:	R3
Dept:		Historia
Marks:		71.0

Nombre:		Claudio
Numero Reg:	R4
Dept:		Literatura
Marks:		66.5

Distinciones:

R1 ha recibido una distincion en ciencias.
R3 ha recibido una distincion en artes.
```

En primer lugar, se insertan a los estudiantes en Listas de Estudiantes dependiendo del departamento al que pertenezcan,
de modo que se crean las listas: CienciasEstudiantes y ArtesEstudiantes. También debemos mencionar que la clase
abstracta Estudiante que almacena los datos de los estudiantes se extiende en 2 clases: CienciaEstudiante y
ArteEstudiante.

Luego se evalúa los puntajes de cada estudiante para saber si posee una distinción o no, esto mediante el método
sobreescrito evaluateDistinction que funciona dependiendo si el alumno es de Ciencias o Artes

Finalmente, se imprimen los resultados.
</ul></details>

#### Pregunta 11 [[@Overglitch](https://github.com/Overglitch)]

¿Cuáles son las principales ventajas ahora?

<details>
  <summary>Respuesta</summary>
<ol type="a">

<li>Si quisieramos agregar otra forma de clasificar a los alumnos, solo sería necesario extender la clase Estudiante tal como se hizo con ArteEstudiante y CienciaEstudiante</li>

<li>A su vez para evaluar a dichos alumnos de una manera alternativa bastaría con crear clases que implementen la interfaz DistinctionDecider</li> </ol>

Esto fue posible gracias al buen uso de la herencia y los polimorismos.
</details> 

### [Principio de sustitución de Liskov](https://es.wikipedia.org/wiki/Principio_de_sustituci%C3%B3n_de_Liskov)

#### Pregunta 12 [[@MiguelHRLX](https://github.com/MiguelHRLX)]

Muestra la salida y explica los resultados en función de los métodos entregados

<details>
  <summary>Respuesta</summary>
<ul>

```console
Recuperando de Abejita, ultimos detalles de pagos.
------
Recuperando de Chalito, ultimos detalles de pagos.
------
Exception in thread "main" java.lang.UnsupportedOperationException
	at NoSolid.LSP.GuestUserPayment.previousPaymentInfo(GuestUserPayment.java:11)
	at NoSolid.LSP.PaymentHelper.showPreviousPayments(PaymentHelper.java:14)
	at NoSolid.LSP.Cliente.main(Cliente.java:22)
```

Antes de mostrar la salida se tuvo que comentar las líneas de código “GuestUserPayment
guestUser = new GuestUserPayment();” y “helper.addUser(guestUser);” porque la clase
GuestUserPayment no está codificada aún.

La salida muestra los últimos pagos de 2 usuarios , una llamada Abejita y otro llamado Chalito,
además de las nuevas solicitudes de pagos de estos, pero al no haberse añadido nada aún no
muestras estos pagos y solo mostrará un texto genérico inicial de llamada a la muestra del pagos
anteriores y el actual.

En la clase Cliente, en el método main se instancia un objeto de clase PaymentHelper llamaod
helper, luego se instancia 2 objetos de la clase RegisteredUserPayment ,el cual hereda del interfaz
Payment, estos objetos son llamados pagoAbejita y pagoChalito los cuales en su constructor se
ingresa el string de sus nombres los cuales son Abejita y Chalito respectivamente .

Después , con el objeto helper creado anteriormente usamos el método addUser() para añadir a
los pagadores Abejita y  Chalito a la lista de objetos Paymernt que hay en el helper, es posible
añadir directamente objetos de la clase RegisteredUserPayment en una lista de objetos Payment
porque RegisteredUserPayment hereda de Payment .

Finalmente se llama a los métodos showPreviusPayment() y processNewPayments() ,donde el primer
método imprimirá todos los pagos previos que hizo el usuario con el método previousPaymentInfo()
de los objetos de la lista payments y el otro método imprimirá el nuevo pago que se está
realizando con el método newPayment(), ambos usarán bucles for para imprimir lo datos de todos
los objetos de las lista payments.

</ul>

</details>

#### Pregunta 13 [[@MiguelHRLX](https://github.com/MiguelHRLX)]

Ahora supongamos que tienes un nuevo requisito que dice que necesitas admitir
usuarios invitados en el futuro. Puedes procesar la solicitud de pago de un usuario invitado,
pero no muestra su último detalle de pago. Entonces, crea la siguiente clase que implementa la
interfaz de pago de la siguiente manera:

```java
class GuestUserPayment implements Payment {
    String name;

    public GuestUserPayment() {
        this.name = "guest";
    }

    @Override
    public void previousPaymentInfo() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void newPayment() {
        System.out.println("Proceso de la solicitud de pago de " + name);
    }
}
```

<details>
  <summary>Respuesta</summary>
<ul>
Creamos la clase GuestUserPayment que implementa la interfaz Payment, la cual en su constructor pone
el string name el valores de “guest”, en el métodos newPayment() se imprime la cadena
"Procesando de "+name+ "pago actual request." Y en el método previousPaymentInfo() ejecutará
la siguiente línea de código “ throw new UnsupportedOperationException();”.
</ul>

</details>


#### Pregunta 14 [[@MiguelHRLX](https://github.com/MiguelHRLX)]

Dentro del método **main()**, utilizas una instancia de usuario invitado e intentas
usar su clase auxiliar de la misma manera, ¿Qué tipo de excepción te encuentras? ¿Cuál es la
solución?


<details>
  <summary>Respuesta</summary>
<ul>
Se intención un objeto de la clase GuestUserPayment llamado guestUser el cual se añade a
la lista que tiene helper usando su método addUser() .Al ejecutar la clase Client , se
muestra en la salida la ejecución del método previousPaymentInfo() que tiene los objetos
pagoAbejita y pagoChalito pero luego muestra una excepción  evitando que se imprima lo
que se vio en la pregunta 12.

Esta excepción se genera porque en el método showPreviousPayments() del objeto helper de
la clase PaymentHelper ejecuta los métodos previousPaymentInfo() de cada objeto de la
lista payments, en donde se encuentra nuestro objeto guestUser el cual en este método ejecuta
la línea de código “ throw new UnsupportedOperationException();” , el cual retornará una
excepción siendo esta la razón por la que ocurre este problema.

La forma de solucionar este problema es sería que se creen 2 interfaces, una que sea
para registrar los anteriores pagos y otro para registrar el pago actual, y esta vez la
clase RegisteredUserPayment implementará ambas interfaces ya que esta clase registra
pagos anteriores y acutales, pero GuestUserPayment tiene que implementar solo la interface
para solo registro del pago actual ya que esta clase fue creada solo para registrar pagos
actuales. Además se deberá de modificar la clase Payment Helper,esta vez en lugar de guardar
a lodos los usuarios en usa sola lista ahora se creará dos lista , una para objetos que
hereden de las primera interfaz y otra lista de los que heredan de la otra interfaz , por
lo que ahora el método showPreviousPayments() solo ejecutaría el método previousPaymentInfo()
de la lista delos usuarios que tengan guardados sus pagos anteriores mientras que el método
processNewPayments() solo ejecutará los métodos newPaymet de las clases que usan la interfaz de solo nuevos pagos.

</ul>
</details>

#### Pregunta 15[[@Bobter](https://github.com/Bobter)]

Todo lo anterior Lo más importante es que viola el **OCP** cada vez que modifica una
clase existente que usa esta cadena *if-else*. Entonces, busquemos una mejor solución.
<details>
  <summary>Respuesta</summary>
<ul>
    En este caso se nos planteó anteriormente que se creara una clase <b>GuestUserPayment</b> así que trabajaremos en torno a esto. Lo que se interpreta que nos pide esta pregunta es que hagamos una modificación respecto a una clase que ya está cerrada y que se añada la forma de identificar qué tipo de usuario está realizando un pago, entonces para respetar el OCP para las clases ya existentes tendríamos que crear una nueva clase que se encargue de identificar y asignar el status correspondiente a cada usuario (en caso se creen más tipos de usuario). Para hacer uso de esta nueva clase (<b>GuestUserPayment</b>) de forma automática se puede implementar otra clase que se encargue de identificar si el usuario no ha sido registrado antes, y sea el caso de que se quiera registrar se le añade como nuevo usuario y si no, se le otorga el status de invitado. Con esto ya se podría acceder a cada tipo de usuario según sea el caso o así se requiera. Aprovechando así los beneficios si creamos una nueva clase proUser o la simplicidad de un usuario invitado.
</ul>
</details>

#### Pregunta 16[[@Bobter](https://github.com/Bobter)]

En el próximo programa, eliminaremos el método **newPayment()** de la interfaz de
**payment**. Coloca este método en otra interfaz llamada **NewPayment**. Como resultado, ahora
tienes dos interfaces con las operaciones específicas. Dado que todos los tipos de usuarios
pueden generar una nueva solicitud de pago, las clases concretas de **RegisteredUserPayment** y
**GuestUserPayment** implementan la interfaz **NewPayment**.
Pero muestra el último detalle de pago solo para los usuarios registrados. Entonces, la clase
**RegisteredUser** implementa la interfaz **payment**. Dado que **Payment** contiene el método
**previousPaymentInfo()**, tiene sentido elegir un nombre mejor, como **PreviousPaymen** en lugar
de **Payment**. Entonces, ahora verá las siguientes interfaces:

```java
interface PreviousPayment {
    void previousPaymentInfo();
}

interface NewPayment {
    void newPayment();
}
```

Ajuste estos nuevos nombres en la clase auxiliar también. En sección del código debes tener los
siguientes archivos:

- **PreviousPayment.java**
- **NewPayment.java**
- **RegisteredUserPayment.java**
- **GuestUserPayment.java**
- **PaymentHelper.java**
- **Cliente.java**

<details>
  <summary>Respuesta</summary>
<ul>
    <li>Luego de aplicar los cambios planteados en esta pregunta, se debe modificar la clase <b>RegisteredUserPayment</b> de la siguiente manera: </li>

```java
public class RegisteredUserPayment implements NewPayment, PreviousPayment {

    String name;

    public RegisteredUserPayment(String userName) {
        this.name = userName;
    }

    @Override
    public void previousPaymentInfo() {
        System.out.println("Recuperando los ultimos detalles de pago del cliente: " + name);
    }

    @Override
    public void newPayment() {
        System.out.println("Procesando el pago del cliente: " + name);
    }
}
```

<li>La clase <b>GuestUserPayment</b> quedaría de la siguiente manera:</li>

```java
public class GuestUserPayment implements NewPayment {

    String name;

    public GuestUserPayment() {
        this.name = "guest";
    }

    @Override
    public void newPayment() {
        System.out.println("Procesando el pago actual de " + name);
    }
}
```

<li>Se debe adaptar la clase <b>PaymentHelper</b> para que pueda interactuar con las 2 interfaces creadas:</li>

```java
public class PaymentHelper {
    //Se crea la lista correspondiente a los pagos previos
    List<PreviousPayment> previousPayments = new ArrayList<PreviousPayment>();

    //Se crea la lista correspondiente a los nuevos pagos
    List<NewPayment> newPayments = new ArrayList<NewPayment>();

    //Método para agregar pagos previos a clientes registrados
    public void addPreviousPayment(PreviousPayment previousPayment) {

        previousPayments.add(previousPayment);
    }

    //Método para añadir pagos nuevos a clientes registrados y no registrados
    public void addNewPayment(NewPayment newPayment) {

        newPayments.add(newPayment);
    }

    //Método que accede a la lista previousPayment para mostrar los pagos de clientes registrados
    public void showPreviousPayments() {
        for (PreviousPayment previousPayment : previousPayments) {
            previousPayment.previousPaymentInfo();
        }
        System.out.println("--------------------");
    }

    //Método que accede a la lista newPayment para mostrar que se están procesando los nuevos pagos
    public void processNewPayments() {
        for (NewPayment newPayment : newPayments) {
            newPayment.newPayment();
        }
        System.out.println("--------------------");
    }
}
```

<li>Finalmente la clase <b>Cliente</b> funcionaría sin problemas: </li>

```java
public class Cliente {
    public static void main(String[] args) {

        System.out.println("Demostracion LSP.\n");
        PaymentHelper helper = new PaymentHelper();

        // Instanciando dos usuarios registrados
        RegisteredUserPayment irene = new RegisteredUserPayment("Irene");
        RegisteredUserPayment claudio = new RegisteredUserPayment("Claudio");

        // Instanciando el pago de un usuario invitado
        GuestUserPayment guestUser1 = new GuestUserPayment();

        // Consolidando la informacion del pago anterior al helper
        helper.addPreviousPayment(irene);
        helper.addPreviousPayment(claudio);

        // Consolidando nuevas solicitudes de pago al helper
        helper.addNewPayment(irene);
        helper.addNewPayment(claudio);
        helper.addNewPayment(guestUser1);

        // Recupera todos los pagos anteriores de los usuarios registrados
        helper.showPreviousPayments();

        // Procesa todas las solicitudes de pago nuevos de todos los usuarios
        helper.processNewPayments();
    }
}
```

</ul>
</details>

#### Pregunta 17[[@Bobter](https://github.com/Bobter)]

¿Cuáles son los cambios clave?

<details>
  <summary>Respuesta</summary>
<ul>
    Respecto a la clase <b>RegistereUserPayment</b>, ahora implementa las 2 interfaces creadas:
    <li>Antes: </li>

```java
    public class RegisteredUserPayment implements Payment
```

<li>Ahora: </li>

```java
    public class RegisteredUserPayment implements NewPayment, PreviousPayment
```

Respecto a la clase <b>GuestUserPayment</b>, ahora implementa la interface <b>NewPayment</b>:
<li>Antes: </li>

```java
    public class GuestUserPayment implements Payment
```

<li>Ahora: </li>

```java
    public class GuestUserPayment implements NewPayment
```

Respecto a la clase <b>PaymentHelper</b>, se tuvo que reemplazar la unica lista que tenía por 2 que guarden la
información de los pagos anteriores
y los nuevos:
<li>Antes: </li>

```java
    List<Payment> payments=new ArrayList<Payment>();
```

<li>Ahora: </li>

```java
    //Se crea la lista correspondiente a los pagos previos
    List<PreviousPayment> previousPayments=new ArrayList<PreviousPayment>();
        //Se crea la lista correspondiente a los nuevos pagos
        List<NewPayment> newPayments=new ArrayList<NewPayment>();
```

Otra modificación importante a <b>PaymentHelper</b> se dió en los métodos, para esto se usaron los nombres que eran
llamados en la clase <b>Cliente</b>:

<li>Antes: </li>

```java
    public void addUser(Payment user){
        payments.add(user);
        }
public void showPreviousPayments(){
        for(Payment payment:payments){
        payment.previousPaymentInfo();
        System.out.println("------");
        }
        }
public void processNewPayments(){
        for(Payment payment:payments){
        payment.newPayment();
        System.out.println("------");
        }
        }
```

<li>Ahora: </li>

```java
    //Método para agregar pagos previos a clientes registrados
public void addPreviousPayment(PreviousPayment previousPayment){
        previousPayments.add(previousPayment);
        }

//Método para añadir pagos nuevos a clientes registrados y no registrados
public void addNewPayment(NewPayment newPayment){
        newPayments.add(newPayment);
        }

//Método que accede a la lista previousPayment para mostrar los pagos de clientes registrados
public void showPreviousPayments(){
        for(PreviousPayment previousPayment:previousPayments){
        previousPayment.previousPaymentInfo();
        }
        System.out.println("--------------------");
        }

//Método que accede a la lista newPayment para mostrar que se están procesando los nuevos pagos
public void processNewPayments(){
        for(NewPayment newPayment:newPayments){
        newPayment.newPayment();
        }
        System.out.println("--------------------");
        }

```

La clase <b>Cliente</b> se nos entregó modificada, los cambios se notan a la hora de añadir pagos anteriores y nuevos:
<li>Antes: </li>

```java
    System.out.println("Demostracion sin LSP\n");
        PaymentHelper helper=new PaymentHelper();

        // Instanciando dos usuarios registrados
        RegisteredUserPayment pagoAbejita=new RegisteredUserPayment("Abejita");
        RegisteredUserPayment pagoChalito=new RegisteredUserPayment("Chalito");

        // Agregando los usuarios a los helper
        helper.addUser(pagoAbejita);
        helper.addUser(pagoChalito);

        GuestUserPayment guestUser=new GuestUserPayment();
        helper.addUser(guestUser);

        // Procesando el pago usando la clase helper
        // Encuentras algun problema?
        helper.showPreviousPayments();
        helper.processNewPayments();
```

<li>Ahora: </li>

```java
    System.out.println("Demostracion LSP.\n");
        PaymentHelper helper=new PaymentHelper();

        // Instanciando dos usuarios registrados
        RegisteredUserPayment irene=new RegisteredUserPayment("Irene");
        RegisteredUserPayment claudio=new RegisteredUserPayment("Claudio");
        // Instanciando el pago de un usuario invitado
        GuestUserPayment guestUser1=new GuestUserPayment();

        // Consolidando la informacion del pago anterior al helper
        helper.addPreviousPayment(irene);
        helper.addPreviousPayment(claudio);

        // Consolidando nuevas solicitudes de pago al helper
        helper.addNewPayment(irene);
        helper.addNewPayment(claudio);
        helper.addNewPayment(guestUser1);

        // Recupera todos los pagos anteriores de los usuarios registrados
        helper.showPreviousPayments();

        // Procesa todas las solicitudes de pago nuevos de todos los usuarios
        helper.processNewPayments();
```

</ul>
</details>

#### Pregunta 18[[@Bobter](https://github.com/Bobter)]

Ten que aquí el enfoque clave estaba en el principio **LSP**, nada más. Podrías
refactorizar fácilmente el código del cliente usando algún método estático. Por ejemplo realiza
una modificación donde utilizas un método estático para mostrar todas las solicitudes de pago
y utilizar este método siempre que lo necesites.

<details>
  <summary>Respuesta</summary>
<ul>
Para este caso se tuvo en cuenta que se mostrara la recuperación de los ultimos pagos de todos los clientes y también se mostrara que se están procesando los nuevos pagos, se tomó en cuenta que este método sea estático:

```java
    public static void showAllOperations(PaymentHelper showOperations){
        showOperations.showPreviousPayments();
        showOperations.processNewPayments();
        }    
``` 

Como se observa toma como argumento un elemento de tipo <b>PaymentHelper</b>, y contiene a los 2 métodos que muestran
las operaciones que se están ejecutando. Por otra parte, en la clase <b>Cliente</b> se debe reemplazar lo siguiente:

<li>Antes:</li>

```java
        // Recupera todos los pagos anteriores de los usuarios registrados
        helper.showPreviousPayments();

                // Procesa todas las solicitudes de pago nuevos de todos los usuarios
                helper.processNewPayments();
```

<li>Ahora:</li>

```java
    //Muestra todas las operaciones que se realizan actualmente
//*Recuperación de pagos anteriores
//*Procesamiento de pagos nuevos
        helper.showAllOperations(helper);
```

Nos muestra la misma salida que antes, pero ahora solo será necesario invocar el método <b>showAllOperations(...)</b>.

```console
Demostracion LSP.

Recuperando los ultimos detalles de pago del cliente: Irene
Recuperando los ultimos detalles de pago del cliente: Claudio
--------------------
Procesando el pago del cliente: Irene
Procesando el pago del cliente: Claudio
Procesando el pago actual de guest
--------------------
```

</ul>
</details>

### Principio de segregación de interfaces

#### Pregunta 19 [[@MiguelHRLX](https://github.com/MiguelHRLX)]

¿Por qué un usuario necesita cambiar una clase base (o una interfaz)? Para
responder a esto, supongamos que deseas mostrar qué el tipo de fax está utilizando en una fase
de desarrollo posterior.
Tú sabes que existen diferentes variaciones de métodos de **fax**, como *LanFax*, *InternetFax (o
EFax*) y *AnalogFax*. Entonces, antes, el método **SendFax()** no usaba ningún parámetro, pero
ahora necesita aceptar un parámetro para mostrar el tipo de fax que usa. Escribe una jerarquía
de **fax** que puede parecerse a la siguiente:

```java
interface Fax {
    // codigo
}

class LanFax implements Fax {
    @Override
    // codigo
}

class EFax implements Fax {
    @Override
    // codigo
}
```

<details>
  <summary>Respuesta</summary>
<ul>
Creamos la siguiente jerarquía con las 3 clases que se nos meciona :*LanFax*, *InternetFax (o
EFax*) y *AnalogFax* .

```java
interface  Fax {
    public void sendFax();
}
class LanFax implements  Fax{
    @Override
    public void sendFax(){
        System.out.println("Usando lan fax para mandar un fax");
    }
}
class EFax implements  Fax{
    @Override
    public void sendFax(){
        System.out.println("Usando internet fax para mandar un fax");
    }
}

class AnalgoFax implements  Fax{
    @Override
    public void sendFax(){
        System.out.println("Usando Analog fax para mandar un fax.");
    }
}
```
Se crea una interfaz base llamada Fax la cual contiene un método void llamado faxType()
que posteriormente se usará para que imprima un texto que diga el tipo de fax que corresponde,
después creamos las 3 clases que heredan de esta interfaz llamados LanFax,EFax y AnalogFax.
La clase LanFax sobrescribirá el método  faxType() para que imprima el texto "Usando lan fax
para mandar un fax.", la clase EFax sobrescribirá el mismo método para que imprima "Usando
internet fax para mandar un fax." Y la clase AnalogFaz  imprimirá el texto "Usando Analog fax para mandar un fax.".

</ul>
</details>

#### Pregunta 20[[@MiguelHRLX](https://github.com/MiguelHRLX)]

Para usar esta jerarquía de herencia, una vez que modificas el método **sendFax()** a
**sendFax(Fax faxType)** en la clase **ImpresoraAvanzada**, exige que cambies la interfaz de
**Impresora** (sí, aquí también rompe el **OCP**).
Cuando actualices **Impresora**, también debes actualizar la clase **impresoraBasica** para
adaptarse a este cambio. ¡Ahora ves el problema!. Explica el problema.

<details>
  <summary>Respuesta</summary>
<ul>
Cuando actualizamos el método sendFax() de la clase ImpresoraAvanzada nos pide modificar la clase
base Impresora y la clase ImpresoraBásica ,por lo que el problema es que al momento que queríamos
hacer el cambio en un solo método en la clase ImpresoraAvanzada se pedirá el mismo cambio para la
clase ImpresoraBásica pero nuestro objetivo no es cambiar esta clase , además esta este tipo de
impresora no necesita de este cambio porque no puede mandar ningún tipo de fax. Además otro problema
es que en la clase cliente también se usa el método sendFax() pero no hay ninguna instancia de objeto
de alguna clase de tipo de fax que se pueda usar como parámetro para este método.
</ul>
</details>

#### Pregunta 21[[@MiguelHRLX](https://github.com/MiguelHRLX)]

Si has entendido correctamente el problema. El **ISP** te sugiere que te ocupes de
este tipo de escenario. Explica tu respuesta.

<details>
  <summary>Respuesta</summary>
<ul>
La forma de solucionar este problema sería creando 2 interfaces , una que contenga el
método printDocument() ,que se usará en todas las impresoras ya sea básica o avanzada,
y otra que contenga el método sendFax() ,que solo será usada en impresoras avanzadas, de
esta forma la clase impresoraBásica solo heredaría de la primera interfaz porque solo necesita
del método printDocument(),mientras que la clase impresoraAvanzada heredaría de ambas interfaces
porque necesita ambos métodos. 
</ul>
</details>


#### Pregunta 22[[@Bobter](https://github.com/Bobter)]

¿Es conveniente usar e inicializar el siguiente código?

```java
interface Impresora {
    void printDocument();

    void sendFax();
}
```

<details>
  <summary>Respuesta</summary>
<ul> Antes de afirmar o negar algo respecto a este punto debemos de tener en cuenta que es importante que las interface posean métodos que puedan ser usados por todas las clases a las que se implementen, a partir de esto podemos decir que no es conveniente, ya que como muchos puedo afirmar que la impresora que tengo en casa no envía fax, que si es algo que llevamos a código e implementamos la interface <b>Impresora</b> que se nos presentó en la pregunta nos va a causar una excepción, otro ejemplo de esto sería un supuesto en el que en la interface <b>Impresora</b> tenemos el método escanear, método que causaría también excepciones ya que no todas las impresoras poseen un escáner. Si nosotros usamos la interface tal y como se nos presenta en la pregunta deberíamos modificar las otras clases que tenemos, pero debemos de tener el cuenta el <b>OCP</b> ya que no podemos modificar los métodos ya existentes en las clases.
</ul>
</details>

#### Pregunta 23[[@Bobter](https://github.com/Bobter)]

Si comienzas tu codificación considerando las impresoras avanzadas que pueden
imprimir y enviar un fax, está bien. Pero en una etapa posterior, si tu programa también
necesita admitir impresoras básicas, ¿Qué código puedes escribir?,
¡Ya has visto que este código puede causarte un problema potencial!
Está bastante claro que una impresora básica no necesita enviar un fax. Pero dado que
**ImpresoraBasica** implementa **Impresora**, debe proporcionar una implementación de **sendFax()**.
Como resultado, cuando **sendFax()** cambia en la interfaz **Impresora**, **ImpresoraBasica** necesita
adaptarse al cambio. El **ISP** sugiere que evites este tipo de situaciones.
En este contexto, Cuando lanzas la excepción e intentas usar código polimórfico de manera
incorrecta, ves el impacto de violar el **LSP**. Una vez que modificas **Impresora**, también viola el
**OCP**.
<details>
  <summary>Respuesta</summary>
<ul> Para esto podemos separar la interface <b>Impresora</b>, en 2 interface <b>Impresora</b> y <b>Fax</b> de la siguiente manera:
<li>Antes:</li>

```java
interface Impresora {
    void printDocument();

    void sendFax();
}
```

<li>Ahora:</li>

```java
interface Impresora {
    void printDocument();
}

interface Fax {
    void sendFax();
}
```

Con esta modificación se implementaría las interface necesarias según el tipo de impresora que tengamos. Como un plus
podemos también crear la interface <b>Escaner</b>

```java
interface Escaner {
    void scanDocument();
}
```

Con esto ya podríamos usar las combinaciones de interface para no tener problemas con las impresoras que se usen en
nuestro código.

</ul>
</details>

#### Pregunta 24[[@Bobter](https://github.com/Bobter)]

Comprueba tus respuestas añadiendo dentro de **main()**, el siguiente código
polimórfico:

```java
Impresora impresora=new ImpresoraAvanzada();

        impresora.printDocument();
        impresora.sendFax();

        impresora=new ImpresoraBasica();
        impresora.printDocument();
//impresora .sendFax();
```

Además, no puedes escribir algo como

```java
List<Impresora> impresoras=new ArrayList<Impresora>();

        impresoras.add(new ImpresoraAvanzada());
        impresoras.add(new ImpresoraBasica());

        for(Impresora dispositivo:impresoras){.printDocument();
        // dispositivo.sendFax();
        }
```

En ambos casos, verás excepciones de tiempo de ejecución.
<details>
  <summary>Respuesta</summary>
Efectivamente en los 2 casos se obtienen errores y no se ejecuta correctamente el código, para que esto pase lo modificaremos de la siguente manera:

```java
class Cliente {
    public static void main(String[] args) {
        System.out.println("Demostracion con ISP");

        Impresora impresora = new ImpresoraBasica();
        impresora.printDocument();

        ImpresoraAvanzada impresoraAvanzada = new ImpresoraAvanzada();
        impresoraAvanzada.printDocument();
        impresoraAvanzada.sendFax();
    }

}
```

Como se observa la impresora avanzada debe ser declarada como tal ya que si la declaramos como <b>Impresora</b>
tendríamos el problema que no se podría usar el método <b>sendFax()</b>.
De esta forma ya obtendríamos una salida correcta:

```console
Demostración con ISP
La impresora básica imprime un documento.
La impresora avanzada imprime un documento.
La impresora avanzada envía un fax.
```

</details>

#### Pregunta 25[[@Bobter](https://github.com/Bobter)]

Reemplaza el segmento de código

```java
for(Impresora dispositivo:impresoras){.printDocument();
        // dispositivo.sendFax();
        }
```

Con una expresión lambda adecuada. Tú eliges cuál quieres usar.

<details>
  <summary>Respuesta</summary>
<ul>
El código presentado en la pregunta se reemplazó con el siguiente código, con ayuda del <b>foreach()</b> y de la siguiente expresión lambda:

```java
    impresora->impresora.printDocument()
```

Finalmente ese fragmento de código quedaría así:

```java
    impresoraList.forEach(impresora->impresora.printDocument());
```

Para esto también se tuvo que modificar el código anterior de la clase <b>Cliente</b>.
<li>Antes:</li>

```java
    class Cliente {
    public static void main(String[] args) {
        System.out.println("Demostracion con ISP");

        Impresora impresora = new ImpresoraBasica();
        impresora.printDocument();

        ImpresoraAvanzada impresoraAvanzada = new ImpresoraAvanzada();
        impresoraAvanzada.printDocument();
        impresoraAvanzada.sendFax();

    }

}
```

<li>Ahora:</li>

```java
class Cliente {
    public static void main(String[] args) {
        System.out.println("Demostracion con ISP");

        List<Impresora> impresoraList = new ArrayList<Impresora>();

        impresoraList.add(new ImpresoraBasica());
        impresoraList.add(new ImpresoraAvanzada());

        impresoraList.forEach(impresora -> impresora.printDocument());

    }

}
```

Obteniendo la siguiente salida:

```console
Demostracion con ISP
La impresora basica imprime un documento.
La impresora avanzada imprime un documento.
```

</ul>
</details>

Sean los siguientes archivos:

- **Impresora.java**
- **ImpresoraBasica.java**
- **ImpresoraAvanzada.java**
- **Cliente.java**
- **JerarquiaFax.java**

#### Pregunta 26[[@Bobter](https://github.com/Bobter)]

Muestra la salida y explica los resultados en función de los métodos entregados.

<details>
  <summary>Respuesta</summary>
Salida de

```java
    class Cliente {
    public static void main(String[] args) {
        System.out.println("Demostracion con ISP");

        Impresora impresora = new ImpresoraBasica();
        impresora.printDocument();

        ImpresoraAvanzada impresoraAvanzada = new ImpresoraAvanzada();
        impresoraAvanzada.printDocument();
        impresoraAvanzada.sendFax();

    }

}
```

```console
Demostración con ISP
La impresora básica imprime un documento.
La impresora avanzada imprime un documento.
La impresora avanzada envía un fax.
```

<B>Línea 1</B>

```console
La impresora básica imprime un documento.
```

Correspondiente a una impresora básica, se obtiene haciendo un llamado al método <b>printDocument()</b> de la clase <b>
ImpresoraBasica</b>:

```java
class ImpresoraBasica implements Impresora {
    @Override
    public void printDocument() {
        System.out.println("La impresora basica imprime un documento.");
    }
}
```

Se observa que se realizó un <b>@Override</b> ya que este método pertenece a la interface <b>Impresora</b>.

```java
interface Impresora {
    void printDocument();
}
```

<B>Línea 2 y 3</B>

```console
La impresora avanzada imprime un documento.
La impresora avanzada envía un fax.
```

Correspondiente a una impresora avanzada, se obtiene haciendo un llamado a los métodos <b>printDocument()</b> y <b>
sendFax()</b> de la clase <b>ImpresoraAvanzada</b>:

```java
public class ImpresoraAvanzada implements Impresora, Fax {
    @Override
    public void printDocument() {
        System.out.println("La impresora avanzada imprime un documento.");
    }

    @Override
    public void sendFax() {
        System.out.println("La impresora avanzada envía un fax.");
    }
}
```

Se observan 2 <b>@Override</b> uno de ellos del método <b>printDocument()</b> perteneciente a la interface <b>
Impresora</b>

```java
interface Impresora {
    void printDocument();
}
```

El otro método <b>sendFax()</b> que pertenece a la interface <b>Fax</b>.

```java
interface Fax {
    void sendFax();
}
```

</details>

#### Pregunta 27 [[@Overglitch](https://github.com/Overglitch)]

Supongamos que necesitas admitir otra impresora que pueda imprimir, enviar
faxes y fotocopiar. En este caso, si agregas un método de fotocopiado en la interfaz **Impresora**,
los dos clientes existentes, **ImpresoraBasica** e **ImpresoraAvanzada**, deben adaptarse al cambio.
Busquemos una mejor solución. Hay dos actividades diferentes: una es imprimir unos documentos y la otra es enviar un
fax. Crea dos interfaces llamada **Impresora** y **DispositivoFax**. Impresora contiene el método
**printDocument()** y **DispositivoFax** contiene el método **SendFax()**. La idea es sencilla:

- La clase que desea la función de impresión implementa la interfaz **Impresora** y la clase
  que desea la función de fax implementa la interfaz **DispositivoFax**.
- Si una clase quiere ambas funcionalidades, implementa ambas interfaces.

No debes asumir que el **ISP** dice que una interfaz debe tener solo un método. En este ejemplo
hay dos métodos en la interfaz de **Impresora** y la clase **ImpresoraBasica** necesita únicamente uno de
ellos. Es por eso que ves las interfaces segregadas con solamente un método.
Para terminar esta pregunta, en la sección de **SOLID** del código entregado, completa los
siguientes archivos. No olvides explicar tus resultados.

- **Impresora.java**
- **DispositivoFax.java**
- **ImpresoraBasica.java**
- **ImpresoraAvanzada.java**
- **Cliente.java**

#### Pregunta 28 [[@Overglitch](https://github.com/Overglitch)]

¿Qué sucede si usa un método predeterminado dentro de la interfaz?

#### Pregunta 29 [[@Overglitch](https://github.com/Overglitch)]

¿Qué sucede si proporcionas un método de fax predeterminado en una interfaz?
¡Viste el problema potencial con esto!

#### Pregunta 30 [[@Overglitch](https://github.com/Overglitch)]

¿Qué sucede si usa un método vacío, en lugar de lanzar la excepción?

### [Principio de inversión de dependencia](https://es.wikipedia.org/wiki/Principio_de_inversi%C3%B3n_de_la_dependencia)

#### Pregunta 31 [[@Overglitch](https://github.com/Overglitch)]

Muestra la salida y explica los resultados en función de los métodos entregados

- **InterfaceUsuario.java**
- **OracleDataBase.java**
- **Cliente.java**

<details>
<summary>Respuesta</summary>
<ul> 

```console
A demo without DIP.
El id: E001 es guardado en la base de datos Oracle.
```

<li> En la clase Cliente se instancia una objeto de tipo InterfazUsuario de nombre usuario. En la clase InterfazUsuario se instancia un objeto del tipo OracleDatabase de nombre oracleDatabase como un atributo de esta clase, lo que nos permite acceder al método saveEmpIdInDatabase de la clase OracleDatabase que solicita un string empId de parametro para imprimir un mensaje si el empId fue guardado en la base de datos Oracle.
Al seguir este proceso se imprimen los resultados.</li>
</ul> </details>

#### Pregunta 32 [[@Overglitch](https://github.com/Overglitch)]

El programa es simple, pero ¿Qué tipo de problemas presenta?

<details>
<summary>Respuesta</summary>
<ul> <li> Para ser un problema simple la dependencia de la clase OracleDatabase para el funcionamiento de la clase InterfazUsuario nos dificulta la modificación del código. </li> </ul> </details>

#### Pregunta 33[[@Bobter](https://github.com/Bobter)]

En el programa de la carpeta **SOLID**, para el caso **DIP** verás la siguiente jerarquía:

- **BaseDatos.java**
- **OracleDatabase.java**

La primera parte del **DIP** sugiere que nos centramos en la abstracción. Esto hace que el
programa sea eficiente. Entonces, esta vez la clase **InterfazUsuario** tiene como objetivo la base
de datos de abstracción, en lugar de una implementación concreta como **OracleDatabase**.
Implementa la clase **InterfazUsuario**.
Esto brinda la flexibilidad de considerar una nueva base de datos, como MYSQLDatabase
también.
La segunda parte del **DIP** propone hacer la interfaz de la base de datos considerando la
necesidad de la clase **InterfazUsuario**.
Es importante porque si una interfaz necesita cambiar para admitir a uno de sus clientes, otros
clientes pueden verse afectados por el cambio.
<details>
  <summary>Respuesta</summary>
<ul>
Para este punto vamos a hacer un cambio basado en el <b>InterfazUsuario</b> facilitado en la parte de <b>NoSOLID</b>. 
¿Cómo? Pues se va a reemplazar el elemento <b>oracleDatabase</b> por un <b>baseDatos</b>. ¿Por qué? Pues como vimos en anteriores preguntas la interface <b>BaseDatos</b> será implementada por las clases <b>OracleDatabase</b> y <b>MySQLDatabase</b>, esto permitirá que se puedan usar muchas
más opciones en cuanto a bases de datos que tendrían que implementar la interface <b>BaseDatos</b>. Con este arreglo ya se estaría cumpliendo que 
la clase <b>InterfazUsuario</b> acepte más bases de datos que solo la de <b>Oracle</b>. Para su asignación y manejo se modificaron los métodos <b>InterfazUsuario(...)</b> y <b>saveEmployeeId(String empId)</b>. En el primero, ahora aceptará como argumento una base de datos y se asignará para su manejo, en el segundo método el cambio es más simple solo se modifica dentro del método <b>OracleDatabase</b> por <b>baseDatos</b> que es como se ha definido la base de datos a manejar.

<li>Antes:</li>

```java
public class InterfazUsuario {
    private OracleDatabase oracleDatabase;

    public InterfazUsuario() {
        this.oracleDatabase = new OracleDatabase();
    }

    public void saveEmployeeId(String empId) {
        oracleDatabase.saveEmpIdInDatabase(empId);
    }
}
```

<li>Ahora:</li>

```java
class InterfazUsuario {
    private BaseDatos baseDatos;

    public InterfazUsuario(BaseDatos baseDatos) {
        this.baseDatos = baseDatos;
    }

    public void saveEmployeeId(String empId) {
        baseDatos.saveEmpIdInDatabase(empId);
    }
}
```

</ul>
</details>

#### Pregunta 34 [[@MiguelHRLX](https://github.com/MiguelHRLX)]

Completa todos los archivos siguientes de la sección **SOLID**

- **InterfazUsuario.java**
- **BaseDatos.java**
- **OracleDataBase.java**
- **MySQLDatabase.java**
- **Cliente.java**


Explica los resultados. ¿El programa resuelve todos los posibles problemas del programa que
no usa **DIP**?
En resumen, en **OOP**, te sugiero seguir la cita de ***Robert C. Martin***:
> "Los módulos de alto nivel simplemente no deberían depender de los módulos de bajo nivel de
> ninguna manera. Entonces, cuando tienes una clase base y una clase derivada, tu clase base no debe conocer
> ninguna de sus clases derivadas."

<details>
  <summary>Respuesta</summary>
<ul>
Se usa la interfaz BaseDatos como base para crear las dos clases de base de datos llamadas  MySQLDatabase
y OracleDatabase .BaseDatos tiene el método  saveEmpIdInDatabase(…) el cual imprime un mensaje con la id
del usuario anunciando que se guardó su id en la base de datos, también pide de parámetro un string llamado
empid el cual será la id de usuario , en el caso de la clase MySQLDatabase imprime "El id:  empId  es
guardado en la base de datos MySQL." y la clase OracleDatabase imprime "El id: empId  es guardado en la
base de datos Oracle."

```java
interface BaseDatos {
    public void saveEmpIdInDatabase(String empId);
}

class OracleDatabase implements BaseDatos {
    public void saveEmpIdInDatabase(String empId){
        System.out.println("El id: " + empId + " es guardado en la base de datos Oracle.");
    }
}

class MySQLDatabase implements BaseDatos {
    public void saveEmpIdInDatabase(String empId){
        System.out.println("El id: " + empId + " es guardado en la base de datos MySQL.");
    }
}
```

Cuando se instancie un objeto de la clase InterfazUsuario ,al llamar a su constructor guardará una
referencia a un objeto de la clase BaseDatos, la cual es una interfaz que tiene dos clases que heredan
de esta las cuales son OracleDatabase y MYSQLDatabase, esto le será útil a la clase InterfazUsuario para
que pueda hacer referencia a cualquiera de estos dos tipos de base de datos con solo usar la abstracción
BaseDatos. En el método saveEmployeeId(…) pide de parámetro un string llamado empId para colocarlo como
parámetro del método saveEmpIdInDatabase(…) de la base de datos guardada.

```java
class InterfazUsuario {
  private BaseDatos baseDatos ;

  public InterfazUsuario(BaseDatos baseDatos) {
      this.baseDatos= baseDatos;
  }
  public void saveEmployeeId(String empId) {
      baseDatos.saveEmpIdInDatabase(empId);
  }
}
```
Finalmente, en la clase Cliente Creamos un objeto de clase BaseDatos llamado baseDatos y lo igualamos a un
nuevo objeto de clase OracleDatabase , después creamos un objeto de tipo InterfazUsuario y le colocaremos en
el parámetro del constructor la base de datos anterior, luego el interfaz de usuario usará el método saveEmployeeId(..)
con el id E001 lo que hace que imprima “El id: E001 es guardado en la base de datos Oracle”. Después al objeto base
datos lo igualamos a un nuevo objeto de tipo MySQLDatabase , a la interfaz de usuario la volvemos a crear pero esta vez
con la nueva base de datos en el parámetro, pero esta vez al usar el método  saveEmployeeId(..) le asignamos el id
E002 por lo que imprimirá “El id: E002 es guardado en la base de datos MySQL.”

```java
public class Cliente {
    public static void main(String[] args) {

        // Usando Oracle
        BaseDatos baseDatos = new OracleDatabase();
        InterfazUsuario interfazUsuario = new InterfazUsuario(baseDatos);
        interfazUsuario.saveEmployeeId("E001");
        
        // Usando Mysql
        baseDatos = new MySQLDatabase();
        interfazUsuario = new InterfazUsuario(baseDatos);
        interfazUsuario.saveEmployeeId("E002");
    }
}
```
al ejecutar el código tendría la sigueinte salida.
```console
El id: E001 es guardado en la base de datos Oracle.
El id: E002 es guardado en la base de datos MySQL.
```
</ul>
</details>



#### Pregunta 35

Encuentra alguna excepción a esta sugerencia.

#### Pregunta 36 [[@MiguelHRLX](https://github.com/MiguelHRLX)]

El constructor de la clase **InterfazUsuario** acepta un parámetro de base de datos.
Proporciona una instalación adicional a un usuario cuando utiliza tanto el constructor como el
método setter (**setDatabase**) dentro de esta clase. ¿Cuál es el beneficio?
<details>
  <summary>Respuesta</summary>
<ul>
Al añadir el método setDatabase(…) nos da el beneficio de evitar volver a crear el mismo
objeto InterfazUsuario y solo usar este setter para hacer un cambio de tipo de base de datos.
En la ejecución del programa anterior se tenía que crear la interfaz de usuario al momento de
cambiar de una base de datos Oracle a una base de datos MySQL, pero ahora en lugar de volver a
crear la interfaz solo se usaría el método setDataBase(), el codigo de Cliente quedaría algo así.

```java
public class Cliente {
    public static void main(String[] args) {

        // Usando Oracle
        BaseDatos baseDatos = new OracleDatabase();
        InterfazUsuario interfazUsuario = new InterfazUsuario(baseDatos);
        interfazUsuario.saveEmployeeId("E001");
        
        // Usando Mysql
        baseDatos = new MySQLDatabase();
        interfazUsuario.setDataBase(baseDatos);
        interfazUsuario.saveEmployeeId("E002");
    }
}
```
</ul>
</details>
