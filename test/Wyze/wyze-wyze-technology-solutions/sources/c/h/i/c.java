package c.h.i;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* compiled from: PrecomputedTextCompat.java */
/* loaded from: classes.dex */
public class c implements Spannable {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f2725f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final Spannable f2726g;

    /* renamed from: h, reason: collision with root package name */
    private final a f2727h;

    /* renamed from: i, reason: collision with root package name */
    private final PrecomputedText f2728i;

    public a a() {
        return this.f2727h;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f2726g;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i2) {
        return this.f2726g.charAt(i2);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f2726g.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f2726g.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f2726g.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return (T[]) this.f2728i.getSpans(i2, i3, cls);
        }
        return (T[]) this.f2726g.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f2726g.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f2726g.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f2728i.removeSpan(obj);
                return;
            } else {
                this.f2726g.removeSpan(obj);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f2728i.setSpan(obj, i2, i3, i4);
                return;
            } else {
                this.f2726g.setSpan(obj, i2, i3, i4);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i2, int i3) {
        return this.f2726g.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f2726g.toString();
    }

    /* compiled from: PrecomputedTextCompat.java */
    /* loaded from: classes.dex */
    public static final class a {
        private final TextPaint a;

        /* renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f2729b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2730c;

        /* renamed from: d, reason: collision with root package name */
        private final int f2731d;

        /* renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f2732e;

        /* compiled from: PrecomputedTextCompat.java */
        /* renamed from: c.h.i.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0060a {
            private final TextPaint a;

            /* renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f2733b;

            /* renamed from: c, reason: collision with root package name */
            private int f2734c;

            /* renamed from: d, reason: collision with root package name */
            private int f2735d;

            public C0060a(TextPaint textPaint) {
                this.a = textPaint;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 23) {
                    this.f2734c = 1;
                    this.f2735d = 1;
                } else {
                    this.f2735d = 0;
                    this.f2734c = 0;
                }
                if (i2 >= 18) {
                    this.f2733b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f2733b = null;
                }
            }

            public a a() {
                return new a(this.a, this.f2733b, this.f2734c, this.f2735d);
            }

            public C0060a b(int i2) {
                this.f2734c = i2;
                return this;
            }

            public C0060a c(int i2) {
                this.f2735d = i2;
                return this;
            }

            public C0060a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f2733b = textDirectionHeuristic;
                return this;
            }
        }

        @SuppressLint({"NewApi"})
        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f2732e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f2732e = null;
            }
            this.a = textPaint;
            this.f2729b = textDirectionHeuristic;
            this.f2730c = i2;
            this.f2731d = i3;
        }

        public boolean a(a aVar) {
            int i2 = Build.VERSION.SDK_INT;
            if ((i2 >= 23 && (this.f2730c != aVar.b() || this.f2731d != aVar.c())) || this.a.getTextSize() != aVar.e().getTextSize() || this.a.getTextScaleX() != aVar.e().getTextScaleX() || this.a.getTextSkewX() != aVar.e().getTextSkewX()) {
                return false;
            }
            if ((i2 >= 21 && (this.a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()))) || this.a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i2 >= 24) {
                if (!this.a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (i2 >= 17 && !this.a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            return this.a.getTypeface() == null ? aVar.e().getTypeface() == null : this.a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f2730c;
        }

        public int c() {
            return this.f2731d;
        }

        public TextDirectionHeuristic d() {
            return this.f2729b;
        }

        public TextPaint e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (a(aVar)) {
                return Build.VERSION.SDK_INT < 18 || this.f2729b == aVar.d();
            }
            return false;
        }

        public int hashCode() {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                return c.h.j.e.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.f2729b, Integer.valueOf(this.f2730c), Integer.valueOf(this.f2731d));
            }
            if (i2 >= 21) {
                return c.h.j.e.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.f2729b, Integer.valueOf(this.f2730c), Integer.valueOf(this.f2731d));
            }
            if (i2 >= 18) {
                return c.h.j.e.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.f2729b, Integer.valueOf(this.f2730c), Integer.valueOf(this.f2731d));
            }
            if (i2 >= 17) {
                return c.h.j.e.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.f2729b, Integer.valueOf(this.f2730c), Integer.valueOf(this.f2731d));
            }
            return c.h.j.e.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTypeface(), this.f2729b, Integer.valueOf(this.f2730c), Integer.valueOf(this.f2731d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.a.getTextSize());
            sb.append(", textScaleX=" + this.a.getTextScaleX());
            sb.append(", textSkewX=" + this.a.getTextSkewX());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 21) {
                sb.append(", letterSpacing=" + this.a.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.a.isElegantTextHeight());
            }
            if (i2 >= 24) {
                sb.append(", textLocale=" + this.a.getTextLocales());
            } else if (i2 >= 17) {
                sb.append(", textLocale=" + this.a.getTextLocale());
            }
            sb.append(", typeface=" + this.a.getTypeface());
            if (i2 >= 26) {
                sb.append(", variationSettings=" + this.a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f2729b);
            sb.append(", breakStrategy=" + this.f2730c);
            sb.append(", hyphenationFrequency=" + this.f2731d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            this.a = params.getTextPaint();
            this.f2729b = params.getTextDirection();
            this.f2730c = params.getBreakStrategy();
            this.f2731d = params.getHyphenationFrequency();
            this.f2732e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
