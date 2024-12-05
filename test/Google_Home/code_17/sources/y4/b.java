package Y4;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import q0.InterfaceC3821e;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13570a = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Task task) {
        AbstractC3255y.i(task, "task");
        if (!task.n()) {
            Log.w("utd_debug", "Fetching FCM registration token failed", task.i());
            return;
        }
        Log.d("utd_debug", "Firebase Token: " + ((String) task.j()));
    }

    public final void b() {
        FirebaseMessaging.n().q().c(new InterfaceC3821e() { // from class: Y4.a
            @Override // q0.InterfaceC3821e
            public final void a(Task task) {
                b.c(task);
            }
        });
    }
}
