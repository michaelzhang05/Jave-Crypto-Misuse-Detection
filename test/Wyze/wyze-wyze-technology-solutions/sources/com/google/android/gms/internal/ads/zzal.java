package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzal {
    private static final Comparator<byte[]> a = new k2();

    /* renamed from: b, reason: collision with root package name */
    private final List<byte[]> f12766b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<byte[]> f12767c = new ArrayList(64);

    /* renamed from: d, reason: collision with root package name */
    private int f12768d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final int f12769e = RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT;

    public zzal(int i2) {
    }

    private final synchronized void c() {
        while (this.f12768d > this.f12769e) {
            byte[] remove = this.f12766b.remove(0);
            this.f12767c.remove(remove);
            this.f12768d -= remove.length;
        }
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f12769e) {
                this.f12766b.add(bArr);
                int binarySearch = Collections.binarySearch(this.f12767c, bArr, a);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f12767c.add(binarySearch, bArr);
                this.f12768d += bArr.length;
                c();
            }
        }
    }

    public final synchronized byte[] b(int i2) {
        for (int i3 = 0; i3 < this.f12767c.size(); i3++) {
            byte[] bArr = this.f12767c.get(i3);
            if (bArr.length >= i2) {
                this.f12768d -= bArr.length;
                this.f12767c.remove(i3);
                this.f12766b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i2];
    }
}
