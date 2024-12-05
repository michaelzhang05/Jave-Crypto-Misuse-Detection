package D4;

import H4.j;
import W4.C1500y;
import Z4.InterfaceC1594h;
import a5.C1639f;
import a5.C1641h;
import a5.C1648o;
import a6.InterfaceC1668n;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.net.nsd.NsdServiceInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.FileProvider;
import androidx.documentfile.provider.DocumentFile;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.mbridge.msdk.MBridgeConstans;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AbstractActivityC2683a;
import com.uptodown.activities.AppInstalledDetailsActivity;
import com.uptodown.activities.OldVersionsActivity;
import com.uptodown.activities.VirusTotalReport;
import com.uptodown.core.activities.FileExplorerActivity;
import com.uptodown.workers.DownloadApkWorker;
import com.uptodown.workers.DownloadUpdatesWorker;
import com.uptodown.workers.GenerateQueueWorker;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.InterfaceC3390x0;
import o5.C3661a;
import o5.C3674n;
import o5.C3677q;

/* loaded from: classes4.dex */
public abstract class W1 extends AbstractActivityC2683a {

    /* renamed from: N, reason: collision with root package name */
    private ProgressBar f1944N;

    /* renamed from: O, reason: collision with root package name */
    private TextView f1945O;

    /* renamed from: P, reason: collision with root package name */
    private TextView f1946P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f1947Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f1948R;

    /* renamed from: S, reason: collision with root package name */
    private InterfaceC3390x0 f1949S;

    /* renamed from: U, reason: collision with root package name */
    private boolean f1951U;

    /* renamed from: V, reason: collision with root package name */
    private C1500y f1952V;

    /* renamed from: W, reason: collision with root package name */
    private HashMap f1953W;

    /* renamed from: X, reason: collision with root package name */
    private File f1954X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f1955Y;

    /* renamed from: T, reason: collision with root package name */
    private ArrayList f1950T = new ArrayList();

