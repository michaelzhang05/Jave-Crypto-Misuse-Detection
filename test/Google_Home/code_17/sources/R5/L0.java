package r5;

import H4.j;
import a5.C1639f;
import a5.C1648o;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.workers.DownloadApkWorker;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3655A;
import o5.C3674n;
import o5.C3677q;

/* loaded from: classes5.dex */
public final class L0 extends AbstractC3944k {

    /* renamed from: d, reason: collision with root package name */
    private final Z4.E f38806d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f38807e;

    /* renamed from: f, reason: collision with root package name */
    private final ImageView f38808f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f38809g;

    /* renamed from: h, reason: collision with root package name */
    private final ProgressBar f38810h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f38811i;

    /* renamed from: j, reason: collision with root package name */
    private final TextView f38812j;

    /* renamed from: k, reason: collision with root package name */
    private final TextView f38813k;

    /* renamed from: l, reason: collision with root package name */
    private final RelativeLayout f38814l;

    /* renamed from: m, reason: collision with root package name */
    private final TextView f38815m;

    /* renamed from: n, reason: collision with root package name */
    private final ImageView f38816n;

    /* renamed from: o, reason: collision with root package name */
    private final RelativeLayout f38817o;

    /* renamed from: p, reason: collision with root package name */
    private final TextView f38818p;

    /* renamed from: q, reason: collision with root package name */
    private final RelativeLayout f38819q;

    /* renamed from: r, reason: collision with root package name */
    private final RelativeLayout f38820r;

    /* renamed from: s, reason: collision with root package name */
    private final TextView f38821s;

