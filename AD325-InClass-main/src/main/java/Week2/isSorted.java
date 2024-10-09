public static boolean isSorted(Stack<Integer> stack) {
    // Base case: An empty or single-element stack is considered sorted
    if (stack.isEmpty() || stack.size() == 1) {
        return true;
    }

    // Create an auxiliary stack to help with the order check
    Stack<Integer> auxStack = new Stack<>();
    boolean sorted = true;

    // Keep track of the last popped element
    int last = stack.pop();
    auxStack.push(last);

    // Process the stack until it's empty
    while (!stack.isEmpty()) {
        int current = stack.pop();
        // If the current element is less than the last one, it's not sorted
        if (current < last) {
            sorted = false;
        }
        // Push the current element onto the auxiliary stack
        auxStack.push(current);
        last = current;
    }

    // Restore the original stack by transferring elements back
    while (!auxStack.isEmpty()) {
        stack.push(auxStack.pop());
    }

    return sorted;
}