package r5;

import Q4.w;
import Z4.InterfaceC1595i;
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
import com.uptodown.workers.DownloadWorker;
import java.io.File;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class r extends AbstractC3944k {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1595i f39065d;

    /* renamed from: e, reason: collision with root package name */
    private RelativeLayout f39066e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f39067f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f39068g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f39069h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f39070i;

    /* renamed from: j, reason: collision with root package name */
    private ProgressBar f39071j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f39072k;

    /* renamed from: l, reason: collision with root package name */
    private ImageView f39073l;

    /* renamed from: m, reason: collision with root package name */
    private TextView f39074m;

    /* renamed from: n, reason: collision with root package name */
    private ImageView f39075n;

    /* renamed from: o, reason: collision with root package name */
    private RelativeLayout f39076o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(android.view.View r3, Z4.InterfaceC1595i r4) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.r.<init>(android.view.View, Z4.i):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(r this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.f39065d != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f39065d.a(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(r this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.f39065d != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f39065d.c(bindingAdapterPosition);
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(r this$0, View view) {
        InterfaceC1595i interfaceC1595i;
        AbstractC3255y.i(this$0, "this$0");
        int bindingAdapterPosition = this$0.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1 && (interfaceC1595i = this$0.f39065d) != null) {
            interfaceC1595i.b(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(r this$0, View view) {
        InterfaceC1595i interfaceC1595i;
        AbstractC3255y.i(this$0, "this$0");
        int bindingAdapterPosition = this$0.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1 && (interfaceC1595i = this$0.f39065d) != null) {
            interfaceC1595i.d(bindingAdapterPosition);
        }
    }

    public final void o(C1648o download, boolean z8, boolean z9) {
        AbstractC3255y.i(download, "download");
        this.f39073l.setPadding(0, 0, 0, 0);
        String d02 = download.d0();
        if (d02 != null && d02.length() != 0) {
            com.squareup.picasso.w l8 = com.squareup.picasso.s.h().l(download.d0());
            UptodownApp.a aVar = UptodownApp.f29058B;
            Context context = this.itemView.getContext();
            AbstractC3255y.h(context, "itemView.context");
            l8.n(aVar.f0(context)).i(this.f39073l);
        } else {
            if (download.g() != null) {
                String g8 = download.g();
                AbstractC3255y.f(g8);
                if (j6.n.r(g8, ".apk", false, 2, null)) {
                    this.f39073l.setImageResource(R.drawable.core_vector_apk);
                }
            }
            if (download.g() != null) {
                w.a aVar2 = Q4.w.f9241b;
                String g9 = download.g();
                AbstractC3255y.f(g9);
                if (aVar2.a(g9)) {
                    this.f39073l.setImageResource(R.drawable.core_vector_xapk);
                }
            }
            this.f39073l.setImageDrawable(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.core_vector_apk));
        }
        this.f39067f.setText(download.X());
        if (download.e0() > 0) {
            this.f39068g.setText(String.valueOf(download.e0()));
        }
        this.f39075n.setVisibility(8);
        if (download.z() == 1) {
            TextView textView = this.f39069h;
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34167a;
            String format = String.format(Locale.getDefault(), "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(download.Z())}, 1));
            AbstractC3255y.h(format, "format(...)");
            textView.setText(format);
            this.f39070i.setVisibility(8);
            this.f39071j.setProgress(download.Z());
            this.f39071j.setVisibility(0);
            this.f39074m.setText("");
            this.f39074m.setVisibility(8);
            this.f39076o.setVisibility(0);
            this.f39072k.setVisibility(0);
        } else {
            this.f39070i.setVisibility(0);
            if (download.i0()) {
                this.f39071j.setIndeterminate(true);
                this.f39071j.setVisibility(8);
                this.f39070i.setVisibility(8);
                this.f39069h.setText("");
                this.f39074m.setText(this.itemView.getContext().getString(R.string.installing));
                this.f39074m.setTextColor(ContextCompat.getColor(this.itemView.getContext(), R.color.download_installed_status));
                this.f39074m.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.bg_status_download_installed));
                this.f39076o.setVisibility(8);
                e(this.f39071j, this.f39073l);
            } else {
                String g10 = download.g();
                AbstractC3255y.f(g10);
                File file = new File(g10);
                this.f39070i.setText(DateFormat.getDateTimeInstance().format(new Date(file.lastModified())));
                this.f39071j.setVisibility(4);
                this.f39069h.setText(new Q4.g().c(file.length()));
                this.f39074m.setText(this.itemView.getContext().getString(R.string.option_button_install));
                this.f39074m.setTextColor(ContextCompat.getColor(this.itemView.getContext(), R.color.white));
                this.f39074m.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.shape_bg_accent_green));
                this.f39074m.setVisibility(0);
                this.f39076o.setVisibility(8);
                c(this.f39071j, this.f39073l);
            }
        }
        if (download.g0() > -1 && download.f0() > -1) {
            this.f39074m.setVisibility(0);
            this.f39071j.setVisibility(4);
            this.f39076o.setVisibility(8);
            this.f39072k.setVisibility(8);
            if (download.g0() > download.f0()) {
                this.f39074m.setText(this.itemView.getContext().getString(R.string.status_download_oldversion));
                this.f39074m.setTextColor(ContextCompat.getColor(this.itemView.getContext(), R.color.white));
                this.f39074m.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.bg_status_download_outdate));
            } else if (download.g0() < download.f0()) {
                this.f39074m.setText(this.itemView.getContext().getString(R.string.action_update));
                this.f39074m.setTextColor(ContextCompat.getColor(this.itemView.getContext(), R.color.white));
                this.f39074m.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.shape_bg_accent_green));
            } else {
                this.f39074m.setText(this.itemView.getContext().getString(R.string.status_download_installed));
                this.f39074m.setTextColor(ContextCompat.getColor(this.itemView.getContext(), R.color.download_installed_status));
                this.f39074m.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.bg_status_download_installed));
            }
        }
        if (z8) {
            if (z9) {
                this.f39066e.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.shape_bg_selected_item));
                return;
            } else {
                this.f39066e.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_bg_card));
                return;
            }
        }
        this.f39066e.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_bg_card));
    }

    public final void p(C1648o download, boolean z8, boolean z9) {
        boolean z10;
        AbstractC3255y.i(download, "download");
        String d02 = download.d0();
        if (d02 != null && d02.length() != 0) {
            ImageView imageView = this.f39073l;
            int dimension = (int) this.itemView.getContext().getResources().getDimension(R.dimen.downloading_item_icon_padding);
            imageView.setPadding(dimension, dimension, dimension, dimension);
            com.squareup.picasso.w l8 = com.squareup.picasso.s.h().l(download.d0());
            UptodownApp.a aVar = UptodownApp.f29058B;
            Context context = this.itemView.getContext();
            AbstractC3255y.h(context, "itemView.context");
            l8.n(aVar.f0(context)).i(this.f39073l);
        }
        String X7 = download.X();
        if (X7 == null) {
            X7 = download.Y() + download.e0();
        }
        this.f39067f.setText(X7);
        this.f39068g.setText(String.valueOf(download.e0()));
        this.f39070i.setVisibility(8);
        if (download.a0() == 0) {
            this.f39069h.setVisibility(8);
        } else {
            this.f39069h.setVisibility(0);
            this.f39069h.setText(new Q4.g().c(download.a0()));
        }
        this.f39076o.setVisibility(0);
        this.f39072k.setVisibility(0);
        this.f39075n.setVisibility(8);
        this.f39074m.setVisibility(8);
        this.f39071j.setVisibility(0);
        int Z7 = download.Z();
        if (1 <= Z7 && Z7 < 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            UptodownApp.a aVar2 = UptodownApp.f29058B;
            Context context2 = this.itemView.getContext();
            AbstractC3255y.h(context2, "itemView.context");
            if (aVar2.V("downloadApkWorker", context2) && DownloadApkWorker.f31034k.d(download.h(), download.e0())) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            TextView textView = this.f39069h;
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34167a;
            String format = String.format("%s/%s", Arrays.copyOf(new Object[]{new Q4.g().c(download.u()), new Q4.g().c(download.a0())}, 2));
            AbstractC3255y.h(format, "format(...)");
            textView.setText(format);
            TextView textView2 = this.f39070i;
            String format2 = String.format(Locale.getDefault(), "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(download.Z())}, 1));
            AbstractC3255y.h(format2, "format(...)");
            textView2.setText(format2);
            this.f39070i.setVisibility(0);
            this.f39071j.setIndeterminate(false);
            this.f39071j.setProgress(download.Z());
            this.f39076o.setVisibility(0);
            if (DownloadWorker.f31052c.c()) {
                this.f39072k.setVisibility(8);
                this.f39075n.setVisibility(0);
            } else {
                this.f39072k.setVisibility(0);
                this.f39075n.setVisibility(8);
            }
        } else {
            TextView textView3 = this.f39069h;
            kotlin.jvm.internal.Y y9 = kotlin.jvm.internal.Y.f34167a;
            String format3 = String.format("%s/%s", Arrays.copyOf(new Object[]{new Q4.g().c(download.u()), new Q4.g().c(download.a0())}, 2));
            AbstractC3255y.h(format3, "format(...)");
            textView3.setText(format3);
            TextView textView4 = this.f39070i;
            String format4 = String.format(Locale.getDefault(), "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(download.Z())}, 1));
            AbstractC3255y.h(format4, "format(...)");
            textView4.setText(format4);
            this.f39070i.setVisibility(0);
            this.f39071j.setIndeterminate(true);
        }
        if (z8) {
            if (z9) {
                this.f39066e.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.shape_bg_selected_item));
            } else {
                this.f39066e.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_bg_card));
            }
        }
    }
}
