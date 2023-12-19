URL: https://github.com/tonyOehme/Praesenz2Hilfe.git

contents: 
1. sorting algorithms
2. artemis homework and exercises weeks 01 - 08
3. pastes
4. notes to self

1.sorting algorithms: 
- mergeSort
- bubbleSort

2.artemis homework: 
- Bäume und Knoten W08H04

3.pastes: <br> 
you will need this method for a bonus-exercise in week 10 <br>
```
    public Node<T>[] getChildren() { 
		return children; 
	}
```
```
    public Iterator<Destination> iterator() {   

        return new Iterator(someargument);
    }
```
```
    return currentElement != null;
```
"Mom I can reverse a linked list now"

```
public void reverse() {
        //TODO
        // make next element point to current one and point head & tail correctly
        tail = head;
        ListElement<T> previous = null;
        ListElement<T> next = null;
        ListElement<T> current = head;
        while (current != null){
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }

        head = previous;

    }
```

4.notes to self: 
- auf richtige imports achten bei Vererbungen
- java doesnt like it raw
- easy money aufgaben zuerst
- always check invalid inputs(null, empty list, ArrayOutOfBounds)
- user instanceof to figure out if subclass
- == for primitive type /memory comparison
- Object.equals() for everything else 
- before writing code, plan out algorithm
- track change with boolean value
- Integer division cuts off fractional part
- Iterable Interface kann man mit for-schleifen loopen
- implement getter and setter
- hasNext() most of the time <br>
- next() return current element and switches current element to next
- I do not know how to write README.md files don't judge
![img_1.png](img_1.png)

  
Recursion101:
- base case(s)
- recursive case
- memoization hashmap manchmal


wenn alles verkackt -> datenstruktur aussuchen und aufgaben lösen