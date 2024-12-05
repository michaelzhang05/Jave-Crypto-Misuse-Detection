package v1;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import v1.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q0 extends f2.e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f9639a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(c cVar, Looper looper) {
        super(looper);
        this.f9639a = cVar;
    }

    private static final void a(Message message) {
        r0 r0Var = (r0) message.obj;
        r0Var.b();
        r0Var.e();
    }

    private static final boolean b(Message message) {
        int i6 = message.what;
        return i6 == 2 || i6 == 1 || i6 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        c.a aVar;
        c.a aVar2;
        s1.a aVar3;
        s1.a aVar4;
        boolean z5;
        if (this.f9639a.C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i6 = message.what;
        if ((i6 == 1 || i6 == 7 || ((i6 == 4 && !this.f9639a.s()) || message.what == 5)) && !this.f9639a.a()) {
            a(message);
            return;
        }
        int i7 = message.what;
        if (i7 == 4) {
            this.f9639a.f9532z = new s1.a(message.arg2);
            if (c.f0(this.f9639a)) {
                c cVar = this.f9639a;
                z5 = cVar.A;
                if (!z5) {
                    cVar.g0(3, null);
                    return;
                }
            }
            c cVar2 = this.f9639a;
            aVar4 = cVar2.f9532z;
            s1.a aVar5 = aVar4 != null ? cVar2.f9532z : new s1.a(8);
            this.f9639a.f9522p.b(aVar5);
            this.f9639a.K(aVar5);
            return;
        }
        if (i7 == 5) {
            c cVar3 = this.f9639a;
            aVar3 = cVar3.f9532z;
            s1.a aVar6 = aVar3 != null ? cVar3.f9532z : new s1.a(8);
            this.f9639a.f9522p.b(aVar6);
            this.f9639a.K(aVar6);
            return;
        }
        if (i7 == 3) {
            Object obj = message.obj;
            s1.a aVar7 = new s1.a(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f9639a.f9522p.b(aVar7);
            this.f9639a.K(aVar7);
            return;
        }
        if (i7 == 6) {
            this.f9639a.g0(5, null);
            c cVar4 = this.f9639a;
            aVar = cVar4.f9527u;
            if (aVar != null) {
                aVar2 = cVar4.f9527u;
                aVar2.b(message.arg2);
            }
            this.f9639a.L(message.arg2);
            c.e0(this.f9639a, 5, 1, null);
            return;
        }
        if (i7 == 2 && !this.f9639a.c()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((r0) message.obj).c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
