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
public final class E4 {

    /* renamed from: d, reason: collision with root package name */
    public static final E4 f15303d;

    /* renamed from: e, reason: collision with root package name */
    public static final E4 f15304e;

    /* renamed from: f, reason: collision with root package name */
    public static final E4 f15305f;

    /* renamed from: g, reason: collision with root package name */
    public static final E4 f15306g;

    /* renamed from: h, reason: collision with root package name */
    public static final E4 f15307h;

    /* renamed from: i, reason: collision with root package name */
    public static final E4 f15308i;

    /* renamed from: j, reason: collision with root package name */
    public static final E4 f15309j;

    /* renamed from: k, reason: collision with root package name */
    public static final E4 f15310k;

    /* renamed from: l, reason: collision with root package name */
    public static final E4 f15311l;

    /* renamed from: m, reason: collision with root package name */
    public static final E4 f15312m;

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ E4[] f15313n;

    /* renamed from: a, reason: collision with root package name */
    private final Class f15314a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f15315b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f15316c;

    static {
        E4 e42 = new E4("VOID", 0, Void.class, Void.class, null);
        f15303d = e42;
        Class cls = Integer.TYPE;
        E4 e43 = new E4("INT", 1, cls, Integer.class, 0);
        f15304e = e43;
        E4 e44 = new E4("LONG", 2, Long.TYPE, Long.class, 0L);
        f15305f = e44;
        E4 e45 = new E4("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f15306g = e45;
        E4 e46 = new E4("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f15307h = e46;
        E4 e47 = new E4("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f15308i = e47;
        E4 e48 = new E4("STRING", 6, String.class, String.class, "");
        f15309j = e48;
        E4 e49 = new E4("BYTE_STRING", 7, X3.class, X3.class, X3.f15622b);
        f15310k = e49;
        E4 e410 = new E4("ENUM", 8, cls, Integer.class, null);
        f15311l = e410;
        E4 e411 = new E4("MESSAGE", 9, Object.class, Object.class, null);
        f15312m = e411;
        f15313n = new E4[]{e42, e43, e44, e45, e46, e47, e48, e49, e410, e411};
    }

    private E4(String str, int i8, Class cls, Class cls2, Object obj) {
        this.f15314a = cls;
        this.f15315b = cls2;
        this.f15316c = obj;
    }

    public static E4[] values() {
        return (E4[]) f15313n.clone();
    }

    public final Class a() {
        return this.f15315b;
    }
}
