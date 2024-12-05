package com.google.gson.t.n;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: TypeAdapters.java */
/* loaded from: classes2.dex */
public final class n {
    public static final com.google.gson.q<String> A;
    public static final com.google.gson.q<BigDecimal> B;
    public static final com.google.gson.q<BigInteger> C;
    public static final com.google.gson.r D;
    public static final com.google.gson.q<StringBuilder> E;
    public static final com.google.gson.r F;
    public static final com.google.gson.q<StringBuffer> G;
    public static final com.google.gson.r H;
    public static final com.google.gson.q<URL> I;
    public static final com.google.gson.r J;
    public static final com.google.gson.q<URI> K;
    public static final com.google.gson.r L;
    public static final com.google.gson.q<InetAddress> M;
    public static final com.google.gson.r N;
    public static final com.google.gson.q<UUID> O;
    public static final com.google.gson.r P;
    public static final com.google.gson.q<Currency> Q;
    public static final com.google.gson.r R;
    public static final com.google.gson.r S;
    public static final com.google.gson.q<Calendar> T;
    public static final com.google.gson.r U;
    public static final com.google.gson.q<Locale> V;
    public static final com.google.gson.r W;
    public static final com.google.gson.q<com.google.gson.j> X;
    public static final com.google.gson.r Y;
    public static final com.google.gson.r Z;
    public static final com.google.gson.q<Class> a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.gson.r f16958b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.gson.q<BitSet> f16959c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.gson.r f16960d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.google.gson.q<Boolean> f16961e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.google.gson.q<Boolean> f16962f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.gson.r f16963g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.gson.q<Number> f16964h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.gson.r f16965i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.google.gson.q<Number> f16966j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.google.gson.r f16967k;
    public static final com.google.gson.q<Number> l;
    public static final com.google.gson.r m;
    public static final com.google.gson.q<AtomicInteger> n;
    public static final com.google.gson.r o;
    public static final com.google.gson.q<AtomicBoolean> p;
    public static final com.google.gson.r q;
    public static final com.google.gson.q<AtomicIntegerArray> r;
    public static final com.google.gson.r s;
    public static final com.google.gson.q<Number> t;
    public static final com.google.gson.q<Number> u;
    public static final com.google.gson.q<Number> v;
    public static final com.google.gson.q<Number> w;
    public static final com.google.gson.r x;
    public static final com.google.gson.q<Character> y;
    public static final com.google.gson.r z;

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class a extends com.google.gson.q<AtomicIntegerArray> {
        a() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray b(com.google.gson.stream.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.L()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.i0()));
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }
            aVar.z();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            cVar.f();
            int length = atomicIntegerArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                cVar.x0(atomicIntegerArray.get(i2));
            }
            cVar.z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public static class a0 implements com.google.gson.r {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Class f16968f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.google.gson.q f16969g;

        /* JADX INFO: Add missing generic type declarations: [T1] */
        /* compiled from: TypeAdapters.java */
        /* loaded from: classes2.dex */
        class a<T1> extends com.google.gson.q<T1> {
            final /* synthetic */ Class a;

            a(Class cls) {
                this.a = cls;
            }

            @Override // com.google.gson.q
            public T1 b(com.google.gson.stream.a aVar) throws IOException {
                T1 t1 = (T1) a0.this.f16969g.b(aVar);
                if (t1 == null || this.a.isInstance(t1)) {
                    return t1;
                }
                throw new JsonSyntaxException("Expected a " + this.a.getName() + " but was " + t1.getClass().getName());
            }

            @Override // com.google.gson.q
            public void d(com.google.gson.stream.c cVar, T1 t1) throws IOException {
                a0.this.f16969g.d(cVar, t1);
            }
        }

        a0(Class cls, com.google.gson.q qVar) {
            this.f16968f = cls;
            this.f16969g = qVar;
        }

        @Override // com.google.gson.r
        public <T2> com.google.gson.q<T2> b(com.google.gson.e eVar, com.google.gson.u.a<T2> aVar) {
            Class<? super T2> rawType = aVar.getRawType();
            if (this.f16968f.isAssignableFrom(rawType)) {
                return new a(rawType);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f16968f.getName() + ",adapter=" + this.f16969g + "]";
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class b extends com.google.gson.q<Number> {
        b() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            try {
                return Long.valueOf(aVar.k0());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, Number number) throws IOException {
            cVar.z0(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class b0 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.google.gson.stream.b.values().length];
            a = iArr;
            try {
                iArr[com.google.gson.stream.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.google.gson.stream.b.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[com.google.gson.stream.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[com.google.gson.stream.b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[com.google.gson.stream.b.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[com.google.gson.stream.b.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[com.google.gson.stream.b.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[com.google.gson.stream.b.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[com.google.gson.stream.b.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[com.google.gson.stream.b.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class c extends com.google.gson.q<Number> {
        c() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            return Float.valueOf((float) aVar.g0());
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, Number number) throws IOException {
            cVar.z0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class c0 extends com.google.gson.q<Boolean> {
        c0() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(com.google.gson.stream.a aVar) throws IOException {
            com.google.gson.stream.b x0 = aVar.x0();
            if (x0 == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            if (x0 == com.google.gson.stream.b.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(aVar.v0()));
            }
            return Boolean.valueOf(aVar.c0());
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, Boolean bool) throws IOException {
            cVar.y0(bool);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class d extends com.google.gson.q<Number> {
        d() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            return Double.valueOf(aVar.g0());
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, Number number) throws IOException {
            cVar.z0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class d0 extends com.google.gson.q<Boolean> {
        d0() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            return Boolean.valueOf(aVar.v0());
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, Boolean bool) throws IOException {
            cVar.A0(bool == null ? "null" : bool.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class e extends com.google.gson.q<Number> {
        e() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(com.google.gson.stream.a aVar) throws IOException {
            com.google.gson.stream.b x0 = aVar.x0();
            int i2 = b0.a[x0.ordinal()];
            if (i2 == 1 || i2 == 3) {
                return new com.google.gson.t.g(aVar.v0());
            }
            if (i2 == 4) {
                aVar.t0();
                return null;
            }
            throw new JsonSyntaxException("Expecting number, got: " + x0);
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, Number number) throws IOException {
            cVar.z0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class e0 extends com.google.gson.q<Number> {
        e0() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.i0());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, Number number) throws IOException {
            cVar.z0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class f extends com.google.gson.q<Character> {
        f() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Character b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            String v0 = aVar.v0();
            if (v0.length() == 1) {
                return Character.valueOf(v0.charAt(0));
            }
            throw new JsonSyntaxException("Expecting character, got: " + v0);
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, Character ch) throws IOException {
            cVar.A0(ch == null ? null : String.valueOf(ch));
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class f0 extends com.google.gson.q<Number> {
        f0() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.i0());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, Number number) throws IOException {
            cVar.z0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class g extends com.google.gson.q<String> {
        g() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String b(com.google.gson.stream.a aVar) throws IOException {
            com.google.gson.stream.b x0 = aVar.x0();
            if (x0 == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            if (x0 == com.google.gson.stream.b.BOOLEAN) {
                return Boolean.toString(aVar.c0());
            }
            return aVar.v0();
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, String str) throws IOException {
            cVar.A0(str);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class g0 extends com.google.gson.q<Number> {
        g0() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.i0());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, Number number) throws IOException {
            cVar.z0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class h extends com.google.gson.q<BigDecimal> {
        h() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigDecimal b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            try {
                return new BigDecimal(aVar.v0());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.z0(bigDecimal);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class h0 extends com.google.gson.q<AtomicInteger> {
        h0() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicInteger b(com.google.gson.stream.a aVar) throws IOException {
            try {
                return new AtomicInteger(aVar.i0());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.x0(atomicInteger.get());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class i extends com.google.gson.q<BigInteger> {
        i() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigInteger b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            try {
                return new BigInteger(aVar.v0());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, BigInteger bigInteger) throws IOException {
            cVar.z0(bigInteger);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class i0 extends com.google.gson.q<AtomicBoolean> {
        i0() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean b(com.google.gson.stream.a aVar) throws IOException {
            return new AtomicBoolean(aVar.c0());
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.B0(atomicBoolean.get());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class j extends com.google.gson.q<StringBuilder> {
        j() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuilder b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            return new StringBuilder(aVar.v0());
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, StringBuilder sb) throws IOException {
            cVar.A0(sb == null ? null : sb.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    private static final class j0<T extends Enum<T>> extends com.google.gson.q<T> {
        private final Map<String, T> a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map<T, String> f16971b = new HashMap();

        public j0(Class<T> cls) {
            try {
                for (T t : cls.getEnumConstants()) {
                    String name = t.name();
                    com.google.gson.s.c cVar = (com.google.gson.s.c) cls.getField(name).getAnnotation(com.google.gson.s.c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String str : cVar.alternate()) {
                            this.a.put(str, t);
                        }
                    }
                    this.a.put(name, t);
                    this.f16971b.put(t, name);
                }
            } catch (NoSuchFieldException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public T b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            return this.a.get(aVar.v0());
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, T t) throws IOException {
            cVar.A0(t == null ? null : this.f16971b.get(t));
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class k extends com.google.gson.q<Class> {
        k() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Class b(com.google.gson.stream.a aVar) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class l extends com.google.gson.q<StringBuffer> {
        l() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuffer b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            return new StringBuffer(aVar.v0());
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, StringBuffer stringBuffer) throws IOException {
            cVar.A0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class m extends com.google.gson.q<URL> {
        m() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public URL b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            String v0 = aVar.v0();
            if ("null".equals(v0)) {
                return null;
            }
            return new URL(v0);
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, URL url) throws IOException {
            cVar.A0(url == null ? null : url.toExternalForm());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$n, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0206n extends com.google.gson.q<URI> {
        C0206n() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public URI b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            try {
                String v0 = aVar.v0();
                if ("null".equals(v0)) {
                    return null;
                }
                return new URI(v0);
            } catch (URISyntaxException e2) {
                throw new JsonIOException(e2);
            }
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, URI uri) throws IOException {
            cVar.A0(uri == null ? null : uri.toASCIIString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class o extends com.google.gson.q<InetAddress> {
        o() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public InetAddress b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            return InetAddress.getByName(aVar.v0());
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, InetAddress inetAddress) throws IOException {
            cVar.A0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class p extends com.google.gson.q<UUID> {
        p() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public UUID b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            return UUID.fromString(aVar.v0());
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, UUID uuid) throws IOException {
            cVar.A0(uuid == null ? null : uuid.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class q extends com.google.gson.q<Currency> {
        q() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Currency b(com.google.gson.stream.a aVar) throws IOException {
            return Currency.getInstance(aVar.v0());
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, Currency currency) throws IOException {
            cVar.A0(currency.getCurrencyCode());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class r implements com.google.gson.r {

        /* compiled from: TypeAdapters.java */
        /* loaded from: classes2.dex */
        class a extends com.google.gson.q<Timestamp> {
            final /* synthetic */ com.google.gson.q a;

            a(com.google.gson.q qVar) {
                this.a = qVar;
            }

            @Override // com.google.gson.q
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Timestamp b(com.google.gson.stream.a aVar) throws IOException {
                Date date = (Date) this.a.b(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            @Override // com.google.gson.q
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(com.google.gson.stream.c cVar, Timestamp timestamp) throws IOException {
                this.a.d(cVar, timestamp);
            }
        }

        r() {
        }

        @Override // com.google.gson.r
        public <T> com.google.gson.q<T> b(com.google.gson.e eVar, com.google.gson.u.a<T> aVar) {
            if (aVar.getRawType() != Timestamp.class) {
                return null;
            }
            return new a(eVar.k(Date.class));
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class s extends com.google.gson.q<Calendar> {
        s() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Calendar b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            aVar.b();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (aVar.x0() != com.google.gson.stream.b.END_OBJECT) {
                String q0 = aVar.q0();
                int i0 = aVar.i0();
                if ("year".equals(q0)) {
                    i2 = i0;
                } else if ("month".equals(q0)) {
                    i3 = i0;
                } else if ("dayOfMonth".equals(q0)) {
                    i4 = i0;
                } else if ("hourOfDay".equals(q0)) {
                    i5 = i0;
                } else if ("minute".equals(q0)) {
                    i6 = i0;
                } else if ("second".equals(q0)) {
                    i7 = i0;
                }
            }
            aVar.D();
            return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                cVar.c0();
                return;
            }
            cVar.o();
            cVar.T("year");
            cVar.x0(calendar.get(1));
            cVar.T("month");
            cVar.x0(calendar.get(2));
            cVar.T("dayOfMonth");
            cVar.x0(calendar.get(5));
            cVar.T("hourOfDay");
            cVar.x0(calendar.get(11));
            cVar.T("minute");
            cVar.x0(calendar.get(12));
            cVar.T("second");
            cVar.x0(calendar.get(13));
            cVar.D();
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class t extends com.google.gson.q<Locale> {
        t() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Locale b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.v0(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (nextToken2 == null && nextToken3 == null) {
                return new Locale(nextToken);
            }
            if (nextToken3 == null) {
                return new Locale(nextToken, nextToken2);
            }
            return new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, Locale locale) throws IOException {
            cVar.A0(locale == null ? null : locale.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class u extends com.google.gson.q<com.google.gson.j> {
        u() {
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public com.google.gson.j b(com.google.gson.stream.a aVar) throws IOException {
            switch (b0.a[aVar.x0().ordinal()]) {
                case 1:
                    return new com.google.gson.m(new com.google.gson.t.g(aVar.v0()));
                case 2:
                    return new com.google.gson.m(Boolean.valueOf(aVar.c0()));
                case 3:
                    return new com.google.gson.m(aVar.v0());
                case 4:
                    aVar.t0();
                    return com.google.gson.k.a;
                case 5:
                    com.google.gson.g gVar = new com.google.gson.g();
                    aVar.a();
                    while (aVar.L()) {
                        gVar.D(b(aVar));
                    }
                    aVar.z();
                    return gVar;
                case 6:
                    com.google.gson.l lVar = new com.google.gson.l();
                    aVar.b();
                    while (aVar.L()) {
                        lVar.D(aVar.q0(), b(aVar));
                    }
                    aVar.D();
                    return lVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, com.google.gson.j jVar) throws IOException {
            if (jVar != null && !jVar.w()) {
                if (jVar.z()) {
                    com.google.gson.m f2 = jVar.f();
                    if (f2.R()) {
                        cVar.z0(f2.N());
                        return;
                    } else if (f2.P()) {
                        cVar.B0(f2.D());
                        return;
                    } else {
                        cVar.A0(f2.O());
                        return;
                    }
                }
                if (jVar.o()) {
                    cVar.f();
                    Iterator<com.google.gson.j> it = jVar.a().iterator();
                    while (it.hasNext()) {
                        d(cVar, it.next());
                    }
                    cVar.z();
                    return;
                }
                if (jVar.x()) {
                    cVar.o();
                    for (Map.Entry<String, com.google.gson.j> entry : jVar.b().J()) {
                        cVar.T(entry.getKey());
                        d(cVar, entry.getValue());
                    }
                    cVar.D();
                    return;
                }
                throw new IllegalArgumentException("Couldn't write " + jVar.getClass());
            }
            cVar.c0();
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class v extends com.google.gson.q<BitSet> {
        v() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        
            if (java.lang.Integer.parseInt(r1) != 0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
        
            if (r8.i0() != 0) goto L23;
         */
        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.util.BitSet b(com.google.gson.stream.a r8) throws java.io.IOException {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.a()
                com.google.gson.stream.b r1 = r8.x0()
                r2 = 0
                r3 = 0
            Le:
                com.google.gson.stream.b r4 = com.google.gson.stream.b.END_ARRAY
                if (r1 == r4) goto L75
                int[] r4 = com.google.gson.t.n.n.b0.a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L63
                r6 = 2
                if (r4 == r6) goto L5e
                r6 = 3
                if (r4 != r6) goto L47
                java.lang.String r1 = r8.v0()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L30
                if (r1 == 0) goto L2e
                goto L69
            L2e:
                r5 = 0
                goto L69
            L30:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L47:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L5e:
                boolean r5 = r8.c0()
                goto L69
            L63:
                int r1 = r8.i0()
                if (r1 == 0) goto L2e
            L69:
                if (r5 == 0) goto L6e
                r0.set(r3)
            L6e:
                int r3 = r3 + 1
                com.google.gson.stream.b r1 = r8.x0()
                goto Le
            L75:
                r8.z()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.t.n.n.v.b(com.google.gson.stream.a):java.util.BitSet");
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, BitSet bitSet) throws IOException {
            cVar.f();
            int length = bitSet.length();
            for (int i2 = 0; i2 < length; i2++) {
                cVar.x0(bitSet.get(i2) ? 1L : 0L);
            }
            cVar.z();
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    static class w implements com.google.gson.r {
        w() {
        }

        @Override // com.google.gson.r
        public <T> com.google.gson.q<T> b(com.google.gson.e eVar, com.google.gson.u.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new j0(rawType);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public static class x implements com.google.gson.r {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Class f16973f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.google.gson.q f16974g;

        x(Class cls, com.google.gson.q qVar) {
            this.f16973f = cls;
            this.f16974g = qVar;
        }

        @Override // com.google.gson.r
        public <T> com.google.gson.q<T> b(com.google.gson.e eVar, com.google.gson.u.a<T> aVar) {
            if (aVar.getRawType() == this.f16973f) {
                return this.f16974g;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f16973f.getName() + ",adapter=" + this.f16974g + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public static class y implements com.google.gson.r {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Class f16975f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Class f16976g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ com.google.gson.q f16977h;

        y(Class cls, Class cls2, com.google.gson.q qVar) {
            this.f16975f = cls;
            this.f16976g = cls2;
            this.f16977h = qVar;
        }

        @Override // com.google.gson.r
        public <T> com.google.gson.q<T> b(com.google.gson.e eVar, com.google.gson.u.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (rawType == this.f16975f || rawType == this.f16976g) {
                return this.f16977h;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f16976g.getName() + "+" + this.f16975f.getName() + ",adapter=" + this.f16977h + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public static class z implements com.google.gson.r {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Class f16978f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Class f16979g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ com.google.gson.q f16980h;

        z(Class cls, Class cls2, com.google.gson.q qVar) {
            this.f16978f = cls;
            this.f16979g = cls2;
            this.f16980h = qVar;
        }

        @Override // com.google.gson.r
        public <T> com.google.gson.q<T> b(com.google.gson.e eVar, com.google.gson.u.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (rawType == this.f16978f || rawType == this.f16979g) {
                return this.f16980h;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f16978f.getName() + "+" + this.f16979g.getName() + ",adapter=" + this.f16980h + "]";
        }
    }

    static {
        com.google.gson.q<Class> a2 = new k().a();
        a = a2;
        f16958b = a(Class.class, a2);
        com.google.gson.q<BitSet> a3 = new v().a();
        f16959c = a3;
        f16960d = a(BitSet.class, a3);
        c0 c0Var = new c0();
        f16961e = c0Var;
        f16962f = new d0();
        f16963g = b(Boolean.TYPE, Boolean.class, c0Var);
        e0 e0Var = new e0();
        f16964h = e0Var;
        f16965i = b(Byte.TYPE, Byte.class, e0Var);
        f0 f0Var = new f0();
        f16966j = f0Var;
        f16967k = b(Short.TYPE, Short.class, f0Var);
        g0 g0Var = new g0();
        l = g0Var;
        m = b(Integer.TYPE, Integer.class, g0Var);
        com.google.gson.q<AtomicInteger> a4 = new h0().a();
        n = a4;
        o = a(AtomicInteger.class, a4);
        com.google.gson.q<AtomicBoolean> a5 = new i0().a();
        p = a5;
        q = a(AtomicBoolean.class, a5);
        com.google.gson.q<AtomicIntegerArray> a6 = new a().a();
        r = a6;
        s = a(AtomicIntegerArray.class, a6);
        t = new b();
        u = new c();
        v = new d();
        e eVar = new e();
        w = eVar;
        x = a(Number.class, eVar);
        f fVar = new f();
        y = fVar;
        z = b(Character.TYPE, Character.class, fVar);
        g gVar = new g();
        A = gVar;
        B = new h();
        C = new i();
        D = a(String.class, gVar);
        j jVar = new j();
        E = jVar;
        F = a(StringBuilder.class, jVar);
        l lVar = new l();
        G = lVar;
        H = a(StringBuffer.class, lVar);
        m mVar = new m();
        I = mVar;
        J = a(URL.class, mVar);
        C0206n c0206n = new C0206n();
        K = c0206n;
        L = a(URI.class, c0206n);
        o oVar = new o();
        M = oVar;
        N = d(InetAddress.class, oVar);
        p pVar = new p();
        O = pVar;
        P = a(UUID.class, pVar);
        com.google.gson.q<Currency> a7 = new q().a();
        Q = a7;
        R = a(Currency.class, a7);
        S = new r();
        s sVar = new s();
        T = sVar;
        U = c(Calendar.class, GregorianCalendar.class, sVar);
        t tVar = new t();
        V = tVar;
        W = a(Locale.class, tVar);
        u uVar = new u();
        X = uVar;
        Y = d(com.google.gson.j.class, uVar);
        Z = new w();
    }

    public static <TT> com.google.gson.r a(Class<TT> cls, com.google.gson.q<TT> qVar) {
        return new x(cls, qVar);
    }

    public static <TT> com.google.gson.r b(Class<TT> cls, Class<TT> cls2, com.google.gson.q<? super TT> qVar) {
        return new y(cls, cls2, qVar);
    }

    public static <TT> com.google.gson.r c(Class<TT> cls, Class<? extends TT> cls2, com.google.gson.q<? super TT> qVar) {
        return new z(cls, cls2, qVar);
    }

    public static <T1> com.google.gson.r d(Class<T1> cls, com.google.gson.q<T1> qVar) {
        return new a0(cls, qVar);
    }
}
