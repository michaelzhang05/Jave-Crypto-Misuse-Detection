package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class u {
    public static final u A;
    public static final u B;
    public static final u C;
    public static final u D;
    public static final u E;
    public static final u F;
    public static final u G;
    public static final u H;
    public static final u I;
    public static final u J;
    public static final u K;
    public static final u L;
    public static final u M;
    public static final u N;
    public static final u O;
    public static final u P;
    public static final u Q;
    public static final u R;
    public static final u S;
    public static final u T;
    public static final u U;
    public static final u V;
    public static final u W;
    public static final u X;
    public static final u Y;
    public static final u Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final u f5649a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final u f5650b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final u f5651c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final u f5652d0;

    /* renamed from: e0, reason: collision with root package name */
    private static final u[] f5653e0;

    /* renamed from: f, reason: collision with root package name */
    public static final u f5654f;

    /* renamed from: f0, reason: collision with root package name */
    private static final Type[] f5655f0;

    /* renamed from: g, reason: collision with root package name */
    public static final u f5656g;

    /* renamed from: g0, reason: collision with root package name */
    private static final /* synthetic */ u[] f5657g0;

    /* renamed from: h, reason: collision with root package name */
    public static final u f5658h;

    /* renamed from: i, reason: collision with root package name */
    public static final u f5659i;

    /* renamed from: j, reason: collision with root package name */
    public static final u f5660j;

    /* renamed from: k, reason: collision with root package name */
    public static final u f5661k;

    /* renamed from: l, reason: collision with root package name */
    public static final u f5662l;

    /* renamed from: m, reason: collision with root package name */
    public static final u f5663m;

    /* renamed from: n, reason: collision with root package name */
    public static final u f5664n;

    /* renamed from: o, reason: collision with root package name */
    public static final u f5665o;

    /* renamed from: p, reason: collision with root package name */
    public static final u f5666p;

    /* renamed from: q, reason: collision with root package name */
    public static final u f5667q;

    /* renamed from: r, reason: collision with root package name */
    public static final u f5668r;

    /* renamed from: s, reason: collision with root package name */
    public static final u f5669s;

    /* renamed from: t, reason: collision with root package name */
    public static final u f5670t;

    /* renamed from: u, reason: collision with root package name */
    public static final u f5671u;

    /* renamed from: v, reason: collision with root package name */
    public static final u f5672v;

    /* renamed from: w, reason: collision with root package name */
    public static final u f5673w;

    /* renamed from: x, reason: collision with root package name */
    public static final u f5674x;

    /* renamed from: y, reason: collision with root package name */
    public static final u f5675y;

    /* renamed from: z, reason: collision with root package name */
    public static final u f5676z;

    /* renamed from: a, reason: collision with root package name */
    private final b0 f5677a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5678b;

    /* renamed from: c, reason: collision with root package name */
    private final b f5679c;

    /* renamed from: d, reason: collision with root package name */
    private final Class f5680d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f5681e;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5682a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f5683b;

        static {
            int[] iArr = new int[b0.values().length];
            f5683b = iArr;
            try {
                iArr[b0.f5453k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5683b[b0.f5455m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5683b[b0.f5452j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f5682a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5682a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5682a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);


        /* renamed from: a, reason: collision with root package name */
        private final boolean f5689a;

        b(boolean z5) {
            this.f5689a = z5;
        }
    }

    static {
        b bVar = b.SCALAR;
        b0 b0Var = b0.f5450h;
        u uVar = new u("DOUBLE", 0, 0, bVar, b0Var);
        f5654f = uVar;
        b0 b0Var2 = b0.f5449g;
        u uVar2 = new u("FLOAT", 1, 1, bVar, b0Var2);
        f5656g = uVar2;
        b0 b0Var3 = b0.f5448f;
        u uVar3 = new u("INT64", 2, 2, bVar, b0Var3);
        f5658h = uVar3;
        u uVar4 = new u("UINT64", 3, 3, bVar, b0Var3);
        f5659i = uVar4;
        b0 b0Var4 = b0.f5447e;
        u uVar5 = new u("INT32", 4, 4, bVar, b0Var4);
        f5660j = uVar5;
        u uVar6 = new u("FIXED64", 5, 5, bVar, b0Var3);
        f5661k = uVar6;
        u uVar7 = new u("FIXED32", 6, 6, bVar, b0Var4);
        f5662l = uVar7;
        b0 b0Var5 = b0.f5451i;
        u uVar8 = new u("BOOL", 7, 7, bVar, b0Var5);
        f5663m = uVar8;
        b0 b0Var6 = b0.f5452j;
        u uVar9 = new u("STRING", 8, 8, bVar, b0Var6);
        f5664n = uVar9;
        b0 b0Var7 = b0.f5455m;
        u uVar10 = new u("MESSAGE", 9, 9, bVar, b0Var7);
        f5665o = uVar10;
        b0 b0Var8 = b0.f5453k;
        u uVar11 = new u("BYTES", 10, 10, bVar, b0Var8);
        f5666p = uVar11;
        u uVar12 = new u("UINT32", 11, 11, bVar, b0Var4);
        f5667q = uVar12;
        b0 b0Var9 = b0.f5454l;
        u uVar13 = new u("ENUM", 12, 12, bVar, b0Var9);
        f5668r = uVar13;
        u uVar14 = new u("SFIXED32", 13, 13, bVar, b0Var4);
        f5669s = uVar14;
        u uVar15 = new u("SFIXED64", 14, 14, bVar, b0Var3);
        f5670t = uVar15;
        u uVar16 = new u("SINT32", 15, 15, bVar, b0Var4);
        f5671u = uVar16;
        u uVar17 = new u("SINT64", 16, 16, bVar, b0Var3);
        f5672v = uVar17;
        u uVar18 = new u("GROUP", 17, 17, bVar, b0Var7);
        f5673w = uVar18;
        b bVar2 = b.VECTOR;
        u uVar19 = new u("DOUBLE_LIST", 18, 18, bVar2, b0Var);
        f5674x = uVar19;
        u uVar20 = new u("FLOAT_LIST", 19, 19, bVar2, b0Var2);
        f5675y = uVar20;
        u uVar21 = new u("INT64_LIST", 20, 20, bVar2, b0Var3);
        f5676z = uVar21;
        u uVar22 = new u("UINT64_LIST", 21, 21, bVar2, b0Var3);
        A = uVar22;
        u uVar23 = new u("INT32_LIST", 22, 22, bVar2, b0Var4);
        B = uVar23;
        u uVar24 = new u("FIXED64_LIST", 23, 23, bVar2, b0Var3);
        C = uVar24;
        u uVar25 = new u("FIXED32_LIST", 24, 24, bVar2, b0Var4);
        D = uVar25;
        u uVar26 = new u("BOOL_LIST", 25, 25, bVar2, b0Var5);
        E = uVar26;
        u uVar27 = new u("STRING_LIST", 26, 26, bVar2, b0Var6);
        F = uVar27;
        u uVar28 = new u("MESSAGE_LIST", 27, 27, bVar2, b0Var7);
        G = uVar28;
        u uVar29 = new u("BYTES_LIST", 28, 28, bVar2, b0Var8);
        H = uVar29;
        u uVar30 = new u("UINT32_LIST", 29, 29, bVar2, b0Var4);
        I = uVar30;
        u uVar31 = new u("ENUM_LIST", 30, 30, bVar2, b0Var9);
        J = uVar31;
        u uVar32 = new u("SFIXED32_LIST", 31, 31, bVar2, b0Var4);
        K = uVar32;
        u uVar33 = new u("SFIXED64_LIST", 32, 32, bVar2, b0Var3);
        L = uVar33;
        u uVar34 = new u("SINT32_LIST", 33, 33, bVar2, b0Var4);
        M = uVar34;
        u uVar35 = new u("SINT64_LIST", 34, 34, bVar2, b0Var3);
        N = uVar35;
        b bVar3 = b.PACKED_VECTOR;
        u uVar36 = new u("DOUBLE_LIST_PACKED", 35, 35, bVar3, b0Var);
        O = uVar36;
        u uVar37 = new u("FLOAT_LIST_PACKED", 36, 36, bVar3, b0Var2);
        P = uVar37;
        u uVar38 = new u("INT64_LIST_PACKED", 37, 37, bVar3, b0Var3);
        Q = uVar38;
        u uVar39 = new u("UINT64_LIST_PACKED", 38, 38, bVar3, b0Var3);
        R = uVar39;
        u uVar40 = new u("INT32_LIST_PACKED", 39, 39, bVar3, b0Var4);
        S = uVar40;
        u uVar41 = new u("FIXED64_LIST_PACKED", 40, 40, bVar3, b0Var3);
        T = uVar41;
        u uVar42 = new u("FIXED32_LIST_PACKED", 41, 41, bVar3, b0Var4);
        U = uVar42;
        u uVar43 = new u("BOOL_LIST_PACKED", 42, 42, bVar3, b0Var5);
        V = uVar43;
        u uVar44 = new u("UINT32_LIST_PACKED", 43, 43, bVar3, b0Var4);
        W = uVar44;
        u uVar45 = new u("ENUM_LIST_PACKED", 44, 44, bVar3, b0Var9);
        X = uVar45;
        u uVar46 = new u("SFIXED32_LIST_PACKED", 45, 45, bVar3, b0Var4);
        Y = uVar46;
        u uVar47 = new u("SFIXED64_LIST_PACKED", 46, 46, bVar3, b0Var3);
        Z = uVar47;
        u uVar48 = new u("SINT32_LIST_PACKED", 47, 47, bVar3, b0Var4);
        f5649a0 = uVar48;
        u uVar49 = new u("SINT64_LIST_PACKED", 48, 48, bVar3, b0Var3);
        f5650b0 = uVar49;
        u uVar50 = new u("GROUP_LIST", 49, 49, bVar2, b0Var7);
        f5651c0 = uVar50;
        u uVar51 = new u("MAP", 50, 50, b.MAP, b0.f5446d);
        f5652d0 = uVar51;
        f5657g0 = new u[]{uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, uVar13, uVar14, uVar15, uVar16, uVar17, uVar18, uVar19, uVar20, uVar21, uVar22, uVar23, uVar24, uVar25, uVar26, uVar27, uVar28, uVar29, uVar30, uVar31, uVar32, uVar33, uVar34, uVar35, uVar36, uVar37, uVar38, uVar39, uVar40, uVar41, uVar42, uVar43, uVar44, uVar45, uVar46, uVar47, uVar48, uVar49, uVar50, uVar51};
        f5655f0 = new Type[0];
        u[] values = values();
        f5653e0 = new u[values.length];
        for (u uVar52 : values) {
            f5653e0[uVar52.f5678b] = uVar52;
        }
    }

    private u(String str, int i6, int i7, b bVar, b0 b0Var) {
        int i8;
        this.f5678b = i7;
        this.f5679c = bVar;
        this.f5677a = b0Var;
        int i9 = a.f5682a[bVar.ordinal()];
        this.f5680d = (i9 == 1 || i9 == 2) ? b0Var.a() : null;
        this.f5681e = (bVar != b.SCALAR || (i8 = a.f5683b[b0Var.ordinal()]) == 1 || i8 == 2 || i8 == 3) ? false : true;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f5657g0.clone();
    }

    public int a() {
        return this.f5678b;
    }
}
