package k7;

import R6.AbstractC1346m;
import R6.AbstractC1351s;
import R6.C1330a0;
import R6.C1337e;
import R6.C1338e0;
import R6.C1344k;

/* loaded from: classes5.dex */
public class l extends AbstractC1346m {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f33735a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f33736b;

    public l(byte[] bArr, byte[] bArr2) {
        this.f33735a = E7.a.d(bArr);
        this.f33736b = E7.a.d(bArr2);
    }

    @Override // R6.AbstractC1346m, R6.InterfaceC1335d
    public AbstractC1351s d() {
        C1337e c1337e = new C1337e();
        c1337e.a(new C1344k(0L));
        c1337e.a(new C1330a0(this.f33735a));
        c1337e.a(new C1330a0(this.f33736b));
        return new C1338e0(c1337e);
    }
}
