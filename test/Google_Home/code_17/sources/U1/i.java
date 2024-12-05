package U1;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
abstract class i {

    /* renamed from: a, reason: collision with root package name */
    static final Map f10319a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(h.f10316b, new HashSet(Arrays.asList(f.SIGN, f.VERIFY)));
        hashMap.put(h.f10317c, new HashSet(Arrays.asList(f.ENCRYPT, f.DECRYPT, f.WRAP_KEY, f.UNWRAP_KEY)));
        f10319a = DesugarCollections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(h hVar, Set set) {
        if (hVar == null || set == null) {
            return true;
        }
        Map map = f10319a;
        if (!map.containsKey(hVar) || ((Set) map.get(hVar)).containsAll(set)) {
            return true;
        }
        return false;
    }
}
