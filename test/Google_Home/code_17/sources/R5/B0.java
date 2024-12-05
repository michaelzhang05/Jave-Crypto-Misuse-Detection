package r5;

import G4.C1204n;
import Z4.InterfaceC1587a;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class B0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private Z4.s f38750a;

    /* renamed from: b, reason: collision with root package name */
    private Context f38751b;

    /* renamed from: c, reason: collision with root package name */
    private RelativeLayout f38752c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f38753d;

    /* renamed from: e, reason: collision with root package name */
    private final C1204n f38754e;

    /* renamed from: f, reason: collision with root package name */
    private RecyclerView f38755f;

    /* renamed from: g, reason: collision with root package name */
    private LinearLayoutManager f38756g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(View itemView, Z4.s listener, InterfaceC1587a actionsClickListener, Context context) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(actionsClickListener, "actionsClickListener");
        AbstractC3255y.i(context, "context");
        this.f38750a = listener;
        this.f38751b = context;
        View findViewById = itemView.findViewById(R.id.rl_title_home_recycler_view_top);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.…e_home_recycler_view_top)");
        this.f38752c = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_title_home_recycler_view_top);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.…e_home_recycler_view_top)");
        this.f38753d = (TextView) findViewById2;
        C1204n c1204n = new C1204n(this.f38750a, actionsClickListener, this.f38751b);
        this.f38754e = c1204n;
        View findViewById3 = itemView.findViewById(R.id.rv_home_recycler_view_top);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.…v_home_recycler_view_top)");
        this.f38755f = (RecyclerView) findViewById3;
        this.f38756g = new LinearLayoutManager(itemView.getContext(), 0, false);
        this.f38753d.setTypeface(H4.j.f3824g.t());
        this.f38755f.setLayoutManager(this.f38756g);
        this.f38755f.setItemAnimator(null);
        this.f38755f.setAdapter(c1204n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(B0 this$0, a5.N topByCategory, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(topByCategory, "$topByCategory");
        this$0.f38750a.a(topByCategory);
    }

    public final void b(final a5.N topByCategory) {
        AbstractC3255y.i(topByCategory, "topByCategory");
        this.f38752c.setOnClickListener(new View.OnClickListener() { // from class: r5.A0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                B0.c(B0.this, topByCategory, view);
            }
        });
        this.f38753d.setText(topByCategory.b().h());
        if (AbstractC3255y.d(topByCategory.b().h(), this.f38751b.getResources().getString(R.string.top_downloads_title))) {
            this.f38754e.b(topByCategory.a(), true);
        } else {
            this.f38754e.b(topByCategory.a(), false);
        }
    }

    public final C1204n d() {
        return this.f38754e;
    }
}
