package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbtg extends zzbts<zzbtk> implements zzbtk {
    public zzbtg(Set<zzbuz<zzbtk>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void P(final zzarx zzarxVar) {
        T(new zzbtu(zzarxVar) { // from class: com.google.android.gms.internal.ads.pe
            private final zzarx a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = zzarxVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbtu
            public final void a(Object obj) {
                ((zzbtk) obj).P(this.a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void q(final zzcxu zzcxuVar) {
        T(new zzbtu(zzcxuVar) { // from class: com.google.android.gms.internal.ads.qe
            private final zzcxu a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = zzcxuVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbtu
            public final void a(Object obj) {
                ((zzbtk) obj).q(this.a);
            }
        });
    }
}
