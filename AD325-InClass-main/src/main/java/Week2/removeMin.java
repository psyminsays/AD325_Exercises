public static int removeMin(Stack<Integer> stack) {
    if (stack.isEmpty()) {
        throw new IllegalArgumentException("Stack is empty.");
    }

    // Step 1: Find the minimum value in the stack
    int min = Integer.MAX_VALUE;
    for (Integer value : stack) {
        if (value < min) {
            min = value;
        }
    }

    // Step 2: Remove all instances of the minimum value
    Stack<Integer> auxStack = new Stack<>();

    while (!stack.isEmpty()) {
        int current = stack.pop();
        if (current != min) {
            auxStack.push(current);
        }
    }

    // Step 3: Restore the original stack without the minimum values
    while (!auxStack.isEmpty()) {
        stack.push(auxStack.pop());
    }

    // Return the minimum value found
    return min;
}