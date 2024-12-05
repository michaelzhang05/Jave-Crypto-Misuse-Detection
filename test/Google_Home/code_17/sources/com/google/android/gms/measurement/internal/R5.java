package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.Bundle;

/* loaded from: classes3.dex */
final class R5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17335a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17336b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Bundle f17337c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ O5 f17338d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public R5(O5 o52, String str, String str2, Bundle bundle) {
        this.f17335a = str;
        this.f17336b = str2;
        this.f17337c = bundle;
        this.f17338d = o52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17338d.f17280a.s((G) AbstractC1400p.l(this.f17338d.f17280a.y0().H(this.f17335a, this.f17336b, this.f17337c, "auto", this.f17338d.f17280a.x().currentTimeMillis(), false, true)), this.f17335a);
    }
}
