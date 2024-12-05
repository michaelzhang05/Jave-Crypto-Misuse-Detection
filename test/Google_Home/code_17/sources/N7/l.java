package n7;

import U6.AbstractC1455m;
import U6.AbstractC1460s;
import U6.C1439a0;
import U6.C1446e;
import U6.C1447e0;
import U6.C1453k;

/* loaded from: classes5.dex */
public class l extends AbstractC1455m {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f35727a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f35728b;

    public l(byte[] bArr, byte[] bArr2) {
        this.f35727a = H7.a.d(bArr);
        this.f35728b = H7.a.d(bArr2);
    }

    @Override // U6.AbstractC1455m, U6.InterfaceC1444d
    public AbstractC1460s d() {
        C1446e c1446e = new C1446e();
        c1446e.a(new C1453k(0L));
        c1446e.a(new C1439a0(this.f35727a));
        c1446e.a(new C1439a0(this.f35728b));
        return new C1447e0(c1446e);
    }
}
