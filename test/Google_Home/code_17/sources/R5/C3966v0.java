package r5;

import H4.j;
import Z4.InterfaceC1587a;
import Z4.InterfaceC1590d;
import Z4.InterfaceC1591e;
import a5.C1641h;
import a5.C1646m;
import a5.C1648o;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.workers.DownloadApkWorker;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3667g;
import o5.C3674n;
import q5.C3854c;

/* renamed from: r5.v0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3966v0 extends AbstractC3938h {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1590d f39099b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1591e f39100c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1587a f39101d;

    /* renamed from: e, reason: collision with root package name */
    private Context f39102e;

    /* renamed from: f, reason: collision with root package name */
    private RelativeLayout f39103f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f39104g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f39105h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f39106i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f39107j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f39108k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f39109l;

    /* renamed from: m, reason: collision with root package name */
    private TextView f39110m;

    /* renamed from: n, reason: collision with root package name */
    private LinearLayout f39111n;

    /* renamed from: o, reason: collision with root package name */
    private LinearLayout f39112o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f39113p;

    /* renamed from: q, reason: collision with root package name */
    private ProgressBar f39114q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f39115r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f39116s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3966v0(View itemView, InterfaceC1590d listener, InterfaceC1591e topItemsListener, InterfaceC1587a actionsClickListener, Context context) {
        super(itemView, context);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(topItemsListener, "topItemsListener");
        AbstractC3255y.i(actionsClickListener, "actionsClickListener");
        AbstractC3255y.i(context, "context");
        this.f39099b = listener;
        this.f39100c = topItemsListener;
        this.f39101d = actionsClickListener;
        this.f39102e = context;
        View findViewById = itemView.findViewById(R.id.rl_app_info_top_by_cat_item);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.…app_info_top_by_cat_item)");
        this.f39103f = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.iv_logo_app_info_top_by_cat_item);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.…app_info_top_by_cat_item)");
        this.f39104g = (ImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.tv_name_app_info_top_by_cat_item);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.…app_info_top_by_cat_item)");
        this.f39105h = (TextView) findViewById3;
        this.f39106i = (TextView) itemView.findViewById(R.id.tv_number_app_info_top_by_cat_item);
        View findViewById4 = itemView.findViewById(R.id.tv_desc_app_info_top_by_cat_item);
        AbstractC3255y.h(findViewById4, "itemView.findViewById(R.…app_info_top_by_cat_item)");
        this.f39107j = (TextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.tv_action_app_info_top_by_cat_info_item);
        AbstractC3255y.h(findViewById5, "itemView.findViewById(R.…nfo_top_by_cat_info_item)");
        this.f39108k = (TextView) findViewById5;
        this.f39109l = (TextView) itemView.findViewById(R.id.tv_valoration_app_info_top_by_cat_info_item);
        this.f39110m = (TextView) itemView.findViewById(R.id.tv_downloads_counter_app_info_top_by_cat_info_item);
        this.f39111n = (LinearLayout) itemView.findViewById(R.id.ll_info_app_info_top_by_cat_info_item);
        View findViewById6 = itemView.findViewById(R.id.ll_download_app_info_top_by_cat_info_item);
        AbstractC3255y.h(findViewById6, "itemView.findViewById(R.…nfo_top_by_cat_info_item)");
        this.f39112o = (LinearLayout) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.tv_progress_app_info_top_by_cat_info_item);
        AbstractC3255y.h(findViewById7, "itemView.findViewById(R.…nfo_top_by_cat_info_item)");
        this.f39113p = (TextView) findViewById7;
        View findViewById8 = itemView.findViewById(R.id.pb_progress_app_info_top_by_cat_item);
        AbstractC3255y.h(findViewById8, "itemView.findViewById(R.…app_info_top_by_cat_item)");
        this.f39114q = (ProgressBar) findViewById8;
        View findViewById9 = itemView.findViewById(R.id.tv_verified_app_info_top_by_cat_info_item);
        AbstractC3255y.h(findViewById9, "itemView.findViewById(R.…nfo_top_by_cat_info_item)");
        this.f39115r = (TextView) findViewById9;
        this.f39116s = (TextView) itemView.findViewById(R.id.tv_badge_promoted);
        TextView textView = this.f39105h;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        TextView textView2 = this.f39106i;
        if (textView2 != null) {
            textView2.setTypeface(aVar.t());
        }
        TextView textView3 = this.f39109l;
        if (textView3 != null) {
            textView3.setTypeface(aVar.u());
        }
        TextView textView4 = this.f39110m;
        if (textView4 != null) {
            textView4.setTypeface(aVar.u());
        }
        this.f39107j.setTypeface(aVar.u());
        this.f39108k.setTypeface(aVar.t());
        this.f39115r.setTypeface(aVar.u());
        this.f39113p.setTypeface(aVar.u());
        TextView textView5 = this.f39116s;
        if (textView5 != null) {
            textView5.setTypeface(aVar.u());
        }
    }

    private final void A(int i8, long j8, final C1641h c1641h, final int i9) {
        C3854c.f38326a.e(this.f39114q, this.f39104g);
        LinearLayout linearLayout = this.f39111n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.f39108k.setText(R.string.option_button_cancel);
        this.f39108k.setBackground(ContextCompat.getDrawable(this.f39102e, R.drawable.shape_stroke_blue_primary));
        this.f39108k.setTextColor(ContextCompat.getColor(this.f39102e, R.color.blue_primary));
        this.f39108k.setOnClickListener(new View.OnClickListener() { // from class: r5.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3966v0.B(C3966v0.this, c1641h, i9, view);
            }
        });
        this.f39107j.setVisibility(8);
        this.f39112o.setVisibility(0);
        if (i8 == 0) {
            this.f39113p.setText(this.f39102e.getString(R.string.status_download_update_pending));
            this.f39114q.setIndeterminate(true);
        } else {
            this.f39114q.setIndeterminate(false);
            this.f39113p.setText(this.f39102e.getString(R.string.percent_of_total_size, Integer.valueOf(i8), new Q4.g().c(j8)));
            this.f39114q.setProgress(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(C3966v0 this$0, C1641h app, int i8, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(app, "$app");
        this$0.f39100c.b(app, i8);
    }

    private final void C(final C1641h c1641h, final int i8) {
        w(c1641h, i8);
        this.f39108k.setText(R.string.option_button_install);
        this.f39108k.setOnClickListener(new View.OnClickListener() { // from class: r5.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3966v0.D(C3966v0.this, c1641h, i8, view);
            }
        });
        this.f39108k.setBackground(ContextCompat.getDrawable(this.f39102e, R.drawable.ripple_install_button));
        this.f39108k.setTextColor(ContextCompat.getColor(this.f39102e, R.color.white));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(C3966v0 this$0, C1641h app, int i8, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(app, "$app");
        this$0.f39100c.a(app, i8);
        this$0.E();
    }

    private final void E() {
        C3854c.f38326a.e(this.f39114q, this.f39104g);
        LinearLayout linearLayout = this.f39111n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.f39108k.setVisibility(8);
        this.f39107j.setVisibility(8);
        this.f39112o.setVisibility(0);
        this.f39113p.setText(this.f39102e.getString(R.string.installing));
        this.f39114q.setIndeterminate(true);
    }

    private final void F(C1641h c1641h, int i8) {
        w(c1641h, i8);
        this.f39108k.setText(R.string.open);
        this.f39108k.setBackground(ContextCompat.getDrawable(this.f39102e, R.drawable.ripple_blue_primary_button));
        this.f39108k.setTextColor(ContextCompat.getColor(this.f39102e, R.color.white));
    }

    private final void G(final C1641h c1641h, final int i8) {
        w(c1641h, i8);
        this.f39108k.setText(this.f39102e.getString(R.string.status_download_update));
        this.f39108k.setOnClickListener(new View.OnClickListener() { // from class: r5.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3966v0.H(C3966v0.this, c1641h, i8, view);
            }
        });
        this.f39108k.setTextColor(ContextCompat.getColor(this.f39102e, R.color.white));
        this.f39108k.setBackground(ContextCompat.getDrawable(this.f39102e, R.drawable.ripple_install_button));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(C3966v0 this$0, C1641h app, int i8, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(app, "$app");
        this$0.f39100c.a(app, i8);
        this$0.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(C3966v0 this$0, C1641h app, int i8, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(app, "$app");
        this$0.f39101d.a(app, i8);
        return true;
    }

    private final String t(long j8) {
        if (j8 < 1000) {
            return String.valueOf(j8);
        }
        if (j8 < 1000000) {
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34167a;
            String format = String.format(Locale.getDefault(), "%dK", Arrays.copyOf(new Object[]{Integer.valueOf(((int) j8) / 1000)}, 1));
            AbstractC3255y.h(format, "format(...)");
            return format;
        }
        kotlin.jvm.internal.Y y9 = kotlin.jvm.internal.Y.f34167a;
        String format2 = String.format(Locale.getDefault(), "%dM", Arrays.copyOf(new Object[]{Integer.valueOf(((int) j8) / 1000000)}, 1));
        AbstractC3255y.h(format2, "format(...)");
        return format2;
    }

    private final void u(final C1641h c1641h, final int i8) {
        this.f39108k.setOnClickListener(new View.OnClickListener() { // from class: r5.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3966v0.v(C3966v0.this, c1641h, i8, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(C3966v0 this$0, C1641h app, int i8, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(app, "$app");
        this$0.f39100c.a(app, i8);
    }

    private final void w(final C1641h c1641h, final int i8) {
        C3854c.f38326a.c(this.f39114q, this.f39104g);
        this.f39108k.setOnClickListener(new View.OnClickListener() { // from class: r5.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3966v0.x(C3966v0.this, c1641h, i8, view);
            }
        });
        this.f39112o.setVisibility(8);
        this.f39107j.setVisibility(0);
        this.f39108k.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(C3966v0 this$0, C1641h app, int i8, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(app, "$app");
        this$0.f39100c.a(app, i8);
    }

    private final void y(C1641h c1641h, int i8) {
        a5.O o8;
        boolean z8;
        boolean z9;
        String y02;
        u(c1641h, i8);
        C3674n a8 = C3674n.f36505t.a(this.f39102e);
        a8.a();
        C1648o Z7 = a8.Z(String.valueOf(c1641h.f0()));
        if (Z7 == null && (y02 = c1641h.y0()) != null && y02.length() != 0) {
            String y03 = c1641h.y0();
            AbstractC3255y.f(y03);
            Z7 = a8.a0(y03);
        }
        String y04 = c1641h.y0();
        if (y04 != null && y04.length() != 0) {
            String y05 = c1641h.y0();
            AbstractC3255y.f(y05);
            o8 = a8.u0(y05);
        } else {
            o8 = null;
        }
        boolean r8 = new C3667g().r(c1641h.y0(), this.f39102e);
        boolean z10 = true;
        if (UptodownApp.f29058B.V("downloadApkWorker", this.f39102e) && DownloadApkWorker.f31034k.c(c1641h.i())) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (Z7 != null && Z7.z() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (Z7 == null || !Z7.h0()) {
            z10 = false;
        }
        if (Z7 != null && (z8 || z10)) {
            A(Z7.Z(), Z7.a0(), c1641h, i8);
        } else if (o8 != null && o8.a()) {
            A(o8.u(), o8.v(), c1641h, i8);
        } else if (r8) {
            if (o8 != null) {
                if (o8.u() != 100 && !z9) {
                    z(c1641h, i8);
                } else {
                    G(c1641h, i8);
                }
            } else {
                F(c1641h, i8);
            }
        } else if (z9) {
            C(c1641h, i8);
        } else {
            z(c1641h, i8);
        }
        a8.l();
    }

    private final void z(C1641h c1641h, int i8) {
        w(c1641h, i8);
        this.f39108k.setText(R.string.updates_button_download_app);
        this.f39108k.setBackground(ContextCompat.getDrawable(this.f39102e, R.drawable.ripple_blue_primary_button));
        this.f39108k.setTextColor(ContextCompat.getColor(this.f39102e, R.color.white));
    }

    public final void r(final C1641h app, int i8, final int i9) {
        AbstractC3255y.i(app, "app");
        this.f39103f.setOnLongClickListener(new View.OnLongClickListener() { // from class: r5.p0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean s8;
                s8 = C3966v0.s(C3966v0.this, app, i9, view);
                return s8;
            }
        });
        c(this.f39103f, this.f39099b, app);
        TextView textView = this.f39106i;
        if (textView != null) {
            textView.setText(this.f39102e.getResources().getString(R.string.top_index_format, String.valueOf(i8)));
        }
        if (app.F0() > 0 && app.J() > 0) {
            TextView textView2 = this.f39109l;
            if (textView2 != null) {
                textView2.setText(String.valueOf(app.F0() / 10.0d));
            }
            TextView textView3 = this.f39110m;
            if (textView3 != null) {
                textView3.setText(this.f39102e.getString(R.string.downloads_counter_multiple, t(app.J())));
            }
            LinearLayout linearLayout = this.f39111n;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
        } else {
            LinearLayout linearLayout2 = this.f39111n;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(4);
            }
        }
        this.f39105h.setText(app.s0());
        String v8 = app.v();
        if (v8 != null && v8.length() != 0) {
            TextView textView4 = this.f39107j;
            C1646m.a aVar = C1646m.f14265f;
            String v9 = app.v();
            AbstractC3255y.f(v9);
            textView4.setText(aVar.c(new SpannableStringBuilder(v9)));
        } else {
            this.f39107j.setText(app.p());
        }
        h(this.f39104g, app.l0());
        y(app, i9);
    }
}
