package kotlin.reflect.x.internal.l0.j.b;

import java.util.List;
import kotlin.collections.t;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.j0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.c;
import kotlin.reflect.jvm.internal.impl.descriptors.o1.a;
import kotlin.reflect.jvm.internal.impl.descriptors.o1.b;
import kotlin.reflect.jvm.internal.impl.descriptors.o1.e;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.x.internal.l0.e.z.h;
import kotlin.reflect.x.internal.l0.i.r.g;
import kotlin.reflect.x.internal.l0.k.n;
import kotlin.reflect.x.internal.l0.l.t1.l;
import kotlin.reflect.x.internal.l0.l.z0;

/* compiled from: context.kt */
/* loaded from: classes2.dex */
public final class k {
    private final n a;

    /* renamed from: b, reason: collision with root package name */
    private final g0 f21091b;

    /* renamed from: c, reason: collision with root package name */
    private final l f21092c;

    /* renamed from: d, reason: collision with root package name */
    private final h f21093d;

    /* renamed from: e, reason: collision with root package name */
    private final c<c, g<?>> f21094e;

    /* renamed from: f, reason: collision with root package name */
    private final l0 f21095f;

    /* renamed from: g, reason: collision with root package name */
    private final v f21096g;

    /* renamed from: h, reason: collision with root package name */
    private final r f21097h;

    /* renamed from: i, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.c.b.c f21098i;

    /* renamed from: j, reason: collision with root package name */
    private final s f21099j;

    /* renamed from: k, reason: collision with root package name */
    private final Iterable<b> f21100k;
    private final j0 l;
    private final j m;
    private final a n;
    private final kotlin.reflect.jvm.internal.impl.descriptors.o1.c o;
    private final f p;
    private final l q;
    private final kotlin.reflect.x.internal.l0.i.v.a r;
    private final e s;
    private final List<z0> t;
    private final i u;

    /* JADX WARN: Multi-variable type inference failed */
    public k(n nVar, g0 g0Var, l lVar, h hVar, c<? extends c, ? extends g<?>> cVar, l0 l0Var, v vVar, r rVar, kotlin.reflect.x.internal.l0.c.b.c cVar2, s sVar, Iterable<? extends b> iterable, j0 j0Var, j jVar, a aVar, kotlin.reflect.jvm.internal.impl.descriptors.o1.c cVar3, f fVar, l lVar2, kotlin.reflect.x.internal.l0.i.v.a aVar2, e eVar, List<? extends z0> list) {
        kotlin.jvm.internal.l.f(nVar, "storageManager");
        kotlin.jvm.internal.l.f(g0Var, "moduleDescriptor");
        kotlin.jvm.internal.l.f(lVar, "configuration");
        kotlin.jvm.internal.l.f(hVar, "classDataFinder");
        kotlin.jvm.internal.l.f(cVar, "annotationAndConstantLoader");
        kotlin.jvm.internal.l.f(l0Var, "packageFragmentProvider");
        kotlin.jvm.internal.l.f(vVar, "localClassifierTypeSettings");
        kotlin.jvm.internal.l.f(rVar, "errorReporter");
        kotlin.jvm.internal.l.f(cVar2, "lookupTracker");
        kotlin.jvm.internal.l.f(sVar, "flexibleTypeDeserializer");
        kotlin.jvm.internal.l.f(iterable, "fictitiousClassDescriptorFactories");
        kotlin.jvm.internal.l.f(j0Var, "notFoundClasses");
        kotlin.jvm.internal.l.f(jVar, "contractDeserializer");
        kotlin.jvm.internal.l.f(aVar, "additionalClassPartsProvider");
        kotlin.jvm.internal.l.f(cVar3, "platformDependentDeclarationFilter");
        kotlin.jvm.internal.l.f(fVar, "extensionRegistryLite");
        kotlin.jvm.internal.l.f(lVar2, "kotlinTypeChecker");
        kotlin.jvm.internal.l.f(aVar2, "samConversionResolver");
        kotlin.jvm.internal.l.f(eVar, "platformDependentTypeTransformer");
        kotlin.jvm.internal.l.f(list, "typeAttributeTranslators");
        this.a = nVar;
        this.f21091b = g0Var;
        this.f21092c = lVar;
        this.f21093d = hVar;
        this.f21094e = cVar;
        this.f21095f = l0Var;
        this.f21096g = vVar;
        this.f21097h = rVar;
        this.f21098i = cVar2;
        this.f21099j = sVar;
        this.f21100k = iterable;
        this.l = j0Var;
        this.m = jVar;
        this.n = aVar;
        this.o = cVar3;
        this.p = fVar;
        this.q = lVar2;
        this.r = aVar2;
        this.s = eVar;
        this.t = list;
        this.u = new i(this);
    }

