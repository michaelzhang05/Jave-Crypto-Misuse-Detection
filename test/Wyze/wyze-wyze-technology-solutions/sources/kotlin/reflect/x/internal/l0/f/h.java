package kotlin.reflect.x.internal.l0.f;

import kotlin.jvm.internal.l;

/* compiled from: SpecialNames.kt */
/* loaded from: classes2.dex */
public final class h {
    public static final h a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final f f20725b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f20726c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f20727d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f20728e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f20729f;

    /* renamed from: g, reason: collision with root package name */
    public static final f f20730g;

    /* renamed from: h, reason: collision with root package name */
    public static final f f20731h;

    /* renamed from: i, reason: collision with root package name */
    public static final f f20732i;

    /* renamed from: j, reason: collision with root package name */
    public static final f f20733j;

    /* renamed from: k, reason: collision with root package name */
    public static final f f20734k;
    public static final f l;
    public static final f m;
    public static final f n;

    static {
        f C = f.C("<no name provided>");
        l.e(C, "special(\"<no name provided>\")");
        f20725b = C;
        f C2 = f.C("<root package>");
        l.e(C2, "special(\"<root package>\")");
        f20726c = C2;
        f r = f.r("Companion");
        l.e(r, "identifier(\"Companion\")");
        f20727d = r;
        f r2 = f.r("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
        l.e(r2, "identifier(\"no_name_in_P…_4cd0_b7f5_b46aa3cd5d40\")");
        f20728e = r2;
        f C3 = f.C("<anonymous>");
        l.e(C3, "special(ANONYMOUS_STRING)");
        f20729f = C3;
        f C4 = f.C("<unary>");
        l.e(C4, "special(\"<unary>\")");
        f20730g = C4;
        f C5 = f.C("<this>");
        l.e(C5, "special(\"<this>\")");
        f20731h = C5;
        f C6 = f.C("<init>");
        l.e(C6, "special(\"<init>\")");
        f20732i = C6;
        f C7 = f.C("<iterator>");
        l.e(C7, "special(\"<iterator>\")");
        f20733j = C7;
        f C8 = f.C("<destruct>");
        l.e(C8, "special(\"<destruct>\")");
        f20734k = C8;
        f C9 = f.C("<local>");
        l.e(C9, "special(\"<local>\")");
        l = C9;
        f C10 = f.C("<unused var>");
        l.e(C10, "special(\"<unused var>\")");
        m = C10;
        f C11 = f.C("<set-?>");
        l.e(C11, "special(\"<set-?>\")");
        n = C11;
    }

    private h() {
    }

    public static final f b(f fVar) {
        return (fVar == null || fVar.x()) ? f20728e : fVar;
    }

    public final boolean a(f fVar) {
        l.f(fVar, "name");
        String f2 = fVar.f();
        l.e(f2, "name.asString()");
        return (f2.length() > 0) && !fVar.x();
    }
}
