package o7;

import U6.C1456n;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o7.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3727k {

    /* renamed from: e, reason: collision with root package name */
    public static final C3727k f36868e;

    /* renamed from: f, reason: collision with root package name */
    public static final C3727k f36869f;

    /* renamed from: g, reason: collision with root package name */
    public static final C3727k f36870g;

    /* renamed from: h, reason: collision with root package name */
    public static final C3727k f36871h;

    /* renamed from: i, reason: collision with root package name */
    public static final C3727k f36872i;

    /* renamed from: j, reason: collision with root package name */
    private static Map f36873j;

    /* renamed from: a, reason: collision with root package name */
    private final int f36874a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36875b;

    /* renamed from: c, reason: collision with root package name */
    private final int f36876c;

    /* renamed from: d, reason: collision with root package name */
    private final C1456n f36877d;

    /* renamed from: o7.k$a */
    /* loaded from: classes5.dex */
    static class a extends HashMap {
        a() {
            C3727k c3727k = C3727k.f36868e;
            put(Integer.valueOf(c3727k.f36874a), c3727k);
            C3727k c3727k2 = C3727k.f36869f;
            put(Integer.valueOf(c3727k2.f36874a), c3727k2);
            C3727k c3727k3 = C3727k.f36870g;
            put(Integer.valueOf(c3727k3.f36874a), c3727k3);
            C3727k c3727k4 = C3727k.f36871h;
            put(Integer.valueOf(c3727k4.f36874a), c3727k4);
            C3727k c3727k5 = C3727k.f36872i;
            put(Integer.valueOf(c3727k5.f36874a), c3727k5);
        }
    }

    static {
        C1456n c1456n = X6.a.f13454c;
        f36868e = new C3727k(5, 32, 5, c1456n);
        f36869f = new C3727k(6, 32, 10, c1456n);
        f36870g = new C3727k(7, 32, 15, c1456n);
        f36871h = new C3727k(8, 32, 20, c1456n);
        f36872i = new C3727k(9, 32, 25, c1456n);
        f36873j = new a();
    }

    protected C3727k(int i8, int i9, int i10, C1456n c1456n) {
        this.f36874a = i8;
        this.f36875b = i9;
        this.f36876c = i10;
        this.f36877d = c1456n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C3727k e(int i8) {
        return (C3727k) f36873j.get(Integer.valueOf(i8));
    }

    public C1456n b() {
        return this.f36877d;
    }

    public int c() {
        return this.f36876c;
    }

    public int d() {
        return this.f36875b;
    }

    public int f() {
        return this.f36874a;
    }
}
