package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    l[] f32169a;

    /* renamed from: b, reason: collision with root package name */
    l f32170b = null;

    /* renamed from: c, reason: collision with root package name */
    o f32171c;

    /* renamed from: d, reason: collision with root package name */
    o f32172d;

    /* renamed from: e, reason: collision with root package name */
    int f32173e;

    /* renamed from: f, reason: collision with root package name */
    int f32174f;

    /* renamed from: g, reason: collision with root package name */
    int f32175g;

    /* renamed from: h, reason: collision with root package name */
    final int f32176h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(l[] lVarArr, int i8, int i9, int i10) {
        this.f32169a = lVarArr;
        this.f32176h = i8;
        this.f32173e = i9;
        this.f32174f = i9;
        this.f32175g = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final l a() {
        l[] lVarArr;
        int length;
        int i8;
        o oVar;
        o oVar2;
        l lVar = this.f32170b;
        if (lVar != null) {
            lVar = lVar.f32164d;
        }
        while (lVar == null) {
            if (this.f32174f >= this.f32175g || (lVarArr = this.f32169a) == null || (length = lVarArr.length) <= (i8 = this.f32173e) || i8 < 0) {
                this.f32170b = null;
                return null;
            }
            l k8 = ConcurrentHashMap.k(lVarArr, i8);
            if (k8 == null || k8.f32161a >= 0) {
                lVar = k8;
            } else if (k8 instanceof g) {
                this.f32169a = ((g) k8).f32154e;
                o oVar3 = this.f32172d;
                if (oVar3 != null) {
                    this.f32172d = oVar3.f32168d;
                    oVar2 = oVar3;
                } else {
                    oVar2 = new Object();
                }
                oVar2.f32167c = lVarArr;
                oVar2.f32165a = length;
                oVar2.f32166b = i8;
                oVar2.f32168d = this.f32171c;
                this.f32171c = oVar2;
                lVar = null;
            } else {
                lVar = k8 instanceof q ? ((q) k8).f32180f : null;
            }
            if (this.f32171c != null) {
                while (true) {
                    oVar = this.f32171c;
                    if (oVar == null) {
                        break;
                    }
                    int i9 = this.f32173e;
                    int i10 = oVar.f32165a;
                    int i11 = i9 + i10;
                    this.f32173e = i11;
                    if (i11 < length) {
                        break;
                    }
                    this.f32173e = oVar.f32166b;
                    this.f32169a = oVar.f32167c;
                    oVar.f32167c = null;
                    o oVar4 = oVar.f32168d;
                    oVar.f32168d = this.f32172d;
                    this.f32171c = oVar4;
                    this.f32172d = oVar;
                    length = i10;
                }
                if (oVar == null) {
                    int i12 = this.f32173e + this.f32176h;
                    this.f32173e = i12;
                    if (i12 >= length) {
                        int i13 = this.f32174f + 1;
                        this.f32174f = i13;
                        this.f32173e = i13;
                    }
                }
            } else {
                int i14 = i8 + this.f32176h;
                this.f32173e = i14;
                if (i14 >= length) {
                    int i15 = this.f32174f + 1;
                    this.f32174f = i15;
                    this.f32173e = i15;
                }
            }
        }
        this.f32170b = lVar;
        return lVar;
    }
}
