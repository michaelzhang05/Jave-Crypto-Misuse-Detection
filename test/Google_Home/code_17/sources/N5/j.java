package n5;

import H4.j;
import Q4.q;
import a5.C1639f;
import a5.C1648o;
import a5.z;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import j6.n;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.Y;
import o5.C3674n;

/* loaded from: classes5.dex */
public final class j extends Presenter.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private RelativeLayout f35542a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f35543b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f35544c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f35545d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f35546e;

    /* renamed from: f, reason: collision with root package name */
    private ProgressBar f35547f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f35548g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(View itemView) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.rl_tv_old_version_item);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.id.rl_tv_old_version_item)");
        this.f35542a = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.iv_icono_version);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.id.iv_icono_version)");
        this.f35543b = (ImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.tv_name_version);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.id.tv_name_version)");
        this.f35544c = (TextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_size_version);
        AbstractC3255y.h(findViewById4, "itemView.findViewById(R.id.tv_size_version)");
        this.f35545d = (TextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.tv_version);
        AbstractC3255y.h(findViewById5, "itemView.findViewById(R.id.tv_version)");
        this.f35546e = (TextView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.progressbar_downloading_version);
        AbstractC3255y.h(findViewById6, "itemView.findViewById(R.…sbar_downloading_version)");
        this.f35547f = (ProgressBar) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.tv_action_old_version_item);
        AbstractC3255y.h(findViewById7, "itemView.findViewById(R.…_action_old_version_item)");
        this.f35548g = (TextView) findViewById7;
        TextView textView = this.f35544c;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.u());
        this.f35545d.setTypeface(aVar.u());
        this.f35546e.setTypeface(aVar.u());
        this.f35548g.setTypeface(aVar.u());
    }

    public final void a(z item, Context context, String str, C1639f c1639f) {
        String str2;
        Long l8;
        boolean z8;
        AbstractC3255y.i(item, "item");
        AbstractC3255y.i(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            AbstractC3255y.h(packageManager, "context.packageManager");
            AbstractC3255y.f(str);
            this.f35543b.setImageDrawable(q.d(packageManager, str, 0).applicationInfo.loadIcon(context.getPackageManager()));
        } catch (Exception unused) {
            this.f35543b.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_uptodown_logo_bag_disabled));
        }
        TextView textView = this.f35544c;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.u());
        this.f35545d.setTypeface(aVar.u());
        this.f35546e.setTypeface(aVar.u());
        TextView textView2 = this.f35544c;
        String str3 = null;
        if (c1639f != null) {
            str2 = c1639f.z();
        } else {
            str2 = null;
        }
        textView2.setText(str2);
        this.f35546e.setText(item.p());
        if (c1639f != null) {
            l8 = Long.valueOf(c1639f.f0());
        } else {
            l8 = null;
        }
        if (l8 != null && c1639f.f0() == item.l()) {
            this.f35544c.setTextColor(ContextCompat.getColor(context, R.color.white));
            this.f35545d.setTextColor(ContextCompat.getColor(context, R.color.white));
            this.f35546e.setTextColor(ContextCompat.getColor(context, R.color.white));
            this.f35542a.setBackgroundColor(ContextCompat.getColor(context, R.color.main_blue));
            this.f35548g.setVisibility(8);
            return;
        }
        C3674n a8 = C3674n.f36505t.a(context);
        a8.a();
        String a9 = item.a();
        AbstractC3255y.f(a9);
        C1648o Z7 = a8.Z(a9);
        a8.l();
        if (Z7 != null && Z7.Z() > 0 && Z7.Z() < 100) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (Z7 == null) {
            this.f35548g.setText(R.string.updates_button_download_app);
            this.f35548g.setBackgroundColor(ContextCompat.getColor(context, R.color.accent_green));
            return;
        }
        if (z8) {
            TextView textView3 = this.f35545d;
            Y y8 = Y.f34167a;
            String format = String.format(Locale.getDefault(), "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(Z7.Z())}, 1));
            AbstractC3255y.h(format, "format(...)");
            textView3.setText(format);
            this.f35546e.setVisibility(8);
            this.f35547f.setProgress(Z7.Z());
            this.f35547f.setVisibility(0);
            this.f35548g.setText(android.R.string.cancel);
            this.f35548g.setBackgroundColor(ContextCompat.getColor(context, R.color.main_light_grey));
            return;
        }
        this.f35546e.setVisibility(0);
        if (item.i() > 0) {
            this.f35545d.setText(new Q4.g().c(item.i()));
        }
        this.f35547f.setVisibility(4);
        N4.a h8 = aVar.h();
        if (h8 != null) {
            str3 = h8.b();
        }
        if (n.s(str3, Z7.Y(), true)) {
            this.f35547f.setIndeterminate(true);
            this.f35547f.setVisibility(0);
            this.f35546e.setText(R.string.installing);
            this.f35545d.setText("");
            return;
        }
        this.f35548g.setText(R.string.option_button_install);
        this.f35548g.setBackgroundColor(ContextCompat.getColor(context, R.color.main_blue));
    }
}
