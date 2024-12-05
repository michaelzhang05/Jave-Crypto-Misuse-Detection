package kotlin.reflect.x.internal.l0.i.w.o;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.x.internal.l0.l.e0;

/* compiled from: ContextReceiver.kt */
/* loaded from: classes2.dex */
public final class c extends a implements f {

    /* renamed from: c, reason: collision with root package name */
    private final a f20949c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, e0 e0Var, f fVar) {
        super(e0Var, fVar);
        l.f(aVar, "declarationDescriptor");
        l.f(e0Var, "receiverType");
        this.f20949c = aVar;
    }

    public a c() {
        return this.f20949c;
    }

    public String toString() {
        return "Cxt { " + c() + " }";
    }
}
