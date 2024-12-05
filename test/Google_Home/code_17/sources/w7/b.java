package w7;

import U6.C1456n;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import w7.j;

/* loaded from: classes5.dex */
public class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Map f40400a = new TreeMap();

    /* renamed from: b, reason: collision with root package name */
    private transient long f40401b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(long j8) {
        this.f40401b = j8;
    }

    C4151a a(int i8) {
        return (C4151a) this.f40400a.get(H7.d.a(i8));
    }

    public long b() {
        return this.f40401b;
    }

    void c(int i8, C4151a c4151a) {
        this.f40400a.put(H7.d.a(i8), c4151a);
    }

    C4151a d(int i8, byte[] bArr, byte[] bArr2, j jVar) {
        return (C4151a) this.f40400a.put(H7.d.a(i8), ((C4151a) this.f40400a.get(H7.d.a(i8))).d(bArr, bArr2, jVar));
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
                c(0, new C4151a(h8, bArr, bArr2, jVar));
            }
            d(0, bArr, bArr2, jVar);
        }
        for (int i10 = 1; i10 < rVar.b(); i10++) {
            int i11 = A.i(j9, b8);
            j9 = A.j(j9, b8);
            j jVar2 = (j) ((j.b) ((j.b) new j.b().g(i10)).h(j9)).p(i11).l();
            if (this.f40400a.get(Integer.valueOf(i10)) == null || A.n(j8, b8, i10)) {
                this.f40400a.put(Integer.valueOf(i10), new C4151a(h8, bArr, bArr2, jVar2));
            }
            if (i11 < i9 && A.m(j8, b8, i10)) {
                d(i10, bArr, bArr2, jVar2);
            }
        }
    }

    public b f(C1456n c1456n) {
        b bVar = new b(this.f40401b);
        for (Integer num : this.f40400a.keySet()) {
            bVar.f40400a.put(num, ((C4151a) this.f40400a.get(num)).h(c1456n));
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(b bVar, long j8) {
        for (Integer num : bVar.f40400a.keySet()) {
            this.f40400a.put(num, new C4151a((C4151a) bVar.f40400a.get(num)));
        }
        this.f40401b = j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(r rVar, long j8, byte[] bArr, byte[] bArr2) {
        this.f40401b = (1 << rVar.a()) - 1;
        for (long j9 = 0; j9 < j8; j9++) {
            e(rVar, j9, bArr, bArr2);
        }
    }
}
