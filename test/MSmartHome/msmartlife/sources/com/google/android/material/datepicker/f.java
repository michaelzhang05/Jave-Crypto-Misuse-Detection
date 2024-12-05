package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes2.dex */
public final class f<S> extends androidx.fragment.app.b {

    /* renamed from: f, reason: collision with root package name */
    static final Object f16586f = "CONFIRM_BUTTON_TAG";

    /* renamed from: g, reason: collision with root package name */
    static final Object f16587g = "CANCEL_BUTTON_TAG";

    /* renamed from: h, reason: collision with root package name */
    static final Object f16588h = "TOGGLE_BUTTON_TAG";

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(e.e.b.b.w.b.c(context, e.e.b.b.b.v, e.class.getCanonicalName()), new int[]{R.attr.windowFullscreen});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }
}
