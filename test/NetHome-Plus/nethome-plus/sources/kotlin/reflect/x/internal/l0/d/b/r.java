package kotlin.reflect.x.internal.l0.d.b;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.d.a.l0.l.h;

/* compiled from: KotlinJvmBinaryPackageSourceElement.kt */
/* loaded from: classes2.dex */
public final class r implements z0 {

    /* renamed from: b, reason: collision with root package name */
    private final h f20323b;

    public r(h hVar) {
        l.f(hVar, "packageFragment");
        this.f20323b = hVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z0
    public a1 a() {
        a1 a1Var = a1.a;
        l.e(a1Var, "NO_SOURCE_FILE");
        return a1Var;
    }

    public String toString() {
        return this.f20323b + ": " + this.f20323b.N0().keySet();
    }
}
