package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes2.dex */
final class g40 implements zzun {
    private final /* synthetic */ Activity a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Bundle f11465b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g40(f40 f40Var, Activity activity, Bundle bundle) {
        this.a = activity;
        this.f11465b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.a, this.f11465b);
    }
}
