package androidx.work.impl.m.e;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.n.p;
import androidx.work.n;
import androidx.work.o;

/* compiled from: NetworkMeteredController.java */
/* loaded from: classes.dex */
public class e extends c<androidx.work.impl.m.b> {

    /* renamed from: e, reason: collision with root package name */
    private static final String f1982e = n.f("NetworkMeteredCtrlr");

    public e(Context context, androidx.work.impl.utils.p.a aVar) {
        super(androidx.work.impl.m.f.g.c(context, aVar).d());
    }

    @Override // androidx.work.impl.m.e.c
    boolean b(p pVar) {
        return pVar.l.b() == o.METERED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.work.impl.m.e.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(androidx.work.impl.m.b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (bVar.a() && bVar.b()) ? false : true;
        }
        n.c().a(f1982e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !bVar.a();
    }
}
