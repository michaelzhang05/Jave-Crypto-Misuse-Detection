package kotlin.reflect.x.internal.l0.l;

import kotlin.jvm.internal.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes2.dex */
public final class o0 extends s {

    /* renamed from: h, reason: collision with root package name */
    private final a1 f21279h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(m0 m0Var, a1 a1Var) {
        super(m0Var);
        l.f(m0Var, "delegate");
        l.f(a1Var, "attributes");
        this.f21279h = a1Var;
    }

    @Override // kotlin.reflect.x.internal.l0.l.r, kotlin.reflect.x.internal.l0.l.e0
    public a1 N0() {
        return this.f21279h;
    }

    @Override // kotlin.reflect.x.internal.l0.l.r
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public o0 Z0(m0 m0Var) {
        l.f(m0Var, "delegate");
        return new o0(m0Var, N0());
    }
}
