package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.foundation.tools.FastKV;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class am implements FastKV.a<Set<String>> {

    /* renamed from: a, reason: collision with root package name */
    static final am f21082a = new am();

    private am() {
    }

    @Override // com.mbridge.msdk.foundation.tools.FastKV.a
    public final /* synthetic */ byte[] a(Set<String> set) {
        Set<String> set2 = set;
        if (set2.isEmpty()) {
            return new byte[0];
        }
        int size = set2.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int i8 = 0;
        int i9 = 0;
        for (String str : set2) {
            if (str == null) {
                i8 += 5;
                iArr[i9] = -1;
            } else {
                int a8 = p.a(str);
                strArr[i9] = str;
                iArr[i9] = a8;
                i8 += ((a8 >> 7) == 0 ? 1 : (a8 >> 14) == 0 ? 2 : (a8 >> 21) == 0 ? 3 : (a8 >> 28) == 0 ? 4 : 5) + a8;
            }
            i9++;
        }
        p pVar = new p(i8);
        for (int i10 = 0; i10 < size; i10++) {
            int i11 = iArr[i10];
            int i12 = pVar.f21148b;
            int i13 = i11;
            while ((i13 & (-128)) != 0) {
                pVar.f21147a[i12] = (byte) ((i13 & 127) | 128);
                i13 >>>= 7;
                i12++;
            }
            pVar.f21147a[i12] = (byte) i13;
            pVar.f21148b = i12 + 1;
            if (i11 >= 0) {
                pVar.b(strArr[i10]);
            }
        }
        return pVar.f21147a;
    }

    @Override // com.mbridge.msdk.foundation.tools.FastKV.a
    public final String a() {
        return "StringSet";
    }

    @Override // com.mbridge.msdk.foundation.tools.FastKV.a
    public final /* synthetic */ Set<String> a(byte[] bArr, int i8, int i9) {
        int i10;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i9 > 0) {
            p pVar = new p(bArr, i8);
            int i11 = i8 + i9;
            while (true) {
                i10 = pVar.f21148b;
                if (i10 >= i11) {
                    break;
                }
                byte[] bArr2 = pVar.f21147a;
                int i12 = i10 + 1;
                pVar.f21148b = i12;
                int i13 = bArr2[i10];
                if ((i13 >> 7) != 0) {
                    int i14 = i10 + 2;
                    pVar.f21148b = i14;
                    i13 = (i13 & 127) | (bArr2[i12] << 7);
                    if ((i13 >> 14) != 0) {
                        int i15 = i13 & 16383;
                        int i16 = i10 + 3;
                        pVar.f21148b = i16;
                        int i17 = i15 | (bArr2[i14] << 14);
                        if ((i17 >> 21) == 0) {
                            i13 = i17;
                        } else {
                            int i18 = i10 + 4;
                            pVar.f21148b = i18;
                            i13 = (bArr2[i16] << 21) | (i17 & 2097151);
                            if ((i13 >> 28) != 0) {
                                pVar.f21148b = i10 + 5;
                                i13 = (268435455 & i13) | (bArr2[i18] << 28);
                            }
                        }
                    }
                }
                linkedHashSet.add(pVar.a(i13));
            }
            if (i10 != i11) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }
}
