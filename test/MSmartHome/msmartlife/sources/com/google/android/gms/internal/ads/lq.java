package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
final class lq extends zzbts<zzczz> implements zzczr<zzczs> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public lq(Set<zzbuz<zzczz>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzczr
    public final void B(final zzcze<zzczs, ?> zzczeVar) {
        T(new zzbtu(zzczeVar) { // from class: com.google.android.gms.internal.ads.pq
            private final zzcze a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = zzczeVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbtu
            public final void a(Object obj) {
                zzcze zzczeVar2 = this.a;
                ((zzczz) obj).c((zzczs) zzczeVar2.a(), zzczeVar2.b());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczr
    public final void L(final zzcze<zzczs, ?> zzczeVar, final Throwable th) {
        T(new zzbtu(zzczeVar, th) { // from class: com.google.android.gms.internal.ads.oq
            private final zzcze a;

            /* renamed from: b, reason: collision with root package name */
            private final Throwable f11950b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = zzczeVar;
                this.f11950b = th;
            }

            @Override // com.google.android.gms.internal.ads.zzbtu
            public final void a(Object obj) {
                zzcze zzczeVar2 = this.a;
                ((zzczz) obj).b((zzczs) zzczeVar2.a(), zzczeVar2.b(), this.f11950b);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczr
    public final void M(final zzcze<zzczs, ?> zzczeVar) {
        T(new zzbtu(zzczeVar) { // from class: com.google.android.gms.internal.ads.nq
            private final zzcze a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = zzczeVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbtu
            public final void a(Object obj) {
                zzcze zzczeVar2 = this.a;
                ((zzczz) obj).d((zzczs) zzczeVar2.a(), zzczeVar2.b());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczr
    public final void N(final zzcze<zzczs, ?> zzczeVar) {
        T(new zzbtu(zzczeVar) { // from class: com.google.android.gms.internal.ads.mq
            private final zzcze a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = zzczeVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbtu
            public final void a(Object obj) {
                zzcze zzczeVar2 = this.a;
                ((zzczz) obj).e((zzczs) zzczeVar2.a(), zzczeVar2.b());
            }
        });
    }
}
