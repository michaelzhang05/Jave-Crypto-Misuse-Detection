package q5;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class q extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    private final int f38349a;

    public q(int i8) {
        this.f38349a = i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        AbstractC3255y.i(outRect, "outRect");
        AbstractC3255y.i(view, "view");
        AbstractC3255y.i(parent, "parent");
        AbstractC3255y.i(state, "state");
        int childLayoutPosition = parent.getChildLayoutPosition(view);
        if (childLayoutPosition == 1) {
            outRect.top = this.f38349a / 2;
        } else if (childLayoutPosition > 1) {
            outRect.top = this.f38349a;
        }
    }
}
