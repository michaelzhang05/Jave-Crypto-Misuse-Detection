package r5;

import H4.j;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.util.views.UsernameTextView;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3655A;
import o5.C3671k;

/* renamed from: r5.h0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3939h0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final Context f38997a;

    /* renamed from: b, reason: collision with root package name */
    private final Z4.A f38998b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f38999c;

    /* renamed from: d, reason: collision with root package name */
    private final UsernameTextView f39000d;

    /* renamed from: e, reason: collision with root package name */
    private final ImageView f39001e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f39002f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f39003g;

    /* renamed from: h, reason: collision with root package name */
    private final TextView f39004h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f39005i;

    /* renamed from: j, reason: collision with root package name */
    private final ImageView f39006j;

    /* renamed from: k, reason: collision with root package name */
    private final LinearLayout f39007k;

    /* renamed from: l, reason: collision with root package name */
    private final LinearLayout f39008l;

    /* renamed from: m, reason: collision with root package name */
    private final ImageView f39009m;

    /* renamed from: n, reason: collision with root package name */
    private final ImageView f39010n;

    /* renamed from: o, reason: collision with root package name */
    private final ImageView f39011o;

    /* renamed from: p, reason: collision with root package name */
    private final ImageView f39012p;

    /* renamed from: q, reason: collision with root package name */
    private final ImageView f39013q;

    /* renamed from: r, reason: collision with root package name */
    private final ImageView f39014r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3939h0(View itemView, Context context, Z4.A listener) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(listener, "listener");
        this.f38997a = context;
        this.f38998b = listener;
        View findViewById = itemView.findViewById(R.id.iv_avatar_review);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.id.iv_avatar_review)");
        this.f38999c = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_username_review);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.id.tv_username_review)");
        UsernameTextView usernameTextView = (UsernameTextView) findViewById2;
        this.f39000d = usernameTextView;
        View findViewById3 = itemView.findViewById(R.id.iv_author_verified_review);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.…v_author_verified_review)");
        this.f39001e = (ImageView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_date_review);
        AbstractC3255y.h(findViewById4, "itemView.findViewById(R.id.tv_date_review)");
        TextView textView = (TextView) findViewById4;
        this.f39002f = textView;
        View findViewById5 = itemView.findViewById(R.id.tv_body_review);
        AbstractC3255y.h(findViewById5, "itemView.findViewById(R.id.tv_body_review)");
        TextView textView2 = (TextView) findViewById5;
        this.f39003g = textView2;
        View findViewById6 = itemView.findViewById(R.id.tv_reviews_counter_review);
        AbstractC3255y.h(findViewById6, "itemView.findViewById(R.…v_reviews_counter_review)");
        TextView textView3 = (TextView) findViewById6;
        this.f39004h = textView3;
        View findViewById7 = itemView.findViewById(R.id.tv_likes_counter_review);
        AbstractC3255y.h(findViewById7, "itemView.findViewById(R.….tv_likes_counter_review)");
        TextView textView4 = (TextView) findViewById7;
        this.f39005i = textView4;
        View findViewById8 = itemView.findViewById(R.id.iv_likes_counter_review);
        AbstractC3255y.h(findViewById8, "itemView.findViewById(R.….iv_likes_counter_review)");
        this.f39006j = (ImageView) findViewById8;
        View findViewById9 = itemView.findViewById(R.id.ll_reviews_counter_review);
        AbstractC3255y.h(findViewById9, "itemView.findViewById(R.…l_reviews_counter_review)");
        this.f39007k = (LinearLayout) findViewById9;
        View findViewById10 = itemView.findViewById(R.id.ll_likes_review);
        AbstractC3255y.h(findViewById10, "itemView.findViewById(R.id.ll_likes_review)");
        this.f39008l = (LinearLayout) findViewById10;
        View findViewById11 = itemView.findViewById(R.id.iv_star1_review);
        AbstractC3255y.h(findViewById11, "itemView.findViewById(R.id.iv_star1_review)");
        this.f39009m = (ImageView) findViewById11;
        View findViewById12 = itemView.findViewById(R.id.iv_star2_review);
        AbstractC3255y.h(findViewById12, "itemView.findViewById(R.id.iv_star2_review)");
        this.f39010n = (ImageView) findViewById12;
        View findViewById13 = itemView.findViewById(R.id.iv_star3_review);
        AbstractC3255y.h(findViewById13, "itemView.findViewById(R.id.iv_star3_review)");
        this.f39011o = (ImageView) findViewById13;
        View findViewById14 = itemView.findViewById(R.id.iv_star4_review);
        AbstractC3255y.h(findViewById14, "itemView.findViewById(R.id.iv_star4_review)");
        this.f39012p = (ImageView) findViewById14;
        View findViewById15 = itemView.findViewById(R.id.iv_star5_review);
        AbstractC3255y.h(findViewById15, "itemView.findViewById(R.id.iv_star5_review)");
        this.f39013q = (ImageView) findViewById15;
        View findViewById16 = itemView.findViewById(R.id.iv_turbo_mark_review);
        AbstractC3255y.h(findViewById16, "itemView.findViewById(R.id.iv_turbo_mark_review)");
        ImageView imageView = (ImageView) findViewById16;
        this.f39014r = imageView;
        j.a aVar = H4.j.f3824g;
        usernameTextView.setTypeface(aVar.t());
        textView.setTypeface(aVar.u());
        textView2.setTypeface(aVar.u());
        textView3.setTypeface(aVar.u());
        textView4.setTypeface(aVar.u());
        imageView.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g(final a5.K r8, final int r9) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.C3939h0.g(a5.K, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(C3939h0 this$0, int i8, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f38998b.d(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C3939h0 this$0, int i8, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f38998b.d(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(C3939h0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(view, "view");
        Z4.A a8 = this$0.f38998b;
        Object tag = view.getTag();
        AbstractC3255y.g(tag, "null cannot be cast to non-null type kotlin.Int");
        a8.f(((Integer) tag).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(C3939h0 this$0, a5.K item, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(item, "$item");
        AbstractC3255y.i(view, "view");
        q5.k.a(this$0.f38997a, this$0.f39006j);
        if (!C3655A.f36474a.i(item.l())) {
            Z4.A a8 = this$0.f38998b;
            Object tag = view.getTag();
            AbstractC3255y.g(tag, "null cannot be cast to non-null type kotlin.Int");
            a8.b(((Integer) tag).intValue());
            this$0.f39005i.setText(String.valueOf(item.p() + 1));
        }
    }

    public final void e(a5.K item, int i8) {
        AbstractC3255y.i(item, "item");
        g(item, i8);
        this.f39009m.setImageDrawable(ContextCompat.getDrawable(this.f38997a, R.drawable.vector_star_on));
        this.f39010n.setImageDrawable(ContextCompat.getDrawable(this.f38997a, R.drawable.vector_star_off));
        this.f39011o.setImageDrawable(ContextCompat.getDrawable(this.f38997a, R.drawable.vector_star_off));
        this.f39012p.setImageDrawable(ContextCompat.getDrawable(this.f38997a, R.drawable.vector_star_off));
        this.f39013q.setImageDrawable(ContextCompat.getDrawable(this.f38997a, R.drawable.vector_star_off));
        if (item.s() >= 2) {
            this.f39010n.setImageDrawable(ContextCompat.getDrawable(this.f38997a, R.drawable.vector_star_on));
        }
        if (item.s() >= 3) {
            this.f39011o.setImageDrawable(ContextCompat.getDrawable(this.f38997a, R.drawable.vector_star_on));
        }
        if (item.s() >= 4) {
            this.f39012p.setImageDrawable(ContextCompat.getDrawable(this.f38997a, R.drawable.vector_star_on));
        }
        if (item.s() == 5) {
            this.f39013q.setImageDrawable(ContextCompat.getDrawable(this.f38997a, R.drawable.vector_star_on));
        }
    }

    public final void f(a5.K item, int i8) {
        AbstractC3255y.i(item, "item");
        g(item, i8);
        this.f39009m.setImageDrawable(ContextCompat.getDrawable(this.f38997a, R.drawable.vector_star_on_turbo));
        this.f39010n.setImageDrawable(ContextCompat.getDrawable(this.f38997a, R.drawable.vector_star_off_turbo));
        this.f39011o.setImageDrawable(ContextCompat.getDrawable(this.f38997a, R.drawable.vector_star_off_turbo));
        this.f39012p.setImageDrawable(ContextCompat.getDrawable(this.f38997a, R.drawable.vector_star_off_turbo));
        this.f39013q.setImageDrawable(ContextCompat.getDrawable(this.f38997a, R.drawable.vector_star_off_turbo));
        if (item.s() >= 2) {
            this.f39010n.setImageDrawable(ContextCompat.getDrawable(this.f38997a, R.drawable.vector_star_on_turbo));
        }
        if (item.s() >= 3) {
            this.f39011o.setImageDrawable(ContextCompat.getDrawable(this.f38997a, R.drawable.vector_star_on_turbo));
        }
        if (item.s() >= 4) {
            this.f39012p.setImageDrawable(ContextCompat.getDrawable(this.f38997a, R.drawable.vector_star_on_turbo));
        }
        if (item.s() == 5) {
            this.f39013q.setImageDrawable(ContextCompat.getDrawable(this.f38997a, R.drawable.vector_star_on_turbo));
        }
        this.f39014r.setVisibility(0);
        C3671k.f36498a.a(this.f38999c);
    }
}
