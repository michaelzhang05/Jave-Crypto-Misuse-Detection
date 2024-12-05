package r5;

import Z4.InterfaceC1587a;
import a5.C1641h;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;
import q5.C3857f;

/* loaded from: classes5.dex */
public final class X0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private Z4.s f38911a;

    /* renamed from: b, reason: collision with root package name */
    private RelativeLayout f38912b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f38913c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f38914d;

    /* renamed from: e, reason: collision with root package name */
    private LinearLayoutManager f38915e;

    /* renamed from: f, reason: collision with root package name */
    private final G4.U f38916f;

    /* loaded from: classes5.dex */
    public static final class a extends RecyclerView.OnScrollListener {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i8) {
            AbstractC3255y.i(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i8);
            if (!X0.this.e().n()) {
                X0.this.e().w(true);
            }
            if (i8 == 0) {
                int findFirstCompletelyVisibleItemPosition = X0.this.f38915e.findFirstCompletelyVisibleItemPosition();
                int findLastCompletelyVisibleItemPosition = X0.this.f38915e.findLastCompletelyVisibleItemPosition();
                int m8 = X0.this.e().m();
                if (findLastCompletelyVisibleItemPosition == X0.this.f38915e.getItemCount() - 1 && findLastCompletelyVisibleItemPosition != X0.this.e().m()) {
                    X0.this.e().t(findLastCompletelyVisibleItemPosition);
                    ArrayList i12 = ((C1641h) X0.this.e().l().get(m8)).i1();
                    if (i12 != null && !i12.isEmpty()) {
                        X0.this.e().notifyItemChanged(m8);
                    }
                    ArrayList i13 = ((C1641h) X0.this.e().l().get(findLastCompletelyVisibleItemPosition)).i1();
                    if (i13 != null && !i13.isEmpty()) {
                        X0.this.e().notifyItemChanged(findLastCompletelyVisibleItemPosition);
                        return;
                    }
                    return;
                }
                if (findFirstCompletelyVisibleItemPosition != -1 && findFirstCompletelyVisibleItemPosition != X0.this.e().m()) {
                    X0.this.e().t(findFirstCompletelyVisibleItemPosition);
                    ArrayList i14 = ((C1641h) X0.this.e().l().get(m8)).i1();
                    if (i14 != null && !i14.isEmpty()) {
                        X0.this.e().notifyItemChanged(m8);
                    }
                    ArrayList i15 = ((C1641h) X0.this.e().l().get(findFirstCompletelyVisibleItemPosition)).i1();
                    if (i15 != null && !i15.isEmpty()) {
                        X0.this.e().notifyItemChanged(findFirstCompletelyVisibleItemPosition);
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(View itemView, Z4.s listener, InterfaceC1587a actionsClickListener, Context context, String fragmentName) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(actionsClickListener, "actionsClickListener");
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(fragmentName, "fragmentName");
        this.f38911a = listener;
        View findViewById = itemView.findViewById(R.id.rl_title_home_recycler_view_top);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.…e_home_recycler_view_top)");
        this.f38912b = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_title_home_recycler_view_top);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.…e_home_recycler_view_top)");
        this.f38913c = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.rv_home_recycler_view_top);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.…v_home_recycler_view_top)");
        this.f38914d = (RecyclerView) findViewById3;
        this.f38915e = new LinearLayoutManager(itemView.getContext(), 0, false);
        G4.U u8 = new G4.U(this.f38911a, actionsClickListener, context, fragmentName);
        this.f38916f = u8;
        new C3857f().attachToRecyclerView(this.f38914d);
        this.f38913c.setTypeface(H4.j.f3824g.t());
        this.f38914d.setLayoutManager(this.f38915e);
        this.f38914d.setItemAnimator(null);
        this.f38914d.setAdapter(u8);
        if (!SettingsPreferences.f30353b.L(context)) {
            this.f38914d.addOnScrollListener(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(X0 this$0, a5.N topByCategory, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(topByCategory, "$topByCategory");
        this$0.f38911a.a(topByCategory);
    }

    public final void c(final a5.N topByCategory) {
        AbstractC3255y.i(topByCategory, "topByCategory");
        this.f38912b.setOnClickListener(new View.OnClickListener() { // from class: r5.W0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                X0.d(X0.this, topByCategory, view);
            }
        });
        this.f38913c.setText(topByCategory.b().h());
        this.f38916f.u(topByCategory.a());
    }

    public final G4.U e() {
        return this.f38916f;
    }
}
