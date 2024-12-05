package androidx.core.text;

import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class s implements Spannable {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final TextPaint f2241a;

        /* renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f2242b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2243c;

        /* renamed from: d, reason: collision with root package name */
        private final int f2244d;

        /* renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f2245e;

        /* renamed from: androidx.core.text.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0033a {

            /* renamed from: a, reason: collision with root package name */
            private final TextPaint f2246a;

            /* renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f2247b;

            /* renamed from: c, reason: collision with root package name */
            private int f2248c;

            /* renamed from: d, reason: collision with root package name */
            private int f2249d;

            public C0033a(TextPaint textPaint) {
                this.f2246a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f2248c = 1;
                    this.f2249d = 1;
                } else {
                    this.f2249d = 0;
                    this.f2248c = 0;
                }
                this.f2247b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            public a a() {
                return new a(this.f2246a, this.f2247b, this.f2248c, this.f2249d);
            }

            public C0033a b(int i6) {
                this.f2248c = i6;
                return this;
            }

            public C0033a c(int i6) {
                this.f2249d = i6;
                return this;
            }

            public C0033a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f2247b = textDirectionHeuristic;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f2241a = textPaint;
            textDirection = params.getTextDirection();
            this.f2242b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f2243c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f2244d = hyphenationFrequency;
            this.f2245e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        public boolean a(a aVar) {
            LocaleList textLocales;
            LocaleList textLocales2;
            boolean equals;
            int i6 = Build.VERSION.SDK_INT;
            if ((i6 >= 23 && (this.f2243c != aVar.b() || this.f2244d != aVar.c())) || this.f2241a.getTextSize() != aVar.e().getTextSize() || this.f2241a.getTextScaleX() != aVar.e().getTextScaleX() || this.f2241a.getTextSkewX() != aVar.e().getTextSkewX() || this.f2241a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f2241a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f2241a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i6 >= 24) {
                textLocales = this.f2241a.getTextLocales();
                textLocales2 = aVar.e().getTextLocales();
                equals = textLocales.equals(textLocales2);
                if (!equals) {
                    return false;
                }
            } else if (!this.f2241a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            return this.f2241a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f2241a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f2243c;
        }

        public int c() {
            return this.f2244d;
        }

        public TextDirectionHeuristic d() {
            return this.f2242b;
        }

        public TextPaint e() {
            return this.f2241a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f2242b == aVar.d();
        }

        public int hashCode() {
            LocaleList textLocales;
            if (Build.VERSION.SDK_INT < 24) {
                return androidx.core.util.c.b(Float.valueOf(this.f2241a.getTextSize()), Float.valueOf(this.f2241a.getTextScaleX()), Float.valueOf(this.f2241a.getTextSkewX()), Float.valueOf(this.f2241a.getLetterSpacing()), Integer.valueOf(this.f2241a.getFlags()), this.f2241a.getTextLocale(), this.f2241a.getTypeface(), Boolean.valueOf(this.f2241a.isElegantTextHeight()), this.f2242b, Integer.valueOf(this.f2243c), Integer.valueOf(this.f2244d));
            }
            textLocales = this.f2241a.getTextLocales();
            return androidx.core.util.c.b(Float.valueOf(this.f2241a.getTextSize()), Float.valueOf(this.f2241a.getTextScaleX()), Float.valueOf(this.f2241a.getTextSkewX()), Float.valueOf(this.f2241a.getLetterSpacing()), Integer.valueOf(this.f2241a.getFlags()), textLocales, this.f2241a.getTypeface(), Boolean.valueOf(this.f2241a.isElegantTextHeight()), this.f2242b, Integer.valueOf(this.f2243c), Integer.valueOf(this.f2244d));
        }

        public String toString() {
            StringBuilder sb;
            Object textLocale;
            String fontVariationSettings;
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f2241a.getTextSize());
            sb2.append(", textScaleX=" + this.f2241a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f2241a.getTextSkewX());
            int i6 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f2241a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f2241a.isElegantTextHeight());
            if (i6 >= 24) {
                sb = new StringBuilder();
                sb.append(", textLocale=");
                textLocale = this.f2241a.getTextLocales();
            } else {
                sb = new StringBuilder();
                sb.append(", textLocale=");
                textLocale = this.f2241a.getTextLocale();
            }
            sb.append(textLocale);
            sb2.append(sb.toString());
            sb2.append(", typeface=" + this.f2241a.getTypeface());
            if (i6 >= 26) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(", variationSettings=");
                fontVariationSettings = this.f2241a.getFontVariationSettings();
                sb3.append(fontVariationSettings);
                sb2.append(sb3.toString());
            }
            sb2.append(", textDir=" + this.f2242b);
            sb2.append(", breakStrategy=" + this.f2243c);
            sb2.append(", hyphenationFrequency=" + this.f2244d);
            sb2.append("}");
            return sb2.toString();
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i6, int i7) {
            PrecomputedText.Params params;
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            if (Build.VERSION.SDK_INT >= 29) {
                i.a();
                breakStrategy = h.a(textPaint).setBreakStrategy(i6);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i7);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                params = textDirection.build();
            } else {
                params = null;
            }
            this.f2245e = params;
            this.f2241a = textPaint;
            this.f2242b = textDirectionHeuristic;
            this.f2243c = i6;
            this.f2244d = i7;
        }
    }
}
