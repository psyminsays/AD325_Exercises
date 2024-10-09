// a)
int sum = 0;
for (int i = 1; i <= N + 2; i++) {
sum++;
        }
        for (int j = 1; j <= N * 2; j++) {
sum += 5;
        }
        System.out.println(sum);

// b)
int sum = 0;
for (int i = 1; i <= N - 5; i++) {
        for (int j = 1; j <= N - 5; j += 2) {
sum++;
        }
        }
        System.out.println(sum);

// c)
int sum = N;
for (int i = 0; i < 1000000; i++) {
        for (int j = 1; j <= i; j++) {
sum += N;
    }
            for (int j = 1; j <= i; j++) {
sum += N;
    }
            for (int j = 1; j <= i; j++) {
sum += N;
    }
            }
            System.out.println(sum);

// d)
ArrayList<Integer> list = new ArrayList<Integer>();
for (int i = 1; i <= N * N; i++) {
        for (int j = 1; j <= N; j++) {
        list.add(i + j);
    }
            }

            for (int i = 1; i <= 2 * N; i++) {
        list.remove(list.size() - 1);
        }
        System.out.println("done!");

// e)
HashSet<Integer> set1 = new HashSet<Integer>();
for (int i = 1; i <= N; i++) {
        set1.add(i);
}

TreeSet<Integer> set2 = new TreeSet<Integer>();
for (int i = 1; i <= N; i++) {
        set1.remove(i);
    set2.add(i + N);
}
        System.out.println("done!");
