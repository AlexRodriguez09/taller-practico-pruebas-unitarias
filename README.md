# Taller práctico de pruebas unitaras

## Consideraciones

> Tenga en cuenta que para poder desarrollar este taller 
> practico debe descargar el código que se encuentra en el repositorio
> Descargue aquí: [Ejercicio practico](https://github.com/AlexRodriguez09/taller-practico-pruebas-unitarias/archive/refs/heads/main.zip)

## Entorno

- IDE: IntelliJ IDEA o Eclipse
- JRE: OpenJDK 17

## Configuración

### Paso 1
- Descargue el ejercicio práctico

### Paso 2
- Importe el proyecto en eclipse o IntellIJ como proyecto maven
### Paso 3
- Si está trabajando en IntellIJ siga estos pasos:

Sobre la clase ProductDomain presione las teclas alt + insert, escoja la opción test
![img.png](img.png)git st,

## Ejercicios prácticos

- [Ejercicio 1 : ](#ejercicio-1)  

    * Asserts
    * Parametized
    * CsvSource
    * Enunciado
    * Pautas

- [Ejercicio 2](#ejercicio-2)
  * Mockito
  * Mock
  * When / Then
  * Verify
  * ArgumentCaptor
  * Enunciado

- [Ejercicio 3](#ejercicio-3)
  * Mock VS Spy

 
### Ejercicio 1

#### Asserts 

[¿Cómo usar asserts?](https://nuamexchange.atlassian.net/wiki/spaces/nuamArq/pages/62488670/JUnit5+Mockito#Assertions)

#### Paremetized 
[Parametized test](https://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests)

#### CSV source
[Usando recursos](https://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests-sources-CsvSource)



En la clase productDomain, cree las pruebas unitarias que considere para cumplir los requerimientos de los atributos mencionados :  
Ruta de la clase **domain\model\ProductDomain.java**
* Nombre producto (nameProduct)
* Nombre empresa asociada (nameCompany)
* Tipo de producto (typeProduct)

Cada atributo debe cumplir los siguientes requerimientos  

- El **nombre** solo debe admitir valores alfanuméricos
- El **nombre empresa asociada** solo debe admitir valores alfabeticos
- El **tipo de producto** solo puede ser de **renta fija, renta variable o derivado**

> **Pautas para desarrollar el ejercicio**
> - Ya que conoce los requerimientos, use la metodología TDD para evaluar los casos:
>   - Diseñe una lista de casos de prueba o posibles escenarios para evaluar que el código de dominio cumple con su función.
>   - Escoja un escenario y escriba la prueba correspondiente (La prueba puede fallar).
>   - Escriba el código referente para que la prueba pueda pasar.
>   - Una vez pase la prueba unitaria, refactorice el código si es necesario y escoja el siguiente caso de prueba.
> - Implemente las anotación cómo @Asserts
> - Implemente la anotación @Parametirized usando @CSVSource para un el atributo **nombre de empresa asociada** que permita evaluar los posibles escenarios de un requerimiento.

### Ejercicio 2

#### Mockito
[Usando Mockito](https://nuamexchange.atlassian.net/wiki/spaces/nuamArq/pages/62488670/JUnit5+Mockito#Mockito)
#### Mock
[¿Qué es un Mock?](https://nuamexchange.atlassian.net/wiki/spaces/nuamArq/pages/62488670/JUnit5+Mockito#Mock-vs-Spy)
#### When / ThenReturn
[Usando When / Then](https://nuamexchange.atlassian.net/wiki/spaces/nuamArq/pages/62488670/JUnit5+Mockito#When-/-Then)
#### doNothing / When
[Uso de doNothing](https://nuamexchange.atlassian.net/wiki/spaces/nuamArq/pages/62488670/JUnit5+Mockito#doNothing-/-When)
#### Verify
[Usando verify](https://nuamexchange.atlassian.net/wiki/spaces/nuamArq/pages/62488670/JUnit5+Mockito#Verify)

#### ArgumentCaptor y captor
[Usando ArgumentCaptor](https://nuamexchange.atlassian.net/wiki/spaces/nuamArq/pages/62488670/JUnit5+Mockito#Captor)

Lea la documentación mencionada a continuación realice los siguientes ejercicios:
- **A**. Cree un test unitario para la clase **ProductPortImpl** para los métodos guardar y eliminar que son de tipo void
  - Ruta de la clase **application\service\ProductPortImpl.java**

- **B**. Cree un test unitario para la clase **ProductPersistenceImpl** para los métodos de consulta: getProductID y getProducts
  - Ruta de la clase **infraestructure\adapters\output\ProductPersistenceImpl.java**  

Usar las anotaciones de:

- @ExtendWith(MockitoExtension.class)
- @InjectMocks
- @Mock
- @Argumentcaptor
- @Captor
- @DoNothing

### Ejercicio 3

Revisar un ejemplo práctico entre las diferencias entre un Mock y un Spy, usando productDomain

>Desarollo un ejemplo práctico donde utilice un Spy, dado el ejemplo presentado en el Ejercicio 3