package kotlin.reflect.x.internal.l0.l;

import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.h.c;
import kotlin.reflect.x.internal.l0.l.t1.g;
import kotlin.reflect.x.internal.l0.l.w1.f;
import kotlin.reflect.x.internal.l0.l.x1.a;

/* compiled from: dynamicTypes.kt */
/* loaded from: classes2.dex */
public final class v extends y implements f {

    /* renamed from: i, reason: collision with root package name */
    private final a1 f21368i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v(kotlin.reflect.x.internal.l0.b.h r3, kotlin.reflect.x.internal.l0.l.a1 r4) {
        /*
            r2 = this;
            java.lang.String r0 = "builtIns"
            kotlin.jvm.internal.l.f(r3, r0)
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.l.f(r4, r0)
            kotlin.f0.x.e.l0.l.m0 r0 = r3.H()
            java.lang.String r1 = "builtIns.nothingType"
            kotlin.jvm.internal.l.e(r0, r1)
            kotlin.f0.x.e.l0.l.m0 r3 = r3.I()
            java.lang.String r1 = "builtIns.nullableAnyType"
            kotlin.jvm.internal.l.e(r3, r1)
            r2.<init>(r0, r3)
            r2.f21368i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.l.v.<init>(kotlin.f0.x.e.l0.b.h, kotlin.f0.x.e.l0.l.a1):void");
    }

    @Override // kotlin.reflect.x.internal.l0.l.y, kotlin.reflect.x.internal.l0.l.e0
    public a1 N0() {
        return this.f21368i;
    }

    @Override // kotlin.reflect.x.internal.l0.l.y, kotlin.reflect.x.internal.l0.l.e0
    public boolean P0() {
        return false;
    }

    @Override // kotlin.reflect.x.internal.l0.l.y
    public m0 V0() {
        return X0();
    }

    @Override // kotlin.reflect.x.internal.l0.l.y
    public String Y0(c cVar, kotlin.reflect.x.internal.l0.h.f fVar) {
        l.f(cVar, "renderer");
        l.f(fVar, "options");
        return "dynamic";
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public v S0(boolean z) {
        return this;
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public v Y0(g gVar) {
        l.f(gVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public v U0(a1 a1Var) {
        l.f(a1Var, "newAttributes");
        return new v(a.h(V0()), a1Var);
    }
}
