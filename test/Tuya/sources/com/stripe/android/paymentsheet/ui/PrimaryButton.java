package com.stripe.android.paymentsheet.ui;

import J3.J;
import J3.L;
import L5.I;
import M5.AbstractC1246t;
import X5.n;
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
import j4.AbstractC3087m;
import j4.C3077c;
import j4.C3086l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import q3.s;
import q3.w;
import t4.AbstractC3794a;
import v3.C3828b;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PrimaryButton extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private ColorStateList f26521a;

    /* renamed from: b, reason: collision with root package name */
    private a f26522b;

    /* renamed from: c, reason: collision with root package name */
    private final J f26523c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC3983b f26524d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f26525e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC3983b f26526f;

    /* renamed from: g, reason: collision with root package name */
    private final C3828b f26527g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f26528h;

    /* renamed from: i, reason: collision with root package name */
    private final ImageView f26529i;

    /* renamed from: j, reason: collision with root package name */
    private float f26530j;

    /* renamed from: k, reason: collision with root package name */
    private float f26531k;

    /* renamed from: l, reason: collision with root package name */
    private int f26532l;

    /* renamed from: m, reason: collision with root package name */
    private int f26533m;

    /* renamed from: n, reason: collision with root package name */
    private int f26534n;

    /* loaded from: classes4.dex */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f26535a;

        /* renamed from: com.stripe.android.paymentsheet.ui.PrimaryButton$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0653a extends a {

            /* renamed from: b, reason: collision with root package name */
            private final Function0 f26536b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0653a(Function0 onComplete) {
                super(true, null);
                AbstractC3159y.i(onComplete, "onComplete");
                this.f26536b = onComplete;
            }

            public final Function0 a() {
                return this.f26536b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0653a) && AbstractC3159y.d(this.f26536b, ((C0653a) obj).f26536b);
            }

            public int hashCode() {
                return this.f26536b.hashCode();
            }

            public String toString() {
                return "FinishProcessing(onComplete=" + this.f26536b + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends a {

            /* renamed from: b, reason: collision with root package name */
            public static final b f26537b = new b();

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
            public static final c f26538b = new c();

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

        public /* synthetic */ a(boolean z8, AbstractC3151p abstractC3151p) {
            this(z8);
        }

        private a(boolean z8) {
            this.f26535a = z8;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3983b f26539a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0 f26540b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26541c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26542d;

        public b(InterfaceC3983b label, Function0 onClick, boolean z8, boolean z9) {
            AbstractC3159y.i(label, "label");
            AbstractC3159y.i(onClick, "onClick");
            this.f26539a = label;
            this.f26540b = onClick;
            this.f26541c = z8;
            this.f26542d = z9;
        }

        public static /* synthetic */ b b(b bVar, InterfaceC3983b interfaceC3983b, Function0 function0, boolean z8, boolean z9, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                interfaceC3983b = bVar.f26539a;
            }
            if ((i8 & 2) != 0) {
                function0 = bVar.f26540b;
            }
            if ((i8 & 4) != 0) {
                z8 = bVar.f26541c;
            }
            if ((i8 & 8) != 0) {
                z9 = bVar.f26542d;
            }
            return bVar.a(interfaceC3983b, function0, z8, z9);
        }

        public final b a(InterfaceC3983b label, Function0 onClick, boolean z8, boolean z9) {
            AbstractC3159y.i(label, "label");
            AbstractC3159y.i(onClick, "onClick");
            return new b(label, onClick, z8, z9);
        }

        public final boolean c() {
            return this.f26541c;
        }

        public final InterfaceC3983b d() {
            return this.f26539a;
        }

        public final boolean e() {
            return this.f26542d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f26539a, bVar.f26539a) && AbstractC3159y.d(this.f26540b, bVar.f26540b) && this.f26541c == bVar.f26541c && this.f26542d == bVar.f26542d;
        }

        public final Function0 f() {
            return this.f26540b;
        }

        public int hashCode() {
            return (((((this.f26539a.hashCode() * 31) + this.f26540b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f26541c)) * 31) + androidx.compose.foundation.a.a(this.f26542d);
        }

        public String toString() {
            return "UIState(label=" + this.f26539a + ", onClick=" + this.f26540b + ", enabled=" + this.f26541c + ", lockVisible=" + this.f26542d + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f26543a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function0 function0) {
            super(0);
            this.f26543a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5539invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5539invoke() {
            this.f26543a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3983b f26544a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PrimaryButton f26545b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC3983b interfaceC3983b, PrimaryButton primaryButton) {
            super(2);
            this.f26544a = interfaceC3983b;
            this.f26545b = primaryButton;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-47128405, i8, -1, "com.stripe.android.paymentsheet.ui.PrimaryButton.setLabel.<anonymous>.<anonymous> (PrimaryButton.kt:162)");
            }
            L.a(AbstractC3794a.a(this.f26544a, composer, 8), this.f26545b.f26525e, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PrimaryButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3159y.i(context, "context");
    }

    private final CharSequence c(AttributeSet attributeSet) {
        Context context = getContext();
        AbstractC3159y.h(context, "getContext(...)");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1246t.V0(AbstractC1246t.e(Integer.valueOf(R.attr.text))), 0, 0);
        CharSequence text = obtainStyledAttributes.getText(0);
        obtainStyledAttributes.recycle();
        return text;
    }

    private final void d(Function0 function0) {
        setClickable(false);
        setBackgroundTintList(ColorStateList.valueOf(this.f26533m));
        this.f26529i.setImageTintList(ColorStateList.valueOf(this.f26534n));
        J j8 = this.f26523c;
        ComposeView label = this.f26527g.f38795d;
        AbstractC3159y.h(label, "label");
        j8.e(label);
        J j9 = this.f26523c;
        CircularProgressIndicator confirmingIcon = this.f26527g.f38794c;
        AbstractC3159y.h(confirmingIcon, "confirmingIcon");
        j9.e(confirmingIcon);
        this.f26523c.d(this.f26529i, getWidth(), new c(function0));
    }

    private final void e() {
        int i8;
        setClickable(true);
        InterfaceC3983b interfaceC3983b = this.f26524d;
        if (interfaceC3983b != null) {
            setLabel(interfaceC3983b);
        }
        ColorStateList colorStateList = this.f26521a;
        if (colorStateList != null) {
            setBackgroundTintList(colorStateList);
        }
        ImageView lockIcon = this.f26527g.f38796e;
        AbstractC3159y.h(lockIcon, "lockIcon");
        if (this.f26528h) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        lockIcon.setVisibility(i8);
        CircularProgressIndicator confirmingIcon = this.f26527g.f38794c;
        AbstractC3159y.h(confirmingIcon, "confirmingIcon");
        confirmingIcon.setVisibility(8);
    }

    private final void f() {
        ImageView lockIcon = this.f26527g.f38796e;
        AbstractC3159y.h(lockIcon, "lockIcon");
        lockIcon.setVisibility(8);
        CircularProgressIndicator confirmingIcon = this.f26527g.f38794c;
        AbstractC3159y.h(confirmingIcon, "confirmingIcon");
        confirmingIcon.setVisibility(0);
        setClickable(false);
        setLabel(AbstractC3984c.a(w.f37446V));
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
        ComposeView label = this.f26527g.f38795d;
        AbstractC3159y.h(label, "label");
        ImageView lockIcon = this.f26527g.f38796e;
        AbstractC3159y.h(lockIcon, "lockIcon");
        for (View view : AbstractC1246t.p(label, lockIcon)) {
            a aVar = this.f26522b;
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

    private final void setLabel(InterfaceC3983b interfaceC3983b) {
        this.f26526f = interfaceC3983b;
        if (interfaceC3983b != null) {
            if (!(this.f26522b instanceof a.c)) {
                this.f26524d = interfaceC3983b;
            }
            this.f26527g.f38795d.setContent(ComposableLambdaKt.composableLambdaInstance(-47128405, true, new d(interfaceC3983b, this)));
        }
    }

    public final void g(C3077c primaryButtonStyle, ColorStateList colorStateList) {
        AbstractC3159y.i(primaryButtonStyle, "primaryButtonStyle");
        Context context = getContext();
        AbstractC3159y.h(context, "getContext(...)");
        this.f26530j = AbstractC3087m.c(context, Dp.m5178constructorimpl(primaryButtonStyle.d().b()));
        Context context2 = getContext();
        AbstractC3159y.h(context2, "getContext(...)");
        this.f26531k = AbstractC3087m.c(context2, Dp.m5178constructorimpl(primaryButtonStyle.d().a()));
        Context context3 = getContext();
        AbstractC3159y.h(context3, "getContext(...)");
        this.f26532l = AbstractC3087m.f(primaryButtonStyle, context3);
        ImageView imageView = this.f26527g.f38796e;
        Context context4 = getContext();
        AbstractC3159y.h(context4, "getContext(...)");
        imageView.setImageTintList(ColorStateList.valueOf(AbstractC3087m.k(primaryButtonStyle, context4)));
        this.f26521a = colorStateList;
        setBackgroundTintList(colorStateList);
        Context context5 = getContext();
        AbstractC3159y.h(context5, "getContext(...)");
        this.f26533m = AbstractC3087m.q(primaryButtonStyle, context5);
        Context context6 = getContext();
        AbstractC3159y.h(context6, "getContext(...)");
        this.f26534n = AbstractC3087m.l(primaryButtonStyle, context6);
    }

    public final ColorStateList getDefaultTintList$paymentsheet_release() {
        return this.f26521a;
    }

    public final InterfaceC3983b getExternalLabel$paymentsheet_release() {
        return this.f26526f;
    }

    public final boolean getLockVisible$paymentsheet_release() {
        return this.f26528h;
    }

    public final C3828b getViewBinding$paymentsheet_release() {
        return this.f26527g;
    }

    public final void i(a aVar) {
        this.f26522b = aVar;
        h();
        if (aVar instanceof a.b) {
            e();
        } else if (AbstractC3159y.d(aVar, a.c.f26538b)) {
            f();
        } else if (aVar instanceof a.C0653a) {
            d(((a.C0653a) aVar).a());
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
            a aVar = this.f26522b;
            if (!(aVar instanceof a.c) && !(aVar instanceof a.C0653a)) {
                setLabel(bVar.d());
            }
            setEnabled(bVar.c());
            this.f26528h = bVar.e();
            ImageView lockIcon = this.f26527g.f38796e;
            AbstractC3159y.h(lockIcon, "lockIcon");
            if (!this.f26528h) {
                i9 = 8;
            }
            lockIcon.setVisibility(i9);
            setOnClickListener(new View.OnClickListener() { // from class: J3.I
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
        gradientDrawable.setCornerRadius(this.f26530j);
        gradientDrawable.setColor(colorStateList);
        gradientDrawable.setStroke((int) this.f26531k, this.f26532l);
        setBackground(gradientDrawable);
        int dimensionPixelSize = getResources().getDimensionPixelSize(s.f37393h);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    public final void setConfirmedIconDrawable(@DrawableRes int i8) {
        this.f26527g.f38793b.setImageResource(i8);
    }

    public final void setDefaultLabelColor(@ColorInt int i8) {
        this.f26525e = Integer.valueOf(i8);
    }

    public final void setDefaultTintList$paymentsheet_release(ColorStateList colorStateList) {
        this.f26521a = colorStateList;
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
        h();
    }

    public final void setExternalLabel$paymentsheet_release(InterfaceC3983b interfaceC3983b) {
        this.f26526f = interfaceC3983b;
    }

    public final void setIndicatorColor(@ColorInt int i8) {
        this.f26527g.f38794c.setIndicatorColor(i8);
    }

    public final void setLockIconDrawable(@DrawableRes int i8) {
        this.f26527g.f38796e.setImageResource(i8);
    }

    public final void setLockVisible$paymentsheet_release(boolean z8) {
        this.f26528h = z8;
    }

    public /* synthetic */ PrimaryButton(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButton(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        this.f26523c = new J(context);
        C3828b b8 = C3828b.b(LayoutInflater.from(context), this);
        AbstractC3159y.h(b8, "inflate(...)");
        this.f26527g = b8;
        this.f26528h = true;
        ImageView confirmedIcon = b8.f38793b;
        AbstractC3159y.h(confirmedIcon, "confirmedIcon");
        this.f26529i = confirmedIcon;
        C3086l c3086l = C3086l.f33236a;
        this.f26530j = AbstractC3087m.c(context, Dp.m5178constructorimpl(c3086l.d().d().b()));
        this.f26531k = AbstractC3087m.c(context, Dp.m5178constructorimpl(c3086l.d().d().a()));
        this.f26532l = AbstractC3087m.f(c3086l.d(), context);
        this.f26533m = AbstractC3087m.q(c3086l.d(), context);
        this.f26534n = AbstractC3087m.l(c3086l.d(), context);
        b8.f38795d.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        CharSequence c8 = c(attributeSet);
        if (c8 != null) {
            setLabel(AbstractC3984c.b(c8.toString()));
        }
        setClickable(true);
        setEnabled(false);
    }
}
