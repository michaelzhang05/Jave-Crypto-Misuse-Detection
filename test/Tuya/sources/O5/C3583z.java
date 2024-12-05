package o5;

import D4.C1100i;
import D4.C1103l;
import M5.AbstractC1246t;
import W4.InterfaceC1478a;
import X4.C1501k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;
import n5.C3478f;

/* renamed from: o5.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3583z extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private W4.s f36938a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1478a f36939b;

    /* renamed from: c, reason: collision with root package name */
    private Context f36940c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f36941d;

    /* renamed from: e, reason: collision with root package name */
    private C1103l f36942e;

    /* renamed from: f, reason: collision with root package name */
    private LinearLayoutManager f36943f;

    /* renamed from: g, reason: collision with root package name */
    private LinearLayout f36944g;

    /* renamed from: h, reason: collision with root package name */
    private final C3478f f36945h;

    /* renamed from: i, reason: collision with root package name */
    private int f36946i;

    /* renamed from: o5.z$a */
    /* loaded from: classes5.dex */
    public static final class a extends RecyclerView.OnScrollListener {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i8) {
            AbstractC3159y.i(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i8);
            C3583z c3583z = C3583z.this;
            c3583z.f36946i = c3583z.f36943f.findFirstCompletelyVisibleItemPosition();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3583z(View itemView, W4.s sVar, InterfaceC1478a actionsClickListener, Context context) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(actionsClickListener, "actionsClickListener");
        AbstractC3159y.i(context, "context");
        this.f36938a = sVar;
        this.f36939b = actionsClickListener;
        this.f36940c = context;
        View findViewById = itemView.findViewById(R.id.rv_home_features);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.rv_home_features)");
        this.f36941d = (RecyclerView) findViewById;
        this.f36942e = new C1103l(this.f36938a, actionsClickListener, this.f36940c);
        this.f36943f = new LinearLayoutManager(itemView.getContext(), 0, false);
        View findViewById2 = itemView.findViewById(R.id.ll_categories);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.ll_categories)");
        this.f36944g = (LinearLayout) findViewById2;
        C3478f c3478f = new C3478f();
        this.f36945h = c3478f;
        this.f36946i = 102;
        c3478f.attachToRecyclerView(this.f36941d);
        this.f36941d.setLayoutManager(this.f36943f);
        this.f36941d.setAdapter(this.f36942e);
        this.f36941d.addOnScrollListener(new a());
    }

    private final void e(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final C1501k c1501k = (C1501k) it.next();
            View inflate = LayoutInflater.from(this.f36940c).inflate(R.layout.home_header_category, (ViewGroup) this.f36944g, false);
            AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) inflate;
            textView.setTypeface(E4.j.f2274g.t());
            textView.setText(c1501k.f());
            if (AbstractC3159y.d(c1501k, AbstractC1246t.y0(arrayList))) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins((int) this.f36940c.getResources().getDimension(R.dimen.margin_m), 0, (int) this.f36940c.getResources().getDimension(R.dimen.margin_m), 0);
                textView.setLayoutParams(layoutParams);
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: o5.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3583z.f(C3583z.this, c1501k, view);
                }
            });
            this.f36944g.addView(textView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C3583z this$0, C1501k category, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(category, "$category");
        W4.s sVar = this$0.f36938a;
        if (sVar != null) {
            sVar.a(category);
        }
    }

    public final void d(C1100i.b homeHeader) {
        AbstractC3159y.i(homeHeader, "homeHeader");
        if (!homeHeader.b().isEmpty()) {
            this.f36941d.scrollToPosition(this.f36946i);
            this.f36941d.smoothScrollBy(1, 0);
            this.f36942e.c(homeHeader.b());
        }
        if (this.f36944g.getChildCount() == 0) {
            e(homeHeader.a());
        }
    }
}
