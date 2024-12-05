package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.R;
import f6.AbstractC2683j;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class ViewTreeLifecycleOwner {
    public static final LifecycleOwner get(View view) {
        AbstractC3159y.i(view, "<this>");
        return (LifecycleOwner) AbstractC2683j.s(AbstractC2683j.z(AbstractC2683j.h(view, ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1.INSTANCE), ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2.INSTANCE));
    }

    public static final void set(View view, LifecycleOwner lifecycleOwner) {
        AbstractC3159y.i(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
