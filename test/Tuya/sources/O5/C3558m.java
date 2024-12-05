package o5;

import E4.j;
import W4.InterfaceC1478a;
import W4.InterfaceC1481d;
import X4.C1498h;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.uptodown.R;
import com.uptodown.util.views.CropImageView;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: o5.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3558m extends AbstractC3548h {

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC1481d f36825b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1478a f36826c;

    /* renamed from: d, reason: collision with root package name */
    private CropImageView f36827d;

    /* renamed from: e, reason: collision with root package name */
    private final ProgressBar f36828e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f36829f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f36830g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f36831h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f36832i;

    /* renamed from: j, reason: collision with root package name */
    private final TextView f36833j;

    /* renamed from: k, reason: collision with root package name */
    private final LinearLayout f36834k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f36835l;

    /* renamed from: m, reason: collision with root package name */
    private String f36836m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3558m(View itemView, InterfaceC1481d listener, InterfaceC1478a actionsClickListener, Context context) {
        super(itemView, context);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(actionsClickListener, "actionsClickListener");
        AbstractC3159y.i(context, "context");
        this.f36825b = listener;
        this.f36826c = actionsClickListener;
        View findViewById = itemView.findViewById(R.id.iv_featured);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.iv_featured)");
        this.f36827d = (CropImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.pb_progress_card);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.pb_progress_card)");
        this.f36828e = (ProgressBar) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.iv_logo_card);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.id.iv_logo_card)");
        this.f36829f = (ImageView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_titulo_card);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.id.tv_titulo_card)");
        this.f36830g = (TextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.tv_resumen_card);
        AbstractC3159y.h(findViewById5, "itemView.findViewById(R.id.tv_resumen_card)");
        this.f36831h = (TextView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.tv_progress_card);
        AbstractC3159y.h(findViewById6, "itemView.findViewById(R.id.tv_progress_card)");
        TextView textView = (TextView) findViewById6;
        this.f36832i = textView;
        View findViewById7 = itemView.findViewById(R.id.tv_verified_card);
        AbstractC3159y.h(findViewById7, "itemView.findViewById(R.id.tv_verified_card)");
        TextView textView2 = (TextView) findViewById7;
        this.f36833j = textView2;
        View findViewById8 = itemView.findViewById(R.id.ll_progress_card);
        AbstractC3159y.h(findViewById8, "itemView.findViewById(R.id.ll_progress_card)");
        this.f36834k = (LinearLayout) findViewById8;
        View findViewById9 = itemView.findViewById(R.id.tv_status_card);
        AbstractC3159y.h(findViewById9, "itemView.findViewById(R.id.tv_status_card)");
        this.f36835l = (TextView) findViewById9;
        TextView textView3 = this.f36830g;
        j.a aVar = E4.j.f2274g;
        textView3.setTypeface(aVar.t());
        this.f36831h.setTypeface(aVar.u());
        this.f36835l.setTypeface(aVar.u());
        textView.setTypeface(aVar.u());
        textView2.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(C3558m this$0, C1498h app, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(app, "$app");
        this$0.f36826c.a(app, -1);
        return true;
    }

    public final void m(final C1498h app) {
        AbstractC3159y.i(app, "app");
        this.f36836m = app.y0();
        com.squareup.picasso.s.h().l(app.e0()).l(R.color.main_blue).i(this.f36827d);
        View itemView = this.itemView;
        AbstractC3159y.h(itemView, "itemView");
        c(itemView, this.f36825b, app);
        i(app, this.f36830g, this.f36831h);
        h(this.f36829f, app.l0());
        e(app, this.f36828e, this.f36829f, this.f36831h, this.f36832i, this.f36835l, this.f36834k);
        this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o5.l
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean n8;
                n8 = C3558m.n(C3558m.this, app, view);
                return n8;
            }
        });
    }

    public final String o() {
        return this.f36836m;
    }
}
