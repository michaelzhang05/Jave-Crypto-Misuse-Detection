package kotlin.reflect.x.internal.l0.i.w.o;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.x.internal.l0.l.e0;

/* compiled from: ContextClassReceiver.kt */
/* loaded from: classes2.dex */
public final class b extends a implements f {

    /* renamed from: c, reason: collision with root package name */
    private final e f20948c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, e0 e0Var, f fVar) {
        super(e0Var, fVar);
        l.f(eVar, "classDescriptor");
        l.f(e0Var, "receiverType");
        this.f20948c = eVar;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.f20948c + " }";
    }
}
