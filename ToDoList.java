import java.util.PriorityQueue;

public class ToDoList {
    private PriorityQueue<PojoClass> tasks;

    public ToDoList() {
        tasks = new PriorityQueue<>();
    }

    public void addPojoClass(int deadline, String name) {
        tasks.offer(new PojoClass(deadline, name));
    }

    public PojoClass getNextPojoClass() {
        return tasks.peek();
    }

    public PojoClass completePojoClass() {
        return tasks.poll();
    }

    public void clearPojoClass() {
        tasks.clear();
    }

    public boolean isEmpty() {
        return tasks.isEmpty();
    }
}