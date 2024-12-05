package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.R;
import i6.AbstractC3001j;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class ViewTreeLifecycleOwner {
    public static final LifecycleOwner get(View view) {
        AbstractC3255y.i(view, "<this>");
        return (LifecycleOwner) AbstractC3001j.s(AbstractC3001j.z(AbstractC3001j.h(view, ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1.INSTANCE), ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2.INSTANCE));
    }

    public static final void set(View view, LifecycleOwner lifecycleOwner) {
        AbstractC3255y.i(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
