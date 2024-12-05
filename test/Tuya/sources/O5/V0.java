package o5;

import E4.j;
import X4.Q;
import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3307A;

/* loaded from: classes5.dex */
public final class V0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final W4.H f36670a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f36671b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f36672c;

    /* renamed from: d, reason: collision with root package name */
    private final ImageView f36673d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f36674e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f36675f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f36676g;

    /* renamed from: h, reason: collision with root package name */
    private final TextView f36677h;

    /* renamed from: i, reason: collision with root package name */
    private final LinearLayout f36678i;

    /* renamed from: j, reason: collision with root package name */
    private final LinearLayout f36679j;

    /* renamed from: k, reason: collision with root package name */
    private final TextView f36680k;

    /* renamed from: l, reason: collision with root package name */
    private final ImageView f36681l;

    /* renamed from: m, reason: collision with root package name */
    private final ImageView f36682m;

    /* renamed from: n, reason: collision with root package name */
    private final ImageView f36683n;

    /* renamed from: o, reason: collision with root package name */
    private final ImageView f36684o;

    /* renamed from: p, reason: collision with root package name */
    private final ImageView f36685p;

    /* renamed from: q, reason: collision with root package name */
    private final ImageView f36686q;

    /* loaded from: classes5.dex */
    public static final class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            V0.this.f36675f.getViewTreeObserver().removeOnPreDrawListener(this);
            if (n5.v.a(V0.this.f36675f)) {
                V0.this.f36676g.setVisibility(0);
                V0.this.f36676g.setTypeface(E4.j.f2274g.t());
                return true;
            }
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(View itemView, W4.H listener, Context context) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(context, "context");
        this.f36670a = listener;
        this.f36671b = context;
        View findViewById = itemView.findViewById(R.id.tv_username_review);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.tv_username_review)");
        TextView textView = (TextView) findViewById;
        this.f36672c = textView;
        View findViewById2 = itemView.findViewById(R.id.iv_avatar_review);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.iv_avatar_review)");
        this.f36673d = (ImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.tv_date_review);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.id.tv_date_review)");
        TextView textView2 = (TextView) findViewById3;
        this.f36674e = textView2;
        View findViewById4 = itemView.findViewById(R.id.tv_body_review);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.id.tv_body_review)");
        TextView textView3 = (TextView) findViewById4;
        this.f36675f = textView3;
        View findViewById5 = itemView.findViewById(R.id.tv_show_more_review);
        AbstractC3159y.h(findViewById5, "itemView.findViewById(R.id.tv_show_more_review)");
        this.f36676g = (TextView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.tv_likes_counter_review);
        AbstractC3159y.h(findViewById6, "itemView.findViewById(R.….tv_likes_counter_review)");
        TextView textView4 = (TextView) findViewById6;
        this.f36677h = textView4;
        View findViewById7 = itemView.findViewById(R.id.ll_likes_review);
        AbstractC3159y.h(findViewById7, "itemView.findViewById(R.id.ll_likes_review)");
        this.f36678i = (LinearLayout) findViewById7;
        View findViewById8 = itemView.findViewById(R.id.ll_reviews_counter_review);
        AbstractC3159y.h(findViewById8, "itemView.findViewById(R.…l_reviews_counter_review)");
        this.f36679j = (LinearLayout) findViewById8;
        View findViewById9 = itemView.findViewById(R.id.tv_reviews_counter_review);
        AbstractC3159y.h(findViewById9, "itemView.findViewById(R.…v_reviews_counter_review)");
        TextView textView5 = (TextView) findViewById9;
        this.f36680k = textView5;
        View findViewById10 = itemView.findViewById(R.id.iv_likes_counter_review);
        AbstractC3159y.h(findViewById10, "itemView.findViewById(R.….iv_likes_counter_review)");
        this.f36681l = (ImageView) findViewById10;
        View findViewById11 = itemView.findViewById(R.id.iv_star1_review);
        AbstractC3159y.h(findViewById11, "itemView.findViewById(R.id.iv_star1_review)");
        this.f36682m = (ImageView) findViewById11;
        View findViewById12 = itemView.findViewById(R.id.iv_star2_review);
        AbstractC3159y.h(findViewById12, "itemView.findViewById(R.id.iv_star2_review)");
        this.f36683n = (ImageView) findViewById12;
        View findViewById13 = itemView.findViewById(R.id.iv_star3_review);
        AbstractC3159y.h(findViewById13, "itemView.findViewById(R.id.iv_star3_review)");
        this.f36684o = (ImageView) findViewById13;
        View findViewById14 = itemView.findViewById(R.id.iv_star4_review);
        AbstractC3159y.h(findViewById14, "itemView.findViewById(R.id.iv_star4_review)");
        this.f36685p = (ImageView) findViewById14;
        View findViewById15 = itemView.findViewById(R.id.iv_star5_review);
        AbstractC3159y.h(findViewById15, "itemView.findViewById(R.id.iv_star5_review)");
        this.f36686q = (ImageView) findViewById15;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        textView2.setTypeface(aVar.u());
        textView3.setTypeface(aVar.u());
        textView4.setTypeface(aVar.u());
        textView5.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(V0 this$0, int i8, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f36670a.c(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(V0 this$0, int i8, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f36670a.c(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(V0 this$0, X4.K item, int i8, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(item, "$item");
        n5.k.a(this$0.f36671b, this$0.f36681l);
        if (!C3307A.f34473a.i(item.j())) {
            this$0.f36670a.b(i8);
            this$0.f36677h.setText(String.valueOf(item.k() + 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(V0 this$0, int i8, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f36670a.a(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(V0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.f36675f.getMaxLines() == Integer.MAX_VALUE) {
            this$0.f36675f.setMaxLines(4);
            this$0.f36676g.setText(this$0.f36671b.getString(R.string.read_more_desc_app_detail));
        } else {
            this$0.f36675f.setMaxLines(Integer.MAX_VALUE);
            this$0.f36676g.setText(this$0.f36671b.getString(R.string.read_less_desc_app_detail));
        }
    }

    public final void h(final X4.K item, final int i8) {
        CharSequence charSequence;
        AbstractC3159y.i(item, "item");
        String e8 = item.e();
        if (e8 != null && e8.length() != 0) {
            this.f36672c.setText(item.e());
        }
        Q.b bVar = X4.Q.f12437k;
        if (bVar.c(item.i()) != null) {
            com.squareup.picasso.s.h().l(bVar.c(item.i())).n(UptodownApp.f28003B.f0(this.f36671b)).i(this.f36673d);
        } else {
            com.squareup.picasso.s.h().j(R.drawable.vector_user_default).n(UptodownApp.f28003B.f0(this.f36671b)).i(this.f36673d);
        }
        if (item.u() != null) {
            this.f36674e.setText(item.u());
        }
        Spanned s8 = item.s();
        if (s8 != null && s8.length() != 0) {
            this.f36675f.setText(item.s());
            this.f36675f.setVisibility(0);
            this.f36678i.setVisibility(0);
            this.f36679j.setVisibility(0);
        } else {
            this.f36675f.setVisibility(8);
            this.f36678i.setVisibility(8);
            this.f36679j.setVisibility(8);
        }
        this.f36677h.setText(String.valueOf(item.k()));
        if (C3307A.f34473a.i(item.j())) {
            this.f36681l.setImageDrawable(ContextCompat.getDrawable(this.f36671b, R.drawable.vector_heart_red));
        } else {
            this.f36681l.setImageDrawable(ContextCompat.getDrawable(this.f36671b, R.drawable.vector_heart));
        }
        if (item.b() == 0) {
            this.f36680k.setText(this.f36671b.getString(R.string.reply));
        } else if (item.b() == 1) {
            TextView textView = this.f36680k;
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f33766a;
            String string = this.f36671b.getString(R.string.replies_counter_single);
            AbstractC3159y.h(string, "context.getString(R.string.replies_counter_single)");
            String format = String.format(string, Arrays.copyOf(new Object[0], 0));
            AbstractC3159y.h(format, "format(...)");
            textView.setText(format);
        } else if (item.b() > 1) {
            TextView textView2 = this.f36680k;
            kotlin.jvm.internal.Y y9 = kotlin.jvm.internal.Y.f33766a;
            String string2 = this.f36671b.getString(R.string.replies_counter_multiple);
            AbstractC3159y.h(string2, "context.getString(R.stri…replies_counter_multiple)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(item.b())}, 1));
            AbstractC3159y.h(format2, "format(...)");
            textView2.setText(format2);
        }
        this.f36672c.setOnClickListener(new View.OnClickListener() { // from class: o5.Q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V0.i(V0.this, i8, view);
            }
        });
        this.f36673d.setOnClickListener(new View.OnClickListener() { // from class: o5.R0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V0.j(V0.this, i8, view);
            }
        });
        this.f36678i.setOnClickListener(new View.OnClickListener() { // from class: o5.S0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V0.k(V0.this, item, i8, view);
            }
        });
        this.f36679j.setOnClickListener(new View.OnClickListener() { // from class: o5.T0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V0.l(V0.this, i8, view);
            }
        });
        TextView textView3 = this.f36675f;
        Spanned s9 = item.s();
        if (s9 != null) {
            charSequence = g6.n.M0(s9);
        } else {
            charSequence = null;
        }
        textView3.setText(charSequence);
        this.f36675f.getViewTreeObserver().addOnPreDrawListener(new a());
        this.f36676g.setOnClickListener(new View.OnClickListener() { // from class: o5.U0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V0.m(V0.this, view);
            }
        });
        this.f36682m.setImageDrawable(ContextCompat.getDrawable(this.f36671b, R.drawable.vector_star_on));
        this.f36683n.setImageDrawable(ContextCompat.getDrawable(this.f36671b, R.drawable.vector_star_off));
        this.f36684o.setImageDrawable(ContextCompat.getDrawable(this.f36671b, R.drawable.vector_star_off));
        this.f36685p.setImageDrawable(ContextCompat.getDrawable(this.f36671b, R.drawable.vector_star_off));
        this.f36686q.setImageDrawable(ContextCompat.getDrawable(this.f36671b, R.drawable.vector_star_off));
        if (item.n() >= 2) {
            this.f36683n.setImageDrawable(ContextCompat.getDrawable(this.f36671b, R.drawable.vector_star_on));
        }
        if (item.n() >= 3) {
            this.f36684o.setImageDrawable(ContextCompat.getDrawable(this.f36671b, R.drawable.vector_star_on));
        }
        if (item.n() >= 4) {
            this.f36685p.setImageDrawable(ContextCompat.getDrawable(this.f36671b, R.drawable.vector_star_on));
        }
        if (item.n() == 5) {
            this.f36686q.setImageDrawable(ContextCompat.getDrawable(this.f36671b, R.drawable.vector_star_on));
        }
    }
}
