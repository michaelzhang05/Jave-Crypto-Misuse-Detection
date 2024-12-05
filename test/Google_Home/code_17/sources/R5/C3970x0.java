package r5;

import H4.j;
import Z4.InterfaceC1587a;
import Z4.InterfaceC1590d;
import a5.C1641h;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: r5.x0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3970x0 extends AbstractC3938h {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1590d f39126b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1587a f39127c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f39128d;

    /* renamed from: e, reason: collision with root package name */
    private RelativeLayout f39129e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f39130f;

    /* renamed from: g, reason: collision with root package name */
    private final ProgressBar f39131g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f39132h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f39133i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f39134j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f39135k;

    /* renamed from: l, reason: collision with root package name */
    private final TextView f39136l;

    /* renamed from: m, reason: collision with root package name */
    private final TextView f39137m;

    /* renamed from: n, reason: collision with root package name */
    private final LinearLayout f39138n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3970x0(View itemView, InterfaceC1590d listener, InterfaceC1587a interfaceC1587a, Context context) {
        super(itemView, context);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(context, "context");
        this.f39126b = listener;
        this.f39127c = interfaceC1587a;
        this.f39128d = context;
        View findViewById = itemView.findViewById(R.id.rl_app_info_top_by_cat_small_item);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.…fo_top_by_cat_small_item)");
        this.f39129e = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.iv_logo_app_info_top_by_cat_small_item);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.…fo_top_by_cat_small_item)");
        this.f39130f = (ImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.pb_progress_app_info_top_by_cat_small_item);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.…fo_top_by_cat_small_item)");
        this.f39131g = (ProgressBar) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_name_app_info_top_by_cat_small_item);
        AbstractC3255y.h(findViewById4, "itemView.findViewById(R.…fo_top_by_cat_small_item)");
        this.f39132h = (TextView) findViewById4;
        this.f39133i = (TextView) itemView.findViewById(R.id.tv_number_app_info_top_by_cat_small_item);
        View findViewById5 = itemView.findViewById(R.id.tv_desc_app_info_top_by_cat_small_item);
        AbstractC3255y.h(findViewById5, "itemView.findViewById(R.…fo_top_by_cat_small_item)");
        this.f39134j = (TextView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.tv_status_app_info_top_by_cat_small_item);
        AbstractC3255y.h(findViewById6, "itemView.findViewById(R.…fo_top_by_cat_small_item)");
        this.f39135k = (TextView) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.tv_progress_app_info_top_by_cat_small_item);
        AbstractC3255y.h(findViewById7, "itemView.findViewById(R.…fo_top_by_cat_small_item)");
        TextView textView = (TextView) findViewById7;
        this.f39136l = textView;
        View findViewById8 = itemView.findViewById(R.id.tv_verified_app_info_top_by_cat_small_item);
        AbstractC3255y.h(findViewById8, "itemView.findViewById(R.…fo_top_by_cat_small_item)");
        TextView textView2 = (TextView) findViewById8;
        this.f39137m = textView2;
        View findViewById9 = itemView.findViewById(R.id.ll_progress_app_info_top_by_cat_small_item);
        AbstractC3255y.h(findViewById9, "itemView.findViewById(R.…fo_top_by_cat_small_item)");
        this.f39138n = (LinearLayout) findViewById9;
        TextView textView3 = this.f39132h;
        j.a aVar = H4.j.f3824g;
        textView3.setTypeface(aVar.t());
        TextView textView4 = this.f39133i;
        if (textView4 != null) {
            textView4.setTypeface(aVar.t());
        }
        this.f39134j.setTypeface(aVar.u());
        this.f39135k.setTypeface(aVar.u());
        textView.setTypeface(aVar.u());
        textView2.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(C3970x0 this$0, C1641h app, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(app, "$app");
        InterfaceC1587a interfaceC1587a = this$0.f39127c;
        if (interfaceC1587a != null) {
            interfaceC1587a.a(app, this$0.getPosition());
            return true;
        }
        return true;
    }

    public final void m(final C1641h app, int i8) {
        AbstractC3255y.i(app, "app");
        c(this.f39129e, this.f39126b, app);
        this.f39129e.setOnLongClickListener(new View.OnLongClickListener() { // from class: r5.w0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean n8;
                n8 = C3970x0.n(C3970x0.this, app, view);
                return n8;
            }
        });
        if (i8 > 0) {
            TextView textView = this.f39133i;
            if (textView != null) {
                textView.setText(this.itemView.getContext().getResources().getString(R.string.top_index_format, String.valueOf(i8)));
            }
            TextView textView2 = this.f39133i;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        } else {
            TextView textView3 = this.f39133i;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        }
        i(app, this.f39132h, this.f39134j);
        h(this.f39130f, app.m0());
        e(app, this.f39131g, this.f39130f, this.f39134j, this.f39136l, this.f39135k, this.f39138n);
    }
}
