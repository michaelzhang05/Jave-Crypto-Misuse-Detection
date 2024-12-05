package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l1 {

    /* renamed from: l, reason: collision with root package name */
    private static final RectF f1137l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    private static ConcurrentHashMap f1138m = new ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    private static ConcurrentHashMap f1139n = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private int f1140a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1141b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f1142c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f1143d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    private float f1144e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    private int[] f1145f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    private boolean f1146g = false;

    /* renamed from: h, reason: collision with root package name */
    private TextPaint f1147h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f1148i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f1149j;

    /* renamed from: k, reason: collision with root package name */
    private final f f1150k;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i6, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i6, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {
        static boolean a(View view) {
            return view.isInLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i6, int i7, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder obtain;
            StaticLayout.Builder alignment2;
            StaticLayout.Builder lineSpacing;
            StaticLayout.Builder includePad;
            int breakStrategy;
            StaticLayout.Builder breakStrategy2;
            int hyphenationFrequency;
            StaticLayout.Builder hyphenationFrequency2;
            StaticLayout build;
            obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i6);
            alignment2 = obtain.setAlignment(alignment);
            lineSpacing = alignment2.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier());
            includePad = lineSpacing.setIncludePad(textView.getIncludeFontPadding());
            breakStrategy = textView.getBreakStrategy();
            breakStrategy2 = includePad.setBreakStrategy(breakStrategy);
            hyphenationFrequency = textView.getHyphenationFrequency();
            hyphenationFrequency2 = breakStrategy2.setHyphenationFrequency(hyphenationFrequency);
            if (i7 == -1) {
                i7 = Integer.MAX_VALUE;
            }
            hyphenationFrequency2.setMaxLines(i7);
            try {
                fVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            build = obtain.build();
            return build;
        }
    }

    /* loaded from: classes.dex */
    private static class d extends f {
        d() {
        }

        @Override // androidx.appcompat.widget.l1.f
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) l1.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* loaded from: classes.dex */
    private static class e extends d {
        e() {
        }

        @Override // androidx.appcompat.widget.l1.d, androidx.appcompat.widget.l1.f
        void a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.l1.f
        boolean b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {
        f() {
        }

        void a(StaticLayout.Builder builder, TextView textView) {
        }

        boolean b(TextView textView) {
            return ((Boolean) l1.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l1(TextView textView) {
        this.f1148i = textView;
        this.f1149j = textView.getContext();
        int i6 = Build.VERSION.SDK_INT;
        this.f1150k = i6 >= 29 ? new e() : i6 >= 23 ? new d() : new f();
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i6 : iArr) {
            if (i6 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i6)) < 0) {
                arrayList.add(Integer.valueOf(i6));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr2[i7] = ((Integer) arrayList.get(i7)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f1140a = 0;
        this.f1143d = -1.0f;
        this.f1144e = -1.0f;
        this.f1142c = -1.0f;
        this.f1145f = new int[0];
        this.f1141b = false;
    }

    private int e(RectF rectF) {
        int length = this.f1145f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i6 = 1;
        int i7 = length - 1;
        int i8 = 0;
        while (i6 <= i7) {
            int i9 = (i6 + i7) / 2;
            if (x(this.f1145f[i9], rectF)) {
                int i10 = i9 + 1;
                i8 = i6;
                i6 = i10;
            } else {
                i8 = i9 - 1;
                i7 = i8;
            }
        }
        return this.f1145f[i8];
    }

    private static Method k(String str) {
        try {
            Method method = (Method) f1138m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1138m.put(str, method);
            }
            return method;
        } catch (Exception e6) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e6);
            return null;
        }
    }

    static Object m(Object obj, String str, Object obj2) {
        try {
            return k(str).invoke(obj, new Object[0]);
        } catch (Exception e6) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e6);
            return obj2;
        }
    }

    private void s(float f6) {
        if (f6 != this.f1148i.getPaint().getTextSize()) {
            this.f1148i.getPaint().setTextSize(f6);
            boolean a6 = b.a(this.f1148i);
            if (this.f1148i.getLayout() != null) {
                this.f1141b = false;
                try {
                    Method k6 = k("nullLayouts");
                    if (k6 != null) {
                        k6.invoke(this.f1148i, new Object[0]);
                    }
                } catch (Exception e6) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e6);
                }
                if (a6) {
                    this.f1148i.forceLayout();
                } else {
                    this.f1148i.requestLayout();
                }
                this.f1148i.invalidate();
            }
        }
    }

    private boolean u() {
        if (y() && this.f1140a == 1) {
            if (!this.f1146g || this.f1145f.length == 0) {
                int floor = ((int) Math.floor((this.f1144e - this.f1143d) / this.f1142c)) + 1;
                int[] iArr = new int[floor];
                for (int i6 = 0; i6 < floor; i6++) {
                    iArr[i6] = Math.round(this.f1143d + (i6 * this.f1142c));
                }
                this.f1145f = b(iArr);
            }
            this.f1141b = true;
        } else {
            this.f1141b = false;
        }
        return this.f1141b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i6 = 0; i6 < length; i6++) {
                iArr[i6] = typedArray.getDimensionPixelSize(i6, -1);
            }
            this.f1145f = b(iArr);
            w();
        }
    }

    private boolean w() {
        boolean z5 = this.f1145f.length > 0;
        this.f1146g = z5;
        if (z5) {
            this.f1140a = 1;
            this.f1143d = r0[0];
            this.f1144e = r0[r1 - 1];
            this.f1142c = -1.0f;
        }
        return z5;
    }

    private boolean x(int i6, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1148i.getText();
        TransformationMethod transformationMethod = this.f1148i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1148i)) != null) {
            text = transformation;
        }
        int b6 = a.b(this.f1148i);
        l(i6);
        StaticLayout d6 = d(text, (Layout.Alignment) m(this.f1148i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b6);
        return (b6 == -1 || (d6.getLineCount() <= b6 && d6.getLineEnd(d6.getLineCount() - 1) == text.length())) && ((float) d6.getHeight()) <= rectF.bottom;
    }

    private boolean y() {
        return !(this.f1148i instanceof l);
    }

    private void z(float f6, float f7, float f8) {
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f6 + "px) is less or equal to (0px)");
        }
        if (f7 <= f6) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f7 + "px) is less or equal to minimum auto-size text size (" + f6 + "px)");
        }
        if (f8 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f8 + "px) is less or equal to (0px)");
        }
        this.f1140a = 1;
        this.f1143d = f6;
        this.f1144e = f7;
        this.f1142c = f8;
        this.f1146g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (n()) {
            if (this.f1141b) {
                if (this.f1148i.getMeasuredHeight() <= 0 || this.f1148i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f1150k.b(this.f1148i) ? 1048576 : (this.f1148i.getMeasuredWidth() - this.f1148i.getTotalPaddingLeft()) - this.f1148i.getTotalPaddingRight();
                int height = (this.f1148i.getHeight() - this.f1148i.getCompoundPaddingBottom()) - this.f1148i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1137l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float e6 = e(rectF);
                    if (e6 != this.f1148i.getTextSize()) {
                        t(0, e6);
                    }
                }
            }
            this.f1141b = true;
        }
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i6, int i7) {
        return Build.VERSION.SDK_INT >= 23 ? c.a(charSequence, alignment, i6, i7, this.f1148i, this.f1147h, this.f1150k) : a.a(charSequence, alignment, i6, this.f1148i, this.f1147h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return Math.round(this.f1144e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return Math.round(this.f1143d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return Math.round(this.f1142c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] i() {
        return this.f1145f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f1140a;
    }

    void l(int i6) {
        TextPaint textPaint = this.f1147h;
        if (textPaint == null) {
            this.f1147h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1147h.set(this.f1148i.getPaint());
        this.f1147h.setTextSize(i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n() {
        return y() && this.f1140a != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(AttributeSet attributeSet, int i6) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1149j.obtainStyledAttributes(attributeSet, d.j.f6281g0, i6, 0);
        TextView textView = this.f1148i;
        androidx.core.view.b1.o0(textView, textView.getContext(), d.j.f6281g0, attributeSet, obtainStyledAttributes, i6, 0);
        if (obtainStyledAttributes.hasValue(d.j.f6306l0)) {
            this.f1140a = obtainStyledAttributes.getInt(d.j.f6306l0, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(d.j.f6301k0) ? obtainStyledAttributes.getDimension(d.j.f6301k0, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(d.j.f6291i0) ? obtainStyledAttributes.getDimension(d.j.f6291i0, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(d.j.f6286h0) ? obtainStyledAttributes.getDimension(d.j.f6286h0, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(d.j.f6296j0) && (resourceId = obtainStyledAttributes.getResourceId(d.j.f6296j0, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!y()) {
            this.f1140a = 0;
            return;
        }
        if (this.f1140a == 1) {
            if (!this.f1146g) {
                DisplayMetrics displayMetrics = this.f1149j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(int i6, int i7, int i8, int i9) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f1149j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i9, i6, displayMetrics), TypedValue.applyDimension(i9, i7, displayMetrics), TypedValue.applyDimension(i9, i8, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(int[] iArr, int i6) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i6 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1149j.getResources().getDisplayMetrics();
                    for (int i7 = 0; i7 < length; i7++) {
                        iArr2[i7] = Math.round(TypedValue.applyDimension(i6, iArr[i7], displayMetrics));
                    }
                }
                this.f1145f = b(iArr2);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1146g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(int i6) {
        if (y()) {
            if (i6 == 0) {
                c();
                return;
            }
            if (i6 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i6);
            }
            DisplayMetrics displayMetrics = this.f1149j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int i6, float f6) {
        Context context = this.f1149j;
        s(TypedValue.applyDimension(i6, f6, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
