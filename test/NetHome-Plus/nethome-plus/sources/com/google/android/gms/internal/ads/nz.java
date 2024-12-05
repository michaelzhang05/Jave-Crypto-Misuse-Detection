package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* loaded from: classes2.dex */
final class nz extends Thread {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ AudioTrack f11897f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzhq f11898g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public nz(zzhq zzhqVar, AudioTrack audioTrack) {
        this.f11898g = zzhqVar;
        this.f11897f = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f11897f.release();
        } finally {
            this.f11898g.a.open();
        }
    }
}
