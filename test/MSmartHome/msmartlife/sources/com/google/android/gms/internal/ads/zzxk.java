package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzwt;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzxk extends zzdrr<zzxk> {

    /* renamed from: c, reason: collision with root package name */
    public String f15752c = null;

    /* renamed from: d, reason: collision with root package name */
    private zzwt.zza[] f15753d = new zzwt.zza[0];

    /* renamed from: e, reason: collision with root package name */
    private zzwx f15754e = null;

    /* renamed from: f, reason: collision with root package name */
    private zzwx f15755f = null;

    /* renamed from: g, reason: collision with root package name */
    private zzwx f15756g = null;

    public zzxk() {
        this.f14895b = null;
        this.a = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    public final void a(zzdrp zzdrpVar) throws IOException {
        String str = this.f15752c;
        if (str != null) {
            zzdrpVar.k(1, str);
        }
        zzwt.zza[] zzaVarArr = this.f15753d;
        if (zzaVarArr != null && zzaVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzwt.zza[] zzaVarArr2 = this.f15753d;
                if (i2 >= zzaVarArr2.length) {
                    break;
                }
                zzwt.zza zzaVar = zzaVarArr2[i2];
                if (zzaVar != null) {
                    zzdrpVar.j(2, zzaVar);
                }
                i2++;
            }
        }
        super.a(zzdrpVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    public final int e() {
        int e2 = super.e();
        String str = this.f15752c;
        if (str != null) {
            e2 += zzdrp.n(1, str);
        }
        zzwt.zza[] zzaVarArr = this.f15753d;
        if (zzaVarArr != null && zzaVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzwt.zza[] zzaVarArr2 = this.f15753d;
                if (i2 >= zzaVarArr2.length) {
                    break;
                }
                zzwt.zza zzaVar = zzaVarArr2[i2];
                if (zzaVar != null) {
                    e2 += zzdni.K(2, zzaVar);
                }
                i2++;
            }
        }
        return e2;
    }
}
