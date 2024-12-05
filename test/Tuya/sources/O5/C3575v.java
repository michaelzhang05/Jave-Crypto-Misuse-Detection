package o5;

import E4.j;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: o5.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3575v extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private TextView f36887a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f36888b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f36889c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f36890d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3575v(View itemView) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.tv_name_app_fn);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.tv_name_app_fn)");
        this.f36887a = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_desc_app_fn);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.tv_desc_app_fn)");
        this.f36888b = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.iv_logo_app_fn);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.id.iv_logo_app_fn)");
        this.f36889c = (ImageView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_install_fn);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.id.tv_install_fn)");
        this.f36890d = (TextView) findViewById4;
        TextView textView = this.f36887a;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        this.f36888b.setTypeface(aVar.u());
        this.f36890d.setTypeface(aVar.t());
    }

    public final ImageView a() {
        return this.f36889c;
    }

    public final TextView b() {
        return this.f36888b;
    }

    public final TextView c() {
        return this.f36890d;
    }

    public final TextView d() {
        return this.f36887a;
    }
}
