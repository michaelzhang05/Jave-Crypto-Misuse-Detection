package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r extends l {

    /* renamed from: e, reason: collision with root package name */
    r f33376e;

    /* renamed from: f, reason: collision with root package name */
    r f33377f;

    /* renamed from: g, reason: collision with root package name */
    r f33378g;

    /* renamed from: h, reason: collision with root package name */
    r f33379h;

    /* renamed from: i, reason: collision with root package name */
    boolean f33380i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(int i8, Object obj, Object obj2, l lVar, r rVar) {
        super(i8, obj, obj2, lVar);
        this.f33376e = rVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.concurrent.l
    public final l a(int i8, Object obj) {
        return b(i8, obj, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r b(int i8, Object obj, Class cls) {
        if (obj == null) {
            return null;
        }
        r rVar = this;
        do {
            r rVar2 = rVar.f33377f;
            r rVar3 = rVar.f33378g;
            int i9 = rVar.f33355a;
            if (i9 <= i8) {
                if (i9 >= i8) {
                    Object obj2 = rVar.f33356b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return rVar;
                    }
                    if (rVar2 != null) {
                        if (rVar3 != null) {
                            if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                                int i10 = ConcurrentHashMap.f33321g;
                                int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                                if (compareTo != 0) {
                                    if (compareTo >= 0) {
                                        rVar2 = rVar3;
                                    }
                                }
                            }
                            r b8 = rVar3.b(i8, obj, cls);
                            if (b8 != null) {
                                return b8;
                            }
                        }
                    }
                }
                rVar = rVar3;
            }
            rVar = rVar2;
        } while (rVar != null);
        return null;
    }
}
