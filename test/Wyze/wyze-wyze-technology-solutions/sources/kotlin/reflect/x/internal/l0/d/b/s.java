package kotlin.reflect.x.internal.l0.d.b;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.x.internal.l0.e.a0.b.e;
import kotlin.reflect.x.internal.l0.j.b.g0.f;
import kotlin.reflect.x.internal.l0.j.b.t;

/* compiled from: KotlinJvmBinarySourceElement.kt */
/* loaded from: classes2.dex */
public final class s implements f {

    /* renamed from: b, reason: collision with root package name */
    private final q f20324b;

    /* renamed from: c, reason: collision with root package name */
    private final t<e> f20325c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f20326d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.j.b.g0.e f20327e;

    public s(q qVar, t<e> tVar, boolean z, kotlin.reflect.x.internal.l0.j.b.g0.e eVar) {
        l.f(qVar, "binaryClass");
        l.f(eVar, "abiStability");
        this.f20324b = qVar;
        this.f20325c = tVar;
        this.f20326d = z;
        this.f20327e = eVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z0
    public a1 a() {
        a1 a1Var = a1.a;
        l.e(a1Var, "NO_SOURCE_FILE");
        return a1Var;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.g0.f
    public String c() {
        return "Class '" + this.f20324b.c().b().b() + '\'';
    }

    public final q d() {
        return this.f20324b;
    }

    public String toString() {
        return s.class.getSimpleName() + ": " + this.f20324b;
    }
}
