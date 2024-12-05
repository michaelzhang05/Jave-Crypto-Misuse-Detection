package l7;

import R6.C1347n;
import java.util.HashMap;
import java.util.Map;

/* renamed from: l7.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3372e {

    /* renamed from: h, reason: collision with root package name */
    public static final C3372e f34815h;

    /* renamed from: i, reason: collision with root package name */
    public static final C3372e f34816i;

    /* renamed from: j, reason: collision with root package name */
    public static final C3372e f34817j;

    /* renamed from: k, reason: collision with root package name */
    public static final C3372e f34818k;

    /* renamed from: l, reason: collision with root package name */
    private static final Map f34819l;

    /* renamed from: a, reason: collision with root package name */
    private final int f34820a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34821b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34822c;

    /* renamed from: d, reason: collision with root package name */
    private final int f34823d;

    /* renamed from: e, reason: collision with root package name */
    private final int f34824e;

    /* renamed from: f, reason: collision with root package name */
    private final int f34825f;

    /* renamed from: g, reason: collision with root package name */
    private final C1347n f34826g;

    /* renamed from: l7.e$a */
    /* loaded from: classes5.dex */
    static class a extends HashMap {
        a() {
            C3372e c3372e = C3372e.f34815h;
            put(Integer.valueOf(c3372e.f34820a), c3372e);
            C3372e c3372e2 = C3372e.f34816i;
            put(Integer.valueOf(c3372e2.f34820a), c3372e2);
            C3372e c3372e3 = C3372e.f34817j;
            put(Integer.valueOf(c3372e3.f34820a), c3372e3);
            C3372e c3372e4 = C3372e.f34818k;
            put(Integer.valueOf(c3372e4.f34820a), c3372e4);
        }
    }

    static {
        C1347n c1347n = U6.a.f11784c;
        f34815h = new C3372e(1, 32, 1, 265, 7, 8516, c1347n);
        f34816i = new C3372e(2, 32, 2, 133, 6, 4292, c1347n);
        f34817j = new C3372e(3, 32, 4, 67, 4, 2180, c1347n);
        f34818k = new C3372e(4, 32, 8, 34, 0, 1124, c1347n);
        f34819l = new a();
    }

    protected C3372e(int i8, int i9, int i10, int i11, int i12, int i13, C1347n c1347n) {
        this.f34820a = i8;
        this.f34821b = i9;
        this.f34822c = i10;
        this.f34823d = i11;
        this.f34824e = i12;
        this.f34825f = i13;
        this.f34826g = c1347n;
    }

    public static C3372e e(int i8) {
        return (C3372e) f34819l.get(Integer.valueOf(i8));
    }

    public C1347n b() {
        return this.f34826g;
    }

    public int c() {
        return this.f34821b;
    }

    public int d() {
        return this.f34823d;
    }

    public int f() {
        return this.f34820a;
    }

    public int g() {
        return this.f34822c;
    }
}
