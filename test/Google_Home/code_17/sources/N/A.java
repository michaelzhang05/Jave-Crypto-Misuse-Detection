package N;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class A extends z {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f7419b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f7419b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // N.z
    public final byte[] s0() {
        return this.f7419b;
    }
}
