package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class dj implements zzban<zzcxu> {
    private final /* synthetic */ zzchl a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dj(zzchl zzchlVar) {
        this.a = zzchlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void a(Throwable th) {
        Pattern pattern;
        zzcji zzcjiVar;
        if (((Boolean) zzyt.e().c(zzacu.a5)).booleanValue()) {
            pattern = zzchl.f14063b;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzcjiVar = this.a.f14068g;
                zzcjiVar.e(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final /* synthetic */ void b(zzcxu zzcxuVar) {
        zzcji zzcjiVar;
        zzcji zzcjiVar2;
        zzcxu zzcxuVar2 = zzcxuVar;
        if (((Boolean) zzyt.e().c(zzacu.a5)).booleanValue()) {
            zzcjiVar = this.a.f14068g;
            zzcjiVar.e(zzcxuVar2.f14570b.f14567b.f14562e);
            zzcjiVar2 = this.a.f14068g;
            zzcjiVar2.f(zzcxuVar2.f14570b.f14567b.f14563f);
        }
    }
}
