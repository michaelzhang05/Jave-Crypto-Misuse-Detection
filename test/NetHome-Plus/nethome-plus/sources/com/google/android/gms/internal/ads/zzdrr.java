package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdrr;
import java.io.IOException;

/* loaded from: classes2.dex */
public class zzdrr<M extends zzdrr<M>> extends zzdrw {

    /* renamed from: b, reason: collision with root package name */
    protected zzdrt f14895b;

    @Override // com.google.android.gms.internal.ads.zzdrw
    public void a(zzdrp zzdrpVar) throws IOException {
        if (this.f14895b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f14895b.b(); i2++) {
            this.f14895b.c(i2).c(zzdrpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdrw
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzdrr zzdrrVar = (zzdrr) super.clone();
        zzdrv.a(this, zzdrrVar);
        return zzdrrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdrw
    /* renamed from: d */
    public final /* synthetic */ zzdrw clone() throws CloneNotSupportedException {
        return (zzdrr) clone();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdrw
    public int e() {
        if (this.f14895b != null) {
            for (int i2 = 0; i2 < this.f14895b.b(); i2++) {
                this.f14895b.c(i2).e();
            }
        }
        return 0;
    }
}
