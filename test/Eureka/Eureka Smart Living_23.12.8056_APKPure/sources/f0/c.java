package f0;

import androidx.lifecycle.f0;
import e5.l;
import f5.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final List f6577a = new ArrayList();

    public final void a(h5.a aVar, l lVar) {
        h.e(aVar, "clazz");
        h.e(lVar, "initializer");
        this.f6577a.add(new f(d5.a.a(aVar), lVar));
    }

    public final f0.b b() {
        f[] fVarArr = (f[]) this.f6577a.toArray(new f[0]);
        return new b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
