package androidx.activity;

import android.view.View;
import i6.AbstractC3001j;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class ViewTreeOnBackPressedDispatcherOwner {
    public static final OnBackPressedDispatcherOwner get(View view) {
        AbstractC3255y.i(view, "<this>");
        return (OnBackPressedDispatcherOwner) AbstractC3001j.s(AbstractC3001j.z(AbstractC3001j.h(view, ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$1.INSTANCE), ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2.INSTANCE));
    }

    public static final void set(View view, OnBackPressedDispatcherOwner onBackPressedDispatcherOwner) {
        AbstractC3255y.i(view, "<this>");
        AbstractC3255y.i(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }
}
