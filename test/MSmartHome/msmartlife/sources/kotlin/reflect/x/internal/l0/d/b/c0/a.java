package kotlin.reflect.x.internal.l0.d.b.c0;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.m;
import kotlin.collections.n0;
import kotlin.collections.t;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.ranges.f;
import kotlin.reflect.x.internal.l0.e.a0.b.e;

/* compiled from: KotlinClassHeader.kt */
/* loaded from: classes2.dex */
public final class a {
    private final EnumC0304a a;

    /* renamed from: b, reason: collision with root package name */
    private final e f20265b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f20266c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f20267d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f20268e;

    /* renamed from: f, reason: collision with root package name */
    private final String f20269f;

    /* renamed from: g, reason: collision with root package name */
    private final int f20270g;

    /* renamed from: h, reason: collision with root package name */
    private final String f20271h;

    /* renamed from: i, reason: collision with root package name */
    private final byte[] f20272i;

    /* compiled from: KotlinClassHeader.kt */
    /* renamed from: kotlin.f0.x.e.l0.d.b.c0.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0304a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);


        /* renamed from: f, reason: collision with root package name */
        public static final C0305a f20273f = new C0305a(null);

        /* renamed from: g, reason: collision with root package name */
        private static final Map<Integer, EnumC0304a> f20274g;
        private final int o;

        /* compiled from: KotlinClassHeader.kt */
        /* renamed from: kotlin.f0.x.e.l0.d.b.c0.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0305a {
            private C0305a() {
            }

            public /* synthetic */ C0305a(g gVar) {
                this();
            }

            public final EnumC0304a a(int i2) {
                EnumC0304a enumC0304a = (EnumC0304a) EnumC0304a.f20274g.get(Integer.valueOf(i2));
                return enumC0304a == null ? EnumC0304a.UNKNOWN : enumC0304a;
            }
        }

        static {
            int e2;
            int b2;
            EnumC0304a[] values = values();
            e2 = n0.e(values.length);
            b2 = f.b(e2, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(b2);
            for (EnumC0304a enumC0304a : values) {
                linkedHashMap.put(Integer.valueOf(enumC0304a.o), enumC0304a);
            }
            f20274g = linkedHashMap;
        }

        EnumC0304a(int i2) {
            this.o = i2;
        }

        public static final EnumC0304a i(int i2) {
            return f20273f.a(i2);
        }
    }

    public a(EnumC0304a enumC0304a, e eVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i2, String str2, byte[] bArr) {
        l.f(enumC0304a, "kind");
        l.f(eVar, "metadataVersion");
        this.a = enumC0304a;
        this.f20265b = eVar;
        this.f20266c = strArr;
        this.f20267d = strArr2;
        this.f20268e = strArr3;
        this.f20269f = str;
        this.f20270g = i2;
        this.f20271h = str2;
        this.f20272i = bArr;
    }

    private final boolean h(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    public final String[] a() {
        return this.f20266c;
    }

    public final String[] b() {
        return this.f20267d;
    }

    public final EnumC0304a c() {
        return this.a;
    }

    public final e d() {
        return this.f20265b;
    }

    public final String e() {
        String str = this.f20269f;
        if (this.a == EnumC0304a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    public final List<String> f() {
        List<String> i2;
        String[] strArr = this.f20266c;
        if (!(this.a == EnumC0304a.MULTIFILE_CLASS)) {
            strArr = null;
        }
        List<String> c2 = strArr != null ? m.c(strArr) : null;
        if (c2 != null) {
            return c2;
        }
        i2 = t.i();
        return i2;
    }

    public final String[] g() {
        return this.f20268e;
    }

    public final boolean i() {
        return h(this.f20270g, 2);
    }

    public final boolean j() {
        return h(this.f20270g, 64) && !h(this.f20270g, 32);
    }

    public final boolean k() {
        return h(this.f20270g, 16) && !h(this.f20270g, 32);
    }

    public String toString() {
        return this.a + " version=" + this.f20265b;
    }
}
