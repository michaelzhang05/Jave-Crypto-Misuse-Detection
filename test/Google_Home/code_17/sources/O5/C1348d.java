package O5;

import O5.s;
import a6.InterfaceC1669o;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.Z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: O5.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1348d extends AbstractC1347c implements S5.d {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1669o f8283a;

    /* renamed from: b, reason: collision with root package name */
    private Object f8284b;

    /* renamed from: c, reason: collision with root package name */
    private S5.d f8285c;

    /* renamed from: d, reason: collision with root package name */
    private Object f8286d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1348d(InterfaceC1669o block, Object obj) {
        super(null);
        Object obj2;
        AbstractC3255y.i(block, "block");
        this.f8283a = block;
        this.f8284b = obj;
        AbstractC3255y.g(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f8285c = this;
        obj2 = AbstractC1346b.f8282a;
        this.f8286d = obj2;
    }

    @Override // O5.AbstractC1347c
    public Object a(Object obj, S5.d dVar) {
        AbstractC3255y.g(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f8285c = dVar;
        this.f8284b = obj;
        Object e8 = T5.b.e();
        if (e8 == T5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return e8;
    }

    public final Object c() {
        Object obj;
        Object obj2;
        Object invoke;
        while (true) {
            Object obj3 = this.f8286d;
            S5.d dVar = this.f8285c;
            if (dVar != null) {
                obj = AbstractC1346b.f8282a;
                if (!s.d(obj, obj3)) {
                    obj2 = AbstractC1346b.f8282a;
                    this.f8286d = obj2;
                    dVar.resumeWith(obj3);
                } else {
                    try {
                        InterfaceC1669o interfaceC1669o = this.f8283a;
                        Object obj4 = this.f8284b;
                        if (!(interfaceC1669o instanceof kotlin.coroutines.jvm.internal.a)) {
                            invoke = T5.b.d(interfaceC1669o, this, obj4, dVar);
                        } else {
                            invoke = ((InterfaceC1669o) Z.d(interfaceC1669o, 3)).invoke(this, obj4, dVar);
                        }
                        if (invoke != T5.b.e()) {
                            dVar.resumeWith(s.b(invoke));
                        }
                    } catch (Throwable th) {
                        s.a aVar = s.f8302b;
                        dVar.resumeWith(s.b(t.a(th)));
                    }
                }
            } else {
                t.b(obj3);
                return obj3;
            }
        }
    }

    @Override // S5.d
    public S5.g getContext() {
        return S5.h.f9825a;
    }

    @Override // S5.d
    public void resumeWith(Object obj) {
        this.f8285c = null;
        this.f8286d = obj;
    }
}
