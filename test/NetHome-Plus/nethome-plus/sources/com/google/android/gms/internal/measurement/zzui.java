package com.google.android.gms.internal.measurement;

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
public final class zzui {
    private static final zzui A;
    private static final zzui B;
    private static final zzui C;
    private static final zzui D;
    private static final zzui E;
    private static final zzui F;
    private static final zzui G;
    private static final zzui H;
    private static final zzui I;
    private static final zzui J;
    private static final zzui K;
    private static final zzui L;
    private static final zzui M;
    private static final zzui N;
    public static final zzui O;
    private static final zzui P;
    private static final zzui Q;
    private static final zzui R;
    private static final zzui S;
    private static final zzui T;
    private static final zzui U;
    private static final zzui V;
    private static final zzui W;
    private static final zzui X;
    private static final zzui Y;
    private static final zzui Z;
    private static final zzui a0;
    public static final zzui b0;
    private static final zzui c0;
    private static final zzui d0;
    private static final zzui[] e0;

    /* renamed from: f, reason: collision with root package name */
    private static final zzui f16118f;
    private static final Type[] f0;

    /* renamed from: g, reason: collision with root package name */
    private static final zzui f16119g;
    private static final /* synthetic */ zzui[] g0;

    /* renamed from: h, reason: collision with root package name */
    private static final zzui f16120h;

    /* renamed from: i, reason: collision with root package name */
    private static final zzui f16121i;

    /* renamed from: j, reason: collision with root package name */
    private static final zzui f16122j;

    /* renamed from: k, reason: collision with root package name */
    private static final zzui f16123k;
    private static final zzui l;
    private static final zzui m;
    private static final zzui n;
    private static final zzui o;
    private static final zzui p;
    private static final zzui q;
    private static final zzui r;
    private static final zzui s;
    private static final zzui t;
    private static final zzui u;
    private static final zzui v;
    private static final zzui w;
    private static final zzui x;
    private static final zzui y;
    private static final zzui z;
    private final zzux h0;
    private final int i0;
    private final b1 j0;
    private final Class<?> k0;
    private final boolean l0;

