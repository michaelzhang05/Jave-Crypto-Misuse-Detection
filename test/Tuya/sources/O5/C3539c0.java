package o5;

import E4.j;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.util.views.UsernameTextView;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3307A;

/* renamed from: o5.c0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3539c0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final Context f36738a;

    /* renamed from: b, reason: collision with root package name */
    private final W4.z f36739b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f36740c;

    /* renamed from: d, reason: collision with root package name */
    private final UsernameTextView f36741d;

    /* renamed from: e, reason: collision with root package name */
    private final ImageView f36742e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f36743f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f36744g;

    /* renamed from: h, reason: collision with root package name */
    private final LinearLayout f36745h;

    /* renamed from: i, reason: collision with root package name */
    private final ImageView f36746i;

    /* renamed from: j, reason: collision with root package name */
    private final TextView f36747j;

    /* renamed from: k, reason: collision with root package name */
    private final ImageView f36748k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3539c0(View itemView, Context context, W4.z listener) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        this.f36738a = context;
        this.f36739b = listener;
        View findViewById = itemView.findViewById(R.id.iv_avatar_review);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.iv_avatar_review)");
        this.f36740c = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_username_review);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.tv_username_review)");
        UsernameTextView usernameTextView = (UsernameTextView) findViewById2;
        this.f36741d = usernameTextView;
        View findViewById3 = itemView.findViewById(R.id.iv_author_verified_review);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.…v_author_verified_review)");
        this.f36742e = (ImageView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_date_review);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.id.tv_date_review)");
        TextView textView = (TextView) findViewById4;
        this.f36743f = textView;
        View findViewById5 = itemView.findViewById(R.id.tv_body_review);
        AbstractC3159y.h(findViewById5, "itemView.findViewById(R.id.tv_body_review)");
        TextView textView2 = (TextView) findViewById5;
        this.f36744g = textView2;
        View findViewById6 = itemView.findViewById(R.id.ll_likes_review);
        AbstractC3159y.h(findViewById6, "itemView.findViewById(R.id.ll_likes_review)");
        this.f36745h = (LinearLayout) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.iv_likes_counter_review);
        AbstractC3159y.h(findViewById7, "itemView.findViewById(R.….iv_likes_counter_review)");
        this.f36746i = (ImageView) findViewById7;
        View findViewById8 = itemView.findViewById(R.id.tv_likes_counter_review);
        AbstractC3159y.h(findViewById8, "itemView.findViewById(R.….tv_likes_counter_review)");
        TextView textView3 = (TextView) findViewById8;
        this.f36747j = textView3;
        View findViewById9 = itemView.findViewById(R.id.iv_turbo_mark_review);
        AbstractC3159y.h(findViewById9, "itemView.findViewById(R.id.iv_turbo_mark_review)");
        ImageView imageView = (ImageView) findViewById9;
        this.f36748k = imageView;
        j.a aVar = E4.j.f2274g;
        usernameTextView.setTypeface(aVar.t());
        textView.setTypeface(aVar.u());
        textView2.setTypeface(aVar.u());
        textView3.setTypeface(aVar.u());
        imageView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C3539c0 this$0, X4.G item, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(item, "$item");
        n5.k.a(this$0.f36738a, this$0.f36746i);
        if (!C3307A.f34473a.h(item.e())) {
            this$0.f36739b.a(item);
            this$0.f36747j.setText(String.valueOf(item.f() + 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C3539c0 this$0, X4.G item, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(item, "$item");
        W4.z zVar = this$0.f36739b;
        String k8 = item.k();
        AbstractC3159y.f(k8);
        zVar.b(k8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C3539c0 this$0, X4.G item, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(item, "$item");
        W4.z zVar = this$0.f36739b;
        String k8 = item.k();
        AbstractC3159y.f(k8);
        zVar.b(k8);
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
    public final void d(final X4.G r6) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.C3539c0.d(X4.G):void");
    }
}
