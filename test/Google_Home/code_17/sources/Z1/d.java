package Z1;

import j$.util.concurrent.ConcurrentHashMap;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    public static final Z1.e f13609c = new j();

    /* renamed from: d, reason: collision with root package name */
    public static final Z1.e f13610d = new k();

    /* renamed from: e, reason: collision with root package name */
    public static final Z1.e f13611e = new l();

    /* renamed from: f, reason: collision with root package name */
    public static final Z1.e f13612f = new m();

    /* renamed from: g, reason: collision with root package name */
    public static final Z1.e f13613g = new n();

    /* renamed from: h, reason: collision with root package name */
    public static final Z1.e f13614h = new o();

    /* renamed from: i, reason: collision with root package name */
    public static final Z1.e f13615i = new p();

    /* renamed from: j, reason: collision with root package name */
    public static final Z1.e f13616j = new Z1.c();

    /* renamed from: k, reason: collision with root package name */
    public static final Z1.e f13617k = new Z1.b();

    /* renamed from: l, reason: collision with root package name */
    public static final Z1.e f13618l = new Z1.a();

    /* renamed from: m, reason: collision with root package name */
    public static final Z1.e f13619m = new q();

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap f13620a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private LinkedList f13621b = new LinkedList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Z1.e {
        a() {
        }

        @Override // Z1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Double d8, Appendable appendable, W1.g gVar) {
            if (d8.isInfinite()) {
                appendable.append("null");
            } else {
                appendable.append(d8.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Z1.e {
        b() {
        }

        @Override // Z1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, Appendable appendable, W1.g gVar) {
            appendable.append('\"');
            W1.i.a(date.toString(), appendable, gVar);
            appendable.append('\"');
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements Z1.e {
        c() {
        }

        @Override // Z1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Float f8, Appendable appendable, W1.g gVar) {
            if (f8.isInfinite()) {
                appendable.append("null");
            } else {
                appendable.append(f8.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z1.d$d, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0260d implements Z1.e {
        C0260d() {
        }

        @Override // Z1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(int[] iArr, Appendable appendable, W1.g gVar) {
            gVar.c(appendable);
            boolean z8 = false;
            for (int i8 : iArr) {
                if (z8) {
                    gVar.m(appendable);
                } else {
                    z8 = true;
                }
                appendable.append(Integer.toString(i8));
            }
            gVar.d(appendable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements Z1.e {
        e() {
        }

        @Override // Z1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(short[] sArr, Appendable appendable, W1.g gVar) {
            gVar.c(appendable);
            boolean z8 = false;
            for (short s8 : sArr) {
                if (z8) {
                    gVar.m(appendable);
                } else {
                    z8 = true;
                }
                appendable.append(Short.toString(s8));
            }
            gVar.d(appendable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements Z1.e {
        f() {
        }

        @Override // Z1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(long[] jArr, Appendable appendable, W1.g gVar) {
            gVar.c(appendable);
            boolean z8 = false;
            for (long j8 : jArr) {
                if (z8) {
                    gVar.m(appendable);
                } else {
                    z8 = true;
                }
                appendable.append(Long.toString(j8));
            }
            gVar.d(appendable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements Z1.e {
        g() {
        }

        @Override // Z1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(float[] fArr, Appendable appendable, W1.g gVar) {
            gVar.c(appendable);
            boolean z8 = false;
            for (float f8 : fArr) {
                if (z8) {
                    gVar.m(appendable);
                } else {
                    z8 = true;
                }
                appendable.append(Float.toString(f8));
            }
            gVar.d(appendable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements Z1.e {
        h() {
        }

        @Override // Z1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(double[] dArr, Appendable appendable, W1.g gVar) {
            gVar.c(appendable);
            boolean z8 = false;
            for (double d8 : dArr) {
                if (z8) {
                    gVar.m(appendable);
                } else {
                    z8 = true;
                }
                appendable.append(Double.toString(d8));
            }
            gVar.d(appendable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements Z1.e {
        i() {
        }

        @Override // Z1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(boolean[] zArr, Appendable appendable, W1.g gVar) {
            gVar.c(appendable);
            boolean z8 = false;
            for (boolean z9 : zArr) {
                if (z8) {
                    gVar.m(appendable);
                } else {
                    z8 = true;
                }
                appendable.append(Boolean.toString(z9));
            }
            gVar.d(appendable);
        }
    }

    /* loaded from: classes4.dex */
    class j implements Z1.e {
        j() {
        }

        @Override // Z1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(W1.f fVar, Appendable appendable, W1.g gVar) {
            fVar.c(appendable);
        }
    }

    /* loaded from: classes4.dex */
    class k implements Z1.e {
        k() {
        }

        @Override // Z1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(W1.f fVar, Appendable appendable, W1.g gVar) {
            fVar.f(appendable, gVar);
        }
    }

    /* loaded from: classes4.dex */
    class l implements Z1.e {
        l() {
        }

        @Override // Z1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(W1.c cVar, Appendable appendable, W1.g gVar) {
            appendable.append(cVar.e(gVar));
        }
    }

    /* loaded from: classes4.dex */
    class m implements Z1.e {
        m() {
        }

        @Override // Z1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(W1.b bVar, Appendable appendable, W1.g gVar) {
            appendable.append(bVar.j());
        }
    }

    /* loaded from: classes4.dex */
    class n implements Z1.e {
        n() {
        }

        @Override // Z1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Iterable iterable, Appendable appendable, W1.g gVar) {
            gVar.c(appendable);
            boolean z8 = true;
            for (Object obj : iterable) {
                if (z8) {
                    gVar.e(appendable);
                    z8 = false;
                } else {
                    gVar.a(appendable);
                }
                if (obj == null) {
                    appendable.append("null");
                } else {
                    W1.i.b(obj, appendable, gVar);
                }
                gVar.b(appendable);
            }
            gVar.d(appendable);
        }
    }

    /* loaded from: classes4.dex */
    class o implements Z1.e {
        o() {
        }

        @Override // Z1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Enum r12, Appendable appendable, W1.g gVar) {
            gVar.p(appendable, r12.name());
        }
    }

    /* loaded from: classes4.dex */
    class p implements Z1.e {
        p() {
        }

        @Override // Z1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map map, Appendable appendable, W1.g gVar) {
            gVar.n(appendable);
            boolean z8 = true;
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value != null || !gVar.g()) {
                    if (z8) {
                        gVar.l(appendable);
                        z8 = false;
                    } else {
                        gVar.m(appendable);
                    }
                    d.g(entry.getKey().toString(), value, appendable, gVar);
                }
            }
            gVar.o(appendable);
        }
    }

    /* loaded from: classes4.dex */
    class q implements Z1.e {
        q() {
        }

        @Override // Z1.e
        public void a(Object obj, Appendable appendable, W1.g gVar) {
            appendable.append(obj.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class r implements Z1.e {
        r() {
        }

        @Override // Z1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(String str, Appendable appendable, W1.g gVar) {
            gVar.p(appendable, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class s {

        /* renamed from: a, reason: collision with root package name */
        public Class f13632a;

        /* renamed from: b, reason: collision with root package name */
        public Z1.e f13633b;

        public s(Class cls, Z1.e eVar) {
            this.f13632a = cls;
            this.f13633b = eVar;
        }
    }

    public d() {
        c();
    }

    public static void g(String str, Object obj, Appendable appendable, W1.g gVar) {
        if (str == null) {
            appendable.append("null");
        } else if (!gVar.h(str)) {
            appendable.append(str);
        } else {
            appendable.append('\"');
            W1.i.a(str, appendable, gVar);
            appendable.append('\"');
        }
        gVar.k(appendable);
        if (obj instanceof String) {
            gVar.p(appendable, (String) obj);
        } else {
            W1.i.b(obj, appendable, gVar);
        }
        gVar.j(appendable);
    }

    public Z1.e a(Class cls) {
        return (Z1.e) this.f13620a.get(cls);
    }

    public Z1.e b(Class cls) {
        Iterator it = this.f13621b.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            if (sVar.f13632a.isAssignableFrom(cls)) {
                return sVar.f13633b;
            }
        }
        return null;
    }

    public void c() {
        d(new r(), String.class);
        d(new a(), Double.class);
        d(new b(), Date.class);
        d(new c(), Float.class);
        Z1.e eVar = f13619m;
        d(eVar, Integer.class, Long.class, Byte.class, Short.class, BigInteger.class, BigDecimal.class);
        d(eVar, Boolean.class);
        d(new C0260d(), int[].class);
        d(new e(), short[].class);
        d(new f(), long[].class);
        d(new g(), float[].class);
        d(new h(), double[].class);
        d(new i(), boolean[].class);
        e(W1.f.class, f13610d);
        e(W1.e.class, f13609c);
        e(W1.c.class, f13611e);
        e(W1.b.class, f13612f);
        e(Map.class, f13615i);
        e(Iterable.class, f13613g);
        e(Enum.class, f13614h);
        e(Number.class, eVar);
    }

    public void d(Z1.e eVar, Class... clsArr) {
        for (Class cls : clsArr) {
            this.f13620a.put(cls, eVar);
        }
    }

    public void e(Class cls, Z1.e eVar) {
        f(cls, eVar);
    }

    public void f(Class cls, Z1.e eVar) {
        this.f13621b.addLast(new s(cls, eVar));
    }
}
