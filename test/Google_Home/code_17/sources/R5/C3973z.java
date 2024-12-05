package r5;

import G4.C1199i;
import G4.C1202l;
import P5.AbstractC1378t;
import Z4.InterfaceC1587a;
import a5.C1644k;
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
import kotlin.jvm.internal.AbstractC3255y;
import q5.C3857f;

/* renamed from: r5.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3973z extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private Z4.s f39146a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1587a f39147b;

    /* renamed from: c, reason: collision with root package name */
    private Context f39148c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f39149d;

    /* renamed from: e, reason: collision with root package name */
    private C1202l f39150e;

    /* renamed from: f, reason: collision with root package name */
    private LinearLayoutManager f39151f;

    /* renamed from: g, reason: collision with root package name */
    private LinearLayout f39152g;

    /* renamed from: h, reason: collision with root package name */
    private final C3857f f39153h;

    /* renamed from: i, reason: collision with root package name */
    private int f39154i;

    /* renamed from: r5.z$a */
    /* loaded from: classes5.dex */
    public static final class a extends RecyclerView.OnScrollListener {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i8) {
            AbstractC3255y.i(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i8);
            C3973z c3973z = C3973z.this;
            c3973z.f39154i = c3973z.f39151f.findFirstCompletelyVisibleItemPosition();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3973z(View itemView, Z4.s sVar, InterfaceC1587a actionsClickListener, Context context) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(actionsClickListener, "actionsClickListener");
        AbstractC3255y.i(context, "context");
        this.f39146a = sVar;
        this.f39147b = actionsClickListener;
        this.f39148c = context;
        View findViewById = itemView.findViewById(R.id.rv_home_features);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.id.rv_home_features)");
        this.f39149d = (RecyclerView) findViewById;
        this.f39150e = new C1202l(this.f39146a, actionsClickListener, this.f39148c);
        this.f39151f = new LinearLayoutManager(itemView.getContext(), 0, false);
        View findViewById2 = itemView.findViewById(R.id.ll_categories);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.id.ll_categories)");
        this.f39152g = (LinearLayout) findViewById2;
        C3857f c3857f = new C3857f();
        this.f39153h = c3857f;
        this.f39154i = 102;
        c3857f.attachToRecyclerView(this.f39149d);
        this.f39149d.setLayoutManager(this.f39151f);
        this.f39149d.setAdapter(this.f39150e);
        this.f39149d.addOnScrollListener(new a());
    }

    private final void e(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final C1644k c1644k = (C1644k) it.next();
            View inflate = LayoutInflater.from(this.f39148c).inflate(R.layout.home_header_category, (ViewGroup) this.f39152g, false);
            AbstractC3255y.g(inflate, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) inflate;
            textView.setTypeface(H4.j.f3824g.t());
            textView.setText(c1644k.h());
            if (AbstractC3255y.d(c1644k, AbstractC1378t.y0(arrayList))) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins((int) this.f39148c.getResources().getDimension(R.dimen.margin_m), 0, (int) this.f39148c.getResources().getDimension(R.dimen.margin_m), 0);
                textView.setLayoutParams(layoutParams);
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: r5.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3973z.f(C3973z.this, c1644k, view);
                }
            });
            this.f39152g.addView(textView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C3973z this$0, C1644k category, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(category, "$category");
        Z4.s sVar = this$0.f39146a;
        if (sVar != null) {
            sVar.c(category);
        }
    }

    public final void d(C1199i.b homeHeader) {
        AbstractC3255y.i(homeHeader, "homeHeader");
        if (!homeHeader.b().isEmpty()) {
            this.f39149d.scrollToPosition(this.f39154i);
            this.f39149d.smoothScrollBy(1, 0);
            this.f39150e.c(homeHeader.b());
        }
        if (this.f39152g.getChildCount() == 0) {
            e(homeHeader.a());
        }
    }
}
