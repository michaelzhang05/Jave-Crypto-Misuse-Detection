package O;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
abstract class B extends z {

    /* renamed from: k, reason: collision with root package name */
    private static final WeakReference f7619k = new WeakReference(null);

    /* renamed from: b, reason: collision with root package name */
    private WeakReference f7620b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(byte[] bArr) {
        super(bArr);
        this.f7620b = f7619k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // O.z
    public final byte[] m0() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.f7620b.get();
                if (bArr == null) {
                    bArr = n0();
                    this.f7620b = new WeakReference(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }

    protected abstract byte[] n0();
}
