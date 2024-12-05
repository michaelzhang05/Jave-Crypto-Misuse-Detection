package i6;

import b6.InterfaceC1985a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: i6.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3007p implements InterfaceC2998g, InterfaceC2993b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2998g f33013a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33014b;

    /* renamed from: i6.p$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, InterfaceC1985a {

        /* renamed from: a, reason: collision with root package name */
        private int f33015a;

        /* renamed from: b, reason: collision with root package name */
        private final Iterator f33016b;

        a(C3007p c3007p) {
            this.f33015a = c3007p.f33014b;
            this.f33016b = c3007p.f33013a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f33015a > 0 && this.f33016b.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            int i8 = this.f33015a;
            if (i8 != 0) {
                this.f33015a = i8 - 1;
                return this.f33016b.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3007p(InterfaceC2998g sequence, int i8) {
        AbstractC3255y.i(sequence, "sequence");
        this.f33013a = sequence;
        this.f33014b = i8;
        if (i8 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i8 + '.').toString());
    }

    @Override // i6.InterfaceC2993b
    public InterfaceC2998g a(int i8) {
        if (i8 >= this.f33014b) {
            return this;
        }
        return new C3007p(this.f33013a, i8);
    }

    @Override // i6.InterfaceC2998g
    public Iterator iterator() {
        return new a(this);
    }
}
