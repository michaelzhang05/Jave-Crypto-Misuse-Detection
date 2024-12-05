package o5;

import W4.InterfaceC1478a;
import X4.C1498h;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;
import n5.C3478f;

/* loaded from: classes5.dex */
public final class X0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private W4.s f36703a;

    /* renamed from: b, reason: collision with root package name */
    private RelativeLayout f36704b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f36705c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f36706d;

    /* renamed from: e, reason: collision with root package name */
    private LinearLayoutManager f36707e;

    /* renamed from: f, reason: collision with root package name */
    private final D4.U f36708f;

    /* loaded from: classes5.dex */
    public static final class a extends RecyclerView.OnScrollListener {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i8) {
            AbstractC3159y.i(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i8);
            if (!X0.this.e().n()) {
                X0.this.e().w(true);
            }
            if (i8 == 0) {
                int findFirstCompletelyVisibleItemPosition = X0.this.f36707e.findFirstCompletelyVisibleItemPosition();
                int findLastCompletelyVisibleItemPosition = X0.this.f36707e.findLastCompletelyVisibleItemPosition();
                int m8 = X0.this.e().m();
                if (findLastCompletelyVisibleItemPosition == X0.this.f36707e.getItemCount() - 1 && findLastCompletelyVisibleItemPosition != X0.this.e().m()) {
                    X0.this.e().t(findLastCompletelyVisibleItemPosition);
                    ArrayList i12 = ((C1498h) X0.this.e().l().get(m8)).i1();
                    if (i12 != null && !i12.isEmpty()) {
                        X0.this.e().notifyItemChanged(m8);
                    }
                    ArrayList i13 = ((C1498h) X0.this.e().l().get(findLastCompletelyVisibleItemPosition)).i1();
                    if (i13 != null && !i13.isEmpty()) {
                        X0.this.e().notifyItemChanged(findLastCompletelyVisibleItemPosition);
                        return;
                    }
                    return;
                }
                if (findFirstCompletelyVisibleItemPosition != -1 && findFirstCompletelyVisibleItemPosition != X0.this.e().m()) {
                    X0.this.e().t(findFirstCompletelyVisibleItemPosition);
                    ArrayList i14 = ((C1498h) X0.this.e().l().get(m8)).i1();
                    if (i14 != null && !i14.isEmpty()) {
                        X0.this.e().notifyItemChanged(m8);
                    }
                    ArrayList i15 = ((C1498h) X0.this.e().l().get(findFirstCompletelyVisibleItemPosition)).i1();
                    if (i15 != null && !i15.isEmpty()) {
                        X0.this.e().notifyItemChanged(findFirstCompletelyVisibleItemPosition);
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(View itemView, W4.s listener, InterfaceC1478a actionsClickListener, Context context, String fragmentName) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(actionsClickListener, "actionsClickListener");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(fragmentName, "fragmentName");
        this.f36703a = listener;
        View findViewById = itemView.findViewById(R.id.rl_title_home_recycler_view_top);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.…e_home_recycler_view_top)");
        this.f36704b = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_title_home_recycler_view_top);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.…e_home_recycler_view_top)");
        this.f36705c = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.rv_home_recycler_view_top);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.…v_home_recycler_view_top)");
        this.f36706d = (RecyclerView) findViewById3;
        this.f36707e = new LinearLayoutManager(itemView.getContext(), 0, false);
        D4.U u8 = new D4.U(this.f36703a, actionsClickListener, context, fragmentName);
        this.f36708f = u8;
        new C3478f().attachToRecyclerView(this.f36706d);
        this.f36705c.setTypeface(E4.j.f2274g.t());
        this.f36706d.setLayoutManager(this.f36707e);
        this.f36706d.setItemAnimator(null);
        this.f36706d.setAdapter(u8);
        if (!SettingsPreferences.f29323b.L(context)) {
            this.f36706d.addOnScrollListener(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(X0 this$0, X4.N topByCategory, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(topByCategory, "$topByCategory");
        this$0.f36703a.c(topByCategory);
    }

    public final void c(final X4.N topByCategory) {
        AbstractC3159y.i(topByCategory, "topByCategory");
        this.f36704b.setOnClickListener(new View.OnClickListener() { // from class: o5.W0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                X0.d(X0.this, topByCategory, view);
            }
        });
        this.f36705c.setText(topByCategory.b().f());
        this.f36708f.u(topByCategory.a());
    }

    public final D4.U e() {
        return this.f36708f;
    }
}
