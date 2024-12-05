package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* loaded from: classes2.dex */
final class c extends DialogRedirect {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ Intent f10893f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ LifecycleFragment f10894g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ int f10895h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Intent intent, LifecycleFragment lifecycleFragment, int i2) {
        this.f10893f = intent;
        this.f10894g = lifecycleFragment;
        this.f10895h = i2;
    }

    @Override // com.google.android.gms.common.internal.DialogRedirect
    public final void d() {
        Intent intent = this.f10893f;
        if (intent != null) {
            this.f10894g.startActivityForResult(intent, this.f10895h);
        }
    }
}
