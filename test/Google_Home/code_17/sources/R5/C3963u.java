package r5;

import P5.AbstractC1378t;
import a5.C1644k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: r5.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3963u extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private Z4.s f39088a;

    /* renamed from: b, reason: collision with root package name */
    private Context f39089b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f39090c;

    /* renamed from: d, reason: collision with root package name */
    private LinearLayout f39091d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3963u(View itemView, Z4.s listener, Context context) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(context, "context");
        this.f39088a = listener;
        this.f39089b = context;
        View findViewById = itemView.findViewById(R.id.tv_floating_categories);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.id.tv_floating_categories)");
        this.f39090c = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.ll_floating_categories);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.id.ll_floating_categories)");
        this.f39091d = (LinearLayout) findViewById2;
        this.f39090c.setTypeface(H4.j.f3824g.t());
    }

    private final void c(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final C1644k c1644k = (C1644k) it.next();
            View inflate = LayoutInflater.from(this.f39089b).inflate(R.layout.home_header_category, (ViewGroup) this.f39091d, false);
            AbstractC3255y.g(inflate, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) inflate;
            textView.setTypeface(H4.j.f3824g.t());
            textView.setText(c1644k.h());
            if (AbstractC3255y.d(c1644k, AbstractC1378t.y0(arrayList))) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins((int) this.f39089b.getResources().getDimension(R.dimen.margin_m), 0, (int) this.f39089b.getResources().getDimension(R.dimen.margin_m), 0);
                textView.setLayoutParams(layoutParams);
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: r5.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3963u.d(C3963u.this, c1644k, view);
                }
            });
            this.f39091d.addView(textView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C3963u this$0, C1644k category, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(category, "$category");
        this$0.f39088a.c(category);
    }

    public final void b(ArrayList floatingCategories) {
        AbstractC3255y.i(floatingCategories, "floatingCategories");
        this.f39090c.setText(this.f39089b.getString(R.string.it_may_interest_you));
        if (this.f39091d.getChildCount() == 0) {
            c(floatingCategories);
        }
    }
}
