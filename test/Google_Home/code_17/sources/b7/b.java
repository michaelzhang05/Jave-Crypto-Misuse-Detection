package B7;

import U6.Y;
import a7.C1677a;
import java.security.PublicKey;
import n7.e;
import n7.g;
import t7.AbstractC4043a;

/* loaded from: classes5.dex */
public class b implements PublicKey {

    /* renamed from: a, reason: collision with root package name */
    private short[][] f1082a;

    /* renamed from: b, reason: collision with root package name */
    private short[][] f1083b;

    /* renamed from: c, reason: collision with root package name */
    private short[] f1084c;

    /* renamed from: d, reason: collision with root package name */
    private int f1085d;

    public b(int i8, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f1085d = i8;
        this.f1082a = sArr;
        this.f1083b = sArr2;
        this.f1084c = sArr3;
    }

    public short[][] a() {
        return this.f1082a;
    }

    public short[] b() {
        return H7.a.e(this.f1084c);
    }

    public short[][] c() {
        short[][] sArr = new short[this.f1083b.length];
        int i8 = 0;
        while (true) {
            short[][] sArr2 = this.f1083b;
            if (i8 != sArr2.length) {
                sArr[i8] = H7.a.e(sArr2[i8]);
                i8++;
            } else {
                return sArr;
            }
        }
    }

    public int d() {
        return this.f1085d;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f1085d != bVar.d() || !AbstractC4043a.j(this.f1082a, bVar.a()) || !AbstractC4043a.j(this.f1083b, bVar.c()) || !AbstractC4043a.i(this.f1084c, bVar.b())) {
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
        return D7.a.a(new C1677a(e.f35670a, Y.f10422a), new g(this.f1085d, this.f1082a, this.f1083b, this.f1084c));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return (((((this.f1085d * 37) + H7.a.p(this.f1082a)) * 37) + H7.a.p(this.f1083b)) * 37) + H7.a.o(this.f1084c);
    }

    public b(F7.b bVar) {
        this(bVar.d(), bVar.a(), bVar.c(), bVar.b());
    }
}
