package i6;

import b6.InterfaceC1985a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: i6.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3008q implements InterfaceC2998g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2998g f33017a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f33018b;

    /* renamed from: i6.q$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, InterfaceC1985a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f33019a;

        /* renamed from: b, reason: collision with root package name */
        private int f33020b = -1;

        /* renamed from: c, reason: collision with root package name */
        private Object f33021c;

        a() {
            this.f33019a = C3008q.this.f33017a.iterator();
        }

        private final void a() {
            if (this.f33019a.hasNext()) {
                Object next = this.f33019a.next();
                if (((Boolean) C3008q.this.f33018b.invoke(next)).booleanValue()) {
                    this.f33020b = 1;
                    this.f33021c = next;
                    return;
                }
            }
            this.f33020b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f33020b == -1) {
                a();
            }
            if (this.f33020b == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f33020b == -1) {
                a();
            }
            if (this.f33020b != 0) {
                Object obj = this.f33021c;
                this.f33021c = null;
                this.f33020b = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3008q(InterfaceC2998g sequence, Function1 predicate) {
        AbstractC3255y.i(sequence, "sequence");
        AbstractC3255y.i(predicate, "predicate");
        this.f33017a = sequence;
        this.f33018b = predicate;
    }

    @Override // i6.InterfaceC2998g
    public Iterator iterator() {
        return new a();
    }
}
