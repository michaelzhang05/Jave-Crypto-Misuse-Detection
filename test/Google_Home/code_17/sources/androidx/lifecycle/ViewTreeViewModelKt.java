package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class ViewTreeViewModelKt {
    public static final /* synthetic */ ViewModelStoreOwner findViewTreeViewModelStoreOwner(View view) {
        AbstractC3255y.i(view, "view");
        return ViewTreeViewModelStoreOwner.get(view);
    }
}
