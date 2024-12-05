package f6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2679f implements InterfaceC2680g {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f31133a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f31134b;

    /* renamed from: f6.f$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        private Object f31135a;

        /* renamed from: b, reason: collision with root package name */
        private int f31136b = -2;

        a() {
        }

        private final void b() {
            Object invoke;
            int i8;
            if (this.f31136b != -2) {
                Function1 function1 = C2679f.this.f31134b;
                Object obj = this.f31135a;
                AbstractC3159y.f(obj);
                invoke = function1.invoke(obj);
            } else {
                invoke = C2679f.this.f31133a.invoke();
            }
            this.f31135a = invoke;
            if (invoke == null) {
                i8 = 0;
            } else {
                i8 = 1;
            }
            this.f31136b = i8;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f31136b < 0) {
                b();
            }
            if (this.f31136b == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f31136b < 0) {
                b();
            }
            if (this.f31136b != 0) {
                Object obj = this.f31135a;
                AbstractC3159y.g(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f31136b = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2679f(Function0 getInitialValue, Function1 getNextValue) {
        AbstractC3159y.i(getInitialValue, "getInitialValue");
        AbstractC3159y.i(getNextValue, "getNextValue");
        this.f31133a = getInitialValue;
        this.f31134b = getNextValue;
    }

    @Override // f6.InterfaceC2680g
    public Iterator iterator() {
        return new a();
    }
}
