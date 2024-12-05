package o5;

import E4.j;
import W4.InterfaceC1479b;
import X4.C1496f;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3307A;
import l5.C3326n;

/* renamed from: o5.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3544f extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1479b f36776a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f36777b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f36778c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f36779d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f36780e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f36781f;

    /* renamed from: g, reason: collision with root package name */
    private final RelativeLayout f36782g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3544f(View itemView, InterfaceC1479b interfaceC1479b, Context context) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(context, "context");
        this.f36776a = interfaceC1479b;
        this.f36777b = context;
        View findViewById = itemView.findViewById(R.id.iv_icon_installed_app_item);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.…_icon_installed_app_item)");
        this.f36778c = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_name_installed_app_item);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.…_name_installed_app_item)");
        TextView textView = (TextView) findViewById2;
        this.f36779d = textView;
        View findViewById3 = itemView.findViewById(R.id.tv_version_installed_app_item);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.…rsion_installed_app_item)");
        TextView textView2 = (TextView) findViewById3;
        this.f36780e = textView2;
        View findViewById4 = itemView.findViewById(R.id.tv_excluded_installed_app_item);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.…luded_installed_app_item)");
        TextView textView3 = (TextView) findViewById4;
        this.f36781f = textView3;
        View findViewById5 = itemView.findViewById(R.id.rl_installed_app_item);
        AbstractC3159y.h(findViewById5, "itemView.findViewById(R.id.rl_installed_app_item)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById5;
        this.f36782g = relativeLayout;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        textView2.setTypeface(aVar.u());
        textView3.setTypeface(aVar.t());
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: o5.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3544f.b(C3544f.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3544f this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.f36776a != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f36776a.a(bindingAdapterPosition);
        }
    }

    private final void d(C1496f c1496f) {
        if (c1496f.f()) {
            this.itemView.setAlpha(0.3f);
        } else {
            this.itemView.setAlpha(1.0f);
        }
    }

    public final void c(C1496f c1496f) {
        String str;
        if (c1496f != null) {
            d(c1496f);
            C3326n a8 = C3326n.f34504t.a(this.f36777b);
            a8.a();
            String Q8 = c1496f.Q();
            AbstractC3159y.f(Q8);
            X4.O u02 = a8.u0(Q8);
            a8.g();
            this.f36778c.setImageDrawable(C3307A.f34473a.k(this.f36777b, c1496f.Q(), R.drawable.vector_uptodown_logo_bag_disabled));
            this.f36779d.setText(c1496f.I());
            this.f36780e.setText(c1496f.h0());
            K4.a h8 = E4.j.f2274g.h();
            if (h8 != null) {
                str = h8.b();
            } else {
                str = null;
            }
            if (g6.n.s(str, c1496f.Q(), true)) {
                this.f36780e.setText(R.string.installing);
            }
            if (c1496f.i() == 1) {
                this.f36781f.setText(this.f36777b.getString(R.string.disabled_updates));
                this.f36781f.setVisibility(0);
            } else if (u02 != null && u02.f() == 1) {
                this.f36781f.setText(this.f36777b.getString(R.string.skipped_update));
                this.f36781f.setVisibility(0);
            } else {
                this.f36781f.setVisibility(8);
            }
        }
    }
}
