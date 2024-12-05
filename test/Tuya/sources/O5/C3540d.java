package o5;

import E4.j;
import W4.InterfaceC1478a;
import W4.InterfaceC1481d;
import X4.C1498h;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: o5.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3540d extends AbstractC3548h {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1481d f36750b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC1478a f36751c;

    /* renamed from: d, reason: collision with root package name */
    private RelativeLayout f36752d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f36753e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f36754f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f36755g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f36756h;

    /* renamed from: i, reason: collision with root package name */
    private final ProgressBar f36757i;

    /* renamed from: j, reason: collision with root package name */
    private final TextView f36758j;

    /* renamed from: k, reason: collision with root package name */
    private final TextView f36759k;

    /* renamed from: l, reason: collision with root package name */
    private final LinearLayout f36760l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3540d(View itemView, InterfaceC1481d listener, InterfaceC1478a interfaceC1478a, Context context) {
        super(itemView, context);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(context, "context");
        this.f36750b = listener;
        this.f36751c = interfaceC1478a;
        View findViewById = itemView.findViewById(R.id.rl_app_info_item);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.rl_app_info_item)");
        this.f36752d = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.iv_logo_app_info_item);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.iv_logo_app_info_item)");
        this.f36753e = (ImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.tv_name_app_info_item);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.id.tv_name_app_info_item)");
        this.f36754f = (TextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_desc_app_info_item);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.id.tv_desc_app_info_item)");
        this.f36755g = (TextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.tv_status_app_info_item);
        AbstractC3159y.h(findViewById5, "itemView.findViewById(R.….tv_status_app_info_item)");
        this.f36756h = (TextView) findViewById5;
        this.f36757i = (ProgressBar) itemView.findViewById(R.id.pb_progress_app_info_item);
        TextView textView = (TextView) itemView.findViewById(R.id.tv_progress_app_info_item);
        this.f36758j = textView;
        TextView textView2 = (TextView) itemView.findViewById(R.id.tv_verified_app_info_item);
        this.f36759k = textView2;
        this.f36760l = (LinearLayout) itemView.findViewById(R.id.ll_progress_app_info_item);
        TextView textView3 = this.f36754f;
        j.a aVar = E4.j.f2274g;
        textView3.setTypeface(aVar.t());
        this.f36755g.setTypeface(aVar.u());
        this.f36756h.setTypeface(aVar.u());
        if (textView != null) {
            textView.setTypeface(aVar.u());
        }
        if (textView2 != null) {
            textView2.setTypeface(aVar.u());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(C3540d this$0, C1498h app, int i8, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(app, "$app");
        InterfaceC1478a interfaceC1478a = this$0.f36751c;
        if (interfaceC1478a != null) {
            interfaceC1478a.a(app, i8);
            return true;
        }
        return true;
    }

    public final void m(final C1498h app, final int i8) {
        TextView textView;
        LinearLayout linearLayout;
        AbstractC3159y.i(app, "app");
        c(this.f36752d, this.f36750b, app);
        this.f36752d.setOnLongClickListener(new View.OnLongClickListener() { // from class: o5.c
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean n8;
                n8 = C3540d.n(C3540d.this, app, i8, view);
                return n8;
            }
        });
        i(app, this.f36754f, this.f36755g);
        h(this.f36753e, app.m0());
        ProgressBar progressBar = this.f36757i;
        if (progressBar != null && (textView = this.f36758j) != null && (linearLayout = this.f36760l) != null) {
            e(app, progressBar, this.f36753e, this.f36755g, textView, this.f36756h, linearLayout);
        } else {
            g(app.y0(), this.f36756h, this.f36755g);
        }
    }
}
