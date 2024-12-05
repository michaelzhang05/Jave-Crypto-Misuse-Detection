package kotlin.reflect.x.internal.l0.m;

import java.util.Set;
import kotlin.collections.u0;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.text.Regex;

/* compiled from: OperatorNameConventions.kt */
/* loaded from: classes2.dex */
public final class q {
    public static final f A;
    public static final f B;
    public static final f C;
    public static final f D;
    public static final f E;
    public static final f F;
    public static final f G;
    public static final f H;
    public static final f I;
    public static final f J;
    public static final f K;
    public static final f L;
    public static final f M;
    public static final f N;
    public static final f O;
    public static final Set<f> P;
    public static final Set<f> Q;
    public static final Set<f> R;
    public static final Set<f> S;
    public static final Set<f> T;
    public static final q a = new q();

    /* renamed from: b, reason: collision with root package name */
    public static final f f21426b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f21427c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f21428d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f21429e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f21430f;

    /* renamed from: g, reason: collision with root package name */
    public static final f f21431g;

    /* renamed from: h, reason: collision with root package name */
    public static final f f21432h;

    /* renamed from: i, reason: collision with root package name */
    public static final f f21433i;

    /* renamed from: j, reason: collision with root package name */
    public static final f f21434j;

    /* renamed from: k, reason: collision with root package name */
    public static final f f21435k;
    public static final f l;
    public static final f m;
    public static final f n;
    public static final f o;
    public static final Regex p;
    public static final f q;
    public static final f r;
    public static final f s;
    public static final f t;
    public static final f u;
    public static final f v;
    public static final f w;
    public static final f x;
    public static final f y;
    public static final f z;

    static {
        Set<f> g2;
        Set<f> g3;
        Set<f> g4;
        Set<f> g5;
        Set<f> g6;
        f r2 = f.r("getValue");
        l.e(r2, "identifier(\"getValue\")");
        f21426b = r2;
        f r3 = f.r("setValue");
        l.e(r3, "identifier(\"setValue\")");
        f21427c = r3;
        f r4 = f.r("provideDelegate");
        l.e(r4, "identifier(\"provideDelegate\")");
        f21428d = r4;
        f r5 = f.r("equals");
        l.e(r5, "identifier(\"equals\")");
        f21429e = r5;
        f r6 = f.r("hashCode");
        l.e(r6, "identifier(\"hashCode\")");
        f21430f = r6;
        f r7 = f.r("compareTo");
        l.e(r7, "identifier(\"compareTo\")");
        f21431g = r7;
        f r8 = f.r("contains");
        l.e(r8, "identifier(\"contains\")");
        f21432h = r8;
        f r9 = f.r("invoke");
        l.e(r9, "identifier(\"invoke\")");
        f21433i = r9;
        f r10 = f.r("iterator");
        l.e(r10, "identifier(\"iterator\")");
        f21434j = r10;
        f r11 = f.r("get");
        l.e(r11, "identifier(\"get\")");
        f21435k = r11;
        f r12 = f.r("set");
        l.e(r12, "identifier(\"set\")");
        l = r12;
        f r13 = f.r("next");
        l.e(r13, "identifier(\"next\")");
        m = r13;
        f r14 = f.r("hasNext");
        l.e(r14, "identifier(\"hasNext\")");
        n = r14;
        f r15 = f.r("toString");
        l.e(r15, "identifier(\"toString\")");
        o = r15;
        p = new Regex("component\\d+");
        f r16 = f.r("and");
        l.e(r16, "identifier(\"and\")");
        q = r16;
        f r17 = f.r("or");
        l.e(r17, "identifier(\"or\")");
        r = r17;
        f r18 = f.r("xor");
        l.e(r18, "identifier(\"xor\")");
        s = r18;
        f r19 = f.r("inv");
        l.e(r19, "identifier(\"inv\")");
        t = r19;
        f r20 = f.r("shl");
        l.e(r20, "identifier(\"shl\")");
        u = r20;
        f r21 = f.r("shr");
        l.e(r21, "identifier(\"shr\")");
        v = r21;
        f r22 = f.r("ushr");
        l.e(r22, "identifier(\"ushr\")");
        w = r22;
        f r23 = f.r("inc");
        l.e(r23, "identifier(\"inc\")");
        x = r23;
        f r24 = f.r("dec");
        l.e(r24, "identifier(\"dec\")");
        y = r24;
        f r25 = f.r("plus");
        l.e(r25, "identifier(\"plus\")");
        z = r25;
        f r26 = f.r("minus");
        l.e(r26, "identifier(\"minus\")");
        A = r26;
        f r27 = f.r("not");
        l.e(r27, "identifier(\"not\")");
        B = r27;
        f r28 = f.r("unaryMinus");
        l.e(r28, "identifier(\"unaryMinus\")");
        C = r28;
        f r29 = f.r("unaryPlus");
        l.e(r29, "identifier(\"unaryPlus\")");
        D = r29;
        f r30 = f.r("times");
        l.e(r30, "identifier(\"times\")");
        E = r30;
        f r31 = f.r("div");
        l.e(r31, "identifier(\"div\")");
        F = r31;
        f r32 = f.r("mod");
        l.e(r32, "identifier(\"mod\")");
        G = r32;
        f r33 = f.r("rem");
        l.e(r33, "identifier(\"rem\")");
        H = r33;
        f r34 = f.r("rangeTo");
        l.e(r34, "identifier(\"rangeTo\")");
        I = r34;
        f r35 = f.r("timesAssign");
        l.e(r35, "identifier(\"timesAssign\")");
        J = r35;
        f r36 = f.r("divAssign");
        l.e(r36, "identifier(\"divAssign\")");
        K = r36;
        f r37 = f.r("modAssign");
        l.e(r37, "identifier(\"modAssign\")");
        L = r37;
        f r38 = f.r("remAssign");
        l.e(r38, "identifier(\"remAssign\")");
        M = r38;
        f r39 = f.r("plusAssign");
        l.e(r39, "identifier(\"plusAssign\")");
        N = r39;
        f r40 = f.r("minusAssign");
        l.e(r40, "identifier(\"minusAssign\")");
        O = r40;
        g2 = u0.g(r23, r24, r29, r28, r27, r19);
        P = g2;
        g3 = u0.g(r29, r28, r27, r19);
        Q = g3;
        g4 = u0.g(r30, r25, r26, r31, r32, r33, r34);
        R = g4;
        g5 = u0.g(r35, r36, r37, r38, r39, r40);
        S = g5;
        g6 = u0.g(r2, r3, r4);
        T = g6;
    }

    private q() {
    }
}