    /* renamed from: Z, reason: collision with root package name */
    private e f1956Z = new e();

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC1594h {
        a() {
        }

        @Override // Z4.InterfaceC1594h
        public void a(ArrayList positives) {
            AbstractC3255y.i(positives, "positives");
            UptodownApp.f29058B.B0(positives);
            W1.this.o4();
            W1.this.f1947Q = false;
        }

        @Override // Z4.InterfaceC1594h
        public void b() {
            UptodownApp.f29058B.B0(new ArrayList());
            W1.this.o4();
            W1.this.f1947Q = false;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Z4.r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1639f f1962b;

        c(C1639f c1639f) {
            this.f1962b = c1639f;
        }

        @Override // Z4.r
        public void c(int i8) {
            W1 w12 = W1.this;
            String string = w12.getString(R.string.rollback_not_available, this.f1962b.z());
            AbstractC3255y.h(string, "getString(R.string.rollb…_not_available, app.name)");
            w12.d2(string);
        }

        @Override // Z4.r
        public void e(C1641h appInfo) {
            AbstractC3255y.i(appInfo, "appInfo");
            if (appInfo.b()) {
                Intent intent = new Intent(W1.this.getApplicationContext(), (Class<?>) OldVersionsActivity.class);
                intent.putExtra(MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.f1962b);
                intent.putExtra("appInfo", appInfo);
                W1 w12 = W1.this;
                w12.startActivity(intent, UptodownApp.f29058B.a(w12));
                return;
            }
            W1 w13 = W1.this;
            String string = w13.getString(R.string.rollback_not_available, appInfo.s0());
            AbstractC3255y.h(string, "getString(R.string.rollb…_available, appInfo.name)");
            w13.d2(string);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Z4.K {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1639f f1964b;

        d(C1639f c1639f) {
            this.f1964b = c1639f;
        }

        @Override // Z4.K
        public void a() {
            W1.this.I2(this.f1964b.X());
        }

        @Override // Z4.K
        public void b(a5.H reportVT) {
            AbstractC3255y.i(reportVT, "reportVT");
            Intent intent = new Intent(W1.this, (Class<?>) VirusTotalReport.class);
            intent.putExtra("app_selected", this.f1964b);
            intent.putExtra("appReportVT", reportVT);
            W1 w12 = W1.this;
            w12.startActivity(intent, UptodownApp.f29058B.a(w12));
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements Z4.D {
        e() {
        }

        @Override // Z4.D
        public void a(String appName) {
            AbstractC3255y.i(appName, "appName");
            W1.this.d2(appName);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f1966a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1967b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ W1 f1968c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i8, W1 w12, S5.d dVar) {
            super(2, dVar);
            this.f1967b = i8;
            this.f1968c = w12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(this.f1967b, this.f1968c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f1966a == 0) {
                O5.t.b(obj);
                C1500y c1500y = null;
                switch (this.f1967b) {
                    case 106:
                        C1500y c1500y2 = this.f1968c.f1952V;
                        if (c1500y2 == null) {
                            AbstractC3255y.y("dialogBinding");
                        } else {
                            c1500y = c1500y2;
                        }
                        c1500y.f12644n.setText(this.f1968c.getString(R.string.action_update));
                        break;
                    case 107:
                        C1500y c1500y3 = this.f1968c.f1952V;
                        if (c1500y3 == null) {
                            AbstractC3255y.y("dialogBinding");
                        } else {
                            c1500y = c1500y3;
                        }
                        c1500y.f12644n.setText(this.f1968c.getString(R.string.action_cancel_download));
                        break;
                    case 108:
                        C1500y c1500y4 = this.f1968c.f1952V;
                        if (c1500y4 == null) {
                            AbstractC3255y.y("dialogBinding");
                        } else {
                            c1500y = c1500y4;
                        }
                        c1500y.f12644n.setText(this.f1968c.getString(R.string.notification_msg_update_uptodown));
                        break;
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    private final void B3() {
        new V4.a(this, new a(), LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C3(String str, int i8) {
        Window window;
        if (i8 == 0) {
            AlertDialog r22 = r2();
            if (r22 != null) {
                r22.dismiss();
            }
            View inflate = getLayoutInflater().inflate(R.layout.dialog_backup_app, (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(R.id.tv_title_dialog_backup_app);
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.t());
            TextView textView2 = (TextView) inflate.findViewById(R.id.tv_name_dialog_backup_app);
            this.f1945O = textView2;
            if (textView2 != null) {
                textView2.setTypeface(aVar.u());
            }
            TextView textView3 = (TextView) inflate.findViewById(R.id.tv_percentage_dialog_backup_app);
            this.f1946P = textView3;
            if (textView3 != null) {
                textView3.setTypeface(aVar.u());
            }
            this.f1944N = (ProgressBar) inflate.findViewById(R.id.progressbar_dialog_backup_app);
            View findViewById = inflate.findViewById(R.id.tv_cancel_dialog_backup_app);
            AbstractC3255y.h(findViewById, "view.findViewById(R.id.t…cancel_dialog_backup_app)");
            TextView textView4 = (TextView) findViewById;
            textView4.setTypeface(aVar.t());
            textView4.setOnClickListener(new View.OnClickListener() { // from class: D4.N1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    W1.D3(W1.this, view);
                }
            });
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setView(inflate);
            builder.setCancelable(false);
            N2(builder.create());
            AlertDialog r23 = r2();
            if (r23 != null && (window = r23.getWindow()) != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            AlertDialog r24 = r2();
            if (r24 != null) {
                r24.show();
            }
        }
        TextView textView5 = this.f1945O;
        if (textView5 != null) {
            textView5.setText(str);
        }
        TextView textView6 = this.f1946P;
        if (textView6 != null) {
            textView6.setText("0%");
        }
        ProgressBar progressBar = this.f1944N;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D3(W1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            InterfaceC3390x0 interfaceC3390x0 = this$0.f1949S;
            if (interfaceC3390x0 == null) {
                AbstractC3255y.y("jobBackup");
                interfaceC3390x0 = null;
            }
            InterfaceC3390x0.a.a(interfaceC3390x0, null, 1, null);
            AlertDialog r22 = this$0.r2();
            if (r22 != null) {
                r22.dismiss();
            }
            this$0.N2(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E3(String str, final String str2) {
        AlertDialog r22 = r2();
        if (r22 != null) {
            r22.dismiss();
        }
        View inflate = getLayoutInflater().inflate(R.layout.dialog_backup_result, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_title_dialog_backup_result);
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_msg_dialog_backup_result);
        textView2.setTypeface(aVar.u());
        textView2.setText(str);
        TextView textView3 = (TextView) inflate.findViewById(R.id.tv_ok_dialog_backup_result);
        textView3.setTypeface(aVar.t());
        textView3.setOnClickListener(new View.OnClickListener() { // from class: D4.J1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                W1.F3(W1.this, view);
            }
        });
        TextView textView4 = (TextView) inflate.findViewById(R.id.tv_browse_dialog_backup_result);
        textView4.setTypeface(aVar.t());
        textView4.setOnClickListener(new View.OnClickListener() { // from class: D4.K1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                W1.G3(W1.this, view);
            }
        });
        if (str2 != null && str2.length() != 0) {
            TextView textView5 = (TextView) inflate.findViewById(R.id.tv_share_dialog_backup_result);
            textView5.setTypeface(aVar.t());
            textView5.setOnClickListener(new View.OnClickListener() { // from class: D4.L1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    W1.H3(W1.this, str2, view);
                }
            });
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(inflate);
        N2(builder.create());
        AlertDialog r23 = r2();
        AbstractC3255y.f(r23);
        Window window = r23.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        AlertDialog r24 = r2();
        AbstractC3255y.f(r24);
        r24.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(W1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            AlertDialog r22 = this$0.r2();
            if (r22 != null) {
                r22.dismiss();
            }
            this$0.N2(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G3(W1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            Intent intent = new Intent(this$0, (Class<?>) FileExplorerActivity.class);
            intent.putExtra("subdir", new J4.a(this$0).c());
            intent.putExtra("subdir_sd", new J4.a(this$0).n());
            this$0.startActivity(intent);
            AlertDialog r22 = this$0.r2();
            if (r22 != null) {
                r22.dismiss();
            }
            this$0.N2(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H3(W1 this$0, String str, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            Intent intent = new Intent("android.intent.action.SEND");
            Object b8 = new J4.a(this$0).b();
            if (b8 instanceof File) {
                File file = new File((File) b8, str);
                if (file.exists()) {
                    intent.setType("application/vnd.android.package-archive");
                    intent.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(this$0, this$0.getPackageName() + ".provider", file));
                    this$0.startActivity(Intent.createChooser(intent, this$0.getString(R.string.intent_chooser_title_share_file)));
                    return;
                }
                return;
            }
            if (b8 instanceof DocumentFile) {
                intent.putExtra("android.intent.extra.STREAM", ((DocumentFile) b8).getUri());
                this$0.startActivity(Intent.createChooser(intent, this$0.getString(R.string.intent_chooser_title_share_file)));
            }
        }
    }

    private final void I3(C1639f c1639f, a5.O o8) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater layoutInflater = getLayoutInflater();
        AbstractC3255y.h(layoutInflater, "layoutInflater");
        View inflate = layoutInflater.inflate(R.layout.version_details_dialog, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_title_vd);
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        ((TextView) inflate.findViewById(R.id.tv_label_app_name_vd)).setTypeface(aVar.u());
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_app_name_vd);
        textView2.setTypeface(aVar.t());
        textView2.setText(c1639f.z());
        ((TextView) inflate.findViewById(R.id.tv_label_installed_version_vd)).setTypeface(aVar.u());
        TextView textView3 = (TextView) inflate.findViewById(R.id.tv_installed_version_vd);
        textView3.setTypeface(aVar.t());
        kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34167a;
        String format = String.format("%s(%s)", Arrays.copyOf(new Object[]{c1639f.h0(), Long.valueOf(c1639f.f0())}, 2));
        AbstractC3255y.h(format, "format(...)");
        textView3.setText(format);
        ((TextView) inflate.findViewById(R.id.tv_label_update_version_vd)).setTypeface(aVar.u());
        TextView textView4 = (TextView) inflate.findViewById(R.id.tv_update_version_vd);
        textView4.setTypeface(aVar.t());
        String format2 = String.format("%s(%s)", Arrays.copyOf(new Object[]{o8.x(), Long.valueOf(o8.w())}, 2));
        AbstractC3255y.h(format2, "format(...)");
        textView4.setText(format2);
        ((TextView) inflate.findViewById(R.id.tv_label_packagename_vd)).setTypeface(aVar.u());
        TextView textView5 = (TextView) inflate.findViewById(R.id.tv_packagename_vd);
        textView5.setTypeface(aVar.t());
        textView5.setText(c1639f.J());
        ((TextView) inflate.findViewById(R.id.tv_label_size_vd)).setTypeface(aVar.u());
        TextView textView6 = (TextView) inflate.findViewById(R.id.tv_size_vd);
        textView6.setTypeface(aVar.t());
        textView6.setText(new Q4.g().c(o8.v()));
        ((TextView) inflate.findViewById(R.id.tv_label_filename_vd)).setTypeface(aVar.u());
        TextView textView7 = (TextView) inflate.findViewById(R.id.tv_filename_vd);
        textView7.setTypeface(aVar.t());
        String l8 = o8.l();
        if (l8 != null && l8.length() != 0) {
            textView7.setText(o8.l());
        } else {
            textView7.setText(getString(R.string.version_details_filename_not_found, c1639f.z()));
        }
        TextView textView8 = (TextView) inflate.findViewById(R.id.tv_version_details_accept);
        textView8.setTypeface(aVar.t());
        textView8.setOnClickListener(new View.OnClickListener() { // from class: D4.I1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                W1.J3(W1.this, view);
            }
        });
        builder.setView(inflate);
        N2(builder.create());
        if (!isFinishing()) {
            AlertDialog r22 = r2();
            AbstractC3255y.f(r22);
            Window window = r22.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            AlertDialog r23 = r2();
            AbstractC3255y.f(r23);
            r23.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J3(W1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            AlertDialog r22 = this$0.r2();
            AbstractC3255y.f(r22);
            r22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L3(W1 this$0, C1639f c1639f, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            this$0.F2(c1639f.b());
            AlertDialog r22 = this$0.r2();
            AbstractC3255y.f(r22);
            this$0.b4(r22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M3(W1 this$0, C1639f c1639f, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            this$0.l4(c1639f);
            AlertDialog r22 = this$0.r2();
            AbstractC3255y.f(r22);
            this$0.b4(r22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N3(C1639f c1639f, W1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            String J8 = c1639f.J();
            if (J8 != null && J8.length() != 0) {
                PackageManager packageManager = this$0.getPackageManager();
                String J9 = c1639f.J();
                AbstractC3255y.f(J9);
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(J9);
                if (launchIntentForPackage != null) {
                    this$0.startActivity(launchIntentForPackage);
                } else {
                    String string = this$0.getString(R.string.error_open_app, c1639f.z());
                    AbstractC3255y.h(string, "getString(R.string.error…en_app, appSelected.name)");
                    this$0.d2(string);
                }
            }
            AlertDialog r22 = this$0.r2();
            AbstractC3255y.f(r22);
            this$0.b4(r22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O3(C1639f c1639f, W1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            String J8 = c1639f.J();
            if (J8 != null && J8.length() != 0) {
                H4.i iVar = new H4.i(this$0);
                String J9 = c1639f.J();
                AbstractC3255y.f(J9);
                iVar.h(J9);
            }
            AlertDialog r22 = this$0.r2();
            AbstractC3255y.f(r22);
            this$0.b4(r22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P3(W1 this$0, C1639f c1639f, View view) {
        AbstractC3255y.i(this$0, "this$0");
        UptodownApp.a aVar = UptodownApp.f29058B;
        if (aVar.a0()) {
            Intent intent = new Intent(this$0.getApplicationContext(), (Class<?>) E4.b.class);
            intent.putExtra("AppIndex", c1639f.J());
            this$0.startActivity(intent, aVar.a(this$0));
            AlertDialog r22 = this$0.r2();
            AbstractC3255y.f(r22);
            this$0.b4(r22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q3(W1 this$0, C1639f c1639f, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            new V4.r(this$0, null, c1639f, this$0.f1956Z, LifecycleOwnerKt.getLifecycleScope(this$0));
            AlertDialog r22 = this$0.r2();
            AbstractC3255y.f(r22);
            this$0.b4(r22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
    
        if (r0.size() > 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004a, code lost:
    
        if (r0.size() > 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004c, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void R3(D4.W1 r6, a5.C1639f r7, android.view.View r8) {
        /*
            java.lang.String r8 = "this$0"
            kotlin.jvm.internal.AbstractC3255y.i(r6, r8)
            com.uptodown.UptodownApp$a r8 = com.uptodown.UptodownApp.f29058B
            boolean r8 = r8.a0()
            if (r8 == 0) goto L7a
            android.app.AlertDialog r8 = r6.r2()
            kotlin.jvm.internal.AbstractC3255y.f(r8)
            r6.b4(r8)
            r8 = 1
            r6.f1955Y = r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.f1950T = r0
            N4.b r0 = new N4.b
            java.lang.String r1 = r7.J()
            kotlin.jvm.internal.AbstractC3255y.f(r1)
            java.lang.String r2 = r7.z()
            kotlin.jvm.internal.AbstractC3255y.f(r2)
            r0.<init>(r1, r2)
            java.util.ArrayList r1 = r6.f1950T
            r1.add(r0)
            java.util.ArrayList r0 = r7.b0()
            if (r0 == 0) goto L4e
            java.util.ArrayList r0 = r7.b0()
            kotlin.jvm.internal.AbstractC3255y.f(r0)
            int r0 = r0.size()
            if (r0 <= 0) goto L4e
        L4c:
            r5 = 1
            goto L64
        L4e:
            java.util.ArrayList r0 = r7.H()
            if (r0 == 0) goto L62
            java.util.ArrayList r0 = r7.H()
            kotlin.jvm.internal.AbstractC3255y.f(r0)
            int r0 = r0.size()
            if (r0 <= 0) goto L62
            goto L4c
        L62:
            r8 = 0
            r5 = 0
        L64:
            java.lang.String r1 = r7.z()
            kotlin.jvm.internal.AbstractC3255y.f(r1)
            java.lang.String r2 = r7.J()
            kotlin.jvm.internal.AbstractC3255y.f(r2)
            long r3 = r7.f0()
            r0 = r6
            r0.B(r1, r2, r3, r5)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.W1.R3(D4.W1, a5.f, android.view.View):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S3(W1 this$0, C1639f c1639f, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.m4(c1639f);
        AlertDialog r22 = this$0.r2();
        AbstractC3255y.f(r22);
        this$0.b4(r22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3(W1 this$0, C3674n dbManager, C1639f c1639f, Z4.E listener, int i8, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(dbManager, "$dbManager");
        AbstractC3255y.i(listener, "$listener");
        if (UptodownApp.f29058B.a0()) {
            AlertDialog r22 = this$0.r2();
            AbstractC3255y.f(r22);
            this$0.b4(r22);
            dbManager.a();
            if (c1639f.i() == 0) {
                c1639f.t0(1);
                c1639f.J0(C1639f.c.UPDATED);
                C3677q c3677q = new C3677q();
                Context applicationContext = this$0.getApplicationContext();
                AbstractC3255y.h(applicationContext, "applicationContext");
                c3677q.c(applicationContext);
            } else {
                c1639f.t0(0);
                c1639f.J0(C1639f.c.OUTDATED);
            }
            dbManager.j1(c1639f);
            dbManager.l();
            listener.d(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U3(C3674n dbManager, a5.O o8, W1 this$0, View view) {
        AbstractC3255y.i(dbManager, "$dbManager");
        AbstractC3255y.i(this$0, "this$0");
        UptodownApp.a aVar = UptodownApp.f29058B;
        if (aVar.a0()) {
            dbManager.a();
            o8.X(0);
            dbManager.r1(o8);
            dbManager.l();
            aVar.c0(o8.s(), this$0);
            C3661a c3661a = new C3661a();
            Context applicationContext = this$0.getApplicationContext();
            AbstractC3255y.h(applicationContext, "applicationContext");
            c3661a.b(applicationContext, o8.l());
            UptodownApp.a.N0(aVar, this$0, false, 2, null);
            AlertDialog r22 = this$0.r2();
            AbstractC3255y.f(r22);
            this$0.b4(r22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V3(W1 this$0, C1639f c1639f, a5.O o8, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            AlertDialog r22 = this$0.r2();
            AbstractC3255y.f(r22);
            this$0.b4(r22);
            this$0.I3(c1639f, o8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W3(W1 this$0, a5.O o8, C3674n dbManager, Z4.E listener, int i8, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(dbManager, "$dbManager");
        AbstractC3255y.i(listener, "$listener");
        UptodownApp.a aVar = UptodownApp.f29058B;
        if (aVar.a0()) {
            AlertDialog r22 = this$0.r2();
            AbstractC3255y.f(r22);
            this$0.b4(r22);
            if (o8.h() == 1) {
                o8.H(0);
            } else {
                o8.H(1);
            }
            dbManager.a();
            dbManager.r1(o8);
            dbManager.l();
            C3661a c3661a = new C3661a();
            Context applicationContext = this$0.getApplicationContext();
            AbstractC3255y.h(applicationContext, "applicationContext");
            c3661a.b(applicationContext, o8.l());
            listener.d(i8);
            UptodownApp.a.N0(aVar, this$0, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        if (r9.size() > 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0048, code lost:
    
        if (r9.size() > 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004a, code lost:
    
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void X3(D4.W1 r7, a5.C1639f r8, android.view.View r9) {
        /*
            java.lang.String r9 = "this$0"
            kotlin.jvm.internal.AbstractC3255y.i(r7, r9)
            com.uptodown.UptodownApp$a r9 = com.uptodown.UptodownApp.f29058B
            boolean r9 = r9.a0()
            if (r9 == 0) goto L78
            android.app.AlertDialog r9 = r7.r2()
            kotlin.jvm.internal.AbstractC3255y.f(r9)
            r7.b4(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r7.f1950T = r9
            N4.b r9 = new N4.b
            java.lang.String r0 = r8.J()
            kotlin.jvm.internal.AbstractC3255y.f(r0)
            java.lang.String r1 = r8.z()
            kotlin.jvm.internal.AbstractC3255y.f(r1)
            r9.<init>(r0, r1)
            java.util.ArrayList r0 = r7.f1950T
            r0.add(r9)
            java.util.ArrayList r9 = r8.b0()
            r0 = 1
            if (r9 == 0) goto L4c
            java.util.ArrayList r9 = r8.b0()
            kotlin.jvm.internal.AbstractC3255y.f(r9)
            int r9 = r9.size()
            if (r9 <= 0) goto L4c
        L4a:
            r6 = 1
            goto L62
        L4c:
            java.util.ArrayList r9 = r8.H()
            if (r9 == 0) goto L60
            java.util.ArrayList r9 = r8.H()
            kotlin.jvm.internal.AbstractC3255y.f(r9)
            int r9 = r9.size()
            if (r9 <= 0) goto L60
            goto L4a
        L60:
            r0 = 0
            r6 = 0
        L62:
            java.lang.String r2 = r8.z()
            kotlin.jvm.internal.AbstractC3255y.f(r2)
            java.lang.String r3 = r8.J()
            kotlin.jvm.internal.AbstractC3255y.f(r3)
            long r4 = r8.f0()
            r1 = r7
            r1.B(r2, r3, r4, r6)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.W1.X3(D4.W1, a5.f, android.view.View):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y3(W1 this$0, C1639f c1639f, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            AlertDialog r22 = this$0.r2();
            AbstractC3255y.f(r22);
            this$0.b4(r22);
            this$0.n4(c1639f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z3(W1 this$0, C1639f c1639f, View view) {
        AbstractC3255y.i(this$0, "this$0");
        UptodownApp.a aVar = UptodownApp.f29058B;
        if (aVar.a0()) {
            AlertDialog r22 = this$0.r2();
            AbstractC3255y.f(r22);
            this$0.b4(r22);
            Intent intent = new Intent(this$0, (Class<?>) AppInstalledDetailsActivity.class);
            intent.putExtra("appInstalled", c1639f);
            this$0.startActivity(intent, aVar.a(this$0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a4(W1 this$0, DialogInterface dialogInterface) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f1951U = false;
    }

    private final void b4(AlertDialog alertDialog) {
        alertDialog.dismiss();
        this.f1951U = false;
    }

    private final void d4(C1639f c1639f) {
        UptodownApp.a aVar = UptodownApp.f29058B;
        if (aVar.c(c1639f).size() < 2 && aVar.F().size() < 2) {
            t4();
        }
    }

    private final void n4(C1639f c1639f) {
        if (!isFinishing()) {
            new V4.m(this, null, c1639f.X(), new d(c1639f), LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    private final void t4() {
        Data build = new Data.Builder().putInt("downloadAutostartedInBackground", 0).putBoolean("downloadAnyway", false).build();
        AbstractC3255y.h(build, "Builder()\n            .p…lse)\n            .build()");
        WorkManager.getInstance(this).enqueue(new OneTimeWorkRequest.Builder(DownloadUpdatesWorker.class).addTag("DownloadUpdatesWorker").setInputData(build).build());
    }

    public final void A3(int i8, boolean z8, Toolbar toolbar) {
        AbstractC3255y.i(toolbar, "toolbar");
        if (toolbar.getMenu() != null) {
            Menu menu = toolbar.getMenu();
            AbstractC3255y.f(menu);
            menu.findItem(i8).setChecked(z8);
        }
    }

    public final void K3(final C1639f c1639f, final int i8, final Z4.E listener) {
        C1500y c1500y;
        Window window;
        String str;
        NsdServiceInfo e8;
        String x8;
        AbstractC3255y.i(listener, "listener");
        if (!isFinishing() && c1639f != null) {
            C1500y c8 = C1500y.c(getLayoutInflater());
            AbstractC3255y.h(c8, "inflate(layoutInflater)");
            this.f1952V = c8;
            if (c8 == null) {
                AbstractC3255y.y("dialogBinding");
                c8 = null;
            }
            TextView textView = c8.f12642l;
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.t());
            C1500y c1500y2 = this.f1952V;
            if (c1500y2 == null) {
                AbstractC3255y.y("dialogBinding");
                c1500y2 = null;
            }
            c1500y2.f12642l.setText(c1639f.z());
            String J8 = c1639f.J();
            if (J8 != null && J8.length() != 0 && (x8 = c1639f.x()) != null && x8.length() != 0 && c1639f.b() != 0) {
                C1500y c1500y3 = this.f1952V;
                if (c1500y3 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y3 = null;
                }
                c1500y3.f12640j.setTypeface(aVar.u());
                C1500y c1500y4 = this.f1952V;
                if (c1500y4 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y4 = null;
                }
                c1500y4.f12640j.setOnClickListener(new View.OnClickListener() { // from class: D4.B1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        W1.L3(W1.this, c1639f, view);
                    }
                });
            } else {
                C1500y c1500y5 = this.f1952V;
                if (c1500y5 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y5 = null;
                }
                c1500y5.f12640j.setVisibility(8);
            }
            C3674n.a aVar2 = C3674n.f36505t;
            Context applicationContext = getApplicationContext();
            AbstractC3255y.h(applicationContext, "applicationContext");
            final C3674n a8 = aVar2.a(applicationContext);
            a8.a();
            String J9 = c1639f.J();
            AbstractC3255y.f(J9);
            final a5.O u02 = a8.u0(J9);
            a8.l();
            if (u02 != null) {
                C1500y c1500y6 = this.f1952V;
                if (c1500y6 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y6 = null;
                }
                c1500y6.f12644n.setTypeface(aVar.u());
                if (u02.a()) {
                    C1500y c1500y7 = this.f1952V;
                    if (c1500y7 == null) {
                        AbstractC3255y.y("dialogBinding");
                        c1500y7 = null;
                    }
                    c1500y7.f12644n.setText(getString(R.string.action_cancel_download));
                } else if (u02.u() == 100) {
                    C1500y c1500y8 = this.f1952V;
                    if (c1500y8 == null) {
                        AbstractC3255y.y("dialogBinding");
                        c1500y8 = null;
                    }
                    c1500y8.f12644n.setText(getString(R.string.notification_msg_update_uptodown));
                } else if (u02.u() > 0) {
                    C1500y c1500y9 = this.f1952V;
                    if (c1500y9 == null) {
                        AbstractC3255y.y("dialogBinding");
                        c1500y9 = null;
                    }
                    c1500y9.f12644n.setText(getString(R.string.updates_button_resume));
                } else {
                    C1500y c1500y10 = this.f1952V;
                    if (c1500y10 == null) {
                        AbstractC3255y.y("dialogBinding");
                        c1500y10 = null;
                    }
                    c1500y10.f12644n.setText(getString(R.string.action_update));
                }
                C1500y c1500y11 = this.f1952V;
                if (c1500y11 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y11 = null;
                }
                c1500y11.f12644n.setOnClickListener(new View.OnClickListener() { // from class: D4.T1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        W1.M3(W1.this, c1639f, view);
                    }
                });
            } else {
                C1500y c1500y12 = this.f1952V;
                if (c1500y12 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y12 = null;
                }
                c1500y12.f12644n.setVisibility(8);
            }
            if (!j6.n.s(getPackageName(), c1639f.J(), true)) {
                C1500y c1500y13 = this.f1952V;
                if (c1500y13 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y13 = null;
                }
                c1500y13.f12639i.setTypeface(aVar.u());
                C1500y c1500y14 = this.f1952V;
                if (c1500y14 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y14 = null;
                }
                c1500y14.f12639i.setOnClickListener(new View.OnClickListener() { // from class: D4.U1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        W1.N3(C1639f.this, this, view);
                    }
                });
                C1500y c1500y15 = this.f1952V;
                if (c1500y15 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y15 = null;
                }
                c1500y15.f12643m.setTypeface(aVar.u());
                C1500y c1500y16 = this.f1952V;
                if (c1500y16 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y16 = null;
                }
                c1500y16.f12643m.setOnClickListener(new View.OnClickListener() { // from class: D4.V1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        W1.O3(C1639f.this, this, view);
                    }
                });
            } else {
                C1500y c1500y17 = this.f1952V;
                if (c1500y17 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y17 = null;
                }
                c1500y17.f12639i.setVisibility(8);
                C1500y c1500y18 = this.f1952V;
                if (c1500y18 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y18 = null;
                }
                c1500y18.f12643m.setVisibility(8);
            }
            if (UptodownApp.f29058B.M()) {
                C1500y c1500y19 = this.f1952V;
                if (c1500y19 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y19 = null;
                }
                c1500y19.f12639i.setText(R.string.debug_title_info_app);
                C1500y c1500y20 = this.f1952V;
                if (c1500y20 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y20 = null;
                }
                c1500y20.f12639i.setOnClickListener(new View.OnClickListener() { // from class: D4.C1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        W1.P3(W1.this, c1639f, view);
                    }
                });
                C1500y c1500y21 = this.f1952V;
                if (c1500y21 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y21 = null;
                }
                c1500y21.f12639i.setVisibility(0);
            }
            String e02 = c1639f.e0();
            if (e02 != null && e02.length() != 0) {
                C1500y c1500y22 = this.f1952V;
                if (c1500y22 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y22 = null;
                }
                c1500y22.f12641k.setTypeface(aVar.u());
                C1500y c1500y23 = this.f1952V;
                if (c1500y23 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y23 = null;
                }
                c1500y23.f12641k.setOnClickListener(new View.OnClickListener() { // from class: D4.D1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        W1.Q3(W1.this, c1639f, view);
                    }
                });
            } else {
                C1500y c1500y24 = this.f1952V;
                if (c1500y24 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y24 = null;
                }
                c1500y24.f12641k.setVisibility(8);
            }
            C1500y c1500y25 = this.f1952V;
            if (c1500y25 == null) {
                AbstractC3255y.y("dialogBinding");
                c1500y25 = null;
            }
            c1500y25.f12637g.setTypeface(aVar.u());
            C1500y c1500y26 = this.f1952V;
            if (c1500y26 == null) {
                AbstractC3255y.y("dialogBinding");
                c1500y26 = null;
            }
            c1500y26.f12637g.setOnClickListener(new View.OnClickListener() { // from class: D4.E1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    W1.R3(W1.this, c1639f, view);
                }
            });
            O4.c o8 = aVar.o();
            if (o8 != null && o8.j()) {
                O4.h l8 = aVar.l();
                if (l8 != null && (e8 = l8.e()) != null) {
                    str = e8.getServiceName();
                } else {
                    str = null;
                }
                if (str != null) {
                    C1500y c1500y27 = this.f1952V;
                    if (c1500y27 == null) {
                        AbstractC3255y.y("dialogBinding");
                        c1500y27 = null;
                    }
                    TextView textView2 = c1500y27.f12637g;
                    kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34167a;
                    String format = String.format("%s%s", Arrays.copyOf(new Object[]{getString(R.string.nsd_option_send_to), O4.h.f8251h.c(str)}, 2));
                    AbstractC3255y.h(format, "format(...)");
                    textView2.setText(format);
                } else {
                    C1500y c1500y28 = this.f1952V;
                    if (c1500y28 == null) {
                        AbstractC3255y.y("dialogBinding");
                        c1500y28 = null;
                    }
                    c1500y28.f12637g.setVisibility(8);
                }
            }
            if (c1639f.s() == 1 && c1639f.b() != 0) {
                C1500y c1500y29 = this.f1952V;
                if (c1500y29 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y29 = null;
                }
                c1500y29.f12638h.setTypeface(aVar.u());
                C1500y c1500y30 = this.f1952V;
                if (c1500y30 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y30 = null;
                }
                c1500y30.f12638h.setOnClickListener(new View.OnClickListener() { // from class: D4.F1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        W1.S3(W1.this, c1639f, view);
                    }
                });
            } else {
                C1500y c1500y31 = this.f1952V;
                if (c1500y31 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y31 = null;
                }
                c1500y31.f12638h.setVisibility(8);
            }
            C1500y c1500y32 = this.f1952V;
            if (c1500y32 == null) {
                AbstractC3255y.y("dialogBinding");
                c1500y32 = null;
            }
            c1500y32.f12635e.setTypeface(aVar.u());
            if (c1639f.i() == 0) {
                C1500y c1500y33 = this.f1952V;
                if (c1500y33 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y33 = null;
                }
                c1500y33.f12635e.setText(getString(R.string.not_offer_updates));
            } else {
                C1500y c1500y34 = this.f1952V;
                if (c1500y34 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y34 = null;
                }
                c1500y34.f12635e.setText(getString(R.string.offer_updates_again));
            }
            C1500y c1500y35 = this.f1952V;
            if (c1500y35 == null) {
                AbstractC3255y.y("dialogBinding");
                c1500y35 = null;
            }
            c1500y35.f12635e.setOnClickListener(new View.OnClickListener() { // from class: D4.G1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    W1.T3(W1.this, a8, c1639f, listener, i8, view);
                }
            });
            if (u02 != null && c1639f.c0() == C1639f.c.OUTDATED && c1639f.i() == 0) {
                C1500y c1500y36 = this.f1952V;
                if (c1500y36 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y36 = null;
                }
                c1500y36.f12634d.setTypeface(aVar.u());
                C1500y c1500y37 = this.f1952V;
                if (c1500y37 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y37 = null;
                }
                c1500y37.f12634d.setOnClickListener(new View.OnClickListener() { // from class: D4.H1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        W1.U3(C3674n.this, u02, this, view);
                    }
                });
                C1500y c1500y38 = this.f1952V;
                if (c1500y38 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y38 = null;
                }
                c1500y38.f12645o.setTypeface(aVar.u());
                C1500y c1500y39 = this.f1952V;
                if (c1500y39 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y39 = null;
                }
                c1500y39.f12645o.setOnClickListener(new View.OnClickListener() { // from class: D4.M1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        W1.V3(W1.this, c1639f, u02, view);
                    }
                });
            } else {
                C1500y c1500y40 = this.f1952V;
                if (c1500y40 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y40 = null;
                }
                c1500y40.f12634d.setVisibility(8);
                C1500y c1500y41 = this.f1952V;
                if (c1500y41 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y41 = null;
                }
                c1500y41.f12645o.setVisibility(8);
            }
            if (u02 != null) {
                C1500y c1500y42 = this.f1952V;
                if (c1500y42 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y42 = null;
                }
                c1500y42.f12636f.setVisibility(0);
                C1500y c1500y43 = this.f1952V;
                if (c1500y43 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y43 = null;
                }
                c1500y43.f12636f.setTypeface(aVar.u());
                if (u02.h() == 1) {
                    C1500y c1500y44 = this.f1952V;
                    if (c1500y44 == null) {
                        AbstractC3255y.y("dialogBinding");
                        c1500y44 = null;
                    }
                    c1500y44.f12636f.setText(R.string.reactivate_skipped_update);
                } else {
                    C1500y c1500y45 = this.f1952V;
                    if (c1500y45 == null) {
                        AbstractC3255y.y("dialogBinding");
                        c1500y45 = null;
                    }
                    c1500y45.f12636f.setText(R.string.skip_update);
                }
                C1500y c1500y46 = this.f1952V;
                if (c1500y46 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y46 = null;
                }
                c1500y46.f12636f.setOnClickListener(new View.OnClickListener() { // from class: D4.O1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        W1.W3(W1.this, u02, a8, listener, i8, view);
                    }
                });
            } else {
                C1500y c1500y47 = this.f1952V;
                if (c1500y47 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y47 = null;
                }
                c1500y47.f12636f.setVisibility(8);
            }
            if (c1639f.J() != null) {
                C1500y c1500y48 = this.f1952V;
                if (c1500y48 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y48 = null;
                }
                c1500y48.f12633c.setVisibility(0);
                C1500y c1500y49 = this.f1952V;
                if (c1500y49 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y49 = null;
                }
                c1500y49.f12633c.setTypeface(aVar.u());
                C1500y c1500y50 = this.f1952V;
                if (c1500y50 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y50 = null;
                }
                c1500y50.f12633c.setOnClickListener(new View.OnClickListener() { // from class: D4.P1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        W1.X3(W1.this, c1639f, view);
                    }
                });
            }
            if (c1639f.X() != null) {
                C1500y c1500y51 = this.f1952V;
                if (c1500y51 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y51 = null;
                }
                c1500y51.f12646p.setVisibility(0);
                C1500y c1500y52 = this.f1952V;
                if (c1500y52 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y52 = null;
                }
                c1500y52.f12646p.setTypeface(aVar.u());
                C1500y c1500y53 = this.f1952V;
                if (c1500y53 == null) {
                    AbstractC3255y.y("dialogBinding");
                    c1500y53 = null;
                }
                c1500y53.f12646p.setOnClickListener(new View.OnClickListener() { // from class: D4.Q1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        W1.Y3(W1.this, c1639f, view);
                    }
                });
            }
            C1500y c1500y54 = this.f1952V;
            if (c1500y54 == null) {
                AbstractC3255y.y("dialogBinding");
                c1500y54 = null;
            }
            c1500y54.f12632b.setTypeface(aVar.u());
            C1500y c1500y55 = this.f1952V;
            if (c1500y55 == null) {
                AbstractC3255y.y("dialogBinding");
                c1500y55 = null;
            }
            c1500y55.f12632b.setOnClickListener(new View.OnClickListener() { // from class: D4.R1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    W1.Z3(W1.this, c1639f, view);
                }
            });
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            C1500y c1500y56 = this.f1952V;
            if (c1500y56 == null) {
                AbstractC3255y.y("dialogBinding");
                c1500y = null;
            } else {
                c1500y = c1500y56;
            }
            builder.setView(c1500y.getRoot());
            N2(builder.create());
            AlertDialog r22 = r2();
            if (r22 != null) {
                r22.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: D4.S1
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        W1.a4(W1.this, dialogInterface);
                    }
                });
                O5.I i9 = O5.I.f8278a;
            }
            if (!isFinishing()) {
                AlertDialog r23 = r2();
                if (r23 != null && (window = r23.getWindow()) != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                    O5.I i10 = O5.I.f8278a;
                }
                AlertDialog r24 = r2();
                if (r24 != null) {
                    r24.show();
                    O5.I i11 = O5.I.f8278a;
                }
                this.f1951U = true;
            }
        }
    }

    @Override // I4.r
    public void Y() {
        this.f1949S = new L4.a(this, new b()).t(this.f1950T);
        this.f1950T = new ArrayList();
    }

    @Override // I4.a1
    public void Z0() {
        File file;
        super.Z0();
        O4.h l8 = H4.j.f3824g.l();
        AbstractC3255y.f(l8);
        if (l8.e() != null && (file = this.f1954X) != null) {
            AbstractC3255y.f(file);
            if (!file.isDirectory()) {
                UptodownApp uptodownApp = new UptodownApp();
                File file2 = this.f1954X;
                AbstractC3255y.f(file2);
                uptodownApp.R(file2);
            }
        }
    }

    public final void c4(int i8, boolean z8, Toolbar toolbar) {
        AbstractC3255y.i(toolbar, "toolbar");
        if (toolbar.getMenu() != null) {
            Menu menu = toolbar.getMenu();
            AbstractC3255y.f(menu);
            menu.findItem(i8).setEnabled(z8);
        }
    }

    public final HashMap e4() {
        return this.f1953W;
    }

    public final File f4() {
        return this.f1954X;
    }

    public final boolean g4() {
        return this.f1948R;
    }

    public final boolean h4() {
        return this.f1955Y;
    }

    public final boolean i4() {
        return this.f1951U;
    }

    public final void j4() {
        if (!this.f1947Q) {
            this.f1947Q = true;
            B3();
        }
    }

    public final void k4(C1639f c1639f) {
        String str;
        String str2 = null;
        if (c1639f != null) {
            str = c1639f.J();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            UptodownApp.a aVar = UptodownApp.f29058B;
            if (c1639f != null) {
                str2 = c1639f.J();
            }
            AbstractC3255y.f(str2);
            aVar.c0(str2, this);
            C3674n a8 = C3674n.f36505t.a(this);
            a8.a();
            String J8 = c1639f.J();
            AbstractC3255y.f(J8);
            C1648o a02 = a8.a0(J8);
            a8.l();
            if (a02 != null) {
                DownloadApkWorker.a aVar2 = DownloadApkWorker.f31034k;
                if (aVar2.d(c1639f.b(), a02.e0()) || a02.h0()) {
                    aVar2.a(c1639f.b());
                    new C3661a().a(this, a02.X());
                    a02.n0(this);
                }
            }
        }
    }

    public final void l4(C1639f c1639f) {
        String str;
        C1648o c1648o;
        String str2 = null;
        if (c1639f != null) {
            str = c1639f.J();
        } else {
            str = null;
        }
        if (str != null) {
            C3674n.a aVar = C3674n.f36505t;
            Context applicationContext = getApplicationContext();
            AbstractC3255y.h(applicationContext, "applicationContext");
            C3674n a8 = aVar.a(applicationContext);
            a8.a();
            String J8 = c1639f.J();
            AbstractC3255y.f(J8);
            a5.O u02 = a8.u0(J8);
            if (u02 != null) {
                String J9 = c1639f.J();
                AbstractC3255y.f(J9);
                c1648o = a8.b0(J9, u02.w());
            } else {
                c1648o = null;
            }
            if (u02 != null && u02.a()) {
                UptodownApp.a aVar2 = UptodownApp.f29058B;
                if (aVar2.O(this)) {
                    C3661a c3661a = new C3661a();
                    Context applicationContext2 = getApplicationContext();
                    AbstractC3255y.h(applicationContext2, "applicationContext");
                    if (!c3661a.b(applicationContext2, u02.l())) {
                        aVar2.c0(u02.s(), this);
                    } else {
                        u02.X(0);
                        a8.r1(u02);
                        DownloadUpdatesWorker.a aVar3 = DownloadUpdatesWorker.f31042k;
                        String J10 = c1639f.J();
                        AbstractC3255y.f(J10);
                        aVar3.a(J10);
                    }
                } else {
                    u4(c1639f.J(), false);
                }
            } else {
                if (u02 != null) {
                    str2 = u02.l();
                }
                if (str2 != null) {
                    if (c1648o != null) {
                        DownloadApkWorker.a aVar4 = DownloadApkWorker.f31034k;
                        if (!aVar4.d(c1639f.b(), c1648o.e0()) && !c1648o.h0()) {
                            C3677q c3677q = new C3677q();
                            Context applicationContext3 = getApplicationContext();
                            AbstractC3255y.h(applicationContext3, "applicationContext");
                            UptodownApp.f29058B.Y(new File(c3677q.f(applicationContext3), c1648o.X()), this, c1639f.g0());
                        } else {
                            aVar4.a(c1639f.b());
                            new C3661a().a(this, c1648o.X());
                            c1648o.n0(this);
                        }
                    } else {
                        C3677q c3677q2 = new C3677q();
                        Context applicationContext4 = getApplicationContext();
                        AbstractC3255y.h(applicationContext4, "applicationContext");
                        File g8 = c3677q2.g(applicationContext4);
                        String l8 = u02.l();
                        AbstractC3255y.f(l8);
                        File file = new File(g8, l8);
                        if (file.exists() && u02.u() == 100) {
                            if (j6.n.s(u02.s(), getApplicationContext().getPackageName(), true)) {
                                c2(file);
                            } else {
                                UptodownApp.f29058B.Y(file, this, c1639f.g0());
                            }
                        } else {
                            UptodownApp.a aVar5 = UptodownApp.f29058B;
                            if (!aVar5.O(this)) {
                                u4(c1639f.J(), false);
                            } else {
                                String J11 = c1639f.J();
                                AbstractC3255y.f(J11);
                                if (aVar5.R(J11)) {
                                    String J12 = c1639f.J();
                                    AbstractC3255y.f(J12);
                                    aVar5.c0(J12, this);
                                } else {
                                    d4(c1639f);
                                }
                            }
                        }
                    }
                } else if (c1648o != null) {
                    DownloadApkWorker.a aVar6 = DownloadApkWorker.f31034k;
                    if (!aVar6.d(c1639f.b(), c1648o.e0()) && !c1648o.h0()) {
                        C3677q c3677q3 = new C3677q();
                        Context applicationContext5 = getApplicationContext();
                        AbstractC3255y.h(applicationContext5, "applicationContext");
                        UptodownApp.f29058B.Y(new File(c3677q3.f(applicationContext5), c1648o.X()), this, c1639f.g0());
                    } else {
                        aVar6.a(c1639f.b());
                        new C3661a().a(this, c1648o.X());
                        c1648o.n0(this);
                    }
                } else if (!UptodownApp.f29058B.O(this)) {
                    u4(c1639f.J(), false);
                } else {
                    d4(c1639f);
                }
            }
            a8.l();
        }
    }

    public final void m4(C1639f app) {
        AbstractC3255y.i(app, "app");
        new V4.i(this, app.b(), new c(app), LifecycleOwnerKt.getLifecycleScope(this));
    }

    protected abstract void o4();

    public final void p4(HashMap hashMap) {
        this.f1953W = hashMap;
    }

    public final void q4(File file) {
        this.f1954X = file;
    }

    public final void r4(boolean z8) {
        this.f1955Y = z8;
    }

    public final void s4(boolean z8) {
        this.f1948R = z8;
    }

    public final void u4(String str, boolean z8) {
        UptodownApp.a aVar = UptodownApp.f29058B;
        if (!aVar.W("GenerateQueueWorker", this) && !aVar.W("downloadApkWorker", this)) {
            boolean z9 = true;
            this.f1948R = true;
            if (str != null && str.length() != 0) {
                z9 = false;
            }
            aVar.t0(z9);
            Data build = new Data.Builder().putInt("downloadAutostartedInBackground", 0).putBoolean("downloadAnyway", z8).putString("packagename", str).build();
            AbstractC3255y.h(build, "Builder()\n              …\n                .build()");
            WorkManager.getInstance(this).enqueue(new OneTimeWorkRequest.Builder(GenerateQueueWorker.class).addTag("GenerateQueueWorker").setInputData(build).build());
            return;
        }
        String string = getString(R.string.error_download_in_progress_wait);
        AbstractC3255y.h(string, "getString(R.string.error…ownload_in_progress_wait)");
        d2(string);
    }

    public final void v4(int i8) {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new f(i8, this, null), 2, null);
    }

    /* loaded from: classes4.dex */
    public static final class b implements M4.b {
        b() {
        }

        @Override // M4.b
        public void a(N4.b app) {
            AbstractC3255y.i(app, "app");
            W1 w12 = W1.this;
            w12.I(w12.getString(R.string.backup_no_free_space));
        }

        @Override // M4.b
        public void b(N4.b app) {
            AbstractC3255y.i(app, "app");
            W1 w12 = W1.this;
            w12.I(w12.getString(R.string.core_msg_cannot_write_path));
        }

        @Override // M4.b
        public void c(ArrayList apps) {
            AbstractC3255y.i(apps, "apps");
            NsdServiceInfo nsdServiceInfo = null;
            if (apps.size() == 1) {
                if (!W1.this.h4()) {
                    W1.this.E3(((N4.b) apps.get(0)).b(), ((N4.b) apps.get(0)).a());
                    return;
                }
                AlertDialog r22 = W1.this.r2();
                if (r22 != null) {
                    r22.dismiss();
                }
                W1.this.r4(false);
                Object b8 = new J4.a(W1.this).b();
                if (b8 instanceof File) {
                    W1 w12 = W1.this;
                    String a8 = ((N4.b) apps.get(0)).a();
                    AbstractC3255y.f(a8);
                    w12.q4(new File((File) b8, a8));
                    O4.h l8 = H4.j.f3824g.l();
                    if (l8 != null) {
                        nsdServiceInfo = l8.e();
                    }
                    if (nsdServiceInfo == null) {
                        W1.this.R0();
                        return;
                    }
                    File f42 = W1.this.f4();
                    if (f42 != null && f42.exists()) {
                        File f43 = W1.this.f4();
                        AbstractC3255y.f(f43);
                        if (!f43.isDirectory()) {
                            UptodownApp uptodownApp = new UptodownApp();
                            File f44 = W1.this.f4();
                            AbstractC3255y.f(f44);
                            uptodownApp.R(f44);
                            return;
                        }
                    }
                    W1 w13 = W1.this;
                    w13.I(w13.getString(R.string.error_generico));
                    return;
                }
                if (b8 instanceof DocumentFile) {
                    String a9 = ((N4.b) apps.get(0)).a();
                    AbstractC3255y.f(a9);
                    DocumentFile findFile = ((DocumentFile) b8).findFile(a9);
                    if (findFile != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(findFile);
                        new L4.b(arrayList, new Q4.f().g(W1.this), new a(W1.this, apps), false, W1.this);
                        return;
                    }
                    return;
                }
                return;
            }
            if (apps.size() > 0) {
                kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34167a;
                String string = W1.this.getString(R.string.msg_backup_x_apps);
                AbstractC3255y.h(string, "getString(R.string.msg_backup_x_apps)");
                String format = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(apps.size())}, 1));
                AbstractC3255y.h(format, "format(...)");
                W1.this.E3(format, null);
            }
        }

        @Override // M4.b
        public void d(String appName) {
            AbstractC3255y.i(appName, "appName");
            TextView textView = W1.this.f1945O;
            if (textView != null) {
                textView.setText(appName);
            }
            TextView textView2 = W1.this.f1946P;
            if (textView2 != null) {
                kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34167a;
                String format = String.format(Locale.getDefault(), "%d%%", Arrays.copyOf(new Object[]{0}, 1));
                AbstractC3255y.h(format, "format(...)");
                textView2.setText(format);
            }
            ProgressBar progressBar = W1.this.f1944N;
            if (progressBar != null) {
                progressBar.setProgress(0);
            }
        }

        @Override // M4.b
        public void e(int i8) {
            TextView textView = W1.this.f1946P;
            if (textView != null) {
                kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34167a;
                String format = String.format(Locale.getDefault(), "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(i8)}, 1));
                AbstractC3255y.h(format, "format(...)");
                textView.setText(format);
            }
            ProgressBar progressBar = W1.this.f1944N;
            if (progressBar != null) {
                progressBar.setProgress(i8);
            }
        }

        @Override // M4.b
        public void f(N4.b app) {
            AbstractC3255y.i(app, "app");
            W1 w12 = W1.this;
            w12.I(w12.getString(R.string.core_msg_cannot_write_path));
        }

        @Override // M4.b
        public void g(N4.b app, int i8) {
            AbstractC3255y.i(app, "app");
            W1.this.C3(app.b(), i8);
        }

        /* loaded from: classes4.dex */
        public static final class a implements M4.d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ W1 f1959a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ArrayList f1960b;

            a(W1 w12, ArrayList arrayList) {
                this.f1959a = w12;
                this.f1960b = arrayList;
            }

            @Override // M4.d
            public void a(DocumentFile docFile) {
                AbstractC3255y.i(docFile, "docFile");
            }

            @Override // M4.d
            public void c(File file) {
                AbstractC3255y.i(file, "file");
            }

            @Override // M4.d
            public void d(DocumentFile docFile) {
                AbstractC3255y.i(docFile, "docFile");
            }

            @Override // M4.d
            public void e(File file) {
                AbstractC3255y.i(file, "file");
            }

            @Override // M4.d
            public void f(Object file, int i8) {
                AbstractC3255y.i(file, "file");
            }

            @Override // M4.d
            public void h(Object file) {
                AbstractC3255y.i(file, "file");
            }

            @Override // M4.d
            public void i() {
                NsdServiceInfo nsdServiceInfo;
                W1 w12 = this.f1959a;
                File g8 = new Q4.f().g(this.f1959a);
                String a8 = ((N4.b) this.f1960b.get(0)).a();
                AbstractC3255y.f(a8);
                w12.q4(new File(g8, a8));
                O4.h l8 = H4.j.f3824g.l();
                if (l8 != null) {
                    nsdServiceInfo = l8.e();
                } else {
                    nsdServiceInfo = null;
                }
                if (nsdServiceInfo == null) {
                    this.f1959a.R0();
                    return;
                }
                File f42 = this.f1959a.f4();
                if (f42 != null && f42.exists()) {
                    File f43 = this.f1959a.f4();
                    AbstractC3255y.f(f43);
                    if (!f43.isDirectory()) {
                        UptodownApp uptodownApp = new UptodownApp();
                        File f44 = this.f1959a.f4();
                        AbstractC3255y.f(f44);
                        uptodownApp.R(f44);
                        return;
                    }
                }
                W1 w13 = this.f1959a;
                w13.I(w13.getString(R.string.error_generico));
            }

            @Override // M4.d
            public void g() {
            }

            @Override // M4.d
            public void b(int i8) {
            }
        }
    }
}
