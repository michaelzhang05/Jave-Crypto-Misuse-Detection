package io.sentry.vendor;

import java.io.UnsupportedEncodingException;

/* compiled from: Base64.java */
/* loaded from: classes2.dex */
public class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Base64.java */
    /* renamed from: io.sentry.vendor.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0268a {
        public byte[] a;

        /* renamed from: b, reason: collision with root package name */
        public int f19301b;

        AbstractC0268a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Base64.java */
    /* loaded from: classes2.dex */
    public static class b extends AbstractC0268a {

        /* renamed from: c, reason: collision with root package name */
        private static final byte[] f19302c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: d, reason: collision with root package name */
        private static final byte[] f19303d = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f19304e;

        /* renamed from: f, reason: collision with root package name */
        int f19305f;

        /* renamed from: g, reason: collision with root package name */
        private int f19306g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f19307h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f19308i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f19309j;

        /* renamed from: k, reason: collision with root package name */
        private final byte[] f19310k;

        public b(int i2, byte[] bArr) {
            this.a = bArr;
            this.f19307h = (i2 & 1) == 0;
            boolean z = (i2 & 2) == 0;
            this.f19308i = z;
            this.f19309j = (i2 & 4) != 0;
            this.f19310k = (i2 & 8) == 0 ? f19302c : f19303d;
            this.f19304e = new byte[2];
            this.f19305f = 0;
            this.f19306g = z ? 19 : -1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00e6 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 477
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.a.b.a(byte[], int, int, boolean):boolean");
        }
    }

    public static byte[] a(byte[] bArr, int i2) {
        return b(bArr, 0, bArr.length, i2);
    }

    public static byte[] b(byte[] bArr, int i2, int i3, int i4) {
        b bVar = new b(i4, null);
        int i5 = (i3 / 3) * 4;
        if (bVar.f19307h) {
            if (i3 % 3 > 0) {
                i5 += 4;
            }
        } else {
            int i6 = i3 % 3;
            if (i6 == 1) {
                i5 += 2;
            } else if (i6 == 2) {
                i5 += 3;
            }
        }
        if (bVar.f19308i && i3 > 0) {
            i5 += (((i3 - 1) / 57) + 1) * (bVar.f19309j ? 2 : 1);
        }
        bVar.a = new byte[i5];
        bVar.a(bArr, i2, i3, true);
        return bVar.a;
    }

    public static String c(byte[] bArr, int i2) {
        try {
            return new String(a(bArr, i2), "US-ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }
}
