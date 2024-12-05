package com.stripe.android.view;

import android.R;
import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.stripe.android.view.InterfaceC2460n;
import j2.AbstractC3054F;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: com.stripe.android.view.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2460n {

    /* renamed from: com.stripe.android.view.n$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC2460n {

        /* renamed from: a, reason: collision with root package name */
        private final Activity f27869a;

        public a(Activity activity) {
            AbstractC3159y.i(activity, "activity");
            this.f27869a = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(DialogInterface dialogInterface, int i8) {
            dialogInterface.dismiss();
        }

        @Override // com.stripe.android.view.InterfaceC2460n
        public void show(String message) {
            AbstractC3159y.i(message, "message");
            if (!this.f27869a.isFinishing()) {
                new AlertDialog.Builder(this.f27869a, AbstractC3054F.f32920a).setMessage(message).setCancelable(true).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.m
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        InterfaceC2460n.a.b(dialogInterface, i8);
                    }
                }).create().show();
            }
        }
    }

    void show(String str);
}
