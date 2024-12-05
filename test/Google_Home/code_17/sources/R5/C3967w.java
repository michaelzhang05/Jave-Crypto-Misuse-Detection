package r5;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: r5.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3967w extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private ImageView f39117a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f39118b;

    /* renamed from: c, reason: collision with root package name */
    private ProgressBar f39119c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3967w(View itemView) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.iv_icon_fqi);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.id.iv_icon_fqi)");
        this.f39117a = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_counter_fqi);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.id.tv_counter_fqi)");
        this.f39118b = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.pb_fqi);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.id.pb_fqi)");
        this.f39119c = (ProgressBar) findViewById3;
        this.f39118b.setTypeface(H4.j.f3824g.t());
    }

    public final ImageView a() {
        return this.f39117a;
    }

    public final ProgressBar b() {
        return this.f39119c;
    }

    public final TextView c() {
        return this.f39118b;
    }
}
