package kotlin.reflect.x.internal.l0.d.b;

import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.x.internal.l0.e.a0.a;
import kotlin.reflect.x.internal.l0.e.a0.b.e;
import kotlin.reflect.x.internal.l0.e.l;
import kotlin.reflect.x.internal.l0.e.z.c;
import kotlin.reflect.x.internal.l0.f.b;
import kotlin.reflect.x.internal.l0.i.u.d;
import kotlin.reflect.x.internal.l0.j.b.g0.f;
import kotlin.reflect.x.internal.l0.j.b.t;
import kotlin.text.v;

/* compiled from: JvmPackagePartSource.kt */
/* loaded from: classes2.dex */
public final class k implements f {

    /* renamed from: b, reason: collision with root package name */
    private final d f20304b;

    /* renamed from: c, reason: collision with root package name */
    private final d f20305c;

    /* renamed from: d, reason: collision with root package name */
    private final t<e> f20306d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f20307e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.j.b.g0.e f20308f;

    /* renamed from: g, reason: collision with root package name */
    private final q f20309g;

    /* renamed from: h, reason: collision with root package name */
    private final String f20310h;

    public k(d dVar, d dVar2, l lVar, c cVar, t<e> tVar, boolean z, kotlin.reflect.x.internal.l0.j.b.g0.e eVar, q qVar) {
        String string;
        kotlin.jvm.internal.l.f(dVar, "className");
        kotlin.jvm.internal.l.f(lVar, "packageProto");
        kotlin.jvm.internal.l.f(cVar, "nameResolver");
        kotlin.jvm.internal.l.f(eVar, "abiStability");
        this.f20304b = dVar;
        this.f20305c = dVar2;
        this.f20306d = tVar;
        this.f20307e = z;
        this.f20308f = eVar;
        this.f20309g = qVar;
        h.f<l, Integer> fVar = a.m;
        kotlin.jvm.internal.l.e(fVar, "packageModuleName");
        Integer num = (Integer) kotlin.reflect.x.internal.l0.e.z.e.a(lVar, fVar);
        this.f20310h = (num == null || (string = cVar.getString(num.intValue())) == null) ? "main" : string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z0
    public a1 a() {
        a1 a1Var = a1.a;
        kotlin.jvm.internal.l.e(a1Var, "NO_SOURCE_FILE");
        return a1Var;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.g0.f
    public String c() {
        return "Class '" + d().b().b() + '\'';
    }

    public final b d() {
        return new b(e().g(), h());
    }

    public d e() {
        return this.f20304b;
    }

    public d f() {
        return this.f20305c;
    }

    public final q g() {
        return this.f20309g;
    }

    public final kotlin.reflect.x.internal.l0.f.f h() {
        String C0;
        String f2 = e().f();
        kotlin.jvm.internal.l.e(f2, "className.internalName");
        C0 = v.C0(f2, '/', null, 2, null);
        kotlin.reflect.x.internal.l0.f.f r = kotlin.reflect.x.internal.l0.f.f.r(C0);
        kotlin.jvm.internal.l.e(r, "identifier(className.int….substringAfterLast('/'))");
        return r;
    }

    public String toString() {
        return k.class.getSimpleName() + ": " + e();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(kotlin.reflect.x.internal.l0.d.b.q r11, kotlin.reflect.x.internal.l0.e.l r12, kotlin.reflect.x.internal.l0.e.z.c r13, kotlin.reflect.x.internal.l0.j.b.t<kotlin.reflect.x.internal.l0.e.a0.b.e> r14, boolean r15, kotlin.reflect.x.internal.l0.j.b.g0.e r16) {
        /*
            r10 = this;
            java.lang.String r0 = "kotlinClass"
            r9 = r11
            kotlin.jvm.internal.l.f(r11, r0)
            java.lang.String r0 = "packageProto"
            r4 = r12
            kotlin.jvm.internal.l.f(r12, r0)
            java.lang.String r0 = "nameResolver"
            r5 = r13
            kotlin.jvm.internal.l.f(r13, r0)
            java.lang.String r0 = "abiStability"
            r8 = r16
            kotlin.jvm.internal.l.f(r8, r0)
            kotlin.f0.x.e.l0.f.b r0 = r11.c()
            kotlin.f0.x.e.l0.i.u.d r2 = kotlin.reflect.x.internal.l0.i.u.d.b(r0)
            java.lang.String r0 = "byClassId(kotlinClass.classId)"
            kotlin.jvm.internal.l.e(r2, r0)
            kotlin.f0.x.e.l0.d.b.c0.a r0 = r11.a()
            java.lang.String r0 = r0.e()
            r1 = 0
            if (r0 == 0) goto L40
            int r3 = r0.length()
            if (r3 <= 0) goto L39
            r3 = 1
            goto L3a
        L39:
            r3 = 0
        L3a:
            if (r3 == 0) goto L40
            kotlin.f0.x.e.l0.i.u.d r1 = kotlin.reflect.x.internal.l0.i.u.d.d(r0)
        L40:
            r3 = r1
            r1 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.d.b.k.<init>(kotlin.f0.x.e.l0.d.b.q, kotlin.f0.x.e.l0.e.l, kotlin.f0.x.e.l0.e.z.c, kotlin.f0.x.e.l0.j.b.t, boolean, kotlin.f0.x.e.l0.j.b.g0.e):void");
    }
}
