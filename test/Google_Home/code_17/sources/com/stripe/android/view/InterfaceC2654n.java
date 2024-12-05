package com.stripe.android.view;

import android.R;
import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.stripe.android.view.InterfaceC2654n;
import kotlin.jvm.internal.AbstractC3255y;
import m2.AbstractC3408F;

/* renamed from: com.stripe.android.view.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2654n {

    /* renamed from: com.stripe.android.view.n$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC2654n {

        /* renamed from: a, reason: collision with root package name */
        private final Activity f28924a;

        public a(Activity activity) {
            AbstractC3255y.i(activity, "activity");
            this.f28924a = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(DialogInterface dialogInterface, int i8) {
            dialogInterface.dismiss();
        }

        @Override // com.stripe.android.view.InterfaceC2654n
        public void show(String message) {
            AbstractC3255y.i(message, "message");
            if (!this.f28924a.isFinishing()) {
                new AlertDialog.Builder(this.f28924a, AbstractC3408F.f34896a).setMessage(message).setCancelable(true).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.m
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        InterfaceC2654n.a.b(dialogInterface, i8);
                    }
                }).create().show();
            }
        }
    }

    void show(String str);
}
