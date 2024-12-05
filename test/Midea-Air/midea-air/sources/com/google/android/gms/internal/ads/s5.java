package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class s5 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Context f12146f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f12147g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ boolean f12148h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ boolean f12149i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s5(zzayi zzayiVar, Context context, String str, boolean z, boolean z2) {
        this.f12146f = context;
        this.f12147g = str;
        this.f12148h = z;
        this.f12149i = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f12146f);
        builder.setMessage(this.f12147g);
        if (this.f12148h) {
            builder.setTitle("Error");
        } else {
            builder.setTitle("Info");
        }
        if (this.f12149i) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new t5(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
