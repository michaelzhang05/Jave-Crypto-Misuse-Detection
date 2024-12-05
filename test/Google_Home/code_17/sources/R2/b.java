package R2;

import e3.o;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final o f9623a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9624b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9625c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9626d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f9627e;

    /* renamed from: f, reason: collision with root package name */
    private final a f9628f;

    public b(o consumerSession) {
        boolean z8;
        a aVar;
        AbstractC3255y.i(consumerSession, "consumerSession");
        this.f9623a = consumerSession;
        this.f9624b = consumerSession.g();
        this.f9625c = consumerSession.d();
        this.f9626d = consumerSession.b();
        if (!b(consumerSession) && !f(consumerSession)) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.f9627e = z8;
        if (z8) {
            aVar = a.f9616a;
        } else if (a(consumerSession)) {
            aVar = a.f9618c;
        } else {
            aVar = a.f9617b;
        }
        this.f9628f = aVar;
    }

    private final boolean a(o oVar) {
        Object obj;
        Iterator it = oVar.h().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                o.d dVar = (o.d) obj;
                if (dVar.g() == o.d.e.f31531f && dVar.b() == o.d.EnumC0726d.f31519d) {
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
        Iterator it = oVar.h().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                o.d dVar = (o.d) obj;
                if (dVar.g() == o.d.e.f31531f && dVar.b() == o.d.EnumC0726d.f31521f) {
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
        Iterator it = oVar.h().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                o.d dVar = (o.d) obj;
                if (dVar.g() == o.d.e.f31529d && dVar.b() == o.d.EnumC0726d.f31519d) {
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
        return this.f9628f;
    }

    public final String d() {
        return this.f9625c;
    }

    public final String e() {
        return this.f9626d;
    }
}
