package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes2.dex */
public class LifecycleActivity {
    private final Object a;

    @KeepForSdk
    public Activity a() {
        return (Activity) this.a;
    }

    @KeepForSdk
    public androidx.fragment.app.c b() {
        return (androidx.fragment.app.c) this.a;
    }

    @KeepForSdk
    public boolean c() {
        return this.a instanceof androidx.fragment.app.c;
    }

    public final boolean d() {
        return this.a instanceof Activity;
    }
}
