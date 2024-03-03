package liste;

public class ArrayList {
	
	for (Integer element : tab) {
	    System.out.println(element);
	}

	// Solution 2
	System.out.println(tab);

	// Solution 3
	tab.forEach(System.out::println);

	// Solution 4
	IntStream.range(0, tab.size()).forEach(i -> System.out.println(tab.get(i)));

}
for (int i = tab.size() - 1; i >= 0; i--) {
    System.out.println(tab.get(i));
}

// Solution 2
Collections.reverse(tab);
System.out.println(tab);
}

for (int i = 0; i < tab.size(); i += 2) {
    System.out.println(tab.get(i));
}

// Solution 2
IntStream.range(0, tab.size())
    .filter(i -> i % 2 == 0)
    .forEach(i -> System.out.println(tab.get(i)));
}

for (int i = 0; i < tab.size(); i++) {
    if (tab.get(i) < 0) {
        tab.set(i, 0);
    }
}

// Solution 2
ListIterator<Integer> iterator = tab.listIterator();
while (iterator.hasNext()) {
    Integer element = iterator.next();
    if (element < 0) {
        iterator.set(0);
    }
}
