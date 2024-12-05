package com.airbnb.lottie.u;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: AnimatablePathValueParser.java */
/* loaded from: classes.dex */
public class a {
    public static com.airbnb.lottie.s.i.e a(JsonReader jsonReader, com.airbnb.lottie.d dVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(w.a(jsonReader, dVar));
            }
            jsonReader.endArray();
            r.b(arrayList);
        } else {
            arrayList.add(new com.airbnb.lottie.w.a(p.e(jsonReader, com.airbnb.lottie.v.f.e())));
        }
        return new com.airbnb.lottie.s.i.e(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0044 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.airbnb.lottie.s.i.m<android.graphics.PointF, android.graphics.PointF> b(android.util.JsonReader r9, com.airbnb.lottie.d r10) throws java.io.IOException {
        /*
            r9.beginObject()
            r0 = 0
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = 0
        L8:
            android.util.JsonToken r5 = r9.peek()
            android.util.JsonToken r6 = android.util.JsonToken.END_OBJECT
            if (r5 == r6) goto L70
            java.lang.String r5 = r9.nextName()
            r5.hashCode()
            r6 = -1
            int r7 = r5.hashCode()
            r8 = 1
            switch(r7) {
                case 107: goto L37;
                case 120: goto L2c;
                case 121: goto L21;
                default: goto L20;
            }
        L20:
            goto L41
        L21:
            java.lang.String r7 = "y"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L2a
            goto L41
        L2a:
            r6 = 2
            goto L41
        L2c:
            java.lang.String r7 = "x"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L35
            goto L41
        L35:
            r6 = 1
            goto L41
        L37:
            java.lang.String r7 = "k"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L40
            goto L41
        L40:
            r6 = 0
        L41:
            switch(r6) {
                case 0: goto L6b;
                case 1: goto L59;
                case 2: goto L48;
                default: goto L44;
            }
        L44:
            r9.skipValue()
            goto L8
        L48:
            android.util.JsonToken r5 = r9.peek()
            android.util.JsonToken r6 = android.util.JsonToken.STRING
            if (r5 != r6) goto L54
            r9.skipValue()
            goto L64
        L54:
            com.airbnb.lottie.s.i.b r3 = com.airbnb.lottie.u.d.e(r9, r10)
            goto L8
        L59:
            android.util.JsonToken r5 = r9.peek()
            android.util.JsonToken r6 = android.util.JsonToken.STRING
            if (r5 != r6) goto L66
            r9.skipValue()
        L64:
            r4 = 1
            goto L8
        L66:
            com.airbnb.lottie.s.i.b r2 = com.airbnb.lottie.u.d.e(r9, r10)
            goto L8
        L6b:
            com.airbnb.lottie.s.i.e r1 = a(r9, r10)
            goto L8
        L70:
            r9.endObject()
            if (r4 == 0) goto L7a
            java.lang.String r9 = "Lottie doesn't support expressions."
            r10.a(r9)
        L7a:
            if (r1 == 0) goto L7d
            return r1
        L7d:
            com.airbnb.lottie.s.i.i r9 = new com.airbnb.lottie.s.i.i
            r9.<init>(r2, r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.u.a.b(android.util.JsonReader, com.airbnb.lottie.d):com.airbnb.lottie.s.i.m");
    }
}
