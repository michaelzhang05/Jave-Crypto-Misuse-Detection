package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* loaded from: classes2.dex */
final class x0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ LifecycleCallback f10663f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f10664g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ zza f10665h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0(zza zzaVar, LifecycleCallback lifecycleCallback, String str) {
        this.f10665h = zzaVar;
        this.f10663f = lifecycleCallback;
        this.f10664g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        i2 = this.f10665h.f10758h;
        if (i2 > 0) {
            LifecycleCallback lifecycleCallback = this.f10663f;
            bundle = this.f10665h.f10759i;
            if (bundle != null) {
                bundle3 = this.f10665h.f10759i;
                bundle2 = bundle3.getBundle(this.f10664g);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.e(bundle2);
        }
        i3 = this.f10665h.f10758h;
        if (i3 >= 2) {
            this.f10663f.i();
        }
        i4 = this.f10665h.f10758h;
        if (i4 >= 3) {
            this.f10663f.g();
        }
        i5 = this.f10665h.f10758h;
        if (i5 >= 4) {
            this.f10663f.j();
        }
        i6 = this.f10665h.f10758h;
        if (i6 >= 5) {
            this.f10663f.f();
        }
    }
}
