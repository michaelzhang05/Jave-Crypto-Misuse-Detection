package com.google.gson;

import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: Gson.java */
/* loaded from: classes2.dex */
public final class e {
    private static final com.google.gson.u.a<?> a = com.google.gson.u.a.get(Object.class);

    /* renamed from: b, reason: collision with root package name */
    private final ThreadLocal<Map<com.google.gson.u.a<?>, f<?>>> f16834b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<com.google.gson.u.a<?>, q<?>> f16835c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.gson.t.c f16836d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.gson.t.n.d f16837e;

    /* renamed from: f, reason: collision with root package name */
    final List<r> f16838f;

    /* renamed from: g, reason: collision with root package name */
    final com.google.gson.t.d f16839g;

    /* renamed from: h, reason: collision with root package name */
    final com.google.gson.d f16840h;

    /* renamed from: i, reason: collision with root package name */
    final Map<Type, com.google.gson.f<?>> f16841i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f16842j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f16843k;
    final boolean l;
    final boolean m;
    final boolean n;
    final boolean o;
    final boolean p;
    final String q;
    final int r;
    final int s;
    final p t;
    final List<r> u;
    final List<r> v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* loaded from: classes2.dex */
    public class a extends q<Number> {
        a() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            return Double.valueOf(aVar.g0());
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.c0();
            } else {
                e.d(number.doubleValue());
                cVar.z0(number);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* loaded from: classes2.dex */
    public class b extends q<Number> {
        b() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            return Float.valueOf((float) aVar.g0());
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.c0();
            } else {
                e.d(number.floatValue());
                cVar.z0(number);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* loaded from: classes2.dex */
    public static class c extends q<Number> {
        c() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            return Long.valueOf(aVar.k0());
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.c0();
            } else {
                cVar.A0(number.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* loaded from: classes2.dex */
    public static class d extends q<AtomicLong> {
        final /* synthetic */ q a;

        d(q qVar) {
            this.a = qVar;
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLong b(com.google.gson.stream.a aVar) throws IOException {
            return new AtomicLong(((Number) this.a.b(aVar)).longValue());
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, AtomicLong atomicLong) throws IOException {
            this.a.d(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.e$e, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0200e extends q<AtomicLongArray> {
        final /* synthetic */ q a;

        C0200e(q qVar) {
            this.a = qVar;
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray b(com.google.gson.stream.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.L()) {
                arrayList.add(Long.valueOf(((Number) this.a.b(aVar)).longValue()));
            }
            aVar.z();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
            }
            return atomicLongArray;
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, AtomicLongArray atomicLongArray) throws IOException {
            cVar.f();
            int length = atomicLongArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                this.a.d(cVar, Long.valueOf(atomicLongArray.get(i2)));
            }
            cVar.z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* loaded from: classes2.dex */
    public static class f<T> extends q<T> {
        private q<T> a;

        f() {
        }

        @Override // com.google.gson.q
        public T b(com.google.gson.stream.a aVar) throws IOException {
            q<T> qVar = this.a;
            if (qVar != null) {
                return qVar.b(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.q
        public void d(com.google.gson.stream.c cVar, T t) throws IOException {
            q<T> qVar = this.a;
            if (qVar != null) {
                qVar.d(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }

        public void e(q<T> qVar) {
            if (this.a == null) {
                this.a = qVar;
                return;
            }
            throw new AssertionError();
        }
    }

    public e() {
        this(com.google.gson.t.d.f16883f, com.google.gson.c.f16828f, Collections.emptyMap(), false, false, false, true, false, false, false, p.f16846f, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    private static void a(Object obj, com.google.gson.stream.a aVar) {
        if (obj != null) {
            try {
                if (aVar.x0() == com.google.gson.stream.b.END_DOCUMENT) {
                } else {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e2) {
                throw new JsonSyntaxException(e2);
            } catch (IOException e3) {
                throw new JsonIOException(e3);
            }
        }
    }

    private static q<AtomicLong> b(q<Number> qVar) {
        return new d(qVar).a();
    }

    private static q<AtomicLongArray> c(q<Number> qVar) {
        return new C0200e(qVar).a();
    }

    static void d(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private q<Number> e(boolean z) {
        if (z) {
            return com.google.gson.t.n.n.v;
        }
        return new a();
    }

    private q<Number> f(boolean z) {
        if (z) {
            return com.google.gson.t.n.n.u;
        }
        return new b();
    }

    private static q<Number> m(p pVar) {
        if (pVar == p.f16846f) {
            return com.google.gson.t.n.n.t;
        }
        return new c();
    }

    public <T> T g(com.google.gson.stream.a aVar, Type type) throws JsonIOException, JsonSyntaxException {
        boolean P = aVar.P();
        boolean z = true;
        aVar.C0(true);
        try {
            try {
                try {
                    aVar.x0();
                    z = false;
                    T b2 = j(com.google.gson.u.a.get(type)).b(aVar);
                    aVar.C0(P);
                    return b2;
                } catch (AssertionError e2) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.5): " + e2.getMessage());
                    assertionError.initCause(e2);
                    throw assertionError;
                } catch (IllegalStateException e3) {
                    throw new JsonSyntaxException(e3);
                }
            } catch (EOFException e4) {
                if (z) {
                    aVar.C0(P);
                    return null;
                }
                throw new JsonSyntaxException(e4);
            } catch (IOException e5) {
                throw new JsonSyntaxException(e5);
            }
        } catch (Throwable th) {
            aVar.C0(P);
            throw th;
        }
    }

    public <T> T h(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
        com.google.gson.stream.a n = n(reader);
        T t = (T) g(n, type);
        a(t, n);
        return t;
    }

    public <T> T i(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return (T) h(new StringReader(str), type);
    }

    public <T> q<T> j(com.google.gson.u.a<T> aVar) {
        q<T> qVar = (q) this.f16835c.get(aVar == null ? a : aVar);
        if (qVar != null) {
            return qVar;
        }
        Map<com.google.gson.u.a<?>, f<?>> map = this.f16834b.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.f16834b.set(map);
            z = true;
        }
        f<?> fVar = map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            f<?> fVar2 = new f<>();
            map.put(aVar, fVar2);
            Iterator<r> it = this.f16838f.iterator();
            while (it.hasNext()) {
                q<T> b2 = it.next().b(this, aVar);
                if (b2 != null) {
                    fVar2.e(b2);
                    this.f16835c.put(aVar, b2);
                    return b2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.f16834b.remove();
            }
        }
    }

    public <T> q<T> k(Class<T> cls) {
        return j(com.google.gson.u.a.get((Class) cls));
    }

    public <T> q<T> l(r rVar, com.google.gson.u.a<T> aVar) {
        if (!this.f16838f.contains(rVar)) {
            rVar = this.f16837e;
        }
        boolean z = false;
        for (r rVar2 : this.f16838f) {
            if (z) {
                q<T> b2 = rVar2.b(this, aVar);
                if (b2 != null) {
                    return b2;
                }
            } else if (rVar2 == rVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public com.google.gson.stream.a n(Reader reader) {
        com.google.gson.stream.a aVar = new com.google.gson.stream.a(reader);
        aVar.C0(this.o);
        return aVar;
    }

    public com.google.gson.stream.c o(Writer writer) throws IOException {
        if (this.l) {
            writer.write(")]}'\n");
        }
        com.google.gson.stream.c cVar = new com.google.gson.stream.c(writer);
        if (this.n) {
            cVar.t0("  ");
        }
        cVar.v0(this.f16842j);
        return cVar;
    }

    public String p(j jVar) {
        StringWriter stringWriter = new StringWriter();
        t(jVar, stringWriter);
        return stringWriter.toString();
    }

    public String q(Object obj) {
        if (obj == null) {
            return p(k.a);
        }
        return r(obj, obj.getClass());
    }

    public String r(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        v(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void s(j jVar, com.google.gson.stream.c cVar) throws JsonIOException {
        boolean P = cVar.P();
        cVar.u0(true);
        boolean L = cVar.L();
        cVar.s0(this.m);
        boolean J = cVar.J();
        cVar.v0(this.f16842j);
        try {
            try {
                com.google.gson.t.l.b(jVar, cVar);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.5): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } finally {
            cVar.u0(P);
            cVar.s0(L);
            cVar.v0(J);
        }
    }

    public void t(j jVar, Appendable appendable) throws JsonIOException {
        try {
            s(jVar, o(com.google.gson.t.l.c(appendable)));
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f16842j + ",factories:" + this.f16838f + ",instanceCreators:" + this.f16836d + "}";
    }

    public void u(Object obj, Type type, com.google.gson.stream.c cVar) throws JsonIOException {
        q j2 = j(com.google.gson.u.a.get(type));
        boolean P = cVar.P();
        cVar.u0(true);
        boolean L = cVar.L();
        cVar.s0(this.m);
        boolean J = cVar.J();
        cVar.v0(this.f16842j);
        try {
            try {
                j2.d(cVar, obj);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.5): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } finally {
            cVar.u0(P);
            cVar.s0(L);
            cVar.v0(J);
        }
    }

    public void v(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            u(obj, type, o(com.google.gson.t.l.c(appendable)));
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        }
    }

    e(com.google.gson.t.d dVar, com.google.gson.d dVar2, Map<Type, com.google.gson.f<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, p pVar, String str, int i2, int i3, List<r> list, List<r> list2, List<r> list3) {
        this.f16834b = new ThreadLocal<>();
        this.f16835c = new ConcurrentHashMap();
        this.f16839g = dVar;
        this.f16840h = dVar2;
        this.f16841i = map;
        com.google.gson.t.c cVar = new com.google.gson.t.c(map);
        this.f16836d = cVar;
        this.f16842j = z;
        this.f16843k = z2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = z7;
        this.t = pVar;
        this.q = str;
        this.r = i2;
        this.s = i3;
        this.u = list;
        this.v = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.gson.t.n.n.Y);
        arrayList.add(com.google.gson.t.n.h.a);
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(com.google.gson.t.n.n.D);
        arrayList.add(com.google.gson.t.n.n.m);
        arrayList.add(com.google.gson.t.n.n.f16963g);
        arrayList.add(com.google.gson.t.n.n.f16965i);
        arrayList.add(com.google.gson.t.n.n.f16967k);
        q<Number> m = m(pVar);
        arrayList.add(com.google.gson.t.n.n.b(Long.TYPE, Long.class, m));
        arrayList.add(com.google.gson.t.n.n.b(Double.TYPE, Double.class, e(z7)));
        arrayList.add(com.google.gson.t.n.n.b(Float.TYPE, Float.class, f(z7)));
        arrayList.add(com.google.gson.t.n.n.x);
        arrayList.add(com.google.gson.t.n.n.o);
        arrayList.add(com.google.gson.t.n.n.q);
        arrayList.add(com.google.gson.t.n.n.a(AtomicLong.class, b(m)));
        arrayList.add(com.google.gson.t.n.n.a(AtomicLongArray.class, c(m)));
        arrayList.add(com.google.gson.t.n.n.s);
        arrayList.add(com.google.gson.t.n.n.z);
        arrayList.add(com.google.gson.t.n.n.F);
        arrayList.add(com.google.gson.t.n.n.H);
        arrayList.add(com.google.gson.t.n.n.a(BigDecimal.class, com.google.gson.t.n.n.B));
        arrayList.add(com.google.gson.t.n.n.a(BigInteger.class, com.google.gson.t.n.n.C));
        arrayList.add(com.google.gson.t.n.n.J);
        arrayList.add(com.google.gson.t.n.n.L);
        arrayList.add(com.google.gson.t.n.n.P);
        arrayList.add(com.google.gson.t.n.n.R);
        arrayList.add(com.google.gson.t.n.n.W);
        arrayList.add(com.google.gson.t.n.n.N);
        arrayList.add(com.google.gson.t.n.n.f16960d);
        arrayList.add(com.google.gson.t.n.c.a);
        arrayList.add(com.google.gson.t.n.n.U);
        arrayList.add(com.google.gson.t.n.k.a);
        arrayList.add(com.google.gson.t.n.j.a);
        arrayList.add(com.google.gson.t.n.n.S);
        arrayList.add(com.google.gson.t.n.a.a);
        arrayList.add(com.google.gson.t.n.n.f16958b);
        arrayList.add(new com.google.gson.t.n.b(cVar));
        arrayList.add(new com.google.gson.t.n.g(cVar, z2));
        com.google.gson.t.n.d dVar3 = new com.google.gson.t.n.d(cVar);
        this.f16837e = dVar3;
        arrayList.add(dVar3);
        arrayList.add(com.google.gson.t.n.n.Z);
        arrayList.add(new com.google.gson.t.n.i(cVar, dVar2, dVar, dVar3));
        this.f16838f = Collections.unmodifiableList(arrayList);
    }
}
