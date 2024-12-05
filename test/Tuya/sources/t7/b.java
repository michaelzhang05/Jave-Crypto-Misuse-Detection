package t7;

import R6.C1347n;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import t7.j;

/* loaded from: classes5.dex */
public class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Map f38273a = new TreeMap();

    /* renamed from: b, reason: collision with root package name */
    private transient long f38274b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(long j8) {
        this.f38274b = j8;
    }

    C3797a a(int i8) {
        return (C3797a) this.f38273a.get(E7.d.a(i8));
    }

    public long b() {
        return this.f38274b;
    }

    void c(int i8, C3797a c3797a) {
        this.f38273a.put(E7.d.a(i8), c3797a);
    }

    C3797a d(int i8, byte[] bArr, byte[] bArr2, j jVar) {
        return (C3797a) this.f38273a.put(E7.d.a(i8), ((C3797a) this.f38273a.get(E7.d.a(i8))).d(bArr, bArr2, jVar));
    }

    void e(r rVar, long j8, byte[] bArr, byte[] bArr2) {
        x h8 = rVar.h();
        int b8 = h8.b();
        long j9 = A.j(j8, b8);
        int i8 = A.i(j8, b8);
        j jVar = (j) ((j.b) new j.b().h(j9)).p(i8).l();
        int i9 = (1 << b8) - 1;
        if (i8 < i9) {
            if (a(0) == null || i8 == 0) {
                c(0, new C3797a(h8, bArr, bArr2, jVar));
            }
            d(0, bArr, bArr2, jVar);
        }
        for (int i10 = 1; i10 < rVar.b(); i10++) {
            int i11 = A.i(j9, b8);
            j9 = A.j(j9, b8);
            j jVar2 = (j) ((j.b) ((j.b) new j.b().g(i10)).h(j9)).p(i11).l();
            if (this.f38273a.get(Integer.valueOf(i10)) == null || A.n(j8, b8, i10)) {
                this.f38273a.put(Integer.valueOf(i10), new C3797a(h8, bArr, bArr2, jVar2));
            }
            if (i11 < i9 && A.m(j8, b8, i10)) {
                d(i10, bArr, bArr2, jVar2);
            }
        }
    }

    public b f(C1347n c1347n) {
        b bVar = new b(this.f38274b);
        for (Integer num : this.f38273a.keySet()) {
            bVar.f38273a.put(num, ((C3797a) this.f38273a.get(num)).h(c1347n));
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(b bVar, long j8) {
        for (Integer num : bVar.f38273a.keySet()) {
            this.f38273a.put(num, new C3797a((C3797a) bVar.f38273a.get(num)));
        }
        this.f38274b = j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(r rVar, long j8, byte[] bArr, byte[] bArr2) {
        this.f38274b = (1 << rVar.a()) - 1;
        for (long j9 = 0; j9 < j8; j9++) {
            e(rVar, j9, bArr, bArr2);
        }
    }
}
