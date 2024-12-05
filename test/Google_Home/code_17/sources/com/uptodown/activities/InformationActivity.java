package com.uptodown.activities;

import H4.j;
import O5.InterfaceC1355k;
import a5.C1646m;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.uptodown.R;
import com.uptodown.activities.InformationActivity;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o5.C3671k;

/* loaded from: classes4.dex */
public final class InformationActivity extends AbstractActivityC2683a {

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1355k f29383N = O5.l.b(new a());

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W4.I invoke() {
            return W4.I.c(InformationActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends ClickableSpan {
        b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3255y.i(widget, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3255y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(InformationActivity.this, R.color.main_blue));
            ds.setTypeface(H4.j.f3824g.t());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f29386a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(j6.h it) {
            AbstractC3255y.i(it, "it");
            return (CharSequence) it.a().get(1);
        }
    }

    private final W4.I a3() {
        return (W4.I) this.f29383N.getValue();
    }

    private final void b3() {
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            a3().f11799c.setNavigationIcon(drawable);
            a3().f11799c.setNavigationContentDescription(getString(R.string.back));
        }
        a3().f11799c.setNavigationOnClickListener(new View.OnClickListener() { // from class: D4.P
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationActivity.c3(InformationActivity.this, view);
            }
        });
        TextView textView = a3().f11806j;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        a3().f11800d.setTypeface(aVar.u());
        a3().f11801e.setTypeface(aVar.u());
        a3().f11802f.setTypeface(aVar.u());
        a3().f11804h.setTypeface(aVar.u());
        a3().f11805i.setTypeface(aVar.u());
        a3().f11803g.setTypeface(aVar.u());
        TextView textView2 = a3().f11803g;
        String string = getString(R.string.information_activity_dev_on_board_more_info);
        AbstractC3255y.h(string, "getString(R.string.infor…y_dev_on_board_more_info)");
        textView2.setText(e3(string));
        a3().f11803g.setOnClickListener(new View.OnClickListener() { // from class: D4.Q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationActivity.d3(InformationActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c3(InformationActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d3(InformationActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        String string = this$0.getString(R.string.url_dev_on_board);
        AbstractC3255y.h(string, "getString(R.string.url_dev_on_board)");
        String string2 = this$0.getString(R.string.support_title);
        AbstractC3255y.h(string2, "getString(R.string.support_title)");
        new C3671k().q(this$0, string, string2);
    }

    private final SpannableStringBuilder e3(String str) {
        List<C1646m> a8 = C1646m.f14265f.a(str, "\\[a](.*?)\\[/a]");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(new j6.j("\\[a](.*?)\\[/a]").g(str, c.f29386a));
        for (C1646m c1646m : a8) {
            int S8 = j6.n.S(spannableStringBuilder, c1646m.d(), 0, false, 6, null);
            int length = c1646m.d().length() + S8;
            if (S8 >= 0) {
                spannableStringBuilder.setSpan(new b(), S8, length, 33);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(a3().getRoot());
        b3();
    }
}
