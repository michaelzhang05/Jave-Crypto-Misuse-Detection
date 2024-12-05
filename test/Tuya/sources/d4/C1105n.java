package D4;

import D4.C1105n;
import E4.j;
import M5.AbstractC1246t;
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
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;
import o5.AbstractC3548h;

/* renamed from: D4.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1105n extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1481d f1734a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1478a f1735b;

    /* renamed from: c, reason: collision with root package name */
    private Context f1736c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f1737d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1738e;

    /* renamed from: D4.n$a */
    /* loaded from: classes4.dex */
    public final class a extends AbstractC3548h {

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1481d f1739b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC1478a f1740c;

        /* renamed from: d, reason: collision with root package name */
        private Context f1741d;

        /* renamed from: e, reason: collision with root package name */
        private final ImageView f1742e;

        /* renamed from: f, reason: collision with root package name */
        private final ImageView f1743f;

        /* renamed from: g, reason: collision with root package name */
        private final ProgressBar f1744g;

        /* renamed from: h, reason: collision with root package name */
        private final TextView f1745h;

        /* renamed from: i, reason: collision with root package name */
        private final TextView f1746i;

        /* renamed from: j, reason: collision with root package name */
        private final TextView f1747j;

        /* renamed from: k, reason: collision with root package name */
        private final TextView f1748k;

        /* renamed from: l, reason: collision with root package name */
        private final TextView f1749l;

        /* renamed from: m, reason: collision with root package name */
        private final LinearLayout f1750m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ C1105n f1751n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1105n c1105n, View itemView, InterfaceC1481d listener, InterfaceC1478a actionsClickListener, Context context) {
            super(itemView, context);
            AbstractC3159y.i(itemView, "itemView");
            AbstractC3159y.i(listener, "listener");
            AbstractC3159y.i(actionsClickListener, "actionsClickListener");
            AbstractC3159y.i(context, "context");
            this.f1751n = c1105n;
            this.f1739b = listener;
            this.f1740c = actionsClickListener;
            this.f1741d = context;
            this.f1742e = (ImageView) itemView.findViewById(R.id.iv_home_card_featured_item);
            this.f1743f = (ImageView) itemView.findViewById(R.id.iv_logo_home_card_featured_item);
            View findViewById = itemView.findViewById(R.id.pb_progress_home_card_featured_item);
            AbstractC3159y.h(findViewById, "itemView.findViewById(R.…_home_card_featured_item)");
            this.f1744g = (ProgressBar) findViewById;
            TextView textView = (TextView) itemView.findViewById(R.id.tv_name_home_card_featured_item);
            this.f1745h = textView;
            TextView textView2 = (TextView) itemView.findViewById(R.id.tv_desc_home_card_featured_item);
            this.f1746i = textView2;
            this.f1747j = (TextView) itemView.findViewById(R.id.tv_status_home_card_featured_item);
            View findViewById2 = itemView.findViewById(R.id.tv_progress_home_card_featured_item);
            AbstractC3159y.h(findViewById2, "itemView.findViewById(R.…_home_card_featured_item)");
            TextView textView3 = (TextView) findViewById2;
            this.f1748k = textView3;
            View findViewById3 = itemView.findViewById(R.id.tv_verified_home_card_featured_item);
            AbstractC3159y.h(findViewById3, "itemView.findViewById(R.…_home_card_featured_item)");
            TextView textView4 = (TextView) findViewById3;
            this.f1749l = textView4;
            View findViewById4 = itemView.findViewById(R.id.ll_progress_home_card_featured_item);
            AbstractC3159y.h(findViewById4, "itemView.findViewById(R.…_home_card_featured_item)");
            this.f1750m = (LinearLayout) findViewById4;
            j.a aVar = E4.j.f2274g;
            textView.setTypeface(aVar.t());
            textView2.setTypeface(aVar.u());
            textView3.setTypeface(aVar.u());
            textView4.setTypeface(aVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean n(a this$0, C1498h app, int i8, View view) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(app, "$app");
            this$0.f1740c.a(app, i8);
            return true;
        }

        public final void m(final C1498h app, int i8, final int i9) {
            AbstractC3159y.i(app, "app");
            this.itemView.setLayoutParams(b(new RelativeLayout.LayoutParams(-2, -2), this.f1741d, i8, 20));
            String e02 = app.e0();
            if (e02 != null && e02.length() != 0) {
                com.squareup.picasso.s.h().l(app.i0()).n(UptodownApp.f28003B.e0(this.f1741d)).a().f().l(R.drawable.shape_bg_placeholder).i(this.f1742e);
            } else {
                this.f1742e.setImageDrawable(ContextCompat.getDrawable(this.f1741d, R.drawable.shape_bg_placeholder));
            }
            View itemView = this.itemView;
            AbstractC3159y.h(itemView, "itemView");
            c(itemView, this.f1739b, app);
            this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: D4.m
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean n8;
                    n8 = C1105n.a.n(C1105n.a.this, app, i9, view);
                    return n8;
                }
            });
            TextView tvName = this.f1745h;
            AbstractC3159y.h(tvName, "tvName");
            TextView tvDesc = this.f1746i;
            AbstractC3159y.h(tvDesc, "tvDesc");
            i(app, tvName, tvDesc);
            ImageView ivIcon = this.f1743f;
            AbstractC3159y.h(ivIcon, "ivIcon");
            h(ivIcon, app.m0());
            ProgressBar progressBar = this.f1744g;
            ImageView ivIcon2 = this.f1743f;
            AbstractC3159y.h(ivIcon2, "ivIcon");
            TextView tvDesc2 = this.f1746i;
            AbstractC3159y.h(tvDesc2, "tvDesc");
            e(app, progressBar, ivIcon2, tvDesc2, this.f1748k, this.f1747j, this.f1750m);
        }
    }

    /* renamed from: D4.n$b */
    /* loaded from: classes4.dex */
    public final class b extends AbstractC3548h {

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1481d f1752b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC1478a f1753c;

        /* renamed from: d, reason: collision with root package name */
        private Context f1754d;

        /* renamed from: e, reason: collision with root package name */
        private final ImageView f1755e;

        /* renamed from: f, reason: collision with root package name */
        private final ProgressBar f1756f;

        /* renamed from: g, reason: collision with root package name */
        private final ImageView f1757g;

        /* renamed from: h, reason: collision with root package name */
        private final TextView f1758h;

        /* renamed from: i, reason: collision with root package name */
        private final TextView f1759i;

        /* renamed from: j, reason: collision with root package name */
        private final TextView f1760j;

        /* renamed from: k, reason: collision with root package name */
        private final TextView f1761k;

        /* renamed from: l, reason: collision with root package name */
        private final TextView f1762l;

        /* renamed from: m, reason: collision with root package name */
        private final LinearLayout f1763m;

        /* renamed from: n, reason: collision with root package name */
        private final TextView f1764n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ C1105n f1765o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1105n c1105n, View itemView, InterfaceC1481d listener, InterfaceC1478a actionsClickListener, Context context) {
            super(itemView, context);
            AbstractC3159y.i(itemView, "itemView");
            AbstractC3159y.i(listener, "listener");
            AbstractC3159y.i(actionsClickListener, "actionsClickListener");
            AbstractC3159y.i(context, "context");
            this.f1765o = c1105n;
            this.f1752b = listener;
            this.f1753c = actionsClickListener;
            this.f1754d = context;
            this.f1755e = (ImageView) itemView.findViewById(R.id.iv_home_top_card_featured_item);
            View findViewById = itemView.findViewById(R.id.pb_progress_home_card_top_featured_item);
            AbstractC3159y.h(findViewById, "itemView.findViewById(R.…e_card_top_featured_item)");
            this.f1756f = (ProgressBar) findViewById;
            this.f1757g = (ImageView) itemView.findViewById(R.id.iv_logo_home_card_top_featured_item);
            TextView textView = (TextView) itemView.findViewById(R.id.tv_name_home_card_top_featured_item);
            this.f1758h = textView;
            TextView textView2 = (TextView) itemView.findViewById(R.id.tv_number_card_top_featured_download);
            this.f1759i = textView2;
            TextView textView3 = (TextView) itemView.findViewById(R.id.tv_desc_home_card_top_featured_item);
            this.f1760j = textView3;
            View findViewById2 = itemView.findViewById(R.id.tv_progress_home_card_top_featured_item);
            AbstractC3159y.h(findViewById2, "itemView.findViewById(R.…e_card_top_featured_item)");
            TextView textView4 = (TextView) findViewById2;
            this.f1761k = textView4;
            View findViewById3 = itemView.findViewById(R.id.tv_verified_home_card_top_featured_item);
            AbstractC3159y.h(findViewById3, "itemView.findViewById(R.…e_card_top_featured_item)");
            TextView textView5 = (TextView) findViewById3;
            this.f1762l = textView5;
            View findViewById4 = itemView.findViewById(R.id.ll_progress_home_card_top_featured_item);
            AbstractC3159y.h(findViewById4, "itemView.findViewById(R.…e_card_top_featured_item)");
            this.f1763m = (LinearLayout) findViewById4;
            this.f1764n = (TextView) itemView.findViewById(R.id.tv_status_home_card_top_featured_item);
            j.a aVar = E4.j.f2274g;
            textView.setTypeface(aVar.t());
            textView2.setTypeface(aVar.t());
            textView3.setTypeface(aVar.u());
            textView4.setTypeface(aVar.u());
            textView5.setTypeface(aVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean n(b this$0, C1498h app, int i8, View view) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(app, "$app");
            this$0.f1753c.a(app, i8);
            return true;
        }

        public final void m(final C1498h app, int i8, final int i9, boolean z8) {
            AbstractC3159y.i(app, "app");
            int dimension = (int) this.f1754d.getResources().getDimension(R.dimen.margin_m);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (z8) {
                layoutParams.setMargins(dimension, 0, dimension, dimension);
            } else {
                layoutParams.setMargins(dimension, 0, 0, dimension);
            }
            ViewGroup.LayoutParams layoutParams2 = this.f1755e.getLayoutParams();
            AbstractC3159y.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            if (i8 >= 10) {
                marginLayoutParams.setMarginStart((int) this.f1754d.getResources().getDimension(R.dimen.top_card_featured_margin_index_ten));
            } else {
                marginLayoutParams.setMarginStart(0);
            }
            this.f1755e.setLayoutParams(marginLayoutParams);
            this.itemView.setLayoutParams(layoutParams);
            this.f1759i.setText(String.valueOf(i8));
            String e02 = app.e0();
            if (e02 != null && e02.length() != 0) {
                com.squareup.picasso.s.h().l(app.i0()).n(UptodownApp.f28003B.e0(this.f1754d)).a().f().l(R.drawable.shape_bg_placeholder).i(this.f1755e);
            } else {
                this.f1755e.setImageDrawable(ContextCompat.getDrawable(this.f1754d, R.drawable.shape_bg_placeholder));
            }
            View itemView = this.itemView;
            AbstractC3159y.h(itemView, "itemView");
            c(itemView, this.f1752b, app);
            this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: D4.o
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean n8;
                    n8 = C1105n.b.n(C1105n.b.this, app, i9, view);
                    return n8;
                }
            });
            TextView tvName = this.f1758h;
            AbstractC3159y.h(tvName, "tvName");
            TextView tvDesc = this.f1760j;
            AbstractC3159y.h(tvDesc, "tvDesc");
            i(app, tvName, tvDesc);
            ImageView ivIcon = this.f1757g;
            AbstractC3159y.h(ivIcon, "ivIcon");
            h(ivIcon, app.m0());
            ProgressBar progressBar = this.f1756f;
            ImageView ivIcon2 = this.f1757g;
            AbstractC3159y.h(ivIcon2, "ivIcon");
            TextView tvDesc2 = this.f1760j;
            AbstractC3159y.h(tvDesc2, "tvDesc");
            e(app, progressBar, ivIcon2, tvDesc2, this.f1761k, this.f1764n, this.f1763m);
        }
    }

    public C1105n(InterfaceC1481d listener, InterfaceC1478a actionsClickListener, Context context) {
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(actionsClickListener, "actionsClickListener");
        AbstractC3159y.i(context, "context");
        this.f1734a = listener;
        this.f1735b = actionsClickListener;
        this.f1736c = context;
        this.f1737d = new ArrayList();
    }

    public final ArrayList a() {
        return this.f1737d;
    }

    public final void b(ArrayList appList, boolean z8) {
        AbstractC3159y.i(appList, "appList");
        this.f1738e = z8;
        this.f1737d = appList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1737d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i8) {
        AbstractC3159y.i(holder, "holder");
        if (holder instanceof a) {
            Object obj = this.f1737d.get(i8);
            AbstractC3159y.h(obj, "apps[position]");
            ((a) holder).m((C1498h) obj, i8 + 1, i8);
        } else if (holder instanceof b) {
            int i9 = i8 + 1;
            if (AbstractC3159y.d(this.f1737d.get(i8), AbstractC1246t.y0(this.f1737d))) {
                Object obj2 = this.f1737d.get(i8);
                AbstractC3159y.h(obj2, "apps[position]");
                ((b) holder).m((C1498h) obj2, i9, i8, true);
            } else {
                Object obj3 = this.f1737d.get(i8);
                AbstractC3159y.h(obj3, "apps[position]");
                ((b) holder).m((C1498h) obj3, i9, i8, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3159y.i(parent, "parent");
        if (this.f1738e) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_card_top_featured_item, parent, false);
            AbstractC3159y.h(itemView, "itemView");
            return new b(this, itemView, this.f1734a, this.f1735b, this.f1736c);
        }
        View itemView2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_card_featured_item, parent, false);
        AbstractC3159y.h(itemView2, "itemView");
        return new a(this, itemView2, this.f1734a, this.f1735b, this.f1736c);
    }
}
