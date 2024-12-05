package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class c40 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zznc f11212f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzto f11213g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c40(zzto zztoVar, zznc zzncVar) {
        this.f11213g = zztoVar;
        this.f11212f = zzncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zztn zztnVar;
        this.f11212f.a();
        zztnVar = this.f11213g.f15598b;
        zztnVar.p(this.f11212f);
    }
}
