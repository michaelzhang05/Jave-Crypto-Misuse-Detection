package m6;

import L5.I;
import P5.g;
import i6.B0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3359g;

/* loaded from: classes5.dex */
public final class t extends kotlin.coroutines.jvm.internal.d implements InterfaceC3359g, kotlin.coroutines.jvm.internal.e {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3359g f35937a;

    /* renamed from: b, reason: collision with root package name */
    public final P5.g f35938b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35939c;

    /* renamed from: d, reason: collision with root package name */
    private P5.g f35940d;

    /* renamed from: e, reason: collision with root package name */
    private P5.d f35941e;

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35942a = new a();

        a() {
            super(2);
        }

        public final Integer a(int i8, g.b bVar) {
            return Integer.valueOf(i8 + 1);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public t(InterfaceC3359g interfaceC3359g, P5.g gVar) {
        super(q.f35931a, P5.h.f7994a);
        this.f35937a = interfaceC3359g;
        this.f35938b = gVar;
        this.f35939c = ((Number) gVar.fold(0, a.f35942a)).intValue();
    }

    private final void g(P5.g gVar, P5.g gVar2, Object obj) {
        if (gVar2 instanceof l) {
            l((l) gVar2, obj);
        }
        v.a(this, gVar);
    }

    private final Object h(P5.d dVar, Object obj) {
        P5.g context = dVar.getContext();
        B0.j(context);
        P5.g gVar = this.f35940d;
        if (gVar != context) {
            g(context, gVar, obj);
            this.f35940d = context;
        }
        this.f35941e = dVar;
        X5.o a8 = u.a();
        InterfaceC3359g interfaceC3359g = this.f35937a;
        AbstractC3159y.g(interfaceC3359g, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        AbstractC3159y.g(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object invoke = a8.invoke(interfaceC3359g, obj, this);
        if (!AbstractC3159y.d(invoke, Q5.b.e())) {
            this.f35941e = null;
        }
        return invoke;
    }

    private final void l(l lVar, Object obj) {
        throw new IllegalStateException(g6.n.e("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + lVar.f35929a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // l6.InterfaceC3359g
    public Object emit(Object obj, P5.d dVar) {
        try {
            Object h8 = h(dVar, obj);
            if (h8 == Q5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            if (h8 == Q5.b.e()) {
                return h8;
            }
            return I.f6487a;
        } catch (Throwable th) {
            this.f35940d = new l(th, dVar.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        P5.d dVar = this.f35941e;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, P5.d
    public P5.g getContext() {
        P5.g gVar = this.f35940d;
        if (gVar == null) {
            return P5.h.f7994a;
        }
        return gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public Object invokeSuspend(Object obj) {
        Throwable e8 = L5.s.e(obj);
        if (e8 != null) {
            this.f35940d = new l(e8, getContext());
        }
        P5.d dVar = this.f35941e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return Q5.b.e();
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
