package r5;

import Z4.InterfaceC1587a;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: r5.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3923D extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private Z4.s f38760a;

    /* renamed from: b, reason: collision with root package name */
    private RelativeLayout f38761b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f38762c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f38763d;

    /* renamed from: e, reason: collision with root package name */
    private LinearLayoutManager f38764e;

    /* renamed from: f, reason: collision with root package name */
    private final G4.K f38765f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3923D(View itemView, Z4.s listener, InterfaceC1587a actionsClickListener, Context context) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(actionsClickListener, "actionsClickListener");
        AbstractC3255y.i(context, "context");
        this.f38760a = listener;
        View findViewById = itemView.findViewById(R.id.rl_title_home_recycler_view_top);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.…e_home_recycler_view_top)");
        this.f38761b = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_title_home_recycler_view_top);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.…e_home_recycler_view_top)");
        this.f38762c = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.rv_home_recycler_view_top);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.…v_home_recycler_view_top)");
        this.f38763d = (RecyclerView) findViewById3;
        this.f38764e = new LinearLayoutManager(itemView.getContext(), 0, false);
        G4.K k8 = new G4.K(this.f38760a, actionsClickListener, context, 20);
        this.f38765f = k8;
        this.f38762c.setTypeface(H4.j.f3824g.t());
        this.f38763d.setItemAnimator(null);
        this.f38763d.setLayoutManager(this.f38764e);
        this.f38763d.setAdapter(k8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3923D this$0, a5.N topByCategory, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(topByCategory, "$topByCategory");
        this$0.f38760a.a(topByCategory);
    }

    public final void b(final a5.N topByCategory) {
        AbstractC3255y.i(topByCategory, "topByCategory");
        if (!topByCategory.a().isEmpty()) {
            this.f38761b.setOnClickListener(new View.OnClickListener() { // from class: r5.C
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3923D.c(C3923D.this, topByCategory, view);
                }
            });
            this.f38762c.setText(topByCategory.b().h());
            this.f38765f.d(topByCategory.a());
            return;
        }
        this.itemView.setVisibility(8);
    }

    public final G4.K d() {
        return this.f38765f;
    }
}
