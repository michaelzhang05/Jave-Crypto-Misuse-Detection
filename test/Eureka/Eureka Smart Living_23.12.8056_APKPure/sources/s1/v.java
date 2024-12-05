package s1;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
abstract class v extends t {

    /* renamed from: c, reason: collision with root package name */
    private static final WeakReference f9237c = new WeakReference(null);

    /* renamed from: b, reason: collision with root package name */
    private WeakReference f9238b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(byte[] bArr) {
        super(bArr);
        this.f9238b = f9237c;
    }

    @Override // s1.t
    final byte[] c() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f9238b.get();
            if (bArr == null) {
                bArr = z();
                this.f9238b = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    protected abstract byte[] z();
}
