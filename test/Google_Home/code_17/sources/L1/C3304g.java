package l1;

import android.util.Log;
import b1.InterfaceC1956b;
import j6.C3205d;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import s.AbstractC3983d;
import s.C3982c;

/* renamed from: l1.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3304g implements InterfaceC3305h {

    /* renamed from: b, reason: collision with root package name */
    public static final a f34330b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1956b f34331a;

    /* renamed from: l1.g$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C3304g(InterfaceC1956b transportFactoryProvider) {
        AbstractC3255y.i(transportFactoryProvider, "transportFactoryProvider");
        this.f34331a = transportFactoryProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] c(z zVar) {
        String b8 = C3292A.f34222a.c().b(zVar);
        AbstractC3255y.h(b8, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: " + b8);
        byte[] bytes = b8.getBytes(C3205d.f34020b);
        AbstractC3255y.h(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // l1.InterfaceC3305h
    public void a(z sessionEvent) {
        AbstractC3255y.i(sessionEvent, "sessionEvent");
        ((s.j) this.f34331a.get()).a("FIREBASE_APPQUALITY_SESSION", z.class, C3982c.b("json"), new s.h() { // from class: l1.f
            @Override // s.h
            public final Object apply(Object obj) {
                byte[] c8;
                c8 = C3304g.this.c((z) obj);
                return c8;
            }
        }).b(AbstractC3983d.f(sessionEvent));
    }
}
