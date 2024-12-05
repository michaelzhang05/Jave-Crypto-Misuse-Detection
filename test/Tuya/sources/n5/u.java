package n5;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class u extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    private final int f36229a;

    public u(Context context) {
        AbstractC3159y.i(context, "context");
        this.f36229a = context.getResources().getDimensionPixelSize(R.dimen.margin_m);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        AbstractC3159y.i(outRect, "outRect");
        AbstractC3159y.i(view, "view");
        AbstractC3159y.i(parent, "parent");
        AbstractC3159y.i(state, "state");
        if (parent.getChildAdapterPosition(view) == 0) {
            int i8 = this.f36229a;
            outRect.left = i8;
            outRect.right = i8;
            return;
        }
        outRect.right = this.f36229a;
    }
}
