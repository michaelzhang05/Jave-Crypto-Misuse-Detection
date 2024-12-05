package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a2 implements zzbbv<zzajw> {
    final /* synthetic */ zzala a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a2(zzala zzalaVar) {
        this.a = zzalaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbv
    public final /* synthetic */ void a(zzajw zzajwVar) {
        final zzajw zzajwVar2 = zzajwVar;
        zzbbm.a.execute(new Runnable(this, zzajwVar2) { // from class: com.google.android.gms.internal.ads.b2

            /* renamed from: f, reason: collision with root package name */
            private final a2 f11111f;

            /* renamed from: g, reason: collision with root package name */
            private final zzajw f11112g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11111f = this;
                this.f11112g = zzajwVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzayp zzaypVar;
                a2 a2Var = this.f11111f;
                zzajw zzajwVar3 = this.f11112g;
                zzaypVar = a2Var.a.f12771d;
                zzaypVar.a(zzajwVar3);
                zzajwVar3.destroy();
            }
        });
    }
}
