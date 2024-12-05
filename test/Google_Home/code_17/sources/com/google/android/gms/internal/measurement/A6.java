package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public class A6 {

    /* renamed from: c, reason: collision with root package name */
    public static final A6 f16053c;

    /* renamed from: d, reason: collision with root package name */
    public static final A6 f16054d;

    /* renamed from: e, reason: collision with root package name */
    public static final A6 f16055e;

    /* renamed from: f, reason: collision with root package name */
    public static final A6 f16056f;

    /* renamed from: g, reason: collision with root package name */
    public static final A6 f16057g;

    /* renamed from: h, reason: collision with root package name */
    public static final A6 f16058h;

    /* renamed from: i, reason: collision with root package name */
    public static final A6 f16059i;

    /* renamed from: j, reason: collision with root package name */
    public static final A6 f16060j;

    /* renamed from: k, reason: collision with root package name */
    public static final A6 f16061k;

    /* renamed from: l, reason: collision with root package name */
    public static final A6 f16062l;

    /* renamed from: m, reason: collision with root package name */
    public static final A6 f16063m;

    /* renamed from: n, reason: collision with root package name */
    public static final A6 f16064n;

    /* renamed from: o, reason: collision with root package name */
    public static final A6 f16065o;

    /* renamed from: p, reason: collision with root package name */
    public static final A6 f16066p;

    /* renamed from: q, reason: collision with root package name */
    public static final A6 f16067q;

    /* renamed from: r, reason: collision with root package name */
    public static final A6 f16068r;

    /* renamed from: s, reason: collision with root package name */
    public static final A6 f16069s;

    /* renamed from: t, reason: collision with root package name */
    public static final A6 f16070t;

    /* renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ A6[] f16071u;

    /* renamed from: a, reason: collision with root package name */
    private final K6 f16072a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16073b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        A6 a62 = new A6("DOUBLE", 0, K6.DOUBLE, 1);
        f16053c = a62;
        A6 a63 = new A6("FLOAT", 1, K6.FLOAT, 5);
        f16054d = a63;
        K6 k62 = K6.LONG;
        A6 a64 = new A6("INT64", 2, k62, 0);
        f16055e = a64;
        A6 a65 = new A6("UINT64", 3, k62, 0);
        f16056f = a65;
        K6 k63 = K6.INT;
        A6 a66 = new A6("INT32", 4, k63, 0);
        f16057g = a66;
        A6 a67 = new A6("FIXED64", 5, k62, 1);
        f16058h = a67;
        A6 a68 = new A6("FIXED32", 6, k63, 5);
        f16059i = a68;
        A6 a69 = new A6("BOOL", 7, K6.BOOLEAN, 0);
        f16060j = a69;
        int i8 = 2;
        D6 d62 = new D6("STRING", K6.STRING);
        f16061k = d62;
        K6 k64 = K6.MESSAGE;
        F6 f62 = new F6("GROUP", k64);
        f16062l = f62;
        H6 h62 = new H6("MESSAGE", k64);
        f16063m = h62;
        J6 j62 = new J6("BYTES", K6.BYTE_STRING);
        f16064n = j62;
        A6 a610 = new A6("UINT32", 12, k63, 0);
        f16065o = a610;
        A6 a611 = new A6("ENUM", 13, K6.ENUM, 0);
        f16066p = a611;
        A6 a612 = new A6("SFIXED32", 14, k63, 5);
        f16067q = a612;
        A6 a613 = new A6("SFIXED64", 15, k62, 1);
        f16068r = a613;
        A6 a614 = new A6("SINT32", 16, k63, 0);
        f16069s = a614;
        A6 a615 = new A6("SINT64", 17, k62, 0);
        f16070t = a615;
        f16071u = new A6[]{a62, a63, a64, a65, a66, a67, a68, a69, d62, f62, h62, j62, a610, a611, a612, a613, a614, a615};
    }

    public static A6[] values() {
        return (A6[]) f16071u.clone();
    }

    public final K6 a() {
        return this.f16072a;
    }

    private A6(String str, int i8, K6 k62, int i9) {
        this.f16072a = k62;
        this.f16073b = i9;
    }
}
