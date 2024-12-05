package r5;

import G4.C1206p;
import Z4.InterfaceC1587a;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class F extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private Z4.s f38773a;

    /* renamed from: b, reason: collision with root package name */
    private RelativeLayout f38774b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f38775c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f38776d;

    /* renamed from: e, reason: collision with root package name */
    private GridLayoutManager f38777e;

    /* renamed from: f, reason: collision with root package name */
    private C1206p f38778f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(View itemView, Z4.s listener, InterfaceC1587a actionsClickListener, Context context) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(actionsClickListener, "actionsClickListener");
        AbstractC3255y.i(context, "context");
        this.f38773a = listener;
        View findViewById = itemView.findViewById(R.id.rl_title_home_recycler_view_top);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.…e_home_recycler_view_top)");
        this.f38774b = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_title_home_recycler_view_top);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.…e_home_recycler_view_top)");
        this.f38775c = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.rv_home_recycler_view_top);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.…v_home_recycler_view_top)");
        this.f38776d = (RecyclerView) findViewById3;
        this.f38777e = new GridLayoutManager(itemView.getContext(), 3, 0, false);
        this.f38778f = new C1206p(this.f38773a, actionsClickListener, context);
        this.f38775c.setTypeface(H4.j.f3824g.t());
        this.f38776d.setLayoutManager(this.f38777e);
        this.f38776d.setAdapter(this.f38778f);
        this.f38776d.setItemAnimator(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(F this$0, a5.N topByCategory, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(topByCategory, "$topByCategory");
        this$0.f38773a.a(topByCategory);
    }

    public final void b(final a5.N topByCategory) {
        AbstractC3255y.i(topByCategory, "topByCategory");
        this.f38774b.setOnClickListener(new View.OnClickListener() { // from class: r5.E
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F.c(F.this, topByCategory, view);
            }
        });
        this.f38775c.setText(topByCategory.b().h());
        this.f38778f.d(topByCategory.a());
    }

    public final C1206p d() {
        return this.f38778f;
    }
}
