package r5;

import H4.j;
import a5.C1639f;
import a5.C1641h;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3655A;

/* renamed from: r5.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3969x extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final Context f39122a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageView f39123b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f39124c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f39125d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3969x(View itemView, Context context) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(context, "context");
        this.f39122a = context;
        View findViewById = itemView.findViewById(R.id.iv_logo_app);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.id.iv_logo_app)");
        this.f39123b = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_app_name);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.id.tv_app_name)");
        TextView textView = (TextView) findViewById2;
        this.f39124c = textView;
        View findViewById3 = itemView.findViewById(R.id.tv_app_version);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.id.tv_app_version)");
        TextView textView2 = (TextView) findViewById3;
        this.f39125d = textView2;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        textView2.setTypeface(aVar.u());
    }

    public final void a(C1639f c1639f) {
        if (c1639f != null) {
            this.f39123b.setImageDrawable(C3655A.f36474a.j(this.f39122a, c1639f.J()));
            this.f39124c.setText(c1639f.z());
            this.f39125d.setText(c1639f.h0());
        }
    }

    public final void b(C1641h c1641h) {
        if (c1641h != null) {
            String m02 = c1641h.m0();
            if (m02 != null && m02.length() != 0) {
                com.squareup.picasso.s.h().l(c1641h.m0()).n(UptodownApp.f29058B.f0(this.f39122a)).i(this.f39123b);
            } else {
                this.f39123b.setImageDrawable(ContextCompat.getDrawable(this.f39122a, R.drawable.vector_app_icon_placeholder));
            }
            this.f39124c.setText(c1641h.s0());
            this.f39125d.setText(c1641h.g1());
        }
    }
}
