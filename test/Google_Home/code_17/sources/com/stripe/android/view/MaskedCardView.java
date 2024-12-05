package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import e3.EnumC2791e;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class MaskedCardView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private EnumC2791e f28484a;

    /* renamed from: b, reason: collision with root package name */
    private String f28485b;

    /* renamed from: c, reason: collision with root package name */
    private final J2.n f28486c;

    /* renamed from: d, reason: collision with root package name */
    private final S0 f28487d;

    /* renamed from: e, reason: collision with root package name */
    private final C2671z f28488e;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28489a;

        static {
            int[] iArr = new int[EnumC2791e.values().length];
            try {
                iArr[EnumC2791e.f31446q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2791e.f31447r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2791e.f31448s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC2791e.f31449t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC2791e.f31444o.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC2791e.f31445p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC2791e.f31450u.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC2791e.f31451v.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC2791e.f31452w.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f28489a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskedCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3255y.i(context, "context");
    }

    private final void a(ImageView imageView) {
        ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(this.f28487d.d(true)));
    }

    private final void b() {
        int i8;
        AppCompatImageView appCompatImageView = this.f28486c.f4874b;
        Context context = getContext();
        switch (a.f28489a[this.f28484a.ordinal()]) {
            case 1:
                i8 = m2.z.f35112c;
                break;
            case 2:
                i8 = m2.z.f35104P;
                break;
            case 3:
                i8 = m2.z.f35105Q;
                break;
            case 4:
                i8 = m2.z.f35103O;
                break;
            case 5:
                i8 = m2.z.f35109U;
                break;
            case 6:
                i8 = m2.z.f35106R;
                break;
            case 7:
                i8 = m2.z.f35108T;
                break;
            case 8:
                i8 = m2.z.f35100L;
                break;
            case 9:
                i8 = B4.a.f899r;
                break;
            default:
                throw new O5.p();
        }
        appCompatImageView.setImageDrawable(ContextCompat.getDrawable(context, i8));
    }

    private final void c() {
        int i8;
        AppCompatImageView appCompatImageView = this.f28486c.f4875c;
        if (isSelected()) {
            i8 = 0;
        } else {
            i8 = 4;
        }
        appCompatImageView.setVisibility(i8);
    }

    private final void d() {
        b();
        this.f28486c.f4876d.setText(this.f28488e.a(this.f28484a, this.f28485b, isSelected()));
    }

    public final EnumC2791e getCardBrand() {
        return this.f28484a;
    }

    @VisibleForTesting
    public final String getLast4() {
        return this.f28485b;
    }

    public final J2.n getViewBinding$payments_core_release() {
        return this.f28486c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r0 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setPaymentMethod(com.stripe.android.model.o r4) {
        /*
            r3 = this;
            java.lang.String r0 = "paymentMethod"
            kotlin.jvm.internal.AbstractC3255y.i(r4, r0)
            com.stripe.android.model.o$g r4 = r4.f25470h
            e3.e$a r0 = e3.EnumC2791e.f31442m
            r1 = 0
            if (r4 == 0) goto Lf
            java.lang.String r2 = r4.f25541l
            goto L10
        Lf:
            r2 = r1
        L10:
            e3.e r0 = r0.b(r2)
            e3.e r2 = e3.EnumC2791e.f31452w
            if (r0 == r2) goto L19
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 != 0) goto L25
            if (r4 == 0) goto L21
            e3.e r0 = r4.f25530a
            goto L22
        L21:
            r0 = r1
        L22:
            if (r0 != 0) goto L25
            goto L26
        L25:
            r2 = r0
        L26:
            r3.f28484a = r2
            if (r4 == 0) goto L2c
            java.lang.String r1 = r4.f25537h
        L2c:
            r3.f28485b = r1
            r3.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.MaskedCardView.setPaymentMethod(com.stripe.android.model.o):void");
    }

    @Override // android.view.View
    public void setSelected(boolean z8) {
        super.setSelected(z8);
        c();
        d();
    }

    public /* synthetic */ MaskedCardView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskedCardView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3255y.i(context, "context");
        this.f28484a = EnumC2791e.f31452w;
        J2.n b8 = J2.n.b(LayoutInflater.from(context), this);
        AbstractC3255y.h(b8, "inflate(...)");
        this.f28486c = b8;
        S0 s02 = new S0(context);
        this.f28487d = s02;
        Resources resources = getResources();
        AbstractC3255y.h(resources, "getResources(...)");
        this.f28488e = new C2671z(resources, s02);
        AppCompatImageView brandIcon = b8.f4874b;
        AbstractC3255y.h(brandIcon, "brandIcon");
        a(brandIcon);
        AppCompatImageView checkIcon = b8.f4875c;
        AbstractC3255y.h(checkIcon, "checkIcon");
        a(checkIcon);
    }
}
