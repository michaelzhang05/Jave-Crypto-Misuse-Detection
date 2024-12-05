package l6;

import S5.e;
import S5.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import q6.AbstractC3879n;
import q6.C3875j;
import q6.C3878m;

/* loaded from: classes5.dex */
public abstract class I extends S5.a implements S5.e {
    public static final a Key = new a(null);

    /* loaded from: classes5.dex */
    public static final class a extends S5.b {

        /* renamed from: l6.I$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0790a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0790a f34564a = new C0790a();

            C0790a() {
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

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }

        private a() {
            super(S5.e.f9822a0, C0790a.f34564a);
        }
    }

    public I() {
        super(S5.e.f9822a0);
    }

    public abstract void dispatch(S5.g gVar, Runnable runnable);

    public void dispatchYield(S5.g gVar, Runnable runnable) {
        dispatch(gVar, runnable);
    }

    @Override // S5.a, S5.g.b, S5.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) e.a.a(this, cVar);
    }

    @Override // S5.e
    public final <T> S5.d interceptContinuation(S5.d dVar) {
        return new C3875j(this, dVar);
    }

    public boolean isDispatchNeeded(S5.g gVar) {
        return true;
    }

    public I limitedParallelism(int i8) {
        AbstractC3879n.a(i8);
        return new C3878m(this, i8);
    }

    @Override // S5.a, S5.g.b, S5.g
    public S5.g minusKey(g.c cVar) {
        return e.a.b(this, cVar);
    }

    @Override // S5.e
    public final void releaseInterceptedContinuation(S5.d dVar) {
        AbstractC3255y.g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C3875j) dVar).u();
    }

    public String toString() {
        return Q.a(this) + '@' + Q.b(this);
    }

    public final I plus(I i8) {
        return i8;
    }
}
