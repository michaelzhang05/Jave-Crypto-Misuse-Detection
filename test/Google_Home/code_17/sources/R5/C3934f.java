package r5;

import H4.j;
import Z4.InterfaceC1588b;
import a5.C1639f;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3655A;
import o5.C3674n;

/* renamed from: r5.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3934f extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1588b f38984a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f38985b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f38986c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f38987d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f38988e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f38989f;

    /* renamed from: g, reason: collision with root package name */
    private final RelativeLayout f38990g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3934f(View itemView, InterfaceC1588b interfaceC1588b, Context context) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(context, "context");
        this.f38984a = interfaceC1588b;
        this.f38985b = context;
        View findViewById = itemView.findViewById(R.id.iv_icon_installed_app_item);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.…_icon_installed_app_item)");
        this.f38986c = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_name_installed_app_item);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.…_name_installed_app_item)");
        TextView textView = (TextView) findViewById2;
        this.f38987d = textView;
        View findViewById3 = itemView.findViewById(R.id.tv_version_installed_app_item);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.…rsion_installed_app_item)");
        TextView textView2 = (TextView) findViewById3;
        this.f38988e = textView2;
        View findViewById4 = itemView.findViewById(R.id.tv_excluded_installed_app_item);
        AbstractC3255y.h(findViewById4, "itemView.findViewById(R.…luded_installed_app_item)");
        TextView textView3 = (TextView) findViewById4;
        this.f38989f = textView3;
        View findViewById5 = itemView.findViewById(R.id.rl_installed_app_item);
        AbstractC3255y.h(findViewById5, "itemView.findViewById(R.id.rl_installed_app_item)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById5;
        this.f38990g = relativeLayout;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        textView2.setTypeface(aVar.u());
        textView3.setTypeface(aVar.t());
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: r5.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3934f.b(C3934f.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3934f this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.f38984a != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f38984a.a(bindingAdapterPosition);
        }
    }

    private final void d(C1639f c1639f) {
        if (c1639f.h()) {
            this.itemView.setAlpha(0.3f);
        } else {
            this.itemView.setAlpha(1.0f);
        }
    }

    public final void c(C1639f c1639f) {
        String str;
        if (c1639f != null) {
            d(c1639f);
            C3674n a8 = C3674n.f36505t.a(this.f38985b);
            a8.a();
            String J8 = c1639f.J();
            AbstractC3255y.f(J8);
            a5.O u02 = a8.u0(J8);
            a8.l();
            this.f38986c.setImageDrawable(C3655A.f36474a.k(this.f38985b, c1639f.J(), R.drawable.vector_uptodown_logo_bag_disabled));
            this.f38987d.setText(c1639f.z());
            this.f38988e.setText(c1639f.h0());
            N4.a h8 = H4.j.f3824g.h();
            if (h8 != null) {
                str = h8.b();
            } else {
                str = null;
            }
            if (j6.n.s(str, c1639f.J(), true)) {
                this.f38988e.setText(R.string.installing);
            }
            if (c1639f.i() == 1) {
                this.f38989f.setText(this.f38985b.getString(R.string.disabled_updates));
                this.f38989f.setVisibility(0);
            } else if (u02 != null && u02.h() == 1) {
                this.f38989f.setText(this.f38985b.getString(R.string.skipped_update));
                this.f38989f.setVisibility(0);
            } else {
                this.f38989f.setVisibility(8);
            }
        }
    }
}
