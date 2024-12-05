package f6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: f6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2677d implements InterfaceC2680g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2680g f31120a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f31121b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f31122c;

    /* renamed from: f6.d$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f31123a;

        /* renamed from: b, reason: collision with root package name */
        private int f31124b = -1;

        /* renamed from: c, reason: collision with root package name */
        private Object f31125c;

        a() {
            this.f31123a = C2677d.this.f31120a.iterator();
        }

        private final void b() {
            while (this.f31123a.hasNext()) {
                Object next = this.f31123a.next();
                if (((Boolean) C2677d.this.f31122c.invoke(next)).booleanValue() == C2677d.this.f31121b) {
                    this.f31125c = next;
                    this.f31124b = 1;
                    return;
                }
            }
            this.f31124b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f31124b == -1) {
                b();
            }
            if (this.f31124b == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f31124b == -1) {
                b();
            }
            if (this.f31124b != 0) {
                Object obj = this.f31125c;
                this.f31125c = null;
                this.f31124b = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2677d(InterfaceC2680g sequence, boolean z8, Function1 predicate) {
        AbstractC3159y.i(sequence, "sequence");
        AbstractC3159y.i(predicate, "predicate");
        this.f31120a = sequence;
        this.f31121b = z8;
        this.f31122c = predicate;
    }

    @Override // f6.InterfaceC2680g
    public Iterator iterator() {
        return new a();
    }
}
