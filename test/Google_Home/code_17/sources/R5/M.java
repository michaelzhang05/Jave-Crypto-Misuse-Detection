package r5;

import H4.j;
import Z4.InterfaceC1587a;
import a5.C1641h;
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
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class M extends AbstractC3938h {

    /* renamed from: b, reason: collision with root package name */
    private Z4.s f38823b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1587a f38824c;

    /* renamed from: d, reason: collision with root package name */
    private Context f38825d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f38826e;

    /* renamed from: f, reason: collision with root package name */
    private RecyclerView f38827f;

    /* renamed from: g, reason: collision with root package name */
    private final ProgressBar f38828g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f38829h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f38830i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f38831j;

    /* renamed from: k, reason: collision with root package name */
    private final TextView f38832k;

    /* renamed from: l, reason: collision with root package name */
    private final TextView f38833l;

    /* renamed from: m, reason: collision with root package name */
    private final TextView f38834m;

    /* renamed from: n, reason: collision with root package name */
    private final LinearLayout f38835n;

    /* renamed from: o, reason: collision with root package name */
    private G4.D f38836o;

    /* renamed from: p, reason: collision with root package name */
    private String f38837p;

    /* loaded from: classes5.dex */
    public static final class a implements Z4.C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1641h f38839b;

        a(C1641h c1641h) {
            this.f38839b = c1641h;
        }

        @Override // Z4.C
        public void a(a5.L screenshot) {
            AbstractC3255y.i(screenshot, "screenshot");
            G4.D d8 = M.this.f38836o;
            if (d8 != null) {
                d8.c(screenshot);
            }
        }

        @Override // Z4.C
        public void b(a5.T video) {
            AbstractC3255y.i(video, "video");
        }

        @Override // Z4.C
        public void c(a5.L screenshot) {
            AbstractC3255y.i(screenshot, "screenshot");
            M.this.f38823b.b(this.f38839b);
        }

        @Override // Z4.C
        public void d(a5.T video) {
            AbstractC3255y.i(video, "video");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(View itemView, Z4.s listener, InterfaceC1587a actionsClickListener, Context context) {
        super(itemView, context);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(actionsClickListener, "actionsClickListener");
        AbstractC3255y.i(context, "context");
        this.f38823b = listener;
        this.f38824c = actionsClickListener;
        this.f38825d = context;
        View findViewById = itemView.findViewById(R.id.tv_title_home_gallery_featured);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.…le_home_gallery_featured)");
        this.f38826e = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.rv_screenshots_home_gallery_featured);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.…ts_home_gallery_featured)");
        this.f38827f = (RecyclerView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.pb_progress_gallery_featured_item);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.…ss_gallery_featured_item)");
        this.f38828g = (ProgressBar) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.iv_logo_gallery_featured_item);
        AbstractC3255y.h(findViewById4, "itemView.findViewById(R.…go_gallery_featured_item)");
        this.f38829h = (ImageView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.tv_name_gallery_featured_item);
        AbstractC3255y.h(findViewById5, "itemView.findViewById(R.…me_gallery_featured_item)");
        this.f38830i = (TextView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.tv_desc_gallery_featured_item);
        AbstractC3255y.h(findViewById6, "itemView.findViewById(R.…sc_gallery_featured_item)");
        this.f38831j = (TextView) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.tv_status_gallery_featured_item);
        AbstractC3255y.h(findViewById7, "itemView.findViewById(R.…us_gallery_featured_item)");
        TextView textView = (TextView) findViewById7;
        this.f38832k = textView;
        View findViewById8 = itemView.findViewById(R.id.tv_progress_gallery_featured_item);
        AbstractC3255y.h(findViewById8, "itemView.findViewById(R.…ss_gallery_featured_item)");
        TextView textView2 = (TextView) findViewById8;
        this.f38833l = textView2;
        View findViewById9 = itemView.findViewById(R.id.tv_verified_gallery_featured_item);
        AbstractC3255y.h(findViewById9, "itemView.findViewById(R.…ed_gallery_featured_item)");
        TextView textView3 = (TextView) findViewById9;
        this.f38834m = textView3;
        View findViewById10 = itemView.findViewById(R.id.ll_progress_gallery_featured_item);
        AbstractC3255y.h(findViewById10, "itemView.findViewById(R.…ss_gallery_featured_item)");
        this.f38835n = (LinearLayout) findViewById10;
        TextView textView4 = this.f38826e;
        j.a aVar = H4.j.f3824g;
        textView4.setTypeface(aVar.t());
        this.f38830i.setTypeface(aVar.t());
        this.f38831j.setTypeface(aVar.u());
        textView2.setTypeface(aVar.u());
        textView3.setTypeface(aVar.u());
        textView.setTypeface(aVar.u());
        int dimension = (int) this.f38825d.getResources().getDimension(R.dimen.margin_m);
        this.f38827f.setLayoutManager(new LinearLayoutManager(this.f38825d, 0, false));
        this.f38827f.addItemDecoration(new q5.s(dimension));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(M this$0, C1641h app, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(app, "$app");
        this$0.f38824c.a(app, -1);
        return true;
    }

    private final void r(C1641h c1641h) {
        if (this.f38836o == null) {
            a aVar = new a(c1641h);
            ArrayList arrayList = new ArrayList();
            ArrayList R02 = c1641h.R0();
            AbstractC3255y.f(R02);
            arrayList.addAll(R02);
            G4.D d8 = new G4.D(arrayList, aVar);
            this.f38836o = d8;
            this.f38827f.setAdapter(d8);
        }
    }

    private final void t(View view, final C1641h c1641h) {
        view.setOnClickListener(new View.OnClickListener() { // from class: r5.L
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                M.u(M.this, c1641h, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(M this$0, C1641h app, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(app, "$app");
        this$0.f38823b.b(app);
    }

    public final void p(final C1641h app) {
        AbstractC3255y.i(app, "app");
        this.f38837p = app.y0();
        this.f38826e.setText(this.f38825d.getString(R.string.home_fragment_download_app_title, app.s0()));
        View itemView = this.itemView;
        AbstractC3255y.h(itemView, "itemView");
        t(itemView, app);
        this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: r5.K
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
        i(app, this.f38830i, this.f38831j);
        h(this.f38829h, app.m0());
        e(app, this.f38828g, this.f38829h, this.f38831j, this.f38833l, this.f38832k, this.f38835n);
    }

    public final String s() {
        return this.f38837p;
    }
}
