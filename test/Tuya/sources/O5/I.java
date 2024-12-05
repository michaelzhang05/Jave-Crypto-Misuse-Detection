package o5;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class I extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f36587a;

    /* renamed from: b, reason: collision with root package name */
    private final RelativeLayout f36588b;

    /* renamed from: c, reason: collision with root package name */
    private final RelativeLayout f36589c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f36590d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(View itemView) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.rl_old_versions_footer);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.rl_old_versions_footer)");
        this.f36587a = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.rl_back_versions);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.rl_back_versions)");
        this.f36588b = (RelativeLayout) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.rl_forward_versions);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.id.rl_forward_versions)");
        this.f36589c = (RelativeLayout) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_current_page_versions);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.…tv_current_page_versions)");
        TextView textView = (TextView) findViewById4;
        this.f36590d = textView;
        textView.setTypeface(E4.j.f2274g.t());
    }

    public final RelativeLayout a() {
        return this.f36588b;
    }

    public final RelativeLayout b() {
        return this.f36589c;
    }

    public final RelativeLayout c() {
        return this.f36587a;
    }

    public final TextView d() {
        return this.f36590d;
    }
}