    /* renamed from: t, reason: collision with root package name */
    private final ImageView f38822t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(View itemView, Z4.E e8, Context context) {
        super(itemView, context);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(context, "context");
        this.f38806d = e8;
        this.f38807e = context;
        View findViewById = itemView.findViewById(R.id.iv_icon_update_item);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.id.iv_icon_update_item)");
        this.f38808f = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_name_update_item);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.id.tv_name_update_item)");
        TextView textView = (TextView) findViewById2;
        this.f38809g = textView;
        View findViewById3 = itemView.findViewById(R.id.pb_progress_update_item);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.….pb_progress_update_item)");
        this.f38810h = (ProgressBar) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_version_update_item);
        AbstractC3255y.h(findViewById4, "itemView.findViewById(R.id.tv_version_update_item)");
        TextView textView2 = (TextView) findViewById4;
        this.f38811i = textView2;
        View findViewById5 = itemView.findViewById(R.id.tv_verified_by_uptodown_update_item);
        AbstractC3255y.h(findViewById5, "itemView.findViewById(R.…_by_uptodown_update_item)");
        TextView textView3 = (TextView) findViewById5;
        this.f38812j = textView3;
        View findViewById6 = itemView.findViewById(R.id.tv_action_update_item);
        AbstractC3255y.h(findViewById6, "itemView.findViewById(R.id.tv_action_update_item)");
        TextView textView4 = (TextView) findViewById6;
        this.f38813k = textView4;
        View findViewById7 = itemView.findViewById(R.id.rl_actions_update_item);
        AbstractC3255y.h(findViewById7, "itemView.findViewById(R.id.rl_actions_update_item)");
        this.f38814l = (RelativeLayout) findViewById7;
        View findViewById8 = itemView.findViewById(R.id.tv_excluded_update_item);
        AbstractC3255y.h(findViewById8, "itemView.findViewById(R.….tv_excluded_update_item)");
        TextView textView5 = (TextView) findViewById8;
        this.f38815m = textView5;
        View findViewById9 = itemView.findViewById(R.id.iv_version_details_update_item);
        AbstractC3255y.h(findViewById9, "itemView.findViewById(R.…sion_details_update_item)");
        this.f38816n = (ImageView) findViewById9;
        View findViewById10 = itemView.findViewById(R.id.rl_version_details_update_item);
        AbstractC3255y.h(findViewById10, "itemView.findViewById(R.…sion_details_update_item)");
        this.f38817o = (RelativeLayout) findViewById10;
        View findViewById11 = itemView.findViewById(R.id.tv_version_details_update_item);
        AbstractC3255y.h(findViewById11, "itemView.findViewById(R.…sion_details_update_item)");
        TextView textView6 = (TextView) findViewById11;
        this.f38818p = textView6;
        View findViewById12 = itemView.findViewById(R.id.rl_container_update_item);
        AbstractC3255y.h(findViewById12, "itemView.findViewById(R.…rl_container_update_item)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById12;
        this.f38819q = relativeLayout;
        View findViewById13 = itemView.findViewById(R.id.rl_cancel_update_item);
        AbstractC3255y.h(findViewById13, "itemView.findViewById(R.id.rl_cancel_update_item)");
        this.f38820r = (RelativeLayout) findViewById13;
        View findViewById14 = itemView.findViewById(R.id.tv_pending_update_item);
        AbstractC3255y.h(findViewById14, "itemView.findViewById(R.id.tv_pending_update_item)");
        TextView textView7 = (TextView) findViewById14;
        this.f38821s = textView7;
        View findViewById15 = itemView.findViewById(R.id.iv_cancel_update_item);
        AbstractC3255y.h(findViewById15, "itemView.findViewById(R.id.iv_cancel_update_item)");
        ImageView imageView = (ImageView) findViewById15;
        this.f38822t = imageView;
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: r5.I0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.k(L0.this, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: r5.J0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.l(L0.this, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: r5.K0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.m(L0.this, view);
            }
        });
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        textView2.setTypeface(aVar.u());
        textView3.setTypeface(aVar.u());
        textView7.setTypeface(aVar.t());
        textView6.setTypeface(aVar.u());
        textView5.setTypeface(aVar.t());
        textView4.setTypeface(aVar.t());
    }

    private final void A() {
        this.f38820r.setVisibility(8);
        this.f38813k.setText(this.f38807e.getString(R.string.updates_button_update_app));
        this.f38813k.setTextColor(ContextCompat.getColor(this.f38807e, R.color.blue_primary));
        this.f38813k.setBackground(ContextCompat.getDrawable(this.f38807e, R.drawable.ripple_download_icon_button));
        this.f38816n.setVisibility(8);
        this.f38812j.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(L0 this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.f38806d != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f38806d.a(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Z4.E e8 = this$0.f38806d;
        if (e8 != null) {
            e8.c(this$0.getBindingAdapterPosition());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Z4.E e8 = this$0.f38806d;
        if (e8 != null) {
            e8.e(this$0.getBindingAdapterPosition());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(C1639f app, L0 this$0, View view) {
        AbstractC3255y.i(app, "$app");
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            if (!app.Y()) {
                Z4.E e8 = this$0.f38806d;
                if (e8 != null) {
                    e8.b(this$0.getBindingAdapterPosition());
                    return;
                }
                return;
            }
            Z4.E e9 = this$0.f38806d;
            if (e9 != null) {
                e9.f(this$0.getBindingAdapterPosition());
            }
        }
    }

    private final void p(C1639f c1639f) {
        if (c1639f.h()) {
            this.itemView.setAlpha(0.3f);
        } else {
            this.itemView.setAlpha(1.0f);
        }
    }

    private final void q() {
        this.f38818p.setVisibility(8);
        this.f38817o.setVisibility(8);
        this.f38816n.setScaleY(1.0f);
        this.f38816n.setContentDescription(this.f38807e.getString(R.string.cd_expand_version_details));
    }

    private final void r() {
        this.f38817o.setVisibility(0);
        this.f38818p.setVisibility(0);
        this.f38816n.setScaleY(-1.0f);
        this.f38816n.setContentDescription(this.f38807e.getString(R.string.cd_collapse_version_details));
    }

    private final void s() {
        this.f38821s.setVisibility(0);
        this.f38813k.setVisibility(8);
        this.f38816n.setVisibility(8);
        this.f38820r.setVisibility(0);
    }

    private final void t() {
        this.f38820r.setVisibility(8);
        this.f38816n.setVisibility(0);
        this.f38813k.setText(this.f38807e.getString(R.string.updates_button_download_app));
        this.f38813k.setTextColor(ContextCompat.getColor(this.f38807e, R.color.white));
        this.f38813k.setBackground(ContextCompat.getDrawable(this.f38807e, R.drawable.ripple_blue_primary_button));
        this.f38812j.setVisibility(8);
    }

    private final void u(C1639f c1639f) {
        if (c1639f.c0() == C1639f.c.OUTDATED) {
            this.f38813k.setVisibility(0);
        } else {
            this.f38813k.setVisibility(8);
        }
        this.f38810h.setIndeterminate(false);
    }

    private final void v() {
        this.f38820r.setVisibility(8);
        this.f38816n.setVisibility(0);
        this.f38813k.setText(this.f38807e.getString(R.string.updates_button_download_app));
        this.f38813k.setTextColor(ContextCompat.getColor(this.f38807e, R.color.white));
        this.f38813k.setBackground(ContextCompat.getDrawable(this.f38807e, R.drawable.ripple_blue_primary_button));
        this.f38812j.setVisibility(8);
    }

    private final void w() {
        this.f38821s.setVisibility(8);
        this.f38813k.setVisibility(8);
        this.f38816n.setVisibility(0);
        this.f38820r.setVisibility(0);
        this.f38811i.setVisibility(0);
        this.f38815m.setVisibility(8);
        this.f38812j.setVisibility(0);
    }

    private final void x(String str) {
        this.f38815m.setText(str);
        this.f38815m.setVisibility(0);
        this.f38813k.setVisibility(8);
        this.f38812j.setVisibility(8);
        this.f38814l.setVisibility(8);
    }

    private final void y() {
        this.f38820r.setVisibility(8);
        this.f38813k.setVisibility(8);
        this.f38811i.setVisibility(0);
        this.f38811i.setText(this.f38807e.getString(R.string.installing));
        this.f38812j.setVisibility(0);
        this.f38810h.setIndeterminate(true);
        this.f38814l.setVisibility(8);
        e(this.f38810h, this.f38808f);
    }

    private final void z() {
        this.f38820r.setVisibility(8);
        this.f38816n.setVisibility(0);
        this.f38813k.setText(this.f38807e.getString(R.string.updates_button_resume));
        this.f38813k.setTextColor(ContextCompat.getColor(this.f38807e, R.color.white));
        this.f38813k.setBackground(ContextCompat.getDrawable(this.f38807e, R.drawable.ripple_blue_primary_button));
        this.f38811i.setVisibility(0);
        this.f38812j.setVisibility(8);
    }

    public final void n(final C1639f app) {
        String str;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        AbstractC3255y.i(app, "app");
        u(app);
        p(app);
        this.f38808f.setImageDrawable(C3655A.f36474a.k(this.f38807e, app.J(), R.drawable.vector_uptodown_logo_bag_disabled));
        this.f38809g.setText(app.z());
        C3674n a8 = C3674n.f36505t.a(this.f38807e);
        a8.a();
        String J8 = app.J();
        AbstractC3255y.f(J8);
        a5.O u02 = a8.u0(J8);
        String J9 = app.J();
        AbstractC3255y.f(J9);
        C1648o a02 = a8.a0(J9);
        a8.l();
        if (u02 != null) {
            this.f38811i.setText(u02.x());
        } else {
            this.f38811i.setText(app.h0());
        }
        N4.a h8 = H4.j.f3824g.h();
        if (h8 != null) {
            str = h8.b();
        } else {
            str = null;
        }
        if (j6.n.s(str, app.J(), true)) {
            y();
        } else if (u02 != null) {
            if (u02.l() != null) {
                File g8 = new C3677q().g(this.f38807e);
                String l8 = u02.l();
                AbstractC3255y.f(l8);
                z8 = new File(g8, l8).exists();
            } else {
                z8 = false;
            }
            if (!z8) {
                if (u02.u() > 0) {
                    u02.X(0);
                    a8.a();
                    a8.r1(u02);
                    a8.l();
                }
                UptodownApp.a aVar = UptodownApp.f29058B;
                if (aVar.O(this.f38807e)) {
                    String J10 = app.J();
                    AbstractC3255y.f(J10);
                    if (!aVar.R(J10) && !u02.a()) {
                        if (aVar.h()) {
                            t();
                        } else {
                            v();
                        }
                    } else {
                        s();
                    }
                } else if (aVar.W("downloadApkWorker", this.f38807e)) {
                    if (DownloadApkWorker.f31034k.d(app.b(), u02.w())) {
                        if (a02 != null) {
                            this.f38811i.setText(this.itemView.getContext().getString(R.string.percent_of_total_size, Integer.valueOf(a02.Z()), new Q4.g().c(a02.a0())));
                        }
                        s();
                    } else {
                        if (a02 != null && a02.h0()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            s();
                        } else if (aVar.h()) {
                            t();
                        } else {
                            v();
                        }
                    }
                } else {
                    if (a02 != null && a02.Z() == 100) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12 && u02.u() != 100) {
                        v();
                    } else {
                        A();
                    }
                }
            } else {
                ArrayList G8 = UptodownApp.f29058B.G();
                if (G8 != null) {
                    Iterator it = G8.iterator();
                    while (it.hasNext()) {
                        if (j6.n.s(((C1639f) it.next()).J(), u02.s(), true)) {
                            z9 = true;
                            break;
                        }
                    }
                }
                z9 = false;
                if (a02 == null) {
                    if (z9 && u02.u() != 100) {
                        s();
                    } else if (u02.a()) {
                        this.f38811i.setText(this.itemView.getContext().getString(R.string.percent_of_total_size, Integer.valueOf(u02.u()), new Q4.g().c(u02.v())));
                        w();
                    } else {
                        int u8 = u02.u();
                        if (1 <= u8 && u8 < 100) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            z();
                        } else {
                            A();
                        }
                    }
                } else if (a02.h0() && a02.Z() != 100) {
                    s();
                } else if (DownloadApkWorker.f31034k.d(app.b(), u02.w())) {
                    this.f38811i.setText(this.itemView.getContext().getString(R.string.percent_of_total_size, Integer.valueOf(a02.Z()), new Q4.g().c(a02.a0())));
                    w();
                } else {
                    int Z7 = a02.Z();
                    if (1 <= Z7 && Z7 < 100) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        z();
                    } else {
                        A();
                    }
                }
            }
            if (a02 == null) {
                this.f38810h.setProgress(u02.u());
                if (u02.a()) {
                    e(this.f38810h, this.f38808f);
                } else {
                    app.H0(false);
                    c(this.f38810h, this.f38808f);
                }
            } else {
                this.f38810h.setProgress(a02.Z());
                if (DownloadApkWorker.f31034k.d(app.b(), u02.w())) {
                    e(this.f38810h, this.f38808f);
                } else {
                    app.H0(false);
                    c(this.f38810h, this.f38808f);
                }
            }
        } else {
            v();
        }
        if (u02 != null && u02.h() == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14 && !u02.a()) {
            String string = this.f38807e.getString(R.string.skipped_update);
            AbstractC3255y.h(string, "context.getString(R.string.skipped_update)");
            x(string);
        } else if (app.i() == 1 && (u02 == null || !u02.a())) {
            String string2 = this.f38807e.getString(R.string.disabled_updates);
            AbstractC3255y.h(string2, "context.getString(R.string.disabled_updates)");
            x(string2);
        } else {
            this.f38814l.setVisibility(0);
            this.f38815m.setVisibility(8);
        }
        if (app.Y()) {
            this.f38818p.setText(app.g0());
            r();
        } else {
            q();
        }
        if (app.g0() == null) {
            this.f38818p.setVisibility(8);
            this.f38817o.setVisibility(8);
            this.f38816n.setVisibility(8);
        } else if (app.Y()) {
            this.f38818p.setText(app.g0());
            r();
        } else {
            q();
        }
        this.f38816n.setOnClickListener(new View.OnClickListener() { // from class: r5.H0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.o(C1639f.this, this, view);
            }
        });
    }
}
