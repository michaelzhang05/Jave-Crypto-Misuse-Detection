package io.sentry.clientreport;

import io.sentry.a1;
import io.sentry.h4;
import io.sentry.j4;
import io.sentry.r4;
import io.sentry.s4;
import io.sentry.x4;
import io.sentry.z0;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ClientReportRecorder.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class d implements g {
    private final h a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final x4 f18887b;

    public d(x4 x4Var) {
        this.f18887b = x4Var;
    }

    private z0 e(r4 r4Var) {
        if (r4.Event.equals(r4Var)) {
            return z0.Error;
        }
        if (r4.Session.equals(r4Var)) {
            return z0.Session;
        }
        if (r4.Transaction.equals(r4Var)) {
            return z0.Transaction;
        }
        if (r4.UserFeedback.equals(r4Var)) {
            return z0.UserReport;
        }
        if (r4.Profile.equals(r4Var)) {
            return z0.Profile;
        }
        if (r4.Attachment.equals(r4Var)) {
            return z0.Attachment;
        }
        return z0.Default;
    }

    private void f(String str, String str2, Long l) {
        this.a.b(new c(str, str2), l);
    }

    private void h(b bVar) {
        if (bVar == null) {
            return;
        }
        for (f fVar : bVar.a()) {
            f(fVar.c(), fVar.a(), fVar.b());
        }
    }

    @Override // io.sentry.clientreport.g
    public void a(e eVar, z0 z0Var) {
        try {
            f(eVar.getReason(), z0Var.getCategory(), 1L);
        } catch (Throwable th) {
            this.f18887b.getLogger().a(s4.ERROR, th, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.g
    public void b(e eVar, h4 h4Var) {
        if (h4Var == null) {
            return;
        }
        try {
            Iterator<j4> it = h4Var.c().iterator();
            while (it.hasNext()) {
                d(eVar, it.next());
            }
        } catch (Throwable th) {
            this.f18887b.getLogger().a(s4.ERROR, th, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.g
    public h4 c(h4 h4Var) {
        b g2 = g();
        if (g2 == null) {
            return h4Var;
        }
        try {
            this.f18887b.getLogger().c(s4.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList = new ArrayList();
            Iterator<j4> it = h4Var.c().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            arrayList.add(j4.c(this.f18887b.getSerializer(), g2));
            return new h4(h4Var.b(), arrayList);
        } catch (Throwable th) {
            this.f18887b.getLogger().a(s4.ERROR, th, "Unable to attach client report to envelope.", new Object[0]);
            return h4Var;
        }
    }

    @Override // io.sentry.clientreport.g
    public void d(e eVar, j4 j4Var) {
        if (j4Var == null) {
            return;
        }
        try {
            r4 b2 = j4Var.i().b();
            if (r4.ClientReport.equals(b2)) {
                try {
                    h(j4Var.g(this.f18887b.getSerializer()));
                } catch (Exception unused) {
                    this.f18887b.getLogger().c(s4.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                }
            } else {
                f(eVar.getReason(), e(b2).getCategory(), 1L);
            }
        } catch (Throwable th) {
            this.f18887b.getLogger().a(s4.ERROR, th, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    b g() {
        Date c2 = a1.c();
        List<f> a = this.a.a();
        if (a.isEmpty()) {
            return null;
        }
        return new b(c2, a);
    }
}
