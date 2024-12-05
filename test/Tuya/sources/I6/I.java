package i6;

import P5.e;
import P5.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import n6.AbstractC3500n;
import n6.C3496j;
import n6.C3499m;

/* loaded from: classes5.dex */
public abstract class I extends P5.a implements P5.e {
    public static final a Key = new a(null);

    /* loaded from: classes5.dex */
    public static final class a extends P5.b {

        /* renamed from: i6.I$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0760a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0760a f31712a = new C0760a();

            C0760a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final I invoke(g.b bVar) {
                if (bVar instanceof I) {
                    return (I) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }

        private a() {
            super(P5.e.f7991a0, C0760a.f31712a);
        }
    }

    public I() {
        super(P5.e.f7991a0);
    }

    public abstract void dispatch(P5.g gVar, Runnable runnable);

    public void dispatchYield(P5.g gVar, Runnable runnable) {
        dispatch(gVar, runnable);
    }

    @Override // P5.a, P5.g.b, P5.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) e.a.a(this, cVar);
    }

    @Override // P5.e
    public final <T> P5.d interceptContinuation(P5.d dVar) {
        return new C3496j(this, dVar);
    }

    public boolean isDispatchNeeded(P5.g gVar) {
        return true;
    }

    public I limitedParallelism(int i8) {
        AbstractC3500n.a(i8);
        return new C3499m(this, i8);
    }

    @Override // P5.a, P5.g.b, P5.g
    public P5.g minusKey(g.c cVar) {
        return e.a.b(this, cVar);
    }

    @Override // P5.e
    public final void releaseInterceptedContinuation(P5.d dVar) {
        AbstractC3159y.g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C3496j) dVar).s();
    }

    public String toString() {
        return Q.a(this) + '@' + Q.b(this);
    }

    public final I plus(I i8) {
        return i8;
    }
}
