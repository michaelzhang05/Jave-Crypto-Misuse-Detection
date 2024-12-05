package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.IOException;

/* loaded from: classes.dex */
public class s0 extends t0 {
    /* JADX WARN: Incorrect condition in loop: B:9:0x0029 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.fonts.Font h(android.graphics.fonts.FontFamily r6, int r7) {
        /*
            r5 = this;
            androidx.core.graphics.e0.a()
            r0 = r7 & 1
            if (r0 == 0) goto La
            r0 = 700(0x2bc, float:9.81E-43)
            goto Lc
        La:
            r0 = 400(0x190, float:5.6E-43)
        Lc:
            r7 = r7 & 2
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L14
            r7 = 1
            goto L15
        L14:
            r7 = 0
        L15:
            android.graphics.fonts.FontStyle r7 = androidx.core.graphics.d0.a(r0, r7)
            android.graphics.fonts.Font r0 = androidx.core.graphics.f0.a(r6, r1)
            android.graphics.fonts.FontStyle r1 = androidx.core.graphics.p0.a(r0)
            int r1 = i(r7, r1)
        L25:
            int r3 = androidx.core.graphics.h0.a(r6)
            if (r2 >= r3) goto L3e
            android.graphics.fonts.Font r3 = androidx.core.graphics.f0.a(r6, r2)
            android.graphics.fonts.FontStyle r4 = androidx.core.graphics.p0.a(r3)
            int r4 = i(r7, r4)
            if (r4 >= r1) goto L3b
            r0 = r3
            r1 = r4
        L3b:
            int r2 = r2 + 1
            goto L25
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.s0.h(android.graphics.fonts.FontFamily, int):android.graphics.fonts.Font");
    }

    private static int i(FontStyle fontStyle, FontStyle fontStyle2) {
        int weight;
        int weight2;
        int slant;
        int slant2;
        weight = fontStyle.getWeight();
        weight2 = fontStyle2.getWeight();
        int abs = Math.abs(weight - weight2) / 100;
        slant = fontStyle.getSlant();
        slant2 = fontStyle2.getSlant();
        return abs + (slant == slant2 ? 0 : 2);
    }

    @Override // androidx.core.graphics.t0
    public Typeface a(Context context, e.c cVar, Resources resources, int i6) {
        FontFamily build;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build2;
        Font.Builder weight;
        Font.Builder slant;
        Font.Builder ttcIndex;
        Font.Builder fontVariationSettings;
        Font build3;
        try {
            FontFamily.Builder builder = null;
            for (e.d dVar : cVar.a()) {
                try {
                    a0.a();
                    weight = x.a(resources, dVar.b()).setWeight(dVar.e());
                    slant = weight.setSlant(dVar.f() ? 1 : 0);
                    ttcIndex = slant.setTtcIndex(dVar.c());
                    fontVariationSettings = ttcIndex.setFontVariationSettings(dVar.d());
                    build3 = fontVariationSettings.build();
                    if (builder == null) {
                        b0.a();
                        builder = y.a(build3);
                    } else {
                        builder.addFont(build3);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            build = builder.build();
            z.a();
            Typeface.CustomFallbackBuilder a6 = w.a(build);
            style = h(build, i6).getStyle();
            style2 = a6.setStyle(style);
            build2 = style2.build();
            return build2;
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.t0
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i6) {
        int i7;
        FontFamily build;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build2;
        ParcelFileDescriptor openFileDescriptor;
        Font.Builder weight;
        Font.Builder slant;
        Font.Builder ttcIndex;
        Font build3;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = bVarArr.length;
            FontFamily.Builder builder = null;
            while (i7 < length) {
                g.b bVar = bVarArr[i7];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(bVar.d(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        a0.a();
                        weight = c0.a(openFileDescriptor).setWeight(bVar.e());
                        slant = weight.setSlant(bVar.f() ? 1 : 0);
                        ttcIndex = slant.setTtcIndex(bVar.c());
                        build3 = ttcIndex.build();
                        if (builder == null) {
                            b0.a();
                            builder = y.a(build3);
                        } else {
                            builder.addFont(build3);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                } else {
                    i7 = openFileDescriptor == null ? i7 + 1 : 0;
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            build = builder.build();
            z.a();
            Typeface.CustomFallbackBuilder a6 = w.a(build);
            style = h(build, i6).getStyle();
            style2 = a6.setStyle(style);
            build2 = style2.build();
            return build2;
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.t0
    public Typeface d(Context context, Resources resources, int i6, String str, int i7) {
        Font build;
        FontFamily build2;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build3;
        try {
            a0.a();
            build = x.a(resources, i6).build();
            b0.a();
            build2 = y.a(build).build();
            z.a();
            Typeface.CustomFallbackBuilder a6 = w.a(build2);
            style = build.getStyle();
            style2 = a6.setStyle(style);
            build3 = style2.build();
            return build3;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.graphics.t0
    public g.b g(g.b[] bVarArr, int i6) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
