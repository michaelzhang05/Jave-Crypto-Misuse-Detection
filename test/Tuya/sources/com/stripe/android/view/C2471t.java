package com.stripe.android.view;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import j2.AbstractC3053E;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: com.stripe.android.view.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2471t {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27957a;

    public C2471t(Context context) {
        AbstractC3159y.i(context, "context");
        this.f27957a = context;
    }

    public final CharSequence a(String companyName) {
        Spanned fromHtml;
        AbstractC3159y.i(companyName, "companyName");
        String string = this.f27957a.getString(AbstractC3053E.f32852M, companyName);
        AbstractC3159y.h(string, "getString(...)");
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(string, 0);
            AbstractC3159y.f(fromHtml);
            return fromHtml;
        }
        Spanned fromHtml2 = Html.fromHtml(string);
        AbstractC3159y.f(fromHtml2);
        return fromHtml2;
    }
}
