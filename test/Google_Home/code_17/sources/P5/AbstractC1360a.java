package P5;

import b6.InterfaceC1985a;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3246o;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: P5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1360a implements Collection, InterfaceC1985a {

    /* renamed from: P5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0176a extends AbstractC3256z implements Function1 {
        C0176a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Object obj) {
            return obj == AbstractC1360a.this ? "(this Collection)" : String.valueOf(obj);
        }
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (AbstractC3255y.d(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        AbstractC3255y.i(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract int getSize();

    @Override // java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection, java.util.List
    public Object[] toArray() {
        return AbstractC3246o.a(this);
    }

    public String toString() {
        return AbstractC1378t.w0(this, ", ", "[", "]", 0, null, new C0176a(), 24, null);
    }

    @Override // java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        AbstractC3255y.i(array, "array");
        return (T[]) AbstractC3246o.b(this, array);
    }
}
