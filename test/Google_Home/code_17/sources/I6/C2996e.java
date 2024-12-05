package i6;

import b6.InterfaceC1985a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: i6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2996e implements InterfaceC2998g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2998g f32990a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f32991b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f32992c;

    /* renamed from: i6.e$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, InterfaceC1985a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f32993a;

        /* renamed from: b, reason: collision with root package name */
        private Iterator f32994b;

        a() {
            this.f32993a = C2996e.this.f32990a.iterator();
        }

        private final boolean a() {
            Iterator it = this.f32994b;
            if (it != null && !it.hasNext()) {
                this.f32994b = null;
            }
            while (true) {
                if (this.f32994b != null) {
                    break;
                }
                if (!this.f32993a.hasNext()) {
                    return false;
                }
                Iterator it2 = (Iterator) C2996e.this.f32992c.invoke(C2996e.this.f32991b.invoke(this.f32993a.next()));
                if (it2.hasNext()) {
                    this.f32994b = it2;
                    break;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return a();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (a()) {
                Iterator it = this.f32994b;
                AbstractC3255y.f(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2996e(InterfaceC2998g sequence, Function1 transformer, Function1 iterator) {
        AbstractC3255y.i(sequence, "sequence");
        AbstractC3255y.i(transformer, "transformer");
        AbstractC3255y.i(iterator, "iterator");
        this.f32990a = sequence;
        this.f32991b = transformer;
        this.f32992c = iterator;
    }

    @Override // i6.InterfaceC2998g
    public Iterator iterator() {
        return new a();
    }
}
