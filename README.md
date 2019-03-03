# task1
task01

  19)IT-фирма (IT Company). Определить иерархию сотрудников. Создать не-
сколько сотрудников, из которых собрать несколько команд для разработки
IT-проекта.
  Определить стоимость каждой из команд (в человека--часах).
  Провести сортировку и поиск сотрудников на основе одного или нескольких
параметров, которые предъявляются заказчиком.
  Найти сотрудника, соответствующего заданным критериям заказчика, а также
  по экстремальным значениям (самый популярный тариф и наоборот, тариф с
  максимальным/минимальным количеством бонусов и т.д.).
  
  Требования

1) C использование методологии ООП и архитектурного шаблона проектирова-
ния MVC необходимо спроектировать и реализовать на языке программиро-
вания Java программную систему согласно своему варианту задания (вариант

можно выбрать самостоятельно или придумать свой).

2) В рамках выбранного задания разработать иерархию классов-сущностей со-
ответствующей доменной области. Рекомендуется не менее трёх уровней

иерархии, но всё зависит от специфики доменной области. На базе данных
классов в дальнейшем должны создаваться бизнес-объекты.

3) При организации иерархии наследования производные классы должны спе-
циализировать базовый класс, т.е. расширять родительский класс новыми

свойствами. Для чего следует досконально разобраться в предметной (домен-
ной) области.

4) Для реализации бизнес-логики приложения разработать соответствующие

функциональные классы, которые соответствуют решению поставленного за-
дания. Объекты данных классов и будут манипулировать бизнес-объектами

для реализации основного поведения программной системы.

5) Разработать собственную иерархию классов исключений для защиты компо-
нентов программной системы.

6) Для реализации полновесного законченного приложения необходимо также
предусмотреть утилитные (вспомогательные) классы, которые в основном
служат для генерации входных данных и конфигурирования системы.

7) С помощью соответствующего ПО или бумажных листов обязательно приве-
сти UML-диаграмму классов спроектированной программной системы с отоб-
ражением всех типов связей (отношений) между классами и объектами спро-
ектированной программной системы.

Advanced Object-Oriented Programming in Java. SOLID & GRASP Principles

2 | We hope you enjoy working with Java!

8) При проектировании и разработке системы необходимо полностью исполь-
зовать своё ООП-воображение, SOLID и GRASP принципы, а также возможно-
сти, которые предоставляет язык программирования Java.

9) Особенно рекомендуется придерживаться Single Responsibility Principle, SRP

(принципа единственной ответственности): у каждого пакета, класса или ме-
тода должна быть только одна ответственность (цель), т.е. должна быть только

одна причина изменить в дальнейшем соответствующий программный код.

10)При реализации компонентов приложения необходимо по максимуму пы-
таться разрабатывать универсальный, масштабируемый и легко поддержива-
емый и читаемый код.

11)Основные классы системы должны быть самодостаточными, т.е. не зависеть,
к примеру, от консоли! Любые типы отношений между классами (агрегация,

композиция, ассоциация, наследование и т.д.) должны применяться обосно-
вано и лишь тогда, когда это имеет смысл.

12)Классы-сущности не следует перегружать (писать лишнее) методами, выпол-
няющими функциональные действия (методами бизнес-логики и т.д.).

13)Каждый пользовательский тип должен иметь адекватное осмысленное имя и

соответствующий информативный состав (сюда могут входить соответствую-
щие конструкторы: по умолчанию, с параметрами, конструктор-копирования;

get- и set-методы для доступа к состоянию объекта; корректно переопреде-
лённые методы базового класса Object: toString(), equals(), hashCode() и др.).

14)Создаваемые типы должны быть грамотно структурированы по соответству-
ющим пакетам, которые должны иметь «адекватные» названия и начинаться

с: by.epam.javawebtraining.studentname.task01.

15)Рекомендуется в качестве базовой структуры хранилища данных в контейнер-
ных классах использовать массивы!

16)Необходимо предусмотреть контейнеры как с фиксированным начальным
размером, так и их динамически расширяемые варианты.

17)Программа должна обязательно быть снабжена комментариями-разработ-
чика, в которых необходимо указать ФИО разработчика, дату разработки и т.д.

Исходный текст классов и демонстрационной программы рекомендуется
также снабжать комментариями.

18)Язык интерфейса приложения и комментариев должен быть обязательно ан-
глийский.

Advanced Object-Oriented Programming in Java. SOLID & GRASP Principles

3 | We hope you enjoy working with Java!
19)Не надо реализовывать никакого пользовательского меню. Работа с консолью
должна быть настолько минимальной насколько это возможно и только для
варианта цельной программы.
20)При разработке программ придерживайтесь соглашений по написанию кода
на JAVA (Java Code-Convention).
