package q5;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class r extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    private final int f38350a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38351b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38352c;

    /* renamed from: d, reason: collision with root package name */
    private final int f38353d;

    public r(int i8, int i9, int i10, int i11) {
        this.f38350a = i8;
        this.f38351b = i9;
        this.f38352c = i10;
        this.f38353d = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        AbstractC3255y.i(outRect, "outRect");
        AbstractC3255y.i(view, "view");
        AbstractC3255y.i(parent, "parent");
        AbstractC3255y.i(state, "state");
        outRect.left = this.f38350a;
        outRect.right = this.f38351b;
        outRect.bottom = this.f38352c;
        outRect.top = this.f38353d;
        if (parent.getChildLayoutPosition(view) > 0) {
            outRect.top = 0;
        }
    }
}
