package D4;

import D4.I;
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
public final class I extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1481d f1525a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1478a f1526b;

    /* renamed from: c, reason: collision with root package name */
    private Context f1527c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f1528d;

    /* loaded from: classes4.dex */
    public final class a extends AbstractC3548h {

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1481d f1529b;

        /* renamed from: c, reason: collision with root package name */
        private Context f1530c;

        /* renamed from: d, reason: collision with root package name */
        private final ImageView f1531d;

        /* renamed from: e, reason: collision with root package name */
        private final ProgressBar f1532e;

        /* renamed from: f, reason: collision with root package name */
        private final TextView f1533f;

        /* renamed from: g, reason: collision with root package name */
        private final TextView f1534g;

        /* renamed from: h, reason: collision with root package name */
        private final TextView f1535h;

        /* renamed from: i, reason: collision with root package name */
        private final TextView f1536i;

        /* renamed from: j, reason: collision with root package name */
        private final TextView f1537j;

        /* renamed from: k, reason: collision with root package name */
        private final TextView f1538k;

        /* renamed from: l, reason: collision with root package name */
        private final LinearLayout f1539l;

        /* renamed from: m, reason: collision with root package name */
        private final RelativeLayout f1540m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ I f1541n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(I i8, View itemView, InterfaceC1481d listener, Context context) {
            super(itemView, context);
            AbstractC3159y.i(itemView, "itemView");
            AbstractC3159y.i(listener, "listener");
            AbstractC3159y.i(context, "context");
            this.f1541n = i8;
            this.f1529b = listener;
            this.f1530c = context;
            View findViewById = itemView.findViewById(R.id.iv_logo_card_top_download);
            AbstractC3159y.h(findViewById, "itemView.findViewById(R.…v_logo_card_top_download)");
            this.f1531d = (ImageView) findViewById;
            View findViewById2 = itemView.findViewById(R.id.pb_progress_card_top_download);
            AbstractC3159y.h(findViewById2, "itemView.findViewById(R.…ogress_card_top_download)");
            this.f1532e = (ProgressBar) findViewById2;
            View findViewById3 = itemView.findViewById(R.id.tv_titulo_card_top_download);
            AbstractC3159y.h(findViewById3, "itemView.findViewById(R.…titulo_card_top_download)");
            TextView textView = (TextView) findViewById3;
            this.f1533f = textView;
            View findViewById4 = itemView.findViewById(R.id.tv_number_card_top_download);
            AbstractC3159y.h(findViewById4, "itemView.findViewById(R.…number_card_top_download)");
            TextView textView2 = (TextView) findViewById4;
            this.f1534g = textView2;
            View findViewById5 = itemView.findViewById(R.id.tv_resumen_card_top_download);
            AbstractC3159y.h(findViewById5, "itemView.findViewById(R.…esumen_card_top_download)");
            TextView textView3 = (TextView) findViewById5;
            this.f1535h = textView3;
            View findViewById6 = itemView.findViewById(R.id.tv_status_card_top_download);
            AbstractC3159y.h(findViewById6, "itemView.findViewById(R.…status_card_top_download)");
            TextView textView4 = (TextView) findViewById6;
            this.f1536i = textView4;
            View findViewById7 = itemView.findViewById(R.id.tv_progress_card_top_download);
            AbstractC3159y.h(findViewById7, "itemView.findViewById(R.…ogress_card_top_download)");
            TextView textView5 = (TextView) findViewById7;
            this.f1537j = textView5;
            View findViewById8 = itemView.findViewById(R.id.tv_verified_card_top_download);
            AbstractC3159y.h(findViewById8, "itemView.findViewById(R.…rified_card_top_download)");
            TextView textView6 = (TextView) findViewById8;
            this.f1538k = textView6;
            View findViewById9 = itemView.findViewById(R.id.ll_progress_card_top_download);
            AbstractC3159y.h(findViewById9, "itemView.findViewById(R.…ogress_card_top_download)");
            this.f1539l = (LinearLayout) findViewById9;
            View findViewById10 = itemView.findViewById(R.id.rl_card_details_top_download);
            AbstractC3159y.h(findViewById10, "itemView.findViewById(R.…ard_details_top_download)");
            this.f1540m = (RelativeLayout) findViewById10;
            j.a aVar = E4.j.f2274g;
            textView2.setTypeface(aVar.t());
            textView.setTypeface(aVar.t());
            textView3.setTypeface(aVar.u());
            textView4.setTypeface(aVar.u());
            textView5.setTypeface(aVar.u());
            textView6.setTypeface(aVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean n(I this$0, C1498h app, int i8, View view) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(app, "$app");
            this$0.f1526b.a(app, i8);
            return true;
        }

        public final void m(final C1498h app, int i8, final int i9) {
            AbstractC3159y.i(app, "app");
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (i8 >= 10) {
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.setMarginStart((int) this.f1530c.getResources().getDimension(R.dimen.top_card_margin_index_ten));
                this.f1540m.setLayoutParams(layoutParams2);
            } else {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams3.setMarginStart((int) this.f1530c.getResources().getDimension(R.dimen.top_download_horizontal_card_margin));
                this.f1540m.setLayoutParams(layoutParams3);
            }
            this.itemView.setLayoutParams(b(layoutParams, this.f1530c, i8, 20));
            this.f1534g.setText(String.valueOf(i8));
            View itemView = this.itemView;
            AbstractC3159y.h(itemView, "itemView");
            c(itemView, this.f1529b, app);
            View view = this.itemView;
            final I i10 = this.f1541n;
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: D4.H
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    boolean n8;
                    n8 = I.a.n(I.this, app, i9, view2);
                    return n8;
                }
            });
            i(app, this.f1533f, this.f1535h);
            h(this.f1531d, app.l0());
            e(app, this.f1532e, this.f1531d, this.f1535h, this.f1537j, this.f1536i, this.f1539l);
        }
    }

    public I(InterfaceC1481d listener, InterfaceC1478a actionsClickListener, Context context) {
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(actionsClickListener, "actionsClickListener");
        AbstractC3159y.i(context, "context");
        this.f1525a = listener;
        this.f1526b = actionsClickListener;
        this.f1527c = context;
        this.f1528d = new ArrayList();
    }

    public final ArrayList b() {
        return this.f1528d;
    }

    public final void c(ArrayList appList) {
        AbstractC3159y.i(appList, "appList");
        ArrayList arrayList = this.f1528d;
        arrayList.clear();
        arrayList.addAll(appList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1528d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i8) {
        AbstractC3159y.i(holder, "holder");
        Object obj = this.f1528d.get(i8);
        AbstractC3159y.h(obj, "apps[position]");
        ((a) holder).m((C1498h) obj, i8 + 1, i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3159y.i(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_top_download, parent, false);
        AbstractC3159y.h(itemView, "itemView");
        return new a(this, itemView, this.f1525a, this.f1527c);
    }
}
