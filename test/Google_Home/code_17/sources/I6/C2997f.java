package i6;

import b6.InterfaceC1985a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2997f implements InterfaceC2998g {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f32996a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f32997b;

    /* renamed from: i6.f$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, InterfaceC1985a {

        /* renamed from: a, reason: collision with root package name */
        private Object f32998a;

        /* renamed from: b, reason: collision with root package name */
        private int f32999b = -2;

        a() {
        }

        private final void a() {
            Object invoke;
            int i8;
            if (this.f32999b != -2) {
                Function1 function1 = C2997f.this.f32997b;
                Object obj = this.f32998a;
                AbstractC3255y.f(obj);
                invoke = function1.invoke(obj);
            } else {
                invoke = C2997f.this.f32996a.invoke();
            }
            this.f32998a = invoke;
            if (invoke == null) {
                i8 = 0;
            } else {
                i8 = 1;
            }
            this.f32999b = i8;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f32999b < 0) {
                a();
            }
            if (this.f32999b == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f32999b < 0) {
                a();
            }
            if (this.f32999b != 0) {
                Object obj = this.f32998a;
                AbstractC3255y.g(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f32999b = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2997f(Function0 getInitialValue, Function1 getNextValue) {
        AbstractC3255y.i(getInitialValue, "getInitialValue");
        AbstractC3255y.i(getNextValue, "getNextValue");
        this.f32996a = getInitialValue;
        this.f32997b = getNextValue;
    }

    @Override // i6.InterfaceC2998g
    public Iterator iterator() {
        return new a();
    }
}
