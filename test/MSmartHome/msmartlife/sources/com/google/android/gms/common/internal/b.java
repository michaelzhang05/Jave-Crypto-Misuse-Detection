package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* loaded from: classes2.dex */
final class b extends DialogRedirect {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ Intent f10890f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ Fragment f10891g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ int f10892h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Intent intent, Fragment fragment, int i2) {
        this.f10890f = intent;
        this.f10891g = fragment;
        this.f10892h = i2;
    }

    @Override // com.google.android.gms.common.internal.DialogRedirect
    public final void d() {
        Intent intent = this.f10890f;
        if (intent != null) {
            this.f10891g.startActivityForResult(intent, this.f10892h);
        }
    }
}
