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

/* renamed from: r5.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3921B extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private Z4.s f38743a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1587a f38744b;

    /* renamed from: c, reason: collision with root package name */
    private RelativeLayout f38745c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f38746d;

    /* renamed from: e, reason: collision with root package name */
    private RecyclerView f38747e;

    /* renamed from: f, reason: collision with root package name */
    private LinearLayoutManager f38748f;

    /* renamed from: g, reason: collision with root package name */
    private final G4.I f38749g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3921B(View itemView, Z4.s listener, InterfaceC1587a actionsClickListener, Context context) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(actionsClickListener, "actionsClickListener");
        AbstractC3255y.i(context, "context");
        this.f38743a = listener;
        this.f38744b = actionsClickListener;
        View findViewById = itemView.findViewById(R.id.rl_title_home_recycler_view_top);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.…e_home_recycler_view_top)");
        this.f38745c = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_title_home_recycler_view_top);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.…e_home_recycler_view_top)");
        this.f38746d = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.rv_home_recycler_view_top);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.…v_home_recycler_view_top)");
        this.f38747e = (RecyclerView) findViewById3;
        this.f38748f = new LinearLayoutManager(itemView.getContext(), 0, false);
        G4.I i8 = new G4.I(this.f38743a, actionsClickListener, context);
        this.f38749g = i8;
        this.f38746d.setTypeface(H4.j.f3824g.t());
        this.f38747e.setLayoutManager(this.f38748f);
        this.f38747e.setItemAnimator(null);
        this.f38747e.setAdapter(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3921B this$0, a5.N topByCategory, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(topByCategory, "$topByCategory");
        this$0.f38743a.a(topByCategory);
    }

    public final void b(final a5.N topByCategory) {
        AbstractC3255y.i(topByCategory, "topByCategory");
        this.f38745c.setOnClickListener(new View.OnClickListener() { // from class: r5.A
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3921B.c(C3921B.this, topByCategory, view);
            }
        });
        this.f38746d.setText(topByCategory.b().h());
        this.f38749g.c(topByCategory.a());
    }

    public final G4.I d() {
        return this.f38749g;
    }
}
