package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbvj extends zzbts<zzahy> implements zzahy {
    public zzbvj(Set<zzbuz<zzahy>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final void R(final zzato zzatoVar) {
        T(new zzbtu(zzatoVar) { // from class: com.google.android.gms.internal.ads.df
            private final zzato a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = zzatoVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbtu
            public final void a(Object obj) {
                ((zzahy) obj).R(this.a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final void j() {
        T(ef.a);
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final synchronized void r() {
        T(cf.a);
    }
}
