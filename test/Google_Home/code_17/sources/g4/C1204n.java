package G4;

import G4.C1204n;
import H4.j;
import P5.AbstractC1378t;
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
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;
import r5.AbstractC3938h;

/* renamed from: G4.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1204n extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1590d f3276a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1587a f3277b;

    /* renamed from: c, reason: collision with root package name */
    private Context f3278c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f3279d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3280e;

    /* renamed from: G4.n$a */
    /* loaded from: classes4.dex */
    public final class a extends AbstractC3938h {

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1590d f3281b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC1587a f3282c;

        /* renamed from: d, reason: collision with root package name */
        private Context f3283d;

        /* renamed from: e, reason: collision with root package name */
        private final ImageView f3284e;

        /* renamed from: f, reason: collision with root package name */
        private final ImageView f3285f;

        /* renamed from: g, reason: collision with root package name */
        private final ProgressBar f3286g;

        /* renamed from: h, reason: collision with root package name */
        private final TextView f3287h;

        /* renamed from: i, reason: collision with root package name */
        private final TextView f3288i;

        /* renamed from: j, reason: collision with root package name */
        private final TextView f3289j;

        /* renamed from: k, reason: collision with root package name */
        private final TextView f3290k;

        /* renamed from: l, reason: collision with root package name */
        private final TextView f3291l;

        /* renamed from: m, reason: collision with root package name */
        private final LinearLayout f3292m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ C1204n f3293n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1204n c1204n, View itemView, InterfaceC1590d listener, InterfaceC1587a actionsClickListener, Context context) {
            super(itemView, context);
            AbstractC3255y.i(itemView, "itemView");
            AbstractC3255y.i(listener, "listener");
            AbstractC3255y.i(actionsClickListener, "actionsClickListener");
            AbstractC3255y.i(context, "context");
            this.f3293n = c1204n;
            this.f3281b = listener;
            this.f3282c = actionsClickListener;
            this.f3283d = context;
            this.f3284e = (ImageView) itemView.findViewById(R.id.iv_home_card_featured_item);
            this.f3285f = (ImageView) itemView.findViewById(R.id.iv_logo_home_card_featured_item);
            View findViewById = itemView.findViewById(R.id.pb_progress_home_card_featured_item);
            AbstractC3255y.h(findViewById, "itemView.findViewById(R.…_home_card_featured_item)");
            this.f3286g = (ProgressBar) findViewById;
            TextView textView = (TextView) itemView.findViewById(R.id.tv_name_home_card_featured_item);
            this.f3287h = textView;
            TextView textView2 = (TextView) itemView.findViewById(R.id.tv_desc_home_card_featured_item);
            this.f3288i = textView2;
            this.f3289j = (TextView) itemView.findViewById(R.id.tv_status_home_card_featured_item);
            View findViewById2 = itemView.findViewById(R.id.tv_progress_home_card_featured_item);
            AbstractC3255y.h(findViewById2, "itemView.findViewById(R.…_home_card_featured_item)");
            TextView textView3 = (TextView) findViewById2;
            this.f3290k = textView3;
            View findViewById3 = itemView.findViewById(R.id.tv_verified_home_card_featured_item);
            AbstractC3255y.h(findViewById3, "itemView.findViewById(R.…_home_card_featured_item)");
            TextView textView4 = (TextView) findViewById3;
            this.f3291l = textView4;
            View findViewById4 = itemView.findViewById(R.id.ll_progress_home_card_featured_item);
            AbstractC3255y.h(findViewById4, "itemView.findViewById(R.…_home_card_featured_item)");
            this.f3292m = (LinearLayout) findViewById4;
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.t());
            textView2.setTypeface(aVar.u());
            textView3.setTypeface(aVar.u());
            textView4.setTypeface(aVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean n(a this$0, C1641h app, int i8, View view) {
            AbstractC3255y.i(this$0, "this$0");
            AbstractC3255y.i(app, "$app");
            this$0.f3282c.a(app, i8);
            return true;
        }

        public final void m(final C1641h app, int i8, final int i9) {
            AbstractC3255y.i(app, "app");
            this.itemView.setLayoutParams(b(new RelativeLayout.LayoutParams(-2, -2), this.f3283d, i8, 20));
            String e02 = app.e0();
            if (e02 != null && e02.length() != 0) {
                com.squareup.picasso.s.h().l(app.i0()).n(UptodownApp.f29058B.e0(this.f3283d)).a().f().l(R.drawable.shape_bg_placeholder).i(this.f3284e);
            } else {
                this.f3284e.setImageDrawable(ContextCompat.getDrawable(this.f3283d, R.drawable.shape_bg_placeholder));
            }
            View itemView = this.itemView;
            AbstractC3255y.h(itemView, "itemView");
            c(itemView, this.f3281b, app);
            this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: G4.m
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean n8;
                    n8 = C1204n.a.n(C1204n.a.this, app, i9, view);
                    return n8;
                }
            });
            TextView tvName = this.f3287h;
            AbstractC3255y.h(tvName, "tvName");
            TextView tvDesc = this.f3288i;
            AbstractC3255y.h(tvDesc, "tvDesc");
            i(app, tvName, tvDesc);
            ImageView ivIcon = this.f3285f;
            AbstractC3255y.h(ivIcon, "ivIcon");
            h(ivIcon, app.m0());
            ProgressBar progressBar = this.f3286g;
            ImageView ivIcon2 = this.f3285f;
            AbstractC3255y.h(ivIcon2, "ivIcon");
            TextView tvDesc2 = this.f3288i;
            AbstractC3255y.h(tvDesc2, "tvDesc");
            e(app, progressBar, ivIcon2, tvDesc2, this.f3290k, this.f3289j, this.f3292m);
        }
    }

    /* renamed from: G4.n$b */
    /* loaded from: classes4.dex */
    public final class b extends AbstractC3938h {

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1590d f3294b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC1587a f3295c;

        /* renamed from: d, reason: collision with root package name */
        private Context f3296d;

        /* renamed from: e, reason: collision with root package name */
        private final ImageView f3297e;

        /* renamed from: f, reason: collision with root package name */
        private final ProgressBar f3298f;

        /* renamed from: g, reason: collision with root package name */
        private final ImageView f3299g;

        /* renamed from: h, reason: collision with root package name */
        private final TextView f3300h;

        /* renamed from: i, reason: collision with root package name */
        private final TextView f3301i;

        /* renamed from: j, reason: collision with root package name */
        private final TextView f3302j;

        /* renamed from: k, reason: collision with root package name */
        private final TextView f3303k;

        /* renamed from: l, reason: collision with root package name */
        private final TextView f3304l;

        /* renamed from: m, reason: collision with root package name */
        private final LinearLayout f3305m;

        /* renamed from: n, reason: collision with root package name */
        private final TextView f3306n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ C1204n f3307o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1204n c1204n, View itemView, InterfaceC1590d listener, InterfaceC1587a actionsClickListener, Context context) {
            super(itemView, context);
            AbstractC3255y.i(itemView, "itemView");
            AbstractC3255y.i(listener, "listener");
            AbstractC3255y.i(actionsClickListener, "actionsClickListener");
            AbstractC3255y.i(context, "context");
            this.f3307o = c1204n;
            this.f3294b = listener;
            this.f3295c = actionsClickListener;
            this.f3296d = context;
            this.f3297e = (ImageView) itemView.findViewById(R.id.iv_home_top_card_featured_item);
            View findViewById = itemView.findViewById(R.id.pb_progress_home_card_top_featured_item);
            AbstractC3255y.h(findViewById, "itemView.findViewById(R.…e_card_top_featured_item)");
            this.f3298f = (ProgressBar) findViewById;
            this.f3299g = (ImageView) itemView.findViewById(R.id.iv_logo_home_card_top_featured_item);
            TextView textView = (TextView) itemView.findViewById(R.id.tv_name_home_card_top_featured_item);
            this.f3300h = textView;
            TextView textView2 = (TextView) itemView.findViewById(R.id.tv_number_card_top_featured_download);
            this.f3301i = textView2;
            TextView textView3 = (TextView) itemView.findViewById(R.id.tv_desc_home_card_top_featured_item);
            this.f3302j = textView3;
            View findViewById2 = itemView.findViewById(R.id.tv_progress_home_card_top_featured_item);
            AbstractC3255y.h(findViewById2, "itemView.findViewById(R.…e_card_top_featured_item)");
            TextView textView4 = (TextView) findViewById2;
            this.f3303k = textView4;
            View findViewById3 = itemView.findViewById(R.id.tv_verified_home_card_top_featured_item);
            AbstractC3255y.h(findViewById3, "itemView.findViewById(R.…e_card_top_featured_item)");
            TextView textView5 = (TextView) findViewById3;
            this.f3304l = textView5;
            View findViewById4 = itemView.findViewById(R.id.ll_progress_home_card_top_featured_item);
            AbstractC3255y.h(findViewById4, "itemView.findViewById(R.…e_card_top_featured_item)");
            this.f3305m = (LinearLayout) findViewById4;
            this.f3306n = (TextView) itemView.findViewById(R.id.tv_status_home_card_top_featured_item);
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.t());
            textView2.setTypeface(aVar.t());
            textView3.setTypeface(aVar.u());
            textView4.setTypeface(aVar.u());
            textView5.setTypeface(aVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean n(b this$0, C1641h app, int i8, View view) {
            AbstractC3255y.i(this$0, "this$0");
            AbstractC3255y.i(app, "$app");
            this$0.f3295c.a(app, i8);
            return true;
        }

        public final void m(final C1641h app, int i8, final int i9, boolean z8) {
            AbstractC3255y.i(app, "app");
            int dimension = (int) this.f3296d.getResources().getDimension(R.dimen.margin_m);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (z8) {
                layoutParams.setMargins(dimension, 0, dimension, dimension);
            } else {
                layoutParams.setMargins(dimension, 0, 0, dimension);
            }
            ViewGroup.LayoutParams layoutParams2 = this.f3297e.getLayoutParams();
            AbstractC3255y.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            if (i8 >= 10) {
                marginLayoutParams.setMarginStart((int) this.f3296d.getResources().getDimension(R.dimen.top_card_featured_margin_index_ten));
            } else {
                marginLayoutParams.setMarginStart(0);
            }
            this.f3297e.setLayoutParams(marginLayoutParams);
            this.itemView.setLayoutParams(layoutParams);
            this.f3301i.setText(String.valueOf(i8));
            String e02 = app.e0();
            if (e02 != null && e02.length() != 0) {
                com.squareup.picasso.s.h().l(app.i0()).n(UptodownApp.f29058B.e0(this.f3296d)).a().f().l(R.drawable.shape_bg_placeholder).i(this.f3297e);
            } else {
                this.f3297e.setImageDrawable(ContextCompat.getDrawable(this.f3296d, R.drawable.shape_bg_placeholder));
            }
            View itemView = this.itemView;
            AbstractC3255y.h(itemView, "itemView");
            c(itemView, this.f3294b, app);
            this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: G4.o
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean n8;
                    n8 = C1204n.b.n(C1204n.b.this, app, i9, view);
                    return n8;
                }
            });
            TextView tvName = this.f3300h;
            AbstractC3255y.h(tvName, "tvName");
            TextView tvDesc = this.f3302j;
            AbstractC3255y.h(tvDesc, "tvDesc");
            i(app, tvName, tvDesc);
            ImageView ivIcon = this.f3299g;
            AbstractC3255y.h(ivIcon, "ivIcon");
            h(ivIcon, app.m0());
            ProgressBar progressBar = this.f3298f;
            ImageView ivIcon2 = this.f3299g;
            AbstractC3255y.h(ivIcon2, "ivIcon");
            TextView tvDesc2 = this.f3302j;
            AbstractC3255y.h(tvDesc2, "tvDesc");
            e(app, progressBar, ivIcon2, tvDesc2, this.f3303k, this.f3306n, this.f3305m);
        }
    }

    public C1204n(InterfaceC1590d listener, InterfaceC1587a actionsClickListener, Context context) {
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(actionsClickListener, "actionsClickListener");
        AbstractC3255y.i(context, "context");
        this.f3276a = listener;
        this.f3277b = actionsClickListener;
        this.f3278c = context;
        this.f3279d = new ArrayList();
    }

    public final ArrayList a() {
        return this.f3279d;
    }

    public final void b(ArrayList appList, boolean z8) {
        AbstractC3255y.i(appList, "appList");
        this.f3280e = z8;
        this.f3279d = appList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3279d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i8) {
        AbstractC3255y.i(holder, "holder");
        if (holder instanceof a) {
            Object obj = this.f3279d.get(i8);
            AbstractC3255y.h(obj, "apps[position]");
            ((a) holder).m((C1641h) obj, i8 + 1, i8);
        } else if (holder instanceof b) {
            int i9 = i8 + 1;
            if (AbstractC3255y.d(this.f3279d.get(i8), AbstractC1378t.y0(this.f3279d))) {
                Object obj2 = this.f3279d.get(i8);
                AbstractC3255y.h(obj2, "apps[position]");
                ((b) holder).m((C1641h) obj2, i9, i8, true);
            } else {
                Object obj3 = this.f3279d.get(i8);
                AbstractC3255y.h(obj3, "apps[position]");
                ((b) holder).m((C1641h) obj3, i9, i8, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3255y.i(parent, "parent");
        if (this.f3280e) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_card_top_featured_item, parent, false);
            AbstractC3255y.h(itemView, "itemView");
            return new b(this, itemView, this.f3276a, this.f3277b, this.f3278c);
        }
        View itemView2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_card_featured_item, parent, false);
        AbstractC3255y.h(itemView2, "itemView");
        return new a(this, itemView2, this.f3276a, this.f3277b, this.f3278c);
    }
}
