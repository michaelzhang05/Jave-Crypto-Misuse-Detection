package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzxo extends zzdrr<zzxo> {

    /* renamed from: c, reason: collision with root package name */
    public Integer f15774c = null;

    /* renamed from: d, reason: collision with root package name */
    public Integer f15775d = null;

    /* renamed from: e, reason: collision with root package name */
    public Integer f15776e = null;

    public zzxo() {
        this.f14895b = null;
        this.a = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    public final void a(zzdrp zzdrpVar) throws IOException {
        Integer num = this.f15774c;
        if (num != null) {
            zzdrpVar.x(1, num.intValue());
        }
        Integer num2 = this.f15775d;
        if (num2 != null) {
            zzdrpVar.x(2, num2.intValue());
        }
        Integer num3 = this.f15776e;
        if (num3 != null) {
            zzdrpVar.x(3, num3.intValue());
        }
        super.a(zzdrpVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    public final int e() {
        int e2 = super.e();
        Integer num = this.f15774c;
        if (num != null) {
            e2 += zzdrp.d(1, num.intValue());
        }
        Integer num2 = this.f15775d;
        if (num2 != null) {
            e2 += zzdrp.d(2, num2.intValue());
        }
        Integer num3 = this.f15776e;
        return num3 != null ? e2 + zzdrp.d(3, num3.intValue()) : e2;
    }
}
