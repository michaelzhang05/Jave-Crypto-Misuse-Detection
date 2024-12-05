package r5;

import Z4.InterfaceC1590d;
import a5.C1639f;
import a5.C1641h;
import a5.C1648o;
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
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3667g;
import o5.C3674n;
import q5.C3854c;

/* renamed from: r5.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3938h extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private Context f38996a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3938h(View itemView, Context context) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(context, "context");
        this.f38996a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC1590d listener, C1641h app, View view) {
        AbstractC3255y.i(listener, "$listener");
        AbstractC3255y.i(app, "$app");
        listener.b(app);
    }

    private final void f(C1639f c1639f, a5.O o8, TextView textView) {
        if (o8 != null && o8.h() == 0) {
            textView.setText(this.f38996a.getString(R.string.status_download_update));
            textView.setTextColor(ContextCompat.getColor(this.f38996a, R.color.white));
            textView.setBackground(ContextCompat.getDrawable(this.f38996a, R.drawable.ripple_install_button));
        } else if (c1639f.h()) {
            textView.setText(this.f38996a.getString(R.string.dark_mode_disabled));
            textView.setTextColor(ContextCompat.getColor(this.f38996a, R.color.main_light_grey));
            textView.setBackground(ContextCompat.getDrawable(this.f38996a, R.drawable.bg_status_download_installed));
        } else {
            textView.setText(this.f38996a.getString(R.string.status_download_installed));
            textView.setTextColor(ContextCompat.getColor(this.f38996a, R.color.main_blue));
            textView.setBackground(ContextCompat.getDrawable(this.f38996a, R.drawable.shape_stroke_blue_primary));
        }
        textView.setTypeface(H4.j.f3824g.t());
    }

    private final void j(String str, ProgressBar progressBar, ImageView imageView, TextView textView, TextView textView2, LinearLayout linearLayout) {
        C3854c.f38326a.c(progressBar, imageView);
        linearLayout.setVisibility(8);
        if (textView2 != null) {
            g(str, textView2, textView);
        }
    }

    private final void k(int i8, long j8, ProgressBar progressBar, ImageView imageView, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout) {
        C3854c.f38326a.e(progressBar, imageView);
        textView.setVisibility(8);
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        linearLayout.setVisibility(0);
        if (i8 == 0) {
            progressBar.setIndeterminate(true);
            textView2.setText(this.f38996a.getString(R.string.status_download_update_pending));
        } else {
            progressBar.setIndeterminate(false);
            progressBar.setProgress(i8);
            textView2.setText(this.f38996a.getString(R.string.percent_of_total_size, Integer.valueOf(i8), new Q4.g().c(j8)));
        }
    }

    public final RelativeLayout.LayoutParams b(RelativeLayout.LayoutParams layoutParams, Context context, int i8, int i9) {
        AbstractC3255y.i(layoutParams, "<this>");
        AbstractC3255y.i(context, "context");
        int dimension = (int) context.getResources().getDimension(R.dimen.margin_m);
        if (AbstractC3255y.d(SettingsPreferences.f30353b.q(context), "ar")) {
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

    public final void c(View view, final InterfaceC1590d listener, final C1641h app) {
        AbstractC3255y.i(view, "<this>");
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(app, "app");
        view.setOnClickListener(new View.OnClickListener() { // from class: r5.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC3938h.d(InterfaceC1590d.this, app, view2);
            }
        });
    }

    public final void e(C1641h app, ProgressBar pb, ImageView ivIcon, TextView tvDesc, TextView tvProgress, TextView textView, LinearLayout llProgress) {
        a5.O o8;
        boolean z8;
        String y02;
        AbstractC3255y.i(app, "app");
        AbstractC3255y.i(pb, "pb");
        AbstractC3255y.i(ivIcon, "ivIcon");
        AbstractC3255y.i(tvDesc, "tvDesc");
        AbstractC3255y.i(tvProgress, "tvProgress");
        AbstractC3255y.i(llProgress, "llProgress");
        C3674n a8 = C3674n.f36505t.a(this.f38996a);
        a8.a();
        C1648o Z7 = a8.Z(String.valueOf(app.f0()));
        if (Z7 == null && (y02 = app.y0()) != null && y02.length() != 0) {
            String y03 = app.y0();
            AbstractC3255y.f(y03);
            Z7 = a8.a0(y03);
        }
        String y04 = app.y0();
        if (y04 != null && y04.length() != 0) {
            String y05 = app.y0();
            AbstractC3255y.f(y05);
            o8 = a8.u0(y05);
        } else {
            o8 = null;
        }
        boolean z9 = false;
        if (UptodownApp.f29058B.V("downloadApkWorker", this.f38996a) && DownloadApkWorker.f31034k.c(app.i())) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (Z7 != null && Z7.h0()) {
            z9 = true;
        }
        if (Z7 != null && (z8 || z9)) {
            k(Z7.Z(), Z7.a0(), pb, ivIcon, tvDesc, tvProgress, textView, llProgress);
        } else if (o8 != null && o8.a()) {
            k(o8.u(), o8.v(), pb, ivIcon, tvDesc, tvProgress, textView, llProgress);
        } else {
            j(app.y0(), pb, ivIcon, tvDesc, textView, llProgress);
        }
    }

    public final void g(String str, TextView tvStatus, TextView tvDesc) {
        AbstractC3255y.i(tvStatus, "tvStatus");
        AbstractC3255y.i(tvDesc, "tvDesc");
        if (new C3667g().r(str, this.f38996a)) {
            C3674n a8 = C3674n.f36505t.a(this.f38996a);
            a8.a();
            AbstractC3255y.f(str);
            a5.O u02 = a8.u0(str);
            C1639f S8 = a8.S(str);
            a8.l();
            if (S8 != null) {
                if (S8.i() == 0 && !S8.n0()) {
                    f(S8, u02, tvStatus);
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
        tvStatus.setText(this.f38996a.getString(R.string.status_download_installed));
        tvStatus.setTextColor(ContextCompat.getColor(this.f38996a, R.color.main_blue));
        tvStatus.setBackground(ContextCompat.getDrawable(this.f38996a, R.drawable.shape_stroke_blue_primary));
        tvStatus.setTypeface(H4.j.f3824g.t());
        tvStatus.setVisibility(8);
        tvDesc.setVisibility(0);
    }

    public final void h(ImageView iv, String str) {
        AbstractC3255y.i(iv, "iv");
        if (str != null) {
            com.squareup.picasso.s.h().l(str).l(R.drawable.shape_bg_placeholder).n(UptodownApp.f29058B.f0(this.f38996a)).i(iv);
        } else {
            iv.setImageDrawable(ContextCompat.getDrawable(this.f38996a, R.drawable.vector_app_icon_placeholder));
        }
    }

    public final void i(C1641h app, TextView tvName, TextView tvDesc) {
        AbstractC3255y.i(app, "app");
        AbstractC3255y.i(tvName, "tvName");
        AbstractC3255y.i(tvDesc, "tvDesc");
        tvName.setText(app.s0());
        String T02 = app.T0();
        if (T02 == null || T02.length() == 0) {
            T02 = app.p();
        }
        tvDesc.setText(T02);
    }
}
