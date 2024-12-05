package y7;

import R6.Y;
import java.security.PublicKey;
import k7.e;
import k7.g;
import q7.AbstractC3664a;

/* loaded from: classes5.dex */
public class b implements PublicKey {

    /* renamed from: a, reason: collision with root package name */
    private short[][] f40038a;

    /* renamed from: b, reason: collision with root package name */
    private short[][] f40039b;

    /* renamed from: c, reason: collision with root package name */
    private short[] f40040c;

    /* renamed from: d, reason: collision with root package name */
    private int f40041d;

    public b(int i8, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f40041d = i8;
        this.f40038a = sArr;
        this.f40039b = sArr2;
        this.f40040c = sArr3;
    }

    public short[][] a() {
        return this.f40038a;
    }

    public short[] b() {
        return E7.a.e(this.f40040c);
    }

    public short[][] c() {
        short[][] sArr = new short[this.f40039b.length];
        int i8 = 0;
        while (true) {
            short[][] sArr2 = this.f40039b;
            if (i8 != sArr2.length) {
                sArr[i8] = E7.a.e(sArr2[i8]);
                i8++;
            } else {
                return sArr;
            }
        }
    }

    public int d() {
        return this.f40041d;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f40041d != bVar.d() || !AbstractC3664a.j(this.f40038a, bVar.a()) || !AbstractC3664a.j(this.f40039b, bVar.c()) || !AbstractC3664a.i(this.f40040c, bVar.b())) {
            return false;
        }
        return true;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return A7.a.a(new X6.a(e.f33678a, Y.f8796a), new g(this.f40041d, this.f40038a, this.f40039b, this.f40040c));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return (((((this.f40041d * 37) + E7.a.p(this.f40038a)) * 37) + E7.a.p(this.f40039b)) * 37) + E7.a.o(this.f40040c);
    }

    public b(C7.b bVar) {
        this(bVar.d(), bVar.a(), bVar.c(), bVar.b());
    }
}
