package contaners;

import sim.SimObject;
import sim.Type;

import java.util.ArrayList;
import java.util.Collection;

public abstract class MyArrayList<T extends SimObject> extends ArrayList<T> {
    public T get(String name, Type type) {
        for (T obj : this) {
            if (obj.getName().equals(name) && obj.getType() == type)
                return obj;
        }
        return null;
    }
    
    protected void init() {}
    
    public void updateAll() {
        for (T obj : this) {
            obj.update();
        }
    }
    
    protected MyArrayList(int initialCapacity) {
        super(initialCapacity);
        init();
    }
    
    protected MyArrayList() {
        init();
    }
    
    protected MyArrayList(Collection<? extends T> c) {
        super(c);
        init();
    }
}
