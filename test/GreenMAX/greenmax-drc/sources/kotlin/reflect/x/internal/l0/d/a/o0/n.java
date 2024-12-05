package kotlin.reflect.x.internal.l0.d.a.o0;

import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.a;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.c;
import kotlin.reflect.x.internal.l0.b.h;
import kotlin.reflect.x.internal.l0.d.a.b;
import kotlin.reflect.x.internal.l0.d.a.d;
import kotlin.reflect.x.internal.l0.d.a.l0.g;
import kotlin.reflect.x.internal.l0.d.a.l0.l.e;
import kotlin.reflect.x.internal.l0.d.a.l0.l.m;
import kotlin.reflect.x.internal.l0.d.a.x;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.n1;
import kotlin.reflect.x.internal.l0.l.p1;
import kotlin.reflect.x.internal.l0.l.t1.q;
import kotlin.reflect.x.internal.l0.l.w1.i;
import kotlin.reflect.x.internal.l0.l.w1.o;
import kotlin.reflect.x.internal.l0.l.w1.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: signatureEnhancement.kt */
/* loaded from: classes2.dex */
public final class n extends a<c> {
    private final a a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20183b;

    /* renamed from: c, reason: collision with root package name */
    private final g f20184c;

    /* renamed from: d, reason: collision with root package name */
    private final b f20185d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f20186e;

    public /* synthetic */ n(a aVar, boolean z, g gVar, b bVar, boolean z2, int i2, kotlin.jvm.internal.g gVar2) {
        this(aVar, z, gVar, bVar, (i2 & 16) != 0 ? false : z2);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.o0.a
    public boolean A(i iVar) {
        l.f(iVar, "<this>");
        return ((e0) iVar).R0() instanceof g;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.o0.a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public d h() {
        return this.f20184c.a().a();
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.o0.a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public e0 p(i iVar) {
        l.f(iVar, "<this>");
        return p1.a((e0) iVar);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.o0.a
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public boolean r(c cVar) {
        l.f(cVar, "<this>");
        return ((cVar instanceof kotlin.reflect.x.internal.l0.d.a.k0.g) && ((kotlin.reflect.x.internal.l0.d.a.k0.g) cVar).f()) || ((cVar instanceof e) && !o() && (((e) cVar).k() || l() == b.TYPE_PARAMETER_BOUNDS));
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.o0.a
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public r v() {
        return q.a;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.o0.a
    public Iterable<c> i(i iVar) {
        l.f(iVar, "<this>");
        return ((e0) iVar).getAnnotations();
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.o0.a
    public Iterable<c> k() {
        List i2;
        kotlin.reflect.jvm.internal.impl.descriptors.n1.g annotations;
        a aVar = this.a;
        if (aVar != null && (annotations = aVar.getAnnotations()) != null) {
            return annotations;
        }
        i2 = t.i();
        return i2;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.o0.a
    public b l() {
        return this.f20185d;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.o0.a
    public x m() {
        return this.f20184c.b();
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.o0.a
    public boolean n() {
        a aVar = this.a;
        return (aVar instanceof i1) && ((i1) aVar).l0() != null;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.o0.a
    public boolean o() {
        return this.f20184c.a().q().c();
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.o0.a
    public kotlin.reflect.x.internal.l0.f.d s(i iVar) {
        l.f(iVar, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.e f2 = n1.f((e0) iVar);
        if (f2 != null) {
            return kotlin.reflect.x.internal.l0.i.d.m(f2);
        }
        return null;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.o0.a
    public boolean u() {
        return this.f20186e;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.o0.a
    public boolean w(i iVar) {
        l.f(iVar, "<this>");
        return h.e0((e0) iVar);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.o0.a
    public boolean x() {
        return this.f20183b;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.o0.a
    public boolean y(i iVar, i iVar2) {
        l.f(iVar, "<this>");
        l.f(iVar2, "other");
        return this.f20184c.a().k().b((e0) iVar, (e0) iVar2);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.o0.a
    public boolean z(o oVar) {
        l.f(oVar, "<this>");
        return oVar instanceof m;
    }

    public n(a aVar, boolean z, g gVar, b bVar, boolean z2) {
        l.f(gVar, "containerContext");
        l.f(bVar, "containerApplicabilityType");
        this.a = aVar;
        this.f20183b = z;
        this.f20184c = gVar;
        this.f20185d = bVar;
        this.f20186e = z2;
    }
}
