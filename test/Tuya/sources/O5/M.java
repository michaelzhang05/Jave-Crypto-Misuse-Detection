package o5;

import E4.j;
import W4.InterfaceC1478a;
import X4.C1498h;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class M extends AbstractC3548h {

    /* renamed from: b, reason: collision with root package name */
    private W4.s f36615b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1478a f36616c;

    /* renamed from: d, reason: collision with root package name */
    private Context f36617d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f36618e;

    /* renamed from: f, reason: collision with root package name */
    private RecyclerView f36619f;

    /* renamed from: g, reason: collision with root package name */
    private final ProgressBar f36620g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f36621h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f36622i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f36623j;

    /* renamed from: k, reason: collision with root package name */
    private final TextView f36624k;

    /* renamed from: l, reason: collision with root package name */
    private final TextView f36625l;

    /* renamed from: m, reason: collision with root package name */
    private final TextView f36626m;

    /* renamed from: n, reason: collision with root package name */
    private final LinearLayout f36627n;

    /* renamed from: o, reason: collision with root package name */
    private D4.D f36628o;

    /* renamed from: p, reason: collision with root package name */
    private String f36629p;

    /* loaded from: classes5.dex */
    public static final class a implements W4.C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1498h f36631b;

        a(C1498h c1498h) {
            this.f36631b = c1498h;
        }

        @Override // W4.C
        public void a(X4.L screenshot) {
            AbstractC3159y.i(screenshot, "screenshot");
            M.this.f36615b.b(this.f36631b);
        }

        @Override // W4.C
        public void b(X4.L screenshot) {
            AbstractC3159y.i(screenshot, "screenshot");
            D4.D d8 = M.this.f36628o;
            if (d8 != null) {
                d8.c(screenshot);
            }
        }

        @Override // W4.C
        public void c(X4.T video) {
            AbstractC3159y.i(video, "video");
        }

        @Override // W4.C
        public void d(X4.T video) {
            AbstractC3159y.i(video, "video");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(View itemView, W4.s listener, InterfaceC1478a actionsClickListener, Context context) {
        super(itemView, context);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(actionsClickListener, "actionsClickListener");
        AbstractC3159y.i(context, "context");
        this.f36615b = listener;
        this.f36616c = actionsClickListener;
        this.f36617d = context;
        View findViewById = itemView.findViewById(R.id.tv_title_home_gallery_featured);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.…le_home_gallery_featured)");
        this.f36618e = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.rv_screenshots_home_gallery_featured);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.…ts_home_gallery_featured)");
        this.f36619f = (RecyclerView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.pb_progress_gallery_featured_item);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.…ss_gallery_featured_item)");
        this.f36620g = (ProgressBar) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.iv_logo_gallery_featured_item);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.…go_gallery_featured_item)");
        this.f36621h = (ImageView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.tv_name_gallery_featured_item);
        AbstractC3159y.h(findViewById5, "itemView.findViewById(R.…me_gallery_featured_item)");
        this.f36622i = (TextView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.tv_desc_gallery_featured_item);
        AbstractC3159y.h(findViewById6, "itemView.findViewById(R.…sc_gallery_featured_item)");
        this.f36623j = (TextView) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.tv_status_gallery_featured_item);
        AbstractC3159y.h(findViewById7, "itemView.findViewById(R.…us_gallery_featured_item)");
        TextView textView = (TextView) findViewById7;
        this.f36624k = textView;
        View findViewById8 = itemView.findViewById(R.id.tv_progress_gallery_featured_item);
        AbstractC3159y.h(findViewById8, "itemView.findViewById(R.…ss_gallery_featured_item)");
        TextView textView2 = (TextView) findViewById8;
        this.f36625l = textView2;
        View findViewById9 = itemView.findViewById(R.id.tv_verified_gallery_featured_item);
        AbstractC3159y.h(findViewById9, "itemView.findViewById(R.…ed_gallery_featured_item)");
        TextView textView3 = (TextView) findViewById9;
        this.f36626m = textView3;
        View findViewById10 = itemView.findViewById(R.id.ll_progress_gallery_featured_item);
        AbstractC3159y.h(findViewById10, "itemView.findViewById(R.…ss_gallery_featured_item)");
        this.f36627n = (LinearLayout) findViewById10;
        TextView textView4 = this.f36618e;
        j.a aVar = E4.j.f2274g;
        textView4.setTypeface(aVar.t());
        this.f36622i.setTypeface(aVar.t());
        this.f36623j.setTypeface(aVar.u());
        textView2.setTypeface(aVar.u());
        textView3.setTypeface(aVar.u());
        textView.setTypeface(aVar.u());
        int dimension = (int) this.f36617d.getResources().getDimension(R.dimen.margin_m);
        this.f36619f.setLayoutManager(new LinearLayoutManager(this.f36617d, 0, false));
        this.f36619f.addItemDecoration(new n5.s(dimension));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(M this$0, C1498h app, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(app, "$app");
        this$0.f36616c.a(app, -1);
        return true;
    }

    private final void r(C1498h c1498h) {
        if (this.f36628o == null) {
            a aVar = new a(c1498h);
            ArrayList arrayList = new ArrayList();
            ArrayList R02 = c1498h.R0();
            AbstractC3159y.f(R02);
            arrayList.addAll(R02);
            D4.D d8 = new D4.D(arrayList, aVar);
            this.f36628o = d8;
            this.f36619f.setAdapter(d8);
        }
    }

    private final void t(View view, final C1498h c1498h) {
        view.setOnClickListener(new View.OnClickListener() { // from class: o5.L
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                M.u(M.this, c1498h, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(M this$0, C1498h app, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(app, "$app");
        this$0.f36615b.b(app);
    }

    public final void p(final C1498h app) {
        AbstractC3159y.i(app, "app");
        this.f36629p = app.y0();
        this.f36618e.setText(this.f36617d.getString(R.string.home_fragment_download_app_title, app.s0()));
        View itemView = this.itemView;
        AbstractC3159y.h(itemView, "itemView");
        t(itemView, app);
        this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o5.K
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean q8;
                q8 = M.q(M.this, app, view);
                return q8;
            }
        });
        ArrayList R02 = app.R0();
        if (R02 != null && !R02.isEmpty()) {
            r(app);
        }
        i(app, this.f36622i, this.f36623j);
        h(this.f36621h, app.m0());
        e(app, this.f36620g, this.f36621h, this.f36623j, this.f36625l, this.f36624k, this.f36627n);
    }

    public final String s() {
        return this.f36629p;
    }
}
