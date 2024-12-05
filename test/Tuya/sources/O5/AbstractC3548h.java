package o5;

import W4.InterfaceC1481d;
import X4.C1496f;
import X4.C1498h;
import X4.C1505o;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.workers.DownloadApkWorker;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3319g;
import l5.C3326n;
import n5.C3475c;

/* renamed from: o5.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3548h extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private Context f36788a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3548h(View itemView, Context context) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(context, "context");
        this.f36788a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC1481d listener, C1498h app, View view) {
        AbstractC3159y.i(listener, "$listener");
        AbstractC3159y.i(app, "$app");
        listener.b(app);
    }

    private final void f(C1496f c1496f, X4.O o8, TextView textView) {
        if (o8 != null && o8.f() == 0) {
            textView.setText(this.f36788a.getString(R.string.status_download_update));
            textView.setTextColor(ContextCompat.getColor(this.f36788a, R.color.white));
            textView.setBackground(ContextCompat.getDrawable(this.f36788a, R.drawable.ripple_install_button));
        } else if (c1496f.f()) {
            textView.setText(this.f36788a.getString(R.string.dark_mode_disabled));
            textView.setTextColor(ContextCompat.getColor(this.f36788a, R.color.main_light_grey));
            textView.setBackground(ContextCompat.getDrawable(this.f36788a, R.drawable.bg_status_download_installed));
        } else {
            textView.setText(this.f36788a.getString(R.string.status_download_installed));
            textView.setTextColor(ContextCompat.getColor(this.f36788a, R.color.main_blue));
            textView.setBackground(ContextCompat.getDrawable(this.f36788a, R.drawable.shape_stroke_blue_primary));
        }
        textView.setTypeface(E4.j.f2274g.t());
    }

    private final void j(String str, ProgressBar progressBar, ImageView imageView, TextView textView, TextView textView2, LinearLayout linearLayout) {
        C3475c.f36198a.c(progressBar, imageView);
        linearLayout.setVisibility(8);
        if (textView2 != null) {
            g(str, textView2, textView);
        }
    }

    private final void k(int i8, long j8, ProgressBar progressBar, ImageView imageView, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout) {
        C3475c.f36198a.e(progressBar, imageView);
        textView.setVisibility(8);
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        linearLayout.setVisibility(0);
        if (i8 == 0) {
            progressBar.setIndeterminate(true);
            textView2.setText(this.f36788a.getString(R.string.status_download_update_pending));
        } else {
            progressBar.setIndeterminate(false);
            progressBar.setProgress(i8);
            textView2.setText(this.f36788a.getString(R.string.percent_of_total_size, Integer.valueOf(i8), new N4.g().c(j8)));
        }
    }

    public final RelativeLayout.LayoutParams b(RelativeLayout.LayoutParams layoutParams, Context context, int i8, int i9) {
        AbstractC3159y.i(layoutParams, "<this>");
        AbstractC3159y.i(context, "context");
        int dimension = (int) context.getResources().getDimension(R.dimen.margin_m);
        if (AbstractC3159y.d(SettingsPreferences.f29323b.q(context), "ar")) {
            if (i8 == i9) {
                layoutParams.setMargins(dimension, 0, 0, 0);
            } else if (i8 == 1) {
                layoutParams.setMargins(dimension, 0, dimension, 0);
            } else {
                layoutParams.setMargins(dimension, 0, 0, 0);
            }
        } else if (i8 == i9) {
            layoutParams.setMargins(dimension, 0, dimension, 0);
        } else {
            layoutParams.setMargins(dimension, 0, 0, 0);
        }
        return layoutParams;
    }

    public final void c(View view, final InterfaceC1481d listener, final C1498h app) {
        AbstractC3159y.i(view, "<this>");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(app, "app");
        view.setOnClickListener(new View.OnClickListener() { // from class: o5.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC3548h.d(InterfaceC1481d.this, app, view2);
            }
        });
    }

    public final void e(C1498h app, ProgressBar pb, ImageView ivIcon, TextView tvDesc, TextView tvProgress, TextView textView, LinearLayout llProgress) {
        X4.O o8;
        boolean z8;
        String y02;
        AbstractC3159y.i(app, "app");
        AbstractC3159y.i(pb, "pb");
        AbstractC3159y.i(ivIcon, "ivIcon");
        AbstractC3159y.i(tvDesc, "tvDesc");
        AbstractC3159y.i(tvProgress, "tvProgress");
        AbstractC3159y.i(llProgress, "llProgress");
        C3326n a8 = C3326n.f34504t.a(this.f36788a);
        a8.a();
        C1505o Z7 = a8.Z(String.valueOf(app.f0()));
        if (Z7 == null && (y02 = app.y0()) != null && y02.length() != 0) {
            String y03 = app.y0();
            AbstractC3159y.f(y03);
            Z7 = a8.a0(y03);
        }
        String y04 = app.y0();
        if (y04 != null && y04.length() != 0) {
            String y05 = app.y0();
            AbstractC3159y.f(y05);
            o8 = a8.u0(y05);
        } else {
            o8 = null;
        }
        boolean z9 = false;
        if (UptodownApp.f28003B.V("downloadApkWorker", this.f36788a) && DownloadApkWorker.f30002k.c(app.i())) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (Z7 != null && Z7.h0()) {
            z9 = true;
        }
        if (Z7 != null && (z8 || z9)) {
            k(Z7.Z(), Z7.a0(), pb, ivIcon, tvDesc, tvProgress, textView, llProgress);
        } else if (o8 != null && o8.b()) {
            k(o8.o(), o8.s(), pb, ivIcon, tvDesc, tvProgress, textView, llProgress);
        } else {
            j(app.y0(), pb, ivIcon, tvDesc, textView, llProgress);
        }
    }

    public final void g(String str, TextView tvStatus, TextView tvDesc) {
        AbstractC3159y.i(tvStatus, "tvStatus");
        AbstractC3159y.i(tvDesc, "tvDesc");
        if (new C3319g().r(str, this.f36788a)) {
            C3326n a8 = C3326n.f34504t.a(this.f36788a);
            a8.a();
            AbstractC3159y.f(str);
            X4.O u02 = a8.u0(str);
            C1496f S7 = a8.S(str);
            a8.g();
            if (S7 != null) {
                if (S7.i() == 0 && !S7.n0()) {
                    f(S7, u02, tvStatus);
                    tvStatus.setVisibility(0);
                    tvDesc.setVisibility(8);
                    return;
                } else {
                    tvStatus.setVisibility(8);
                    tvDesc.setVisibility(0);
                    return;
                }
            }
            tvStatus.setVisibility(0);
            tvDesc.setVisibility(8);
            return;
        }
        tvStatus.setText(this.f36788a.getString(R.string.status_download_installed));
        tvStatus.setTextColor(ContextCompat.getColor(this.f36788a, R.color.main_blue));
        tvStatus.setBackground(ContextCompat.getDrawable(this.f36788a, R.drawable.shape_stroke_blue_primary));
        tvStatus.setTypeface(E4.j.f2274g.t());
        tvStatus.setVisibility(8);
        tvDesc.setVisibility(0);
    }

    public final void h(ImageView iv, String str) {
        AbstractC3159y.i(iv, "iv");
        if (str != null) {
            com.squareup.picasso.s.h().l(str).l(R.drawable.shape_bg_placeholder).n(UptodownApp.f28003B.f0(this.f36788a)).i(iv);
        } else {
            iv.setImageDrawable(ContextCompat.getDrawable(this.f36788a, R.drawable.vector_app_icon_placeholder));
        }
    }

    public final void i(C1498h app, TextView tvName, TextView tvDesc) {
        AbstractC3159y.i(app, "app");
        AbstractC3159y.i(tvName, "tvName");
        AbstractC3159y.i(tvDesc, "tvDesc");
        tvName.setText(app.s0());
        String T02 = app.T0();
        if (T02 == null || T02.length() == 0) {
            T02 = app.k();
        }
        tvDesc.setText(T02);
    }
}
