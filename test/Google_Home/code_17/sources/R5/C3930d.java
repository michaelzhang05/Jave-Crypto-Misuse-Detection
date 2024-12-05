package r5;

import H4.j;
import Z4.InterfaceC1587a;
import Z4.InterfaceC1590d;
import a5.C1641h;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: r5.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3930d extends AbstractC3938h {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1590d f38958b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC1587a f38959c;

    /* renamed from: d, reason: collision with root package name */
    private RelativeLayout f38960d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f38961e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f38962f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f38963g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f38964h;

    /* renamed from: i, reason: collision with root package name */
    private final ProgressBar f38965i;

    /* renamed from: j, reason: collision with root package name */
    private final TextView f38966j;

    /* renamed from: k, reason: collision with root package name */
    private final TextView f38967k;

    /* renamed from: l, reason: collision with root package name */
    private final LinearLayout f38968l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3930d(View itemView, InterfaceC1590d listener, InterfaceC1587a interfaceC1587a, Context context) {
        super(itemView, context);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(context, "context");
        this.f38958b = listener;
        this.f38959c = interfaceC1587a;
        View findViewById = itemView.findViewById(R.id.rl_app_info_item);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.id.rl_app_info_item)");
        this.f38960d = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.iv_logo_app_info_item);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.id.iv_logo_app_info_item)");
        this.f38961e = (ImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.tv_name_app_info_item);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.id.tv_name_app_info_item)");
        this.f38962f = (TextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_desc_app_info_item);
        AbstractC3255y.h(findViewById4, "itemView.findViewById(R.id.tv_desc_app_info_item)");
        this.f38963g = (TextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.tv_status_app_info_item);
        AbstractC3255y.h(findViewById5, "itemView.findViewById(R.….tv_status_app_info_item)");
        this.f38964h = (TextView) findViewById5;
        this.f38965i = (ProgressBar) itemView.findViewById(R.id.pb_progress_app_info_item);
        TextView textView = (TextView) itemView.findViewById(R.id.tv_progress_app_info_item);
        this.f38966j = textView;
        TextView textView2 = (TextView) itemView.findViewById(R.id.tv_verified_app_info_item);
        this.f38967k = textView2;
        this.f38968l = (LinearLayout) itemView.findViewById(R.id.ll_progress_app_info_item);
        TextView textView3 = this.f38962f;
        j.a aVar = H4.j.f3824g;
        textView3.setTypeface(aVar.t());
        this.f38963g.setTypeface(aVar.u());
        this.f38964h.setTypeface(aVar.u());
        if (textView != null) {
            textView.setTypeface(aVar.u());
        }
        if (textView2 != null) {
            textView2.setTypeface(aVar.u());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(C3930d this$0, C1641h app, int i8, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(app, "$app");
        InterfaceC1587a interfaceC1587a = this$0.f38959c;
        if (interfaceC1587a != null) {
            interfaceC1587a.a(app, i8);
            return true;
        }
        return true;
    }

    public final void m(final C1641h app, final int i8) {
        TextView textView;
        LinearLayout linearLayout;
        AbstractC3255y.i(app, "app");
        c(this.f38960d, this.f38958b, app);
        this.f38960d.setOnLongClickListener(new View.OnLongClickListener() { // from class: r5.c
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean n8;
                n8 = C3930d.n(C3930d.this, app, i8, view);
                return n8;
            }
        });
        i(app, this.f38962f, this.f38963g);
        h(this.f38961e, app.m0());
        ProgressBar progressBar = this.f38965i;
        if (progressBar != null && (textView = this.f38966j) != null && (linearLayout = this.f38968l) != null) {
            e(app, progressBar, this.f38961e, this.f38963g, textView, this.f38964h, linearLayout);
        } else {
            g(app.y0(), this.f38964h, this.f38963g);
        }
    }
}
