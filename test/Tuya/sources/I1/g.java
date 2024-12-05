package i1;

import android.util.Log;
import g6.C2728d;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import s.AbstractC3701c;
import s.C3700b;
import s.InterfaceC3703e;

/* loaded from: classes3.dex */
public final class g implements h {

    /* renamed from: b, reason: collision with root package name */
    public static final a f31477b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Z0.b f31478a;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public g(Z0.b transportFactoryProvider) {
        AbstractC3159y.i(transportFactoryProvider, "transportFactoryProvider");
        this.f31478a = transportFactoryProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] c(p pVar) {
        String b8 = q.f31523a.b().b(pVar);
        AbstractC3159y.h(b8, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: " + b8);
        byte[] bytes = b8.getBytes(C2728d.f31293b);
        AbstractC3159y.h(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // i1.h
    public void a(p sessionEvent) {
        AbstractC3159y.i(sessionEvent, "sessionEvent");
        ((s.g) this.f31478a.get()).a("FIREBASE_APPQUALITY_SESSION", p.class, C3700b.b("json"), new InterfaceC3703e() { // from class: i1.f
            @Override // s.InterfaceC3703e
            public final Object apply(Object obj) {
                byte[] c8;
                c8 = g.this.c((p) obj);
                return c8;
            }
        }).b(AbstractC3701c.d(sessionEvent));
    }
}
