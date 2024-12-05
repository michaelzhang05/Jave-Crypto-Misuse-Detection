package com.airbnb.epoxy;

import android.util.Log;

/* compiled from: DebugTimer.java */
/* loaded from: classes.dex */
class i implements k0 {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private long f7841b;

    /* renamed from: c, reason: collision with root package name */
    private String f7842c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(String str) {
        this.a = str;
        b();
    }

    private void b() {
        this.f7841b = -1L;
        this.f7842c = null;
    }

    @Override // com.airbnb.epoxy.k0
    public void a(String str) {
        if (this.f7841b == -1) {
            this.f7841b = System.nanoTime();
            this.f7842c = str;
            return;
        }
        throw new IllegalStateException("Timer was already started");
    }

    @Override // com.airbnb.epoxy.k0
    public void stop() {
        if (this.f7841b != -1) {
            float nanoTime = ((float) (System.nanoTime() - this.f7841b)) / 1000000.0f;
            Log.d(this.a, String.format(this.f7842c + ": %.3fms", Float.valueOf(nanoTime)));
            b();
            return;
        }
        throw new IllegalStateException("Timer was not started");
    }
}
