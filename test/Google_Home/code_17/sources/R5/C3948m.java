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
import android.widget.TextView;
import com.uptodown.R;
import com.uptodown.util.views.CropImageView;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: r5.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3948m extends AbstractC3938h {

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC1590d f39033b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1587a f39034c;

    /* renamed from: d, reason: collision with root package name */
    private CropImageView f39035d;

    /* renamed from: e, reason: collision with root package name */
    private final ProgressBar f39036e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f39037f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f39038g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f39039h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f39040i;

    /* renamed from: j, reason: collision with root package name */
    private final TextView f39041j;

    /* renamed from: k, reason: collision with root package name */
    private final LinearLayout f39042k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f39043l;

    /* renamed from: m, reason: collision with root package name */
    private String f39044m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3948m(View itemView, InterfaceC1590d listener, InterfaceC1587a actionsClickListener, Context context) {
        super(itemView, context);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(actionsClickListener, "actionsClickListener");
        AbstractC3255y.i(context, "context");
        this.f39033b = listener;
        this.f39034c = actionsClickListener;
        View findViewById = itemView.findViewById(R.id.iv_featured);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.id.iv_featured)");
        this.f39035d = (CropImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.pb_progress_card);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.id.pb_progress_card)");
        this.f39036e = (ProgressBar) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.iv_logo_card);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.id.iv_logo_card)");
        this.f39037f = (ImageView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_titulo_card);
        AbstractC3255y.h(findViewById4, "itemView.findViewById(R.id.tv_titulo_card)");
        this.f39038g = (TextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.tv_resumen_card);
        AbstractC3255y.h(findViewById5, "itemView.findViewById(R.id.tv_resumen_card)");
        this.f39039h = (TextView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.tv_progress_card);
        AbstractC3255y.h(findViewById6, "itemView.findViewById(R.id.tv_progress_card)");
        TextView textView = (TextView) findViewById6;
        this.f39040i = textView;
        View findViewById7 = itemView.findViewById(R.id.tv_verified_card);
        AbstractC3255y.h(findViewById7, "itemView.findViewById(R.id.tv_verified_card)");
        TextView textView2 = (TextView) findViewById7;
        this.f39041j = textView2;
        View findViewById8 = itemView.findViewById(R.id.ll_progress_card);
        AbstractC3255y.h(findViewById8, "itemView.findViewById(R.id.ll_progress_card)");
        this.f39042k = (LinearLayout) findViewById8;
        View findViewById9 = itemView.findViewById(R.id.tv_status_card);
        AbstractC3255y.h(findViewById9, "itemView.findViewById(R.id.tv_status_card)");
        this.f39043l = (TextView) findViewById9;
        TextView textView3 = this.f39038g;
        j.a aVar = H4.j.f3824g;
        textView3.setTypeface(aVar.t());
        this.f39039h.setTypeface(aVar.u());
        this.f39043l.setTypeface(aVar.u());
        textView.setTypeface(aVar.u());
        textView2.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(C3948m this$0, C1641h app, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(app, "$app");
        this$0.f39034c.a(app, -1);
        return true;
    }

    public final void m(final C1641h app) {
        AbstractC3255y.i(app, "app");
        this.f39044m = app.y0();
        com.squareup.picasso.s.h().l(app.e0()).l(R.color.main_blue).i(this.f39035d);
        View itemView = this.itemView;
        AbstractC3255y.h(itemView, "itemView");
        c(itemView, this.f39033b, app);
        i(app, this.f39038g, this.f39039h);
        h(this.f39037f, app.l0());
        e(app, this.f39036e, this.f39037f, this.f39039h, this.f39040i, this.f39043l, this.f39042k);
        this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: r5.l
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean n8;
                n8 = C3948m.n(C3948m.this, app, view);
                return n8;
            }
        });
    }

    public final String o() {
        return this.f39044m;
    }
}
