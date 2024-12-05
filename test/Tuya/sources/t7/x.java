package t7;

import R6.C1347n;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: i, reason: collision with root package name */
    private static final Map f38365i;

    /* renamed from: a, reason: collision with root package name */
    private final w f38366a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38367b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38368c;

    /* renamed from: d, reason: collision with root package name */
    private final C1347n f38369d;

    /* renamed from: e, reason: collision with root package name */
    private final int f38370e;

    /* renamed from: f, reason: collision with root package name */
    private final String f38371f;

    /* renamed from: g, reason: collision with root package name */
    private final int f38372g;

    /* renamed from: h, reason: collision with root package name */
    private final m f38373h;

    static {
        HashMap hashMap = new HashMap();
        Integer a8 = E7.d.a(1);
        C1347n c1347n = U6.a.f11784c;
        hashMap.put(a8, new x(10, c1347n));
        hashMap.put(E7.d.a(2), new x(16, c1347n));
        hashMap.put(E7.d.a(3), new x(20, c1347n));
        Integer a9 = E7.d.a(4);
        C1347n c1347n2 = U6.a.f11788e;
        hashMap.put(a9, new x(10, c1347n2));
        hashMap.put(E7.d.a(5), new x(16, c1347n2));
        hashMap.put(E7.d.a(6), new x(20, c1347n2));
        Integer a10 = E7.d.a(7);
        C1347n c1347n3 = U6.a.f11804m;
        hashMap.put(a10, new x(10, c1347n3));
        hashMap.put(E7.d.a(8), new x(16, c1347n3));
        hashMap.put(E7.d.a(9), new x(20, c1347n3));
        Integer a11 = E7.d.a(10);
        C1347n c1347n4 = U6.a.f11806n;
        hashMap.put(a11, new x(10, c1347n4));
        hashMap.put(E7.d.a(11), new x(16, c1347n4));
        hashMap.put(E7.d.a(12), new x(20, c1347n4));
        f38365i = DesugarCollections.unmodifiableMap(hashMap);
    }

    public x(int i8, C1347n c1347n) {
        if (i8 < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if (c1347n == null) {
            throw new NullPointerException("digest == null");
        }
        this.f38367b = i8;
        this.f38368c = a();
        String b8 = f.b(c1347n);
        this.f38371f = b8;
        this.f38369d = c1347n;
        m mVar = new m(c1347n);
        this.f38373h = mVar;
        int c8 = mVar.c();
        this.f38372g = c8;
        int d8 = mVar.d();
        this.f38370e = d8;
        this.f38366a = e.c(b8, c8, d8, mVar.a(), i8);
    }

    private int a() {
        int i8 = 2;
        while (true) {
            int i9 = this.f38367b;
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
        return (x) f38365i.get(E7.d.a(i8));
    }

    public int b() {
        return this.f38367b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f38368c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f38373h.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w e() {
        return this.f38366a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String f() {
        return this.f38371f;
    }

    public C1347n g() {
        return this.f38369d;
    }

    public int h() {
        return this.f38372g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k i() {
        return new k(this.f38373h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f38370e;
    }

    public x(int i8, Y6.e eVar) {
        this(i8, f.c(eVar.e()));
    }
}
