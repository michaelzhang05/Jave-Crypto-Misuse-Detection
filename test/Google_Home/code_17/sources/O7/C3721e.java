package o7;

import U6.C1456n;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o7.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3721e {

    /* renamed from: h, reason: collision with root package name */
    public static final C3721e f36832h;

    /* renamed from: i, reason: collision with root package name */
    public static final C3721e f36833i;

    /* renamed from: j, reason: collision with root package name */
    public static final C3721e f36834j;

    /* renamed from: k, reason: collision with root package name */
    public static final C3721e f36835k;

    /* renamed from: l, reason: collision with root package name */
    private static final Map f36836l;

    /* renamed from: a, reason: collision with root package name */
    private final int f36837a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36838b;

    /* renamed from: c, reason: collision with root package name */
    private final int f36839c;

    /* renamed from: d, reason: collision with root package name */
    private final int f36840d;

    /* renamed from: e, reason: collision with root package name */
    private final int f36841e;

    /* renamed from: f, reason: collision with root package name */
    private final int f36842f;

    /* renamed from: g, reason: collision with root package name */
    private final C1456n f36843g;

    /* renamed from: o7.e$a */
    /* loaded from: classes5.dex */
    static class a extends HashMap {
        a() {
            C3721e c3721e = C3721e.f36832h;
            put(Integer.valueOf(c3721e.f36837a), c3721e);
            C3721e c3721e2 = C3721e.f36833i;
            put(Integer.valueOf(c3721e2.f36837a), c3721e2);
            C3721e c3721e3 = C3721e.f36834j;
            put(Integer.valueOf(c3721e3.f36837a), c3721e3);
            C3721e c3721e4 = C3721e.f36835k;
            put(Integer.valueOf(c3721e4.f36837a), c3721e4);
        }
    }

    static {
        C1456n c1456n = X6.a.f13454c;
        f36832h = new C3721e(1, 32, 1, 265, 7, 8516, c1456n);
        f36833i = new C3721e(2, 32, 2, 133, 6, 4292, c1456n);
        f36834j = new C3721e(3, 32, 4, 67, 4, 2180, c1456n);
        f36835k = new C3721e(4, 32, 8, 34, 0, 1124, c1456n);
        f36836l = new a();
    }

    protected C3721e(int i8, int i9, int i10, int i11, int i12, int i13, C1456n c1456n) {
        this.f36837a = i8;
        this.f36838b = i9;
        this.f36839c = i10;
        this.f36840d = i11;
        this.f36841e = i12;
        this.f36842f = i13;
        this.f36843g = c1456n;
    }

    public static C3721e e(int i8) {
        return (C3721e) f36836l.get(Integer.valueOf(i8));
    }

    public C1456n b() {
        return this.f36843g;
    }

    public int c() {
        return this.f36838b;
    }

    public int d() {
        return this.f36840d;
    }

    public int f() {
        return this.f36837a;
    }

    public int g() {
        return this.f36839c;
    }
}
