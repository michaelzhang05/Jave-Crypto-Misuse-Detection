package f6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: f6.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2690q implements InterfaceC2680g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2680g f31154a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f31155b;

    /* renamed from: f6.q$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f31156a;

        /* renamed from: b, reason: collision with root package name */
        private int f31157b = -1;

        /* renamed from: c, reason: collision with root package name */
        private Object f31158c;

        a() {
            this.f31156a = C2690q.this.f31154a.iterator();
        }

        private final void b() {
            if (this.f31156a.hasNext()) {
                Object next = this.f31156a.next();
                if (((Boolean) C2690q.this.f31155b.invoke(next)).booleanValue()) {
                    this.f31157b = 1;
                    this.f31158c = next;
                    return;
                }
            }
            this.f31157b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f31157b == -1) {
                b();
            }
            if (this.f31157b == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f31157b == -1) {
                b();
            }
            if (this.f31157b != 0) {
                Object obj = this.f31158c;
                this.f31158c = null;
                this.f31157b = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2690q(InterfaceC2680g sequence, Function1 predicate) {
        AbstractC3159y.i(sequence, "sequence");
        AbstractC3159y.i(predicate, "predicate");
        this.f31154a = sequence;
        this.f31155b = predicate;
    }

    @Override // f6.InterfaceC2680g
    public Iterator iterator() {
        return new a();
    }
}
