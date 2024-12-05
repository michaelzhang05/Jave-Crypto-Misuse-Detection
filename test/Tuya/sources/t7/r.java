package t7;

import R6.C1347n;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    private static final Map f38333e;

    /* renamed from: a, reason: collision with root package name */
    private final w f38334a;

    /* renamed from: b, reason: collision with root package name */
    private final x f38335b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38336c;

    /* renamed from: d, reason: collision with root package name */
    private final int f38337d;

    static {
        HashMap hashMap = new HashMap();
        Integer a8 = E7.d.a(1);
        C1347n c1347n = U6.a.f11784c;
        hashMap.put(a8, new r(20, 2, c1347n));
        hashMap.put(E7.d.a(2), new r(20, 4, c1347n));
        hashMap.put(E7.d.a(3), new r(40, 2, c1347n));
        hashMap.put(E7.d.a(4), new r(40, 4, c1347n));
        hashMap.put(E7.d.a(5), new r(40, 8, c1347n));
        hashMap.put(E7.d.a(6), new r(60, 3, c1347n));
        hashMap.put(E7.d.a(7), new r(60, 6, c1347n));
        hashMap.put(E7.d.a(8), new r(60, 12, c1347n));
        Integer a9 = E7.d.a(9);
        C1347n c1347n2 = U6.a.f11788e;
        hashMap.put(a9, new r(20, 2, c1347n2));
        hashMap.put(E7.d.a(10), new r(20, 4, c1347n2));
        hashMap.put(E7.d.a(11), new r(40, 2, c1347n2));
        hashMap.put(E7.d.a(12), new r(40, 4, c1347n2));
        hashMap.put(E7.d.a(13), new r(40, 8, c1347n2));
        hashMap.put(E7.d.a(14), new r(60, 3, c1347n2));
        hashMap.put(E7.d.a(15), new r(60, 6, c1347n2));
        hashMap.put(E7.d.a(16), new r(60, 12, c1347n2));
        Integer a10 = E7.d.a(17);
        C1347n c1347n3 = U6.a.f11804m;
        hashMap.put(a10, new r(20, 2, c1347n3));
        hashMap.put(E7.d.a(18), new r(20, 4, c1347n3));
        hashMap.put(E7.d.a(19), new r(40, 2, c1347n3));
        hashMap.put(E7.d.a(20), new r(40, 4, c1347n3));
        hashMap.put(E7.d.a(21), new r(40, 8, c1347n3));
        hashMap.put(E7.d.a(22), new r(60, 3, c1347n3));
        hashMap.put(E7.d.a(23), new r(60, 6, c1347n3));
        hashMap.put(E7.d.a(24), new r(60, 12, c1347n3));
        Integer a11 = E7.d.a(25);
        C1347n c1347n4 = U6.a.f11806n;
        hashMap.put(a11, new r(20, 2, c1347n4));
        hashMap.put(E7.d.a(26), new r(20, 4, c1347n4));
        hashMap.put(E7.d.a(27), new r(40, 2, c1347n4));
        hashMap.put(E7.d.a(28), new r(40, 4, c1347n4));
        hashMap.put(E7.d.a(29), new r(40, 8, c1347n4));
        hashMap.put(E7.d.a(30), new r(60, 3, c1347n4));
        hashMap.put(E7.d.a(31), new r(60, 6, c1347n4));
        hashMap.put(E7.d.a(32), new r(60, 12, c1347n4));
        f38333e = DesugarCollections.unmodifiableMap(hashMap);
    }

    public r(int i8, int i9, C1347n c1347n) {
        this.f38336c = i8;
        this.f38337d = i9;
        this.f38335b = new x(j(i8, i9), c1347n);
        this.f38334a = d.c(e(), f(), g(), c(), a(), i9);
    }

    public static r i(int i8) {
        return (r) f38333e.get(E7.d.a(i8));
    }

    private static int j(int i8, int i9) {
        if (i8 >= 2) {
            if (i8 % i9 == 0) {
                int i10 = i8 / i9;
                if (i10 != 1) {
                    return i10;
                }
                throw new IllegalArgumentException("height / layers must be greater than 1");
            }
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        throw new IllegalArgumentException("totalHeight must be > 1");
    }

    public int a() {
        return this.f38336c;
    }

    public int b() {
        return this.f38337d;
    }

    protected int c() {
        return this.f38335b.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public w d() {
        return this.f38334a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String e() {
        return this.f38335b.f();
    }

    public int f() {
        return this.f38335b.h();
    }

    int g() {
        return this.f38335b.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public x h() {
        return this.f38335b;
    }

    public r(int i8, int i9, Y6.e eVar) {
        this(i8, i9, f.c(eVar.e()));
    }
}
