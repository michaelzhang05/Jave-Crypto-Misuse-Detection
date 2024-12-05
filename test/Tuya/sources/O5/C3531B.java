package o5;

import W4.InterfaceC1478a;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: o5.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3531B extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private W4.s f36535a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1478a f36536b;

    /* renamed from: c, reason: collision with root package name */
    private RelativeLayout f36537c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f36538d;

    /* renamed from: e, reason: collision with root package name */
    private RecyclerView f36539e;

    /* renamed from: f, reason: collision with root package name */
    private LinearLayoutManager f36540f;

    /* renamed from: g, reason: collision with root package name */
    private final D4.I f36541g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3531B(View itemView, W4.s listener, InterfaceC1478a actionsClickListener, Context context) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(actionsClickListener, "actionsClickListener");
        AbstractC3159y.i(context, "context");
        this.f36535a = listener;
        this.f36536b = actionsClickListener;
        View findViewById = itemView.findViewById(R.id.rl_title_home_recycler_view_top);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.…e_home_recycler_view_top)");
        this.f36537c = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_title_home_recycler_view_top);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.…e_home_recycler_view_top)");
        this.f36538d = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.rv_home_recycler_view_top);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.…v_home_recycler_view_top)");
        this.f36539e = (RecyclerView) findViewById3;
        this.f36540f = new LinearLayoutManager(itemView.getContext(), 0, false);
        D4.I i8 = new D4.I(this.f36535a, actionsClickListener, context);
        this.f36541g = i8;
        this.f36538d.setTypeface(E4.j.f2274g.t());
        this.f36539e.setLayoutManager(this.f36540f);
        this.f36539e.setItemAnimator(null);
        this.f36539e.setAdapter(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3531B this$0, X4.N topByCategory, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(topByCategory, "$topByCategory");
        this$0.f36535a.c(topByCategory);
    }

    public final void b(final X4.N topByCategory) {
        AbstractC3159y.i(topByCategory, "topByCategory");
        this.f36537c.setOnClickListener(new View.OnClickListener() { // from class: o5.A
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3531B.c(C3531B.this, topByCategory, view);
            }
        });
        this.f36538d.setText(topByCategory.b().f());
        this.f36541g.c(topByCategory.a());
    }

    public final D4.I d() {
        return this.f36541g;
    }
}
