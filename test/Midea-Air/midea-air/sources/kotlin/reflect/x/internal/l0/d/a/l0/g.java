package kotlin.reflect.x.internal.l0.d.a.l0;

import kotlin.Lazy;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.x.internal.l0.d.a.l0.m.c;
import kotlin.reflect.x.internal.l0.d.a.x;
import kotlin.reflect.x.internal.l0.k.n;

/* compiled from: context.kt */
/* loaded from: classes2.dex */
public final class g {
    private final b a;

    /* renamed from: b, reason: collision with root package name */
    private final k f19976b;

    /* renamed from: c, reason: collision with root package name */
    private final Lazy<x> f19977c;

    /* renamed from: d, reason: collision with root package name */
    private final Lazy f19978d;

    /* renamed from: e, reason: collision with root package name */
    private final c f19979e;

    public g(b bVar, k kVar, Lazy<x> lazy) {
        l.f(bVar, "components");
        l.f(kVar, "typeParameterResolver");
        l.f(lazy, "delegateForDefaultTypeQualifiers");
        this.a = bVar;
        this.f19976b = kVar;
        this.f19977c = lazy;
        this.f19978d = lazy;
        this.f19979e = new c(this, kVar);
    }

    public final b a() {
        return this.a;
    }

    public final x b() {
        return (x) this.f19978d.getValue();
    }

    public final Lazy<x> c() {
        return this.f19977c;
    }

    public final g0 d() {
        return this.a.m();
    }

    public final n e() {
        return this.a.u();
    }

    public final k f() {
        return this.f19976b;
    }

    public final c g() {
        return this.f19979e;
    }
}
