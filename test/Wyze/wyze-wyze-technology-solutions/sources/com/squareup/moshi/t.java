package com.squareup.moshi;

import com.squareup.moshi.f;
import com.squareup.moshi.i;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StandardJsonAdapters.java */
/* loaded from: classes2.dex */
public final class t {
    public static final f.e a = new c();

    /* renamed from: b, reason: collision with root package name */
    static final com.squareup.moshi.f<Boolean> f17307b = new d();

    /* renamed from: c, reason: collision with root package name */
    static final com.squareup.moshi.f<Byte> f17308c = new e();

    /* renamed from: d, reason: collision with root package name */
    static final com.squareup.moshi.f<Character> f17309d = new f();

    /* renamed from: e, reason: collision with root package name */
    static final com.squareup.moshi.f<Double> f17310e = new g();

    /* renamed from: f, reason: collision with root package name */
    static final com.squareup.moshi.f<Float> f17311f = new h();

    /* renamed from: g, reason: collision with root package name */
    static final com.squareup.moshi.f<Integer> f17312g = new i();

    /* renamed from: h, reason: collision with root package name */
    static final com.squareup.moshi.f<Long> f17313h = new j();

    /* renamed from: i, reason: collision with root package name */
    static final com.squareup.moshi.f<Short> f17314i = new k();

    /* renamed from: j, reason: collision with root package name */
    static final com.squareup.moshi.f<String> f17315j = new a();

    /* compiled from: StandardJsonAdapters.java */
    /* loaded from: classes2.dex */
    class a extends com.squareup.moshi.f<String> {
        a() {
        }

        @Override // com.squareup.moshi.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String fromJson(com.squareup.moshi.i iVar) throws IOException {
            return iVar.c0();
        }

