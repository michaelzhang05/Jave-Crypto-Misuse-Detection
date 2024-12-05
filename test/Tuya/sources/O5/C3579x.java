package o5;

import E4.j;
import X4.C1496f;
import X4.C1498h;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3307A;

/* renamed from: o5.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3579x extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final Context f36914a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageView f36915b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f36916c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f36917d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3579x(View itemView, Context context) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(context, "context");
        this.f36914a = context;
        View findViewById = itemView.findViewById(R.id.iv_logo_app);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.iv_logo_app)");
        this.f36915b = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_app_name);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.tv_app_name)");
        TextView textView = (TextView) findViewById2;
        this.f36916c = textView;
        View findViewById3 = itemView.findViewById(R.id.tv_app_version);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.id.tv_app_version)");
        TextView textView2 = (TextView) findViewById3;
        this.f36917d = textView2;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        textView2.setTypeface(aVar.u());
    }

    public final void a(C1496f c1496f) {
        if (c1496f != null) {
            this.f36915b.setImageDrawable(C3307A.f34473a.j(this.f36914a, c1496f.Q()));
            this.f36916c.setText(c1496f.I());
            this.f36917d.setText(c1496f.h0());
        }
    }

    public final void b(C1498h c1498h) {
        if (c1498h != null) {
            String m02 = c1498h.m0();
            if (m02 != null && m02.length() != 0) {
                com.squareup.picasso.s.h().l(c1498h.m0()).n(UptodownApp.f28003B.f0(this.f36914a)).i(this.f36915b);
            } else {
                this.f36915b.setImageDrawable(ContextCompat.getDrawable(this.f36914a, R.drawable.vector_app_icon_placeholder));
            }
            this.f36916c.setText(c1498h.s0());
            this.f36917d.setText(c1498h.g1());
        }
    }
}
