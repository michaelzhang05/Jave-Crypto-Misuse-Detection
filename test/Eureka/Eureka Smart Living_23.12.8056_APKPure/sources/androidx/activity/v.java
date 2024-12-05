package androidx.activity;

import android.view.View;

/* loaded from: classes.dex */
public abstract class v {
    public static final void a(View view, s sVar) {
        f5.h.e(view, "<this>");
        f5.h.e(sVar, "onBackPressedDispatcherOwner");
        view.setTag(t.f193b, sVar);
    }
}
