package i6;

import b6.InterfaceC1985a;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: i6.r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3009r implements InterfaceC2998g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2998g f33023a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f33024b;

    /* renamed from: i6.r$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, InterfaceC1985a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f33025a;

        a() {
            this.f33025a = C3009r.this.f33023a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33025a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return C3009r.this.f33024b.invoke(this.f33025a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3009r(InterfaceC2998g sequence, Function1 transformer) {
        AbstractC3255y.i(sequence, "sequence");
        AbstractC3255y.i(transformer, "transformer");
        this.f33023a = sequence;
        this.f33024b = transformer;
    }

    public final InterfaceC2998g d(Function1 iterator) {
        AbstractC3255y.i(iterator, "iterator");
        return new C2996e(this.f33023a, this.f33024b, iterator);
    }

    @Override // i6.InterfaceC2998g
    public Iterator iterator() {
        return new a();
    }
}
