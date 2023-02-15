public class Queue {
    private int Max;
    private char[] queue;
    private int tail;

    public Queue(int Max) {
        this.Max = Max;
        this.queue = new char[Max];
        this.tail = 0;
    }

    public char dequeue() {
        if (tail == 0) {
            return '#'; // Devuelve '#' si la cola está vacía
        }
        char dequeued = queue[0]; // Extrae el primer elemento de la cola
        for (int i = 0; i < tail - 1; i++) {
            queue[i] = queue[i+1]; // Mueve los demás elementos una posición hacia adelante
        }
        tail--; // Actualiza el índice de la siguiente posición libre
        return dequeued; // Devuelve el elemento extraído
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.queue[0] = 'A';
        q.queue[1] = 'B';
        q.tail = 2;

        System.out.println(q.dequeue()); // Imprime 'A'
        System.out.println(q.dequeue()); // Imprime 'B'
        System.out.println(q.dequeue()); // Imprime '#'
    }
}