package f6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: f6.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2689p implements InterfaceC2680g, InterfaceC2675b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2680g f31150a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31151b;

    /* renamed from: f6.p$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        private int f31152a;

        /* renamed from: b, reason: collision with root package name */
        private final Iterator f31153b;

        a(C2689p c2689p) {
            this.f31152a = c2689p.f31151b;
            this.f31153b = c2689p.f31150a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f31152a > 0 && this.f31153b.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            int i8 = this.f31152a;
            if (i8 != 0) {
                this.f31152a = i8 - 1;
                return this.f31153b.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2689p(InterfaceC2680g sequence, int i8) {
        AbstractC3159y.i(sequence, "sequence");
        this.f31150a = sequence;
        this.f31151b = i8;
        if (i8 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i8 + '.').toString());
    }

    @Override // f6.InterfaceC2675b
    public InterfaceC2680g a(int i8) {
        if (i8 >= this.f31151b) {
            return this;
        }
        return new C2689p(this.f31150a, i8);
    }

    @Override // f6.InterfaceC2680g
    public Iterator iterator() {
        return new a(this);
    }
}
