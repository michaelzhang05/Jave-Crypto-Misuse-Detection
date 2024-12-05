package kotlin.reflect.x.internal.l0.l;

import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.i.w.h;
import kotlin.reflect.x.internal.l0.l.t1.n;
import kotlin.reflect.x.internal.l0.l.w1.k;
import okhttp3.HttpUrl;

/* compiled from: StubTypes.kt */
/* loaded from: classes2.dex */
public final class u0 extends e implements k {

    /* renamed from: k, reason: collision with root package name */
    private final e1 f21327k;
    private final h l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(n nVar, boolean z, e1 e1Var) {
        super(nVar, z);
        l.f(nVar, "originalTypeVariable");
        l.f(e1Var, "constructor");
        this.f21327k = e1Var;
        this.l = nVar.o().i().q();
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public e1 O0() {
        return this.f21327k;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e
    public e Y0(boolean z) {
        return new u0(X0(), z, O0());
    }

    @Override // kotlin.reflect.x.internal.l0.l.e, kotlin.reflect.x.internal.l0.l.e0
    public h q() {
        return this.l;
    }

    @Override // kotlin.reflect.x.internal.l0.l.m0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stub (BI): ");
        sb.append(X0());
        sb.append(P0() ? "?" : HttpUrl.FRAGMENT_ENCODE_SET);
        return sb.toString();
    }
}
