package com.mbridge.msdk.e.a.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    protected static final Comparator<byte[]> f18752a = new Comparator<byte[]>() { // from class: com.mbridge.msdk.e.a.a.c.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private final List<byte[]> f18753b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<byte[]> f18754c = new ArrayList(64);

    /* renamed from: d, reason: collision with root package name */
    private int f18755d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final int f18756e;

    public c(int i8) {
        this.f18756e = i8;
    }

    public final synchronized byte[] a(int i8) {
        for (int i9 = 0; i9 < this.f18754c.size(); i9++) {
            byte[] bArr = this.f18754c.get(i9);
            if (bArr.length >= i8) {
                this.f18755d -= bArr.length;
                this.f18754c.remove(i9);
                this.f18753b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i8];
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f18756e) {
                this.f18753b.add(bArr);
                int binarySearch = Collections.binarySearch(this.f18754c, bArr, f18752a);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f18754c.add(binarySearch, bArr);
                this.f18755d += bArr.length;
                a();
            }
        }
    }

    private synchronized void a() {
        while (this.f18755d > this.f18756e) {
            byte[] remove = this.f18753b.remove(0);
            this.f18754c.remove(remove);
            this.f18755d -= remove.length;
        }
    }
}
