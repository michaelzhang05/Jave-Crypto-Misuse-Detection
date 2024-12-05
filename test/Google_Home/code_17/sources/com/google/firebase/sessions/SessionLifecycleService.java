package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.google.firebase.sessions.c;
import java.util.ArrayList;
import k6.C3225a;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import n1.C3461f;

/* loaded from: classes4.dex */
public final class SessionLifecycleService extends Service {

    /* renamed from: d, reason: collision with root package name */
    public static final a f18552d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final HandlerThread f18553a = new HandlerThread("FirebaseSessions_HandlerThread");

    /* renamed from: b, reason: collision with root package name */
    private b f18554b;

    /* renamed from: c, reason: collision with root package name */
    private Messenger f18555c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private boolean f18556a;

        /* renamed from: b, reason: collision with root package name */
        private long f18557b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f18558c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Looper looper) {
            super(looper);
            AbstractC3255y.i(looper, "looper");
            this.f18558c = new ArrayList();
        }

        private final void a() {
            StringBuilder sb = new StringBuilder();
            sb.append("Broadcasting new session: ");
            c.b bVar = c.f18563f;
            sb.append(bVar.a().c());
            Log.d("SessionLifecycleService", sb.toString());
            com.google.firebase.sessions.b.f18561a.a().a(bVar.a().c());
            for (Messenger it : new ArrayList(this.f18558c)) {
                AbstractC3255y.h(it, "it");
                f(it);
            }
        }

        private final void b(Message message) {
            Log.d("SessionLifecycleService", "Activity backgrounding at " + message.getWhen());
            this.f18557b = message.getWhen();
        }

        private final void c(Message message) {
            this.f18558c.add(message.replyTo);
            Messenger messenger = message.replyTo;
            AbstractC3255y.h(messenger, "msg.replyTo");
            f(messenger);
            Log.d("SessionLifecycleService", "Client " + message.replyTo + " bound at " + message.getWhen() + ". Clients: " + this.f18558c.size());
        }

        private final void d(Message message) {
            Log.d("SessionLifecycleService", "Activity foregrounding at " + message.getWhen() + '.');
            if (!this.f18556a) {
                Log.d("SessionLifecycleService", "Cold start detected.");
                this.f18556a = true;
                g();
            } else if (e(message.getWhen())) {
                Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                g();
            }
            this.f18557b = message.getWhen();
        }

        private final boolean e(long j8) {
            if (j8 - this.f18557b > C3225a.o(C3461f.f35323c.c().c())) {
                return true;
            }
            return false;
        }

        private final void f(Messenger messenger) {
            if (this.f18556a) {
                h(messenger, c.f18563f.a().c().b());
                return;
            }
            String a8 = com.google.firebase.sessions.a.f18559a.a().a();
            Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + a8);
            if (a8 != null) {
                h(messenger, a8);
            }
        }

        private final void g() {
            c.b bVar = c.f18563f;
            bVar.a().a();
            Log.d("SessionLifecycleService", "Generated new session " + bVar.a().c().b());
            a();
            com.google.firebase.sessions.a.f18559a.a().b(bVar.a().c().b());
        }

        private final void h(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", str);
                Message obtain = Message.obtain(null, 3, 0, 0);
                obtain.setData(bundle);
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
                Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
                this.f18558c.remove(messenger);
            } catch (Exception e8) {
                Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e8);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            AbstractC3255y.i(msg, "msg");
            if (this.f18557b > msg.getWhen()) {
                Log.d("SessionLifecycleService", "Ignoring old message from " + msg.getWhen() + " which is older than " + this.f18557b + '.');
                return;
            }
            int i8 = msg.what;
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 4) {
                        Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + msg);
                        super.handleMessage(msg);
                        return;
                    }
                    c(msg);
                    return;
                }
                b(msg);
                return;
            }
            d(msg);
        }
    }

    private final Messenger a(Intent intent) {
        Object parcelableExtra;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class);
            return (Messenger) parcelableExtra;
        }
        return (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        Messenger a8 = a(intent);
        if (a8 != null) {
            Message obtain = Message.obtain(null, 4, 0, 0);
            obtain.replyTo = a8;
            b bVar = this.f18554b;
            if (bVar != null) {
                bVar.sendMessage(obtain);
            }
        }
        Messenger messenger = this.f18555c;
        if (messenger == null) {
            return null;
        }
        return messenger.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f18553a.start();
        Looper looper = this.f18553a.getLooper();
        AbstractC3255y.h(looper, "handlerThread.looper");
        this.f18554b = new b(looper);
        this.f18555c = new Messenger(this.f18554b);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f18553a.quit();
    }
}
