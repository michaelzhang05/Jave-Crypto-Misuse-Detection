package r5;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class I extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f38795a;

    /* renamed from: b, reason: collision with root package name */
    private final RelativeLayout f38796b;

    /* renamed from: c, reason: collision with root package name */
    private final RelativeLayout f38797c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f38798d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(View itemView) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.rl_old_versions_footer);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.id.rl_old_versions_footer)");
        this.f38795a = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.rl_back_versions);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.id.rl_back_versions)");
        this.f38796b = (RelativeLayout) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.rl_forward_versions);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.id.rl_forward_versions)");
        this.f38797c = (RelativeLayout) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_current_page_versions);
        AbstractC3255y.h(findViewById4, "itemView.findViewById(R.…tv_current_page_versions)");
        TextView textView = (TextView) findViewById4;
        this.f38798d = textView;
        textView.setTypeface(H4.j.f3824g.t());
    }

    public final RelativeLayout a() {
        return this.f38796b;
    }

    public final RelativeLayout b() {
        return this.f38797c;
    }

    public final RelativeLayout c() {
        return this.f38795a;
    }

    public final TextView d() {
        return this.f38798d;
    }
}
