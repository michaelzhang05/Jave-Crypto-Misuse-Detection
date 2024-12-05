package Y1;

/* loaded from: classes4.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    final s f12915a;

    /* renamed from: b, reason: collision with root package name */
    final s f12916b;

    /* renamed from: c, reason: collision with root package name */
    final s f12917c;

    /* renamed from: d, reason: collision with root package name */
    final int f12918d;

    /* renamed from: e, reason: collision with root package name */
    final String f12919e;

    /* renamed from: f, reason: collision with root package name */
    r f12920f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(s sVar, s sVar2, s sVar3, int i8, String str) {
        this.f12915a = sVar;
        this.f12916b = sVar2;
        this.f12917c = sVar3;
        this.f12918d = i8;
        this.f12919e = str;
    }

    static int a(r rVar) {
        int i8 = 0;
        while (rVar != null) {
            i8++;
            rVar = rVar.f12920f;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(r rVar) {
        return (a(rVar) * 8) + 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(r rVar, C1515d c1515d) {
        c1515d.k(a(rVar));
        while (rVar != null) {
            c1515d.k(rVar.f12915a.f12925d).k(rVar.f12916b.f12925d).k(rVar.f12917c.f12925d).k(rVar.f12918d);
            rVar = rVar.f12920f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r d(r rVar, s sVar, s sVar2) {
        int i8;
        if (rVar == null) {
            return null;
        }
        r d8 = d(rVar.f12920f, sVar, sVar2);
        rVar.f12920f = d8;
        s sVar3 = rVar.f12915a;
        int i9 = sVar3.f12925d;
        s sVar4 = rVar.f12916b;
        int i10 = sVar4.f12925d;
        int i11 = sVar.f12925d;
        if (sVar2 == null) {
            i8 = Integer.MAX_VALUE;
        } else {
            i8 = sVar2.f12925d;
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
            rVar.f12920f = new r(rVar, sVar2, sVar4);
            return new r(rVar, rVar.f12915a, sVar);
        }
        return rVar;
    }

    r(r rVar, s sVar, s sVar2) {
        this(sVar, sVar2, rVar.f12917c, rVar.f12918d, rVar.f12919e);
        this.f12920f = rVar.f12920f;
    }
}
