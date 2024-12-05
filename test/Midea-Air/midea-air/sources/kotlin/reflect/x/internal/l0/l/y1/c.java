package kotlin.reflect.x.internal.l0.l.y1;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.t1.e;

/* compiled from: CapturedTypeApproximation.kt */
/* loaded from: classes2.dex */
final class c {
    private final e1 a;

    /* renamed from: b, reason: collision with root package name */
    private final e0 f21391b;

    /* renamed from: c, reason: collision with root package name */
    private final e0 f21392c;

    public c(e1 e1Var, e0 e0Var, e0 e0Var2) {
        l.f(e1Var, "typeParameter");
        l.f(e0Var, "inProjection");
        l.f(e0Var2, "outProjection");
        this.a = e1Var;
        this.f21391b = e0Var;
        this.f21392c = e0Var2;
    }

    public final e0 a() {
        return this.f21391b;
    }

    public final e0 b() {
        return this.f21392c;
    }

    public final e1 c() {
        return this.a;
    }

    public final boolean d() {
        return e.a.d(this.f21391b, this.f21392c);
    }
}
