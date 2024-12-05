package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzwt;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzxl extends zzdrr<zzxl> {

    /* renamed from: c, reason: collision with root package name */
    public String f15757c = null;

    /* renamed from: d, reason: collision with root package name */
    private zzwt.zzn f15758d = null;

    /* renamed from: e, reason: collision with root package name */
    private Integer f15759e = null;

    /* renamed from: f, reason: collision with root package name */
    public zzxo f15760f = null;

    /* renamed from: g, reason: collision with root package name */
    private Integer f15761g = null;

    /* renamed from: h, reason: collision with root package name */
    private zzwx f15762h = null;

    /* renamed from: i, reason: collision with root package name */
    private zzwx f15763i = null;

    /* renamed from: j, reason: collision with root package name */
    private zzwx f15764j = null;

    public zzxl() {
        this.f14895b = null;
        this.a = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    public final void a(zzdrp zzdrpVar) throws IOException {
        String str = this.f15757c;
        if (str != null) {
            zzdrpVar.k(1, str);
        }
        zzxo zzxoVar = this.f15760f;
        if (zzxoVar != null) {
            zzdrpVar.b(4, zzxoVar);
        }
        super.a(zzdrpVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    public final int e() {
        int e2 = super.e();
        String str = this.f15757c;
        if (str != null) {
            e2 += zzdrp.n(1, str);
        }
        zzxo zzxoVar = this.f15760f;
        return zzxoVar != null ? e2 + zzdrp.g(4, zzxoVar) : e2;
    }
}
