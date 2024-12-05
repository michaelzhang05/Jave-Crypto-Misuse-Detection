package n5;

import H4.j;
import a5.C1648o;
import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import j6.n;
import java.io.File;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.Y;
import o5.C3674n;

/* loaded from: classes5.dex */
public final class i extends Presenter.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private TextView f35538a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f35539b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f35540c;

    /* renamed from: d, reason: collision with root package name */
    private ProgressBar f35541d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(View itemView) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.tv_nombre_app);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.id.tv_nombre_app)");
        this.f35538a = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_size_download);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.id.tv_size_download)");
        this.f35539b = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.tv_date_download);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.id.tv_date_download)");
        this.f35540c = (TextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.progressbar_downloading);
        AbstractC3255y.h(findViewById4, "itemView.findViewById(R.….progressbar_downloading)");
        this.f35541d = (ProgressBar) findViewById4;
        TextView textView = this.f35538a;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.u());
        this.f35539b.setTypeface(aVar.u());
        this.f35540c.setTypeface(aVar.u());
    }

    public final void a(File item, Context context) {
        AbstractC3255y.i(item, "item");
        if (context != null) {
            C3674n a8 = C3674n.f36505t.a(context);
            a8.a();
            String name = item.getName();
            AbstractC3255y.h(name, "item.name");
            C1648o Y7 = a8.Y(name);
            a8.l();
            this.f35538a.setText(item.getName());
            this.f35539b.setText(new Q4.g().c(item.length()));
            if (Y7 != null && Y7.p() == 0) {
                this.f35538a.setTypeface(H4.j.f3824g.u());
            } else {
                this.f35538a.setTypeface(H4.j.f3824g.u());
            }
            TextView textView = this.f35539b;
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.u());
            this.f35540c.setTypeface(aVar.u());
            if (Y7 != null && Y7.Z() > 0 && Y7.Z() < 100) {
                TextView textView2 = this.f35539b;
                Y y8 = Y.f34167a;
                Locale locale = Locale.getDefault();
                AbstractC3255y.f(Y7);
                String format = String.format(locale, "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(Y7.Z())}, 1));
                AbstractC3255y.h(format, "format(...)");
                textView2.setText(format);
                this.f35540c.setVisibility(8);
                this.f35541d.setProgress(Y7.Z());
                this.f35541d.setVisibility(0);
                return;
            }
            N4.a h8 = aVar.h();
            if (h8 != null && Y7 != null && n.s(h8.b(), Y7.Y(), true) && Y7.e0() > 0 && h8.e() == Y7.e0()) {
                this.f35541d.setIndeterminate(true);
                this.f35541d.setVisibility(0);
                this.f35540c.setText(R.string.installing);
                this.f35539b.setText("");
                return;
            }
            long lastModified = item.lastModified();
            DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
            this.f35540c.setVisibility(0);
            this.f35540c.setText(dateTimeInstance.format(new Date(lastModified)));
            this.f35539b.setText(new Q4.g().c(item.length()));
            this.f35541d.setVisibility(4);
        }
    }
}
