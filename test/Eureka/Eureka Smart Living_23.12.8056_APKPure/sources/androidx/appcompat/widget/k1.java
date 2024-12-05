package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.text.s;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class k1 extends TextView implements androidx.core.widget.g0 {

    /* renamed from: a, reason: collision with root package name */
    private final e f1120a;

    /* renamed from: b, reason: collision with root package name */
    private final d1 f1121b;

    /* renamed from: c, reason: collision with root package name */
    private final c1 f1122c;

    /* renamed from: d, reason: collision with root package name */
    private n f1123d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1124e;

    /* renamed from: f, reason: collision with root package name */
    private a f1125f;

    /* renamed from: g, reason: collision with root package name */
    private Future f1126g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface a {
        void a(int[] iArr, int i6);

        void b(TextClassifier textClassifier);

        int c();

        int[] d();

        void e(int i6);

        void f(int i6);

        TextClassifier g();

        int h();

        int i();

        void j(int i6);

        void k(int i6, int i7, int i8, int i9);

        int l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements a {
        b() {
        }

        @Override // androidx.appcompat.widget.k1.a
        public void a(int[] iArr, int i6) {
            k1.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i6);
        }

        @Override // androidx.appcompat.widget.k1.a
        public void b(TextClassifier textClassifier) {
            k1.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.k1.a
        public int c() {
            return k1.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.k1.a
        public int[] d() {
            return k1.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.k1.a
        public void e(int i6) {
        }

        @Override // androidx.appcompat.widget.k1.a
        public void f(int i6) {
        }

        @Override // androidx.appcompat.widget.k1.a
        public TextClassifier g() {
            return k1.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.k1.a
        public int h() {
            return k1.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.k1.a
        public int i() {
            return k1.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.k1.a
        public void j(int i6) {
            k1.super.setAutoSizeTextTypeWithDefaults(i6);
        }

        @Override // androidx.appcompat.widget.k1.a
        public void k(int i6, int i7, int i8, int i9) {
            k1.super.setAutoSizeTextTypeUniformWithConfiguration(i6, i7, i8, i9);
        }

        @Override // androidx.appcompat.widget.k1.a
        public int l() {
            return k1.super.getAutoSizeTextType();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.k1.b, androidx.appcompat.widget.k1.a
        public void e(int i6) {
            k1.super.setLastBaselineToBottomHeight(i6);
        }

        @Override // androidx.appcompat.widget.k1.b, androidx.appcompat.widget.k1.a
        public void f(int i6) {
            k1.super.setFirstBaselineToTopHeight(i6);
        }
    }

    public k1(Context context) {
        this(context, null);
    }

    private n getEmojiTextViewHelper() {
        if (this.f1123d == null) {
            this.f1123d = new n(this);
        }
        return this.f1123d;
    }

    private void q() {
        Future future = this.f1126g;
        if (future != null) {
            try {
                this.f1126g = null;
                androidx.appcompat.app.f0.a(future.get());
                androidx.core.widget.s.m(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1120a;
        if (eVar != null) {
            eVar.b();
        }
        d1 d1Var = this.f1121b;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (p3.f1189b) {
            return getSuperCaller().i();
        }
        d1 d1Var = this.f1121b;
        if (d1Var != null) {
            return d1Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (p3.f1189b) {
            return getSuperCaller().c();
        }
        d1 d1Var = this.f1121b;
        if (d1Var != null) {
            return d1Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (p3.f1189b) {
            return getSuperCaller().h();
        }
        d1 d1Var = this.f1121b;
        if (d1Var != null) {
            return d1Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (p3.f1189b) {
            return getSuperCaller().d();
        }
        d1 d1Var = this.f1121b;
        return d1Var != null ? d1Var.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (p3.f1189b) {
            return getSuperCaller().l() == 1 ? 1 : 0;
        }
        d1 d1Var = this.f1121b;
        if (d1Var != null) {
            return d1Var.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.s.p(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.s.b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.s.c(this);
    }

    a getSuperCaller() {
        a bVar;
        if (this.f1125f == null) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 28) {
                bVar = new c();
            } else if (i6 >= 26) {
                bVar = new b();
            }
            this.f1125f = bVar;
        }
        return this.f1125f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1120a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1120a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1121b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1121b.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        q();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        c1 c1Var;
        return (Build.VERSION.SDK_INT >= 28 || (c1Var = this.f1122c) == null) ? getSuperCaller().g() : c1Var.a();
    }

    public s.a getTextMetricsParamsCompat() {
        return androidx.core.widget.s.f(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1121b.r(this, onCreateInputConnection, editorInfo);
        return o.a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        d1 d1Var = this.f1121b;
        if (d1Var != null) {
            d1Var.o(z5, i6, i7, i8, i9);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i6, int i7) {
        q();
        super.onMeasure(i6, i7);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        super.onTextChanged(charSequence, i6, i7, i8);
        d1 d1Var = this.f1121b;
        if ((d1Var == null || p3.f1189b || !d1Var.l()) ? false : true) {
            this.f1121b.c();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().c(z5);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i6, int i7, int i8, int i9) {
        if (p3.f1189b) {
            getSuperCaller().k(i6, i7, i8, i9);
            return;
        }
        d1 d1Var = this.f1121b;
        if (d1Var != null) {
            d1Var.t(i6, i7, i8, i9);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i6) {
        if (p3.f1189b) {
            getSuperCaller().a(iArr, i6);
            return;
        }
        d1 d1Var = this.f1121b;
        if (d1Var != null) {
            d1Var.u(iArr, i6);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i6) {
        if (p3.f1189b) {
            getSuperCaller().j(i6);
            return;
        }
        d1 d1Var = this.f1121b;
        if (d1Var != null) {
            d1Var.v(i6);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1120a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        e eVar = this.f1120a;
        if (eVar != null) {
            eVar.g(i6);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f1121b;
        if (d1Var != null) {
            d1Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f1121b;
        if (d1Var != null) {
            d1Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i6, int i7, int i8, int i9) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i6 != 0 ? e.a.b(context, i6) : null, i7 != 0 ? e.a.b(context, i7) : null, i8 != 0 ? e.a.b(context, i8) : null, i9 != 0 ? e.a.b(context, i9) : null);
        d1 d1Var = this.f1121b;
        if (d1Var != null) {
            d1Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i6, int i7, int i8, int i9) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i6 != 0 ? e.a.b(context, i6) : null, i7 != 0 ? e.a.b(context, i7) : null, i8 != 0 ? e.a.b(context, i8) : null, i9 != 0 ? e.a.b(context, i9) : null);
        d1 d1Var = this.f1121b;
        if (d1Var != null) {
            d1Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.s.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        getEmojiTextViewHelper().d(z5);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i6) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i6);
        } else {
            androidx.core.widget.s.j(this, i6);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i6) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().e(i6);
        } else {
            androidx.core.widget.s.k(this, i6);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i6) {
        androidx.core.widget.s.l(this, i6);
    }

    public void setPrecomputedText(androidx.core.text.s sVar) {
        androidx.core.widget.s.m(this, sVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1120a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1120a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.g0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1121b.w(colorStateList);
        this.f1121b.b();
    }

    @Override // androidx.core.widget.g0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1121b.x(mode);
        this.f1121b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        d1 d1Var = this.f1121b;
        if (d1Var != null) {
            d1Var.q(context, i6);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        c1 c1Var;
        if (Build.VERSION.SDK_INT >= 28 || (c1Var = this.f1122c) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            c1Var.b(textClassifier);
        }
    }

    public void setTextFuture(Future<androidx.core.text.s> future) {
        this.f1126g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(s.a aVar) {
        androidx.core.widget.s.o(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i6, float f6) {
        if (p3.f1189b) {
            super.setTextSize(i6, f6);
            return;
        }
        d1 d1Var = this.f1121b;
        if (d1Var != null) {
            d1Var.A(i6, f6);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i6) {
        if (this.f1124e) {
            return;
        }
        Typeface a6 = (typeface == null || i6 <= 0) ? null : androidx.core.graphics.k.a(getContext(), typeface, i6);
        this.f1124e = true;
        if (a6 != null) {
            typeface = a6;
        }
        try {
            super.setTypeface(typeface, i6);
        } finally {
            this.f1124e = false;
        }
    }

    public k1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f1121b;
        if (d1Var != null) {
            d1Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f1121b;
        if (d1Var != null) {
            d1Var.p();
        }
    }

    public k1(Context context, AttributeSet attributeSet, int i6) {
        super(z2.b(context), attributeSet, i6);
        this.f1124e = false;
        this.f1125f = null;
        y2.a(this, getContext());
        e eVar = new e(this);
        this.f1120a = eVar;
        eVar.e(attributeSet, i6);
        d1 d1Var = new d1(this);
        this.f1121b = d1Var;
        d1Var.m(attributeSet, i6);
        d1Var.b();
        this.f1122c = new c1(this);
        getEmojiTextViewHelper().b(attributeSet, i6);
    }
}
