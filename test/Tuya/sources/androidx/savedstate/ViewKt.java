package androidx.savedstate;

import android.view.View;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class ViewKt {
    public static final /* synthetic */ SavedStateRegistryOwner findViewTreeSavedStateRegistryOwner(View view) {
        AbstractC3159y.i(view, "<this>");
        return ViewTreeSavedStateRegistryOwner.get(view);
    }
}
