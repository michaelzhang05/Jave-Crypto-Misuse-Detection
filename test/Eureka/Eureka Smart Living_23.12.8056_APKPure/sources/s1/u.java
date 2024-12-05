package s1;

import java.util.Arrays;

/* loaded from: classes.dex */
final class u extends t {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f9236b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f9236b = bArr;
    }

    @Override // s1.t
    final byte[] c() {
        return this.f9236b;
    }
}
