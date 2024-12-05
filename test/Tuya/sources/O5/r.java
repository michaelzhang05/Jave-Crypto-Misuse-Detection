package o5;

import N4.w;
import W4.InterfaceC1486i;
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
import com.uptodown.workers.DownloadWorker;
import java.io.File;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class r extends AbstractC3554k {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1486i f36857d;

    /* renamed from: e, reason: collision with root package name */
    private RelativeLayout f36858e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f36859f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f36860g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f36861h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f36862i;

    /* renamed from: j, reason: collision with root package name */
    private ProgressBar f36863j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f36864k;

    /* renamed from: l, reason: collision with root package name */
    private ImageView f36865l;

    /* renamed from: m, reason: collision with root package name */
    private TextView f36866m;

    /* renamed from: n, reason: collision with root package name */
    private ImageView f36867n;

    /* renamed from: o, reason: collision with root package name */
    private RelativeLayout f36868o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(android.view.View r3, W4.InterfaceC1486i r4) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.r.<init>(android.view.View, W4.i):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(r this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.f36857d != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f36857d.a(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(r this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.f36857d != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f36857d.c(bindingAdapterPosition);
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(r this$0, View view) {
        InterfaceC1486i interfaceC1486i;
        AbstractC3159y.i(this$0, "this$0");
        int bindingAdapterPosition = this$0.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1 && (interfaceC1486i = this$0.f36857d) != null) {
            interfaceC1486i.b(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(r this$0, View view) {
        InterfaceC1486i interfaceC1486i;
        AbstractC3159y.i(this$0, "this$0");
        int bindingAdapterPosition = this$0.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1 && (interfaceC1486i = this$0.f36857d) != null) {
            interfaceC1486i.d(bindingAdapterPosition);
        }
    }

    public final void o(C1505o download, boolean z8, boolean z9) {
        AbstractC3159y.i(download, "download");
        this.f36865l.setPadding(0, 0, 0, 0);
        String d02 = download.d0();
        if (d02 != null && d02.length() != 0) {
            com.squareup.picasso.w l8 = com.squareup.picasso.s.h().l(download.d0());
            UptodownApp.a aVar = UptodownApp.f28003B;
            Context context = this.itemView.getContext();
            AbstractC3159y.h(context, "itemView.context");
            l8.n(aVar.f0(context)).i(this.f36865l);
        } else {
            if (download.e() != null) {
                String e8 = download.e();
                AbstractC3159y.f(e8);
                if (g6.n.r(e8, ".apk", false, 2, null)) {
                    this.f36865l.setImageResource(R.drawable.core_vector_apk);
                }
            }
            if (download.e() != null) {
                w.a aVar2 = N4.w.f7281b;
                String e9 = download.e();
                AbstractC3159y.f(e9);
                if (aVar2.a(e9)) {
                    this.f36865l.setImageResource(R.drawable.core_vector_xapk);
                }
            }
            this.f36865l.setImageDrawable(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.core_vector_apk));
        }
        this.f36859f.setText(download.X());
        if (download.e0() > 0) {
            this.f36860g.setText(String.valueOf(download.e0()));
        }
        this.f36867n.setVisibility(8);
        if (download.I() == 1) {
            TextView textView = this.f36861h;
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f33766a;
            String format = String.format(Locale.getDefault(), "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(download.Z())}, 1));
            AbstractC3159y.h(format, "format(...)");
            textView.setText(format);
            this.f36862i.setVisibility(8);
            this.f36863j.setProgress(download.Z());
            this.f36863j.setVisibility(0);
            this.f36866m.setText("");
            this.f36866m.setVisibility(8);
            this.f36868o.setVisibility(0);
            this.f36864k.setVisibility(0);
        } else {
            this.f36862i.setVisibility(0);
            if (download.i0()) {
                this.f36863j.setIndeterminate(true);
                this.f36863j.setVisibility(8);
                this.f36862i.setVisibility(8);
                this.f36861h.setText("");
                this.f36866m.setText(this.itemView.getContext().getString(R.string.installing));
                this.f36866m.setTextColor(ContextCompat.getColor(this.itemView.getContext(), R.color.download_installed_status));
                this.f36866m.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.bg_status_download_installed));
                this.f36868o.setVisibility(8);
                e(this.f36863j, this.f36865l);
            } else {
                String e10 = download.e();
                AbstractC3159y.f(e10);
                File file = new File(e10);
                this.f36862i.setText(DateFormat.getDateTimeInstance().format(new Date(file.lastModified())));
                this.f36863j.setVisibility(4);
                this.f36861h.setText(new N4.g().c(file.length()));
                this.f36866m.setText(this.itemView.getContext().getString(R.string.option_button_install));
                this.f36866m.setTextColor(ContextCompat.getColor(this.itemView.getContext(), R.color.white));
                this.f36866m.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.shape_bg_accent_green));
                this.f36866m.setVisibility(0);
                this.f36868o.setVisibility(8);
                c(this.f36863j, this.f36865l);
            }
        }
        if (download.g0() > -1 && download.f0() > -1) {
            this.f36866m.setVisibility(0);
            this.f36863j.setVisibility(4);
            this.f36868o.setVisibility(8);
            this.f36864k.setVisibility(8);
            if (download.g0() > download.f0()) {
                this.f36866m.setText(this.itemView.getContext().getString(R.string.status_download_oldversion));
                this.f36866m.setTextColor(ContextCompat.getColor(this.itemView.getContext(), R.color.white));
                this.f36866m.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.bg_status_download_outdate));
            } else if (download.g0() < download.f0()) {
                this.f36866m.setText(this.itemView.getContext().getString(R.string.action_update));
                this.f36866m.setTextColor(ContextCompat.getColor(this.itemView.getContext(), R.color.white));
                this.f36866m.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.shape_bg_accent_green));
            } else {
                this.f36866m.setText(this.itemView.getContext().getString(R.string.status_download_installed));
                this.f36866m.setTextColor(ContextCompat.getColor(this.itemView.getContext(), R.color.download_installed_status));
                this.f36866m.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.bg_status_download_installed));
            }
        }
        if (z8) {
            if (z9) {
                this.f36858e.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.shape_bg_selected_item));
                return;
            } else {
                this.f36858e.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_bg_card));
                return;
            }
        }
        this.f36858e.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_bg_card));
    }

    public final void p(C1505o download, boolean z8, boolean z9) {
        boolean z10;
        AbstractC3159y.i(download, "download");
        String d02 = download.d0();
        if (d02 != null && d02.length() != 0) {
            ImageView imageView = this.f36865l;
            int dimension = (int) this.itemView.getContext().getResources().getDimension(R.dimen.downloading_item_icon_padding);
            imageView.setPadding(dimension, dimension, dimension, dimension);
            com.squareup.picasso.w l8 = com.squareup.picasso.s.h().l(download.d0());
            UptodownApp.a aVar = UptodownApp.f28003B;
            Context context = this.itemView.getContext();
            AbstractC3159y.h(context, "itemView.context");
            l8.n(aVar.f0(context)).i(this.f36865l);
        }
        String X7 = download.X();
        if (X7 == null) {
            X7 = download.Y() + download.e0();
        }
        this.f36859f.setText(X7);
        this.f36860g.setText(String.valueOf(download.e0()));
        this.f36862i.setVisibility(8);
        if (download.a0() == 0) {
            this.f36861h.setVisibility(8);
        } else {
            this.f36861h.setVisibility(0);
            this.f36861h.setText(new N4.g().c(download.a0()));
        }
        this.f36868o.setVisibility(0);
        this.f36864k.setVisibility(0);
        this.f36867n.setVisibility(8);
        this.f36866m.setVisibility(8);
        this.f36863j.setVisibility(0);
        int Z7 = download.Z();
        if (1 <= Z7 && Z7 < 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            UptodownApp.a aVar2 = UptodownApp.f28003B;
            Context context2 = this.itemView.getContext();
            AbstractC3159y.h(context2, "itemView.context");
            if (aVar2.V("downloadApkWorker", context2) && DownloadApkWorker.f30002k.d(download.f(), download.e0())) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            TextView textView = this.f36861h;
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f33766a;
            String format = String.format("%s/%s", Arrays.copyOf(new Object[]{new N4.g().c(download.o()), new N4.g().c(download.a0())}, 2));
            AbstractC3159y.h(format, "format(...)");
            textView.setText(format);
            TextView textView2 = this.f36862i;
            String format2 = String.format(Locale.getDefault(), "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(download.Z())}, 1));
            AbstractC3159y.h(format2, "format(...)");
            textView2.setText(format2);
            this.f36862i.setVisibility(0);
            this.f36863j.setIndeterminate(false);
            this.f36863j.setProgress(download.Z());
            this.f36868o.setVisibility(0);
            if (DownloadWorker.f30020c.c()) {
                this.f36864k.setVisibility(8);
                this.f36867n.setVisibility(0);
            } else {
                this.f36864k.setVisibility(0);
                this.f36867n.setVisibility(8);
            }
        } else {
            TextView textView3 = this.f36861h;
            kotlin.jvm.internal.Y y9 = kotlin.jvm.internal.Y.f33766a;
            String format3 = String.format("%s/%s", Arrays.copyOf(new Object[]{new N4.g().c(download.o()), new N4.g().c(download.a0())}, 2));
            AbstractC3159y.h(format3, "format(...)");
            textView3.setText(format3);
            TextView textView4 = this.f36862i;
            String format4 = String.format(Locale.getDefault(), "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(download.Z())}, 1));
            AbstractC3159y.h(format4, "format(...)");
            textView4.setText(format4);
            this.f36862i.setVisibility(0);
            this.f36863j.setIndeterminate(true);
        }
        if (z8) {
            if (z9) {
                this.f36858e.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.shape_bg_selected_item));
            } else {
                this.f36858e.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_bg_card));
            }
        }
    }
}
