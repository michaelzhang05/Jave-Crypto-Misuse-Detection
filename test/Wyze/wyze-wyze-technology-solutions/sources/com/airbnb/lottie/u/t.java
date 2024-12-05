package com.airbnb.lottie.u;

import android.graphics.Rect;
import android.util.JsonReader;
import com.airbnb.lottie.s.k.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LottieCompositionParser.java */
/* loaded from: classes.dex */
public class t {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0049. Please report as an issue. */
    public static com.airbnb.lottie.d a(JsonReader jsonReader) throws IOException {
        c.e.h<com.airbnb.lottie.s.d> hVar;
        HashMap hashMap;
        float e2 = com.airbnb.lottie.v.f.e();
        c.e.d<com.airbnb.lottie.s.k.d> dVar = new c.e.d<>();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        c.e.h<com.airbnb.lottie.s.d> hVar2 = new c.e.h<>();
        com.airbnb.lottie.d dVar2 = new com.airbnb.lottie.d();
        jsonReader.beginObject();
        int i2 = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i3 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c2 = 65535;
            switch (nextName.hashCode()) {
                case -1408207997:
                    if (nextName.equals("assets")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1109732030:
                    if (nextName.equals("layers")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 104:
                    if (nextName.equals("h")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 118:
                    if (nextName.equals("v")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 119:
                    if (nextName.equals("w")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 3276:
                    if (nextName.equals("fr")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 3367:
                    if (nextName.equals("ip")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 3553:
                    if (nextName.equals("op")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 94623709:
                    if (nextName.equals("chars")) {
                        c2 = '\b';
                        break;
                    }
                    break;
                case 97615364:
                    if (nextName.equals("fonts")) {
                        c2 = '\t';
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    hVar = hVar2;
                    hashMap = hashMap4;
                    b(jsonReader, dVar2, hashMap2, hashMap3);
                    continue;
                case 1:
                    hVar = hVar2;
                    hashMap = hashMap4;
                    e(jsonReader, dVar2, arrayList, dVar);
                    continue;
                case 2:
                    hVar = hVar2;
                    hashMap = hashMap4;
                    i3 = jsonReader.nextInt();
                    continue;
                case 3:
                    hVar = hVar2;
                    hashMap = hashMap4;
                    String[] split = jsonReader.nextString().split("\\.");
                    if (!com.airbnb.lottie.v.f.h(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        dVar2.a("Lottie only supports bodymovin >= 4.4.0");
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    hVar = hVar2;
                    hashMap = hashMap4;
                    i2 = jsonReader.nextInt();
                    continue;
                case 5:
                    hVar = hVar2;
                    hashMap = hashMap4;
                    f4 = (float) jsonReader.nextDouble();
                    continue;
                case 6:
                    hVar = hVar2;
                    hashMap = hashMap4;
                    f2 = (float) jsonReader.nextDouble();
                    continue;
                case 7:
                    hVar = hVar2;
                    hashMap = hashMap4;
                    f3 = ((float) jsonReader.nextDouble()) - 0.01f;
                    continue;
                case '\b':
                    c(jsonReader, dVar2, hVar2);
                    break;
                case '\t':
                    d(jsonReader, hashMap4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
            hVar = hVar2;
            hashMap = hashMap4;
            hashMap4 = hashMap;
            hVar2 = hVar;
        }
        jsonReader.endObject();
        dVar2.n(new Rect(0, 0, (int) (i2 * e2), (int) (i3 * e2)), f2, f3, f4, arrayList, dVar, hashMap2, hashMap3, hVar2, hashMap4);
        return dVar2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        switch(r4) {
            case 0: goto L65;
            case 1: goto L64;
            case 2: goto L63;
            case 3: goto L62;
            case 4: goto L61;
            case 5: goto L60;
            default: goto L66;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        r7 = r12.nextString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        r5 = r12.nextInt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        r9 = r12.nextString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:
    
        r8 = r12.nextString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0092, code lost:
    
        r6 = r12.nextInt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
    
        r12.beginArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009e, code lost:
    
        if (r12.hasNext() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
    
        r3 = com.airbnb.lottie.u.s.a(r12, r13);
        r1.k(r3.b(), r3);
        r0.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00af, code lost:
    
        r12.endArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0077, code lost:
    
        r12.skipValue();
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(android.util.JsonReader r12, com.airbnb.lottie.d r13, java.util.Map<java.lang.String, java.util.List<com.airbnb.lottie.s.k.d>> r14, java.util.Map<java.lang.String, com.airbnb.lottie.g> r15) throws java.io.IOException {
        /*
            r12.beginArray()
        L3:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto Lcd
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            c.e.d r1 = new c.e.d
            r1.<init>()
            r12.beginObject()
            r2 = 0
            r3 = 0
            r7 = r3
            r8 = r7
            r9 = r8
            r5 = 0
            r6 = 0
        L1d:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto Lb4
            java.lang.String r3 = r12.nextName()
            r3.hashCode()
            r4 = -1
            int r10 = r3.hashCode()
            switch(r10) {
                case -1109732030: goto L6a;
                case 104: goto L5f;
                case 112: goto L54;
                case 117: goto L49;
                case 119: goto L3e;
                case 3355: goto L33;
                default: goto L32;
            }
        L32:
            goto L74
        L33:
            java.lang.String r10 = "id"
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L3c
            goto L74
        L3c:
            r4 = 5
            goto L74
        L3e:
            java.lang.String r10 = "w"
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L47
            goto L74
        L47:
            r4 = 4
            goto L74
        L49:
            java.lang.String r10 = "u"
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L52
            goto L74
        L52:
            r4 = 3
            goto L74
        L54:
            java.lang.String r10 = "p"
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L5d
            goto L74
        L5d:
            r4 = 2
            goto L74
        L5f:
            java.lang.String r10 = "h"
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L68
            goto L74
        L68:
            r4 = 1
            goto L74
        L6a:
            java.lang.String r10 = "layers"
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L73
            goto L74
        L73:
            r4 = 0
        L74:
            switch(r4) {
                case 0: goto L97;
                case 1: goto L92;
                case 2: goto L8c;
                case 3: goto L86;
                case 4: goto L81;
                case 5: goto L7b;
                default: goto L77;
            }
        L77:
            r12.skipValue()
            goto L1d
        L7b:
            java.lang.String r3 = r12.nextString()
            r7 = r3
            goto L1d
        L81:
            int r5 = r12.nextInt()
            goto L1d
        L86:
            java.lang.String r3 = r12.nextString()
            r9 = r3
            goto L1d
        L8c:
            java.lang.String r3 = r12.nextString()
            r8 = r3
            goto L1d
        L92:
            int r6 = r12.nextInt()
            goto L1d
        L97:
            r12.beginArray()
        L9a:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto Laf
            com.airbnb.lottie.s.k.d r3 = com.airbnb.lottie.u.s.a(r12, r13)
            long r10 = r3.b()
            r1.k(r10, r3)
            r0.add(r3)
            goto L9a
        Laf:
            r12.endArray()
            goto L1d
        Lb4:
            r12.endObject()
            if (r8 == 0) goto Lc8
            com.airbnb.lottie.g r0 = new com.airbnb.lottie.g
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r1 = r0.c()
            r15.put(r1, r0)
            goto L3
        Lc8:
            r14.put(r7, r0)
            goto L3
        Lcd:
            r12.endArray()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.u.t.b(android.util.JsonReader, com.airbnb.lottie.d, java.util.Map, java.util.Map):void");
    }

    private static void c(JsonReader jsonReader, com.airbnb.lottie.d dVar, c.e.h<com.airbnb.lottie.s.d> hVar) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.airbnb.lottie.s.d a = j.a(jsonReader, dVar);
            hVar.l(a.hashCode(), a);
        }
        jsonReader.endArray();
    }

    private static void d(JsonReader jsonReader, Map<String, com.airbnb.lottie.s.c> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("list")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.airbnb.lottie.s.c a = k.a(jsonReader);
                    map.put(a.b(), a);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    private static void e(JsonReader jsonReader, com.airbnb.lottie.d dVar, List<com.airbnb.lottie.s.k.d> list, c.e.d<com.airbnb.lottie.s.k.d> dVar2) throws IOException {
        jsonReader.beginArray();
        int i2 = 0;
        while (jsonReader.hasNext()) {
            com.airbnb.lottie.s.k.d a = s.a(jsonReader, dVar);
            if (a.d() == d.a.Image) {
                i2++;
            }
            list.add(a);
            dVar2.k(a.b(), a);
            if (i2 > 4) {
                com.airbnb.lottie.c.d("You have " + i2 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.endArray();
    }
}
