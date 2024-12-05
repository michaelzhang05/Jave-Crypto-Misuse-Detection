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

/* renamed from: o5.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3533D extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private W4.s f36552a;

    /* renamed from: b, reason: collision with root package name */
    private RelativeLayout f36553b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f36554c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f36555d;

    /* renamed from: e, reason: collision with root package name */
    private LinearLayoutManager f36556e;

    /* renamed from: f, reason: collision with root package name */
    private final D4.K f36557f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3533D(View itemView, W4.s listener, InterfaceC1478a actionsClickListener, Context context) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(actionsClickListener, "actionsClickListener");
        AbstractC3159y.i(context, "context");
        this.f36552a = listener;
        View findViewById = itemView.findViewById(R.id.rl_title_home_recycler_view_top);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.…e_home_recycler_view_top)");
        this.f36553b = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_title_home_recycler_view_top);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.…e_home_recycler_view_top)");
        this.f36554c = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.rv_home_recycler_view_top);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.…v_home_recycler_view_top)");
        this.f36555d = (RecyclerView) findViewById3;
        this.f36556e = new LinearLayoutManager(itemView.getContext(), 0, false);
        D4.K k8 = new D4.K(this.f36552a, actionsClickListener, context, 20);
        this.f36557f = k8;
        this.f36554c.setTypeface(E4.j.f2274g.t());
        this.f36555d.setItemAnimator(null);
        this.f36555d.setLayoutManager(this.f36556e);
        this.f36555d.setAdapter(k8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3533D this$0, X4.N topByCategory, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(topByCategory, "$topByCategory");
        this$0.f36552a.c(topByCategory);
    }

    public final void b(final X4.N topByCategory) {
        AbstractC3159y.i(topByCategory, "topByCategory");
        if (!topByCategory.a().isEmpty()) {
            this.f36553b.setOnClickListener(new View.OnClickListener() { // from class: o5.C
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3533D.c(C3533D.this, topByCategory, view);
                }
            });
            this.f36554c.setText(topByCategory.b().f());
            this.f36557f.d(topByCategory.a());
            return;
        }
        this.itemView.setVisibility(8);
    }

    public final D4.K d() {
        return this.f36557f;
    }
}
