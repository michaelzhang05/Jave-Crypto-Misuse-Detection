package com.stripe.android.paymentsheet.ui;

import M3.J;
import M3.L;
import O5.I;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.unit.Dp;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m4.AbstractC3441m;
import m4.C3431c;
import m4.C3440l;
import t3.s;
import t3.w;
import w4.AbstractC4148a;
import y3.C4205b;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PrimaryButton extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private ColorStateList f27576a;

    /* renamed from: b, reason: collision with root package name */
    private a f27577b;

    /* renamed from: c, reason: collision with root package name */
    private final J f27578c;

    /* renamed from: d, reason: collision with root package name */
    private B2.b f27579d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f27580e;

    /* renamed from: f, reason: collision with root package name */
    private B2.b f27581f;

    /* renamed from: g, reason: collision with root package name */
    private final C4205b f27582g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f27583h;

    /* renamed from: i, reason: collision with root package name */
    private final ImageView f27584i;

    /* renamed from: j, reason: collision with root package name */
    private float f27585j;

    /* renamed from: k, reason: collision with root package name */
    private float f27586k;

    /* renamed from: l, reason: collision with root package name */
    private int f27587l;

    /* renamed from: m, reason: collision with root package name */
    private int f27588m;

    /* renamed from: n, reason: collision with root package name */
    private int f27589n;

    /* loaded from: classes4.dex */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f27590a;

        /* renamed from: com.stripe.android.paymentsheet.ui.PrimaryButton$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0649a extends a {

            /* renamed from: b, reason: collision with root package name */
            private final Function0 f27591b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0649a(Function0 onComplete) {
                super(true, null);
                AbstractC3255y.i(onComplete, "onComplete");
                this.f27591b = onComplete;
            }

            public final Function0 a() {
                return this.f27591b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0649a) && AbstractC3255y.d(this.f27591b, ((C0649a) obj).f27591b);
            }

            public int hashCode() {
                return this.f27591b.hashCode();
            }

            public String toString() {
                return "FinishProcessing(onComplete=" + this.f27591b + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends a {

            /* renamed from: b, reason: collision with root package name */
            public static final b f27592b = new b();

            private b() {
                super(false, null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -745924076;
            }

            public String toString() {
                return "Ready";
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends a {

            /* renamed from: b, reason: collision with root package name */
            public static final c f27593b = new c();

            private c() {
                super(true, null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -198876090;
            }

            public String toString() {
                return "StartProcessing";
            }
        }

        public /* synthetic */ a(boolean z8, AbstractC3247p abstractC3247p) {
            this(z8);
        }

        private a(boolean z8) {
            this.f27590a = z8;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final B2.b f27594a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0 f27595b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27596c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27597d;

        public b(B2.b label, Function0 onClick, boolean z8, boolean z9) {
            AbstractC3255y.i(label, "label");
            AbstractC3255y.i(onClick, "onClick");
            this.f27594a = label;
            this.f27595b = onClick;
            this.f27596c = z8;
            this.f27597d = z9;
        }

        public static /* synthetic */ b b(b bVar, B2.b bVar2, Function0 function0, boolean z8, boolean z9, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                bVar2 = bVar.f27594a;
            }
            if ((i8 & 2) != 0) {
                function0 = bVar.f27595b;
            }
            if ((i8 & 4) != 0) {
                z8 = bVar.f27596c;
            }
            if ((i8 & 8) != 0) {
                z9 = bVar.f27597d;
            }
            return bVar.a(bVar2, function0, z8, z9);
        }

        public final b a(B2.b label, Function0 onClick, boolean z8, boolean z9) {
            AbstractC3255y.i(label, "label");
            AbstractC3255y.i(onClick, "onClick");
            return new b(label, onClick, z8, z9);
        }

        public final boolean c() {
            return this.f27596c;
        }

        public final B2.b d() {
            return this.f27594a;
        }

        public final boolean e() {
            return this.f27597d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3255y.d(this.f27594a, bVar.f27594a) && AbstractC3255y.d(this.f27595b, bVar.f27595b) && this.f27596c == bVar.f27596c && this.f27597d == bVar.f27597d;
        }

        public final Function0 f() {
            return this.f27595b;
        }

        public int hashCode() {
            return (((((this.f27594a.hashCode() * 31) + this.f27595b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f27596c)) * 31) + androidx.compose.foundation.a.a(this.f27597d);
        }

        public String toString() {
            return "UIState(label=" + this.f27594a + ", onClick=" + this.f27595b + ", enabled=" + this.f27596c + ", lockVisible=" + this.f27597d + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f27598a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function0 function0) {
            super(0);
            this.f27598a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5543invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5543invoke() {
            this.f27598a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ B2.b f27599a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PrimaryButton f27600b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(B2.b bVar, PrimaryButton primaryButton) {
            super(2);
            this.f27599a = bVar;
            this.f27600b = primaryButton;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-47128405, i8, -1, "com.stripe.android.paymentsheet.ui.PrimaryButton.setLabel.<anonymous>.<anonymous> (PrimaryButton.kt:162)");
            }
            L.a(AbstractC4148a.a(this.f27599a, composer, 8), this.f27600b.f27580e, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PrimaryButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3255y.i(context, "context");
    }

    private final CharSequence c(AttributeSet attributeSet) {
        Context context = getContext();
        AbstractC3255y.h(context, "getContext(...)");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1378t.V0(AbstractC1378t.e(Integer.valueOf(R.attr.text))), 0, 0);
        CharSequence text = obtainStyledAttributes.getText(0);
        obtainStyledAttributes.recycle();
        return text;
    }

    private final void d(Function0 function0) {
        setClickable(false);
        setBackgroundTintList(ColorStateList.valueOf(this.f27588m));
        this.f27584i.setImageTintList(ColorStateList.valueOf(this.f27589n));
        J j8 = this.f27578c;
        ComposeView label = this.f27582g.f40926d;
        AbstractC3255y.h(label, "label");
        j8.e(label);
        J j9 = this.f27578c;
        CircularProgressIndicator confirmingIcon = this.f27582g.f40925c;
        AbstractC3255y.h(confirmingIcon, "confirmingIcon");
        j9.e(confirmingIcon);
        this.f27578c.d(this.f27584i, getWidth(), new c(function0));
    }

    private final void e() {
        int i8;
        setClickable(true);
        B2.b bVar = this.f27579d;
        if (bVar != null) {
            setLabel(bVar);
        }
        ColorStateList colorStateList = this.f27576a;
        if (colorStateList != null) {
            setBackgroundTintList(colorStateList);
        }
        ImageView lockIcon = this.f27582g.f40927e;
        AbstractC3255y.h(lockIcon, "lockIcon");
        if (this.f27583h) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        lockIcon.setVisibility(i8);
        CircularProgressIndicator confirmingIcon = this.f27582g.f40925c;
        AbstractC3255y.h(confirmingIcon, "confirmingIcon");
        confirmingIcon.setVisibility(8);
    }

    private final void f() {
        ImageView lockIcon = this.f27582g.f40927e;
        AbstractC3255y.h(lockIcon, "lockIcon");
        lockIcon.setVisibility(8);
        CircularProgressIndicator confirmingIcon = this.f27582g.f40925c;
        AbstractC3255y.h(confirmingIcon, "confirmingIcon");
        confirmingIcon.setVisibility(0);
        setClickable(false);
        setLabel(B2.c.a(w.f39768V));
    }

    @VisibleForTesting
    public static /* synthetic */ void getDefaultTintList$paymentsheet_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getExternalLabel$paymentsheet_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getViewBinding$paymentsheet_release$annotations() {
    }

    private final void h() {
        float f8;
        ComposeView label = this.f27582g.f40926d;
        AbstractC3255y.h(label, "label");
        ImageView lockIcon = this.f27582g.f40927e;
        AbstractC3255y.h(lockIcon, "lockIcon");
        for (View view : AbstractC1378t.p(label, lockIcon)) {
            a aVar = this.f27577b;
            if ((aVar == null || (aVar instanceof a.b)) && !isEnabled()) {
                f8 = 0.5f;
            } else {
                f8 = 1.0f;
            }
            view.setAlpha(f8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(b bVar, View view) {
        bVar.f().invoke();
    }

    private final void setLabel(B2.b bVar) {
        this.f27581f = bVar;
        if (bVar != null) {
            if (!(this.f27577b instanceof a.c)) {
                this.f27579d = bVar;
            }
            this.f27582g.f40926d.setContent(ComposableLambdaKt.composableLambdaInstance(-47128405, true, new d(bVar, this)));
        }
    }

    public final void g(C3431c primaryButtonStyle, ColorStateList colorStateList) {
        AbstractC3255y.i(primaryButtonStyle, "primaryButtonStyle");
        Context context = getContext();
        AbstractC3255y.h(context, "getContext(...)");
        this.f27585j = AbstractC3441m.c(context, Dp.m5183constructorimpl(primaryButtonStyle.d().b()));
        Context context2 = getContext();
        AbstractC3255y.h(context2, "getContext(...)");
        this.f27586k = AbstractC3441m.c(context2, Dp.m5183constructorimpl(primaryButtonStyle.d().a()));
        Context context3 = getContext();
        AbstractC3255y.h(context3, "getContext(...)");
        this.f27587l = AbstractC3441m.f(primaryButtonStyle, context3);
        ImageView imageView = this.f27582g.f40927e;
        Context context4 = getContext();
        AbstractC3255y.h(context4, "getContext(...)");
        imageView.setImageTintList(ColorStateList.valueOf(AbstractC3441m.k(primaryButtonStyle, context4)));
        this.f27576a = colorStateList;
        setBackgroundTintList(colorStateList);
        Context context5 = getContext();
        AbstractC3255y.h(context5, "getContext(...)");
        this.f27588m = AbstractC3441m.q(primaryButtonStyle, context5);
        Context context6 = getContext();
        AbstractC3255y.h(context6, "getContext(...)");
        this.f27589n = AbstractC3441m.l(primaryButtonStyle, context6);
    }

    public final ColorStateList getDefaultTintList$paymentsheet_release() {
        return this.f27576a;
    }

    public final B2.b getExternalLabel$paymentsheet_release() {
        return this.f27581f;
    }

    public final boolean getLockVisible$paymentsheet_release() {
        return this.f27583h;
    }

    public final C4205b getViewBinding$paymentsheet_release() {
        return this.f27582g;
    }

    public final void i(a aVar) {
        this.f27577b = aVar;
        h();
        if (aVar instanceof a.b) {
            e();
        } else if (AbstractC3255y.d(aVar, a.c.f27593b)) {
            f();
        } else if (aVar instanceof a.C0649a) {
            d(((a.C0649a) aVar).a());
        }
    }

    public final void j(final b bVar) {
        boolean z8;
        int i8;
        int i9 = 0;
        if (bVar != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        setVisibility(i8);
        if (bVar != null) {
            a aVar = this.f27577b;
            if (!(aVar instanceof a.c) && !(aVar instanceof a.C0649a)) {
                setLabel(bVar.d());
            }
            setEnabled(bVar.c());
            this.f27583h = bVar.e();
            ImageView lockIcon = this.f27582g.f40927e;
            AbstractC3255y.h(lockIcon, "lockIcon");
            if (!this.f27583h) {
                i9 = 8;
            }
            lockIcon.setVisibility(i9);
            setOnClickListener(new View.OnClickListener() { // from class: M3.I
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PrimaryButton.k(PrimaryButton.b.this, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.f27585j);
        gradientDrawable.setColor(colorStateList);
        gradientDrawable.setStroke((int) this.f27586k, this.f27587l);
        setBackground(gradientDrawable);
        int dimensionPixelSize = getResources().getDimensionPixelSize(s.f39715h);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    public final void setConfirmedIconDrawable(@DrawableRes int i8) {
        this.f27582g.f40924b.setImageResource(i8);
    }

    public final void setDefaultLabelColor(@ColorInt int i8) {
        this.f27580e = Integer.valueOf(i8);
    }

    public final void setDefaultTintList$paymentsheet_release(ColorStateList colorStateList) {
        this.f27576a = colorStateList;
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
        h();
    }

    public final void setExternalLabel$paymentsheet_release(B2.b bVar) {
        this.f27581f = bVar;
    }

    public final void setIndicatorColor(@ColorInt int i8) {
        this.f27582g.f40925c.setIndicatorColor(i8);
    }

    public final void setLockIconDrawable(@DrawableRes int i8) {
        this.f27582g.f40927e.setImageResource(i8);
    }

    public final void setLockVisible$paymentsheet_release(boolean z8) {
        this.f27583h = z8;
    }

    public /* synthetic */ PrimaryButton(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButton(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3255y.i(context, "context");
        this.f27578c = new J(context);
        C4205b b8 = C4205b.b(LayoutInflater.from(context), this);
        AbstractC3255y.h(b8, "inflate(...)");
        this.f27582g = b8;
        this.f27583h = true;
        ImageView confirmedIcon = b8.f40924b;
        AbstractC3255y.h(confirmedIcon, "confirmedIcon");
        this.f27584i = confirmedIcon;
        C3440l c3440l = C3440l.f35212a;
        this.f27585j = AbstractC3441m.c(context, Dp.m5183constructorimpl(c3440l.d().d().b()));
        this.f27586k = AbstractC3441m.c(context, Dp.m5183constructorimpl(c3440l.d().d().a()));
        this.f27587l = AbstractC3441m.f(c3440l.d(), context);
        this.f27588m = AbstractC3441m.q(c3440l.d(), context);
        this.f27589n = AbstractC3441m.l(c3440l.d(), context);
        b8.f40926d.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        CharSequence c8 = c(attributeSet);
        if (c8 != null) {
            setLabel(B2.c.b(c8.toString()));
        }
        setClickable(true);
        setEnabled(false);
    }
}
