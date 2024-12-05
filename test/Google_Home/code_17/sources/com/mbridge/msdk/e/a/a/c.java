package com.mbridge.msdk.e.a.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    protected static final Comparator<byte[]> f19807a = new Comparator<byte[]>() { // from class: com.mbridge.msdk.e.a.a.c.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private final List<byte[]> f19808b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<byte[]> f19809c = new ArrayList(64);

    /* renamed from: d, reason: collision with root package name */
    private int f19810d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final int f19811e;

    public c(int i8) {
        this.f19811e = i8;
    }

    public final synchronized byte[] a(int i8) {
        for (int i9 = 0; i9 < this.f19809c.size(); i9++) {
            byte[] bArr = this.f19809c.get(i9);
            if (bArr.length >= i8) {
                this.f19810d -= bArr.length;
                this.f19809c.remove(i9);
                this.f19808b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i8];
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f19811e) {
                this.f19808b.add(bArr);
                int binarySearch = Collections.binarySearch(this.f19809c, bArr, f19807a);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f19809c.add(binarySearch, bArr);
                this.f19810d += bArr.length;
                a();
            }
        }
    }

    private synchronized void a() {
        while (this.f19810d > this.f19811e) {
            byte[] remove = this.f19808b.remove(0);
            this.f19809c.remove(remove);
            this.f19810d -= remove.length;
        }
    }
}
