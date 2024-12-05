package kotlin.reflect.x.internal.l0.l;

import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.b.h;
import kotlin.reflect.x.internal.l0.l.t1.g;

/* compiled from: StarProjectionImpl.kt */
/* loaded from: classes2.dex */
public final class r0 extends h1 {
    private final e0 a;

    public r0(h hVar) {
        l.f(hVar, "kotlinBuiltIns");
        m0 I = hVar.I();
        l.e(I, "kotlinBuiltIns.nullableAnyType");
        this.a = I;
    }

    @Override // kotlin.reflect.x.internal.l0.l.g1
    public r1 a() {
        return r1.OUT_VARIANCE;
    }

    @Override // kotlin.reflect.x.internal.l0.l.g1
    public g1 b(g gVar) {
        l.f(gVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.x.internal.l0.l.g1
    public boolean c() {
        return true;
    }

    @Override // kotlin.reflect.x.internal.l0.l.g1
    public e0 getType() {
        return this.a;
    }
}
