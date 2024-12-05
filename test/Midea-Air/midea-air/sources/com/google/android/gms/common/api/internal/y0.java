package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* loaded from: classes2.dex */
final class y0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ LifecycleCallback f10666f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f10667g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ zzc f10668h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y0(zzc zzcVar, LifecycleCallback lifecycleCallback, String str) {
        this.f10668h = zzcVar;
        this.f10666f = lifecycleCallback;
        this.f10667g = str;
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
        i2 = this.f10668h.f10762h;
        if (i2 > 0) {
            LifecycleCallback lifecycleCallback = this.f10666f;
            bundle = this.f10668h.f10763i;
            if (bundle != null) {
                bundle3 = this.f10668h.f10763i;
                bundle2 = bundle3.getBundle(this.f10667g);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.e(bundle2);
        }
        i3 = this.f10668h.f10762h;
        if (i3 >= 2) {
            this.f10666f.i();
        }
        i4 = this.f10668h.f10762h;
        if (i4 >= 3) {
            this.f10666f.g();
        }
        i5 = this.f10668h.f10762h;
        if (i5 >= 4) {
            this.f10666f.j();
        }
        i6 = this.f10668h.f10762h;
        if (i6 >= 5) {
            this.f10666f.f();
        }
    }
}
