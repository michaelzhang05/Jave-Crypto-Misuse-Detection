package q5;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class n extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    private final int f38345a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38346b;

    public n(Context context, int i8) {
        AbstractC3255y.i(context, "context");
        this.f38345a = i8;
        this.f38346b = context.getResources().getDimensionPixelSize(R.dimen.margin_m);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        AbstractC3255y.i(outRect, "outRect");
        AbstractC3255y.i(view, "view");
        AbstractC3255y.i(parent, "parent");
        AbstractC3255y.i(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int i8 = this.f38345a;
        int i9 = childAdapterPosition % i8;
        int i10 = this.f38346b;
        outRect.left = (i9 * i10) / i8;
        outRect.right = i10 - (((i9 + 1) * i10) / i8);
        if (childAdapterPosition >= i8) {
            outRect.top = i10;
        }
    }
}
