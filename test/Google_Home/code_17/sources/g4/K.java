package G4;

import G4.K;
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
public final class K extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1590d f3087a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC1587a f3088b;

    /* renamed from: c, reason: collision with root package name */
    private Context f3089c;

    /* renamed from: d, reason: collision with root package name */
    private int f3090d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f3091e;

    /* loaded from: classes4.dex */
    public final class a extends AbstractC3938h {

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1590d f3092b;

        /* renamed from: c, reason: collision with root package name */
        private Context f3093c;

        /* renamed from: d, reason: collision with root package name */
        private final ImageView f3094d;

        /* renamed from: e, reason: collision with root package name */
        private final ProgressBar f3095e;

        /* renamed from: f, reason: collision with root package name */
        private final TextView f3096f;

        /* renamed from: g, reason: collision with root package name */
        private final TextView f3097g;

        /* renamed from: h, reason: collision with root package name */
        private final TextView f3098h;

        /* renamed from: i, reason: collision with root package name */
        private final TextView f3099i;

        /* renamed from: j, reason: collision with root package name */
        private final LinearLayout f3100j;

        /* renamed from: k, reason: collision with root package name */
        private final TextView f3101k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ K f3102l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(K k8, View itemView, InterfaceC1590d listener, Context context) {
            super(itemView, context);
            AbstractC3255y.i(itemView, "itemView");
            AbstractC3255y.i(listener, "listener");
            AbstractC3255y.i(context, "context");
            this.f3102l = k8;
            this.f3092b = listener;
            this.f3093c = context;
            View findViewById = itemView.findViewById(R.id.iv_logo_card);
            AbstractC3255y.h(findViewById, "itemView.findViewById(R.id.iv_logo_card)");
            this.f3094d = (ImageView) findViewById;
            View findViewById2 = itemView.findViewById(R.id.pb_progress_card);
            AbstractC3255y.h(findViewById2, "itemView.findViewById(R.id.pb_progress_card)");
            this.f3095e = (ProgressBar) findViewById2;
            View findViewById3 = itemView.findViewById(R.id.tv_titulo_card);
            AbstractC3255y.h(findViewById3, "itemView.findViewById(R.id.tv_titulo_card)");
            TextView textView = (TextView) findViewById3;
            this.f3096f = textView;
            View findViewById4 = itemView.findViewById(R.id.tv_resumen_card);
            AbstractC3255y.h(findViewById4, "itemView.findViewById(R.id.tv_resumen_card)");
            TextView textView2 = (TextView) findViewById4;
            this.f3097g = textView2;
            View findViewById5 = itemView.findViewById(R.id.tv_progress_card);
            AbstractC3255y.h(findViewById5, "itemView.findViewById(R.id.tv_progress_card)");
            TextView textView3 = (TextView) findViewById5;
            this.f3098h = textView3;
            View findViewById6 = itemView.findViewById(R.id.tv_verified_card);
            AbstractC3255y.h(findViewById6, "itemView.findViewById(R.id.tv_verified_card)");
            TextView textView4 = (TextView) findViewById6;
            this.f3099i = textView4;
            View findViewById7 = itemView.findViewById(R.id.ll_progress_card);
            AbstractC3255y.h(findViewById7, "itemView.findViewById(R.id.ll_progress_card)");
            this.f3100j = (LinearLayout) findViewById7;
            View findViewById8 = itemView.findViewById(R.id.tv_status_card);
            AbstractC3255y.h(findViewById8, "itemView.findViewById(R.id.tv_status_card)");
            TextView textView5 = (TextView) findViewById8;
            this.f3101k = textView5;
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.t());
            textView2.setTypeface(aVar.u());
            textView5.setTypeface(aVar.u());
            textView3.setTypeface(aVar.u());
            textView4.setTypeface(aVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean n(K this$0, C1641h app, int i8, View view) {
            AbstractC3255y.i(this$0, "this$0");
            AbstractC3255y.i(app, "$app");
            this$0.f3088b.a(app, i8);
            return true;
        }

        public final void m(final C1641h app, final int i8) {
            AbstractC3255y.i(app, "app");
            this.itemView.setLayoutParams(b(new RelativeLayout.LayoutParams((int) this.f3093c.getResources().getDimension(R.dimen.top_horizontal_card_width), -2), this.f3093c, i8, this.f3102l.f3090d));
            View itemView = this.itemView;
            AbstractC3255y.h(itemView, "itemView");
            c(itemView, this.f3092b, app);
            View view = this.itemView;
            final K k8 = this.f3102l;
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: G4.J
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    boolean n8;
                    n8 = K.a.n(K.this, app, i8, view2);
                    return n8;
                }
            });
            i(app, this.f3096f, this.f3097g);
            h(this.f3094d, app.l0());
            e(app, this.f3095e, this.f3094d, this.f3097g, this.f3098h, this.f3101k, this.f3100j);
        }
    }

    public K(InterfaceC1590d listener, InterfaceC1587a actionsClickListener, Context context, int i8) {
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(actionsClickListener, "actionsClickListener");
        AbstractC3255y.i(context, "context");
        this.f3087a = listener;
        this.f3088b = actionsClickListener;
        this.f3089c = context;
        this.f3090d = i8;
        this.f3091e = new ArrayList();
    }

    public final ArrayList c() {
        return this.f3091e;
    }

    public final void d(ArrayList appList) {
        AbstractC3255y.i(appList, "appList");
        ArrayList arrayList = this.f3091e;
        arrayList.clear();
        arrayList.addAll(appList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3091e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i8) {
        AbstractC3255y.i(holder, "holder");
        Object obj = this.f3091e.get(i8);
        AbstractC3255y.h(obj, "apps[position]");
        ((a) holder).m((C1641h) obj, i8 + 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3255y.i(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        AbstractC3255y.h(itemView, "itemView");
        return new a(this, itemView, this.f3087a, this.f3089c);
    }
}