        @Override // com.squareup.moshi.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(o oVar, String str) throws IOException {
            oVar.w0(str);
        }

        public String toString() {
            return "JsonAdapter(String)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* loaded from: classes2.dex */
    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[i.b.values().length];
            a = iArr;
            try {
                iArr[i.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[i.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[i.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[i.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[i.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[i.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* loaded from: classes2.dex */
    class c implements f.e {
        c() {
        }

        @Override // com.squareup.moshi.f.e
        public com.squareup.moshi.f<?> a(Type type, Set<? extends Annotation> set, r rVar) {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return t.f17307b;
            }
            if (type == Byte.TYPE) {
                return t.f17308c;
            }
            if (type == Character.TYPE) {
                return t.f17309d;
            }
            if (type == Double.TYPE) {
                return t.f17310e;
            }
            if (type == Float.TYPE) {
                return t.f17311f;
            }
            if (type == Integer.TYPE) {
                return t.f17312g;
            }
            if (type == Long.TYPE) {
                return t.f17313h;
            }
            if (type == Short.TYPE) {
                return t.f17314i;
            }
            if (type == Boolean.class) {
                return t.f17307b.nullSafe();
            }
            if (type == Byte.class) {
                return t.f17308c.nullSafe();
            }
            if (type == Character.class) {
                return t.f17309d.nullSafe();
            }
            if (type == Double.class) {
                return t.f17310e.nullSafe();
            }
            if (type == Float.class) {
                return t.f17311f.nullSafe();
            }
            if (type == Integer.class) {
                return t.f17312g.nullSafe();
            }
            if (type == Long.class) {
                return t.f17313h.nullSafe();
            }
            if (type == Short.class) {
                return t.f17314i.nullSafe();
            }
            if (type == String.class) {
                return t.f17315j.nullSafe();
            }
            if (type == Object.class) {
                return new m(rVar).nullSafe();
            }
            Class<?> g2 = u.g(type);
            com.squareup.moshi.f<?> d2 = com.squareup.moshi.w.c.d(rVar, type, g2);
            if (d2 != null) {
                return d2;
            }
            if (g2.isEnum()) {
                return new l(g2).nullSafe();
            }
            return null;
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* loaded from: classes2.dex */
    class d extends com.squareup.moshi.f<Boolean> {
        d() {
        }

        @Override // com.squareup.moshi.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean fromJson(com.squareup.moshi.i iVar) throws IOException {
            return Boolean.valueOf(iVar.J());
        }

        @Override // com.squareup.moshi.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(o oVar, Boolean bool) throws IOException {
            oVar.x0(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* loaded from: classes2.dex */
    class e extends com.squareup.moshi.f<Byte> {
        e() {
        }

        @Override // com.squareup.moshi.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte fromJson(com.squareup.moshi.i iVar) throws IOException {
            return Byte.valueOf((byte) t.a(iVar, "a byte", -128, 255));
        }

        @Override // com.squareup.moshi.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(o oVar, Byte b2) throws IOException {
            oVar.u0(b2.intValue() & 255);
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* loaded from: classes2.dex */
    class f extends com.squareup.moshi.f<Character> {
        f() {
        }

        @Override // com.squareup.moshi.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character fromJson(com.squareup.moshi.i iVar) throws IOException {
            String c0 = iVar.c0();
            if (c0.length() <= 1) {
                return Character.valueOf(c0.charAt(0));
            }
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", "a char", '\"' + c0 + '\"', iVar.c()));
        }

        @Override // com.squareup.moshi.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(o oVar, Character ch) throws IOException {
            oVar.w0(ch.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* loaded from: classes2.dex */
    class g extends com.squareup.moshi.f<Double> {
        g() {
        }

        @Override // com.squareup.moshi.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double fromJson(com.squareup.moshi.i iVar) throws IOException {
            return Double.valueOf(iVar.L());
        }

        @Override // com.squareup.moshi.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(o oVar, Double d2) throws IOException {
            oVar.t0(d2.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* loaded from: classes2.dex */
    class h extends com.squareup.moshi.f<Float> {
        h() {
        }

        @Override // com.squareup.moshi.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float fromJson(com.squareup.moshi.i iVar) throws IOException {
            float L = (float) iVar.L();
            if (!iVar.D() && Float.isInfinite(L)) {
                throw new JsonDataException("JSON forbids NaN and infinities: " + L + " at path " + iVar.c());
            }
            return Float.valueOf(L);
        }

        @Override // com.squareup.moshi.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(o oVar, Float f2) throws IOException {
            f2.getClass();
            oVar.v0(f2);
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* loaded from: classes2.dex */
    class i extends com.squareup.moshi.f<Integer> {
        i() {
        }

        @Override // com.squareup.moshi.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer fromJson(com.squareup.moshi.i iVar) throws IOException {
            return Integer.valueOf(iVar.P());
        }

        @Override // com.squareup.moshi.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(o oVar, Integer num) throws IOException {
            oVar.u0(num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* loaded from: classes2.dex */
    class j extends com.squareup.moshi.f<Long> {
        j() {
        }

        @Override // com.squareup.moshi.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long fromJson(com.squareup.moshi.i iVar) throws IOException {
            return Long.valueOf(iVar.T());
        }

        @Override // com.squareup.moshi.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(o oVar, Long l) throws IOException {
            oVar.u0(l.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* loaded from: classes2.dex */
    class k extends com.squareup.moshi.f<Short> {
        k() {
        }

        @Override // com.squareup.moshi.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Short fromJson(com.squareup.moshi.i iVar) throws IOException {
            return Short.valueOf((short) t.a(iVar, "a short", -32768, 32767));
        }

        @Override // com.squareup.moshi.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(o oVar, Short sh) throws IOException {
            oVar.u0(sh.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* loaded from: classes2.dex */
    static final class l<T extends Enum<T>> extends com.squareup.moshi.f<T> {
        private final Class<T> a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f17316b;

        /* renamed from: c, reason: collision with root package name */
        private final T[] f17317c;

        /* renamed from: d, reason: collision with root package name */
        private final i.a f17318d;

        l(Class<T> cls) {
            this.a = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.f17317c = enumConstants;
                this.f17316b = new String[enumConstants.length];
                int i2 = 0;
                while (true) {
                    T[] tArr = this.f17317c;
                    if (i2 < tArr.length) {
                        String name = tArr[i2].name();
                        this.f17316b[i2] = com.squareup.moshi.w.c.m(name, cls.getField(name));
                        i2++;
                    } else {
                        this.f17318d = i.a.a(this.f17316b);
                        return;
                    }
                }
            } catch (NoSuchFieldException e2) {
                AssertionError assertionError = new AssertionError("Missing field in " + cls.getName());
                assertionError.initCause(e2);
                throw assertionError;
            }
        }

        @Override // com.squareup.moshi.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public T fromJson(com.squareup.moshi.i iVar) throws IOException {
            int t0 = iVar.t0(this.f17318d);
            if (t0 != -1) {
                return this.f17317c[t0];
            }
            String c2 = iVar.c();
            throw new JsonDataException("Expected one of " + Arrays.asList(this.f17316b) + " but was " + iVar.c0() + " at path " + c2);
        }

        @Override // com.squareup.moshi.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(o oVar, T t) throws IOException {
            oVar.w0(this.f17316b[t.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.a.getName() + ")";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* loaded from: classes2.dex */
    static final class m extends com.squareup.moshi.f<Object> {
        private final r a;

        /* renamed from: b, reason: collision with root package name */
        private final com.squareup.moshi.f<List> f17319b;

        /* renamed from: c, reason: collision with root package name */
        private final com.squareup.moshi.f<Map> f17320c;

        /* renamed from: d, reason: collision with root package name */
        private final com.squareup.moshi.f<String> f17321d;

        /* renamed from: e, reason: collision with root package name */
        private final com.squareup.moshi.f<Double> f17322e;

        /* renamed from: f, reason: collision with root package name */
        private final com.squareup.moshi.f<Boolean> f17323f;

        m(r rVar) {
            this.a = rVar;
            this.f17319b = rVar.c(List.class);
            this.f17320c = rVar.c(Map.class);
            this.f17321d = rVar.c(String.class);
            this.f17322e = rVar.c(Double.class);
            this.f17323f = rVar.c(Boolean.class);
        }

        private Class<?> a(Class<?> cls) {
            return Map.class.isAssignableFrom(cls) ? Map.class : Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }

        @Override // com.squareup.moshi.f
        public Object fromJson(com.squareup.moshi.i iVar) throws IOException {
            switch (b.a[iVar.i0().ordinal()]) {
                case 1:
                    return this.f17319b.fromJson(iVar);
                case 2:
                    return this.f17320c.fromJson(iVar);
                case 3:
                    return this.f17321d.fromJson(iVar);
                case 4:
                    return this.f17322e.fromJson(iVar);
                case 5:
                    return this.f17323f.fromJson(iVar);
                case 6:
                    return iVar.Y();
                default:
                    throw new IllegalStateException("Expected a value but was " + iVar.i0() + " at path " + iVar.c());
            }
        }

        @Override // com.squareup.moshi.f
        public void toJson(o oVar, Object obj) throws IOException {
            Class<?> cls = obj.getClass();
            if (cls == Object.class) {
                oVar.b();
                oVar.w();
            } else {
                this.a.e(a(cls), com.squareup.moshi.w.c.a).toJson(oVar, (o) obj);
            }
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    static int a(com.squareup.moshi.i iVar, String str, int i2, int i3) throws IOException {
        int P = iVar.P();
        if (P < i2 || P > i3) {
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(P), iVar.c()));
        }
        return P;
    }
}
