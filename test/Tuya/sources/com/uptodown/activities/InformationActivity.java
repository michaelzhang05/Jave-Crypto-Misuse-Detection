package com.uptodown.activities;

import E4.j;
import L5.InterfaceC1227k;
import X4.C1503m;
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
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l5.C3323k;

/* loaded from: classes4.dex */
public final class InformationActivity extends AbstractActivityC2489a {

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1227k f28298N = L5.l.b(new a());

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T4.I invoke() {
            return T4.I.c(InformationActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends ClickableSpan {
        b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3159y.i(widget, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3159y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(InformationActivity.this, R.color.main_blue));
            ds.setTypeface(E4.j.f2274g.t());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f28301a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(g6.h it) {
            AbstractC3159y.i(it, "it");
            return (CharSequence) it.a().get(1);
        }
    }

    private final T4.I a3() {
        return (T4.I) this.f28298N.getValue();
    }

    private final void b3() {
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            a3().f10142c.setNavigationIcon(drawable);
            a3().f10142c.setNavigationContentDescription(getString(R.string.back));
        }
        a3().f10142c.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.P
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationActivity.c3(InformationActivity.this, view);
            }
        });
        TextView textView = a3().f10149j;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        a3().f10143d.setTypeface(aVar.u());
        a3().f10144e.setTypeface(aVar.u());
        a3().f10145f.setTypeface(aVar.u());
        a3().f10147h.setTypeface(aVar.u());
        a3().f10148i.setTypeface(aVar.u());
        a3().f10146g.setTypeface(aVar.u());
        TextView textView2 = a3().f10146g;
        String string = getString(R.string.information_activity_dev_on_board_more_info);
        AbstractC3159y.h(string, "getString(R.string.infor…y_dev_on_board_more_info)");
        textView2.setText(e3(string));
        a3().f10146g.setOnClickListener(new View.OnClickListener() { // from class: A4.Q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationActivity.d3(InformationActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c3(InformationActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d3(InformationActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        String string = this$0.getString(R.string.url_dev_on_board);
        AbstractC3159y.h(string, "getString(R.string.url_dev_on_board)");
        String string2 = this$0.getString(R.string.support_title);
        AbstractC3159y.h(string2, "getString(R.string.support_title)");
        new C3323k().q(this$0, string, string2);
    }

    private final SpannableStringBuilder e3(String str) {
        List<C1503m> a8 = C1503m.f12644f.a(str, "\\[a](.*?)\\[/a]");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(new g6.j("\\[a](.*?)\\[/a]").g(str, c.f28301a));
        for (C1503m c1503m : a8) {
            int S7 = g6.n.S(spannableStringBuilder, c1503m.d(), 0, false, 6, null);
            int length = c1503m.d().length() + S7;
            if (S7 >= 0) {
                spannableStringBuilder.setSpan(new b(), S7, length, 33);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(a3().getRoot());
        b3();
    }
}
