# Curso de desarrollo de software

## Práctica Calificada 3

### Principio de responsabilidad única

#### Pregunta 1

Muestra la salida y explica los resultados en función de los métodos entregados

#### Pregunta 2

¿Cuál es el problema con este diseño y las razones posibles del problema?

#### Pregunta 3 [ [@Overglitch](https://github.com/Overglitch) ]

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
  <li> Implementación de la clase <b>SeniorityChecker</b> con el método <b>checkSeniority( )</b> </li>

```java
public class SeniorityChecker {
    // completar
    public static String checkSeniority(double experienceInYears) {
        return experienceInYears >= 5 ? "Senior" : "Junior";
    }
}
```

  <li> Implementación de la clase <b>GeneradorIDEmpleado</b> con el método <b>generateEmpId( ... )</b> </li>

```java
public class GeneradorIDEmpleado {
    //completar
    public static String generateEmpId(String empFirstName) {
        int random = new Random().nextInt(1000);
        return empFirstName.substring(0, 1) + random;
    }
}
```

  <li> Accediendo a los métodos antes mencionados mediante el método <b style="color: khaki">showEmpDetail()</b> </li>

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

#### Pregunta 4

Realiza una demostración completa que sigue a SRP. Explica tus resultados

- **Empleado.java**
- **GeneradorIdEmpleado.java**
- **SeniorityChecker.java**
- **Cliente.java**

### Principio abierto/cerrado

#### Pregunta 5

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

Sean los siguientes archivos:

- **Estudiante.java**
- **DistinctionDecider.java**
- **Cliente.java**

#### Pregunta 6

Muestra la salida y explica los resultados en función de los métodos entregados

#### Pregunta 7

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

#### Pregunta 8

Debes abordar el método de evaluación para la distinción de una mejor manera.
Por lo tanto, crea la interfaz **DistinctionDecider** que contiene un método llamado
**EvaluationDistinction**.

#### Pregunta 9

Completa el código de **ArtsDistinctionDecider** y **ScienceDistinctionDecider** que
implementan esta interfaz y sobreescriben el método de **evaluateDistinction(...)** para
especificar los criterios de evaluación según sus necesidades. De esta forma, los criterios de
distinción específicos de flujo se envuelven en una unidad independiente.
Debes tener en cuenta que el método de **evaluateDistinction(...)** acepta un parámetro
**Estudiante**. Significa que ahora también puede pasar un objeto **ArtsStudent** o un objeto
**ScienceStudent** a este método.
El código restante es fácil y no debería tener ningún problema para comprender la siguiente
demostración ahora.

#### Pregunta 10

Realiza una demostración completa que sigue a OCP. Explica tus resultados

- **Estudiante.java**
- **ArteEstudiante.java**
- **CienciaEstudiante.java**
- **DistinctionDecider.java**
- **ScienceDistinctionDecider.java**
- **ArtsDistinctionDecider.java**
- **Cliente.java**

#### Pregunta 11

¿Cuáles son las principales ventajas ahora?

### Principio de sustitución de Liskov

#### Pregunta 12

Muestra la salida y explica los resultados en función de los métodos entregados

#### Pregunta 13

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

#### Pregunta 14

Dentro del método **main()**, utilizas una instancia de usuario invitado e intentas
usar su clase auxiliar de la misma manera, ¿Qué tipo de excepción te encuentras? ¿Cuál es la
solución?

#### Pregunta 15

Todo lo anterior Lo más importante es que viola el **OCP** cada vez que modifica una
clase existente que usa esta cadena *if-else*. Entonces, busquemos una mejor solución.

#### Pregunta 16

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

#### Pregunta 17

¿Cuáles son los cambios clave?

#### Pregunta 18

Ten que aquí el enfoque clave estaba en el principio **LSP**, nada más. Podrías
refactorizar fácilmente el código del cliente usando algún método estático. Por ejemplo realiza
una modificación donde utilizas un método estático para mostrar todas las solicitudes de pago
y utilizar este método siempre que lo necesites.

### Principio de segregación de interfaz

#### Pregunta 19

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

#### Pregunta 20

Para usar esta jerarquía de herencia, una vez que modificas el método **sendFax()** a
**sendFax(Fax faxType)** en la clase **ImpresoraAvanzada**, exige que cambies la interfaz de
**Impresora** (sí, aquí también rompe el **OCP**).
Cuando actualices **Impresora**, también debes actualizar la clase **impresoraBasica** para
adaptarse a este cambio. ¡Ahora ves el problema!. Explica el problema.

#### Pregunta 21

Si has entendido correctamente el problema. El **ISP** te sugiere que te ocupes de
este tipo de escenario. Explica tu respuesta.

#### Pregunta 22

¿Es conveniente usar e inicializar el siguiente código?

```java
interface Impresora {
    void printDocument();

    void sendFax();
}
```

#### Pregunta 23

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

##### Respuesta

#### Pregunta 24

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

#### Pregunta 25

Reemplaza el segmento de código

```java
for(Impresora dispositivo:impresoras){.printDocument();
        // dispositivo.sendFax();
        }
```

Con una expresión lambda adecuada. Tú eliges cuál quieres usar.
Sean los siguientes archivos:

- **Impresora.java**
- **ImpresoraBasica.java**
- **ImpresoraAvanzada.java**
- **Cliente.java**
- **JerarquiaFax.java**

#### Pregunta 26

Muestra la salida y explica los resultados en función de los métodos entregados.

#### Pregunta 27

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

#### Pregunta 28

¿Qué sucede si usa un método predeterminado dentro de la interfaz?

#### Pregunta 29

¿Qué sucede si proporcionas un método de fax predeterminado en una interfaz?
¡Viste el problema potencial con esto!

#### Pregunta 30

¿Qué sucede si usa un método vacío, en lugar de lanzar la excepción?

### Principio de inversión de dependencia

#### Pregunta 31

Muestra la salida y explica los resultados en función de los métodos entregados

- **InterfaceUsuario.java**
- **OracleDataBase.java**
- **Cliente.java**

#### Pregunta 32

El programa es simple, pero ¿Qué tipo de problemas presenta?

#### Pregunta 33

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

#### Pregunta 34

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

#### Pregunta 35

Encuentra alguna excepción a esta sugerencia.

#### Pregunta 36

El constructor de la clase **InterfazUsuario** acepta un parámetro de base de datos.
Proporciona una instalación adicional a un usuario cuando utiliza tanto el constructor como el
método setter (**setDatabase**) dentro de esta clase. ¿Cuál es el beneficio?