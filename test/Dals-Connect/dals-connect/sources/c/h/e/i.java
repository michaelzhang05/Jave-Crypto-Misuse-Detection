package c.h.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import androidx.core.content.d.c;
import c.h.h.f;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: TypefaceCompatApi29Impl.java */
/* loaded from: classes.dex */
public class i extends j {
    @Override // c.h.e.j
    public Typeface b(Context context, c.b bVar, Resources resources, int i2) {
        try {
            c.C0019c[] a = bVar.a();
            int length = a.length;
            FontFamily.Builder builder = null;
            int i3 = 0;
            while (true) {
                int i4 = 1;
                if (i3 >= length) {
                    break;
                }
                c.C0019c c0019c = a[i3];
                try {
                    Font.Builder weight = new Font.Builder(resources, c0019c.b()).setWeight(c0019c.e());
                    if (!c0019c.f()) {
                        i4 = 0;
                    }
                    Font build = weight.setSlant(i4).setTtcIndex(c0019c.c()).setFontVariationSettings(c0019c.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
                i3++;
            }
            if (builder == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i2 & 1) != 0 ? 700 : 400, (i2 & 2) != 0 ? 1 : 0)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x005a, code lost:
    
        if (r4 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        if ((r14 & 1) == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0063, code lost:
    
        r12 = 700;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006a, code lost:
    
        if ((r14 & 2) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006c, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        return new android.graphics.Typeface.CustomFallbackBuilder(r4.build()).setStyle(new android.graphics.fonts.FontStyle(r12, r2)).build();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0066, code lost:
    
        r12 = 400;
     */
    @Override // c.h.e.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Typeface c(android.content.Context r11, android.os.CancellationSignal r12, c.h.h.f.b[] r13, int r14) {
        /*
            r10 = this;
            android.content.ContentResolver r11 = r11.getContentResolver()
            r0 = 0
            int r1 = r13.length     // Catch: java.lang.Exception -> L82
            r2 = 0
            r4 = r0
            r3 = 0
        L9:
            r5 = 1
            if (r3 >= r1) goto L5a
            r6 = r13[r3]     // Catch: java.lang.Exception -> L82
            android.net.Uri r7 = r6.d()     // Catch: java.io.IOException -> L57 java.lang.Exception -> L82
            java.lang.String r8 = "r"
            android.os.ParcelFileDescriptor r7 = r11.openFileDescriptor(r7, r8, r12)     // Catch: java.io.IOException -> L57 java.lang.Exception -> L82
            if (r7 != 0) goto L20
            if (r7 == 0) goto L57
        L1c:
            r7.close()     // Catch: java.io.IOException -> L57 java.lang.Exception -> L82
            goto L57
        L20:
            android.graphics.fonts.Font$Builder r8 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Throwable -> L52
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L52
            int r9 = r6.e()     // Catch: java.lang.Throwable -> L52
            android.graphics.fonts.Font$Builder r8 = r8.setWeight(r9)     // Catch: java.lang.Throwable -> L52
            boolean r9 = r6.f()     // Catch: java.lang.Throwable -> L52
            if (r9 == 0) goto L34
            goto L35
        L34:
            r5 = 0
        L35:
            android.graphics.fonts.Font$Builder r5 = r8.setSlant(r5)     // Catch: java.lang.Throwable -> L52
            int r6 = r6.c()     // Catch: java.lang.Throwable -> L52
            android.graphics.fonts.Font$Builder r5 = r5.setTtcIndex(r6)     // Catch: java.lang.Throwable -> L52
            android.graphics.fonts.Font r5 = r5.build()     // Catch: java.lang.Throwable -> L52
            if (r4 != 0) goto L4e
            android.graphics.fonts.FontFamily$Builder r6 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.lang.Throwable -> L52
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L52
            r4 = r6
            goto L1c
        L4e:
            r4.addFont(r5)     // Catch: java.lang.Throwable -> L52
            goto L1c
        L52:
            r5 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L56
        L56:
            throw r5     // Catch: java.io.IOException -> L57 java.lang.Exception -> L82
        L57:
            int r3 = r3 + 1
            goto L9
        L5a:
            if (r4 != 0) goto L5d
            return r0
        L5d:
            android.graphics.fonts.FontStyle r11 = new android.graphics.fonts.FontStyle     // Catch: java.lang.Exception -> L82
            r12 = r14 & 1
            if (r12 == 0) goto L66
            r12 = 700(0x2bc, float:9.81E-43)
            goto L68
        L66:
            r12 = 400(0x190, float:5.6E-43)
        L68:
            r13 = r14 & 2
            if (r13 == 0) goto L6d
            r2 = 1
        L6d:
            r11.<init>(r12, r2)     // Catch: java.lang.Exception -> L82
            android.graphics.Typeface$CustomFallbackBuilder r12 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L82
            android.graphics.fonts.FontFamily r13 = r4.build()     // Catch: java.lang.Exception -> L82
            r12.<init>(r13)     // Catch: java.lang.Exception -> L82
            android.graphics.Typeface$CustomFallbackBuilder r11 = r12.setStyle(r11)     // Catch: java.lang.Exception -> L82
            android.graphics.Typeface r11 = r11.build()     // Catch: java.lang.Exception -> L82
            return r11
        L82:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.e.i.c(android.content.Context, android.os.CancellationSignal, c.h.h.f$b[], int):android.graphics.Typeface");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.h.e.j
    public Typeface d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // c.h.e.j
    public Typeface e(Context context, Resources resources, int i2, String str, int i3) {
        try {
            Font build = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.h.e.j
    public f.b h(f.b[] bVarArr, int i2) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
