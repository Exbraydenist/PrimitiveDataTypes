public class Container {
    // для исправления NullPointerException упаковал примитив 0 в объект count
    // до этого код выглядел так - private Integer count;
    private Integer count = 0;

    public void addCount(int value) {
        count = count + value;
    }

    public int getCount() {
        return count;
    }
}
