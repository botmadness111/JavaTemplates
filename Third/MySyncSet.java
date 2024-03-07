package Third;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class MySyncSet<T> implements Set<T> {
    private final static Semaphore semaphore = new Semaphore(2);
    private HashSet<T> set = new HashSet<>();

    @Override
    public int size() {
        try {
            semaphore.acquire();
            return set.size();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }

    }

    @Override
    public boolean isEmpty() {
        try {
            semaphore.acquire();
            return set.isEmpty();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }

    }

    @Override
    public boolean contains(Object o) {
        try {
            semaphore.acquire();
            return set.contains(o);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }

    }

    @Override
    public Iterator<T> iterator() {
        try {
            semaphore.acquire();
            return set.iterator();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public Object[] toArray() {
        try {
            semaphore.acquire();
            return set.toArray();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        try {
            semaphore.acquire();
            return (T1[]) set.toArray();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean add(T t) {
        try {
            semaphore.acquire();
            return set.add(t);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean remove(Object o) {
        try {
            semaphore.acquire();
            return set.remove(o);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        try {
            semaphore.acquire();
            return set.contains(c);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        try {
            semaphore.acquire();
            return set.add((T) c);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        try {
            semaphore.acquire();
            return set.retainAll(c);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        try {
            semaphore.acquire();
            return set.removeAll(c);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
            set.clear();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }
}
