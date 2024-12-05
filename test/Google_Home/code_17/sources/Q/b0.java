package Q;

import N.C1331b;
import Q.AbstractC1387c;
import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import f0.HandlerC2813e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class b0 extends HandlerC2813e {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC1387c f8943b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(AbstractC1387c abstractC1387c, Looper looper) {
        super(looper);
        this.f8943b = abstractC1387c;
    }

    private static final void a(Message message) {
        c0 c0Var = (c0) message.obj;
        c0Var.b();
        c0Var.e();
    }

    private static final boolean b(Message message) {
        int i8 = message.what;
        if (i8 == 2 || i8 == 1 || i8 == 7) {
            return true;
        }
        return false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC1387c.a aVar;
        AbstractC1387c.a aVar2;
        C1331b c1331b;
        C1331b c1331b2;
        C1331b c1331b3;
        C1331b c1331b4;
        boolean z8;
        if (this.f8943b.f8948C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i8 = message.what;
        if ((i8 != 1 && i8 != 7 && ((i8 != 4 || this.f8943b.t()) && message.what != 5)) || this.f8943b.f()) {
            int i9 = message.what;
            PendingIntent pendingIntent = null;
            if (i9 == 4) {
                this.f8943b.f8974z = new C1331b(message.arg2);
                if (AbstractC1387c.h0(this.f8943b)) {
                    AbstractC1387c abstractC1387c = this.f8943b;
                    z8 = abstractC1387c.f8946A;
                    if (!z8) {
                        abstractC1387c.i0(3, null);
                        return;
                    }
                }
                AbstractC1387c abstractC1387c2 = this.f8943b;
                c1331b3 = abstractC1387c2.f8974z;
                if (c1331b3 != null) {
                    c1331b4 = abstractC1387c2.f8974z;
                } else {
                    c1331b4 = new C1331b(8);
                }
                this.f8943b.f8964p.b(c1331b4);
                this.f8943b.L(c1331b4);
                return;
            }
            if (i9 == 5) {
                AbstractC1387c abstractC1387c3 = this.f8943b;
                c1331b = abstractC1387c3.f8974z;
                if (c1331b != null) {
                    c1331b2 = abstractC1387c3.f8974z;
                } else {
                    c1331b2 = new C1331b(8);
                }
                this.f8943b.f8964p.b(c1331b2);
                this.f8943b.L(c1331b2);
                return;
            }
            if (i9 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                C1331b c1331b5 = new C1331b(message.arg2, pendingIntent);
                this.f8943b.f8964p.b(c1331b5);
                this.f8943b.L(c1331b5);
                return;
            }
            if (i9 == 6) {
                this.f8943b.i0(5, null);
                AbstractC1387c abstractC1387c4 = this.f8943b;
                aVar = abstractC1387c4.f8969u;
                if (aVar != null) {
                    aVar2 = abstractC1387c4.f8969u;
                    aVar2.h(message.arg2);
                }
                this.f8943b.M(message.arg2);
                AbstractC1387c.g0(this.f8943b, 5, 1, null);
                return;
            }
            if (i9 == 2 && !this.f8943b.h()) {
                a(message);
                return;
            }
            if (b(message)) {
                ((c0) message.obj).c();
                return;
            }
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        a(message);
    }
}
