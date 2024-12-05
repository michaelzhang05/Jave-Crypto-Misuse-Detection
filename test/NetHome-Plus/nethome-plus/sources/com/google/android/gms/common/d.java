package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
abstract class d extends b {

    /* renamed from: g, reason: collision with root package name */
    private static final WeakReference<byte[]> f10767g = new WeakReference<>(null);

    /* renamed from: h, reason: collision with root package name */
    private WeakReference<byte[]> f10768h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(byte[] bArr) {
        super(bArr);
        this.f10768h = f10767g;
    }

    protected abstract byte[] C3();

    @Override // com.google.android.gms.common.b
    final byte[] R() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f10768h.get();
            if (bArr == null) {
                bArr = C3();
                this.f10768h = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}
