package androidx.lifecycle;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: ViewModelStore.java */
/* loaded from: classes.dex */
public class w {
    private final HashMap<String, u> a = new HashMap<>();

    public final void a() {
        Iterator<u> it = this.a.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final u b(String str) {
        return this.a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(String str, u uVar) {
        u put = this.a.put(str, uVar);
        if (put != null) {
            put.c();
        }
    }
}
