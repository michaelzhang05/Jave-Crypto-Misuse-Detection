package Q;

import com.google.android.gms.tasks.Task;
import q0.C3826j;

/* renamed from: Q.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1399o {

    /* renamed from: a, reason: collision with root package name */
    private static final L f9061a = new I();

    /* renamed from: Q.o$a */
    /* loaded from: classes3.dex */
    public interface a {
        Object a(O.j jVar);
    }

    public static Task a(O.g gVar, a aVar) {
        L l8 = f9061a;
        C3826j c3826j = new C3826j();
        gVar.a(new J(gVar, c3826j, aVar, l8));
        return c3826j.a();
    }

    public static Task b(O.g gVar) {
        return a(gVar, new K());
    }
}
