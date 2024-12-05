package o5;

import E4.j;
import X4.C1496f;
import X4.C1505o;
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
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3307A;
import l5.C3326n;
import l5.C3329q;

/* loaded from: classes5.dex */
public final class L0 extends AbstractC3554k {

    /* renamed from: d, reason: collision with root package name */
    private final W4.E f36598d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f36599e;

    /* renamed from: f, reason: collision with root package name */
    private final ImageView f36600f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f36601g;

    /* renamed from: h, reason: collision with root package name */
    private final ProgressBar f36602h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f36603i;

    /* renamed from: j, reason: collision with root package name */
    private final TextView f36604j;

    /* renamed from: k, reason: collision with root package name */
    private final TextView f36605k;

    /* renamed from: l, reason: collision with root package name */
    private final RelativeLayout f36606l;

    /* renamed from: m, reason: collision with root package name */
    private final TextView f36607m;

    /* renamed from: n, reason: collision with root package name */
    private final ImageView f36608n;

    /* renamed from: o, reason: collision with root package name */
    private final RelativeLayout f36609o;

    /* renamed from: p, reason: collision with root package name */
    private final TextView f36610p;

    /* renamed from: q, reason: collision with root package name */
    private final RelativeLayout f36611q;

    /* renamed from: r, reason: collision with root package name */
    private final RelativeLayout f36612r;

    /* renamed from: s, reason: collision with root package name */
    private final TextView f36613s;

