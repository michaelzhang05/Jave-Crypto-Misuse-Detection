package r5;

import a5.C1639f;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.io.File;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3667g;
import o5.C3674n;
import o5.C3677q;

/* loaded from: classes5.dex */
public final class e1 extends AbstractC3944k {

    /* renamed from: d, reason: collision with root package name */
    private final W4.H0 f38975d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f38976e;

    /* renamed from: f, reason: collision with root package name */
    private final Z4.M f38977f;

    /* renamed from: g, reason: collision with root package name */
    private a f38978g;

    /* loaded from: classes5.dex */
    public enum a {
        DOWNLOAD,
        OPEN,
        INSTALLING
    }

    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38983a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.INSTALLING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38983a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e1(W4.H0 r3, android.content.Context r4, Z4.M r5) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.AbstractC3255y.i(r3, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.AbstractC3255y.i(r4, r0)
            android.widget.RelativeLayout r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.AbstractC3255y.h(r0, r1)
            r2.<init>(r0, r4)
            r2.f38975d = r3
            r2.f38976e = r4
            r2.f38977f = r5
            r5.e1$a r4 = r5.e1.a.DOWNLOAD
            r2.f38978g = r4
            android.widget.RelativeLayout r4 = r3.f11790h
            r5.b1 r5 = new r5.b1
            r5.<init>()
            r4.setOnClickListener(r5)
            android.widget.RelativeLayout r4 = r3.f11790h
            r5.c1 r5 = new r5.c1
            r5.<init>()
            r4.setOnLongClickListener(r5)
            android.widget.RelativeLayout r4 = r3.f11788f
            r5.d1 r5 = new r5.d1
            r5.<init>()
            r4.setOnClickListener(r5)
            android.widget.TextView r4 = r3.f11792j
            H4.j$a r5 = H4.j.f3824g
            android.graphics.Typeface r0 = r5.t()
            r4.setTypeface(r0)
            android.widget.TextView r4 = r3.f11793k
            android.graphics.Typeface r0 = r5.t()
            r4.setTypeface(r0)
            android.widget.TextView r4 = r3.f11796n
            android.graphics.Typeface r0 = r5.u()
            r4.setTypeface(r0)
            android.widget.TextView r3 = r3.f11795m
            android.graphics.Typeface r4 = r5.t()
            r3.setTypeface(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.e1.<init>(W4.H0, android.content.Context, Z4.M):void");
    }

    private final boolean A(a5.O o8) {
        if (o8.l() != null) {
            File g8 = new C3677q().g(this.f38976e);
            String l8 = o8.l();
            AbstractC3255y.f(l8);
            return new File(g8, l8).exists();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(e1 this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.f38977f != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f38977f.a(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(e1 this$0, View it) {
        int bindingAdapterPosition;
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.f38977f != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            Z4.M m8 = this$0.f38977f;
            AbstractC3255y.h(it, "it");
            m8.b(it, bindingAdapterPosition);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(e1 this$0, View view) {
        Z4.M m8;
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            int i8 = b.f38983a[this$0.f38978g.ordinal()];
            if (i8 != 1) {
                if (i8 == 2 && (m8 = this$0.f38977f) != null) {
                    m8.d(this$0.getBindingAdapterPosition());
                    return;
                }
                return;
            }
            Z4.M m9 = this$0.f38977f;
            if (m9 != null) {
                m9.c(this$0.getBindingAdapterPosition());
            }
        }
    }

    private final boolean m(C1639f c1639f) {
        PackageManager packageManager = this.f38976e.getPackageManager();
        AbstractC3255y.h(packageManager, "context.packageManager");
        String J8 = c1639f.J();
        AbstractC3255y.f(J8);
        ApplicationInfo a8 = Q4.q.a(packageManager, J8, 0);
        if (c1639f.i() != 0 || !a8.enabled) {
            return false;
        }
        return true;
    }

    private final void o(ProgressBar progressBar) {
        progressBar.setVisibility(8);
    }

    private final void p(a5.O o8, TextView textView) {
        if (o8 != null && o8.h() == 0) {
            textView.setText(this.f38976e.getString(R.string.status_download_update));
            textView.setTypeface(H4.j.f3824g.t());
            textView.setTextColor(ContextCompat.getColor(this.f38976e, R.color.white));
            textView.setBackground(ContextCompat.getDrawable(this.f38976e, R.drawable.ripple_install_button));
        } else {
            textView.setText(this.f38976e.getString(R.string.status_download_installed));
            textView.setTextColor(ContextCompat.getColor(this.f38976e, R.color.download_installed_status));
            textView.setBackground(ContextCompat.getDrawable(this.f38976e, R.drawable.bg_status_download_installed));
        }
        textView.setVisibility(0);
    }

    private final void q(String str, TextView textView) {
        if (new C3667g().r(str, this.f38976e)) {
            C3674n a8 = C3674n.f36505t.a(this.f38976e);
            a8.a();
            a5.O u02 = a8.u0(str);
            C1639f S8 = a8.S(str);
            a8.l();
            if (S8 != null) {
                if (m(S8)) {
                    p(u02, textView);
                } else {
                    textView.setVisibility(8);
                }
            }
        }
    }

    private final void r() {
        this.f38975d.f11789g.setVisibility(0);
        this.f38975d.f11784b.setVisibility(0);
        this.f38975d.f11794l.setVisibility(0);
        this.f38975d.f11792j.setVisibility(8);
        this.f38975d.f11796n.setVisibility(0);
    }

    private final void s() {
        this.f38978g = a.DOWNLOAD;
        this.f38975d.f11792j.setVisibility(0);
        this.f38975d.f11792j.setText(this.f38976e.getString(R.string.updates_button_download_app));
        this.f38975d.f11792j.setBackground(ContextCompat.getDrawable(this.f38976e, R.drawable.ripple_blue_primary_button));
        this.f38975d.f11792j.setTextColor(ContextCompat.getColor(this.f38976e, R.color.white));
        this.f38975d.f11789g.setVisibility(8);
        this.f38975d.f11796n.setVisibility(8);
    }

    private final void t() {
        ProgressBar progressBar = this.f38975d.f11787e;
        AbstractC3255y.h(progressBar, "binding.pbProgressWishlistItem");
        ImageView imageView = this.f38975d.f11785c;
        AbstractC3255y.h(imageView, "binding.ivIconWishlistItem");
        e(progressBar, imageView);
        this.f38975d.f11789g.setVisibility(0);
        this.f38975d.f11784b.setVisibility(0);
        this.f38975d.f11794l.setVisibility(8);
        this.f38975d.f11792j.setVisibility(8);
        this.f38975d.f11796n.setVisibility(0);
        this.f38975d.f11795m.setVisibility(8);
    }

    private final void u() {
        this.f38975d.f11792j.setVisibility(0);
        this.f38975d.f11792j.setText(this.f38976e.getString(R.string.option_button_install));
        this.f38975d.f11792j.setVisibility(0);
        this.f38975d.f11792j.setBackground(ContextCompat.getDrawable(this.f38976e, R.drawable.ripple_install_button));
        this.f38975d.f11789g.setVisibility(8);
        this.f38975d.f11796n.setVisibility(8);
    }

    private final void v() {
        this.f38978g = a.INSTALLING;
        this.f38975d.f11792j.setText(this.f38976e.getString(R.string.installing));
        this.f38975d.f11792j.setVisibility(0);
        this.f38975d.f11792j.setBackground(ContextCompat.getDrawable(this.f38976e, R.drawable.bg_status_download_installed));
        this.f38975d.f11792j.setTextColor(ContextCompat.getColor(this.f38976e, R.color.download_installed_status));
        this.f38975d.f11789g.setVisibility(8);
        this.f38975d.f11796n.setVisibility(8);
    }

    private final void w() {
        this.f38978g = a.OPEN;
        this.f38975d.f11792j.setVisibility(0);
        this.f38975d.f11792j.setText(this.f38976e.getString(R.string.open));
        this.f38975d.f11792j.setBackground(ContextCompat.getDrawable(this.f38976e, R.drawable.ripple_blue_primary_button));
        this.f38975d.f11792j.setTextColor(ContextCompat.getColor(this.f38976e, R.color.white));
        this.f38975d.f11789g.setVisibility(8);
        this.f38975d.f11796n.setVisibility(8);
    }

    private final void x() {
        this.f38975d.f11792j.setVisibility(0);
        this.f38975d.f11789g.setVisibility(8);
        this.f38975d.f11792j.setText(this.f38976e.getString(R.string.updates_button_resume));
        this.f38975d.f11792j.setTextColor(ContextCompat.getColor(this.f38976e, R.color.white));
        this.f38975d.f11792j.setBackground(ContextCompat.getDrawable(this.f38976e, R.drawable.ripple_blue_primary_button));
        this.f38975d.f11796n.setVisibility(8);
    }

    private final void y(ProgressBar progressBar) {
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
    }

    private final void z(ProgressBar progressBar, int i8) {
        progressBar.setIndeterminate(false);
        progressBar.setProgress(i8);
        progressBar.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ae, code lost:
    
        if (com.uptodown.workers.DownloadApkWorker.f31034k.d(r11.h(), r11.e0()) == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(a5.U r17) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.e1.n(a5.U):void");
    }
}
