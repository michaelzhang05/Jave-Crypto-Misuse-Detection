package com.google.android.gms.internal.ads;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class zzdnv {
    private static final zzdnv A;
    private static final zzdnv B;
    private static final zzdnv C;
    private static final zzdnv D;
    private static final zzdnv E;
    private static final zzdnv F;
    private static final zzdnv G;
    private static final zzdnv H;
    private static final zzdnv I;
    private static final zzdnv J;
    private static final zzdnv K;
    private static final zzdnv L;
    private static final zzdnv M;
    private static final zzdnv N;
    public static final zzdnv O;
    private static final zzdnv P;
    private static final zzdnv Q;
    private static final zzdnv R;
    private static final zzdnv S;
    private static final zzdnv T;
    private static final zzdnv U;
    private static final zzdnv V;
    private static final zzdnv W;
    private static final zzdnv X;
    private static final zzdnv Y;
    private static final zzdnv Z;
    private static final zzdnv a0;
    public static final zzdnv b0;
    private static final zzdnv c0;
    private static final zzdnv d0;
    private static final zzdnv[] e0;

    /* renamed from: f, reason: collision with root package name */
    private static final zzdnv f14835f;
    private static final Type[] f0;

    /* renamed from: g, reason: collision with root package name */
    private static final zzdnv f14836g;
    private static final /* synthetic */ zzdnv[] g0;

    /* renamed from: h, reason: collision with root package name */
    private static final zzdnv f14837h;

    /* renamed from: i, reason: collision with root package name */
    private static final zzdnv f14838i;

    /* renamed from: j, reason: collision with root package name */
    private static final zzdnv f14839j;

    /* renamed from: k, reason: collision with root package name */
    private static final zzdnv f14840k;
    private static final zzdnv l;
    private static final zzdnv m;
    private static final zzdnv n;
    private static final zzdnv o;
    private static final zzdnv p;
    private static final zzdnv q;
    private static final zzdnv r;
    private static final zzdnv s;
    private static final zzdnv t;
    private static final zzdnv u;
    private static final zzdnv v;
    private static final zzdnv w;
    private static final zzdnv x;
    private static final zzdnv y;
    private static final zzdnv z;
    private final zzdom h0;
    private final int i0;
    private final cv j0;
    private final Class<?> k0;
    private final boolean l0;

    static {
        cv cvVar = cv.SCALAR;
        zzdom zzdomVar = zzdom.f14864j;
        f14835f = new zzdnv("DOUBLE", 0, 0, cvVar, zzdomVar);
        zzdom zzdomVar2 = zzdom.f14863i;
        f14836g = new zzdnv("FLOAT", 1, 1, cvVar, zzdomVar2);
        zzdom zzdomVar3 = zzdom.f14862h;
        f14837h = new zzdnv("INT64", 2, 2, cvVar, zzdomVar3);
        f14838i = new zzdnv("UINT64", 3, 3, cvVar, zzdomVar3);
        zzdom zzdomVar4 = zzdom.f14861g;
        f14839j = new zzdnv("INT32", 4, 4, cvVar, zzdomVar4);
        f14840k = new zzdnv("FIXED64", 5, 5, cvVar, zzdomVar3);
        l = new zzdnv("FIXED32", 6, 6, cvVar, zzdomVar4);
        zzdom zzdomVar5 = zzdom.f14865k;
        m = new zzdnv("BOOL", 7, 7, cvVar, zzdomVar5);
        zzdom zzdomVar6 = zzdom.l;
        n = new zzdnv("STRING", 8, 8, cvVar, zzdomVar6);
        zzdom zzdomVar7 = zzdom.o;
        o = new zzdnv("MESSAGE", 9, 9, cvVar, zzdomVar7);
        zzdom zzdomVar8 = zzdom.m;
        p = new zzdnv("BYTES", 10, 10, cvVar, zzdomVar8);
        q = new zzdnv("UINT32", 11, 11, cvVar, zzdomVar4);
        zzdom zzdomVar9 = zzdom.n;
        r = new zzdnv("ENUM", 12, 12, cvVar, zzdomVar9);
        s = new zzdnv("SFIXED32", 13, 13, cvVar, zzdomVar4);
        t = new zzdnv("SFIXED64", 14, 14, cvVar, zzdomVar3);
        u = new zzdnv("SINT32", 15, 15, cvVar, zzdomVar4);
        v = new zzdnv("SINT64", 16, 16, cvVar, zzdomVar3);
        w = new zzdnv("GROUP", 17, 17, cvVar, zzdomVar7);
        cv cvVar2 = cv.VECTOR;
        x = new zzdnv("DOUBLE_LIST", 18, 18, cvVar2, zzdomVar);
        y = new zzdnv("FLOAT_LIST", 19, 19, cvVar2, zzdomVar2);
        z = new zzdnv("INT64_LIST", 20, 20, cvVar2, zzdomVar3);
        A = new zzdnv("UINT64_LIST", 21, 21, cvVar2, zzdomVar3);
        B = new zzdnv("INT32_LIST", 22, 22, cvVar2, zzdomVar4);
        C = new zzdnv("FIXED64_LIST", 23, 23, cvVar2, zzdomVar3);
        D = new zzdnv("FIXED32_LIST", 24, 24, cvVar2, zzdomVar4);
        E = new zzdnv("BOOL_LIST", 25, 25, cvVar2, zzdomVar5);
        F = new zzdnv("STRING_LIST", 26, 26, cvVar2, zzdomVar6);
        G = new zzdnv("MESSAGE_LIST", 27, 27, cvVar2, zzdomVar7);
        H = new zzdnv("BYTES_LIST", 28, 28, cvVar2, zzdomVar8);
        I = new zzdnv("UINT32_LIST", 29, 29, cvVar2, zzdomVar4);
        J = new zzdnv("ENUM_LIST", 30, 30, cvVar2, zzdomVar9);
        K = new zzdnv("SFIXED32_LIST", 31, 31, cvVar2, zzdomVar4);
        L = new zzdnv("SFIXED64_LIST", 32, 32, cvVar2, zzdomVar3);
        M = new zzdnv("SINT32_LIST", 33, 33, cvVar2, zzdomVar4);
        N = new zzdnv("SINT64_LIST", 34, 34, cvVar2, zzdomVar3);
        cv cvVar3 = cv.PACKED_VECTOR;
        O = new zzdnv("DOUBLE_LIST_PACKED", 35, 35, cvVar3, zzdomVar);
        P = new zzdnv("FLOAT_LIST_PACKED", 36, 36, cvVar3, zzdomVar2);
        Q = new zzdnv("INT64_LIST_PACKED", 37, 37, cvVar3, zzdomVar3);
        R = new zzdnv("UINT64_LIST_PACKED", 38, 38, cvVar3, zzdomVar3);
        S = new zzdnv("INT32_LIST_PACKED", 39, 39, cvVar3, zzdomVar4);
        T = new zzdnv("FIXED64_LIST_PACKED", 40, 40, cvVar3, zzdomVar3);
        U = new zzdnv("FIXED32_LIST_PACKED", 41, 41, cvVar3, zzdomVar4);
        V = new zzdnv("BOOL_LIST_PACKED", 42, 42, cvVar3, zzdomVar5);
        W = new zzdnv("UINT32_LIST_PACKED", 43, 43, cvVar3, zzdomVar4);
        X = new zzdnv("ENUM_LIST_PACKED", 44, 44, cvVar3, zzdomVar9);
        Y = new zzdnv("SFIXED32_LIST_PACKED", 45, 45, cvVar3, zzdomVar4);
        zzdom zzdomVar10 = zzdom.f14862h;
        Z = new zzdnv("SFIXED64_LIST_PACKED", 46, 46, cvVar3, zzdomVar10);
        a0 = new zzdnv("SINT32_LIST_PACKED", 47, 47, cvVar3, zzdom.f14861g);
        b0 = new zzdnv("SINT64_LIST_PACKED", 48, 48, cvVar3, zzdomVar10);
        c0 = new zzdnv("GROUP_LIST", 49, 49, cvVar2, zzdomVar7);
        d0 = new zzdnv("MAP", 50, 50, cv.MAP, zzdom.f14860f);
        g0 = new zzdnv[]{f14835f, f14836g, f14837h, f14838i, f14839j, f14840k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, a0, b0, c0, d0};
        f0 = new Type[0];
        zzdnv[] values = values();
        e0 = new zzdnv[values.length];
        for (zzdnv zzdnvVar : values) {
            e0[zzdnvVar.i0] = zzdnvVar;
        }
    }

    private zzdnv(String str, int i2, int i3, cv cvVar, zzdom zzdomVar) {
        int i4;
        this.i0 = i3;
        this.j0 = cvVar;
        this.h0 = zzdomVar;
        int i5 = bv.a[cvVar.ordinal()];
        if (i5 == 1) {
            this.k0 = zzdomVar.d();
        } else if (i5 != 2) {
            this.k0 = null;
        } else {
            this.k0 = zzdomVar.d();
        }
        this.l0 = (cvVar != cv.SCALAR || (i4 = bv.f11172b[zzdomVar.ordinal()]) == 1 || i4 == 2 || i4 == 3) ? false : true;
    }

    public static zzdnv[] values() {
        return (zzdnv[]) g0.clone();
    }

    public final int d() {
        return this.i0;
    }
}
