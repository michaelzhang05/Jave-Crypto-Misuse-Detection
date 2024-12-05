package k5;

import E4.j;
import N4.q;
import X4.C1496f;
import X4.C1505o;
import X4.z;
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
import g6.n;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Y;
import l5.C3326n;

/* loaded from: classes5.dex */
public final class j extends Presenter.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private RelativeLayout f33550a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f33551b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f33552c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f33553d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f33554e;

    /* renamed from: f, reason: collision with root package name */
    private ProgressBar f33555f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f33556g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(View itemView) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.rl_tv_old_version_item);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.rl_tv_old_version_item)");
        this.f33550a = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.iv_icono_version);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.iv_icono_version)");
        this.f33551b = (ImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.tv_name_version);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.id.tv_name_version)");
        this.f33552c = (TextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_size_version);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.id.tv_size_version)");
        this.f33553d = (TextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.tv_version);
        AbstractC3159y.h(findViewById5, "itemView.findViewById(R.id.tv_version)");
        this.f33554e = (TextView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.progressbar_downloading_version);
        AbstractC3159y.h(findViewById6, "itemView.findViewById(R.…sbar_downloading_version)");
        this.f33555f = (ProgressBar) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.tv_action_old_version_item);
        AbstractC3159y.h(findViewById7, "itemView.findViewById(R.…_action_old_version_item)");
        this.f33556g = (TextView) findViewById7;
        TextView textView = this.f33552c;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.u());
        this.f33553d.setTypeface(aVar.u());
        this.f33554e.setTypeface(aVar.u());
        this.f33556g.setTypeface(aVar.u());
    }

    public final void a(z item, Context context, String str, C1496f c1496f) {
        String str2;
        Long l8;
        boolean z8;
        AbstractC3159y.i(item, "item");
        AbstractC3159y.i(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            AbstractC3159y.h(packageManager, "context.packageManager");
            AbstractC3159y.f(str);
            this.f33551b.setImageDrawable(q.d(packageManager, str, 0).applicationInfo.loadIcon(context.getPackageManager()));
        } catch (Exception unused) {
            this.f33551b.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_uptodown_logo_bag_disabled));
        }
        TextView textView = this.f33552c;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.u());
        this.f33553d.setTypeface(aVar.u());
        this.f33554e.setTypeface(aVar.u());
        TextView textView2 = this.f33552c;
        String str3 = null;
        if (c1496f != null) {
            str2 = c1496f.I();
        } else {
            str2 = null;
        }
        textView2.setText(str2);
        this.f33554e.setText(item.k());
        if (c1496f != null) {
            l8 = Long.valueOf(c1496f.f0());
        } else {
            l8 = null;
        }
        if (l8 != null && c1496f.f0() == item.j()) {
            this.f33552c.setTextColor(ContextCompat.getColor(context, R.color.white));
            this.f33553d.setTextColor(ContextCompat.getColor(context, R.color.white));
            this.f33554e.setTextColor(ContextCompat.getColor(context, R.color.white));
            this.f33550a.setBackgroundColor(ContextCompat.getColor(context, R.color.main_blue));
            this.f33556g.setVisibility(8);
            return;
        }
        C3326n a8 = C3326n.f34504t.a(context);
        a8.a();
        String b8 = item.b();
        AbstractC3159y.f(b8);
        C1505o Z7 = a8.Z(b8);
        a8.g();
        if (Z7 != null && Z7.Z() > 0 && Z7.Z() < 100) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (Z7 == null) {
            this.f33556g.setText(R.string.updates_button_download_app);
            this.f33556g.setBackgroundColor(ContextCompat.getColor(context, R.color.accent_green));
            return;
        }
        if (z8) {
            TextView textView3 = this.f33553d;
            Y y8 = Y.f33766a;
            String format = String.format(Locale.getDefault(), "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(Z7.Z())}, 1));
            AbstractC3159y.h(format, "format(...)");
            textView3.setText(format);
            this.f33554e.setVisibility(8);
            this.f33555f.setProgress(Z7.Z());
            this.f33555f.setVisibility(0);
            this.f33556g.setText(android.R.string.cancel);
            this.f33556g.setBackgroundColor(ContextCompat.getColor(context, R.color.main_light_grey));
            return;
        }
        this.f33554e.setVisibility(0);
        if (item.i() > 0) {
            this.f33553d.setText(new N4.g().c(item.i()));
        }
        this.f33555f.setVisibility(4);
        K4.a h8 = aVar.h();
        if (h8 != null) {
            str3 = h8.b();
        }
        if (n.s(str3, Z7.Y(), true)) {
            this.f33555f.setIndeterminate(true);
            this.f33555f.setVisibility(0);
            this.f33554e.setText(R.string.installing);
            this.f33553d.setText("");
            return;
        }
        this.f33556g.setText(R.string.option_button_install);
        this.f33556g.setBackgroundColor(ContextCompat.getColor(context, R.color.main_blue));
    }
}
