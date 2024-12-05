package i6;

import b6.InterfaceC1985a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: i6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2995d implements InterfaceC2998g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2998g f32983a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f32984b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f32985c;

    /* renamed from: i6.d$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, InterfaceC1985a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f32986a;

        /* renamed from: b, reason: collision with root package name */
        private int f32987b = -1;

        /* renamed from: c, reason: collision with root package name */
        private Object f32988c;

        a() {
            this.f32986a = C2995d.this.f32983a.iterator();
        }

        private final void a() {
            while (this.f32986a.hasNext()) {
                Object next = this.f32986a.next();
                if (((Boolean) C2995d.this.f32985c.invoke(next)).booleanValue() == C2995d.this.f32984b) {
                    this.f32988c = next;
                    this.f32987b = 1;
                    return;
                }
            }
            this.f32987b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f32987b == -1) {
                a();
            }
            if (this.f32987b == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f32987b == -1) {
                a();
            }
            if (this.f32987b != 0) {
                Object obj = this.f32988c;
                this.f32988c = null;
                this.f32987b = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2995d(InterfaceC2998g sequence, boolean z8, Function1 predicate) {
        AbstractC3255y.i(sequence, "sequence");
        AbstractC3255y.i(predicate, "predicate");
        this.f32983a = sequence;
        this.f32984b = z8;
        this.f32985c = predicate;
    }

    @Override // i6.InterfaceC2998g
    public Iterator iterator() {
        return new a();
    }
}
