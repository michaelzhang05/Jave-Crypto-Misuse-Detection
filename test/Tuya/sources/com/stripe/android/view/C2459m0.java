package com.stripe.android.view;

import android.R;
import android.app.Activity;
import android.content.DialogInterface;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.appcompat.app.AlertDialog;
import j2.AbstractC3054F;
import kotlin.jvm.internal.AbstractC3159y;
import r2.InterfaceC3684d;

/* renamed from: com.stripe.android.view.m0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2459m0 extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f27867a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3684d f27868b;

    public C2459m0(Activity activity, InterfaceC3684d logger) {
        AbstractC3159y.i(activity, "activity");
        AbstractC3159y.i(logger, "logger");
        this.f27867a = activity;
        this.f27868b = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(JsResult jsResult, DialogInterface dialogInterface, int i8) {
        if (jsResult != null) {
            jsResult.confirm();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(JsResult jsResult, DialogInterface dialogInterface, int i8) {
        if (jsResult != null) {
            jsResult.cancel();
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message;
        if (consoleMessage != null && (message = consoleMessage.message()) != null) {
            this.f27868b.b(message);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
        new AlertDialog.Builder(this.f27867a, AbstractC3054F.f32920a).setMessage(str2).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.k0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                C2459m0.c(jsResult, dialogInterface, i8);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.l0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                C2459m0.d(jsResult, dialogInterface, i8);
            }
        }).create().show();
        return true;
    }
}
