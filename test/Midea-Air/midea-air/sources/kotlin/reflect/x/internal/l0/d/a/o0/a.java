package kotlin.reflect.x.internal.l0.d.a.o0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.n;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.d.a.x;
import kotlin.reflect.x.internal.l0.l.w1.g;
import kotlin.reflect.x.internal.l0.l.w1.i;
import kotlin.reflect.x.internal.l0.l.w1.m;
import kotlin.reflect.x.internal.l0.l.w1.o;
import kotlin.reflect.x.internal.l0.l.w1.p;

/* compiled from: AbstractSignatureParts.kt */
/* loaded from: classes2.dex */
public abstract class a<TAnnotation> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractSignatureParts.kt */
    /* renamed from: kotlin.f0.x.e.l0.d.a.o0.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0296a {
        private final i a;

        /* renamed from: b, reason: collision with root package name */
        private final x f20111b;

        /* renamed from: c, reason: collision with root package name */
        private final o f20112c;

        public C0296a(i iVar, x xVar, o oVar) {
            this.a = iVar;
            this.f20111b = xVar;
            this.f20112c = oVar;
        }

        public final x a() {
            return this.f20111b;
        }

        public final i b() {
            return this.a;
        }

        public final o c() {
            return this.f20112c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractSignatureParts.kt */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements Function1<Integer, e> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ q f20113f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e[] f20114g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q qVar, e[] eVarArr) {
            super(1);
            this.f20113f = qVar;
            this.f20114g = eVarArr;
        }

        public final e b(int i2) {
            int z;
            Map<Integer, e> a;
            e eVar;
            q qVar = this.f20113f;
            if (qVar != null && (a = qVar.a()) != null && (eVar = a.get(Integer.valueOf(i2))) != null) {
                return eVar;
            }
            e[] eVarArr = this.f20114g;
            if (i2 >= 0) {
                z = n.z(eVarArr);
                if (i2 <= z) {
                    return eVarArr[i2];
                }
            }
            return e.a.a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ e invoke(Integer num) {
            return b(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractSignatureParts.kt */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements Function1<TAnnotation, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a<TAnnotation> f20115f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a<TAnnotation> aVar) {
            super(1);
            this.f20115f = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(TAnnotation tannotation) {
            l.f(tannotation, "$this$extractNullability");
            return Boolean.valueOf(this.f20115f.r(tannotation));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractSignatureParts.kt */
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements Function1<C0296a, Iterable<? extends C0296a>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a<TAnnotation> f20116f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ p f20117g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a<TAnnotation> aVar, p pVar) {
            super(1);
            this.f20116f = aVar;
            this.f20117g = pVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Iterable<C0296a> invoke(C0296a c0296a) {
            kotlin.reflect.x.internal.l0.l.w1.n w;
            List<o> e0;
            int t;
            int t2;
            C0296a c0296a2;
            g M;
            l.f(c0296a, "it");
            if (this.f20116f.u()) {
                i b2 = c0296a.b();
                if (((b2 == null || (M = this.f20117g.M(b2)) == null) ? null : this.f20117g.y(M)) != null) {
                    return null;
                }
            }
            i b3 = c0296a.b();
            if (b3 == null || (w = this.f20117g.w(b3)) == null || (e0 = this.f20117g.e0(w)) == null) {
                return null;
            }
            List<m> X = this.f20117g.X(c0296a.b());
            p pVar = this.f20117g;
            a<TAnnotation> aVar = this.f20116f;
            Iterator<T> it = e0.iterator();
            Iterator<T> it2 = X.iterator();
            t = u.t(e0, 10);
            t2 = u.t(X, 10);
            ArrayList arrayList = new ArrayList(Math.min(t, t2));
            while (it.hasNext() && it2.hasNext()) {
                Object next = it.next();
                m mVar = (m) it2.next();
                o oVar = (o) next;
                if (pVar.L(mVar)) {
                    c0296a2 = new C0296a(null, c0296a.a(), oVar);
                } else {
                    i x0 = pVar.x0(mVar);
                    c0296a2 = new C0296a(x0, aVar.c(x0, c0296a.a()), oVar);
                }
                arrayList.add(c0296a2);
            }
            return arrayList;
        }
    }

    private final i B(i iVar, i iVar2) {
        return iVar == null ? iVar2 : iVar2 == null ? iVar : (!iVar.d() || iVar2.d()) ? (iVar.d() || !iVar2.d()) ? (iVar.c().compareTo(iVar2.c()) >= 0 && iVar.c().compareTo(iVar2.c()) > 0) ? iVar : iVar2 : iVar : iVar2;
    }

    private final List<C0296a> C(i iVar) {
        return f(new C0296a(iVar, c(iVar, m()), null), new d(this, v()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x c(i iVar, x xVar) {
        return h().c(xVar, i(iVar));
    }

    private final e d(i iVar) {
        h hVar;
        h t = t(iVar);
        f fVar = null;
        if (t == null) {
            i p = p(iVar);
            hVar = p != null ? t(p) : null;
        } else {
            hVar = t;
        }
        p v = v();
        kotlin.reflect.x.internal.l0.b.q.c cVar = kotlin.reflect.x.internal.l0.b.q.c.a;
        if (cVar.l(s(v.h0(iVar)))) {
            fVar = f.READ_ONLY;
        } else if (cVar.k(s(v.T(iVar)))) {
            fVar = f.MUTABLE;
        }
        return new e(hVar, fVar, v().C(iVar) || A(iVar), hVar != t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x012a, code lost:
    
        if ((r0 != null && r0.c()) != false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.reflect.x.internal.l0.d.a.o0.e e(kotlin.reflect.x.internal.l0.d.a.o0.a.C0296a r12) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.d.a.o0.a.e(kotlin.f0.x.e.l0.d.a.o0.a$a):kotlin.f0.x.e.l0.d.a.o0.e");
    }

    private final <T> List<T> f(T t, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        ArrayList arrayList = new ArrayList(1);
        g(t, arrayList, function1);
        return arrayList;
    }

    private final <T> void g(T t, List<T> list, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        list.add(t);
        Iterable<? extends T> invoke = function1.invoke(t);
        if (invoke != null) {
            Iterator<? extends T> it = invoke.iterator();
            while (it.hasNext()) {
                g(it.next(), list, function1);
            }
        }
    }

    private final i j(o oVar) {
        boolean z;
        boolean z2;
        boolean z3;
        List<i> arrayList;
        boolean z4;
        p v = v();
        i iVar = null;
        if (!z(oVar)) {
            return null;
        }
        List<i> B0 = v.B0(oVar);
        boolean z5 = B0 instanceof Collection;
        if (!z5 || !B0.isEmpty()) {
            Iterator<T> it = B0.iterator();
            while (it.hasNext()) {
                if (!v.Y((i) it.next())) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return null;
        }
        if (!z5 || !B0.isEmpty()) {
            Iterator<T> it2 = B0.iterator();
            while (it2.hasNext()) {
                if (t((i) it2.next()) != null) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (!z2) {
            if (!z5 || !B0.isEmpty()) {
                Iterator<T> it3 = B0.iterator();
                while (it3.hasNext()) {
                    if (p((i) it3.next()) != null) {
                        z3 = true;
                        break;
                    }
                }
            }
            z3 = false;
            if (z3) {
                arrayList = new ArrayList<>();
                Iterator<T> it4 = B0.iterator();
                while (it4.hasNext()) {
                    i p = p((i) it4.next());
                    if (p != null) {
                        arrayList.add(p);
                    }
                }
            }
            return iVar;
        }
        arrayList = B0;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<T> it5 = arrayList.iterator();
            while (it5.hasNext()) {
                if (!v.p0((i) it5.next())) {
                    z4 = false;
                    break;
                }
            }
        }
        z4 = true;
        iVar = new i(z4 ? h.NULLABLE : h.NOT_NULL, arrayList != B0);
        return iVar;
    }

    private final h t(i iVar) {
        p v = v();
        if (v.W(v.h0(iVar))) {
            return h.NULLABLE;
        }
        if (v.W(v.T(iVar))) {
            return null;
        }
        return h.NOT_NULL;
    }

    public abstract boolean A(i iVar);

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (r10 != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.x.internal.l0.d.a.o0.e> b(kotlin.reflect.x.internal.l0.l.w1.i r10, java.lang.Iterable<? extends kotlin.reflect.x.internal.l0.l.w1.i> r11, kotlin.reflect.x.internal.l0.d.a.o0.q r12, boolean r13) {
        /*
            r9 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.l.f(r10, r0)
            java.lang.String r0 = "overrides"
            kotlin.jvm.internal.l.f(r11, r0)
            java.util.List r0 = r9.C(r10)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.r.t(r11, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r11.iterator()
        L1d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r2.next()
            kotlin.f0.x.e.l0.l.w1.i r3 = (kotlin.reflect.x.internal.l0.l.w1.i) r3
            java.util.List r3 = r9.C(r3)
            r1.add(r3)
            goto L1d
        L31:
            boolean r2 = r9.q()
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L6b
            boolean r2 = r9.x()
            if (r2 == 0) goto L69
            boolean r2 = r11 instanceof java.util.Collection
            if (r2 == 0) goto L4e
            r2 = r11
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L4e
        L4c:
            r10 = 0
            goto L66
        L4e:
            java.util.Iterator r11 = r11.iterator()
        L52:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r11.next()
            kotlin.f0.x.e.l0.l.w1.i r2 = (kotlin.reflect.x.internal.l0.l.w1.i) r2
            boolean r2 = r9.y(r10, r2)
            r2 = r2 ^ r4
            if (r2 == 0) goto L52
            r10 = 1
        L66:
            if (r10 == 0) goto L69
            goto L6b
        L69:
            r10 = 0
            goto L6c
        L6b:
            r10 = 1
        L6c:
            if (r10 == 0) goto L70
            r10 = 1
            goto L74
        L70:
            int r10 = r0.size()
        L74:
            kotlin.f0.x.e.l0.d.a.o0.e[] r11 = new kotlin.reflect.x.internal.l0.d.a.o0.e[r10]
            r2 = 0
        L77:
            if (r2 >= r10) goto Ld1
            java.lang.Object r5 = r0.get(r2)
            kotlin.f0.x.e.l0.d.a.o0.a$a r5 = (kotlin.reflect.x.internal.l0.d.a.o0.a.C0296a) r5
            kotlin.f0.x.e.l0.d.a.o0.e r5 = r9.e(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L8c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb2
            java.lang.Object r8 = r7.next()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = kotlin.collections.r.U(r8, r2)
            kotlin.f0.x.e.l0.d.a.o0.a$a r8 = (kotlin.reflect.x.internal.l0.d.a.o0.a.C0296a) r8
            if (r8 == 0) goto Lab
            kotlin.f0.x.e.l0.l.w1.i r8 = r8.b()
            if (r8 == 0) goto Lab
            kotlin.f0.x.e.l0.d.a.o0.e r8 = r9.d(r8)
            goto Lac
        Lab:
            r8 = 0
        Lac:
            if (r8 == 0) goto L8c
            r6.add(r8)
            goto L8c
        Lb2:
            if (r2 != 0) goto Lbc
            boolean r7 = r9.x()
            if (r7 == 0) goto Lbc
            r7 = 1
            goto Lbd
        Lbc:
            r7 = 0
        Lbd:
            if (r2 != 0) goto Lc7
            boolean r8 = r9.n()
            if (r8 == 0) goto Lc7
            r8 = 1
            goto Lc8
        Lc7:
            r8 = 0
        Lc8:
            kotlin.f0.x.e.l0.d.a.o0.e r5 = kotlin.reflect.x.internal.l0.d.a.o0.s.a(r5, r6, r7, r8, r13)
            r11[r2] = r5
            int r2 = r2 + 1
            goto L77
        Ld1:
            kotlin.f0.x.e.l0.d.a.o0.a$b r10 = new kotlin.f0.x.e.l0.d.a.o0.a$b
            r10.<init>(r12, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.d.a.o0.a.b(kotlin.f0.x.e.l0.l.w1.i, java.lang.Iterable, kotlin.f0.x.e.l0.d.a.o0.q, boolean):kotlin.a0.c.l");
    }

    public abstract kotlin.reflect.x.internal.l0.d.a.a<TAnnotation> h();

    public abstract Iterable<TAnnotation> i(i iVar);

    public abstract Iterable<TAnnotation> k();

    public abstract kotlin.reflect.x.internal.l0.d.a.b l();

    public abstract x m();

    public abstract boolean n();

    public abstract boolean o();

    public abstract i p(i iVar);

    public boolean q() {
        return false;
    }

    public abstract boolean r(TAnnotation tannotation);

    public abstract kotlin.reflect.x.internal.l0.f.d s(i iVar);

    public abstract boolean u();

    public abstract p v();

    public abstract boolean w(i iVar);

    public abstract boolean x();

    public abstract boolean y(i iVar, i iVar2);

    public abstract boolean z(o oVar);
}
