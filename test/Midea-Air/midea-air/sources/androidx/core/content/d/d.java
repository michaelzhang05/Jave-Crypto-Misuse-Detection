package androidx.core.content.d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GradientColorInflaterCompat.java */
/* loaded from: classes.dex */
public final class d {
    private static a a(a aVar, int i2, int i3, boolean z, int i4) {
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return new a(i2, i4, i3);
        }
        return new a(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray s = g.s(resources, theme, attributeSet, c.h.d.y);
            float j2 = g.j(s, xmlPullParser, "startX", c.h.d.H, 0.0f);
            float j3 = g.j(s, xmlPullParser, "startY", c.h.d.I, 0.0f);
            float j4 = g.j(s, xmlPullParser, "endX", c.h.d.J, 0.0f);
            float j5 = g.j(s, xmlPullParser, "endY", c.h.d.K, 0.0f);
            float j6 = g.j(s, xmlPullParser, "centerX", c.h.d.C, 0.0f);
            float j7 = g.j(s, xmlPullParser, "centerY", c.h.d.D, 0.0f);
            int k2 = g.k(s, xmlPullParser, "type", c.h.d.B, 0);
            int f2 = g.f(s, xmlPullParser, "startColor", c.h.d.z, 0);
            boolean r = g.r(xmlPullParser, "centerColor");
            int f3 = g.f(s, xmlPullParser, "centerColor", c.h.d.G, 0);
            int f4 = g.f(s, xmlPullParser, "endColor", c.h.d.A, 0);
            int k3 = g.k(s, xmlPullParser, "tileMode", c.h.d.F, 0);
            float j8 = g.j(s, xmlPullParser, "gradientRadius", c.h.d.E, 0.0f);
            s.recycle();
            a a2 = a(c(resources, xmlPullParser, attributeSet, theme), f2, f4, r, f3);
            if (k2 != 1) {
                if (k2 != 2) {
                    return new LinearGradient(j2, j3, j4, j5, a2.a, a2.f916b, d(k3));
                }
                return new SweepGradient(j6, j7, a2.a, a2.f916b);
            }
            if (j8 > 0.0f) {
                return new RadialGradient(j6, j7, j8, a2.a, a2.f916b, d(k3));
            }
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.core.content.d.d.a c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = c.h.d.L
            android.content.res.TypedArray r3 = androidx.core.content.d.g.s(r9, r12, r11, r3)
            int r5 = c.h.d.M
            boolean r6 = r3.hasValue(r5)
            int r7 = c.h.d.N
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            androidx.core.content.d.d$a r9 = new androidx.core.content.d.d$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.d.d.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.d.d$a");
    }

    private static Shader.TileMode d(int i2) {
        if (i2 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i2 != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GradientColorInflaterCompat.java */
    /* loaded from: classes.dex */
    public static final class a {
        final int[] a;

        /* renamed from: b, reason: collision with root package name */
        final float[] f916b;

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.a = new int[size];
            this.f916b = new float[size];
            for (int i2 = 0; i2 < size; i2++) {
                this.a[i2] = list.get(i2).intValue();
                this.f916b[i2] = list2.get(i2).floatValue();
            }
        }

        a(int i2, int i3) {
            this.a = new int[]{i2, i3};
            this.f916b = new float[]{0.0f, 1.0f};
        }

        a(int i2, int i3, int i4) {
            this.a = new int[]{i2, i3, i4};
            this.f916b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
