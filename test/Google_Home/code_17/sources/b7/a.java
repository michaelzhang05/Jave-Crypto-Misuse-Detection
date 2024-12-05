package B7;

import U6.Y;
import a7.C1677a;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import n7.e;
import n7.f;
import s7.C4020a;
import t7.AbstractC4043a;

/* loaded from: classes5.dex */
public class a implements PrivateKey {

    /* renamed from: a, reason: collision with root package name */
    private short[][] f1076a;

    /* renamed from: b, reason: collision with root package name */
    private short[] f1077b;

    /* renamed from: c, reason: collision with root package name */
    private short[][] f1078c;

    /* renamed from: d, reason: collision with root package name */
    private short[] f1079d;

    /* renamed from: e, reason: collision with root package name */
    private C4020a[] f1080e;

    /* renamed from: f, reason: collision with root package name */
    private int[] f1081f;

    public a(F7.a aVar) {
        this(aVar.c(), aVar.a(), aVar.d(), aVar.b(), aVar.f(), aVar.e());
    }

    public short[] a() {
        return this.f1077b;
    }

    public short[] b() {
        return this.f1079d;
    }

    public short[][] c() {
        return this.f1076a;
    }

    public short[][] d() {
        return this.f1078c;
    }

    public C4020a[] e() {
        return this.f1080e;
    }

    public boolean equals(Object obj) {
        boolean z8;
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC4043a.j(this.f1076a, aVar.c()) && AbstractC4043a.j(this.f1078c, aVar.d()) && AbstractC4043a.i(this.f1077b, aVar.a()) && AbstractC4043a.i(this.f1079d, aVar.b()) && Arrays.equals(this.f1081f, aVar.f())) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.f1080e.length != aVar.e().length) {
            return false;
        }
        for (int length = this.f1080e.length - 1; length >= 0; length--) {
            z8 &= this.f1080e[length].equals(aVar.e()[length]);
        }
        return z8;
    }

    public int[] f() {
        return this.f1081f;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new Z6.b(new C1677a(e.f35670a, Y.f10422a), new f(this.f1076a, this.f1077b, this.f1078c, this.f1079d, this.f1081f, this.f1080e)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        int length = (((((((((this.f1080e.length * 37) + H7.a.p(this.f1076a)) * 37) + H7.a.o(this.f1077b)) * 37) + H7.a.p(this.f1078c)) * 37) + H7.a.o(this.f1079d)) * 37) + H7.a.n(this.f1081f);
        for (int length2 = this.f1080e.length - 1; length2 >= 0; length2--) {
            length = (length * 37) + this.f1080e[length2].hashCode();
        }
        return length;
    }

    public a(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, C4020a[] c4020aArr) {
        this.f1076a = sArr;
        this.f1077b = sArr2;
        this.f1078c = sArr3;
        this.f1079d = sArr4;
        this.f1081f = iArr;
        this.f1080e = c4020aArr;
    }
}
