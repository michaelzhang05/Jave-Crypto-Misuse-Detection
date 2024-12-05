package com.airbnb.lottie.u;

/* compiled from: ShapeFillParser.java */
/* loaded from: classes.dex */
class e0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.airbnb.lottie.s.j.m a(android.util.JsonReader r10, com.airbnb.lottie.d r11) throws java.io.IOException {
        /*
            r0 = 0
            r1 = 1
            r2 = 0
            r4 = r2
            r7 = r4
            r8 = r7
            r2 = 1
            r5 = 0
        L8:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L77
            java.lang.String r3 = r10.nextName()
            r3.hashCode()
            r6 = -1
            int r9 = r3.hashCode()
            switch(r9) {
                case -396065730: goto L4a;
                case 99: goto L3f;
                case 111: goto L34;
                case 114: goto L29;
                case 3519: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L54
        L1e:
            java.lang.String r9 = "nm"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L27
            goto L54
        L27:
            r6 = 4
            goto L54
        L29:
            java.lang.String r9 = "r"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L32
            goto L54
        L32:
            r6 = 3
            goto L54
        L34:
            java.lang.String r9 = "o"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L3d
            goto L54
        L3d:
            r6 = 2
            goto L54
        L3f:
            java.lang.String r9 = "c"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L48
            goto L54
        L48:
            r6 = 1
            goto L54
        L4a:
            java.lang.String r9 = "fillEnabled"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L53
            goto L54
        L53:
            r6 = 0
        L54:
            switch(r6) {
                case 0: goto L72;
                case 1: goto L6c;
                case 2: goto L66;
                case 3: goto L61;
                case 4: goto L5b;
                default: goto L57;
            }
        L57:
            r10.skipValue()
            goto L8
        L5b:
            java.lang.String r3 = r10.nextString()
            r4 = r3
            goto L8
        L61:
            int r2 = r10.nextInt()
            goto L8
        L66:
            com.airbnb.lottie.s.i.d r3 = com.airbnb.lottie.u.d.h(r10, r11)
            r8 = r3
            goto L8
        L6c:
            com.airbnb.lottie.s.i.a r3 = com.airbnb.lottie.u.d.c(r10, r11)
            r7 = r3
            goto L8
        L72:
            boolean r5 = r10.nextBoolean()
            goto L8
        L77:
            if (r2 != r1) goto L7c
            android.graphics.Path$FillType r10 = android.graphics.Path.FillType.WINDING
            goto L7e
        L7c:
            android.graphics.Path$FillType r10 = android.graphics.Path.FillType.EVEN_ODD
        L7e:
            r6 = r10
            com.airbnb.lottie.s.j.m r10 = new com.airbnb.lottie.s.j.m
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.u.e0.a(android.util.JsonReader, com.airbnb.lottie.d):com.airbnb.lottie.s.j.m");
    }
}
