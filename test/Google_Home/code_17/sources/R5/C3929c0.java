package r5;

import H4.j;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.util.views.UsernameTextView;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3655A;

/* renamed from: r5.c0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3929c0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final Context f38946a;

    /* renamed from: b, reason: collision with root package name */
    private final Z4.z f38947b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f38948c;

    /* renamed from: d, reason: collision with root package name */
    private final UsernameTextView f38949d;

    /* renamed from: e, reason: collision with root package name */
    private final ImageView f38950e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f38951f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f38952g;

    /* renamed from: h, reason: collision with root package name */
    private final LinearLayout f38953h;

    /* renamed from: i, reason: collision with root package name */
    private final ImageView f38954i;

    /* renamed from: j, reason: collision with root package name */
    private final TextView f38955j;

    /* renamed from: k, reason: collision with root package name */
    private final ImageView f38956k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3929c0(View itemView, Context context, Z4.z listener) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(listener, "listener");
        this.f38946a = context;
        this.f38947b = listener;
        View findViewById = itemView.findViewById(R.id.iv_avatar_review);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.id.iv_avatar_review)");
        this.f38948c = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_username_review);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.id.tv_username_review)");
        UsernameTextView usernameTextView = (UsernameTextView) findViewById2;
        this.f38949d = usernameTextView;
        View findViewById3 = itemView.findViewById(R.id.iv_author_verified_review);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.…v_author_verified_review)");
        this.f38950e = (ImageView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_date_review);
        AbstractC3255y.h(findViewById4, "itemView.findViewById(R.id.tv_date_review)");
        TextView textView = (TextView) findViewById4;
        this.f38951f = textView;
        View findViewById5 = itemView.findViewById(R.id.tv_body_review);
        AbstractC3255y.h(findViewById5, "itemView.findViewById(R.id.tv_body_review)");
        TextView textView2 = (TextView) findViewById5;
        this.f38952g = textView2;
        View findViewById6 = itemView.findViewById(R.id.ll_likes_review);
        AbstractC3255y.h(findViewById6, "itemView.findViewById(R.id.ll_likes_review)");
        this.f38953h = (LinearLayout) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.iv_likes_counter_review);
        AbstractC3255y.h(findViewById7, "itemView.findViewById(R.….iv_likes_counter_review)");
        this.f38954i = (ImageView) findViewById7;
        View findViewById8 = itemView.findViewById(R.id.tv_likes_counter_review);
        AbstractC3255y.h(findViewById8, "itemView.findViewById(R.….tv_likes_counter_review)");
        TextView textView3 = (TextView) findViewById8;
        this.f38955j = textView3;
        View findViewById9 = itemView.findViewById(R.id.iv_turbo_mark_review);
        AbstractC3255y.h(findViewById9, "itemView.findViewById(R.id.iv_turbo_mark_review)");
        ImageView imageView = (ImageView) findViewById9;
        this.f38956k = imageView;
        j.a aVar = H4.j.f3824g;
        usernameTextView.setTypeface(aVar.t());
        textView.setTypeface(aVar.u());
        textView2.setTypeface(aVar.u());
        textView3.setTypeface(aVar.u());
        imageView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C3929c0 this$0, a5.G item, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(item, "$item");
        q5.k.a(this$0.f38946a, this$0.f38954i);
        if (!C3655A.f36474a.h(item.g())) {
            this$0.f38947b.b(item);
            this$0.f38955j.setText(String.valueOf(item.h() + 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C3929c0 this$0, a5.G item, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(item, "$item");
        Z4.z zVar = this$0.f38947b;
        String p8 = item.p();
        AbstractC3255y.f(p8);
        zVar.a(p8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C3929c0 this$0, a5.G item, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(item, "$item");
        Z4.z zVar = this$0.f38947b;
        String p8 = item.p();
        AbstractC3255y.f(p8);
        zVar.a(p8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(final a5.G r6) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.C3929c0.d(a5.G):void");
    }
}
