package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.viewmodel.R;
import f6.AbstractC2683j;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class ViewTreeViewModelStoreOwner {
    public static final ViewModelStoreOwner get(View view) {
        AbstractC3159y.i(view, "<this>");
        return (ViewModelStoreOwner) AbstractC2683j.s(AbstractC2683j.z(AbstractC2683j.h(view, ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1.INSTANCE), ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2.INSTANCE));
    }

    public static final void set(View view, ViewModelStoreOwner viewModelStoreOwner) {
        AbstractC3159y.i(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }
}
