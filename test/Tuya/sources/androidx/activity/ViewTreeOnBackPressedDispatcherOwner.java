package androidx.activity;

import android.view.View;
import f6.AbstractC2683j;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class ViewTreeOnBackPressedDispatcherOwner {
    public static final OnBackPressedDispatcherOwner get(View view) {
        AbstractC3159y.i(view, "<this>");
        return (OnBackPressedDispatcherOwner) AbstractC2683j.s(AbstractC2683j.z(AbstractC2683j.h(view, ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$1.INSTANCE), ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2.INSTANCE));
    }

    public static final void set(View view, OnBackPressedDispatcherOwner onBackPressedDispatcherOwner) {
        AbstractC3159y.i(view, "<this>");
        AbstractC3159y.i(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }
}
