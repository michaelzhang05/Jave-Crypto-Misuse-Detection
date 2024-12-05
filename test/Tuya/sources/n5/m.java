package n5;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class m extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    private final int f36215a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36216b;

    public m(int i8, int i9) {
        this.f36215a = i8;
        this.f36216b = i9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        AbstractC3159y.i(outRect, "outRect");
        AbstractC3159y.i(view, "view");
        AbstractC3159y.i(parent, "parent");
        AbstractC3159y.i(state, "state");
        int childLayoutPosition = parent.getChildLayoutPosition(view);
        int i8 = this.f36215a;
        outRect.left = i8;
        outRect.right = i8;
        if (childLayoutPosition == 0) {
            int i9 = this.f36216b;
            outRect.top = i9 / 2;
            outRect.bottom = i9;
        } else if (childLayoutPosition > 0) {
            outRect.top = 0;
            outRect.bottom = i8;
        }
    }
}
