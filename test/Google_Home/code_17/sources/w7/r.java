package w7;

import U6.C1456n;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    private static final Map f40460e;

    /* renamed from: a, reason: collision with root package name */
    private final w f40461a;

    /* renamed from: b, reason: collision with root package name */
    private final x f40462b;

    /* renamed from: c, reason: collision with root package name */
    private final int f40463c;

    /* renamed from: d, reason: collision with root package name */
    private final int f40464d;

    static {
        HashMap hashMap = new HashMap();
        Integer a8 = H7.d.a(1);
        C1456n c1456n = X6.a.f13454c;
        hashMap.put(a8, new r(20, 2, c1456n));
        hashMap.put(H7.d.a(2), new r(20, 4, c1456n));
        hashMap.put(H7.d.a(3), new r(40, 2, c1456n));
        hashMap.put(H7.d.a(4), new r(40, 4, c1456n));
        hashMap.put(H7.d.a(5), new r(40, 8, c1456n));
        hashMap.put(H7.d.a(6), new r(60, 3, c1456n));
        hashMap.put(H7.d.a(7), new r(60, 6, c1456n));
        hashMap.put(H7.d.a(8), new r(60, 12, c1456n));
        Integer a9 = H7.d.a(9);
        C1456n c1456n2 = X6.a.f13458e;
        hashMap.put(a9, new r(20, 2, c1456n2));
        hashMap.put(H7.d.a(10), new r(20, 4, c1456n2));
        hashMap.put(H7.d.a(11), new r(40, 2, c1456n2));
        hashMap.put(H7.d.a(12), new r(40, 4, c1456n2));
        hashMap.put(H7.d.a(13), new r(40, 8, c1456n2));
        hashMap.put(H7.d.a(14), new r(60, 3, c1456n2));
        hashMap.put(H7.d.a(15), new r(60, 6, c1456n2));
        hashMap.put(H7.d.a(16), new r(60, 12, c1456n2));
        Integer a10 = H7.d.a(17);
        C1456n c1456n3 = X6.a.f13474m;
        hashMap.put(a10, new r(20, 2, c1456n3));
        hashMap.put(H7.d.a(18), new r(20, 4, c1456n3));
        hashMap.put(H7.d.a(19), new r(40, 2, c1456n3));
        hashMap.put(H7.d.a(20), new r(40, 4, c1456n3));
        hashMap.put(H7.d.a(21), new r(40, 8, c1456n3));
        hashMap.put(H7.d.a(22), new r(60, 3, c1456n3));
        hashMap.put(H7.d.a(23), new r(60, 6, c1456n3));
        hashMap.put(H7.d.a(24), new r(60, 12, c1456n3));
        Integer a11 = H7.d.a(25);
        C1456n c1456n4 = X6.a.f13476n;
        hashMap.put(a11, new r(20, 2, c1456n4));
        hashMap.put(H7.d.a(26), new r(20, 4, c1456n4));
        hashMap.put(H7.d.a(27), new r(40, 2, c1456n4));
        hashMap.put(H7.d.a(28), new r(40, 4, c1456n4));
        hashMap.put(H7.d.a(29), new r(40, 8, c1456n4));
        hashMap.put(H7.d.a(30), new r(60, 3, c1456n4));
        hashMap.put(H7.d.a(31), new r(60, 6, c1456n4));
        hashMap.put(H7.d.a(32), new r(60, 12, c1456n4));
        f40460e = DesugarCollections.unmodifiableMap(hashMap);
    }

    public r(int i8, int i9, C1456n c1456n) {
        this.f40463c = i8;
        this.f40464d = i9;
        this.f40462b = new x(j(i8, i9), c1456n);
        this.f40461a = d.c(e(), f(), g(), c(), a(), i9);
    }

    public static r i(int i8) {
        return (r) f40460e.get(H7.d.a(i8));
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
        return this.f40463c;
    }

    public int b() {
        return this.f40464d;
    }

    protected int c() {
        return this.f40462b.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public w d() {
        return this.f40461a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String e() {
        return this.f40462b.f();
    }

    public int f() {
        return this.f40462b.h();
    }

    int g() {
        return this.f40462b.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public x h() {
        return this.f40462b;
    }

    public r(int i8, int i9, b7.e eVar) {
        this(i8, i9, f.c(eVar.e()));
    }
}
