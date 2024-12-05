package com.stripe.android.view;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import kotlin.jvm.internal.AbstractC3255y;
import m2.AbstractC3407E;

/* renamed from: com.stripe.android.view.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2665t {

    /* renamed from: a, reason: collision with root package name */
    private final Context f29012a;

    public C2665t(Context context) {
        AbstractC3255y.i(context, "context");
        this.f29012a = context;
    }

    public final CharSequence a(String companyName) {
        Spanned fromHtml;
        AbstractC3255y.i(companyName, "companyName");
        String string = this.f29012a.getString(AbstractC3407E.f34828M, companyName);
        AbstractC3255y.h(string, "getString(...)");
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(string, 0);
            AbstractC3255y.f(fromHtml);
            return fromHtml;
        }
        Spanned fromHtml2 = Html.fromHtml(string);
        AbstractC3255y.f(fromHtml2);
        return fromHtml2;
    }
}
