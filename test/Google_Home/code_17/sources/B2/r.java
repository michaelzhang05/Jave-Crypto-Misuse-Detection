package b2;

/* loaded from: classes4.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    final s f15200a;

    /* renamed from: b, reason: collision with root package name */
    final s f15201b;

    /* renamed from: c, reason: collision with root package name */
    final s f15202c;

    /* renamed from: d, reason: collision with root package name */
    final int f15203d;

    /* renamed from: e, reason: collision with root package name */
    final String f15204e;

    /* renamed from: f, reason: collision with root package name */
    r f15205f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(s sVar, s sVar2, s sVar3, int i8, String str) {
        this.f15200a = sVar;
        this.f15201b = sVar2;
        this.f15202c = sVar3;
        this.f15203d = i8;
        this.f15204e = str;
    }

    static int a(r rVar) {
        int i8 = 0;
        while (rVar != null) {
            i8++;
            rVar = rVar.f15205f;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(r rVar) {
        return (a(rVar) * 8) + 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(r rVar, C1964d c1964d) {
        c1964d.k(a(rVar));
        while (rVar != null) {
            c1964d.k(rVar.f15200a.f15210d).k(rVar.f15201b.f15210d).k(rVar.f15202c.f15210d).k(rVar.f15203d);
            rVar = rVar.f15205f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r d(r rVar, s sVar, s sVar2) {
        int i8;
        if (rVar == null) {
            return null;
        }
        r d8 = d(rVar.f15205f, sVar, sVar2);
        rVar.f15205f = d8;
        s sVar3 = rVar.f15200a;
        int i9 = sVar3.f15210d;
        s sVar4 = rVar.f15201b;
        int i10 = sVar4.f15210d;
        int i11 = sVar.f15210d;
        if (sVar2 == null) {
            i8 = Integer.MAX_VALUE;
        } else {
            i8 = sVar2.f15210d;
        }
        if (i11 < i10 && i8 > i9) {
            if (i11 <= i9) {
                if (i8 >= i10) {
                    return d8;
                }
                return new r(rVar, sVar2, sVar4);
            }
            if (i8 >= i10) {
                return new r(rVar, sVar3, sVar);
            }
            rVar.f15205f = new r(rVar, sVar2, sVar4);
            return new r(rVar, rVar.f15200a, sVar);
        }
        return rVar;
    }

    r(r rVar, s sVar, s sVar2) {
        this(sVar, sVar2, rVar.f15202c, rVar.f15203d, rVar.f15204e);
        this.f15205f = rVar.f15205f;
    }
}
