package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.zzk;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class h3 implements DialogInterface.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzapo f11507f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h3(zzapo zzapoVar) {
        this.f11507f = zzapoVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        Context context;
        Intent h2 = this.f11507f.h();
        zzk.zzlg();
        context = this.f11507f.f12861d;
        zzaxi.i(context, h2);
    }
}
