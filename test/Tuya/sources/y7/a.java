package y7;

import R6.Y;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import k7.e;
import k7.f;
import p7.C3626a;
import q7.AbstractC3664a;

/* loaded from: classes5.dex */
public class a implements PrivateKey {

    /* renamed from: a, reason: collision with root package name */
    private short[][] f40032a;

    /* renamed from: b, reason: collision with root package name */
    private short[] f40033b;

    /* renamed from: c, reason: collision with root package name */
    private short[][] f40034c;

    /* renamed from: d, reason: collision with root package name */
    private short[] f40035d;

    /* renamed from: e, reason: collision with root package name */
    private C3626a[] f40036e;

    /* renamed from: f, reason: collision with root package name */
    private int[] f40037f;

    public a(C7.a aVar) {
        this(aVar.c(), aVar.a(), aVar.d(), aVar.b(), aVar.f(), aVar.e());
    }

    public short[] a() {
        return this.f40033b;
    }

    public short[] b() {
        return this.f40035d;
    }

    public short[][] c() {
        return this.f40032a;
    }

    public short[][] d() {
        return this.f40034c;
    }

    public C3626a[] e() {
        return this.f40036e;
    }

    public boolean equals(Object obj) {
        boolean z8;
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3664a.j(this.f40032a, aVar.c()) && AbstractC3664a.j(this.f40034c, aVar.d()) && AbstractC3664a.i(this.f40033b, aVar.a()) && AbstractC3664a.i(this.f40035d, aVar.b()) && Arrays.equals(this.f40037f, aVar.f())) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.f40036e.length != aVar.e().length) {
            return false;
        }
        for (int length = this.f40036e.length - 1; length >= 0; length--) {
            z8 &= this.f40036e[length].equals(aVar.e()[length]);
        }
        return z8;
    }

    public int[] f() {
        return this.f40037f;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new W6.b(new X6.a(e.f33678a, Y.f8796a), new f(this.f40032a, this.f40033b, this.f40034c, this.f40035d, this.f40037f, this.f40036e)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        int length = (((((((((this.f40036e.length * 37) + E7.a.p(this.f40032a)) * 37) + E7.a.o(this.f40033b)) * 37) + E7.a.p(this.f40034c)) * 37) + E7.a.o(this.f40035d)) * 37) + E7.a.n(this.f40037f);
        for (int length2 = this.f40036e.length - 1; length2 >= 0; length2--) {
            length = (length * 37) + this.f40036e[length2].hashCode();
        }
        return length;
    }

    public a(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, C3626a[] c3626aArr) {
        this.f40032a = sArr;
        this.f40033b = sArr2;
        this.f40034c = sArr3;
        this.f40035d = sArr4;
        this.f40037f = iArr;
        this.f40036e = c3626aArr;
    }
}
