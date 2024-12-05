package com.stripe.android.view;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: com.stripe.android.view.h0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2643h0 {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f28785a;

    /* renamed from: b, reason: collision with root package name */
    private final InputMethodManager f28786b;

    public C2643h0(Activity activity) {
        AbstractC3255y.i(activity, "activity");
        this.f28785a = activity;
        Object systemService = activity.getSystemService("input_method");
        AbstractC3255y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.f28786b = (InputMethodManager) systemService;
    }

    public final /* synthetic */ void a() {
        IBinder iBinder;
        if (this.f28786b.isAcceptingText()) {
            InputMethodManager inputMethodManager = this.f28786b;
            View currentFocus = this.f28785a.getCurrentFocus();
            if (currentFocus != null) {
                iBinder = currentFocus.getWindowToken();
            } else {
                iBinder = null;
            }
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        }
    }
}
