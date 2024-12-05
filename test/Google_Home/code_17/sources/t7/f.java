package T7;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class f extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final View f10192a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f10193b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f10194c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f10195d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10196e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f10197f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f10198g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f10199h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f10200i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f10201j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f10202k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View rootView) {
        super(rootView);
        AbstractC3255y.i(rootView, "rootView");
        View findViewById = rootView.findViewById(L1.b.f5854y);
        AbstractC3255y.h(findViewById, "rootView.findViewById(R.id.disclosure_divider)");
        this.f10192a = findViewById;
        View findViewById2 = rootView.findViewById(L1.b.f5747F0);
        AbstractC3255y.h(findViewById2, "rootView.findViewById(R.…isclosure_purposes_label)");
        this.f10193b = (TextView) findViewById2;
        View findViewById3 = rootView.findViewById(L1.b.f5857z0);
        AbstractC3255y.h(findViewById3, "rootView.findViewById(R.…_disclosure_domain_label)");
        this.f10194c = (TextView) findViewById3;
        View findViewById4 = rootView.findViewById(L1.b.f5739B0);
        AbstractC3255y.h(findViewById4, "rootView.findViewById(R.…disclosure_max_age_label)");
        this.f10195d = (TextView) findViewById4;
        View findViewById5 = rootView.findViewById(L1.b.f5751H0);
        AbstractC3255y.h(findViewById5, "rootView.findViewById(R.…tv_disclosure_type_label)");
        this.f10196e = (TextView) findViewById5;
        View findViewById6 = rootView.findViewById(L1.b.f5743D0);
        AbstractC3255y.h(findViewById6, "rootView.findViewById(R.…tv_disclosure_name_label)");
        this.f10197f = (TextView) findViewById6;
        View findViewById7 = rootView.findViewById(L1.b.f5745E0);
        AbstractC3255y.h(findViewById7, "rootView.findViewById(R.id.tv_disclosure_purposes)");
        this.f10198g = (TextView) findViewById7;
        View findViewById8 = rootView.findViewById(L1.b.f5855y0);
        AbstractC3255y.h(findViewById8, "rootView.findViewById(R.id.tv_disclosure_domain)");
        this.f10199h = (TextView) findViewById8;
        View findViewById9 = rootView.findViewById(L1.b.f5737A0);
        AbstractC3255y.h(findViewById9, "rootView.findViewById(R.id.tv_disclosure_max_age)");
        this.f10200i = (TextView) findViewById9;
        View findViewById10 = rootView.findViewById(L1.b.f5749G0);
        AbstractC3255y.h(findViewById10, "rootView.findViewById(R.id.tv_disclosure_type)");
        this.f10201j = (TextView) findViewById10;
        View findViewById11 = rootView.findViewById(L1.b.f5741C0);
        AbstractC3255y.h(findViewById11, "rootView.findViewById(R.id.tv_disclosure_name)");
        this.f10202k = (TextView) findViewById11;
    }
}
