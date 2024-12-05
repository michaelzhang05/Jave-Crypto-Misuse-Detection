package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b10 extends Thread {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ AudioTrack f11109f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzmh f11110g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b10(zzmh zzmhVar, AudioTrack audioTrack) {
        this.f11110g = zzmhVar;
        this.f11109f = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        try {
            this.f11109f.flush();
            this.f11109f.release();
        } finally {
            conditionVariable = this.f11110g.f15284f;
            conditionVariable.open();
        }
    }
}
