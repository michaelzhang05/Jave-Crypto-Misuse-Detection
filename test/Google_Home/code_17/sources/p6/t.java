package p6;

import O5.I;
import S5.g;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.B0;
import o6.InterfaceC3707g;

/* loaded from: classes5.dex */
public final class t extends kotlin.coroutines.jvm.internal.d implements InterfaceC3707g, kotlin.coroutines.jvm.internal.e {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3707g f37963a;

    /* renamed from: b, reason: collision with root package name */
    public final S5.g f37964b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37965c;

    /* renamed from: d, reason: collision with root package name */
    private S5.g f37966d;

    /* renamed from: e, reason: collision with root package name */
    private S5.d f37967e;

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f37968a = new a();

        a() {
            super(2);
        }

        public final Integer a(int i8, g.b bVar) {
            return Integer.valueOf(i8 + 1);
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public t(InterfaceC3707g interfaceC3707g, S5.g gVar) {
        super(q.f37957a, S5.h.f9825a);
        this.f37963a = interfaceC3707g;
        this.f37964b = gVar;
        this.f37965c = ((Number) gVar.fold(0, a.f37968a)).intValue();
    }

    private final void a(S5.g gVar, S5.g gVar2, Object obj) {
        if (gVar2 instanceof l) {
            n((l) gVar2, obj);
        }
        v.a(this, gVar);
    }

    private final Object m(S5.d dVar, Object obj) {
        S5.g context = dVar.getContext();
        B0.j(context);
        S5.g gVar = this.f37966d;
        if (gVar != context) {
            a(context, gVar, obj);
            this.f37966d = context;
        }
        this.f37967e = dVar;
        InterfaceC1669o a8 = u.a();
        InterfaceC3707g interfaceC3707g = this.f37963a;
        AbstractC3255y.g(interfaceC3707g, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        AbstractC3255y.g(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object invoke = a8.invoke(interfaceC3707g, obj, this);
        if (!AbstractC3255y.d(invoke, T5.b.e())) {
            this.f37967e = null;
        }
        return invoke;
    }

    private final void n(l lVar, Object obj) {
        throw new IllegalStateException(j6.n.e("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + lVar.f37955a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // o6.InterfaceC3707g
    public Object emit(Object obj, S5.d dVar) {
        try {
            Object m8 = m(dVar, obj);
            if (m8 == T5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            if (m8 == T5.b.e()) {
                return m8;
            }
            return I.f8278a;
        } catch (Throwable th) {
            this.f37966d = new l(th, dVar.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        S5.d dVar = this.f37967e;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, S5.d
    public S5.g getContext() {
        S5.g gVar = this.f37966d;
        if (gVar == null) {
            return S5.h.f9825a;
        }
        return gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public Object invokeSuspend(Object obj) {
        Throwable e8 = O5.s.e(obj);
        if (e8 != null) {
            this.f37966d = new l(e8, getContext());
        }
        S5.d dVar = this.f37967e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return T5.b.e();
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
