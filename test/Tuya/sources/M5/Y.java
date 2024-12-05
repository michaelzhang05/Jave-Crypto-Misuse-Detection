package M5;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class Y extends AbstractC1230c {

    /* renamed from: a, reason: collision with root package name */
    private final List f7022a;

    /* loaded from: classes5.dex */
    public static final class a implements ListIterator, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        private final ListIterator f7023a;

        a(int i8) {
            int Z7;
            List list = Y.this.f7022a;
            Z7 = B.Z(Y.this, i8);
            this.f7023a = list.listIterator(Z7);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f7023a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f7023a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f7023a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            int Y7;
            Y7 = B.Y(Y.this, this.f7023a.previousIndex());
            return Y7;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f7023a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int Y7;
            Y7 = B.Y(Y.this, this.f7023a.nextIndex());
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
        AbstractC3159y.i(delegate, "delegate");
        this.f7022a = delegate;
    }

    @Override // M5.AbstractC1230c, java.util.List
    public Object get(int i8) {
        int X7;
        List list = this.f7022a;
        X7 = B.X(this, i8);
        return list.get(X7);
    }

    @Override // M5.AbstractC1230c, M5.AbstractC1228a
    public int getSize() {
        return this.f7022a.size();
    }

    @Override // M5.AbstractC1230c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // M5.AbstractC1230c, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // M5.AbstractC1230c, java.util.List
    public ListIterator listIterator(int i8) {
        return new a(i8);
    }
}