    static {
        b1 b1Var = b1.SCALAR;
        zzux zzuxVar = zzux.f16146j;
        f16118f = new zzui("DOUBLE", 0, 0, b1Var, zzuxVar);
        zzux zzuxVar2 = zzux.f16145i;
        f16119g = new zzui("FLOAT", 1, 1, b1Var, zzuxVar2);
        zzux zzuxVar3 = zzux.f16144h;
        f16120h = new zzui("INT64", 2, 2, b1Var, zzuxVar3);
        f16121i = new zzui("UINT64", 3, 3, b1Var, zzuxVar3);
        zzux zzuxVar4 = zzux.f16143g;
        f16122j = new zzui("INT32", 4, 4, b1Var, zzuxVar4);
        f16123k = new zzui("FIXED64", 5, 5, b1Var, zzuxVar3);
        l = new zzui("FIXED32", 6, 6, b1Var, zzuxVar4);
        zzux zzuxVar5 = zzux.f16147k;
        m = new zzui("BOOL", 7, 7, b1Var, zzuxVar5);
        zzux zzuxVar6 = zzux.l;
        n = new zzui("STRING", 8, 8, b1Var, zzuxVar6);
        zzux zzuxVar7 = zzux.o;
        o = new zzui("MESSAGE", 9, 9, b1Var, zzuxVar7);
        zzux zzuxVar8 = zzux.m;
        p = new zzui("BYTES", 10, 10, b1Var, zzuxVar8);
        q = new zzui("UINT32", 11, 11, b1Var, zzuxVar4);
        zzux zzuxVar9 = zzux.n;
        r = new zzui("ENUM", 12, 12, b1Var, zzuxVar9);
        s = new zzui("SFIXED32", 13, 13, b1Var, zzuxVar4);
        t = new zzui("SFIXED64", 14, 14, b1Var, zzuxVar3);
        u = new zzui("SINT32", 15, 15, b1Var, zzuxVar4);
        v = new zzui("SINT64", 16, 16, b1Var, zzuxVar3);
        w = new zzui("GROUP", 17, 17, b1Var, zzuxVar7);
        b1 b1Var2 = b1.VECTOR;
        x = new zzui("DOUBLE_LIST", 18, 18, b1Var2, zzuxVar);
        y = new zzui("FLOAT_LIST", 19, 19, b1Var2, zzuxVar2);
        z = new zzui("INT64_LIST", 20, 20, b1Var2, zzuxVar3);
        A = new zzui("UINT64_LIST", 21, 21, b1Var2, zzuxVar3);
        B = new zzui("INT32_LIST", 22, 22, b1Var2, zzuxVar4);
        C = new zzui("FIXED64_LIST", 23, 23, b1Var2, zzuxVar3);
        D = new zzui("FIXED32_LIST", 24, 24, b1Var2, zzuxVar4);
        E = new zzui("BOOL_LIST", 25, 25, b1Var2, zzuxVar5);
        F = new zzui("STRING_LIST", 26, 26, b1Var2, zzuxVar6);
        G = new zzui("MESSAGE_LIST", 27, 27, b1Var2, zzuxVar7);
        H = new zzui("BYTES_LIST", 28, 28, b1Var2, zzuxVar8);
        I = new zzui("UINT32_LIST", 29, 29, b1Var2, zzuxVar4);
        J = new zzui("ENUM_LIST", 30, 30, b1Var2, zzuxVar9);
        K = new zzui("SFIXED32_LIST", 31, 31, b1Var2, zzuxVar4);
        L = new zzui("SFIXED64_LIST", 32, 32, b1Var2, zzuxVar3);
        M = new zzui("SINT32_LIST", 33, 33, b1Var2, zzuxVar4);
        N = new zzui("SINT64_LIST", 34, 34, b1Var2, zzuxVar3);
        b1 b1Var3 = b1.PACKED_VECTOR;
        O = new zzui("DOUBLE_LIST_PACKED", 35, 35, b1Var3, zzuxVar);
        P = new zzui("FLOAT_LIST_PACKED", 36, 36, b1Var3, zzuxVar2);
        Q = new zzui("INT64_LIST_PACKED", 37, 37, b1Var3, zzuxVar3);
        R = new zzui("UINT64_LIST_PACKED", 38, 38, b1Var3, zzuxVar3);
        S = new zzui("INT32_LIST_PACKED", 39, 39, b1Var3, zzuxVar4);
        T = new zzui("FIXED64_LIST_PACKED", 40, 40, b1Var3, zzuxVar3);
        U = new zzui("FIXED32_LIST_PACKED", 41, 41, b1Var3, zzuxVar4);
        V = new zzui("BOOL_LIST_PACKED", 42, 42, b1Var3, zzuxVar5);
        W = new zzui("UINT32_LIST_PACKED", 43, 43, b1Var3, zzuxVar4);
        X = new zzui("ENUM_LIST_PACKED", 44, 44, b1Var3, zzuxVar9);
        Y = new zzui("SFIXED32_LIST_PACKED", 45, 45, b1Var3, zzuxVar4);
        zzux zzuxVar10 = zzux.f16144h;
        Z = new zzui("SFIXED64_LIST_PACKED", 46, 46, b1Var3, zzuxVar10);
        a0 = new zzui("SINT32_LIST_PACKED", 47, 47, b1Var3, zzux.f16143g);
        b0 = new zzui("SINT64_LIST_PACKED", 48, 48, b1Var3, zzuxVar10);
        c0 = new zzui("GROUP_LIST", 49, 49, b1Var2, zzuxVar7);
        d0 = new zzui("MAP", 50, 50, b1.MAP, zzux.f16142f);
        g0 = new zzui[]{f16118f, f16119g, f16120h, f16121i, f16122j, f16123k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, a0, b0, c0, d0};
        f0 = new Type[0];
        zzui[] values = values();
        e0 = new zzui[values.length];
        for (zzui zzuiVar : values) {
            e0[zzuiVar.i0] = zzuiVar;
        }
    }

    private zzui(String str, int i2, int i3, b1 b1Var, zzux zzuxVar) {
        int i4;
        this.i0 = i3;
        this.j0 = b1Var;
        this.h0 = zzuxVar;
        int i5 = a1.a[b1Var.ordinal()];
        if (i5 == 1) {
            this.k0 = zzuxVar.d();
        } else if (i5 != 2) {
            this.k0 = null;
        } else {
            this.k0 = zzuxVar.d();
        }
        this.l0 = (b1Var != b1.SCALAR || (i4 = a1.f15925b[zzuxVar.ordinal()]) == 1 || i4 == 2 || i4 == 3) ? false : true;
    }

    public static zzui[] values() {
        return (zzui[]) g0.clone();
    }

    public final int d() {
        return this.i0;
    }
}
