package r5;

import H4.j;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: r5.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3965v extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private TextView f39095a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f39096b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f39097c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f39098d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3965v(View itemView) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.tv_name_app_fn);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.id.tv_name_app_fn)");
        this.f39095a = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_desc_app_fn);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.id.tv_desc_app_fn)");
        this.f39096b = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.iv_logo_app_fn);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.id.iv_logo_app_fn)");
        this.f39097c = (ImageView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_install_fn);
        AbstractC3255y.h(findViewById4, "itemView.findViewById(R.id.tv_install_fn)");
        this.f39098d = (TextView) findViewById4;
        TextView textView = this.f39095a;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        this.f39096b.setTypeface(aVar.u());
        this.f39098d.setTypeface(aVar.t());
    }

    public final ImageView a() {
        return this.f39097c;
    }

    public final TextView b() {
        return this.f39096b;
    }

    public final TextView c() {
        return this.f39098d;
    }

    public final TextView d() {
        return this.f39095a;
    }
}
