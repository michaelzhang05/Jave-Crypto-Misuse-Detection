package W1;

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
    public static final W1.e f11971c = new j();

    /* renamed from: d, reason: collision with root package name */
    public static final W1.e f11972d = new k();

    /* renamed from: e, reason: collision with root package name */
    public static final W1.e f11973e = new l();

    /* renamed from: f, reason: collision with root package name */
    public static final W1.e f11974f = new m();

    /* renamed from: g, reason: collision with root package name */
    public static final W1.e f11975g = new n();

    /* renamed from: h, reason: collision with root package name */
    public static final W1.e f11976h = new o();

    /* renamed from: i, reason: collision with root package name */
    public static final W1.e f11977i = new p();

    /* renamed from: j, reason: collision with root package name */
    public static final W1.e f11978j = new W1.c();

    /* renamed from: k, reason: collision with root package name */
    public static final W1.e f11979k = new W1.b();

    /* renamed from: l, reason: collision with root package name */
    public static final W1.e f11980l = new W1.a();

    /* renamed from: m, reason: collision with root package name */
    public static final W1.e f11981m = new q();

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap f11982a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private LinkedList f11983b = new LinkedList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements W1.e {
        a() {
        }

        @Override // W1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Double d8, Appendable appendable, T1.g gVar) {
            if (d8.isInfinite()) {
                appendable.append("null");
            } else {
                appendable.append(d8.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements W1.e {
        b() {
        }

        @Override // W1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, Appendable appendable, T1.g gVar) {
            appendable.append('\"');
            T1.i.a(date.toString(), appendable, gVar);
            appendable.append('\"');
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements W1.e {
        c() {
        }

        @Override // W1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Float f8, Appendable appendable, T1.g gVar) {
            if (f8.isInfinite()) {
                appendable.append("null");
            } else {
                appendable.append(f8.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W1.d$d, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0234d implements W1.e {
        C0234d() {
        }

        @Override // W1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(int[] iArr, Appendable appendable, T1.g gVar) {
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
    public class e implements W1.e {
        e() {
        }

        @Override // W1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(short[] sArr, Appendable appendable, T1.g gVar) {
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
    public class f implements W1.e {
        f() {
        }

        @Override // W1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(long[] jArr, Appendable appendable, T1.g gVar) {
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
    public class g implements W1.e {
        g() {
        }

        @Override // W1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(float[] fArr, Appendable appendable, T1.g gVar) {
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
    public class h implements W1.e {
        h() {
        }

        @Override // W1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(double[] dArr, Appendable appendable, T1.g gVar) {
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
    public class i implements W1.e {
        i() {
        }

        @Override // W1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(boolean[] zArr, Appendable appendable, T1.g gVar) {
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
    class j implements W1.e {
        j() {
        }

        @Override // W1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(T1.f fVar, Appendable appendable, T1.g gVar) {
            fVar.g(appendable);
        }
    }

    /* loaded from: classes4.dex */
    class k implements W1.e {
        k() {
        }

        @Override // W1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(T1.f fVar, Appendable appendable, T1.g gVar) {
            fVar.a(appendable, gVar);
        }
    }

    /* loaded from: classes4.dex */
    class l implements W1.e {
        l() {
        }

        @Override // W1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(T1.c cVar, Appendable appendable, T1.g gVar) {
            appendable.append(cVar.l(gVar));
        }
    }

    /* loaded from: classes4.dex */
    class m implements W1.e {
        m() {
        }

        @Override // W1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(T1.b bVar, Appendable appendable, T1.g gVar) {
            appendable.append(bVar.h());
        }
    }

    /* loaded from: classes4.dex */
    class n implements W1.e {
        n() {
        }

        @Override // W1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Iterable iterable, Appendable appendable, T1.g gVar) {
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
                    T1.i.b(obj, appendable, gVar);
                }
                gVar.b(appendable);
            }
            gVar.d(appendable);
        }
    }

    /* loaded from: classes4.dex */
    class o implements W1.e {
        o() {
        }

        @Override // W1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Enum r12, Appendable appendable, T1.g gVar) {
            gVar.p(appendable, r12.name());
        }
    }

    /* loaded from: classes4.dex */
    class p implements W1.e {
        p() {
        }

        @Override // W1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map map, Appendable appendable, T1.g gVar) {
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
    class q implements W1.e {
        q() {
        }

        @Override // W1.e
        public void a(Object obj, Appendable appendable, T1.g gVar) {
            appendable.append(obj.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class r implements W1.e {
        r() {
        }

        @Override // W1.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(String str, Appendable appendable, T1.g gVar) {
            gVar.p(appendable, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class s {

        /* renamed from: a, reason: collision with root package name */
        public Class f11994a;

        /* renamed from: b, reason: collision with root package name */
        public W1.e f11995b;

        public s(Class cls, W1.e eVar) {
            this.f11994a = cls;
            this.f11995b = eVar;
        }
    }

    public d() {
        c();
    }

    public static void g(String str, Object obj, Appendable appendable, T1.g gVar) {
        if (str == null) {
            appendable.append("null");
        } else if (!gVar.h(str)) {
            appendable.append(str);
        } else {
            appendable.append('\"');
            T1.i.a(str, appendable, gVar);
            appendable.append('\"');
        }
        gVar.k(appendable);
        if (obj instanceof String) {
            gVar.p(appendable, (String) obj);
        } else {
            T1.i.b(obj, appendable, gVar);
        }
        gVar.j(appendable);
    }

    public W1.e a(Class cls) {
        return (W1.e) this.f11982a.get(cls);
    }

    public W1.e b(Class cls) {
        Iterator it = this.f11983b.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            if (sVar.f11994a.isAssignableFrom(cls)) {
                return sVar.f11995b;
            }
        }
        return null;
    }

    public void c() {
        d(new r(), String.class);
        d(new a(), Double.class);
        d(new b(), Date.class);
        d(new c(), Float.class);
        W1.e eVar = f11981m;
        d(eVar, Integer.class, Long.class, Byte.class, Short.class, BigInteger.class, BigDecimal.class);
        d(eVar, Boolean.class);
        d(new C0234d(), int[].class);
        d(new e(), short[].class);
        d(new f(), long[].class);
        d(new g(), float[].class);
        d(new h(), double[].class);
        d(new i(), boolean[].class);
        e(T1.f.class, f11972d);
        e(T1.e.class, f11971c);
        e(T1.c.class, f11973e);
        e(T1.b.class, f11974f);
        e(Map.class, f11977i);
        e(Iterable.class, f11975g);
        e(Enum.class, f11976h);
        e(Number.class, eVar);
    }

    public void d(W1.e eVar, Class... clsArr) {
        for (Class cls : clsArr) {
            this.f11982a.put(cls, eVar);
        }
    }

    public void e(Class cls, W1.e eVar) {
        f(cls, eVar);
    }

    public void f(Class cls, W1.e eVar) {
        this.f11983b.addLast(new s(cls, eVar));
    }
}
