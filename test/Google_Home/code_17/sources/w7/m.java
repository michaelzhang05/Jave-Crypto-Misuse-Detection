package w7;

import U6.C1456n;

/* loaded from: classes5.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private final w f40442a;

    /* renamed from: b, reason: collision with root package name */
    private final int f40443b;

    /* renamed from: c, reason: collision with root package name */
    private final int f40444c;

    /* renamed from: d, reason: collision with root package name */
    private final int f40445d;

    /* renamed from: e, reason: collision with root package name */
    private final int f40446e;

    /* renamed from: f, reason: collision with root package name */
    private final int f40447f;

    /* renamed from: g, reason: collision with root package name */
    private final C1456n f40448g;

    /* JADX INFO: Access modifiers changed from: protected */
    public m(C1456n c1456n) {
        if (c1456n != null) {
            this.f40448g = c1456n;
            b7.e a8 = f.a(c1456n);
            int h8 = A.h(a8);
            this.f40443b = h8;
            this.f40444c = 16;
            int ceil = (int) Math.ceil((h8 * 8) / A.o(16));
            this.f40446e = ceil;
            int floor = ((int) Math.floor(A.o((16 - 1) * ceil) / A.o(16))) + 1;
            this.f40447f = floor;
            int i8 = ceil + floor;
            this.f40445d = i8;
            l c8 = l.c(a8.e(), h8, 16, i8);
            this.f40442a = c8;
            if (c8 != null) {
                return;
            }
            throw new IllegalArgumentException("cannot find OID for digest algorithm: " + a8.e());
        }
        throw new NullPointerException("treeDigest == null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a() {
        return this.f40445d;
    }

    public C1456n b() {
        return this.f40448g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int c() {
        return this.f40443b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int d() {
        return this.f40444c;
    }
}
