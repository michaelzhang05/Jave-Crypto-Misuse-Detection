package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final int[] f2053a;

        /* renamed from: b, reason: collision with root package name */
        final float[] f2054b;

        a(int i6, int i7) {
            this.f2053a = new int[]{i6, i7};
            this.f2054b = new float[]{0.0f, 1.0f};
        }

        a(int i6, int i7, int i8) {
            this.f2053a = new int[]{i6, i7, i8};
            this.f2054b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(List list, List list2) {
            int size = list.size();
            this.f2053a = new int[size];
            this.f2054b = new float[size];
            for (int i6 = 0; i6 < size; i6++) {
                this.f2053a[i6] = ((Integer) list.get(i6)).intValue();
                this.f2054b[i6] = ((Float) list2.get(i6)).floatValue();
            }
        }
    }

    private static a a(a aVar, int i6, int i7, boolean z5, int i8) {
        return aVar != null ? aVar : z5 ? new a(i6, i8, i7) : new a(i6, i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray k6 = n.k(resources, theme, attributeSet, s.d.A);
        float f6 = n.f(k6, xmlPullParser, "startX", s.d.J, 0.0f);
        float f7 = n.f(k6, xmlPullParser, "startY", s.d.K, 0.0f);
        float f8 = n.f(k6, xmlPullParser, "endX", s.d.L, 0.0f);
        float f9 = n.f(k6, xmlPullParser, "endY", s.d.M, 0.0f);
        float f10 = n.f(k6, xmlPullParser, "centerX", s.d.E, 0.0f);
        float f11 = n.f(k6, xmlPullParser, "centerY", s.d.F, 0.0f);
        int g6 = n.g(k6, xmlPullParser, "type", s.d.D, 0);
        int b6 = n.b(k6, xmlPullParser, "startColor", s.d.B, 0);
        boolean j6 = n.j(xmlPullParser, "centerColor");
        int b7 = n.b(k6, xmlPullParser, "centerColor", s.d.I, 0);
        int b8 = n.b(k6, xmlPullParser, "endColor", s.d.C, 0);
        int g7 = n.g(k6, xmlPullParser, "tileMode", s.d.H, 0);
        float f12 = n.f(k6, xmlPullParser, "gradientRadius", s.d.G, 0.0f);
        k6.recycle();
        a a6 = a(c(resources, xmlPullParser, attributeSet, theme), b6, b8, j6, b7);
        if (g6 != 1) {
            return g6 != 2 ? new LinearGradient(f6, f7, f8, f9, a6.f2053a, a6.f2054b, d(g7)) : new SweepGradient(f10, f11, a6.f2053a, a6.f2054b);
        }
        if (f12 > 0.0f) {
            return new RadialGradient(f10, f11, f12, a6.f2053a, a6.f2054b, d(g7));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.core.content.res.f.a c(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L85
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L85
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = s.d.N
            android.content.res.TypedArray r3 = androidx.core.content.res.n.k(r8, r11, r10, r3)
            int r5 = s.d.O
            boolean r5 = r3.hasValue(r5)
            int r6 = s.d.P
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = s.d.O
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = s.d.P
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L85:
            int r8 = r4.size()
            if (r8 <= 0) goto L91
            androidx.core.content.res.f$a r8 = new androidx.core.content.res.f$a
            r8.<init>(r4, r2)
            return r8
        L91:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.f.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.f$a");
    }

    private static Shader.TileMode d(int i6) {
        return i6 != 1 ? i6 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
