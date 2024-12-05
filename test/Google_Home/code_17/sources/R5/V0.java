package r5;

import H4.j;
import a5.Q;
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
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3655A;

/* loaded from: classes5.dex */
public final class V0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final Z4.H f38878a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f38879b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f38880c;

    /* renamed from: d, reason: collision with root package name */
    private final ImageView f38881d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f38882e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f38883f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f38884g;

    /* renamed from: h, reason: collision with root package name */
    private final TextView f38885h;

    /* renamed from: i, reason: collision with root package name */
    private final LinearLayout f38886i;

    /* renamed from: j, reason: collision with root package name */
    private final LinearLayout f38887j;

    /* renamed from: k, reason: collision with root package name */
    private final TextView f38888k;

    /* renamed from: l, reason: collision with root package name */
    private final ImageView f38889l;

    /* renamed from: m, reason: collision with root package name */
    private final ImageView f38890m;

    /* renamed from: n, reason: collision with root package name */
    private final ImageView f38891n;

    /* renamed from: o, reason: collision with root package name */
    private final ImageView f38892o;

    /* renamed from: p, reason: collision with root package name */
    private final ImageView f38893p;

    /* renamed from: q, reason: collision with root package name */
    private final ImageView f38894q;

    /* loaded from: classes5.dex */
    public static final class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            V0.this.f38883f.getViewTreeObserver().removeOnPreDrawListener(this);
            if (q5.v.a(V0.this.f38883f)) {
                V0.this.f38884g.setVisibility(0);
                V0.this.f38884g.setTypeface(H4.j.f3824g.t());
                return true;
            }
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(View itemView, Z4.H listener, Context context) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(context, "context");
        this.f38878a = listener;
        this.f38879b = context;
        View findViewById = itemView.findViewById(R.id.tv_username_review);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.id.tv_username_review)");
        TextView textView = (TextView) findViewById;
        this.f38880c = textView;
        View findViewById2 = itemView.findViewById(R.id.iv_avatar_review);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.id.iv_avatar_review)");
        this.f38881d = (ImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.tv_date_review);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.id.tv_date_review)");
        TextView textView2 = (TextView) findViewById3;
        this.f38882e = textView2;
        View findViewById4 = itemView.findViewById(R.id.tv_body_review);
        AbstractC3255y.h(findViewById4, "itemView.findViewById(R.id.tv_body_review)");
        TextView textView3 = (TextView) findViewById4;
        this.f38883f = textView3;
        View findViewById5 = itemView.findViewById(R.id.tv_show_more_review);
        AbstractC3255y.h(findViewById5, "itemView.findViewById(R.id.tv_show_more_review)");
        this.f38884g = (TextView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.tv_likes_counter_review);
        AbstractC3255y.h(findViewById6, "itemView.findViewById(R.….tv_likes_counter_review)");
        TextView textView4 = (TextView) findViewById6;
        this.f38885h = textView4;
        View findViewById7 = itemView.findViewById(R.id.ll_likes_review);
        AbstractC3255y.h(findViewById7, "itemView.findViewById(R.id.ll_likes_review)");
        this.f38886i = (LinearLayout) findViewById7;
        View findViewById8 = itemView.findViewById(R.id.ll_reviews_counter_review);
        AbstractC3255y.h(findViewById8, "itemView.findViewById(R.…l_reviews_counter_review)");
        this.f38887j = (LinearLayout) findViewById8;
        View findViewById9 = itemView.findViewById(R.id.tv_reviews_counter_review);
        AbstractC3255y.h(findViewById9, "itemView.findViewById(R.…v_reviews_counter_review)");
        TextView textView5 = (TextView) findViewById9;
        this.f38888k = textView5;
        View findViewById10 = itemView.findViewById(R.id.iv_likes_counter_review);
        AbstractC3255y.h(findViewById10, "itemView.findViewById(R.….iv_likes_counter_review)");
        this.f38889l = (ImageView) findViewById10;
        View findViewById11 = itemView.findViewById(R.id.iv_star1_review);
        AbstractC3255y.h(findViewById11, "itemView.findViewById(R.id.iv_star1_review)");
        this.f38890m = (ImageView) findViewById11;
        View findViewById12 = itemView.findViewById(R.id.iv_star2_review);
        AbstractC3255y.h(findViewById12, "itemView.findViewById(R.id.iv_star2_review)");
        this.f38891n = (ImageView) findViewById12;
        View findViewById13 = itemView.findViewById(R.id.iv_star3_review);
        AbstractC3255y.h(findViewById13, "itemView.findViewById(R.id.iv_star3_review)");
        this.f38892o = (ImageView) findViewById13;
        View findViewById14 = itemView.findViewById(R.id.iv_star4_review);
        AbstractC3255y.h(findViewById14, "itemView.findViewById(R.id.iv_star4_review)");
        this.f38893p = (ImageView) findViewById14;
        View findViewById15 = itemView.findViewById(R.id.iv_star5_review);
        AbstractC3255y.h(findViewById15, "itemView.findViewById(R.id.iv_star5_review)");
        this.f38894q = (ImageView) findViewById15;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        textView2.setTypeface(aVar.u());
        textView3.setTypeface(aVar.u());
        textView4.setTypeface(aVar.u());
        textView5.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(V0 this$0, int i8, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f38878a.c(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(V0 this$0, int i8, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f38878a.c(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(V0 this$0, a5.K item, int i8, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(item, "$item");
        q5.k.a(this$0.f38879b, this$0.f38889l);
        if (!C3655A.f36474a.i(item.l())) {
            this$0.f38878a.b(i8);
            this$0.f38885h.setText(String.valueOf(item.p() + 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(V0 this$0, int i8, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f38878a.a(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(V0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.f38883f.getMaxLines() == Integer.MAX_VALUE) {
            this$0.f38883f.setMaxLines(4);
            this$0.f38884g.setText(this$0.f38879b.getString(R.string.read_more_desc_app_detail));
        } else {
            this$0.f38883f.setMaxLines(Integer.MAX_VALUE);
            this$0.f38884g.setText(this$0.f38879b.getString(R.string.read_less_desc_app_detail));
        }
    }

    public final void h(final a5.K item, final int i8) {
        CharSequence charSequence;
        AbstractC3255y.i(item, "item");
        String g8 = item.g();
        if (g8 != null && g8.length() != 0) {
            this.f38880c.setText(item.g());
        }
        Q.b bVar = a5.Q.f14058k;
        if (bVar.c(item.i()) != null) {
            com.squareup.picasso.s.h().l(bVar.c(item.i())).n(UptodownApp.f29058B.f0(this.f38879b)).i(this.f38881d);
        } else {
            com.squareup.picasso.s.h().j(R.drawable.vector_user_default).n(UptodownApp.f29058B.f0(this.f38879b)).i(this.f38881d);
        }
        if (item.w() != null) {
            this.f38882e.setText(item.w());
        }
        Spanned v8 = item.v();
        if (v8 != null && v8.length() != 0) {
            this.f38883f.setText(item.v());
            this.f38883f.setVisibility(0);
            this.f38886i.setVisibility(0);
            this.f38887j.setVisibility(0);
        } else {
            this.f38883f.setVisibility(8);
            this.f38886i.setVisibility(8);
            this.f38887j.setVisibility(8);
        }
        this.f38885h.setText(String.valueOf(item.p()));
        if (C3655A.f36474a.i(item.l())) {
            this.f38889l.setImageDrawable(ContextCompat.getDrawable(this.f38879b, R.drawable.vector_heart_red));
        } else {
            this.f38889l.setImageDrawable(ContextCompat.getDrawable(this.f38879b, R.drawable.vector_heart));
        }
        if (item.a() == 0) {
            this.f38888k.setText(this.f38879b.getString(R.string.reply));
        } else if (item.a() == 1) {
            TextView textView = this.f38888k;
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34167a;
            String string = this.f38879b.getString(R.string.replies_counter_single);
            AbstractC3255y.h(string, "context.getString(R.string.replies_counter_single)");
            String format = String.format(string, Arrays.copyOf(new Object[0], 0));
            AbstractC3255y.h(format, "format(...)");
            textView.setText(format);
        } else if (item.a() > 1) {
            TextView textView2 = this.f38888k;
            kotlin.jvm.internal.Y y9 = kotlin.jvm.internal.Y.f34167a;
            String string2 = this.f38879b.getString(R.string.replies_counter_multiple);
            AbstractC3255y.h(string2, "context.getString(R.stri…replies_counter_multiple)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(item.a())}, 1));
            AbstractC3255y.h(format2, "format(...)");
            textView2.setText(format2);
        }
        this.f38880c.setOnClickListener(new View.OnClickListener() { // from class: r5.Q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V0.i(V0.this, i8, view);
            }
        });
        this.f38881d.setOnClickListener(new View.OnClickListener() { // from class: r5.R0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V0.j(V0.this, i8, view);
            }
        });
        this.f38886i.setOnClickListener(new View.OnClickListener() { // from class: r5.S0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V0.k(V0.this, item, i8, view);
            }
        });
        this.f38887j.setOnClickListener(new View.OnClickListener() { // from class: r5.T0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V0.l(V0.this, i8, view);
            }
        });
        TextView textView3 = this.f38883f;
        Spanned v9 = item.v();
        if (v9 != null) {
            charSequence = j6.n.M0(v9);
        } else {
            charSequence = null;
        }
        textView3.setText(charSequence);
        this.f38883f.getViewTreeObserver().addOnPreDrawListener(new a());
        this.f38884g.setOnClickListener(new View.OnClickListener() { // from class: r5.U0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V0.m(V0.this, view);
            }
        });
        this.f38890m.setImageDrawable(ContextCompat.getDrawable(this.f38879b, R.drawable.vector_star_on));
        this.f38891n.setImageDrawable(ContextCompat.getDrawable(this.f38879b, R.drawable.vector_star_off));
        this.f38892o.setImageDrawable(ContextCompat.getDrawable(this.f38879b, R.drawable.vector_star_off));
        this.f38893p.setImageDrawable(ContextCompat.getDrawable(this.f38879b, R.drawable.vector_star_off));
        this.f38894q.setImageDrawable(ContextCompat.getDrawable(this.f38879b, R.drawable.vector_star_off));
        if (item.s() >= 2) {
            this.f38891n.setImageDrawable(ContextCompat.getDrawable(this.f38879b, R.drawable.vector_star_on));
        }
        if (item.s() >= 3) {
            this.f38892o.setImageDrawable(ContextCompat.getDrawable(this.f38879b, R.drawable.vector_star_on));
        }
        if (item.s() >= 4) {
            this.f38893p.setImageDrawable(ContextCompat.getDrawable(this.f38879b, R.drawable.vector_star_on));
        }
        if (item.s() == 5) {
            this.f38894q.setImageDrawable(ContextCompat.getDrawable(this.f38879b, R.drawable.vector_star_on));
        }
    }
}
