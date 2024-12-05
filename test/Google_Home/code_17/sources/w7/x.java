package w7;

import U6.C1456n;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: i, reason: collision with root package name */
    private static final Map f40492i;

    /* renamed from: a, reason: collision with root package name */
    private final w f40493a;

    /* renamed from: b, reason: collision with root package name */
    private final int f40494b;

    /* renamed from: c, reason: collision with root package name */
    private final int f40495c;

    /* renamed from: d, reason: collision with root package name */
    private final C1456n f40496d;

    /* renamed from: e, reason: collision with root package name */
    private final int f40497e;

    /* renamed from: f, reason: collision with root package name */
    private final String f40498f;

    /* renamed from: g, reason: collision with root package name */
    private final int f40499g;

    /* renamed from: h, reason: collision with root package name */
    private final m f40500h;

    static {
        HashMap hashMap = new HashMap();
        Integer a8 = H7.d.a(1);
        C1456n c1456n = X6.a.f13454c;
        hashMap.put(a8, new x(10, c1456n));
        hashMap.put(H7.d.a(2), new x(16, c1456n));
        hashMap.put(H7.d.a(3), new x(20, c1456n));
        Integer a9 = H7.d.a(4);
        C1456n c1456n2 = X6.a.f13458e;
        hashMap.put(a9, new x(10, c1456n2));
        hashMap.put(H7.d.a(5), new x(16, c1456n2));
        hashMap.put(H7.d.a(6), new x(20, c1456n2));
        Integer a10 = H7.d.a(7);
        C1456n c1456n3 = X6.a.f13474m;
        hashMap.put(a10, new x(10, c1456n3));
        hashMap.put(H7.d.a(8), new x(16, c1456n3));
        hashMap.put(H7.d.a(9), new x(20, c1456n3));
        Integer a11 = H7.d.a(10);
        C1456n c1456n4 = X6.a.f13476n;
        hashMap.put(a11, new x(10, c1456n4));
        hashMap.put(H7.d.a(11), new x(16, c1456n4));
        hashMap.put(H7.d.a(12), new x(20, c1456n4));
        f40492i = DesugarCollections.unmodifiableMap(hashMap);
    }

    public x(int i8, C1456n c1456n) {
        if (i8 < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if (c1456n == null) {
            throw new NullPointerException("digest == null");
        }
        this.f40494b = i8;
        this.f40495c = a();
        String b8 = f.b(c1456n);
        this.f40498f = b8;
        this.f40496d = c1456n;
        m mVar = new m(c1456n);
        this.f40500h = mVar;
        int c8 = mVar.c();
        this.f40499g = c8;
        int d8 = mVar.d();
        this.f40497e = d8;
        this.f40493a = e.c(b8, c8, d8, mVar.a(), i8);
    }

    private int a() {
        int i8 = 2;
        while (true) {
            int i9 = this.f40494b;
            if (i8 <= i9) {
                if ((i9 - i8) % 2 == 0) {
                    return i8;
                }
                i8++;
            } else {
                throw new IllegalStateException("should never happen...");
            }
        }
    }

    public static x k(int i8) {
        return (x) f40492i.get(H7.d.a(i8));
    }

    public int b() {
        return this.f40494b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f40495c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f40500h.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w e() {
        return this.f40493a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String f() {
        return this.f40498f;
    }

    public C1456n g() {
        return this.f40496d;
    }

    public int h() {
        return this.f40499g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k i() {
        return new k(this.f40500h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f40497e;
    }

    public x(int i8, b7.e eVar) {
        this(i8, f.c(eVar.e()));
    }
}
