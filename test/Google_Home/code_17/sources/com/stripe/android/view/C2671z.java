package com.stripe.android.view;

import android.content.res.Resources;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.stripe.android.model.o;
import e3.EnumC2791e;
import kotlin.jvm.internal.AbstractC3255y;
import m2.AbstractC3407E;

/* renamed from: com.stripe.android.view.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2671z {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f29054a;

    /* renamed from: b, reason: collision with root package name */
    private final S0 f29055b;

    public C2671z(Resources resources, S0 themeConfig) {
        AbstractC3255y.i(resources, "resources");
        AbstractC3255y.i(themeConfig, "themeConfig");
        this.f29054a = resources;
        this.f29055b = themeConfig;
    }

    private final void c(SpannableString spannableString, ParcelableSpan parcelableSpan, int i8, int i9) {
        spannableString.setSpan(parcelableSpan, i8, i9, 33);
    }

    public final /* synthetic */ SpannableString a(EnumC2791e brand, String str, boolean z8) {
        AbstractC3255y.i(brand, "brand");
        String h8 = brand.h();
        int length = h8.length();
        if (str != null && !j6.n.u(str)) {
            String string = this.f29054a.getString(AbstractC3407E.f34843Z, h8, str);
            AbstractC3255y.h(string, "getString(...)");
            int length2 = string.length();
            int S8 = j6.n.S(string, str, 0, false, 6, null);
            int length3 = str.length() + S8;
            int S9 = j6.n.S(string, h8, 0, false, 6, null);
            int length4 = h8.length() + S9;
            int c8 = this.f29055b.c(z8);
            int b8 = this.f29055b.b(z8);
            SpannableString spannableString = new SpannableString(string);
            c(spannableString, new ForegroundColorSpan(b8), 0, length2);
            c(spannableString, new TypefaceSpan("sans-serif-medium"), S9, length4);
            c(spannableString, new ForegroundColorSpan(c8), S9, length4);
            c(spannableString, new TypefaceSpan("sans-serif-medium"), S8, length3);
            c(spannableString, new ForegroundColorSpan(c8), S8, length3);
            return spannableString;
        }
        SpannableString spannableString2 = new SpannableString(h8);
        c(spannableString2, new TypefaceSpan("sans-serif-medium"), 0, length);
        return spannableString2;
    }

    public final /* synthetic */ String b(o.g card) {
        AbstractC3255y.i(card, "card");
        String string = this.f29054a.getString(AbstractC3407E.f34843Z, card.f25530a.h(), card.f25537h);
        AbstractC3255y.h(string, "getString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2671z(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.AbstractC3255y.i(r3, r0)
            android.content.res.Resources r0 = r3.getResources()
            java.lang.String r1 = "getResources(...)"
            kotlin.jvm.internal.AbstractC3255y.h(r0, r1)
            com.stripe.android.view.S0 r1 = new com.stripe.android.view.S0
            r1.<init>(r3)
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2671z.<init>(android.content.Context):void");
    }
}
