# Java Techniques - exercises
###### Kamil Cecherz

---

### Asymmetric Data And Object

###### project inspired by publication:
* [Czysty kod. Podręcznik dobrego programisty - Robert C. Martin](https://helion.pl/ksiazki/czysty-kod-podrecznik-dobrego-programisty-robert-c-martin,czykov.htm#format/d)
<br /> s.115 | **Listing 6.5**
  
---

### Observer Pattern

###### project inspired by [Wiki site](https://en.wikipedia.org/wiki/Observer_pattern#Java)

```
While the library classes java.util.Observer and java.util.Observable exist, 
they have been deprecated in Java 9 because the model implemented was quite limited.

Below is an example written in Java that takes keyboard input and treats each input line as an event. 
When a string is supplied from System.in, the method notifyObservers is then called, in order to notify 
all observers of the event's occurrence, in the form of an invocation of their 'update' methods.
```
<br />

![text](ObserverPattern/observer_example_uml.png)

---

