package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class y30 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzlh f12428f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzto f12429g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y30(zzto zztoVar, zzlh zzlhVar) {
        this.f12429g = zztoVar;
        this.f12428f = zzlhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zztn zztnVar;
        zztnVar = this.f12429g.f15598b;
        zztnVar.q(this.f12428f);
    }
}
