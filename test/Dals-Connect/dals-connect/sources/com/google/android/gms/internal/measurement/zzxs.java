package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'h' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public class zzxs {

    /* renamed from: f, reason: collision with root package name */
    public static final zzxs f16163f;

    /* renamed from: g, reason: collision with root package name */
    public static final zzxs f16164g;

    /* renamed from: h, reason: collision with root package name */
    public static final zzxs f16165h;

    /* renamed from: i, reason: collision with root package name */
    public static final zzxs f16166i;

    /* renamed from: j, reason: collision with root package name */
    public static final zzxs f16167j;

    /* renamed from: k, reason: collision with root package name */
    public static final zzxs f16168k;
    public static final zzxs l;
    public static final zzxs m;
    public static final zzxs n;
    public static final zzxs o;
    public static final zzxs p;
    public static final zzxs q;
    public static final zzxs r;
    public static final zzxs s;
    public static final zzxs t;
    public static final zzxs u;
    public static final zzxs v;
    public static final zzxs w;
    private static final /* synthetic */ zzxs[] x;
    private final zzxx y;
    private final int z;

    static {
        zzxs zzxsVar = new zzxs("DOUBLE", 0, zzxx.DOUBLE, 1);
        f16163f = zzxsVar;
        zzxs zzxsVar2 = new zzxs("FLOAT", 1, zzxx.FLOAT, 5);
        f16164g = zzxsVar2;
        zzxx zzxxVar = zzxx.LONG;
        final int i2 = 2;
        zzxs zzxsVar3 = new zzxs("INT64", 2, zzxxVar, 0);
        f16165h = zzxsVar3;
        final int i3 = 3;
        zzxs zzxsVar4 = new zzxs("UINT64", 3, zzxxVar, 0);
        f16166i = zzxsVar4;
        zzxx zzxxVar2 = zzxx.INT;
        zzxs zzxsVar5 = new zzxs("INT32", 4, zzxxVar2, 0);
        f16167j = zzxsVar5;
        zzxs zzxsVar6 = new zzxs("FIXED64", 5, zzxxVar, 1);
        f16168k = zzxsVar6;
        zzxs zzxsVar7 = new zzxs("FIXED32", 6, zzxxVar2, 5);
        l = zzxsVar7;
        zzxs zzxsVar8 = new zzxs("BOOL", 7, zzxx.BOOLEAN, 0);
        m = zzxsVar8;
        final zzxx zzxxVar3 = zzxx.STRING;
        final String str = "STRING";
        final int i4 = 8;
        zzxs zzxsVar9 = new zzxs(str, i4, zzxxVar3, i2) { // from class: com.google.android.gms.internal.measurement.h3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                int i5 = 8;
                int i6 = 2;
            }
        };
        n = zzxsVar9;
        final zzxx zzxxVar4 = zzxx.MESSAGE;
        final String str2 = "GROUP";
        final int i5 = 9;
        zzxs zzxsVar10 = new zzxs(str2, i5, zzxxVar4, i3) { // from class: com.google.android.gms.internal.measurement.i3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                int i6 = 9;
                int i7 = 3;
            }
        };
        o = zzxsVar10;
        final String str3 = "MESSAGE";
        final int i6 = 10;
        final int i7 = 2;
        zzxs zzxsVar11 = new zzxs(str3, i6, zzxxVar4, i7) { // from class: com.google.android.gms.internal.measurement.j3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                int i8 = 10;
                int i9 = 2;
            }
        };
        p = zzxsVar11;
        final zzxx zzxxVar5 = zzxx.BYTE_STRING;
        final String str4 = "BYTES";
        final int i8 = 11;
        zzxs zzxsVar12 = new zzxs(str4, i8, zzxxVar5, i7) { // from class: com.google.android.gms.internal.measurement.k3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                int i9 = 11;
                int i10 = 2;
            }
        };
        q = zzxsVar12;
        zzxs zzxsVar13 = new zzxs("UINT32", 12, zzxxVar2, 0);
        r = zzxsVar13;
        zzxs zzxsVar14 = new zzxs("ENUM", 13, zzxx.ENUM, 0);
        s = zzxsVar14;
        zzxs zzxsVar15 = new zzxs("SFIXED32", 14, zzxxVar2, 5);
        t = zzxsVar15;
        zzxs zzxsVar16 = new zzxs("SFIXED64", 15, zzxxVar, 1);
        u = zzxsVar16;
        zzxs zzxsVar17 = new zzxs("SINT32", 16, zzxxVar2, 0);
        v = zzxsVar17;
        zzxs zzxsVar18 = new zzxs("SINT64", 17, zzxxVar, 0);
        w = zzxsVar18;
        x = new zzxs[]{zzxsVar, zzxsVar2, zzxsVar3, zzxsVar4, zzxsVar5, zzxsVar6, zzxsVar7, zzxsVar8, zzxsVar9, zzxsVar10, zzxsVar11, zzxsVar12, zzxsVar13, zzxsVar14, zzxsVar15, zzxsVar16, zzxsVar17, zzxsVar18};
    }

    private zzxs(String str, int i2, zzxx zzxxVar, int i3) {
        this.y = zzxxVar;
        this.z = i3;
    }

    public static zzxs[] values() {
        return (zzxs[]) x.clone();
    }

    public final zzxx d() {
        return this.y;
    }
}
