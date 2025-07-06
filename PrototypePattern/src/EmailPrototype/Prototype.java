package EmailPrototype;

public interface Prototype <T extends Prototype<T>>{
    T copy();
}
