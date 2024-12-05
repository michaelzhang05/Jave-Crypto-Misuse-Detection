package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.viewmodel.R;
import i6.AbstractC3001j;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class ViewTreeViewModelStoreOwner {
    public static final ViewModelStoreOwner get(View view) {
        AbstractC3255y.i(view, "<this>");
        return (ViewModelStoreOwner) AbstractC3001j.s(AbstractC3001j.z(AbstractC3001j.h(view, ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1.INSTANCE), ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2.INSTANCE));
    }

    public static final void set(View view, ViewModelStoreOwner viewModelStoreOwner) {
        AbstractC3255y.i(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }
}
