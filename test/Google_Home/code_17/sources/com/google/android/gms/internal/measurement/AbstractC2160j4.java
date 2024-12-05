package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2160j4 implements I5 {
    protected int zza = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    public static void f(Iterable iterable, List list) {
        AbstractC2111e5.e(iterable);
        if (iterable instanceof InterfaceC2216p5) {
            List w8 = ((InterfaceC2216p5) iterable).w();
            InterfaceC2216p5 interfaceC2216p5 = (InterfaceC2216p5) list;
            int size = list.size();
            for (Object obj : w8) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC2216p5.size() - size) + " is null.";
                    for (int size2 = interfaceC2216p5.size() - 1; size2 >= size; size2--) {
                        interfaceC2216p5.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC2241s4) {
                    interfaceC2216p5.s((AbstractC2241s4) obj);
                } else if (obj instanceof byte[]) {
                    interfaceC2216p5.s(AbstractC2241s4.m((byte[]) obj));
                } else {
                    interfaceC2216p5.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof S5) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int e(Y5 y52);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int g();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void h(int i8);

    public final byte[] i() {
        try {
            byte[] bArr = new byte[d()];
            K4 D8 = K4.D(bArr);
            a(D8);
            D8.E();
            return bArr;
        } catch (IOException e8) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e8);
        }
    }
}
