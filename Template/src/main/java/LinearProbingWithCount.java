import java.util.*;

public class LinearProbingWithCount<K, V> implements DictionaryInterface<K, V> {
    private static final int INITIAL_CAPACITY = 300;
    private Entry<K, V>[] table;
    private int size;

    // Entry class to store key-value pairs
    private static class Entry<K, V> {
        K key;
        V value;
        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public LinearProbingWithCount() {
        table = new Entry[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public V add(K key, V value) {
        int index = hash(key);  // Calculate initial index
        while (table[index] != null) {
            if (table[index].key.equals(key)) {
                V oldValue = table[index].value;
                table[index].value = value;
                return oldValue;  // Replace and return the old value
            }
            index = (index + 1) % table.length;  // Linear probing: increment and wrap around
        }
        table[index] = new Entry<>(key, value);
        size++;
        return null;
    }

    @Override
    public V remove(K key) {
        int index = hash(key);  // Calculate initial index
        while (table[index] != null) {
            if (table[index].key.equals(key)) {
                V oldValue = table[index].value;
                table[index] = null;
                size--;
                return oldValue;
            }
            index = (index + 1) % table.length;  // Linear probing: increment and wrap around
        }
        return null;
    }

    @Override
    public V getValue(K key) {
        int index = hash(key);  // Calculate initial index
        while (table[index] != null) {
            if (table[index].key.equals(key)) {
                return table[index].value;
            }
            index = (index + 1) % table.length;  // Linear probing: increment and wrap around
        }
        return null;
    }

    @Override
    public boolean contains(K key) {
        return getValue(key) != null;
    }

    @Override
    public Iterator<K> getKeyIterator() {
        return null;  // Not implemented for simplicity
    }

    @Override
    public Iterator<V> getValueIterator() {
        return null;  // Not implemented for simplicity
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        table = new Entry[INITIAL_CAPACITY];
        size = 0;
    }

    private int hash(K key) {
        // Ensure that the hash index is non-negative and within bounds
        return Math.abs(key.hashCode()) % table.length;
    }
}