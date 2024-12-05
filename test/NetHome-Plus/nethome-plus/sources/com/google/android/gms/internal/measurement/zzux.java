package com.google.android.gms.internal.measurement;

import okhttp3.HttpUrl;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'g' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class zzux {

    /* renamed from: f, reason: collision with root package name */
    public static final zzux f16142f;

    /* renamed from: g, reason: collision with root package name */
    public static final zzux f16143g;

    /* renamed from: h, reason: collision with root package name */
    public static final zzux f16144h;

    /* renamed from: i, reason: collision with root package name */
    public static final zzux f16145i;

    /* renamed from: j, reason: collision with root package name */
    public static final zzux f16146j;

    /* renamed from: k, reason: collision with root package name */
    public static final zzux f16147k;
    public static final zzux l;
    public static final zzux m;
    public static final zzux n;
    public static final zzux o;
    private static final /* synthetic */ zzux[] p;
    private final Class<?> q;
    private final Class<?> r;
    private final Object s;

    static {
        zzux zzuxVar = new zzux("VOID", 0, Void.class, Void.class, null);
        f16142f = zzuxVar;
        Class cls = Integer.TYPE;
        zzux zzuxVar2 = new zzux("INT", 1, cls, Integer.class, 0);
        f16143g = zzuxVar2;
        zzux zzuxVar3 = new zzux("LONG", 2, Long.TYPE, Long.class, 0L);
        f16144h = zzuxVar3;
        zzux zzuxVar4 = new zzux("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f16145i = zzuxVar4;
        zzux zzuxVar5 = new zzux("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f16146j = zzuxVar5;
        zzux zzuxVar6 = new zzux("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f16147k = zzuxVar6;
        zzux zzuxVar7 = new zzux("STRING", 6, String.class, String.class, HttpUrl.FRAGMENT_ENCODE_SET);
        l = zzuxVar7;
        zzux zzuxVar8 = new zzux("BYTE_STRING", 7, zzte.class, zzte.class, zzte.f16104f);
        m = zzuxVar8;
        zzux zzuxVar9 = new zzux("ENUM", 8, cls, Integer.class, null);
        n = zzuxVar9;
        zzux zzuxVar10 = new zzux("MESSAGE", 9, Object.class, Object.class, null);
        o = zzuxVar10;
        p = new zzux[]{zzuxVar, zzuxVar2, zzuxVar3, zzuxVar4, zzuxVar5, zzuxVar6, zzuxVar7, zzuxVar8, zzuxVar9, zzuxVar10};
    }

    private zzux(String str, int i2, Class cls, Class cls2, Object obj) {
        this.q = cls;
        this.r = cls2;
        this.s = obj;
    }

    public static zzux[] values() {
        return (zzux[]) p.clone();
    }

    public final Class<?> d() {
        return this.r;
    }
}
