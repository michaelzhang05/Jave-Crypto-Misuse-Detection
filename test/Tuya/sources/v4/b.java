package V4;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import r0.InterfaceC3674e;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f11932a = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Task task) {
        AbstractC3159y.i(task, "task");
        if (!task.n()) {
            Log.w("utd_debug", "Fetching FCM registration token failed", task.i());
            return;
        }
        Log.d("utd_debug", "Firebase Token: " + ((String) task.j()));
    }

    public final void b() {
        FirebaseMessaging.l().o().c(new InterfaceC3674e() { // from class: V4.a
            @Override // r0.InterfaceC3674e
            public final void a(Task task) {
                b.c(task);
            }
        });
    }
}
