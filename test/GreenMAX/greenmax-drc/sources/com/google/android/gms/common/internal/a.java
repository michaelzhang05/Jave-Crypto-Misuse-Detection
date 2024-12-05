package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes2.dex */
final class a extends DialogRedirect {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ Intent f10887f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ Activity f10888g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ int f10889h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Intent intent, Activity activity, int i2) {
        this.f10887f = intent;
        this.f10888g = activity;
        this.f10889h = i2;
    }

    @Override // com.google.android.gms.common.internal.DialogRedirect
    public final void d() {
        Intent intent = this.f10887f;
        if (intent != null) {
            this.f10888g.startActivityForResult(intent, this.f10889h);
        }
    }
}
