package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ny implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzr f11895f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzd f11896g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ny(zzd zzdVar, zzr zzrVar) {
        this.f11896g = zzdVar;
        this.f11895f = zzrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.f11896g.f14635h;
            blockingQueue.put(this.f11895f);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
