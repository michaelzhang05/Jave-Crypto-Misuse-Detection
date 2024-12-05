package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.impl.n.p;
import androidx.work.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConstraintsCommandHandler.java */
/* loaded from: classes.dex */
public class c {
    private static final String a = n.f("ConstraintsCmdHandler");

    /* renamed from: b, reason: collision with root package name */
    private final Context f1850b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1851c;

    /* renamed from: d, reason: collision with root package name */
    private final e f1852d;

    /* renamed from: e, reason: collision with root package name */
    private final androidx.work.impl.m.d f1853e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, int i2, e eVar) {
        this.f1850b = context;
        this.f1851c = i2;
        this.f1852d = eVar;
        this.f1853e = new androidx.work.impl.m.d(context, eVar.f(), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        List<p> g2 = this.f1852d.g().t().j().g();
        ConstraintProxy.a(this.f1850b, g2);
        this.f1853e.d(g2);
        ArrayList arrayList = new ArrayList(g2.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (p pVar : g2) {
            String str = pVar.f2018c;
            if (currentTimeMillis >= pVar.a() && (!pVar.b() || this.f1853e.c(str))) {
                arrayList.add(pVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((p) it.next()).f2018c;
            Intent b2 = b.b(this.f1850b, str2);
            n.c().a(a, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            e eVar = this.f1852d;
            eVar.k(new e.b(eVar, b2, this.f1851c));
        }
        this.f1853e.e();
    }
}
