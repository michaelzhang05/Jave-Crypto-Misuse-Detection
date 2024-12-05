package q5;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class m extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    private final int f38343a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38344b;

    public m(int i8, int i9) {
        this.f38343a = i8;
        this.f38344b = i9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        AbstractC3255y.i(outRect, "outRect");
        AbstractC3255y.i(view, "view");
        AbstractC3255y.i(parent, "parent");
        AbstractC3255y.i(state, "state");
        int childLayoutPosition = parent.getChildLayoutPosition(view);
        int i8 = this.f38343a;
        outRect.left = i8;
        outRect.right = i8;
        if (childLayoutPosition == 0) {
            int i9 = this.f38344b;
            outRect.top = i9 / 2;
            outRect.bottom = i9;
        } else if (childLayoutPosition > 0) {
            outRect.top = 0;
            outRect.bottom = i8;
        }
    }
}
