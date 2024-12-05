package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import kotlin.jvm.internal.AbstractC3255y;
import m2.AbstractC3404B;

/* loaded from: classes4.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    private final N0 f28633a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28634b;

    /* renamed from: c, reason: collision with root package name */
    private final int f28635c;

    /* renamed from: d, reason: collision with root package name */
    private final int f28636d;

    /* renamed from: e, reason: collision with root package name */
    private final int f28637e;

    /* renamed from: f, reason: collision with root package name */
    private final int f28638f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f28639g;

    public S0(Context context) {
        AbstractC3255y.i(context, "context");
        N0 n02 = new N0(context);
        this.f28633a = n02;
        int a8 = a(context, n02.a(), m2.x.f35074a);
        this.f28634b = a8;
        this.f28635c = a(context, n02.b(), m2.x.f35078e);
        int a9 = a(context, n02.e(), m2.x.f35075b);
        this.f28636d = a9;
        Resources resources = context.getResources();
        int i8 = AbstractC3404B.f34777b;
        int alphaComponent = ColorUtils.setAlphaComponent(a8, resources.getInteger(i8));
        this.f28637e = alphaComponent;
        int alphaComponent2 = ColorUtils.setAlphaComponent(a9, context.getResources().getInteger(i8));
        this.f28638f = alphaComponent2;
        this.f28639g = new int[]{a8, alphaComponent, a9, alphaComponent2};
    }

    private final int a(Context context, int i8, int i9) {
        if (N0.f28491g.b(i8)) {
            return ContextCompat.getColor(context, i9);
        }
        return i8;
    }

    public final int b(boolean z8) {
        if (z8) {
            return this.f28637e;
        }
        return this.f28638f;
    }

    public final int c(boolean z8) {
        if (z8) {
            return this.f28634b;
        }
        return this.f28636d;
    }

    public final int d(boolean z8) {
        if (z8) {
            return this.f28634b;
        }
        return this.f28635c;
    }
}
