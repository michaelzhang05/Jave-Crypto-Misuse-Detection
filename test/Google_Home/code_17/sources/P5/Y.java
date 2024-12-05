package P5;

import b6.InterfaceC1985a;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class Y extends AbstractC1362c {

    /* renamed from: a, reason: collision with root package name */
    private final List f8846a;

    /* loaded from: classes5.dex */
    public static final class a implements ListIterator, InterfaceC1985a {

        /* renamed from: a, reason: collision with root package name */
        private final ListIterator f8847a;

        a(int i8) {
            int Z7;
            List list = Y.this.f8846a;
            Z7 = B.Z(Y.this, i8);
            this.f8847a = list.listIterator(Z7);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f8847a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f8847a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f8847a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            int Y7;
            Y7 = B.Y(Y.this, this.f8847a.previousIndex());
            return Y7;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f8847a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int Y7;
            Y7 = B.Y(Y.this, this.f8847a.nextIndex());
            return Y7;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public Y(List delegate) {
        AbstractC3255y.i(delegate, "delegate");
        this.f8846a = delegate;
    }

    @Override // P5.AbstractC1362c, java.util.List
    public Object get(int i8) {
        int X7;
        List list = this.f8846a;
        X7 = B.X(this, i8);
        return list.get(X7);
    }

    @Override // P5.AbstractC1362c, P5.AbstractC1360a
    public int getSize() {
        return this.f8846a.size();
    }

    @Override // P5.AbstractC1362c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // P5.AbstractC1362c, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // P5.AbstractC1362c, java.util.List
    public ListIterator listIterator(int i8) {
        return new a(i8);
    }
}
