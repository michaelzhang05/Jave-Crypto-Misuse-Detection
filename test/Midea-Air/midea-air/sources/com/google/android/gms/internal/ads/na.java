package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes2.dex */
final class na implements DialogInterface.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ JsResult f11860f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public na(JsResult jsResult) {
        this.f11860f = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f11860f.cancel();
    }
}
