package N4;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class s extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    private final int f7269a;

    public s(int i8) {
        this.f7269a = i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        AbstractC3159y.i(outRect, "outRect");
        AbstractC3159y.i(view, "view");
        AbstractC3159y.i(parent, "parent");
        AbstractC3159y.i(state, "state");
        int i8 = this.f7269a;
        outRect.left = i8;
        outRect.right = i8;
        outRect.bottom = i8;
        outRect.top = i8;
        if (parent.getChildLayoutPosition(view) > 0) {
            outRect.top = 0;
        }
    }
}
