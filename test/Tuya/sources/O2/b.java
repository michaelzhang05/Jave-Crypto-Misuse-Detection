package O2;

import b3.o;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final o f7767a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7768b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7769c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7770d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f7771e;

    /* renamed from: f, reason: collision with root package name */
    private final a f7772f;

    public b(o consumerSession) {
        boolean z8;
        a aVar;
        AbstractC3159y.i(consumerSession, "consumerSession");
        this.f7767a = consumerSession;
        this.f7768b = consumerSession.e();
        this.f7769c = consumerSession.d();
        this.f7770d = consumerSession.c();
        if (!b(consumerSession) && !f(consumerSession)) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.f7771e = z8;
        if (z8) {
            aVar = a.f7760a;
        } else if (a(consumerSession)) {
            aVar = a.f7762c;
        } else {
            aVar = a.f7761b;
        }
        this.f7772f = aVar;
    }

    private final boolean a(o oVar) {
        Object obj;
        Iterator it = oVar.f().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                o.d dVar = (o.d) obj;
                if (dVar.e() == o.d.e.f14525f && dVar.c() == o.d.EnumC0358d.f14513d) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    private final boolean b(o oVar) {
        Object obj;
        Iterator it = oVar.f().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                o.d dVar = (o.d) obj;
                if (dVar.e() == o.d.e.f14525f && dVar.c() == o.d.EnumC0358d.f14515f) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    private final boolean f(o oVar) {
        Object obj;
        Iterator it = oVar.f().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                o.d dVar = (o.d) obj;
                if (dVar.e() == o.d.e.f14523d && dVar.c() == o.d.EnumC0358d.f14513d) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    public final a c() {
        return this.f7772f;
    }

    public final String d() {
        return this.f7769c;
    }

    public final String e() {
        return this.f7770d;
    }
}
