package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzdsl extends zzdrr<zzdsl> {

    /* renamed from: c, reason: collision with root package name */
    private static volatile zzdsl[] f14943c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f14944d = null;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f14945e = null;

    public zzdsl() {
        this.f14895b = null;
        this.a = -1;
    }

    public static zzdsl[] f() {
        if (f14943c == null) {
            synchronized (zzdrv.f14902c) {
                if (f14943c == null) {
                    f14943c = new zzdsl[0];
                }
            }
        }
        return f14943c;
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    public final void a(zzdrp zzdrpVar) throws IOException {
        zzdrpVar.c(1, this.f14944d);
        byte[] bArr = this.f14945e;
        if (bArr != null) {
            zzdrpVar.c(2, bArr);
        }
        super.a(zzdrpVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    public final int e() {
        int e2 = super.e() + zzdrp.h(1, this.f14944d);
        byte[] bArr = this.f14945e;
        return bArr != null ? e2 + zzdrp.h(2, bArr) : e2;
    }
}
