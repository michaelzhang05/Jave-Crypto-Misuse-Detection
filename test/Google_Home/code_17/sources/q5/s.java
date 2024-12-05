package q5;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class s extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    private final int f38354a;

    public s(int i8) {
        this.f38354a = i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        AbstractC3255y.i(outRect, "outRect");
        AbstractC3255y.i(view, "view");
        AbstractC3255y.i(parent, "parent");
        AbstractC3255y.i(state, "state");
        SettingsPreferences.a aVar = SettingsPreferences.f30353b;
        Context context = view.getContext();
        AbstractC3255y.h(context, "view.context");
        if (AbstractC3255y.d(aVar.q(context), "ar")) {
            outRect.right = this.f38354a;
            outRect.left = 0;
            if (parent.getChildLayoutPosition(view) == state.getItemCount() - 1) {
                outRect.left = this.f38354a;
                return;
            }
            return;
        }
        outRect.left = this.f38354a;
        outRect.right = 0;
        if (parent.getChildLayoutPosition(view) == state.getItemCount() - 1) {
            outRect.right = this.f38354a;
        }
    }
}
