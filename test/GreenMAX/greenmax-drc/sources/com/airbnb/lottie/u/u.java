package com.airbnb.lottie.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MaskParser.java */
/* loaded from: classes.dex */
public class u {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.equals("s") == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.airbnb.lottie.s.j.g a(android.util.JsonReader r9, com.airbnb.lottie.d r10) throws java.io.IOException {
        /*
            r9.beginObject()
            r0 = 0
            r1 = r0
            r2 = r1
        L6:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto Lb4
            java.lang.String r3 = r9.nextName()
            r3.hashCode()
            int r4 = r3.hashCode()
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = -1
            switch(r4) {
                case 111: goto L36;
                case 3588: goto L2b;
                case 3357091: goto L20;
                default: goto L1e;
            }
        L1e:
            r4 = -1
            goto L40
        L20:
            java.lang.String r4 = "mode"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L29
            goto L1e
        L29:
            r4 = 2
            goto L40
        L2b:
            java.lang.String r4 = "pt"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L34
            goto L1e
        L34:
            r4 = 1
            goto L40
        L36:
            java.lang.String r4 = "o"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L3f
            goto L1e
        L3f:
            r4 = 0
        L40:
            switch(r4) {
                case 0: goto Lae;
                case 1: goto La8;
                case 2: goto L47;
                default: goto L43;
            }
        L43:
            r9.skipValue()
            goto L6
        L47:
            java.lang.String r0 = r9.nextString()
            r0.hashCode()
            int r4 = r0.hashCode()
            switch(r4) {
                case 97: goto L6b;
                case 105: goto L60;
                case 115: goto L57;
                default: goto L55;
            }
        L55:
            r5 = -1
            goto L75
        L57:
            java.lang.String r4 = "s"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L75
            goto L55
        L60:
            java.lang.String r4 = "i"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L69
            goto L55
        L69:
            r5 = 1
            goto L75
        L6b:
            java.lang.String r4 = "a"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L74
            goto L55
        L74:
            r5 = 0
        L75:
            switch(r5) {
                case 0: goto La4;
                case 1: goto L9b;
                case 2: goto L97;
                default: goto L78;
            }
        L78:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Unknown mask mode "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = ". Defaulting to Add."
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "LOTTIE"
            android.util.Log.w(r3, r0)
            com.airbnb.lottie.s.j.g$a r0 = com.airbnb.lottie.s.j.g.a.MaskModeAdd
            goto L6
        L97:
            com.airbnb.lottie.s.j.g$a r0 = com.airbnb.lottie.s.j.g.a.MaskModeSubtract
            goto L6
        L9b:
            java.lang.String r0 = "Animation contains intersect masks. They are not supported but will be treated like add masks."
            r10.a(r0)
            com.airbnb.lottie.s.j.g$a r0 = com.airbnb.lottie.s.j.g.a.MaskModeIntersect
            goto L6
        La4:
            com.airbnb.lottie.s.j.g$a r0 = com.airbnb.lottie.s.j.g.a.MaskModeAdd
            goto L6
        La8:
            com.airbnb.lottie.s.i.h r1 = com.airbnb.lottie.u.d.k(r9, r10)
            goto L6
        Lae:
            com.airbnb.lottie.s.i.d r2 = com.airbnb.lottie.u.d.h(r9, r10)
            goto L6
        Lb4:
            r9.endObject()
            com.airbnb.lottie.s.j.g r9 = new com.airbnb.lottie.s.j.g
            r9.<init>(r0, r1, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.u.u.a(android.util.JsonReader, com.airbnb.lottie.d):com.airbnb.lottie.s.j.g");
    }
}