    public final m a(k0 k0Var, kotlin.reflect.x.internal.l0.e.z.c cVar, kotlin.reflect.x.internal.l0.e.z.g gVar, h hVar, kotlin.reflect.x.internal.l0.e.z.a aVar, kotlin.reflect.x.internal.l0.j.b.g0.f fVar) {
        List i2;
        kotlin.jvm.internal.l.f(k0Var, "descriptor");
        kotlin.jvm.internal.l.f(cVar, "nameResolver");
        kotlin.jvm.internal.l.f(gVar, "typeTable");
        kotlin.jvm.internal.l.f(hVar, "versionRequirementTable");
        kotlin.jvm.internal.l.f(aVar, "metadataVersion");
        i2 = t.i();
        return new m(this, cVar, k0Var, gVar, hVar, aVar, fVar, null, i2);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.e b(kotlin.reflect.x.internal.l0.f.b bVar) {
        kotlin.jvm.internal.l.f(bVar, "classId");
        return i.e(this.u, bVar, null, 2, null);
    }

    public final a c() {
        return this.n;
    }

    public final c<c, g<?>> d() {
        return this.f21094e;
    }

    public final h e() {
        return this.f21093d;
    }

    public final i f() {
        return this.u;
    }

    public final l g() {
        return this.f21092c;
    }

    public final j h() {
        return this.m;
    }

    public final r i() {
        return this.f21097h;
    }

    public final f j() {
        return this.p;
    }

    public final Iterable<b> k() {
        return this.f21100k;
    }

    public final s l() {
        return this.f21099j;
    }

    public final l m() {
        return this.q;
    }

    public final v n() {
        return this.f21096g;
    }

    public final kotlin.reflect.x.internal.l0.c.b.c o() {
        return this.f21098i;
    }

    public final g0 p() {
        return this.f21091b;
    }

    public final j0 q() {
        return this.l;
    }

    public final l0 r() {
        return this.f21095f;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.o1.c s() {
        return this.o;
    }

    public final e t() {
        return this.s;
    }

    public final n u() {
        return this.a;
    }

    public final List<z0> v() {
        return this.t;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ k(kotlin.reflect.x.internal.l0.k.n r24, kotlin.reflect.jvm.internal.impl.descriptors.g0 r25, kotlin.reflect.x.internal.l0.j.b.l r26, kotlin.reflect.x.internal.l0.j.b.h r27, kotlin.reflect.x.internal.l0.j.b.c r28, kotlin.reflect.jvm.internal.impl.descriptors.l0 r29, kotlin.reflect.x.internal.l0.j.b.v r30, kotlin.reflect.x.internal.l0.j.b.r r31, kotlin.reflect.x.internal.l0.c.b.c r32, kotlin.reflect.x.internal.l0.j.b.s r33, java.lang.Iterable r34, kotlin.reflect.jvm.internal.impl.descriptors.j0 r35, kotlin.reflect.x.internal.l0.j.b.j r36, kotlin.reflect.jvm.internal.impl.descriptors.o1.a r37, kotlin.reflect.jvm.internal.impl.descriptors.o1.c r38, kotlin.reflect.jvm.internal.impl.protobuf.f r39, kotlin.reflect.x.internal.l0.l.t1.l r40, kotlin.reflect.x.internal.l0.i.v.a r41, kotlin.reflect.jvm.internal.impl.descriptors.o1.e r42, java.util.List r43, int r44, kotlin.jvm.internal.g r45) {
        /*
            r23 = this;
            r0 = r44
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto Lb
            kotlin.reflect.jvm.internal.impl.descriptors.o1.a$a r1 = kotlin.reflect.jvm.internal.impl.descriptors.o1.a.C0367a.a
            r16 = r1
            goto Ld
        Lb:
            r16 = r37
        Ld:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L16
            kotlin.reflect.jvm.internal.impl.descriptors.o1.c$a r1 = kotlin.reflect.jvm.internal.impl.descriptors.o1.c.a.a
            r17 = r1
            goto L18
        L16:
            r17 = r38
        L18:
            r1 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L26
            kotlin.f0.x.e.l0.l.t1.l$a r1 = kotlin.reflect.x.internal.l0.l.t1.l.f21311b
            kotlin.f0.x.e.l0.l.t1.m r1 = r1.a()
            r19 = r1
            goto L28
        L26:
            r19 = r40
        L28:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L32
            kotlin.reflect.jvm.internal.impl.descriptors.o1.e$a r1 = kotlin.reflect.jvm.internal.impl.descriptors.o1.e.a.a
            r21 = r1
            goto L34
        L32:
            r21 = r42
        L34:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L42
            kotlin.f0.x.e.l0.l.o r0 = kotlin.reflect.x.internal.l0.l.o.a
            java.util.List r0 = kotlin.collections.r.e(r0)
            r22 = r0
            goto L44
        L42:
            r22 = r43
        L44:
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            r15 = r36
            r18 = r39
            r20 = r41
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.j.b.k.<init>(kotlin.f0.x.e.l0.k.n, kotlin.reflect.jvm.internal.impl.descriptors.g0, kotlin.f0.x.e.l0.j.b.l, kotlin.f0.x.e.l0.j.b.h, kotlin.f0.x.e.l0.j.b.c, kotlin.reflect.jvm.internal.impl.descriptors.l0, kotlin.f0.x.e.l0.j.b.v, kotlin.f0.x.e.l0.j.b.r, kotlin.f0.x.e.l0.c.b.c, kotlin.f0.x.e.l0.j.b.s, java.lang.Iterable, kotlin.reflect.jvm.internal.impl.descriptors.j0, kotlin.f0.x.e.l0.j.b.j, kotlin.reflect.jvm.internal.impl.descriptors.o1.a, kotlin.reflect.jvm.internal.impl.descriptors.o1.c, kotlin.reflect.jvm.internal.impl.protobuf.f, kotlin.f0.x.e.l0.l.t1.l, kotlin.f0.x.e.l0.i.v.a, kotlin.reflect.jvm.internal.impl.descriptors.o1.e, java.util.List, int, kotlin.a0.d.g):void");
    }
}
