package kotlin.reflect.x.internal.l0.m;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.x.internal.l0.b.h;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.m.k;
import kotlin.reflect.x.internal.l0.m.r;
import kotlin.reflect.x.internal.l0.m.t;

/* compiled from: modifierChecks.kt */
/* loaded from: classes2.dex */
public final class p extends kotlin.reflect.x.internal.l0.m.b {
    public static final p a = new p();

    /* renamed from: b, reason: collision with root package name */
    private static final List<h> f21422b;

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function1<y, String> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f21423f = new a();

        a() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        
            if ((!kotlin.reflect.x.internal.l0.i.t.a.a(r4) && r4.l0() == null) == true) goto L13;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.y r4) {
            /*
                r3 = this;
                java.lang.String r0 = "$this$$receiver"
                kotlin.jvm.internal.l.f(r4, r0)
                java.util.List r4 = r4.h()
                java.lang.String r0 = "valueParameters"
                kotlin.jvm.internal.l.e(r4, r0)
                java.lang.Object r4 = kotlin.collections.r.f0(r4)
                kotlin.reflect.jvm.internal.impl.descriptors.i1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.i1) r4
                r0 = 1
                r1 = 0
                if (r4 == 0) goto L2a
                boolean r2 = kotlin.reflect.x.internal.l0.i.t.a.a(r4)
                if (r2 != 0) goto L26
                kotlin.f0.x.e.l0.l.e0 r4 = r4.l0()
                if (r4 != 0) goto L26
                r4 = 1
                goto L27
            L26:
                r4 = 0
            L27:
                if (r4 != r0) goto L2a
                goto L2b
            L2a:
                r0 = 0
            L2b:
                kotlin.f0.x.e.l0.m.p r4 = kotlin.reflect.x.internal.l0.m.p.a
                if (r0 != 0) goto L32
                java.lang.String r4 = "last parameter should not have a default value or be a vararg"
                goto L33
            L32:
                r4 = 0
            L33:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.m.p.a.invoke(kotlin.reflect.jvm.internal.impl.descriptors.y):java.lang.String");
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function1<y, String> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f21424f = new b();

        b() {
            super(1);
        }

        private static final boolean d(m mVar) {
            return (mVar instanceof e) && h.a0((e) mVar);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(y yVar) {
            boolean z;
            l.f(yVar, "$this$$receiver");
            p pVar = p.a;
            m b2 = yVar.b();
            l.e(b2, "containingDeclaration");
            boolean z2 = true;
            if (!d(b2)) {
                Collection<? extends y> e2 = yVar.e();
                l.e(e2, "overriddenDescriptors");
                if (!e2.isEmpty()) {
                    Iterator<T> it = e2.iterator();
                    while (it.hasNext()) {
                        m b3 = ((y) it.next()).b();
                        l.e(b3, "it.containingDeclaration");
                        if (d(b3)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z) {
                    z2 = false;
                }
            }
            if (z2) {
                return null;
            }
            return "must override ''equals()'' in Any";
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function1<y, String> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f21425f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(y yVar) {
            boolean z;
            l.f(yVar, "$this$$receiver");
            w0 f0 = yVar.f0();
            if (f0 == null) {
                f0 = yVar.m0();
            }
            p pVar = p.a;
            boolean z2 = false;
            if (f0 != null) {
                e0 returnType = yVar.getReturnType();
                if (returnType != null) {
                    e0 type = f0.getType();
                    l.e(type, "receiver.type");
                    z = kotlin.reflect.x.internal.l0.l.x1.a.o(returnType, type);
                } else {
                    z = false;
                }
                if (z || pVar.d(yVar, f0)) {
                    z2 = true;
                }
            }
            if (z2) {
                return null;
            }
            return "receiver must be a supertype of the return type";
        }
    }

    static {
        List l;
        List<h> l2;
        f fVar = q.f21435k;
        k.b bVar = k.b.f21416b;
        f[] fVarArr = {bVar, new t.a(1)};
        f fVar2 = q.l;
        f[] fVarArr2 = {bVar, new t.a(2)};
        f fVar3 = q.f21426b;
        m mVar = m.a;
        j jVar = j.a;
        f fVar4 = q.f21432h;
        t.d dVar = t.d.f21449b;
        r.a aVar = r.a.f21438d;
        f fVar5 = q.f21434j;
        t.c cVar = t.c.f21448b;
        l = kotlin.collections.t.l(q.x, q.y);
        l2 = kotlin.collections.t.l(new h(fVar, fVarArr, (Function1) null, 4, (g) null), new h(fVar2, fVarArr2, a.f21423f), new h(fVar3, new f[]{bVar, mVar, new t.a(2), jVar}, (Function1) null, 4, (g) null), new h(q.f21427c, new f[]{bVar, mVar, new t.a(3), jVar}, (Function1) null, 4, (g) null), new h(q.f21428d, new f[]{bVar, mVar, new t.b(2), jVar}, (Function1) null, 4, (g) null), new h(q.f21433i, new f[]{bVar}, (Function1) null, 4, (g) null), new h(fVar4, new f[]{bVar, dVar, mVar, aVar}, (Function1) null, 4, (g) null), new h(fVar5, new f[]{bVar, cVar}, (Function1) null, 4, (g) null), new h(q.m, new f[]{bVar, cVar}, (Function1) null, 4, (g) null), new h(q.n, new f[]{bVar, cVar, aVar}, (Function1) null, 4, (g) null), new h(q.I, new f[]{bVar, dVar, mVar}, (Function1) null, 4, (g) null), new h(q.f21429e, new f[]{k.a.f21415b}, b.f21424f), new h(q.f21431g, new f[]{bVar, r.b.f21440d, dVar, mVar}, (Function1) null, 4, (g) null), new h(q.R, new f[]{bVar, dVar, mVar}, (Function1) null, 4, (g) null), new h(q.Q, new f[]{bVar, cVar}, (Function1) null, 4, (g) null), new h(l, new f[]{bVar}, c.f21425f), new h(q.S, new f[]{bVar, r.c.f21442d, dVar, mVar}, (Function1) null, 4, (g) null), new h(q.p, new f[]{bVar, cVar}, (Function1) null, 4, (g) null));
        f21422b = l2;
    }

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(y yVar, w0 w0Var) {
        kotlin.reflect.x.internal.l0.f.b g2;
        e0 returnType;
        kotlin.reflect.x.internal.l0.i.w.o.f value = w0Var.getValue();
        l.e(value, "receiver.value");
        if (!(value instanceof kotlin.reflect.x.internal.l0.i.w.o.e)) {
            return false;
        }
        e r = ((kotlin.reflect.x.internal.l0.i.w.o.e) value).r();
        if (!r.M() || (g2 = kotlin.reflect.x.internal.l0.i.t.a.g(r)) == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h b2 = x.b(kotlin.reflect.x.internal.l0.i.t.a.l(r), g2);
        if (!(b2 instanceof d1)) {
            b2 = null;
        }
        d1 d1Var = (d1) b2;
        if (d1Var == null || (returnType = yVar.getReturnType()) == null) {
            return false;
        }
        return kotlin.reflect.x.internal.l0.l.x1.a.o(returnType, d1Var.W());
    }

    @Override // kotlin.reflect.x.internal.l0.m.b
    public List<h> b() {
        return f21422b;
    }
}
