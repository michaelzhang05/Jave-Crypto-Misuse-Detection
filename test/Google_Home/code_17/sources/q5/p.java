package q5;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class p extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    private final int f38348a;

    public p(int i8) {
        this.f38348a = i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        AbstractC3255y.i(outRect, "outRect");
        AbstractC3255y.i(view, "view");
        AbstractC3255y.i(parent, "parent");
        AbstractC3255y.i(state, "state");
        int childLayoutPosition = parent.getChildLayoutPosition(view);
        int i8 = this.f38348a;
        outRect.top = i8;
        outRect.right = i8;
        outRect.bottom = i8;
        if (childLayoutPosition > 0) {
            outRect.left = 0;
        } else {
            outRect.left = i8;
        }
    }
}
