package G4;

import G4.I;
import H4.j;
import Z4.InterfaceC1587a;
import Z4.InterfaceC1590d;
import a5.C1641h;
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
import kotlin.jvm.internal.AbstractC3255y;
import r5.AbstractC3938h;

/* loaded from: classes4.dex */
public final class I extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1590d f3067a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1587a f3068b;

    /* renamed from: c, reason: collision with root package name */
    private Context f3069c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f3070d;

    /* loaded from: classes4.dex */
    public final class a extends AbstractC3938h {

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1590d f3071b;

        /* renamed from: c, reason: collision with root package name */
        private Context f3072c;

        /* renamed from: d, reason: collision with root package name */
        private final ImageView f3073d;

        /* renamed from: e, reason: collision with root package name */
        private final ProgressBar f3074e;

        /* renamed from: f, reason: collision with root package name */
        private final TextView f3075f;

        /* renamed from: g, reason: collision with root package name */
        private final TextView f3076g;

        /* renamed from: h, reason: collision with root package name */
        private final TextView f3077h;

        /* renamed from: i, reason: collision with root package name */
        private final TextView f3078i;

        /* renamed from: j, reason: collision with root package name */
        private final TextView f3079j;

        /* renamed from: k, reason: collision with root package name */
        private final TextView f3080k;

        /* renamed from: l, reason: collision with root package name */
        private final LinearLayout f3081l;

        /* renamed from: m, reason: collision with root package name */
        private final RelativeLayout f3082m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ I f3083n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(I i8, View itemView, InterfaceC1590d listener, Context context) {
            super(itemView, context);
            AbstractC3255y.i(itemView, "itemView");
            AbstractC3255y.i(listener, "listener");
            AbstractC3255y.i(context, "context");
            this.f3083n = i8;
            this.f3071b = listener;
            this.f3072c = context;
            View findViewById = itemView.findViewById(R.id.iv_logo_card_top_download);
            AbstractC3255y.h(findViewById, "itemView.findViewById(R.…v_logo_card_top_download)");
            this.f3073d = (ImageView) findViewById;
            View findViewById2 = itemView.findViewById(R.id.pb_progress_card_top_download);
            AbstractC3255y.h(findViewById2, "itemView.findViewById(R.…ogress_card_top_download)");
            this.f3074e = (ProgressBar) findViewById2;
            View findViewById3 = itemView.findViewById(R.id.tv_titulo_card_top_download);
            AbstractC3255y.h(findViewById3, "itemView.findViewById(R.…titulo_card_top_download)");
            TextView textView = (TextView) findViewById3;
            this.f3075f = textView;
            View findViewById4 = itemView.findViewById(R.id.tv_number_card_top_download);
            AbstractC3255y.h(findViewById4, "itemView.findViewById(R.…number_card_top_download)");
            TextView textView2 = (TextView) findViewById4;
            this.f3076g = textView2;
            View findViewById5 = itemView.findViewById(R.id.tv_resumen_card_top_download);
            AbstractC3255y.h(findViewById5, "itemView.findViewById(R.…esumen_card_top_download)");
            TextView textView3 = (TextView) findViewById5;
            this.f3077h = textView3;
            View findViewById6 = itemView.findViewById(R.id.tv_status_card_top_download);
            AbstractC3255y.h(findViewById6, "itemView.findViewById(R.…status_card_top_download)");
            TextView textView4 = (TextView) findViewById6;
            this.f3078i = textView4;
            View findViewById7 = itemView.findViewById(R.id.tv_progress_card_top_download);
            AbstractC3255y.h(findViewById7, "itemView.findViewById(R.…ogress_card_top_download)");
            TextView textView5 = (TextView) findViewById7;
            this.f3079j = textView5;
            View findViewById8 = itemView.findViewById(R.id.tv_verified_card_top_download);
            AbstractC3255y.h(findViewById8, "itemView.findViewById(R.…rified_card_top_download)");
            TextView textView6 = (TextView) findViewById8;
            this.f3080k = textView6;
            View findViewById9 = itemView.findViewById(R.id.ll_progress_card_top_download);
            AbstractC3255y.h(findViewById9, "itemView.findViewById(R.…ogress_card_top_download)");
            this.f3081l = (LinearLayout) findViewById9;
            View findViewById10 = itemView.findViewById(R.id.rl_card_details_top_download);
            AbstractC3255y.h(findViewById10, "itemView.findViewById(R.…ard_details_top_download)");
            this.f3082m = (RelativeLayout) findViewById10;
            j.a aVar = H4.j.f3824g;
            textView2.setTypeface(aVar.t());
            textView.setTypeface(aVar.t());
            textView3.setTypeface(aVar.u());
            textView4.setTypeface(aVar.u());
            textView5.setTypeface(aVar.u());
            textView6.setTypeface(aVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean n(I this$0, C1641h app, int i8, View view) {
            AbstractC3255y.i(this$0, "this$0");
            AbstractC3255y.i(app, "$app");
            this$0.f3068b.a(app, i8);
            return true;
        }

        public final void m(final C1641h app, int i8, final int i9) {
            AbstractC3255y.i(app, "app");
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (i8 >= 10) {
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.setMarginStart((int) this.f3072c.getResources().getDimension(R.dimen.top_card_margin_index_ten));
                this.f3082m.setLayoutParams(layoutParams2);
            } else {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams3.setMarginStart((int) this.f3072c.getResources().getDimension(R.dimen.top_download_horizontal_card_margin));
                this.f3082m.setLayoutParams(layoutParams3);
            }
            this.itemView.setLayoutParams(b(layoutParams, this.f3072c, i8, 20));
            this.f3076g.setText(String.valueOf(i8));
            View itemView = this.itemView;
            AbstractC3255y.h(itemView, "itemView");
            c(itemView, this.f3071b, app);
            View view = this.itemView;
            final I i10 = this.f3083n;
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: G4.H
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    boolean n8;
                    n8 = I.a.n(I.this, app, i9, view2);
                    return n8;
                }
            });
            i(app, this.f3075f, this.f3077h);
            h(this.f3073d, app.l0());
            e(app, this.f3074e, this.f3073d, this.f3077h, this.f3079j, this.f3078i, this.f3081l);
        }
    }

    public I(InterfaceC1590d listener, InterfaceC1587a actionsClickListener, Context context) {
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(actionsClickListener, "actionsClickListener");
        AbstractC3255y.i(context, "context");
        this.f3067a = listener;
        this.f3068b = actionsClickListener;
        this.f3069c = context;
        this.f3070d = new ArrayList();
    }

    public final ArrayList b() {
        return this.f3070d;
    }

    public final void c(ArrayList appList) {
        AbstractC3255y.i(appList, "appList");
        ArrayList arrayList = this.f3070d;
        arrayList.clear();
        arrayList.addAll(appList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3070d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i8) {
        AbstractC3255y.i(holder, "holder");
        Object obj = this.f3070d.get(i8);
        AbstractC3255y.h(obj, "apps[position]");
        ((a) holder).m((C1641h) obj, i8 + 1, i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3255y.i(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_top_download, parent, false);
        AbstractC3255y.h(itemView, "itemView");
        return new a(this, itemView, this.f3067a, this.f3069c);
    }
}
