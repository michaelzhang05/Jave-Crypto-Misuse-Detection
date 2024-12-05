package F;

import android.util.SparseArray;
import java.util.HashMap;
import s.f;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static SparseArray f2672a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    private static HashMap f2673b;

    static {
        HashMap hashMap = new HashMap();
        f2673b = hashMap;
        hashMap.put(f.DEFAULT, 0);
        f2673b.put(f.VERY_LOW, 1);
        f2673b.put(f.HIGHEST, 2);
        for (f fVar : f2673b.keySet()) {
            f2672a.append(((Integer) f2673b.get(fVar)).intValue(), fVar);
        }
    }

    public static int a(f fVar) {
        Integer num = (Integer) f2673b.get(fVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + fVar);
    }

    public static f b(int i8) {
        f fVar = (f) f2672a.get(i8);
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i8);
    }
}
