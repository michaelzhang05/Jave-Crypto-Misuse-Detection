package I4;

import H4.j;
import O4.h;
import android.R;
import android.app.AlertDialog;
import android.app.Application;
import android.graphics.drawable.ColorDrawable;
import android.net.nsd.NsdServiceInfo;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public abstract class a1 extends r {

    /* renamed from: o, reason: collision with root package name */
    private TextView f4111o;

    /* renamed from: p, reason: collision with root package name */
    private ProgressBar f4112p;

    /* renamed from: q, reason: collision with root package name */
    private AlertDialog f4113q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f4114r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f4115s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f4116t;

    /* renamed from: u, reason: collision with root package name */
    private LinearLayout f4117u;

    /* renamed from: v, reason: collision with root package name */
    private LinearLayout.LayoutParams f4118v;

    /* loaded from: classes5.dex */
    public static final class a implements M4.j {
        a() {
        }

        @Override // M4.j
        public void a(View view, int i8) {
            a1.this.X0();
            j.a aVar = H4.j.f3824g;
            O4.h l8 = aVar.l();
            AbstractC3255y.f(l8);
            int size = l8.g().size();
            if (size > 0 && size > i8) {
                O4.h l9 = aVar.l();
                AbstractC3255y.f(l9);
                Object obj = l9.g().get(i8);
                AbstractC3255y.h(obj, "UptodownCoreApplication.…esInfoAvailable[position]");
                O4.h l10 = aVar.l();
                AbstractC3255y.f(l10);
                l10.l((NsdServiceInfo) obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O0(a1 this$0, N4.c fileTransferInfo) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(fileTransferInfo, "$fileTransferInfo");
        this$0.i1(fileTransferInfo);
    }

    private final void P0() {
        View view = View.inflate(this, H4.f.f3743o, null);
        TextView textView = (TextView) view.findViewById(H4.e.f3596H1);
        this.f4111o = textView;
        if (textView != null) {
            textView.setTypeface(H4.j.f3824g.t());
        }
        ProgressBar progressBar = (ProgressBar) view.findViewById(H4.e.f3594H);
        this.f4112p = progressBar;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView2 = (TextView) view.findViewById(H4.e.f3718w0);
        this.f4116t = textView2;
        AbstractC3255y.f(textView2);
        j.a aVar = H4.j.f3824g;
        textView2.setTypeface(aVar.t());
        TextView textView3 = this.f4116t;
        if (textView3 != null) {
            textView3.setOnClickListener(new View.OnClickListener() { // from class: I4.O0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    a1.Q0(a1.this, view2);
                }
            });
        }
        TextView textView4 = (TextView) view.findViewById(H4.e.f3620P1);
        this.f4114r = textView4;
        if (textView4 != null) {
            textView4.setTypeface(aVar.u());
        }
        TextView textView5 = (TextView) view.findViewById(H4.e.f3619P0);
        this.f4115s = textView5;
        if (textView5 != null) {
            textView5.setTypeface(aVar.t());
        }
        AbstractC3255y.h(view, "view");
        h1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q0(a1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.X0();
        O4.c o8 = H4.j.f3824g.o();
        AbstractC3255y.f(o8);
        o8.r();
        this$0.c1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S0(a1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.X0();
        this$0.c1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U0(a1 this$0, String filename, String str) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(filename, "$filename");
        this$0.X0();
        if (new Q4.f().o(filename)) {
            this$0.l1(filename);
            return;
        }
        this$0.I(this$0.getString(H4.h.f3776Y) + filename + ' ' + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W0(a1 this$0) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.X0();
        this$0.o1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X0() {
        LinearLayout linearLayout = this.f4117u;
        if (linearLayout == null) {
            AlertDialog alertDialog = this.f4113q;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            this.f4113q = null;
            return;
        }
        AbstractC3255y.f(linearLayout);
        linearLayout.removeAllViews();
        LinearLayout linearLayout2 = this.f4117u;
        AbstractC3255y.f(linearLayout2);
        linearLayout2.setVisibility(8);
    }

    private final boolean Y0() {
        AlertDialog alertDialog = this.f4113q;
        if (alertDialog != null && alertDialog.isShowing()) {
            return true;
        }
        LinearLayout linearLayout = this.f4117u;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b1(a1 this$0, String msg) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(msg, "$msg");
        this$0.X0();
        this$0.I(msg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e1(a1 this$0, NsdServiceInfo nsdServiceInfo) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(nsdServiceInfo, "$nsdServiceInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(this$0.getString(H4.h.f3774W));
        h.a aVar = O4.h.f8251h;
        String serviceName = nsdServiceInfo.getServiceName();
        AbstractC3255y.h(serviceName, "nsdServiceInfo.serviceName");
        sb.append(aVar.c(serviceName));
        Toast.makeText(this$0, sb.toString(), 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g1(a1 this$0, String str) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.X0();
        this$0.I(str);
        this$0.c1();
    }

    private final void h1(View view) {
        Window window;
        AlertDialog alertDialog;
        LinearLayout linearLayout = this.f4117u;
        if (linearLayout == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setView(view);
            builder.setCancelable(false);
            AlertDialog create = builder.create();
            this.f4113q = create;
            if (create != null) {
                window = create.getWindow();
            } else {
                window = null;
            }
            AbstractC3255y.f(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            if (!isFinishing() && (alertDialog = this.f4113q) != null) {
                alertDialog.show();
                return;
            }
            return;
        }
        AbstractC3255y.f(linearLayout);
        linearLayout.removeAllViews();
        LinearLayout linearLayout2 = this.f4117u;
        AbstractC3255y.f(linearLayout2);
        linearLayout2.addView(view, this.f4118v);
        LinearLayout linearLayout3 = this.f4117u;
        AbstractC3255y.f(linearLayout3);
        linearLayout3.setVisibility(0);
    }

    private final void i1(final N4.c cVar) {
        X0();
        View view = View.inflate(this, H4.f.f3736h, null);
        View findViewById = view.findViewById(H4.e.f3722x1);
        AbstractC3255y.h(findViewById, "view.findViewById(R.id.tv_msg_confirm)");
        TextView textView = (TextView) findViewById;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.u());
        kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34167a;
        String string = getString(H4.h.f3773V);
        AbstractC3255y.h(string, "getString(R.string.msg_confirm_receive_file)");
        String format = String.format(string, Arrays.copyOf(new Object[]{cVar.f(), cVar.e()}, 2));
        AbstractC3255y.h(format, "format(format, *args)");
        textView.setText(format);
        View findViewById2 = view.findViewById(H4.e.f3586E0);
        AbstractC3255y.h(findViewById2, "view.findViewById(R.id.tv_confirm_receive)");
        TextView textView2 = (TextView) findViewById2;
        textView2.setTypeface(aVar.u());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: I4.M0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a1.j1(a1.this, cVar, view2);
            }
        });
        View findViewById3 = view.findViewById(H4.e.f3712u0);
        AbstractC3255y.h(findViewById3, "view.findViewById(R.id.tv_cancel)");
        TextView textView3 = (TextView) findViewById3;
        textView3.setTypeface(aVar.t());
        textView3.setOnClickListener(new View.OnClickListener() { // from class: I4.N0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a1.k1(a1.this, view2);
            }
        });
        AbstractC3255y.h(view, "view");
        h1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j1(a1 this$0, N4.c fileTransferInfo, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(fileTransferInfo, "$fileTransferInfo");
        this$0.X0();
        this$0.q1(fileTransferInfo.e());
        O4.c o8 = H4.j.f3824g.o();
        AbstractC3255y.f(o8);
        o8.o(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k1(a1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.X0();
        O4.c o8 = H4.j.f3824g.o();
        AbstractC3255y.f(o8);
        o8.o(false);
        this$0.c1();
    }

    private final void l1(final String str) {
        X0();
        View view = View.inflate(this, H4.f.f3742n, null);
        View findViewById = view.findViewById(H4.e.f3605K1);
        AbstractC3255y.h(findViewById, "view.findViewById(R.id.tv_receiving_finished)");
        TextView textView = (TextView) findViewById;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        textView.setText(str);
        View findViewById2 = view.findViewById(H4.e.f3680j1);
        AbstractC3255y.h(findViewById2, "view.findViewById(R.id.tv_install)");
        TextView textView2 = (TextView) findViewById2;
        textView2.setTypeface(aVar.t());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: I4.Z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a1.m1(a1.this, str, view2);
            }
        });
        View findViewById3 = view.findViewById(H4.e.f3712u0);
        AbstractC3255y.h(findViewById3, "view.findViewById(R.id.tv_cancel)");
        TextView textView3 = (TextView) findViewById3;
        textView3.setTypeface(aVar.t());
        textView3.setText(getString(R.string.ok));
        textView3.setOnClickListener(new View.OnClickListener() { // from class: I4.L0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a1.n1(a1.this, view2);
            }
        });
        AbstractC3255y.h(view, "view");
        h1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m1(a1 this$0, String filename, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(filename, "$filename");
        H4.i.f(new H4.i(this$0), new File(new Q4.f().f(this$0), filename), null, false, 6, null);
        this$0.X0();
        this$0.c1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n1(a1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.X0();
        this$0.c1();
    }

    private final void o1() {
        X0();
        View view = View.inflate(this, H4.f.f3742n, null);
        View findViewById = view.findViewById(H4.e.f3605K1);
        AbstractC3255y.h(findViewById, "view.findViewById(R.id.tv_receiving_finished)");
        TextView textView = (TextView) findViewById;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        textView.setText(getString(H4.h.f3787e0));
        View findViewById2 = view.findViewById(H4.e.f3680j1);
        AbstractC3255y.h(findViewById2, "view.findViewById(R.id.tv_install)");
        ((TextView) findViewById2).setVisibility(8);
        View findViewById3 = view.findViewById(H4.e.f3712u0);
        AbstractC3255y.h(findViewById3, "view.findViewById(R.id.tv_cancel)");
        TextView textView2 = (TextView) findViewById3;
        textView2.setTypeface(aVar.t());
        textView2.setText(getString(R.string.ok));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: I4.Y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a1.p1(a1.this, view2);
            }
        });
        AbstractC3255y.h(view, "view");
        h1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p1(a1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.X0();
        this$0.c1();
    }

    private final void q1(String str) {
        TextView textView;
        P0();
        TextView textView2 = this.f4114r;
        if (textView2 != null) {
            textView2.setText(getString(H4.h.f3781b0));
        }
        if (str != null && (textView = this.f4115s) != null) {
            textView.setText(str);
        }
    }

    private final void r1() {
        String str;
        TextView textView;
        NsdServiceInfo e8;
        P0();
        TextView textView2 = this.f4114r;
        if (textView2 != null) {
            textView2.setText(getString(H4.h.f3801l0));
        }
        O4.h l8 = H4.j.f3824g.l();
        if (l8 != null && (e8 = l8.e()) != null) {
            str = e8.getServiceName();
        } else {
            str = null;
        }
        if (str != null && (textView = this.f4115s) != null) {
            textView.setText(O4.h.f8251h.c(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t1(a1 this$0, boolean z8) {
        AbstractC3255y.i(this$0, "this$0");
        TextView textView = this$0.f4111o;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        ProgressBar progressBar = this$0.f4112p;
        if (progressBar != null) {
            progressBar.setIndeterminate(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v1(a1 this$0) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.r1();
        ProgressBar progressBar = this$0.f4112p;
        if (progressBar != null) {
            progressBar.setIndeterminate(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x1(a1 this$0, int i8) {
        AbstractC3255y.i(this$0, "this$0");
        ProgressBar progressBar = this$0.f4112p;
        if (progressBar != null) {
            progressBar.setProgress(i8);
        }
        TextView textView = this$0.f4111o;
        if (textView != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(i8);
            sb.append('%');
            textView.setText(sb.toString());
        }
    }

    public final void N0(final N4.c fileTransferInfo) {
        AbstractC3255y.i(fileTransferInfo, "fileTransferInfo");
        runOnUiThread(new Runnable() { // from class: I4.X0
            @Override // java.lang.Runnable
            public final void run() {
                a1.O0(a1.this, fileTransferInfo);
            }
        });
    }

    public final void R0() {
        Integer num;
        ArrayList g8;
        j.a aVar = H4.j.f3824g;
        O4.h l8 = aVar.l();
        if (l8 != null && (g8 = l8.g()) != null) {
            num = Integer.valueOf(g8.size());
        } else {
            num = null;
        }
        AbstractC3255y.f(num);
        if (num.intValue() > 0) {
            a aVar2 = new a();
            View view = View.inflate(this, H4.f.f3732d, null);
            O4.h l9 = aVar.l();
            AbstractC3255y.f(l9);
            K4.a aVar3 = new K4.a(l9.g(), aVar2);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(H4.e.f3648Z);
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), 1, false));
            }
            recyclerView.setAdapter(aVar3);
            View findViewById = view.findViewById(H4.e.f3712u0);
            AbstractC3255y.h(findViewById, "view.findViewById(R.id.tv_cancel)");
            TextView textView = (TextView) findViewById;
            textView.setTypeface(aVar.t());
            textView.setOnClickListener(new View.OnClickListener() { // from class: I4.P0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    a1.S0(a1.this, view2);
                }
            });
            AbstractC3255y.h(view, "view");
            h1(view);
            return;
        }
        I(getString(H4.h.f3789f0));
    }

    public final void T0(final String filename, final String str) {
        AbstractC3255y.i(filename, "filename");
        runOnUiThread(new Runnable() { // from class: I4.V0
            @Override // java.lang.Runnable
            public final void run() {
                a1.U0(a1.this, filename, str);
            }
        });
    }

    public final void V0() {
        runOnUiThread(new Runnable() { // from class: I4.S0
            @Override // java.lang.Runnable
            public final void run() {
                a1.W0(a1.this);
            }
        });
        H4.j.f3824g.b();
    }

    public final void a1(final String msg) {
        AbstractC3255y.i(msg, "msg");
        runOnUiThread(new Runnable() { // from class: I4.R0
            @Override // java.lang.Runnable
            public final void run() {
                a1.b1(a1.this, msg);
            }
        });
    }

    public abstract void c1();

    public void d1(final NsdServiceInfo nsdServiceInfo) {
        AbstractC3255y.i(nsdServiceInfo, "nsdServiceInfo");
        runOnUiThread(new Runnable() { // from class: I4.Q0
            @Override // java.lang.Runnable
            public final void run() {
                a1.e1(a1.this, nsdServiceInfo);
            }
        });
    }

    public final void f1(final String str) {
        runOnUiThread(new Runnable() { // from class: I4.U0
            @Override // java.lang.Runnable
            public final void run() {
                a1.g1(a1.this, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        O4.h l8;
        super.onResume();
        j.a aVar = H4.j.f3824g;
        O4.c o8 = aVar.o();
        if (o8 != null && !o8.j()) {
            Application application = getApplication();
            AbstractC3255y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
            if (!((H4.j) application).I().get() && (l8 = aVar.l()) != null) {
                l8.d();
            }
        }
        if (Y0()) {
            if (aVar.p()) {
                aVar.F(false);
                V0();
                return;
            }
            if (aVar.i() != null) {
                String i8 = aVar.i();
                AbstractC3255y.f(i8);
                T0(i8, aVar.j());
                aVar.y(null);
                aVar.z(null);
                return;
            }
            if (aVar.r() != null) {
                f1(aVar.r());
                aVar.H(null);
            } else if (aVar.q() != null) {
                String q8 = aVar.q();
                AbstractC3255y.f(q8);
                a1(q8);
                aVar.G(null);
            }
        }
    }

    public final void s1(final boolean z8) {
        runOnUiThread(new Runnable() { // from class: I4.W0
            @Override // java.lang.Runnable
            public final void run() {
                a1.t1(a1.this, z8);
            }
        });
    }

    public final void u1() {
        runOnUiThread(new Runnable() { // from class: I4.K0
            @Override // java.lang.Runnable
            public final void run() {
                a1.v1(a1.this);
            }
        });
    }

    public final void w1(final int i8) {
        runOnUiThread(new Runnable() { // from class: I4.T0
            @Override // java.lang.Runnable
            public final void run() {
                a1.x1(a1.this, i8);
            }
        });
    }

    public void Z0() {
    }
}
