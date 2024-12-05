package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* loaded from: classes2.dex */
final class qa implements DialogInterface.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ JsPromptResult f12054f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public qa(JsPromptResult jsPromptResult) {
        this.f12054f = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f12054f.cancel();
    }
}
