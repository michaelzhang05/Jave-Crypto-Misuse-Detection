package r5;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class Y0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f38924a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(View itemView) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.ll_container_warning_not_space_available);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.…ning_not_space_available)");
        this.f38924a = (LinearLayout) findViewById;
    }

    public final void a(boolean z8) {
        if (z8) {
            this.f38924a.setVisibility(0);
        } else {
            this.f38924a.setVisibility(8);
        }
    }
}
