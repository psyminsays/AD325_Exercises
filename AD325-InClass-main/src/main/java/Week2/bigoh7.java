// a)
int sum = 0;
for (int i = 1; i <= N - 999; i++) {
        for (int j = 1; j <= 0.0001 * N/2; j++) {
sum++;
        }
        }

// b)
int sum = 0;
for (int i = 1; i <= 1000000; i++) {
sum++;
        }
int x = 999999;
for (int i = 1; i <= x; i++) {
        for (int j = 1; j <= 999; j++) {
sum++;
        }
        for (int k = 1; k <= 999; k++) {
sum++;
        }
        }
        System.out.println(sum);

// c)
ArrayList<Integer> vecC = new ArrayList<Integer>();
for (int i = 1; i <= N; i++) {
        vecC.add(0, i);
}
TreeSet<Integer> setC = new TreeSet<Integer>();
for (int i = 0; i < vecC.size(); i++) {
        setC.add(vecC.get(i));
        }
        System.out.println("done!");

// d)
TreeMap<Integer, Integer> mapD = new TreeMap<Integer, Integer>();
for (int i = 1; i <= N; i++) {
        mapD.put(i, i/2);
}

TreeSet<Integer> setD = new TreeSet<Integer>();
for (int i = 1; i <= N; i++) {
int value = mapD.get(i);
    setD.add(value);
    mapD.remove(i);
}
        System.out.println("done!");

// e)
ArrayList<Integer> vecE = new ArrayList<Integer>();
for (int i = 1; i <= N; i++) {
        vecE.add(i);
}
Stack<Integer> stackE = new Stack<Integer>();
while (!vecE.isEmpty()) {
        stackE.push(vecE.get(vecE.size() - 1));
        vecE.remove(vecE.size() - 1);
        }
        System.out.println("done!");
