package kotlin.reflect.x.internal.l0.j.b.g0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.u0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.x.internal.l0.c.a;
import kotlin.reflect.x.internal.l0.c.b.b;
import kotlin.reflect.x.internal.l0.f.c;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.w.d;

/* compiled from: DeserializedPackageMemberScope.kt */
/* loaded from: classes2.dex */
public class i extends h {

    /* renamed from: g, reason: collision with root package name */
    private final k0 f21081g;

    /* renamed from: h, reason: collision with root package name */
    private final String f21082h;

    /* renamed from: i, reason: collision with root package name */
    private final c f21083i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(kotlin.reflect.jvm.internal.impl.descriptors.k0 r17, kotlin.reflect.x.internal.l0.e.l r18, kotlin.reflect.x.internal.l0.e.z.c r19, kotlin.reflect.x.internal.l0.e.z.a r20, kotlin.reflect.x.internal.l0.j.b.g0.f r21, kotlin.reflect.x.internal.l0.j.b.k r22, java.lang.String r23, kotlin.jvm.functions.Function0<? extends java.util.Collection<kotlin.reflect.x.internal.l0.f.f>> r24) {
        /*
            r16 = this;
            r6 = r16
            r14 = r17
            r15 = r23
            java.lang.String r0 = "packageDescriptor"
            kotlin.jvm.internal.l.f(r14, r0)
            java.lang.String r0 = "proto"
            r1 = r18
            kotlin.jvm.internal.l.f(r1, r0)
            java.lang.String r0 = "nameResolver"
            r2 = r19
            kotlin.jvm.internal.l.f(r2, r0)
            java.lang.String r0 = "metadataVersion"
            r3 = r20
            kotlin.jvm.internal.l.f(r3, r0)
            java.lang.String r0 = "components"
            r4 = r22
            kotlin.jvm.internal.l.f(r4, r0)
            java.lang.String r0 = "debugName"
            kotlin.jvm.internal.l.f(r15, r0)
            java.lang.String r0 = "classNames"
            r5 = r24
            kotlin.jvm.internal.l.f(r5, r0)
            kotlin.f0.x.e.l0.e.z.g r10 = new kotlin.f0.x.e.l0.e.z.g
            kotlin.f0.x.e.l0.e.t r0 = r18.X()
            java.lang.String r7 = "proto.typeTable"
            kotlin.jvm.internal.l.e(r0, r7)
            r10.<init>(r0)
            kotlin.f0.x.e.l0.e.z.h$a r0 = kotlin.reflect.x.internal.l0.e.z.h.a
            kotlin.f0.x.e.l0.e.w r7 = r18.Y()
            java.lang.String r8 = "proto.versionRequirementTable"
            kotlin.jvm.internal.l.e(r7, r8)
            kotlin.f0.x.e.l0.e.z.h r11 = r0.a(r7)
            r7 = r22
            r8 = r17
            r9 = r19
            r12 = r20
            r13 = r21
            kotlin.f0.x.e.l0.j.b.m r2 = r7.a(r8, r9, r10, r11, r12, r13)
            java.util.List r3 = r18.Q()
            java.lang.String r0 = "proto.functionList"
            kotlin.jvm.internal.l.e(r3, r0)
            java.util.List r4 = r18.T()
            java.lang.String r0 = "proto.propertyList"
            kotlin.jvm.internal.l.e(r4, r0)
            java.util.List r7 = r18.W()
            java.lang.String r0 = "proto.typeAliasList"
            kotlin.jvm.internal.l.e(r7, r0)
            r0 = r16
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f21081g = r14
            r6.f21082h = r15
            kotlin.f0.x.e.l0.f.c r0 = r17.d()
            r6.f21083i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.j.b.g0.i.<init>(kotlin.reflect.jvm.internal.impl.descriptors.k0, kotlin.f0.x.e.l0.e.l, kotlin.f0.x.e.l0.e.z.c, kotlin.f0.x.e.l0.e.z.a, kotlin.f0.x.e.l0.j.b.g0.f, kotlin.f0.x.e.l0.j.b.k, java.lang.String, kotlin.a0.c.a):void");
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.g0.h, kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.k
    public h f(f fVar, b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        z(fVar, bVar);
        return super.f(fVar, bVar);
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.g0.h
    protected void i(Collection<m> collection, Function1<? super f, Boolean> function1) {
        l.f(collection, "result");
        l.f(function1, "nameFilter");
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.g0.h
    protected kotlin.reflect.x.internal.l0.f.b m(f fVar) {
        l.f(fVar, "name");
        return new kotlin.reflect.x.internal.l0.f.b(this.f21083i, fVar);
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.g0.h
    protected Set<f> s() {
        Set<f> d2;
        d2 = u0.d();
        return d2;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.g0.h
    protected Set<f> t() {
        Set<f> d2;
        d2 = u0.d();
        return d2;
    }

    public String toString() {
        return this.f21082h;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.g0.h
    protected Set<f> u() {
        Set<f> d2;
        d2 = u0.d();
        return d2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.x.internal.l0.j.b.g0.h
    public boolean w(f fVar) {
        boolean z;
        l.f(fVar, "name");
        if (super.w(fVar)) {
            return true;
        }
        Iterable<kotlin.reflect.jvm.internal.impl.descriptors.o1.b> k2 = p().c().k();
        if (!(k2 instanceof Collection) || !((Collection) k2).isEmpty()) {
            Iterator<kotlin.reflect.jvm.internal.impl.descriptors.o1.b> it = k2.iterator();
            while (it.hasNext()) {
                if (it.next().b(this.f21083i, fVar)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return z;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.i, kotlin.reflect.x.internal.l0.i.w.k
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public List<m> g(d dVar, Function1<? super f, Boolean> function1) {
        List<m> k0;
        l.f(dVar, "kindFilter");
        l.f(function1, "nameFilter");
        Collection<m> j2 = j(dVar, function1, kotlin.reflect.x.internal.l0.c.b.d.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<kotlin.reflect.jvm.internal.impl.descriptors.o1.b> k2 = p().c().k();
        ArrayList arrayList = new ArrayList();
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.o1.b> it = k2.iterator();
        while (it.hasNext()) {
            y.y(arrayList, it.next().a(this.f21083i));
        }
        k0 = b0.k0(j2, arrayList);
        return k0;
    }

    public void z(f fVar, b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        a.b(p().c().o(), bVar, this.f21081g, fVar);
    }
}