    /* renamed from: t, reason: collision with root package name */
    private final ImageView f36614t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(View itemView, W4.E e8, Context context) {
        super(itemView, context);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(context, "context");
        this.f36598d = e8;
        this.f36599e = context;
        View findViewById = itemView.findViewById(R.id.iv_icon_update_item);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.iv_icon_update_item)");
        this.f36600f = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_name_update_item);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.tv_name_update_item)");
        TextView textView = (TextView) findViewById2;
        this.f36601g = textView;
        View findViewById3 = itemView.findViewById(R.id.pb_progress_update_item);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.….pb_progress_update_item)");
        this.f36602h = (ProgressBar) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_version_update_item);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.id.tv_version_update_item)");
        TextView textView2 = (TextView) findViewById4;
        this.f36603i = textView2;
        View findViewById5 = itemView.findViewById(R.id.tv_verified_by_uptodown_update_item);
        AbstractC3159y.h(findViewById5, "itemView.findViewById(R.…_by_uptodown_update_item)");
        TextView textView3 = (TextView) findViewById5;
        this.f36604j = textView3;
        View findViewById6 = itemView.findViewById(R.id.tv_action_update_item);
        AbstractC3159y.h(findViewById6, "itemView.findViewById(R.id.tv_action_update_item)");
        TextView textView4 = (TextView) findViewById6;
        this.f36605k = textView4;
        View findViewById7 = itemView.findViewById(R.id.rl_actions_update_item);
        AbstractC3159y.h(findViewById7, "itemView.findViewById(R.id.rl_actions_update_item)");
        this.f36606l = (RelativeLayout) findViewById7;
        View findViewById8 = itemView.findViewById(R.id.tv_excluded_update_item);
        AbstractC3159y.h(findViewById8, "itemView.findViewById(R.….tv_excluded_update_item)");
        TextView textView5 = (TextView) findViewById8;
        this.f36607m = textView5;
        View findViewById9 = itemView.findViewById(R.id.iv_version_details_update_item);
        AbstractC3159y.h(findViewById9, "itemView.findViewById(R.…sion_details_update_item)");
        this.f36608n = (ImageView) findViewById9;
        View findViewById10 = itemView.findViewById(R.id.rl_version_details_update_item);
        AbstractC3159y.h(findViewById10, "itemView.findViewById(R.…sion_details_update_item)");
        this.f36609o = (RelativeLayout) findViewById10;
        View findViewById11 = itemView.findViewById(R.id.tv_version_details_update_item);
        AbstractC3159y.h(findViewById11, "itemView.findViewById(R.…sion_details_update_item)");
        TextView textView6 = (TextView) findViewById11;
        this.f36610p = textView6;
        View findViewById12 = itemView.findViewById(R.id.rl_container_update_item);
        AbstractC3159y.h(findViewById12, "itemView.findViewById(R.…rl_container_update_item)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById12;
        this.f36611q = relativeLayout;
        View findViewById13 = itemView.findViewById(R.id.rl_cancel_update_item);
        AbstractC3159y.h(findViewById13, "itemView.findViewById(R.id.rl_cancel_update_item)");
        this.f36612r = (RelativeLayout) findViewById13;
        View findViewById14 = itemView.findViewById(R.id.tv_pending_update_item);
        AbstractC3159y.h(findViewById14, "itemView.findViewById(R.id.tv_pending_update_item)");
        TextView textView7 = (TextView) findViewById14;
        this.f36613s = textView7;
        View findViewById15 = itemView.findViewById(R.id.iv_cancel_update_item);
        AbstractC3159y.h(findViewById15, "itemView.findViewById(R.id.iv_cancel_update_item)");
        ImageView imageView = (ImageView) findViewById15;
        this.f36614t = imageView;
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: o5.I0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.k(L0.this, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: o5.J0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.l(L0.this, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o5.K0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.m(L0.this, view);
            }
        });
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        textView2.setTypeface(aVar.u());
        textView3.setTypeface(aVar.u());
        textView7.setTypeface(aVar.t());
        textView6.setTypeface(aVar.u());
        textView5.setTypeface(aVar.t());
        textView4.setTypeface(aVar.t());
    }

    private final void A() {
        this.f36612r.setVisibility(8);
        this.f36605k.setText(this.f36599e.getString(R.string.updates_button_update_app));
        this.f36605k.setTextColor(ContextCompat.getColor(this.f36599e, R.color.blue_primary));
        this.f36605k.setBackground(ContextCompat.getDrawable(this.f36599e, R.drawable.ripple_download_icon_button));
        this.f36608n.setVisibility(8);
        this.f36604j.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(L0 this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.f36598d != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f36598d.a(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        W4.E e8 = this$0.f36598d;
        if (e8 != null) {
            e8.c(this$0.getBindingAdapterPosition());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        W4.E e8 = this$0.f36598d;
        if (e8 != null) {
            e8.e(this$0.getBindingAdapterPosition());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(C1496f app, L0 this$0, View view) {
        AbstractC3159y.i(app, "$app");
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f28003B.a0()) {
            if (!app.Y()) {
                W4.E e8 = this$0.f36598d;
                if (e8 != null) {
                    e8.b(this$0.getBindingAdapterPosition());
                    return;
                }
                return;
            }
            W4.E e9 = this$0.f36598d;
            if (e9 != null) {
                e9.f(this$0.getBindingAdapterPosition());
            }
        }
    }

    private final void p(C1496f c1496f) {
        if (c1496f.f()) {
            this.itemView.setAlpha(0.3f);
        } else {
            this.itemView.setAlpha(1.0f);
        }
    }

    private final void q() {
        this.f36610p.setVisibility(8);
        this.f36609o.setVisibility(8);
        this.f36608n.setScaleY(1.0f);
        this.f36608n.setContentDescription(this.f36599e.getString(R.string.cd_expand_version_details));
    }

    private final void r() {
        this.f36609o.setVisibility(0);
        this.f36610p.setVisibility(0);
        this.f36608n.setScaleY(-1.0f);
        this.f36608n.setContentDescription(this.f36599e.getString(R.string.cd_collapse_version_details));
    }

    private final void s() {
        this.f36613s.setVisibility(0);
        this.f36605k.setVisibility(8);
        this.f36608n.setVisibility(8);
        this.f36612r.setVisibility(0);
    }

    private final void t() {
        this.f36612r.setVisibility(8);
        this.f36608n.setVisibility(0);
        this.f36605k.setText(this.f36599e.getString(R.string.updates_button_download_app));
        this.f36605k.setTextColor(ContextCompat.getColor(this.f36599e, R.color.white));
        this.f36605k.setBackground(ContextCompat.getDrawable(this.f36599e, R.drawable.ripple_blue_primary_button));
        this.f36604j.setVisibility(8);
    }

    private final void u(C1496f c1496f) {
        if (c1496f.c0() == C1496f.c.OUTDATED) {
            this.f36605k.setVisibility(0);
        } else {
            this.f36605k.setVisibility(8);
        }
        this.f36602h.setIndeterminate(false);
    }

    private final void v() {
        this.f36612r.setVisibility(8);
        this.f36608n.setVisibility(0);
        this.f36605k.setText(this.f36599e.getString(R.string.updates_button_download_app));
        this.f36605k.setTextColor(ContextCompat.getColor(this.f36599e, R.color.white));
        this.f36605k.setBackground(ContextCompat.getDrawable(this.f36599e, R.drawable.ripple_blue_primary_button));
        this.f36604j.setVisibility(8);
    }

    private final void w() {
        this.f36613s.setVisibility(8);
        this.f36605k.setVisibility(8);
        this.f36608n.setVisibility(0);
        this.f36612r.setVisibility(0);
        this.f36603i.setVisibility(0);
        this.f36607m.setVisibility(8);
        this.f36604j.setVisibility(0);
    }

    private final void x(String str) {
        this.f36607m.setText(str);
        this.f36607m.setVisibility(0);
        this.f36605k.setVisibility(8);
        this.f36604j.setVisibility(8);
        this.f36606l.setVisibility(8);
    }

    private final void y() {
        this.f36612r.setVisibility(8);
        this.f36605k.setVisibility(8);
        this.f36603i.setVisibility(0);
        this.f36603i.setText(this.f36599e.getString(R.string.installing));
        this.f36604j.setVisibility(0);
        this.f36602h.setIndeterminate(true);
        this.f36606l.setVisibility(8);
        e(this.f36602h, this.f36600f);
    }

    private final void z() {
        this.f36612r.setVisibility(8);
        this.f36608n.setVisibility(0);
        this.f36605k.setText(this.f36599e.getString(R.string.updates_button_resume));
        this.f36605k.setTextColor(ContextCompat.getColor(this.f36599e, R.color.white));
        this.f36605k.setBackground(ContextCompat.getDrawable(this.f36599e, R.drawable.ripple_blue_primary_button));
        this.f36603i.setVisibility(0);
        this.f36604j.setVisibility(8);
    }

    public final void n(final C1496f app) {
        String str;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        AbstractC3159y.i(app, "app");
        u(app);
        p(app);
        this.f36600f.setImageDrawable(C3307A.f34473a.k(this.f36599e, app.Q(), R.drawable.vector_uptodown_logo_bag_disabled));
        this.f36601g.setText(app.I());
        C3326n a8 = C3326n.f34504t.a(this.f36599e);
        a8.a();
        String Q8 = app.Q();
        AbstractC3159y.f(Q8);
        X4.O u02 = a8.u0(Q8);
        String Q9 = app.Q();
        AbstractC3159y.f(Q9);
        C1505o a02 = a8.a0(Q9);
        a8.g();
        if (u02 != null) {
            this.f36603i.setText(u02.z());
        } else {
            this.f36603i.setText(app.h0());
        }
        K4.a h8 = E4.j.f2274g.h();
        if (h8 != null) {
            str = h8.b();
        } else {
            str = null;
        }
        if (g6.n.s(str, app.Q(), true)) {
            y();
        } else if (u02 != null) {
            if (u02.j() != null) {
                File g8 = new C3329q().g(this.f36599e);
                String j8 = u02.j();
                AbstractC3159y.f(j8);
                z8 = new File(g8, j8).exists();
            } else {
                z8 = false;
            }
            if (!z8) {
                if (u02.o() > 0) {
                    u02.X(0);
                    a8.a();
                    a8.r1(u02);
                    a8.g();
                }
                UptodownApp.a aVar = UptodownApp.f28003B;
                if (aVar.O(this.f36599e)) {
                    String Q10 = app.Q();
                    AbstractC3159y.f(Q10);
                    if (!aVar.R(Q10) && !u02.b()) {
                        if (aVar.h()) {
                            t();
                        } else {
                            v();
                        }
                    } else {
                        s();
                    }
                } else if (aVar.W("downloadApkWorker", this.f36599e)) {
                    if (DownloadApkWorker.f30002k.d(app.c(), u02.u())) {
                        if (a02 != null) {
                            this.f36603i.setText(this.itemView.getContext().getString(R.string.percent_of_total_size, Integer.valueOf(a02.Z()), new N4.g().c(a02.a0())));
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
                    if (!z12 && u02.o() != 100) {
                        v();
                    } else {
                        A();
                    }
                }
            } else {
                ArrayList G8 = UptodownApp.f28003B.G();
                if (G8 != null) {
                    Iterator it = G8.iterator();
                    while (it.hasNext()) {
                        if (g6.n.s(((C1496f) it.next()).Q(), u02.n(), true)) {
                            z9 = true;
                            break;
                        }
                    }
                }
                z9 = false;
                if (a02 == null) {
                    if (z9 && u02.o() != 100) {
                        s();
                    } else if (u02.b()) {
                        this.f36603i.setText(this.itemView.getContext().getString(R.string.percent_of_total_size, Integer.valueOf(u02.o()), new N4.g().c(u02.s())));
                        w();
                    } else {
                        int o8 = u02.o();
                        if (1 <= o8 && o8 < 100) {
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
                } else if (DownloadApkWorker.f30002k.d(app.c(), u02.u())) {
                    this.f36603i.setText(this.itemView.getContext().getString(R.string.percent_of_total_size, Integer.valueOf(a02.Z()), new N4.g().c(a02.a0())));
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
                this.f36602h.setProgress(u02.o());
                if (u02.b()) {
                    e(this.f36602h, this.f36600f);
                } else {
                    app.H0(false);
                    c(this.f36602h, this.f36600f);
                }
            } else {
                this.f36602h.setProgress(a02.Z());
                if (DownloadApkWorker.f30002k.d(app.c(), u02.u())) {
                    e(this.f36602h, this.f36600f);
                } else {
                    app.H0(false);
                    c(this.f36602h, this.f36600f);
                }
            }
        } else {
            v();
        }
        if (u02 != null && u02.f() == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14 && !u02.b()) {
            String string = this.f36599e.getString(R.string.skipped_update);
            AbstractC3159y.h(string, "context.getString(R.string.skipped_update)");
            x(string);
        } else if (app.i() == 1 && (u02 == null || !u02.b())) {
            String string2 = this.f36599e.getString(R.string.disabled_updates);
            AbstractC3159y.h(string2, "context.getString(R.string.disabled_updates)");
            x(string2);
        } else {
            this.f36606l.setVisibility(0);
            this.f36607m.setVisibility(8);
        }
        if (app.Y()) {
            this.f36610p.setText(app.g0());
            r();
        } else {
            q();
        }
        if (app.g0() == null) {
            this.f36610p.setVisibility(8);
            this.f36609o.setVisibility(8);
            this.f36608n.setVisibility(8);
        } else if (app.Y()) {
            this.f36610p.setText(app.g0());
            r();
        } else {
            q();
        }
        this.f36608n.setOnClickListener(new View.OnClickListener() { // from class: o5.H0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.o(C1496f.this, this, view);
            }
        });
    }
}
