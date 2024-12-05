package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzdso extends zzdrr<zzdso> {

    /* renamed from: c, reason: collision with root package name */
    public Integer f14951c = null;

    /* renamed from: d, reason: collision with root package name */
    public String f14952d = null;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f14953e = null;

    public zzdso() {
        this.f14895b = null;
        this.a = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    public final void a(zzdrp zzdrpVar) throws IOException {
        Integer num = this.f14951c;
        if (num != null) {
            zzdrpVar.x(1, num.intValue());
        }
        String str = this.f14952d;
        if (str != null) {
            zzdrpVar.k(2, str);
        }
        byte[] bArr = this.f14953e;
        if (bArr != null) {
            zzdrpVar.c(3, bArr);
        }
        super.a(zzdrpVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    public final int e() {
        int e2 = super.e();
        Integer num = this.f14951c;
        if (num != null) {
            e2 += zzdrp.d(1, num.intValue());
        }
        String str = this.f14952d;
        if (str != null) {
            e2 += zzdrp.n(2, str);
        }
        byte[] bArr = this.f14953e;
        return bArr != null ? e2 + zzdrp.h(3, bArr) : e2;
    }
}
