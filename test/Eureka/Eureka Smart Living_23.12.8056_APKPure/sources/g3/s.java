package g3;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList f6736a = new CopyOnWriteArrayList();

    public static r a(String str) {
        Iterator it = f6736a.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar.b(str)) {
                return rVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
