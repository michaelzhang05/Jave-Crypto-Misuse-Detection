package D4;

import D4.K;
import E4.j;
import W4.InterfaceC1478a;
import W4.InterfaceC1481d;
import X4.C1498h;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;
import o5.AbstractC3548h;

/* loaded from: classes4.dex */
public final class K extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1481d f1545a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC1478a f1546b;

    /* renamed from: c, reason: collision with root package name */
    private Context f1547c;

    /* renamed from: d, reason: collision with root package name */
    private int f1548d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f1549e;

    /* loaded from: classes4.dex */
    public final class a extends AbstractC3548h {

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1481d f1550b;

        /* renamed from: c, reason: collision with root package name */
        private Context f1551c;

        /* renamed from: d, reason: collision with root package name */
        private final ImageView f1552d;

        /* renamed from: e, reason: collision with root package name */
        private final ProgressBar f1553e;

        /* renamed from: f, reason: collision with root package name */
        private final TextView f1554f;

        /* renamed from: g, reason: collision with root package name */
        private final TextView f1555g;

        /* renamed from: h, reason: collision with root package name */
        private final TextView f1556h;

        /* renamed from: i, reason: collision with root package name */
        private final TextView f1557i;

        /* renamed from: j, reason: collision with root package name */
        private final LinearLayout f1558j;

        /* renamed from: k, reason: collision with root package name */
        private final TextView f1559k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ K f1560l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(K k8, View itemView, InterfaceC1481d listener, Context context) {
            super(itemView, context);
            AbstractC3159y.i(itemView, "itemView");
            AbstractC3159y.i(listener, "listener");
            AbstractC3159y.i(context, "context");
            this.f1560l = k8;
            this.f1550b = listener;
            this.f1551c = context;
            View findViewById = itemView.findViewById(R.id.iv_logo_card);
            AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.iv_logo_card)");
            this.f1552d = (ImageView) findViewById;
            View findViewById2 = itemView.findViewById(R.id.pb_progress_card);
            AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.pb_progress_card)");
            this.f1553e = (ProgressBar) findViewById2;
            View findViewById3 = itemView.findViewById(R.id.tv_titulo_card);
            AbstractC3159y.h(findViewById3, "itemView.findViewById(R.id.tv_titulo_card)");
            TextView textView = (TextView) findViewById3;
            this.f1554f = textView;
            View findViewById4 = itemView.findViewById(R.id.tv_resumen_card);
            AbstractC3159y.h(findViewById4, "itemView.findViewById(R.id.tv_resumen_card)");
            TextView textView2 = (TextView) findViewById4;
            this.f1555g = textView2;
            View findViewById5 = itemView.findViewById(R.id.tv_progress_card);
            AbstractC3159y.h(findViewById5, "itemView.findViewById(R.id.tv_progress_card)");
            TextView textView3 = (TextView) findViewById5;
            this.f1556h = textView3;
            View findViewById6 = itemView.findViewById(R.id.tv_verified_card);
            AbstractC3159y.h(findViewById6, "itemView.findViewById(R.id.tv_verified_card)");
            TextView textView4 = (TextView) findViewById6;
            this.f1557i = textView4;
            View findViewById7 = itemView.findViewById(R.id.ll_progress_card);
            AbstractC3159y.h(findViewById7, "itemView.findViewById(R.id.ll_progress_card)");
            this.f1558j = (LinearLayout) findViewById7;
            View findViewById8 = itemView.findViewById(R.id.tv_status_card);
            AbstractC3159y.h(findViewById8, "itemView.findViewById(R.id.tv_status_card)");
            TextView textView5 = (TextView) findViewById8;
            this.f1559k = textView5;
            j.a aVar = E4.j.f2274g;
            textView.setTypeface(aVar.t());
            textView2.setTypeface(aVar.u());
            textView5.setTypeface(aVar.u());
            textView3.setTypeface(aVar.u());
            textView4.setTypeface(aVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean n(K this$0, C1498h app, int i8, View view) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(app, "$app");
            this$0.f1546b.a(app, i8);
            return true;
        }

        public final void m(final C1498h app, final int i8) {
            AbstractC3159y.i(app, "app");
            this.itemView.setLayoutParams(b(new RelativeLayout.LayoutParams((int) this.f1551c.getResources().getDimension(R.dimen.top_horizontal_card_width), -2), this.f1551c, i8, this.f1560l.f1548d));
            View itemView = this.itemView;
            AbstractC3159y.h(itemView, "itemView");
            c(itemView, this.f1550b, app);
            View view = this.itemView;
            final K k8 = this.f1560l;
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: D4.J
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    boolean n8;
                    n8 = K.a.n(K.this, app, i8, view2);
                    return n8;
                }
            });
            i(app, this.f1554f, this.f1555g);
            h(this.f1552d, app.l0());
            e(app, this.f1553e, this.f1552d, this.f1555g, this.f1556h, this.f1559k, this.f1558j);
        }
    }

    public K(InterfaceC1481d listener, InterfaceC1478a actionsClickListener, Context context, int i8) {
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(actionsClickListener, "actionsClickListener");
        AbstractC3159y.i(context, "context");
        this.f1545a = listener;
        this.f1546b = actionsClickListener;
        this.f1547c = context;
        this.f1548d = i8;
        this.f1549e = new ArrayList();
    }

    public final ArrayList c() {
        return this.f1549e;
    }

    public final void d(ArrayList appList) {
        AbstractC3159y.i(appList, "appList");
        ArrayList arrayList = this.f1549e;
        arrayList.clear();
        arrayList.addAll(appList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1549e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i8) {
        AbstractC3159y.i(holder, "holder");
        Object obj = this.f1549e.get(i8);
        AbstractC3159y.h(obj, "apps[position]");
        ((a) holder).m((C1498h) obj, i8 + 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3159y.i(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        AbstractC3159y.h(itemView, "itemView");
        return new a(this, itemView, this.f1545a, this.f1547c);
    }
}
