package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.google.android.gms.internal.measurement.m5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2189m5 {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2189m5 f16717b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2189m5 f16718c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2189m5 f16719d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC2189m5 f16720e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC2189m5 f16721f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC2189m5 f16722g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC2189m5 f16723h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC2189m5 f16724i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC2189m5 f16725j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC2189m5 f16726k;

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumC2189m5[] f16727l;

    /* renamed from: a, reason: collision with root package name */
    private final Class f16728a;

    static {
        EnumC2189m5 enumC2189m5 = new EnumC2189m5("VOID", 0, Void.class, Void.class, null);
        f16717b = enumC2189m5;
        Class cls = Integer.TYPE;
        EnumC2189m5 enumC2189m52 = new EnumC2189m5("INT", 1, cls, Integer.class, 0);
        f16718c = enumC2189m52;
        EnumC2189m5 enumC2189m53 = new EnumC2189m5("LONG", 2, Long.TYPE, Long.class, 0L);
        f16719d = enumC2189m53;
        EnumC2189m5 enumC2189m54 = new EnumC2189m5("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f16720e = enumC2189m54;
        EnumC2189m5 enumC2189m55 = new EnumC2189m5("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f16721f = enumC2189m55;
        EnumC2189m5 enumC2189m56 = new EnumC2189m5("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f16722g = enumC2189m56;
        EnumC2189m5 enumC2189m57 = new EnumC2189m5("STRING", 6, String.class, String.class, "");
        f16723h = enumC2189m57;
        EnumC2189m5 enumC2189m58 = new EnumC2189m5("BYTE_STRING", 7, AbstractC2241s4.class, AbstractC2241s4.class, AbstractC2241s4.f16818b);
        f16724i = enumC2189m58;
        EnumC2189m5 enumC2189m59 = new EnumC2189m5("ENUM", 8, cls, Integer.class, null);
        f16725j = enumC2189m59;
        EnumC2189m5 enumC2189m510 = new EnumC2189m5("MESSAGE", 9, Object.class, Object.class, null);
        f16726k = enumC2189m510;
        f16727l = new EnumC2189m5[]{enumC2189m5, enumC2189m52, enumC2189m53, enumC2189m54, enumC2189m55, enumC2189m56, enumC2189m57, enumC2189m58, enumC2189m59, enumC2189m510};
    }

    private EnumC2189m5(String str, int i8, Class cls, Class cls2, Object obj) {
        this.f16728a = cls2;
    }

    public static EnumC2189m5[] values() {
        return (EnumC2189m5[]) f16727l.clone();
    }

    public final Class a() {
        return this.f16728a;
    }
}
