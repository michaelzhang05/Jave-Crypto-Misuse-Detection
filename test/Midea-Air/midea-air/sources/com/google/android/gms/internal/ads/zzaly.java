package com.google.android.gms.internal.ads;

@zzard
/* loaded from: classes2.dex */
public final class zzaly {
    private zzakh a;

    /* renamed from: b, reason: collision with root package name */
    private zzbbr<zzalf> f12786b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaly(zzakh zzakhVar) {
        this.a = zzakhVar;
    }

    private final void d() {
        if (this.f12786b == null) {
            final zzbbr<zzalf> zzbbrVar = new zzbbr<>();
            this.f12786b = zzbbrVar;
            this.a.h(null).d(new zzbbv(zzbbrVar) { // from class: com.google.android.gms.internal.ads.j2
                private final zzbbr a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = zzbbrVar;
                }

                @Override // com.google.android.gms.internal.ads.zzbbv
                public final void a(Object obj) {
                    this.a.b((zzalf) obj);
                }
            }, new zzbbt(zzbbrVar) { // from class: com.google.android.gms.internal.ads.l2
                private final zzbbr a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = zzbbrVar;
                }

                @Override // com.google.android.gms.internal.ads.zzbbt
                public final void run() {
                    this.a.c(new zzali("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final zzamd a(String str, zzalm zzalmVar, zzall zzallVar) {
        d();
        return new zzamd(this.f12786b, str, zzalmVar, zzallVar);
    }

    public final void b(final String str, final zzaho<? super zzalf> zzahoVar) {
        d();
        this.f12786b = (zzbbr) zzbar.c(this.f12786b, new zzbal(str, zzahoVar) { // from class: com.google.android.gms.internal.ads.m2
            private final String a;

            /* renamed from: b, reason: collision with root package name */
            private final zzaho f11790b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = str;
                this.f11790b = zzahoVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                zzalf zzalfVar = (zzalf) obj;
                zzalfVar.f(this.a, this.f11790b);
                return zzbar.o(zzalfVar);
            }
        }, zzbbm.f13155b);
    }

    public final void c(final String str, final zzaho<? super zzalf> zzahoVar) {
        this.f12786b = (zzbbr) zzbar.d(this.f12786b, new zzbam(str, zzahoVar) { // from class: com.google.android.gms.internal.ads.n2
            private final String a;

            /* renamed from: b, reason: collision with root package name */
            private final zzaho f11836b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = str;
                this.f11836b = zzahoVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbam
            public final Object a(Object obj) {
                zzalf zzalfVar = (zzalf) obj;
                zzalfVar.i(this.a, this.f11836b);
                return zzalfVar;
            }
        }, zzbbm.f13155b);
    }
}
