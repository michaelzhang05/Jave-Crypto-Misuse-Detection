package l1;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.InterfaceC3390x0;
import l6.M;
import l6.N;
import m1.C3401a;
import m1.InterfaceC3402b;

/* renamed from: l1.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3295D {

    /* renamed from: f, reason: collision with root package name */
    public static final b f34251f = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final S5.g f34252a;

    /* renamed from: b, reason: collision with root package name */
    private Messenger f34253b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f34254c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingDeque f34255d;

    /* renamed from: e, reason: collision with root package name */
    private final d f34256e;

    /* renamed from: l1.D$a */
    /* loaded from: classes4.dex */
    public static final class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final S5.g f34257a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l1.D$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0783a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f34258a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f34259b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0783a(String str, S5.d dVar) {
                super(2, dVar);
                this.f34259b = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0783a(this.f34259b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f34258a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        O5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    O5.t.b(obj);
                    C3401a c3401a = C3401a.f34695a;
                    this.f34258a = 1;
                    obj = c3401a.c(this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                Collection<InterfaceC3402b> values = ((Map) obj).values();
                String str = this.f34259b;
                for (InterfaceC3402b interfaceC3402b : values) {
                    interfaceC3402b.c(new InterfaceC3402b.C0794b(str));
                    Log.d("SessionLifecycleClient", "Notified " + interfaceC3402b.b() + " of new session " + str);
                }
                return O5.I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0783a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(S5.g backgroundDispatcher) {
            super(Looper.getMainLooper());
            AbstractC3255y.i(backgroundDispatcher, "backgroundDispatcher");
            this.f34257a = backgroundDispatcher;
        }

        private final void a(String str) {
            Log.d("SessionLifecycleClient", "Session update received: " + str);
            AbstractC3364k.d(N.a(this.f34257a), null, null, new C0783a(str, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            String str;
            AbstractC3255y.i(msg, "msg");
            if (msg.what == 3) {
                Bundle data = msg.getData();
                if (data == null || (str = data.getString("SessionUpdateExtra")) == null) {
                    str = "";
                }
                a(str);
                return;
            }
            Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + msg);
            super.handleMessage(msg);
        }
    }

    /* renamed from: l1.D$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l1.D$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f34260a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f34262c;

        /* renamed from: l1.D$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return R5.a.a(Long.valueOf(((Message) obj).getWhen()), Long.valueOf(((Message) obj2).getWhen()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, S5.d dVar) {
            super(2, dVar);
            this.f34262c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f34262c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f34260a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                C3401a c3401a = C3401a.f34695a;
                this.f34260a = 1;
                obj = c3401a.c(this);
                if (obj == e8) {
                    return e8;
                }
            }
            Map map = (Map) obj;
            if (map.isEmpty()) {
                Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
            } else {
                Collection values = map.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((InterfaceC3402b) it.next()).a()) {
                            List P02 = AbstractC1378t.P0(AbstractC1378t.j0(AbstractC1378t.s(C3295D.this.l(this.f34262c, 2), C3295D.this.l(this.f34262c, 1))), new a());
                            C3295D c3295d = C3295D.this;
                            Iterator it2 = P02.iterator();
                            while (it2.hasNext()) {
                                c3295d.p((Message) it2.next());
                            }
                        }
                    }
                }
                Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* renamed from: l1.D$d */
    /* loaded from: classes4.dex */
    public static final class d implements ServiceConnection {
        d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("SessionLifecycleClient", "Connected to SessionLifecycleService. Queue size " + C3295D.this.f34255d.size());
            C3295D.this.f34253b = new Messenger(iBinder);
            C3295D.this.f34254c = true;
            C3295D c3295d = C3295D.this;
            c3295d.o(c3295d.j());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
            C3295D.this.f34253b = null;
            C3295D.this.f34254c = false;
        }
    }

    public C3295D(S5.g backgroundDispatcher) {
        AbstractC3255y.i(backgroundDispatcher, "backgroundDispatcher");
        this.f34252a = backgroundDispatcher;
        this.f34255d = new LinkedBlockingDeque(20);
        this.f34256e = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List j() {
        ArrayList arrayList = new ArrayList();
        this.f34255d.drainTo(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Message l(List list, int i8) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i8) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        }
        return (Message) obj;
    }

    private final void m(Message message) {
        if (this.f34255d.offer(message)) {
            Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + this.f34255d.size());
            return;
        }
        Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
    }

    private final void n(int i8) {
        List j8 = j();
        Message obtain = Message.obtain(null, i8, 0, 0);
        AbstractC3255y.h(obtain, "obtain(null, messageCode, 0, 0)");
        j8.add(obtain);
        o(j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3390x0 o(List list) {
        InterfaceC3390x0 d8;
        d8 = AbstractC3364k.d(N.a(this.f34252a), null, null, new c(list, null), 3, null);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Message message) {
        if (this.f34253b != null) {
            try {
                Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                Messenger messenger = this.f34253b;
                if (messenger != null) {
                    messenger.send(message);
                    return;
                }
                return;
            } catch (RemoteException e8) {
                Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e8);
                m(message);
                return;
            }
        }
        m(message);
    }

    public final void h() {
        n(2);
    }

    public final void i(InterfaceC3297F sessionLifecycleServiceBinder) {
        AbstractC3255y.i(sessionLifecycleServiceBinder, "sessionLifecycleServiceBinder");
        sessionLifecycleServiceBinder.a(new Messenger(new a(this.f34252a)), this.f34256e);
    }

    public final void k() {
        n(1);
    }
}
