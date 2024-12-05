package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    l[] f33363a;

    /* renamed from: b, reason: collision with root package name */
    l f33364b = null;

    /* renamed from: c, reason: collision with root package name */
    o f33365c;

    /* renamed from: d, reason: collision with root package name */
    o f33366d;

    /* renamed from: e, reason: collision with root package name */
    int f33367e;

    /* renamed from: f, reason: collision with root package name */
    int f33368f;

    /* renamed from: g, reason: collision with root package name */
    int f33369g;

    /* renamed from: h, reason: collision with root package name */
    final int f33370h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(l[] lVarArr, int i8, int i9, int i10) {
        this.f33363a = lVarArr;
        this.f33370h = i8;
        this.f33367e = i9;
        this.f33368f = i9;
        this.f33369g = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final l a() {
        l[] lVarArr;
        int length;
        int i8;
        o oVar;
        o oVar2;
        l lVar = this.f33364b;
        if (lVar != null) {
            lVar = lVar.f33358d;
        }
        while (lVar == null) {
            if (this.f33368f >= this.f33369g || (lVarArr = this.f33363a) == null || (length = lVarArr.length) <= (i8 = this.f33367e) || i8 < 0) {
                this.f33364b = null;
                return null;
            }
            l k8 = ConcurrentHashMap.k(lVarArr, i8);
            if (k8 == null || k8.f33355a >= 0) {
                lVar = k8;
            } else if (k8 instanceof g) {
                this.f33363a = ((g) k8).f33348e;
                o oVar3 = this.f33366d;
                if (oVar3 != null) {
                    this.f33366d = oVar3.f33362d;
                    oVar2 = oVar3;
                } else {
                    oVar2 = new Object();
                }
                oVar2.f33361c = lVarArr;
                oVar2.f33359a = length;
                oVar2.f33360b = i8;
                oVar2.f33362d = this.f33365c;
                this.f33365c = oVar2;
                lVar = null;
            } else {
                lVar = k8 instanceof q ? ((q) k8).f33374f : null;
            }
            if (this.f33365c != null) {
                while (true) {
                    oVar = this.f33365c;
                    if (oVar == null) {
                        break;
                    }
                    int i9 = this.f33367e;
                    int i10 = oVar.f33359a;
                    int i11 = i9 + i10;
                    this.f33367e = i11;
                    if (i11 < length) {
                        break;
                    }
                    this.f33367e = oVar.f33360b;
                    this.f33363a = oVar.f33361c;
                    oVar.f33361c = null;
                    o oVar4 = oVar.f33362d;
                    oVar.f33362d = this.f33366d;
                    this.f33365c = oVar4;
                    this.f33366d = oVar;
                    length = i10;
                }
                if (oVar == null) {
                    int i12 = this.f33367e + this.f33370h;
                    this.f33367e = i12;
                    if (i12 >= length) {
                        int i13 = this.f33368f + 1;
                        this.f33368f = i13;
                        this.f33367e = i13;
                    }
                }
            } else {
                int i14 = i8 + this.f33370h;
                this.f33367e = i14;
                if (i14 >= length) {
                    int i15 = this.f33368f + 1;
                    this.f33368f = i15;
                    this.f33367e = i15;
                }
            }
        }
        this.f33364b = lVar;
        return lVar;
    }
}
