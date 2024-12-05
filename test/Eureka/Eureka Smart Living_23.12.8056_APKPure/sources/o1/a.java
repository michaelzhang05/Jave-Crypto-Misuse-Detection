package o1;

import android.util.SparseArray;
import b1.d;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static SparseArray f8215a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    private static HashMap f8216b;

    static {
        HashMap hashMap = new HashMap();
        f8216b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        f8216b.put(d.VERY_LOW, 1);
        f8216b.put(d.HIGHEST, 2);
        for (d dVar : f8216b.keySet()) {
            f8215a.append(((Integer) f8216b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f8216b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i6) {
        d dVar = (d) f8215a.get(i6);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i6);
    }
}
