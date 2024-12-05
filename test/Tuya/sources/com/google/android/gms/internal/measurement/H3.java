package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class H3 implements Y4 {
    protected int zzb = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    public static void f(Iterable iterable, List list) {
        byte[] bArr = B4.f15272d;
        iterable.getClass();
        if (iterable instanceof G4) {
            List f8 = ((G4) iterable).f();
            G4 g42 = (G4) list;
            int size = list.size();
            for (Object obj : f8) {
                if (obj == null) {
                    String str = "Element at index " + (g42.size() - size) + " is null.";
                    int size2 = g42.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        } else {
                            g42.remove(size2);
                        }
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof X3) {
                    g42.T((X3) obj);
                } else {
                    g42.add((String) obj);
                }
            }
            return;
        }
        if (!(iterable instanceof InterfaceC1992f5)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    String str2 = "Element at index " + (list.size() - size3) + " is null.";
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 < size3) {
                            break;
                        } else {
                            list.remove(size4);
                        }
                    }
                    throw new NullPointerException(str2);
                }
                list.add(obj2);
            }
            return;
        }
        list.addAll((Collection) iterable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int e(InterfaceC2026j5 interfaceC2026j5);

    public final byte[] g() {
        try {
            int a8 = a();
            byte[] bArr = new byte[a8];
            AbstractC1991f4 A8 = AbstractC1991f4.A(bArr, 0, a8);
            d(A8);
            A8.a();
            return bArr;
        } catch (IOException e8) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e8);
        }
    }
}
