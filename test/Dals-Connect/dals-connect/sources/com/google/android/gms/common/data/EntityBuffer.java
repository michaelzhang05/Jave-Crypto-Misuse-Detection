package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {

    /* renamed from: g, reason: collision with root package name */
    private boolean f10793g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<Integer> f10794h;

    private final void w() {
        synchronized (this) {
            if (!this.f10793g) {
                int count = this.f10769f.getCount();
                ArrayList<Integer> arrayList = new ArrayList<>();
                this.f10794h = arrayList;
                if (count > 0) {
                    arrayList.add(0);
                    String o = o();
                    String J = this.f10769f.J(o, 0, this.f10769f.L(0));
                    for (int i2 = 1; i2 < count; i2++) {
                        int L = this.f10769f.L(i2);
                        String J2 = this.f10769f.J(o, i2, L);
                        if (J2 != null) {
                            if (!J2.equals(J)) {
                                this.f10794h.add(Integer.valueOf(i2));
                                J = J2;
                            }
                        } else {
                            StringBuilder sb = new StringBuilder(String.valueOf(o).length() + 78);
                            sb.append("Missing value for markerColumn: ");
                            sb.append(o);
                            sb.append(", at row: ");
                            sb.append(i2);
                            sb.append(", for window: ");
                            sb.append(L);
                            throw new NullPointerException(sb.toString());
                        }
                    }
                }
                this.f10793g = true;
            }
        }
    }

    private final int x(int i2) {
        if (i2 >= 0 && i2 < this.f10794h.size()) {
            return this.f10794h.get(i2).intValue();
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Position ");
        sb.append(i2);
        sb.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(sb.toString());
    }

    @KeepForSdk
    protected String b() {
        return null;
    }

    @KeepForSdk
    protected abstract T f(int i2, int i3);

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        if (r6.f10769f.J(r4, r7, r3) == null) goto L19;
     */
    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T get(int r7) {
        /*
            r6 = this;
            r6.w()
            int r0 = r6.x(r7)
            r1 = 0
            if (r7 < 0) goto L67
            java.util.ArrayList<java.lang.Integer> r2 = r6.f10794h
            int r2 = r2.size()
            if (r7 != r2) goto L13
            goto L67
        L13:
            java.util.ArrayList<java.lang.Integer> r2 = r6.f10794h
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 - r3
            if (r7 != r2) goto L30
            com.google.android.gms.common.data.DataHolder r2 = r6.f10769f
            int r2 = r2.getCount()
            java.util.ArrayList<java.lang.Integer> r4 = r6.f10794h
            java.lang.Object r4 = r4.get(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L4a
        L30:
            java.util.ArrayList<java.lang.Integer> r2 = r6.f10794h
            int r4 = r7 + 1
            java.lang.Object r2 = r2.get(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.ArrayList<java.lang.Integer> r4 = r6.f10794h
            java.lang.Object r4 = r4.get(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
        L4a:
            int r2 = r2 - r4
            if (r2 != r3) goto L66
            int r7 = r6.x(r7)
            com.google.android.gms.common.data.DataHolder r3 = r6.f10769f
            int r3 = r3.L(r7)
            java.lang.String r4 = r6.b()
            if (r4 == 0) goto L66
            com.google.android.gms.common.data.DataHolder r5 = r6.f10769f
            java.lang.String r7 = r5.J(r4, r7, r3)
            if (r7 != 0) goto L66
            goto L67
        L66:
            r1 = r2
        L67:
            java.lang.Object r7 = r6.f(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.EntityBuffer.get(int):java.lang.Object");
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    public int getCount() {
        w();
        return this.f10794h.size();
    }

    @KeepForSdk
    protected abstract String o();
}
