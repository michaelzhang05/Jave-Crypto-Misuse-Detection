package R;

import com.google.android.gms.tasks.Task;
import r0.C3679j;

/* renamed from: R.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1318o {

    /* renamed from: a, reason: collision with root package name */
    private static final L f8599a = new I();

    /* renamed from: R.o$a */
    /* loaded from: classes3.dex */
    public interface a {
        Object a(P.j jVar);
    }

    public static Task a(P.g gVar, a aVar) {
        L l8 = f8599a;
        C3679j c3679j = new C3679j();
        gVar.a(new J(gVar, c3679j, aVar, l8));
        return c3679j.a();
    }

    public static Task b(P.g gVar) {
        return a(gVar, new K());
    }
}
