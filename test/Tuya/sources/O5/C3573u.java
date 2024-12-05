package o5;

import M5.AbstractC1246t;
import X4.C1501k;
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
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: o5.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3573u extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private W4.s f36880a;

    /* renamed from: b, reason: collision with root package name */
    private Context f36881b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f36882c;

    /* renamed from: d, reason: collision with root package name */
    private LinearLayout f36883d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3573u(View itemView, W4.s listener, Context context) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(context, "context");
        this.f36880a = listener;
        this.f36881b = context;
        View findViewById = itemView.findViewById(R.id.tv_floating_categories);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.tv_floating_categories)");
        this.f36882c = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.ll_floating_categories);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.ll_floating_categories)");
        this.f36883d = (LinearLayout) findViewById2;
        this.f36882c.setTypeface(E4.j.f2274g.t());
    }

    private final void c(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final C1501k c1501k = (C1501k) it.next();
            View inflate = LayoutInflater.from(this.f36881b).inflate(R.layout.home_header_category, (ViewGroup) this.f36883d, false);
            AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) inflate;
            textView.setTypeface(E4.j.f2274g.t());
            textView.setText(c1501k.f());
            if (AbstractC3159y.d(c1501k, AbstractC1246t.y0(arrayList))) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins((int) this.f36881b.getResources().getDimension(R.dimen.margin_m), 0, (int) this.f36881b.getResources().getDimension(R.dimen.margin_m), 0);
                textView.setLayoutParams(layoutParams);
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: o5.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3573u.d(C3573u.this, c1501k, view);
                }
            });
            this.f36883d.addView(textView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C3573u this$0, C1501k category, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(category, "$category");
        this$0.f36880a.a(category);
    }

    public final void b(ArrayList floatingCategories) {
        AbstractC3159y.i(floatingCategories, "floatingCategories");
        this.f36882c.setText(this.f36881b.getString(R.string.it_may_interest_you));
        if (this.f36883d.getChildCount() == 0) {
            c(floatingCategories);
        }
    }
}
